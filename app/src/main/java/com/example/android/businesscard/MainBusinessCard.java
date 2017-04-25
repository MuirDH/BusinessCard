package com.example.android.businesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.os.Build;

public class MainBusinessCard extends AppCompatActivity {

    TextView HyperLink;
    Spanned Text;
    String URL = "https://www.facebook.com/trailblazerbootcamps/";
    String Website = "Visit us: Trailblazer Bootcamps";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_business_card);

        HyperLink = (TextView)findViewById(R.id.textView1);

        Text = CreateLink(URL, Website);

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);
    }

    private Spanned CreateLink (String URL, String Website){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml("<a href='" + URL + "'>" + Website + "</a>", Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml("<a href='" + URL + "'>" + Website + "</a>");
        }
    }
}

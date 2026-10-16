package com.google.android.projection.gearhead.companion.feedback;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.acyt;
import defpackage.lbe;
import defpackage.lbk;
import defpackage.wwt;
import defpackage.ype;
import defpackage.yph;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FeedbackEditorActivity extends Activity {
    public static final yph a = yph.c("GH.FeedbackEditor");
    public lbk b;
    public boolean c;
    public View d;
    public CheckBox e;
    private final View.OnClickListener f = new wwt(this, 11, null);
    private final View.OnClickListener g = new wwt(this, 12, null);
    private final View.OnClickListener h = new wwt(this, 13, null);
    private final TextWatcher i = new lbe(this, 5);

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.feedback_editor_activity);
        TextView textView = (TextView) findViewById(R.id.report_time);
        ImageView imageView = (ImageView) findViewById(R.id.screenshot);
        findViewById(R.id.delete).setOnClickListener(this.h);
        View viewFindViewById = findViewById(R.id.submit);
        this.d = viewFindViewById;
        viewFindViewById.setOnClickListener(this.g);
        EditText editText = (EditText) findViewById(R.id.description);
        editText.addTextChangedListener(this.i);
        try {
            lbk lbkVarB = lbk.b(new File(getIntent().getData().getPath()));
            this.b = lbkVarB;
            if (acyt.c() && lbkVarB != null && lbkVarB.n != null) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.feedback_container);
                TextView textView2 = new TextView(this);
                textView2.setText(getApplicationContext().getString(R.string.feedback_sherlog_info_text, getApplicationContext().getResources().getQuantityString(R.plurals.sherlog_link_count, 10, 10), getApplicationContext().getResources().getQuantityString(R.plurals.sherlog_minutes, 10, 10)));
                textView2.setTextSize(20.0f);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                CheckBox checkBox = new CheckBox(getApplicationContext());
                this.e = checkBox;
                checkBox.setText(R.string.feedback_sherlog_consent_text);
                this.e.setChecked(true);
                this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(textView2, linearLayout.indexOfChild(findViewById(R.id.description)) + 1);
                linearLayout.addView(this.e, linearLayout.indexOfChild(textView2) + 1);
            }
            textView.setText(DateFormat.getTimeFormat(this).format(this.b.d));
            Uri uri = this.b.h;
            if (uri != null) {
                imageView.setImageURI(uri);
                findViewById(R.id.share_screenshot).setOnClickListener(this.f);
            } else {
                findViewById(R.id.screenshot_elements).setVisibility(8);
            }
            String str = this.b.f;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(this.b.f.length());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Expected to receive an intent with a FeedbackBundle", e);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        if (!this.c) {
            try {
                this.b.h(this);
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 9974)).u("Could not serialize");
            }
        }
        super.onDestroy();
    }
}

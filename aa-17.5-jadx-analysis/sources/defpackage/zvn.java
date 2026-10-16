package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class zvn extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public zvn(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_invitation, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.survey_prompt_take_survey_button);
        this.b = button;
        Button button2 = (Button) findViewById(R.id.survey_prompt_no_thanks_button);
        this.a = button2;
        a(button);
        a(button2);
    }

    private final void a(Button button) {
        whu.e(findViewById(R.id.survey_prompt_buttons), button, 0, R.dimen.survey_button_accessibility_padding);
    }

    public zvn(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = textView;
        this.b = textView2;
    }
}

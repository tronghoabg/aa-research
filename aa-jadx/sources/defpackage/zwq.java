package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zwq extends android.widget.LinearLayout {
    public final android.widget.TextView a;
    public final android.widget.TextView b;

    public zwq(android.content.Context context) {
        super(context);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.survey_invitation, (android.view.ViewGroup) this, true);
        android.widget.Button button = (android.widget.Button) findViewById(com.google.android.projection.gearhead.R.id.survey_prompt_take_survey_button);
        this.b = button;
        android.widget.Button button2 = (android.widget.Button) findViewById(com.google.android.projection.gearhead.R.id.survey_prompt_no_thanks_button);
        this.a = button2;
        a(button);
        a(button2);
    }

    private final void a(android.widget.Button button) {
        defpackage.wit.e(findViewById(com.google.android.projection.gearhead.R.id.survey_prompt_buttons), button, 0, com.google.android.projection.gearhead.R.dimen.survey_button_accessibility_padding);
    }

    public zwq(android.content.Context context, android.widget.TextView textView, android.widget.TextView textView2) {
        super(context);
        this.a = textView;
        this.b = textView2;
    }
}

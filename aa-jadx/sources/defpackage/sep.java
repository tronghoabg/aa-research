package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class sep extends defpackage.sfe {
    private android.widget.Button a;

    private final void d() {
        boolean zInKeyguardRestrictedInputMode = ((android.app.KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        android.widget.Button button = this.a;
        if (zInKeyguardRestrictedInputMode) {
            button.setText(com.google.android.projection.gearhead.R.string.car_setup_unlock_to_proceed_sentence_case);
        } else {
            button.setText(com.google.android.projection.gearhead.R.string.common_next);
        }
    }

    public final void a() {
        b().f("EVENT_INTRO_CANCEL_TIMER", null);
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        defpackage.bc bcVar = (defpackage.bc) getContext();
        android.view.View viewInflate = layoutInflater.inflate(com.google.android.projection.gearhead.R.layout.car_frx_cakewalk_intro, viewGroup, false);
        defpackage.qsp.H(layoutInflater, (android.view.ViewGroup) viewInflate);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.illustration);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.title);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.body);
        android.widget.Button button = (android.widget.Button) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.left_button);
        this.a = (android.widget.Button) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.right_button);
        textView.setText(com.google.android.projection.gearhead.R.string.car_setup_intro_title);
        ((android.widget.ImageView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.icon)).setImageDrawable(bcVar.getDrawable(com.google.android.projection.gearhead.R.drawable.ic_android_auto_gms));
        imageView.setImageDrawable(bcVar.getDrawable(com.google.android.projection.gearhead.R.drawable.car_bottom_sheet_apps_illustration));
        textView2.setText(com.google.android.projection.gearhead.R.string.car_setup_intro_body_cakewalk);
        button.setText(com.google.android.projection.gearhead.R.string.common_exit);
        button.setVisibility(0);
        byte[] bArr = null;
        button.setOnClickListener(new defpackage.sea(this, 8, bArr));
        this.a.setVisibility(0);
        d();
        this.a.setOnClickListener(new defpackage.sea(this, 9, bArr));
        textView2.setMovementMethod(new defpackage.seo(this));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        d();
        super.onResume();
    }
}

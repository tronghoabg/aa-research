package com.google.android.apps.auto.components.ui.speedbump;

/* JADX INFO: loaded from: classes2.dex */
public class SpeedbumpView extends android.widget.FrameLayout {
    public android.view.View a;
    public android.view.View b;
    android.widget.ProgressBar c;
    public android.animation.ObjectAnimator d;
    public boolean e;
    public android.view.ViewGroup f;
    public int g;

    public SpeedbumpView(android.content.Context context) {
        this(context, null);
    }

    public static boolean b() {
        return defpackage.nrr.a().d() || defpackage.nrr.a().f();
    }

    public final void a() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(defpackage.ebo.p(getContext()));
        defpackage.lem.a();
        android.view.View viewInflate = layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.speedbump, (android.view.ViewGroup) this, false);
        this.a = viewInflate;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.progress_bar);
        this.c = progressBar;
        android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        this.d = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(5833L);
        this.d.setInterpolator(new android.view.animation.LinearInterpolator());
        this.b = this.a.findViewById(com.google.android.projection.gearhead.R.id.speedbump_container);
        this.a.setVisibility(8);
        this.a.setOnClickListener(new defpackage.nto(3));
        addView(this.a);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (defpackage.lem.a().b()) {
            this.e = true;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        defpackage.lem.a();
        defpackage.ksi.d().e.eM(defpackage.ler.c(), new defpackage.nuk(this, 9));
        a();
        setElevation(2.1311684E9f);
    }

    public SpeedbumpView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeedbumpView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SpeedbumpView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

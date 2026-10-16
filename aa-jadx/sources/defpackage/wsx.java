package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wsx extends defpackage.wti {
    public final android.animation.TimeInterpolator c;
    public final defpackage.wsm d;
    public int e;
    public float f;
    public float g;
    defpackage.fhn h;
    private android.animation.ObjectAnimator n;
    private android.animation.ObjectAnimator o;
    private static final android.animation.TimeInterpolator i = defpackage.wlm.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final android.util.Property l = new defpackage.wsv(java.lang.Float.class);
    private static final android.util.Property m = new defpackage.wsw(java.lang.Float.class);

    public wsx(android.content.Context context, defpackage.wsy wsyVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = wsyVar;
        this.c = defpackage.wqn.c(context, com.google.android.projection.gearhead.R.attr.motionEasingStandardInterpolator, i);
    }

    private final void i() {
        if (this.n == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wsx, java.lang.Float>) l, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new defpackage.wst(this));
        }
        if (this.o == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wsx, java.lang.Float>) m, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new defpackage.wsu(this));
        }
    }

    @Override // defpackage.wti
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wti
    public final void b() {
        i();
        defpackage.wsm wsmVar = this.d;
        android.animation.ObjectAnimator objectAnimator = this.n;
        float f = wsmVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.wti
    public final void c(defpackage.fhn fhnVar) {
        this.h = fhnVar;
    }

    @Override // defpackage.wti
    public final void d() {
        android.animation.ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void e() {
        this.e = 0;
        ((defpackage.wtf) this.k.get(0)).c = this.d.e[0];
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wti
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.wti
    public final void g() {
        this.h = null;
    }
}

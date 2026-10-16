package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wss extends defpackage.wti {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final android.util.Property l = new defpackage.wsq(java.lang.Float.class);
    private static final android.util.Property m = new defpackage.wsr(java.lang.Float.class);
    public final defpackage.epc d;
    public final defpackage.wsm e;
    public int f;
    public float g;
    public float h;
    defpackage.fhn i;
    private android.animation.ObjectAnimator n;
    private android.animation.ObjectAnimator o;

    public wss(defpackage.wsy wsyVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = wsyVar;
        this.d = new defpackage.epc();
    }

    private final void i() {
        if (this.n == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wss, java.lang.Float>) l, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new defpackage.wso(this));
        }
        if (this.o == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wss, java.lang.Float>) m, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new defpackage.wsp(this));
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
        defpackage.wsm wsmVar = this.e;
        android.animation.ObjectAnimator objectAnimator = this.n;
        float f = wsmVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.wti
    public final void c(defpackage.fhn fhnVar) {
        this.i = fhnVar;
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
        this.f = 0;
        ((defpackage.wtf) this.k.get(0)).c = this.e.e[0];
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wti
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.wti
    public final void g() {
        this.i = null;
    }
}

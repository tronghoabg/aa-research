package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtn extends defpackage.wti {
    public static final /* synthetic */ int f = 0;
    private static final android.util.Property g = new defpackage.wtm(java.lang.Float.class);
    public final defpackage.epc a;
    public final defpackage.wsm b;
    public int c;
    public boolean d;
    public float e;
    private android.animation.ObjectAnimator h;

    public wtn(defpackage.wts wtsVar) {
        super(3);
        this.c = 1;
        this.b = wtsVar;
        this.a = new defpackage.epc();
    }

    private final void i() {
        if (this.h == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wtn, java.lang.Float>) g, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new defpackage.wtl(this));
        }
    }

    @Override // defpackage.wti
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wti
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (defpackage.wtf wtfVar : this.k) {
            defpackage.wsm wsmVar = this.b;
            wtfVar.c = wsmVar.e[0];
            wtfVar.d = wsmVar.i / 2;
        }
    }

    @Override // defpackage.wti
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.wti
    public final void d() {
    }

    @Override // defpackage.wti
    public final void g() {
    }

    @Override // defpackage.wti
    public final void c(defpackage.fhn fhnVar) {
    }
}

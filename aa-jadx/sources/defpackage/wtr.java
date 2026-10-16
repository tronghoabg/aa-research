package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtr extends defpackage.wti {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final android.util.Property i = new defpackage.wtq(java.lang.Float.class);
    public final android.view.animation.Interpolator[] c;
    public final defpackage.wsm d;
    public int e;
    public boolean f;
    public float g;
    defpackage.fhn h;
    private android.animation.ObjectAnimator l;
    private android.animation.ObjectAnimator m;

    public wtr(android.content.Context context, defpackage.wts wtsVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = wtsVar;
        this.c = new android.view.animation.Interpolator[]{defpackage.daw.k(context, com.google.android.projection.gearhead.R.anim.linear_indeterminate_line1_head_interpolator), defpackage.daw.k(context, com.google.android.projection.gearhead.R.anim.linear_indeterminate_line1_tail_interpolator), defpackage.daw.k(context, com.google.android.projection.gearhead.R.anim.linear_indeterminate_line2_head_interpolator), defpackage.daw.k(context, com.google.android.projection.gearhead.R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    private final void i() {
        if (this.l == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wtr, java.lang.Float>) i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new defpackage.wto(this));
        }
        if (this.m == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.wtr, java.lang.Float>) i, 1.0f);
            this.m = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new defpackage.wtp(this));
        }
    }

    @Override // defpackage.wti
    public final void a() {
        android.animation.ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wti
    public final void b() {
        i();
        defpackage.wsm wsmVar = this.d;
        android.animation.ObjectAnimator objectAnimator = this.l;
        long j = (long) (wsmVar.n * 1800.0f);
        objectAnimator.setDuration(j);
        this.m.setDuration(j);
        e();
    }

    @Override // defpackage.wti
    public final void c(defpackage.fhn fhnVar) {
        this.h = fhnVar;
    }

    @Override // defpackage.wti
    public final void d() {
        android.animation.ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    final void e() {
        this.e = 0;
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((defpackage.wtf) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.wti
    public final void f() {
        i();
        e();
        this.l.start();
    }

    @Override // defpackage.wti
    public final void g() {
        this.h = null;
    }
}

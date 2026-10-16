package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wrv extends wsl {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new wrt(Float.class);
    private static final Property m = new wru(Float.class);
    public final eow d;
    public final wrp e;
    public int f;
    public float g;
    public float h;
    fhh i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public wrv(wsb wsbVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = wsbVar;
        this.d = new eow();
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<wrv, Float>) l, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new wrr(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<wrv, Float>) m, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new wrs(this));
        }
    }

    @Override // defpackage.wsl
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wsl
    public final void b() {
        i();
        wrp wrpVar = this.e;
        ObjectAnimator objectAnimator = this.n;
        float f = wrpVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.wsl
    public final void c(fhh fhhVar) {
        this.i = fhhVar;
    }

    @Override // defpackage.wsl
    public final void d() {
        ObjectAnimator objectAnimator = this.o;
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
        ((wsi) this.k.get(0)).c = this.e.e[0];
        this.h = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wsl
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.wsl
    public final void g() {
        this.i = null;
    }
}

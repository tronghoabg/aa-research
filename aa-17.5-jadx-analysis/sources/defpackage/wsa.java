package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wsa extends wsl {
    public final TimeInterpolator c;
    public final wrp d;
    public int e;
    public float f;
    public float g;
    fhh h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = wkn.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new wry(Float.class);
    private static final Property m = new wrz(Float.class);

    public wsa(Context context, wsb wsbVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = wsbVar;
        this.c = woy.C(context, R.attr.motionEasingStandardInterpolator, i);
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<wsa, Float>) l, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new wrw(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<wsa, Float>) m, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new wrx(this));
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
        wrp wrpVar = this.d;
        ObjectAnimator objectAnimator = this.n;
        float f = wrpVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.wsl
    public final void c(fhh fhhVar) {
        this.h = fhhVar;
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
        this.e = 0;
        ((wsi) this.k.get(0)).c = this.d.e[0];
        this.g = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wsl
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.wsl
    public final void g() {
        this.h = null;
    }
}

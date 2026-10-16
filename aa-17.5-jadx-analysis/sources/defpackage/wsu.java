package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wsu extends wsl {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new wst(Float.class);
    public final Interpolator[] c;
    public final wrp d;
    public int e;
    public boolean f;
    public float g;
    fhh h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public wsu(Context context, wsv wsvVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = wsvVar;
        this.c = new Interpolator[]{fhv.f(context, R.anim.linear_indeterminate_line1_head_interpolator), fhv.f(context, R.anim.linear_indeterminate_line1_tail_interpolator), fhv.f(context, R.anim.linear_indeterminate_line2_head_interpolator), fhv.f(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    private final void i() {
        if (this.l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<wsu, Float>) i, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new wsr(this));
        }
        if (this.m == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<wsu, Float>) i, 1.0f);
            this.m = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new wss(this));
        }
    }

    @Override // defpackage.wsl
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wsl
    public final void b() {
        i();
        wrp wrpVar = this.d;
        ObjectAnimator objectAnimator = this.l;
        long j = (long) (wrpVar.n * 1800.0f);
        objectAnimator.setDuration(j);
        this.m.setDuration(j);
        e();
    }

    @Override // defpackage.wsl
    public final void c(fhh fhhVar) {
        this.h = fhhVar;
    }

    @Override // defpackage.wsl
    public final void d() {
        ObjectAnimator objectAnimator = this.m;
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
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((wsi) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.wsl
    public final void f() {
        i();
        e();
        this.l.start();
    }

    @Override // defpackage.wsl
    public final void g() {
        this.h = null;
    }
}

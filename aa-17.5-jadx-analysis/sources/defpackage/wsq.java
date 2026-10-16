package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wsq extends wsl {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new wsp(Float.class);
    public final eow a;
    public final wrp b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public wsq(wsv wsvVar) {
        super(3);
        this.c = 1;
        this.b = wsvVar;
        this.a = new eow();
    }

    private final void i() {
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<wsq, Float>) g, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new wso(this));
        }
    }

    @Override // defpackage.wsl
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.wsl
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (wsi wsiVar : this.k) {
            wrp wrpVar = this.b;
            wsiVar.c = wrpVar.e[0];
            wsiVar.d = wrpVar.i / 2;
        }
    }

    @Override // defpackage.wsl
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.wsl
    public final void d() {
    }

    @Override // defpackage.wsl
    public final void g() {
    }

    @Override // defpackage.wsl
    public final void c(fhh fhhVar) {
    }
}

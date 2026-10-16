package k1;

import android.view.WindowInsets;
import b1.C1494c;

/* loaded from: classes.dex */
public class i0 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f38838c;

    public i0() {
        this.f38838c = io.flutter.plugin.platform.o.h();
    }

    @Override // k1.l0
    public v0 b() {
        a();
        v0 v0VarG = v0.g(null, this.f38838c.build());
        v0VarG.f38877a.q(this.f38845b);
        return v0VarG;
    }

    @Override // k1.l0
    public void d(C1494c c1494c) {
        this.f38838c.setMandatorySystemGestureInsets(c1494c.d());
    }

    @Override // k1.l0
    public void e(C1494c c1494c) {
        this.f38838c.setStableInsets(c1494c.d());
    }

    @Override // k1.l0
    public void f(C1494c c1494c) {
        this.f38838c.setSystemGestureInsets(c1494c.d());
    }

    @Override // k1.l0
    public void g(C1494c c1494c) {
        this.f38838c.setSystemWindowInsets(c1494c.d());
    }

    @Override // k1.l0
    public void h(C1494c c1494c) {
        this.f38838c.setTappableElementInsets(c1494c.d());
    }

    public i0(v0 v0Var) {
        WindowInsets.Builder builderH;
        super(v0Var);
        WindowInsets windowInsetsF = v0Var.f();
        if (windowInsetsF != null) {
            builderH = io.flutter.plugin.platform.o.i(windowInsetsF);
        } else {
            builderH = io.flutter.plugin.platform.o.h();
        }
        this.f38838c = builderH;
    }
}

package k1;

import android.view.WindowInsets;
import b1.C1494c;

/* loaded from: classes.dex */
public class n0 extends m0 {

    /* renamed from: n, reason: collision with root package name */
    public C1494c f38859n;

    public n0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f38859n = null;
    }

    @Override // k1.s0
    public v0 b() {
        return v0.g(null, this.f38853c.consumeStableInsets());
    }

    @Override // k1.s0
    public v0 c() {
        return v0.g(null, this.f38853c.consumeSystemWindowInsets());
    }

    @Override // k1.s0
    public final C1494c i() {
        if (this.f38859n == null) {
            WindowInsets windowInsets = this.f38853c;
            this.f38859n = C1494c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f38859n;
    }

    @Override // k1.s0
    public boolean n() {
        return this.f38853c.isConsumed();
    }

    @Override // k1.s0
    public void s(C1494c c1494c) {
        this.f38859n = c1494c;
    }
}

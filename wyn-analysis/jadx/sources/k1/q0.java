package k1;

import android.view.View;
import android.view.WindowInsets;
import b1.C1494c;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: r, reason: collision with root package name */
    public static final v0 f38868r = v0.g(null, WindowInsets.CONSUMED);

    public q0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // k1.m0, k1.s0
    public C1494c f(int i5) {
        return C1494c.c(this.f38853c.getInsets(t0.a(i5)));
    }

    @Override // k1.m0, k1.s0
    public C1494c g(int i5) {
        return C1494c.c(this.f38853c.getInsetsIgnoringVisibility(t0.a(i5)));
    }

    @Override // k1.m0, k1.s0
    public boolean p(int i5) {
        return this.f38853c.isVisible(t0.a(i5));
    }

    @Override // k1.m0, k1.s0
    public final void d(View view) {
    }
}

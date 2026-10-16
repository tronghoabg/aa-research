package k1;

import android.view.WindowInsets;
import b1.C1494c;

/* loaded from: classes.dex */
public final class r0 extends q0 {

    /* renamed from: s, reason: collision with root package name */
    public static final v0 f38869s = v0.g(null, WindowInsets.CONSUMED);

    public r0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // k1.q0, k1.m0, k1.s0
    public C1494c f(int i5) {
        return C1494c.c(this.f38853c.getInsets(u0.a(i5)));
    }

    @Override // k1.q0, k1.m0, k1.s0
    public C1494c g(int i5) {
        return C1494c.c(this.f38853c.getInsetsIgnoringVisibility(u0.a(i5)));
    }

    @Override // k1.q0, k1.m0, k1.s0
    public boolean p(int i5) {
        return this.f38853c.isVisible(u0.a(i5));
    }
}

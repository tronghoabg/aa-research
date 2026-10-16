package k1;

import android.view.WindowInsets;
import b1.C1494c;

/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: o, reason: collision with root package name */
    public C1494c f38865o;

    /* renamed from: p, reason: collision with root package name */
    public C1494c f38866p;

    /* renamed from: q, reason: collision with root package name */
    public C1494c f38867q;

    public p0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f38865o = null;
        this.f38866p = null;
        this.f38867q = null;
    }

    @Override // k1.s0
    public C1494c h() {
        if (this.f38866p == null) {
            this.f38866p = C1494c.c(this.f38853c.getMandatorySystemGestureInsets());
        }
        return this.f38866p;
    }

    @Override // k1.s0
    public C1494c j() {
        if (this.f38865o == null) {
            this.f38865o = C1494c.c(this.f38853c.getSystemGestureInsets());
        }
        return this.f38865o;
    }

    @Override // k1.s0
    public C1494c l() {
        if (this.f38867q == null) {
            this.f38867q = C1494c.c(this.f38853c.getTappableElementInsets());
        }
        return this.f38867q;
    }

    @Override // k1.m0, k1.s0
    public v0 m(int i5, int i10, int i11, int i12) {
        return v0.g(null, this.f38853c.inset(i5, i10, i11, i12));
    }

    @Override // k1.n0, k1.s0
    public void s(C1494c c1494c) {
    }
}

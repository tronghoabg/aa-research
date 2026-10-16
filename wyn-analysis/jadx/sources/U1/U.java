package U1;

import N1.C0753b;
import N1.C0770t;
import N1.C0773w;
import k2.AbstractC3166x;

/* loaded from: classes.dex */
public final class U extends AbstractC3166x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12005c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12006d;

    public U(N1.N n10, C0773w c0773w) {
        super(n10);
        this.f12006d = c0773w;
    }

    @Override // k2.AbstractC3166x, N1.N
    public N1.L f(int i5, N1.L l10, boolean z2) {
        switch (this.f12005c) {
            case 0:
                N1.N n10 = this.f39170b;
                N1.L lF = n10.f(i5, l10, z2);
                if (n10.m(lF.f8050c, (N1.M) this.f12006d, 0L).a()) {
                    lF.h(l10.f8048a, l10.f8049b, l10.f8050c, l10.f8051d, l10.f8052e, C0753b.f8135c, true);
                } else {
                    lF.f8053f = true;
                }
                return lF;
            default:
                return super.f(i5, l10, z2);
        }
    }

    @Override // k2.AbstractC3166x, N1.N
    public N1.M m(int i5, N1.M m10, long j8) {
        switch (this.f12005c) {
            case 1:
                super.m(i5, m10, j8);
                C0773w c0773w = (C0773w) this.f12006d;
                m10.f8059c = c0773w;
                C0770t c0770t = c0773w.f8272b;
                if (c0770t != null) {
                    String str = c0770t.f8268e;
                }
                m10.getClass();
                return m10;
            default:
                return super.m(i5, m10, j8);
        }
    }

    public U(N1.N n10) {
        super(n10);
        this.f12006d = new N1.M();
    }
}

package g2;

import N1.L;
import N1.M;
import N1.N;
import k2.AbstractC3166x;

/* loaded from: classes.dex */
public final class t extends AbstractC3166x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(N n10, int i5) {
        super(n10);
        this.f35680c = i5;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final L f(int i5, L l10, boolean z2) {
        switch (this.f35680c) {
            case 0:
                super.f(i5, l10, z2);
                l10.f8053f = true;
                break;
            default:
                super.f(i5, l10, z2);
                l10.f8053f = true;
                break;
        }
        return l10;
    }

    @Override // k2.AbstractC3166x, N1.N
    public final M m(int i5, M m10, long j8) {
        switch (this.f35680c) {
            case 0:
                super.m(i5, m10, j8);
                m10.k = true;
                break;
            default:
                super.m(i5, m10, j8);
                m10.k = true;
                break;
        }
        return m10;
    }
}

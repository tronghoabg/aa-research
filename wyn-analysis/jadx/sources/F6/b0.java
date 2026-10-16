package f6;

import E5.C0446d0;
import E5.J0;

/* loaded from: classes3.dex */
public abstract class b0 extends AbstractC2596i {
    public final AbstractC2588a k;

    public b0(AbstractC2588a abstractC2588a) {
        this.k = abstractC2588a;
    }

    @Override // f6.AbstractC2588a
    public final J0 f() {
        return this.k.f();
    }

    @Override // f6.AbstractC2588a
    public final C0446d0 g() {
        return this.k.g();
    }

    @Override // f6.AbstractC2588a
    public final boolean h() {
        return this.k.h();
    }

    @Override // f6.AbstractC2588a
    public final void k(t6.K k) {
        this.f35065j = k;
        this.f35064i = u6.v.j(null);
        y();
    }

    @Override // f6.AbstractC2596i
    public final C2613z r(Object obj, C2613z c2613z) {
        return w(c2613z);
    }

    @Override // f6.AbstractC2596i
    public final long s(long j8, Object obj) {
        return j8;
    }

    @Override // f6.AbstractC2596i
    public final int t(int i5, Object obj) {
        return i5;
    }

    @Override // f6.AbstractC2596i
    public final void u(Object obj, AbstractC2588a abstractC2588a, J0 j02) {
        x(j02);
    }

    public abstract void x(J0 j02);

    public void y() {
        v(null, this.k);
    }

    public C2613z w(C2613z c2613z) {
        return c2613z;
    }
}

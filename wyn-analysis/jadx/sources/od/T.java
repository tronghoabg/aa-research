package od;

import md.AbstractC3541i;
import md.C3535c;

/* loaded from: classes5.dex */
public final class T implements InterfaceC3727u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41809a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41810b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41811c;

    public T(md.k0 k0Var, EnumC3721s enumC3721s) {
        Fe.e.p("error must not be OK", !k0Var.f());
        this.f41810b = k0Var;
        this.f41811c = enumC3721s;
    }

    @Override // od.InterfaceC3727u
    public final r c(F6.r rVar, md.b0 b0Var, C3535c c3535c, AbstractC3541i[] abstractC3541iArr) {
        Object obj = this.f41811c;
        Object obj2 = this.f41810b;
        switch (this.f41809a) {
            case 0:
                return new S((md.k0) obj2, (EnumC3721s) obj, abstractC3541iArr);
            default:
                C3535c c3535c2 = C3535c.f40619i;
                Fe.e.t(c3535c, "callOptions cannot be null");
                AbstractC3541i abstractC3541iA = ((vd.p) obj2).a(new Yf.B(c3535c, 0, false), b0Var);
                Fe.e.w("lb tracer already assigned", abstractC3541iArr[abstractC3541iArr.length - 1] == AbstractC3669a0.f41898o);
                abstractC3541iArr[abstractC3541iArr.length - 1] = abstractC3541iA;
                return ((U0) obj).c(rVar, b0Var, c3535c, abstractC3541iArr);
        }
    }

    @Override // md.E
    public final md.F f() {
        switch (this.f41809a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((U0) this.f41811c).f();
        }
    }

    public T(vd.p pVar, U0 u02) {
        this.f41810b = pVar;
        this.f41811c = u02;
    }
}

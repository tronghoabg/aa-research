package E;

import N.C0732k;
import N.C0740o;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3909n;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final I f2698a;

    static {
        C0416f c0416f = AbstractC0419i.f2743a;
        f2698a = gc.b.F(0, 1, new C0430u(Z.a.f16909j, 1), r.k);
    }

    public static final InterfaceC3909n a(InterfaceC0413c horizontalArrangement, C0740o c0740o) {
        Z.c cVar = Z.a.k;
        AbstractC3340k.e(horizontalArrangement, "horizontalArrangement");
        c0740o.M(-837807694);
        c0740o.M(511388516);
        boolean zE = c0740o.e(horizontalArrangement) | c0740o.e(cVar);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = (horizontalArrangement.equals(AbstractC0419i.f2743a) && cVar.equals(Z.a.f16909j)) ? f2698a : gc.b.F(horizontalArrangement.b(), 1, new C0430u(cVar, 1), new C0428s(horizontalArrangement, 1));
            c0740o.U(objF);
        }
        c0740o.p(false);
        InterfaceC3909n interfaceC3909n = (InterfaceC3909n) objF;
        c0740o.p(false);
        return interfaceC3909n;
    }
}

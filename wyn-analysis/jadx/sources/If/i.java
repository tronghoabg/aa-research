package If;

import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public abstract class i extends g {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0602l f5479d;

    public i(int i5, Gf.a aVar, InterfaceC0602l interfaceC0602l, InterfaceC3108h interfaceC3108h) {
        super(interfaceC3108h, i5, aVar);
        this.f5479d = interfaceC0602l;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // If.g, Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r6, jf.InterfaceC3103c r7) {
        /*
            r5 = this;
            ef.C r0 = ef.C2515C.f34653a
            int r1 = r5.f5474b
            r2 = -3
            if (r1 != r2) goto L70
            jf.h r1 = r7.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            Cd.U r3 = new Cd.U
            r4 = 1
            r3.<init>(r4)
            jf.h r4 = r5.f5473a
            java.lang.Object r2 = r4.fold(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L26
            jf.h r2 = r1.plus(r4)
            goto L2b
        L26:
            r2 = 0
            jf.h r2 = Ef.H.q(r1, r4, r2)
        L2b:
            boolean r3 = kotlin.jvm.internal.AbstractC3340k.a(r2, r1)
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r5.g(r6, r7)
            kf.a r7 = kf.a.f39711a
            if (r6 != r7) goto L79
            return r6
        L3a:
            jf.d r3 = jf.C3104d.f38758a
            jf.f r4 = r2.get(r3)
            jf.f r1 = r1.get(r3)
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r4, r1)
            if (r1 == 0) goto L70
            jf.h r1 = r7.getContext()
            boolean r3 = r6 instanceof If.C
            if (r3 != 0) goto L5d
            boolean r3 = r6 instanceof If.y
            if (r3 == 0) goto L57
            goto L5d
        L57:
            Hf.j r3 = new Hf.j
            r3.<init>(r6, r1)
            r6 = r3
        L5d:
            If.h r1 = new If.h
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r3 = Jf.b.m(r2)
            java.lang.Object r6 = If.AbstractC0622c.b(r2, r6, r3, r1, r7)
            kf.a r7 = kf.a.f39711a
            if (r6 != r7) goto L79
            return r6
        L70:
            java.lang.Object r6 = super.collect(r6, r7)
            kf.a r7 = kf.a.f39711a
            if (r6 != r7) goto L79
            return r6
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: If.i.collect(Hf.m, jf.c):java.lang.Object");
    }

    @Override // If.g
    public final Object d(Gf.t tVar, InterfaceC3103c interfaceC3103c) {
        Object objG = g(new C(tVar), interfaceC3103c);
        return objG == kf.a.f39711a ? objG : C2515C.f34653a;
    }

    public abstract Object g(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c);

    @Override // If.g
    public final String toString() {
        return this.f5479d + " -> " + super.toString();
    }
}

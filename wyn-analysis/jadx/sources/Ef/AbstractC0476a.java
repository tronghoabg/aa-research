package Ef;

import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3462a;
import r7.AbstractC3935e;

/* renamed from: Ef.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0476a extends z0 implements InterfaceC3103c, E {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3108h f3710c;

    public AbstractC0476a(InterfaceC3108h interfaceC3108h, boolean z2) {
        super(z2);
        G((InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a));
        this.f3710c = interfaceC3108h.plus(this);
    }

    @Override // Ef.z0
    public final void F(E5.Q q4) {
        H.w(this.f3710c, q4);
    }

    @Override // Ef.z0
    public final void P(Object obj) {
        if (!(obj instanceof C0517x)) {
            Z(obj);
            return;
        }
        C0517x c0517x = (C0517x) obj;
        Y(C0517x.f3787b.get(c0517x) == 1, c0517x.f3788a);
    }

    public final void a0(F f10, AbstractC0476a abstractC0476a, tf.p pVar) {
        Object objInvoke;
        int iOrdinal = f10.ordinal();
        C2515C c2515c = C2515C.f34653a;
        if (iOrdinal == 0) {
            try {
                Jf.b.h(c2515c, A6.h.A(A6.h.q(abstractC0476a, this, pVar)));
                return;
            } catch (Throwable th) {
                AbstractC3935e.v(this, th);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC3340k.e(pVar, "<this>");
                A6.h.A(A6.h.q(abstractC0476a, this, pVar)).resumeWith(c2515c);
                return;
            }
            if (iOrdinal != 3) {
                throw new E5.Q((byte) 0, 9);
            }
            try {
                InterfaceC3108h interfaceC3108h = this.f3710c;
                Object objN = Jf.b.n(interfaceC3108h, null);
                try {
                    if (pVar instanceof AbstractC3462a) {
                        kotlin.jvm.internal.K.e(2, pVar);
                        objInvoke = pVar.invoke(abstractC0476a, this);
                    } else {
                        objInvoke = A6.h.S(pVar, abstractC0476a, this);
                    }
                    Jf.b.g(interfaceC3108h, objN);
                    if (objInvoke != kf.a.f39711a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    Jf.b.g(interfaceC3108h, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof N) {
                    th = ((N) th).f3687a;
                }
                resumeWith(Fe.e.z(th));
            }
        }
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f3710c;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f3710c;
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        Throwable thA = C2530n.a(obj);
        if (thA != null) {
            obj = new C0517x(false, thA);
        }
        Object objL = L(obj);
        if (objL == H.f3672e) {
            return;
        }
        l(objL);
    }

    @Override // Ef.z0
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void Z(Object obj) {
    }

    public void Y(boolean z2, Throwable th) {
    }
}

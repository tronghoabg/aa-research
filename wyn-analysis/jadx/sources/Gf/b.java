package Gf;

import Ef.C0502n;
import Ef.H;
import Ef.R0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class b implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4784a = g.f4818p;

    /* renamed from: b, reason: collision with root package name */
    public C0502n f4785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f4786c;

    public b(e eVar) {
        this.f4786c = eVar;
    }

    public final Object a(AbstractC3464c abstractC3464c) {
        m mVarO;
        Boolean bool;
        Object obj = this.f4784a;
        boolean z2 = true;
        if (obj == g.f4818p || obj == g.f4814l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f4798g;
            e eVar = this.f4786c;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                if (eVar.v()) {
                    this.f4784a = g.f4814l;
                    Throwable thP = eVar.p();
                    if (thP != null) {
                        int i5 = Jf.s.f6137a;
                        throw thP;
                    }
                    z2 = false;
                } else {
                    long andIncrement = e.f4794c.getAndIncrement(eVar);
                    long j8 = g.f4805b;
                    long j10 = andIncrement / j8;
                    int i10 = (int) (andIncrement % j8);
                    if (mVar.f6136c != j10) {
                        mVarO = eVar.o(j10, mVar);
                        if (mVarO == null) {
                            continue;
                        }
                    } else {
                        mVarO = mVar;
                    }
                    Object objG = eVar.G(mVarO, i10, andIncrement, null);
                    H6.g gVar = g.f4815m;
                    if (objG == gVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    H6.g gVar2 = g.f4817o;
                    if (objG == gVar2) {
                        if (andIncrement < eVar.s()) {
                            mVarO.b();
                        }
                        mVar = mVarO;
                    } else {
                        if (objG == g.f4816n) {
                            e eVar2 = this.f4786c;
                            C0502n c0502nV = H.v(A6.h.A(abstractC3464c));
                            try {
                                this.f4785b = c0502nV;
                                Object objG2 = eVar2.G(mVarO, i10, andIncrement, this);
                                if (objG2 == gVar) {
                                    b(mVarO, i10);
                                } else {
                                    if (objG2 == gVar2) {
                                        if (andIncrement < eVar2.s()) {
                                            mVarO.b();
                                        }
                                        m mVar2 = (m) e.f4798g.get(eVar2);
                                        while (true) {
                                            if (eVar2.v()) {
                                                C0502n c0502n = this.f4785b;
                                                AbstractC3340k.b(c0502n);
                                                this.f4785b = null;
                                                this.f4784a = g.f4814l;
                                                Throwable thP2 = eVar.p();
                                                if (thP2 == null) {
                                                    c0502n.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0502n.resumeWith(Fe.e.z(thP2));
                                                }
                                            } else {
                                                long andIncrement2 = e.f4794c.getAndIncrement(eVar2);
                                                long j11 = g.f4805b;
                                                long j12 = andIncrement2 / j11;
                                                int i11 = (int) (andIncrement2 % j11);
                                                if (mVar2.f6136c != j12) {
                                                    m mVarO2 = eVar2.o(j12, mVar2);
                                                    if (mVarO2 != null) {
                                                        mVar2 = mVarO2;
                                                    }
                                                }
                                                Object objG3 = eVar2.G(mVar2, i11, andIncrement2, this);
                                                if (objG3 == g.f4815m) {
                                                    b(mVar2, i11);
                                                    break;
                                                }
                                                if (objG3 == g.f4817o) {
                                                    if (andIncrement2 < eVar2.s()) {
                                                        mVar2.b();
                                                    }
                                                } else {
                                                    if (objG3 == g.f4816n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    mVar2.b();
                                                    this.f4784a = objG3;
                                                    this.f4785b = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        mVarO.b();
                                        this.f4784a = objG2;
                                        this.f4785b = null;
                                        bool = Boolean.TRUE;
                                    }
                                    c0502nV.g(bool, null);
                                }
                                Object objS = c0502nV.s();
                                kf.a aVar = kf.a.f39711a;
                                return objS;
                            } catch (Throwable th) {
                                c0502nV.A();
                                throw th;
                            }
                        }
                        mVarO.b();
                        this.f4784a = objG;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // Ef.R0
    public final void b(Jf.r rVar, int i5) {
        C0502n c0502n = this.f4785b;
        if (c0502n != null) {
            c0502n.b(rVar, i5);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f4784a;
        H6.g gVar = g.f4818p;
        if (obj == gVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4784a = gVar;
        if (obj != g.f4814l) {
            return obj;
        }
        Throwable thQ = this.f4786c.q();
        int i5 = Jf.s.f6137a;
        throw thQ;
    }
}

package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class eki implements ekp {
    private final eke a;
    private final eky b;
    private final boolean c;

    public eki(eky ekyVar, eke ekeVar) {
        this.b = ekyVar;
        this.c = ekeVar instanceof ejg;
        this.a = ekeVar;
    }

    @Override // defpackage.ekp
    public final int a(Object obj) {
        ekz ekzVarD = eky.d(obj);
        int iO = ekzVarD.e;
        if (iO == -1) {
            iO = 0;
            for (int i = 0; i < ekzVarD.b; i++) {
                int i2 = ekzVarD.c[i] >>> 3;
                eip eipVar = (eip) ekzVarD.d[i];
                boolean z = eiw.e;
                int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                iO += iNumberOfLeadingZeros + iNumberOfLeadingZeros + eiw.O(2, i2) + eiw.E(3, eipVar);
            }
            ekzVarD.e = iO;
        }
        if (!this.c) {
            return iO;
        }
        ejc ejcVarG = dtg.g(obj);
        ekv ekvVar = ejcVarG.b;
        int i3 = ekvVar.b;
        int iB = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iB += ejcVarG.b(ekvVar.d(i4));
        }
        Iterator it = ekvVar.a().iterator();
        while (it.hasNext()) {
            iB += ejcVarG.b((Map.Entry) it.next());
        }
        return iO + iB;
    }

    @Override // defpackage.ekp
    public final int b(Object obj) {
        int iHashCode = eky.d(obj).hashCode();
        return this.c ? (iHashCode * 53) + dtg.g(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.ekp
    public final Object c() {
        eke ekeVar = this.a;
        return ekeVar instanceof eji ? ((eji) ekeVar).l() : ((ejf) ekeVar.m()).e();
    }

    @Override // defpackage.ekp
    public final void d(Object obj) {
        this.b.c(obj);
        dtg.i(obj);
    }

    @Override // defpackage.ekp
    public final void e(Object obj, Object obj2) {
        ekq.n(obj, obj2);
        if (this.c) {
            ekq.m(obj, obj2);
        }
    }

    @Override // defpackage.ekp
    public final boolean f(Object obj, Object obj2) {
        if (!eky.d(obj).equals(eky.d(obj2))) {
            return false;
        }
        if (this.c) {
            return dtg.g(obj).equals(dtg.g(obj2));
        }
        return true;
    }

    @Override // defpackage.ekp
    public final boolean g(Object obj) {
        return dtg.g(obj).h();
    }

    @Override // defpackage.ekp
    public final void h(Object obj, wld wldVar, eja ejaVar) throws IOException {
        boolean zM;
        eky ekyVar = this.b;
        Object objA = ekyVar.a(obj);
        dtg.h(obj);
        while (wldVar.f() != Integer.MAX_VALUE) {
            try {
                int i = wldVar.b;
                int iL = 0;
                if (i == 11) {
                    Object objF = null;
                    eip eipVarR = null;
                    while (wldVar.f() != Integer.MAX_VALUE) {
                        int i2 = wldVar.b;
                        if (i2 == 16) {
                            iL = wldVar.l();
                            objF = dtg.f(ejaVar, this.a, iL);
                        } else if (i2 == 26) {
                            if (objF != null) {
                                throw null;
                            }
                            eipVarR = wldVar.r();
                        } else if (i2 == 12 || !wldVar.M()) {
                            break;
                        }
                    }
                    if (wldVar.b != 12) {
                        throw new ejp("Protocol message end-group tag did not match expected tag.");
                    }
                    if (eipVarR != null) {
                        if (objF != null) {
                            throw null;
                        }
                        ((ekz) objA).e((iL << 3) | 2, eipVarR);
                    }
                    zM = true;
                } else if ((i & 7) != 2) {
                    zM = wldVar.M();
                } else {
                    if (dtg.f(ejaVar, this.a, i >>> 3) != null) {
                        throw null;
                    }
                    zM = ekyVar.f(objA, wldVar, 0);
                }
                if (!zM) {
                    break;
                }
            } finally {
                eky.e(obj, (ekz) objA);
            }
        }
    }

    @Override // defpackage.ekp
    public final void i(Object obj, erb erbVar) throws IOException {
        Iterator itC = dtg.g(obj).c();
        if (itC.hasNext()) {
            throw null;
        }
        ekz ekzVarD = eky.d(obj);
        for (int i = 0; i < ekzVarD.b; i++) {
            int i2 = ekzVarD.c[i] >>> 3;
            Object obj2 = ekzVarD.d[i];
            if (obj2 instanceof eip) {
                ((eiw) erbVar.a).u(i2, (eip) obj2);
            } else {
                ((eiw) erbVar.a).t(i2, (eke) obj2);
            }
        }
    }
}

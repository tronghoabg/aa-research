package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ddu {
    public final cxb a;
    public final ddr b;
    public final int c;
    private final cfx d;
    private final boolean e;
    private ddu f;

    public ddu(cfx cfxVar, boolean z, cxb cxbVar, ddr ddrVar) {
        this.d = cfxVar;
        this.e = z;
        this.a = cxbVar;
        this.b = ddrVar;
        this.c = cxbVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final cyu n() {
        cfx cfxVarN;
        boolean z;
        boolean z2 = this.b.a;
        cxb cxbVar = this.a;
        Object obj = null;
        if (z2) {
            cxx cxxVar = cxbVar.v;
            if ((cxxVar.a() & 8) != 0) {
                cfxVarN = null;
                for (cfx cfxVar = cxxVar.f; cfxVar != null; cfxVar = cfxVar.u) {
                    if ((cfxVar.r & 8) != 0) {
                        cfx cfxVarN2 = cfxVar;
                        byw bywVar = null;
                        while (cfxVarN2 != null) {
                            if (cfxVarN2 instanceof cyu) {
                                cyu cyuVar = (cyu) cfxVarN2;
                                if (cyuVar.z()) {
                                    if (cyuVar.y()) {
                                        return cyuVar;
                                    }
                                    if (cfxVarN == null) {
                                        cfxVarN = cyuVar;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (cfxVarN2.r & 8) != 0 && (cfxVarN2 instanceof cwe)) {
                                int i = 0;
                                for (cfx cfxVar2 = ((cwe) cfxVarN2).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                    if ((cfxVar2.r & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cfxVarN2 = cfxVar2;
                                        } else {
                                            if (bywVar == null) {
                                                bywVar = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN2 != null) {
                                                bywVar.n(cfxVarN2);
                                            }
                                            bywVar.n(cfxVar2);
                                            cfxVarN2 = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            cfxVarN2 = bzi.n(bywVar);
                        }
                    }
                    if ((cfxVar.s & 8) == 0) {
                        break;
                    }
                }
                obj = cfxVarN;
            }
        } else {
            cxx cxxVar2 = cxbVar.v;
            if ((cxxVar2.a() & 8) != 0) {
                loop3: for (cfx cfxVar3 = cxxVar2.f; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                    if ((cfxVar3.r & 8) != 0) {
                        cfxVarN = cfxVar3;
                        byw bywVar2 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof cyu) {
                                if (((cyu) cfxVarN).z()) {
                                    obj = cfxVarN;
                                }
                            } else if ((cfxVarN.r & 8) != 0 && (cfxVarN instanceof cwe)) {
                                int i2 = 0;
                                for (cfx cfxVar4 = ((cwe) cfxVarN).C; cfxVar4 != null; cfxVar4 = cfxVar4.u) {
                                    if ((cfxVar4.r & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cfxVarN = cfxVar4;
                                        } else {
                                            if (bywVar2 == null) {
                                                bywVar2 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar2.n(cfxVarN);
                                            }
                                            bywVar2.n(cfxVar4);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar2);
                        }
                    }
                    if ((cfxVar3.s & 8) == 0) {
                        break;
                    }
                }
            }
        }
        return (cyu) obj;
    }

    private final ddu o(ddo ddoVar, afec afecVar) {
        ddr ddrVar = new ddr();
        ddrVar.a = false;
        ddrVar.b = false;
        afecVar.invoke(ddrVar);
        ddu dduVar = new ddu(new ddt(afecVar), false, new cxb(true, this.c + (ddoVar != null ? 1000000000 : 2000000000)), ddrVar);
        dduVar.f = this;
        return dduVar;
    }

    private final void p(List list, ddr ddrVar) {
        if (this.b.b) {
            return;
        }
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            ddu dduVar = (ddu) list.get(size2);
            if (!dduVar.q()) {
                ddrVar.e(dduVar.b);
                dduVar.p(list, ddrVar);
            }
        }
    }

    private final boolean q() {
        return this.e && this.b.a;
    }

    private final void r(cxb cxbVar, List list) {
        byw bywVarJ = cxbVar.j();
        Object[] objArr = bywVarJ.a;
        int i = bywVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxb cxbVar2 = (cxb) objArr[i2];
            if (cxbVar2.am() && !cxbVar2.D) {
                if (cxbVar2.v.i(8)) {
                    list.add(daq.h(cxbVar2, this.e));
                } else {
                    r(cxbVar2, list);
                }
            }
        }
    }

    private final void s(List list, List list2) {
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            ddu dduVar = (ddu) list.get(size2);
            if (dduVar.q()) {
                list2.add(dduVar);
            } else if (!dduVar.b.b) {
                dduVar.s(list, list2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final cjb a(cst cstVar) {
        cwe cweVarN;
        ddu dduVarI = i();
        if (dduVarI == null) {
            return cjb.a;
        }
        cxx cxxVar = dduVarI.a.v;
        if ((cxxVar.a() & 8) != 0) {
            loop0: for (cfx cfxVar = cxxVar.f; cfxVar != null; cfxVar = cfxVar.u) {
                if ((cfxVar.r & 8) != 0) {
                    cweVarN = cfxVar;
                    ?? bywVar = 0;
                    while (cweVarN != 0) {
                        if (cweVarN instanceof cyu) {
                            if (cweVarN.z()) {
                                break loop0;
                            }
                        } else if ((cweVarN.r & 8) != 0 && (cweVarN instanceof cwe)) {
                            cfx cfxVar2 = cweVarN.C;
                            int i = 0;
                            cweVarN = cweVarN;
                            bywVar = bywVar;
                            while (cfxVar2 != null) {
                                if ((cfxVar2.r & 8) != 0) {
                                    i++;
                                    bywVar = bywVar;
                                    if (i == 1) {
                                        cweVarN = cfxVar2;
                                    } else {
                                        if (bywVar == 0) {
                                            bywVar = new byw(new cfx[16]);
                                        }
                                        if (cweVarN != 0) {
                                            bywVar.n(cweVarN);
                                        }
                                        bywVar.n(cfxVar2);
                                        cweVarN = 0;
                                    }
                                }
                                cfxVar2 = cfxVar2.u;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                            }
                            if (i != 1) {
                            }
                        }
                        cweVarN = bzi.n(bywVar);
                    }
                }
                if ((cfxVar.s & 8) == 0) {
                    break;
                }
            }
            cweVarN = 0;
        } else {
            cweVarN = 0;
        }
        cyu cyuVar = (cyu) cweVarN;
        cyc cycVarR = cyuVar != null ? bzi.r(cyuVar, 8) : null;
        return cycVarR == null ? dduVarI.a(cstVar) : cycVarR.o(cstVar, true);
    }

    public final cjb b() {
        cyc cycVarF = f();
        if (cycVarF != null) {
            if (true != cycVarF.t()) {
                cycVarF = null;
            }
            if (cycVarF != null) {
                return crt.j(cycVarF).o(cycVarF, true);
            }
        }
        return cjb.a;
    }

    public final cjb c() {
        cyc cycVarF = f();
        if (cycVarF != null) {
            if (true != cycVarF.t()) {
                cycVarF = null;
            }
            if (cycVarF != null) {
                return crt.i(cycVarF, true);
            }
        }
        return cjb.a;
    }

    public final cjb d() {
        cyu cyuVarN = n();
        if (cyuVarN == null) {
            return this.a.p().ad();
        }
        return czz.r(cyuVarN.M(), czz.s(this.b), true);
    }

    public final cjb e() {
        cyu cyuVarN = n();
        if (cyuVarN == null) {
            cyc cycVarP = this.a.p();
            return crt.j(cycVarP).o(cycVarP, false);
        }
        return czz.r(cyuVarN.M(), czz.s(this.b), false);
    }

    public final cyc f() {
        if (!j()) {
            cyu cyuVarN = n();
            return cyuVarN != null ? bzi.r(cyuVarN, 8) : this.a.p();
        }
        ddu dduVarI = i();
        if (dduVarI != null) {
            return dduVarI.f();
        }
        return null;
    }

    public final ddr g() {
        boolean zQ = q();
        ddr ddrVar = this.b;
        if (!zQ) {
            return ddrVar;
        }
        ddr ddrVarB = ddrVar.b();
        p(new ArrayList(), ddrVarB);
        return ddrVarB;
    }

    public final ddu h() {
        return new ddu(this.d, true, this.a, this.b);
    }

    public final ddu i() {
        cxb cxbVarL;
        ddu dduVar = this.f;
        if (dduVar != null) {
            return dduVar;
        }
        boolean z = this.e;
        if (z) {
            cxbVarL = this.a.l();
            while (cxbVarL != null) {
                ddr ddrVarR = cxbVarL.r();
                if (ddrVarR != null && ddrVarR.a) {
                    break;
                }
                cxbVarL = cxbVarL.l();
            }
            cxbVarL = null;
        } else {
            cxbVarL = null;
        }
        if (cxbVarL == null) {
            cxbVarL = this.a.l();
            while (true) {
                if (cxbVarL == null) {
                    cxbVarL = null;
                    break;
                }
                if (cxbVarL.v.i(8)) {
                    break;
                }
                cxbVarL = cxbVarL.l();
            }
        }
        if (cxbVarL == null) {
            return null;
        }
        return daq.h(cxbVarL, z);
    }

    public final boolean j() {
        return this.f != null;
    }

    public final List k(boolean z, boolean z2) {
        if (!z && this.b.b) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!q()) {
            return m(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        s(arrayList, arrayList2);
        return arrayList2;
    }

    public final List m(List list, boolean z) {
        if (j()) {
            return afbe.a;
        }
        r(this.a, list);
        if (z) {
            ddr ddrVar = this.b;
            ddo ddoVar = (ddo) ddrVar.g(ddx.A);
            if (ddoVar != null && ddrVar.a && !list.isEmpty()) {
                list.add(o(ddoVar, new chk(ddoVar, 20)));
            }
            deb debVar = ddx.a;
            if (ddrVar.f(debVar) && !list.isEmpty() && ddrVar.a) {
                List list2 = (List) ddrVar.g(debVar);
                String str = list2 != null ? (String) woy.bH(list2) : null;
                if (str != null) {
                    list.add(0, o(null, new ddz(str, 1)));
                }
            }
        }
        return list;
    }
}

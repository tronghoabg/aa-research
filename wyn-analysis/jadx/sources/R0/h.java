package R0;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10070a = new b();

    public static boolean a(Q0.d dVar) {
        int[] iArr = dVar.f9570p0;
        int i5 = iArr[0];
        int i10 = iArr[1];
        Q0.d dVar2 = dVar.f9533T;
        Q0.e eVar = dVar2 != null ? (Q0.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f9570p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f9570p0[1];
        }
        boolean z2 = i5 == 1 || dVar.A() || i5 == 2 || (i5 == 3 && dVar.f9572r == 0 && dVar.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && dVar.t(0)) || (i5 == 3 && dVar.f9572r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f9573s == 0 && dVar.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && dVar.t(1)) || (i10 == 3 && dVar.f9573s == 1 && dVar.u(1, dVar.k()));
        return (dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z2 || z10)) || (z2 && z10);
    }

    public static n b(Q0.d dVar, int i5, ArrayList arrayList, n nVar) {
        int i10;
        int i11 = i5 == 0 ? dVar.f9566n0 : dVar.f9568o0;
        if (i11 != -1 && (nVar == null || i11 != nVar.f10076b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i12);
                if (nVar2.f10076b == i11) {
                    if (nVar != null) {
                        nVar.c(i5, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof Q0.i) {
                Q0.i iVar = (Q0.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f9657r0) {
                        i10 = -1;
                        break;
                    }
                    Q0.d dVar2 = iVar.f9656q0[i13];
                    if ((i5 == 0 && (i10 = dVar2.f9566n0) != -1) || (i5 == 1 && (i10 = dVar2.f9568o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i14);
                        if (nVar3.f10076b == i10) {
                            nVar = nVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f10075a = new ArrayList();
                nVar.f10078d = null;
                nVar.f10079e = -1;
                int i15 = n.f10074f;
                n.f10074f = i15 + 1;
                nVar.f10076b = i15;
                nVar.f10077c = i5;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f10075a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof Q0.h) {
            Q0.h hVar = (Q0.h) dVar;
            hVar.f9654t0.c(hVar.f9655u0 == 0 ? 1 : 0, nVar, arrayList);
        }
        int i16 = nVar.f10076b;
        if (i5 == 0) {
            dVar.f9566n0 = i16;
            dVar.f9523I.c(i5, nVar, arrayList);
            dVar.f9525K.c(i5, nVar, arrayList);
        } else {
            dVar.f9568o0 = i16;
            dVar.f9524J.c(i5, nVar, arrayList);
            dVar.f9526M.c(i5, nVar, arrayList);
            dVar.L.c(i5, nVar, arrayList);
        }
        dVar.f9529P.c(i5, nVar, arrayList);
        return nVar;
    }

    public static void c(int i5, Q0.d dVar, T0.e eVar, boolean z2) {
        Q0.c cVar;
        Q0.c cVar2;
        char c10;
        Q0.c cVar3;
        Q0.c cVar4;
        if (dVar.f9563m) {
            return;
        }
        if (!(dVar instanceof Q0.e) && dVar.z() && a(dVar)) {
            Q0.e.V(dVar, eVar, new b());
        }
        Q0.c cVarI = dVar.i(2);
        Q0.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f9506a;
        if (hashSet != null && cVarI.f9508c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Q0.c cVar5 = (Q0.c) it.next();
                Q0.d dVar2 = cVar5.f9509d;
                int i10 = i5 + 1;
                boolean zA = a(dVar2);
                if (dVar2.z() && zA) {
                    c10 = 0;
                    Q0.e.V(dVar2, eVar, new b());
                } else {
                    c10 = 0;
                }
                Q0.c cVar6 = dVar2.f9523I;
                Q0.c cVar7 = dVar2.f9525K;
                char c11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f9511f) != null && cVar4.f9508c) || (cVar5 == cVar7 && (cVar3 = cVar6.f9511f) != null && cVar3.f9508c)) ? (char) 1 : c10;
                int i11 = dVar2.f9570p0[c10];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f9511f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i10, dVar2, eVar, z2);
                        } else if (cVar5 == cVar7 && cVar6.f9511f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i10, dVar2, eVar, z2);
                        } else if (c11 != 0 && !dVar2.x()) {
                            d(i10, dVar2, eVar, z2);
                        }
                    }
                } else if (i11 == 3 && dVar2.f9576v >= 0 && dVar2.f9575u >= 0 && (dVar2.f9553g0 == 8 || (dVar2.f9572r == 0 && dVar2.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!dVar2.x() && !dVar2.f9520F && c11 != 0 && !dVar2.x()) {
                        e(i10, dVar, eVar, dVar2, z2);
                    }
                }
            }
        }
        if (dVar instanceof Q0.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f9506a;
        if (hashSet2 != null && cVarI2.f9508c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Q0.c cVar8 = (Q0.c) it2.next();
                Q0.d dVar3 = cVar8.f9509d;
                int i12 = i5 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.z() && zA2) {
                    Q0.e.V(dVar3, eVar, new b());
                }
                Q0.c cVar9 = dVar3.f9523I;
                Q0.c cVar10 = dVar3.f9525K;
                boolean z10 = (cVar8 == cVar9 && (cVar2 = cVar10.f9511f) != null && cVar2.f9508c) || (cVar8 == cVar10 && (cVar = cVar9.f9511f) != null && cVar.f9508c);
                int i13 = dVar3.f9570p0[0];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f9511f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i12, dVar3, eVar, z2);
                        } else if (cVar8 == cVar10 && cVar9.f9511f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i12, dVar3, eVar, z2);
                        } else if (z10 && !dVar3.x()) {
                            d(i12, dVar3, eVar, z2);
                        }
                    }
                } else if (i13 == 3 && dVar3.f9576v >= 0 && dVar3.f9575u >= 0) {
                    if (dVar3.f9553g0 == 8 || (dVar3.f9572r == 0 && dVar3.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        if (!dVar3.x() && !dVar3.f9520F && z10 && !dVar3.x()) {
                            e(i12, dVar, eVar, dVar3, z2);
                        }
                    }
                }
            }
        }
        dVar.f9563m = true;
    }

    public static void d(int i5, Q0.d dVar, T0.e eVar, boolean z2) {
        float f10 = dVar.f9547d0;
        Q0.c cVar = dVar.f9523I;
        int iD = cVar.f9511f.d();
        Q0.c cVar2 = dVar.f9525K;
        int iD2 = cVar2.f9511f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i10 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i10 = (iD - iD2) - iQ;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iQ;
        if (iD > iD2) {
            i12 = i11 - iQ;
        }
        dVar.J(i11, i12);
        c(i5 + 1, dVar, eVar, z2);
    }

    public static void e(int i5, Q0.d dVar, T0.e eVar, Q0.d dVar2, boolean z2) {
        float f10 = dVar2.f9547d0;
        Q0.c cVar = dVar2.f9523I;
        int iE = cVar.e() + cVar.f9511f.d();
        Q0.c cVar2 = dVar2.f9525K;
        int iD = cVar2.f9511f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f9553g0 != 8) {
                int i10 = dVar2.f9572r;
                if (i10 == 2) {
                    iQ = (int) (dVar2.f9547d0 * 0.5f * (dVar instanceof Q0.e ? dVar.q() : dVar.f9533T.q()));
                } else if (i10 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f9575u, iQ);
                int i11 = dVar2.f9576v;
                if (i11 > 0) {
                    iQ = Math.min(i11, iQ);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i12, iQ + i12);
            c(i5 + 1, dVar2, eVar, z2);
        }
    }

    public static void f(int i5, Q0.d dVar, T0.e eVar) {
        float f10 = dVar.f9549e0;
        Q0.c cVar = dVar.f9524J;
        int iD = cVar.f9511f.d();
        Q0.c cVar2 = dVar.L;
        int iD2 = cVar2.f9511f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        dVar.K(i12, i13);
        i(i5 + 1, dVar, eVar);
    }

    public static void g(int i5, Q0.d dVar, T0.e eVar, Q0.d dVar2) {
        float f10 = dVar2.f9549e0;
        Q0.c cVar = dVar2.f9524J;
        int iE = cVar.e() + cVar.f9511f.d();
        Q0.c cVar2 = dVar2.L;
        int iD = cVar2.f9511f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f9553g0 != 8) {
                int i10 = dVar2.f9573s;
                if (i10 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof Q0.e ? dVar.k() : dVar.f9533T.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f9578x, iK);
                int i11 = dVar2.f9579y;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i12, iK + i12);
            i(i5 + 1, dVar2, eVar);
        }
    }

    public static boolean h(int i5, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i5 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i5, Q0.d dVar, T0.e eVar) {
        Q0.c cVar;
        Q0.c cVar2;
        Q0.c cVar3;
        Q0.c cVar4;
        if (dVar.f9565n) {
            return;
        }
        if (!(dVar instanceof Q0.e) && dVar.z() && a(dVar)) {
            Q0.e.V(dVar, eVar, new b());
        }
        Q0.c cVarI = dVar.i(3);
        Q0.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f9506a;
        if (hashSet != null && cVarI.f9508c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Q0.c cVar5 = (Q0.c) it.next();
                Q0.d dVar2 = cVar5.f9509d;
                int i10 = i5 + 1;
                boolean zA = a(dVar2);
                if (dVar2.z() && zA) {
                    Q0.e.V(dVar2, eVar, new b());
                }
                Q0.c cVar6 = dVar2.f9524J;
                Q0.c cVar7 = dVar2.L;
                boolean z2 = (cVar5 == cVar6 && (cVar4 = cVar7.f9511f) != null && cVar4.f9508c) || (cVar5 == cVar7 && (cVar3 = cVar6.f9511f) != null && cVar3.f9508c);
                int i11 = dVar2.f9570p0[1];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f9511f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i10, dVar2, eVar);
                        } else if (cVar5 == cVar7 && cVar6.f9511f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i10, dVar2, eVar);
                        } else if (z2 && !dVar2.y()) {
                            f(i10, dVar2, eVar);
                        }
                    }
                } else if (i11 == 3 && dVar2.f9579y >= 0 && dVar2.f9578x >= 0 && (dVar2.f9553g0 == 8 || (dVar2.f9573s == 0 && dVar2.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!dVar2.y() && !dVar2.f9520F && z2 && !dVar2.y()) {
                        g(i10, dVar, eVar, dVar2);
                    }
                }
            }
        }
        char c10 = 1;
        if (dVar instanceof Q0.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f9506a;
        if (hashSet2 != null && cVarI2.f9508c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Q0.c cVar8 = (Q0.c) it2.next();
                Q0.d dVar3 = cVar8.f9509d;
                int i12 = i5 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.z() && zA2) {
                    Q0.e.V(dVar3, eVar, new b());
                }
                Q0.c cVar9 = dVar3.f9524J;
                Q0.c cVar10 = dVar3.L;
                boolean z10 = (cVar8 == cVar9 && (cVar2 = cVar10.f9511f) != null && cVar2.f9508c) || (cVar8 == cVar10 && (cVar = cVar9.f9511f) != null && cVar.f9508c);
                int i13 = dVar3.f9570p0[1];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f9511f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i12, dVar3, eVar);
                        } else if (cVar8 == cVar10 && cVar9.f9511f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i12, dVar3, eVar);
                        } else if (z10 && !dVar3.y()) {
                            f(i12, dVar3, eVar);
                        }
                    }
                } else if (i13 == 3 && dVar3.f9579y >= 0 && dVar3.f9578x >= 0 && (dVar3.f9553g0 == 8 || (dVar3.f9573s == 0 && dVar3.f9536W == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!dVar3.y() && !dVar3.f9520F && z10 && !dVar3.y()) {
                        g(i12, dVar, eVar, dVar3);
                    }
                }
            }
        }
        Q0.c cVarI3 = dVar.i(6);
        if (cVarI3.f9506a != null && cVarI3.f9508c) {
            int iD3 = cVarI3.d();
            Iterator it3 = cVarI3.f9506a.iterator();
            while (it3.hasNext()) {
                Q0.c cVar11 = (Q0.c) it3.next();
                Q0.d dVar4 = cVar11.f9509d;
                int i14 = i5 + 1;
                boolean zA3 = a(dVar4);
                if (dVar4.z() && zA3) {
                    Q0.e.V(dVar4, eVar, new b());
                }
                if (dVar4.f9570p0[c10 == true ? 1 : 0] != 3 || zA3) {
                    if (dVar4.z()) {
                        continue;
                    } else {
                        Q0.c cVar12 = dVar4.f9526M;
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (dVar4.f9519E) {
                                int i15 = iE5 - dVar4.f9541a0;
                                int i16 = dVar4.f9535V + i15;
                                dVar4.f9539Z = i15;
                                dVar4.f9524J.l(i15);
                                dVar4.L.l(i16);
                                cVar12.l(iE5);
                                dVar4.f9561l = c10 == true ? 1 : 0;
                            }
                            i(i14, dVar4, eVar);
                        }
                    }
                }
                c10 = 1;
            }
        }
        dVar.f9565n = true;
    }
}

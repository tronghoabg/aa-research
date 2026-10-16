package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class drd {
    public static final dqw a = new dqw();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, dqn dqnVar, dqx dqxVar, boolean z) {
        dqm dqmVar;
        dqm dqmVar2;
        float f;
        boolean z2;
        boolean z3;
        dqm dqmVar3;
        dqm dqmVar4;
        if (dqnVar.x) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(dqnVar instanceof dqo) && dqnVar.T() && c(dqnVar)) {
            dqo.al(dqnVar, dqxVar, new dqw());
        }
        dqm dqmVarU = dqnVar.U(2);
        dqm dqmVarU2 = dqnVar.U(4);
        int iA = dqmVarU.a();
        int iA2 = dqmVarU2.a();
        HashSet hashSet = dqmVarU.a;
        if (hashSet != null && dqmVarU.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                dqm dqmVar5 = (dqm) it.next();
                dqn dqnVar2 = dqmVar5.d;
                boolean zC = c(dqnVar2);
                if (dqnVar2.T() && zC) {
                    f = BitmapDescriptorFactory.HUE_RED;
                    dqo.al(dqnVar2, dqxVar, new dqw());
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                dqm dqmVar6 = dqnVar2.T;
                if ((dqmVar5 == dqmVar6 && (dqmVar4 = dqnVar2.V.e) != null && dqmVar4.c) || (dqmVar5 == dqnVar2.V && (dqmVar3 = dqmVar6.e) != null && dqmVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (dqnVar2.W() != 3 || zC) {
                    if (!dqnVar2.T()) {
                        if (dqmVar5 == dqmVar6 && dqnVar2.V.e == null) {
                            int iB = dqmVar6.b() + iA;
                            dqnVar2.z(iB, dqnVar2.j() + iB);
                            a(i2, dqnVar2, dqxVar, z);
                        } else {
                            dqm dqmVar7 = dqnVar2.V;
                            if (dqmVar5 == dqmVar7 && dqmVar6.e == null) {
                                int iB2 = iA - dqmVar7.b();
                                dqnVar2.z(iB2 - dqnVar2.j(), iB2);
                                a(i2, dqnVar2, dqxVar, z);
                            } else if (z3 && !dqnVar2.R()) {
                                e(i2, dqxVar, dqnVar2, z);
                            }
                        }
                    }
                } else if (dqnVar2.W() == 3 && dqnVar2.G >= 0 && dqnVar2.F >= 0 && ((dqnVar2.ar == 8 || (dqnVar2.C == 0 && dqnVar2.ah == f)) && !dqnVar2.R() && !dqnVar2.Q && z3 && !dqnVar2.R())) {
                    f(i2, dqnVar, dqxVar, dqnVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (dqnVar instanceof dqr) {
            return;
        }
        HashSet hashSet2 = dqmVarU2.a;
        if (hashSet2 != null && dqmVarU2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                dqm dqmVar8 = (dqm) it2.next();
                dqn dqnVar3 = dqmVar8.d;
                boolean zC2 = c(dqnVar3);
                if (dqnVar3.T() && zC2) {
                    dqo.al(dqnVar3, dqxVar, new dqw());
                }
                dqm dqmVar9 = dqnVar3.T;
                boolean z6 = ((dqmVar8 == dqmVar9 && (dqmVar2 = dqnVar3.V.e) != null && dqmVar2.c) || (dqmVar8 == dqnVar3.V && (dqmVar = dqmVar9.e) != null && dqmVar.c)) ? z5 : false;
                if (dqnVar3.W() != 3 || zC2) {
                    if (!dqnVar3.T()) {
                        if (dqmVar8 == dqmVar9 && dqnVar3.V.e == null) {
                            int iB3 = dqmVar9.b() + iA2;
                            dqnVar3.z(iB3, dqnVar3.j() + iB3);
                            a(i3, dqnVar3, dqxVar, z);
                        } else {
                            dqm dqmVar10 = dqnVar3.V;
                            if (dqmVar8 == dqmVar10 && dqmVar9.e == null) {
                                int iB4 = iA2 - dqmVar10.b();
                                dqnVar3.z(iB4 - dqnVar3.j(), iB4);
                                a(i3, dqnVar3, dqxVar, z);
                            } else if (z6 && !dqnVar3.R()) {
                                e(i3, dqxVar, dqnVar3, z);
                            }
                        }
                    }
                } else if (dqnVar3.W() == 3 && dqnVar3.G >= 0 && dqnVar3.F >= 0 && (dqnVar3.ar == 8 || (dqnVar3.C == 0 && dqnVar3.ah == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dqnVar3.R() && !dqnVar3.Q && z6 && !dqnVar3.R()) {
                        f(i3, dqnVar, dqxVar, dqnVar3, z);
                    }
                }
            }
        }
        dqnVar.x = z5;
    }

    public static void b(int i, dqn dqnVar, dqx dqxVar) {
        dqm dqmVar;
        dqm dqmVar2;
        dqm dqmVar3;
        dqm dqmVar4;
        dqm dqmVar5;
        if (dqnVar.y) {
            return;
        }
        c++;
        if (!(dqnVar instanceof dqo) && dqnVar.T() && c(dqnVar)) {
            dqo.al(dqnVar, dqxVar, new dqw());
        }
        dqm dqmVarU = dqnVar.U(3);
        dqm dqmVarU2 = dqnVar.U(5);
        int iA = dqmVarU.a();
        int iA2 = dqmVarU2.a();
        HashSet hashSet = dqmVarU.a;
        if (hashSet != null && dqmVarU.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                dqm dqmVar6 = (dqm) it.next();
                dqn dqnVar2 = dqmVar6.d;
                boolean zC = c(dqnVar2);
                if (dqnVar2.T() && zC) {
                    dqo.al(dqnVar2, dqxVar, new dqw());
                }
                dqm dqmVar7 = dqnVar2.U;
                boolean z = (dqmVar6 == dqmVar7 && (dqmVar5 = dqnVar2.W.e) != null && dqmVar5.c) || (dqmVar6 == dqnVar2.W && (dqmVar4 = dqmVar7.e) != null && dqmVar4.c);
                if (dqnVar2.X() != 3 || zC) {
                    if (!dqnVar2.T()) {
                        if (dqmVar6 == dqmVar7 && dqnVar2.W.e == null) {
                            int iB = dqmVar7.b() + iA;
                            dqnVar2.A(iB, dqnVar2.h() + iB);
                            b(i2, dqnVar2, dqxVar);
                        } else {
                            dqm dqmVar8 = dqnVar2.W;
                            if (dqmVar6 == dqmVar8 && dqmVar7.e == null) {
                                int iB2 = iA - dqmVar8.b();
                                dqnVar2.A(iB2 - dqnVar2.h(), iB2);
                                b(i2, dqnVar2, dqxVar);
                            } else if (z && !dqnVar2.S()) {
                                g(i2, dqxVar, dqnVar2);
                            }
                        }
                    }
                } else if (dqnVar2.X() == 3 && dqnVar2.J >= 0 && dqnVar2.I >= 0 && (dqnVar2.ar == 8 || (dqnVar2.D == 0 && dqnVar2.ah == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dqnVar2.S() && !dqnVar2.Q && z && !dqnVar2.S()) {
                        h(i2, dqnVar, dqxVar, dqnVar2);
                    }
                }
            }
        }
        if (dqnVar instanceof dqr) {
            return;
        }
        HashSet hashSet2 = dqmVarU2.a;
        if (hashSet2 != null && dqmVarU2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                dqm dqmVar9 = (dqm) it2.next();
                dqn dqnVar3 = dqmVar9.d;
                boolean zC2 = c(dqnVar3);
                if (dqnVar3.T() && zC2) {
                    dqo.al(dqnVar3, dqxVar, new dqw());
                }
                dqm dqmVar10 = dqnVar3.U;
                boolean z2 = (dqmVar9 == dqmVar10 && (dqmVar3 = dqnVar3.W.e) != null && dqmVar3.c) || (dqmVar9 == dqnVar3.W && (dqmVar2 = dqmVar10.e) != null && dqmVar2.c);
                if (dqnVar3.X() != 3 || zC2) {
                    if (dqnVar3.T()) {
                        continue;
                    } else if (dqmVar9 == dqmVar10 && dqnVar3.W.e == null) {
                        int iB3 = dqmVar10.b() + iA2;
                        dqnVar3.A(iB3, dqnVar3.h() + iB3);
                        b(i3, dqnVar3, dqxVar);
                    } else {
                        dqm dqmVar11 = dqnVar3.W;
                        if (dqmVar9 == dqmVar11 && dqmVar10.e == null) {
                            int iB4 = iA2 - dqmVar11.b();
                            dqnVar3.A(iB4 - dqnVar3.h(), iB4);
                            b(i3, dqnVar3, dqxVar);
                        } else if (z2 && !dqnVar3.S()) {
                            g(i3, dqxVar, dqnVar3);
                        }
                    }
                } else if (dqnVar3.X() == 3 && dqnVar3.J >= 0 && dqnVar3.I >= 0 && (dqnVar3.ar == 8 || (dqnVar3.D == 0 && dqnVar3.ah == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dqnVar3.S() && !dqnVar3.Q && z2 && !dqnVar3.S()) {
                        h(i3, dqnVar, dqxVar, dqnVar3);
                    }
                }
            }
        }
        dqm dqmVarU3 = dqnVar.U(6);
        if (dqmVarU3.a != null && dqmVarU3.c) {
            int iA3 = dqmVarU3.a();
            Iterator it3 = dqmVarU3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                dqm dqmVar12 = (dqm) it3.next();
                dqn dqnVar4 = dqmVar12.d;
                boolean zC3 = c(dqnVar4);
                if (dqnVar4.T() && zC3) {
                    dqo.al(dqnVar4, dqxVar, new dqw());
                }
                if (dqnVar4.X() != 3 || zC3) {
                    if (!dqnVar4.T() && dqmVar12 == (dqmVar = dqnVar4.X)) {
                        int iB5 = dqmVar12.b() + iA3;
                        if (dqnVar4.P) {
                            int i5 = iB5 - dqnVar4.al;
                            int i6 = dqnVar4.ag + i5;
                            dqnVar4.ak = i5;
                            dqnVar4.U.f(i5);
                            dqnVar4.W.f(i6);
                            dqmVar.f(iB5);
                            dqnVar4.w = true;
                        }
                        b(i4, dqnVar4, dqxVar);
                    }
                }
            }
        }
        dqnVar.y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.dqn r8) {
        /*
            int r0 = r8.W()
            int r1 = r8.X()
            dqn r2 = r8.ae
            if (r2 == 0) goto Lf
            dqo r2 = (defpackage.dqo) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L15
            r2.W()
        L15:
            if (r2 == 0) goto L1a
            r2.X()
        L1a:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4e
            boolean r7 = r8.e()
            if (r7 != 0) goto L4e
            if (r0 == r2) goto L4e
            if (r0 != r4) goto L3c
            int r0 = r8.C
            if (r0 != 0) goto L40
            float r0 = r8.ah
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r8.P(r5)
            if (r0 != 0) goto L4e
            goto L40
        L3c:
            if (r0 == r4) goto L40
        L3e:
            r0 = r5
            goto L4f
        L40:
            int r0 = r8.C
            if (r0 != r6) goto L3e
            int r0 = r8.j()
            boolean r0 = r8.Q(r5, r0)
            if (r0 == 0) goto L3e
        L4e:
            r0 = r6
        L4f:
            if (r1 == r6) goto L7e
            boolean r7 = r8.f()
            if (r7 != 0) goto L7e
            if (r1 == r2) goto L7e
            if (r1 != r4) goto L6c
            int r1 = r8.D
            if (r1 != 0) goto L70
            float r1 = r8.ah
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L70
            boolean r1 = r8.P(r6)
            if (r1 != 0) goto L7e
            goto L70
        L6c:
            if (r1 == r4) goto L70
        L6e:
            r1 = r5
            goto L7f
        L70:
            int r1 = r8.D
            if (r1 != r6) goto L6e
            int r1 = r8.h()
            boolean r1 = r8.Q(r6, r1)
            if (r1 == 0) goto L6e
        L7e:
            r1 = r6
        L7f:
            float r8 = r8.ah
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8d
            if (r0 != 0) goto L8c
            if (r1 != 0) goto L8c
            r0 = r5
            r1 = r0
            goto L8d
        L8c:
            return r6
        L8d:
            if (r0 == 0) goto L92
            if (r1 == 0) goto L92
            return r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drd.c(dqn):boolean");
    }

    public static void d(dqk dqkVar, dqx dqxVar, int i, boolean z) {
        if (dqkVar.c()) {
            if (i == 0) {
                a(1, dqkVar, dqxVar, z);
            } else {
                b(1, dqkVar, dqxVar);
            }
        }
    }

    private static void e(int i, dqx dqxVar, dqn dqnVar, boolean z) {
        dqm dqmVar = dqnVar.T;
        float f = dqnVar.ao;
        int iA = dqmVar.e.a();
        dqm dqmVar2 = dqnVar.V;
        int iA2 = dqmVar2.e.a();
        int iB = dqmVar.b() + iA;
        int iB2 = iA2 - dqmVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = dqnVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        dqnVar.z(i3, i4);
        a(i + 1, dqnVar, dqxVar, z);
    }

    private static void f(int i, dqn dqnVar, dqx dqxVar, dqn dqnVar2, boolean z) {
        dqm dqmVar = dqnVar2.T;
        float f = dqnVar2.ao;
        int iA = dqmVar.e.a() + dqmVar.b();
        dqm dqmVar2 = dqnVar2.V;
        int iA2 = dqmVar2.e.a() - dqmVar2.b();
        if (iA2 >= iA) {
            int iJ = dqnVar2.j();
            int i2 = iA2 - iA;
            if (dqnVar2.ar != 8) {
                int i3 = dqnVar2.C;
                if (i3 == 2) {
                    iJ = (int) (dqnVar2.ao * 0.5f * (dqnVar instanceof dqo ? dqnVar.j() : dqnVar.ae.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(dqnVar2.F, iJ);
                int i4 = dqnVar2.G;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            dqnVar2.z(i5, iJ + i5);
            a(i + 1, dqnVar2, dqxVar, z);
        }
    }

    private static void g(int i, dqx dqxVar, dqn dqnVar) {
        dqm dqmVar = dqnVar.U;
        float f = dqnVar.ap;
        int iA = dqmVar.e.a();
        dqm dqmVar2 = dqnVar.W;
        int iA2 = dqmVar2.e.a();
        int iB = dqmVar.b() + iA;
        int iB2 = iA2 - dqmVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = dqnVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        dqnVar.A(i4, i5);
        b(i + 1, dqnVar, dqxVar);
    }

    private static void h(int i, dqn dqnVar, dqx dqxVar, dqn dqnVar2) {
        dqm dqmVar = dqnVar2.U;
        float f = dqnVar2.ap;
        int iA = dqmVar.e.a() + dqmVar.b();
        dqm dqmVar2 = dqnVar2.W;
        int iA2 = dqmVar2.e.a() - dqmVar2.b();
        if (iA2 >= iA) {
            int iH = dqnVar2.h();
            int i2 = iA2 - iA;
            if (dqnVar2.ar != 8) {
                int i3 = dqnVar2.D;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (dqnVar instanceof dqo ? dqnVar.h() : dqnVar.ae.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(dqnVar2.I, iH);
                int i4 = dqnVar2.J;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            dqnVar2.A(i5, iH + i5);
            b(i + 1, dqnVar2, dqxVar);
        }
    }
}

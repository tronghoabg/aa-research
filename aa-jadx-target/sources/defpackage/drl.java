package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class drl {
    public static final defpackage.dre a = new defpackage.dre();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, defpackage.dqv dqvVar, defpackage.drf drfVar, boolean z) {
        defpackage.dqu dquVar;
        defpackage.dqu dquVar2;
        float f;
        boolean z2;
        boolean z3;
        defpackage.dqu dquVar3;
        defpackage.dqu dquVar4;
        if (dqvVar.x) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(dqvVar instanceof defpackage.dqw) && dqvVar.T() && c(dqvVar)) {
            defpackage.dqw.al(dqvVar, drfVar, new defpackage.dre());
        }
        defpackage.dqu dquVarU = dqvVar.U(2);
        defpackage.dqu dquVarU2 = dqvVar.U(4);
        int iA = dquVarU.a();
        int iA2 = dquVarU2.a();
        java.util.HashSet<defpackage.dqu> hashSet = dquVarU.a;
        if (hashSet != null && dquVarU.c) {
            for (defpackage.dqu dquVar5 : hashSet) {
                int i2 = i + 1;
                defpackage.dqv dqvVar2 = dquVar5.d;
                boolean zC = c(dqvVar2);
                if (dqvVar2.T() && zC) {
                    f = 0.0f;
                    defpackage.dqw.al(dqvVar2, drfVar, new defpackage.dre());
                } else {
                    f = 0.0f;
                }
                defpackage.dqu dquVar6 = dqvVar2.T;
                if ((dquVar5 == dquVar6 && (dquVar4 = dqvVar2.V.e) != null && dquVar4.c) || (dquVar5 == dqvVar2.V && (dquVar3 = dquVar6.e) != null && dquVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (dqvVar2.W() != 3 || zC) {
                    if (!dqvVar2.T()) {
                        if (dquVar5 == dquVar6 && dqvVar2.V.e == null) {
                            int iB = dquVar6.b() + iA;
                            dqvVar2.z(iB, dqvVar2.j() + iB);
                            a(i2, dqvVar2, drfVar, z);
                        } else {
                            defpackage.dqu dquVar7 = dqvVar2.V;
                            if (dquVar5 == dquVar7 && dquVar6.e == null) {
                                int iB2 = iA - dquVar7.b();
                                dqvVar2.z(iB2 - dqvVar2.j(), iB2);
                                a(i2, dqvVar2, drfVar, z);
                            } else if (z3 && !dqvVar2.R()) {
                                e(i2, drfVar, dqvVar2, z);
                            }
                        }
                    }
                } else if (dqvVar2.W() == 3 && dqvVar2.G >= 0 && dqvVar2.F >= 0 && ((dqvVar2.ar == 8 || (dqvVar2.C == 0 && dqvVar2.ah == f)) && !dqvVar2.R() && !dqvVar2.Q && z3 && !dqvVar2.R())) {
                    f(i2, dqvVar, drfVar, dqvVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (dqvVar instanceof defpackage.dqz) {
            return;
        }
        java.util.HashSet<defpackage.dqu> hashSet2 = dquVarU2.a;
        if (hashSet2 != null && dquVarU2.c) {
            for (defpackage.dqu dquVar8 : hashSet2) {
                int i3 = i + 1;
                defpackage.dqv dqvVar3 = dquVar8.d;
                boolean zC2 = c(dqvVar3);
                if (dqvVar3.T() && zC2) {
                    defpackage.dqw.al(dqvVar3, drfVar, new defpackage.dre());
                }
                defpackage.dqu dquVar9 = dqvVar3.T;
                boolean z6 = ((dquVar8 == dquVar9 && (dquVar2 = dqvVar3.V.e) != null && dquVar2.c) || (dquVar8 == dqvVar3.V && (dquVar = dquVar9.e) != null && dquVar.c)) ? z5 : false;
                if (dqvVar3.W() != 3 || zC2) {
                    if (!dqvVar3.T()) {
                        if (dquVar8 == dquVar9 && dqvVar3.V.e == null) {
                            int iB3 = dquVar9.b() + iA2;
                            dqvVar3.z(iB3, dqvVar3.j() + iB3);
                            a(i3, dqvVar3, drfVar, z);
                        } else {
                            defpackage.dqu dquVar10 = dqvVar3.V;
                            if (dquVar8 == dquVar10 && dquVar9.e == null) {
                                int iB4 = iA2 - dquVar10.b();
                                dqvVar3.z(iB4 - dqvVar3.j(), iB4);
                                a(i3, dqvVar3, drfVar, z);
                            } else if (z6 && !dqvVar3.R()) {
                                e(i3, drfVar, dqvVar3, z);
                            }
                        }
                    }
                } else if (dqvVar3.W() == 3 && dqvVar3.G >= 0 && dqvVar3.F >= 0 && (dqvVar3.ar == 8 || (dqvVar3.C == 0 && dqvVar3.ah == 0.0f))) {
                    if (!dqvVar3.R() && !dqvVar3.Q && z6 && !dqvVar3.R()) {
                        f(i3, dqvVar, drfVar, dqvVar3, z);
                    }
                }
            }
        }
        dqvVar.x = z5;
    }

    public static void b(int i, defpackage.dqv dqvVar, defpackage.drf drfVar) {
        defpackage.dqu dquVar;
        defpackage.dqu dquVar2;
        defpackage.dqu dquVar3;
        defpackage.dqu dquVar4;
        defpackage.dqu dquVar5;
        if (dqvVar.y) {
            return;
        }
        c++;
        if (!(dqvVar instanceof defpackage.dqw) && dqvVar.T() && c(dqvVar)) {
            defpackage.dqw.al(dqvVar, drfVar, new defpackage.dre());
        }
        defpackage.dqu dquVarU = dqvVar.U(3);
        defpackage.dqu dquVarU2 = dqvVar.U(5);
        int iA = dquVarU.a();
        int iA2 = dquVarU2.a();
        java.util.HashSet<defpackage.dqu> hashSet = dquVarU.a;
        if (hashSet != null && dquVarU.c) {
            for (defpackage.dqu dquVar6 : hashSet) {
                int i2 = i + 1;
                defpackage.dqv dqvVar2 = dquVar6.d;
                boolean zC = c(dqvVar2);
                if (dqvVar2.T() && zC) {
                    defpackage.dqw.al(dqvVar2, drfVar, new defpackage.dre());
                }
                defpackage.dqu dquVar7 = dqvVar2.U;
                boolean z = (dquVar6 == dquVar7 && (dquVar5 = dqvVar2.W.e) != null && dquVar5.c) || (dquVar6 == dqvVar2.W && (dquVar4 = dquVar7.e) != null && dquVar4.c);
                if (dqvVar2.X() != 3 || zC) {
                    if (!dqvVar2.T()) {
                        if (dquVar6 == dquVar7 && dqvVar2.W.e == null) {
                            int iB = dquVar7.b() + iA;
                            dqvVar2.A(iB, dqvVar2.h() + iB);
                            b(i2, dqvVar2, drfVar);
                        } else {
                            defpackage.dqu dquVar8 = dqvVar2.W;
                            if (dquVar6 == dquVar8 && dquVar7.e == null) {
                                int iB2 = iA - dquVar8.b();
                                dqvVar2.A(iB2 - dqvVar2.h(), iB2);
                                b(i2, dqvVar2, drfVar);
                            } else if (z && !dqvVar2.S()) {
                                g(i2, drfVar, dqvVar2);
                            }
                        }
                    }
                } else if (dqvVar2.X() == 3 && dqvVar2.J >= 0 && dqvVar2.I >= 0 && (dqvVar2.ar == 8 || (dqvVar2.D == 0 && dqvVar2.ah == 0.0f))) {
                    if (!dqvVar2.S() && !dqvVar2.Q && z && !dqvVar2.S()) {
                        h(i2, dqvVar, drfVar, dqvVar2);
                    }
                }
            }
        }
        if (dqvVar instanceof defpackage.dqz) {
            return;
        }
        java.util.HashSet<defpackage.dqu> hashSet2 = dquVarU2.a;
        if (hashSet2 != null && dquVarU2.c) {
            for (defpackage.dqu dquVar9 : hashSet2) {
                int i3 = i + 1;
                defpackage.dqv dqvVar3 = dquVar9.d;
                boolean zC2 = c(dqvVar3);
                if (dqvVar3.T() && zC2) {
                    defpackage.dqw.al(dqvVar3, drfVar, new defpackage.dre());
                }
                defpackage.dqu dquVar10 = dqvVar3.U;
                boolean z2 = (dquVar9 == dquVar10 && (dquVar3 = dqvVar3.W.e) != null && dquVar3.c) || (dquVar9 == dqvVar3.W && (dquVar2 = dquVar10.e) != null && dquVar2.c);
                if (dqvVar3.X() != 3 || zC2) {
                    if (dqvVar3.T()) {
                        continue;
                    } else if (dquVar9 == dquVar10 && dqvVar3.W.e == null) {
                        int iB3 = dquVar10.b() + iA2;
                        dqvVar3.A(iB3, dqvVar3.h() + iB3);
                        b(i3, dqvVar3, drfVar);
                    } else {
                        defpackage.dqu dquVar11 = dqvVar3.W;
                        if (dquVar9 == dquVar11 && dquVar10.e == null) {
                            int iB4 = iA2 - dquVar11.b();
                            dqvVar3.A(iB4 - dqvVar3.h(), iB4);
                            b(i3, dqvVar3, drfVar);
                        } else if (z2 && !dqvVar3.S()) {
                            g(i3, drfVar, dqvVar3);
                        }
                    }
                } else if (dqvVar3.X() == 3 && dqvVar3.J >= 0 && dqvVar3.I >= 0 && (dqvVar3.ar == 8 || (dqvVar3.D == 0 && dqvVar3.ah == 0.0f))) {
                    if (!dqvVar3.S() && !dqvVar3.Q && z2 && !dqvVar3.S()) {
                        h(i3, dqvVar, drfVar, dqvVar3);
                    }
                }
            }
        }
        defpackage.dqu dquVarU3 = dqvVar.U(6);
        if (dquVarU3.a != null && dquVarU3.c) {
            int iA3 = dquVarU3.a();
            for (defpackage.dqu dquVar12 : dquVarU3.a) {
                int i4 = i + 1;
                defpackage.dqv dqvVar4 = dquVar12.d;
                boolean zC3 = c(dqvVar4);
                if (dqvVar4.T() && zC3) {
                    defpackage.dqw.al(dqvVar4, drfVar, new defpackage.dre());
                }
                if (dqvVar4.X() != 3 || zC3) {
                    if (!dqvVar4.T() && dquVar12 == (dquVar = dqvVar4.X)) {
                        int iB5 = dquVar12.b() + iA3;
                        if (dqvVar4.P) {
                            int i5 = iB5 - dqvVar4.al;
                            int i6 = dqvVar4.ag + i5;
                            dqvVar4.ak = i5;
                            dqvVar4.U.f(i5);
                            dqvVar4.W.f(i6);
                            dquVar.f(iB5);
                            dqvVar4.w = true;
                        }
                        b(i4, dqvVar4, drfVar);
                    }
                }
            }
        }
        dqvVar.y = true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    public static boolean c(defpackage.dqv dqvVar) {
        boolean z;
        boolean z2;
        int iW = dqvVar.W();
        int iX = dqvVar.X();
        defpackage.dqv dqvVar2 = dqvVar.ae;
        defpackage.dqw dqwVar = dqvVar2 != null ? (defpackage.dqw) dqvVar2 : null;
        if (dqwVar != null) {
            dqwVar.W();
        }
        if (dqwVar != null) {
            dqwVar.X();
        }
        if (iW == 1 || dqvVar.e() || iW == 2) {
            z = true;
        } else {
            if (iW == 3) {
                if (dqvVar.C != 0 || dqvVar.ah != 0.0f || !dqvVar.P(0)) {
                }
                z = true;
            } else {
                if (iW == 3) {
                }
                z = false;
            }
            if (dqvVar.C == 1 && dqvVar.Q(0, dqvVar.j())) {
                z = true;
            } else {
                z = false;
            }
        }
        if (iX == 1 || dqvVar.f() || iX == 2) {
            z2 = true;
        } else {
            if (iX == 3) {
                if (dqvVar.D != 0 || dqvVar.ah != 0.0f || !dqvVar.P(1)) {
                }
                z2 = true;
            } else {
                if (iX == 3) {
                }
                z2 = false;
            }
            if (dqvVar.D == 1 && dqvVar.Q(1, dqvVar.h())) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (dqvVar.ah > 0.0f) {
            if (z || z2) {
                return true;
            }
            z = false;
            z2 = false;
        }
        return z && z2;
    }

    public static void d(defpackage.dqs dqsVar, defpackage.drf drfVar, int i, boolean z) {
        if (dqsVar.c()) {
            if (i == 0) {
                a(1, dqsVar, drfVar, z);
            } else {
                b(1, dqsVar, drfVar);
            }
        }
    }

    private static void e(int i, defpackage.drf drfVar, defpackage.dqv dqvVar, boolean z) {
        defpackage.dqu dquVar = dqvVar.T;
        float f = dqvVar.ao;
        int iA = dquVar.e.a();
        defpackage.dqu dquVar2 = dqvVar.V;
        int iA2 = dquVar2.e.a();
        int iB = dquVar.b() + iA;
        int iB2 = iA2 - dquVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = dqvVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        dqvVar.z(i3, i4);
        a(i + 1, dqvVar, drfVar, z);
    }

    private static void f(int i, defpackage.dqv dqvVar, defpackage.drf drfVar, defpackage.dqv dqvVar2, boolean z) {
        defpackage.dqu dquVar = dqvVar2.T;
        float f = dqvVar2.ao;
        int iA = dquVar.e.a() + dquVar.b();
        defpackage.dqu dquVar2 = dqvVar2.V;
        int iA2 = dquVar2.e.a() - dquVar2.b();
        if (iA2 >= iA) {
            int iJ = dqvVar2.j();
            int i2 = iA2 - iA;
            if (dqvVar2.ar != 8) {
                int i3 = dqvVar2.C;
                if (i3 == 2) {
                    iJ = (int) (dqvVar2.ao * 0.5f * (dqvVar instanceof defpackage.dqw ? dqvVar.j() : dqvVar.ae.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = java.lang.Math.max(dqvVar2.F, iJ);
                int i4 = dqvVar2.G;
                if (i4 > 0) {
                    iJ = java.lang.Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            dqvVar2.z(i5, iJ + i5);
            a(i + 1, dqvVar2, drfVar, z);
        }
    }

    private static void g(int i, defpackage.drf drfVar, defpackage.dqv dqvVar) {
        defpackage.dqu dquVar = dqvVar.U;
        float f = dqvVar.ap;
        int iA = dquVar.e.a();
        defpackage.dqu dquVar2 = dqvVar.W;
        int iA2 = dquVar2.e.a();
        int iB = dquVar.b() + iA;
        int iB2 = iA2 - dquVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = dqvVar.h();
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
        dqvVar.A(i4, i5);
        b(i + 1, dqvVar, drfVar);
    }

    private static void h(int i, defpackage.dqv dqvVar, defpackage.drf drfVar, defpackage.dqv dqvVar2) {
        defpackage.dqu dquVar = dqvVar2.U;
        float f = dqvVar2.ap;
        int iA = dquVar.e.a() + dquVar.b();
        defpackage.dqu dquVar2 = dqvVar2.W;
        int iA2 = dquVar2.e.a() - dquVar2.b();
        if (iA2 >= iA) {
            int iH = dqvVar2.h();
            int i2 = iA2 - iA;
            if (dqvVar2.ar != 8) {
                int i3 = dqvVar2.D;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (dqvVar instanceof defpackage.dqw ? dqvVar.h() : dqvVar.ae.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = java.lang.Math.max(dqvVar2.I, iH);
                int i4 = dqvVar2.J;
                if (i4 > 0) {
                    iH = java.lang.Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            dqvVar2.A(i5, iH + i5);
            b(i + 1, dqvVar2, drfVar);
        }
    }
}

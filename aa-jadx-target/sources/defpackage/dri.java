package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dri {
    public final defpackage.dqw a;
    public final defpackage.dqw d;
    public defpackage.drf f;
    final java.util.ArrayList g;
    private final defpackage.dre h;
    public boolean b = true;
    public boolean c = true;
    public final java.util.ArrayList e = new java.util.ArrayList();

    public dri(defpackage.dqw dqwVar) {
        new java.util.ArrayList();
        this.f = null;
        this.h = new defpackage.dre();
        this.g = new java.util.ArrayList();
        this.a = dqwVar;
        this.d = dqwVar;
    }

    private final void e(defpackage.drr drrVar, int i, java.util.ArrayList arrayList) {
        drj drjVar = drrVar.h;
        for (defpackage.drh drhVar : drjVar.j) {
            if (drhVar instanceof drj) {
                g((drj) drhVar, i, drrVar.i, arrayList, null);
            } else if (drhVar instanceof defpackage.drr) {
                g(((defpackage.drr) drhVar).h, i, drrVar.i, arrayList, null);
            }
        }
        for (defpackage.drh drhVar2 : drrVar.i.j) {
            if (drhVar2 instanceof drj) {
                g((drj) drhVar2, i, drjVar, arrayList, null);
            } else if (drhVar2 instanceof defpackage.drr) {
                g(((defpackage.drr) drhVar2).i, i, drjVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (defpackage.drh drhVar3 : ((drp) drrVar).a.j) {
                if (drhVar3 instanceof drj) {
                    g((drj) drhVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(defpackage.dqv dqvVar, int i, int i2, int i3, int i4) {
        defpackage.dre dreVar = this.h;
        dreVar.i = i;
        dreVar.j = i3;
        dreVar.a = i2;
        dreVar.b = i4;
        this.f.b(dqvVar, dreVar);
        dqvVar.M(dreVar.c);
        dqvVar.B(dreVar.d);
        dqvVar.P = dreVar.f;
        dqvVar.x(dreVar.e);
    }

    private final void g(drj drjVar, int i, drj drjVar2, java.util.ArrayList arrayList, ss ssVar) {
        drp drpVar = drjVar.d;
        if (drpVar.l == null) {
            defpackage.dqw dqwVar = this.a;
            if (drpVar == dqwVar.o || drpVar == dqwVar.p) {
                return;
            }
            if (ssVar == null) {
                ssVar = new ss(drpVar);
                arrayList.add(ssVar);
            }
            ss ssVar2 = ssVar;
            drpVar.l = ssVar2;
            ((java.util.ArrayList) ssVar2.a).add(drpVar);
            drj drjVar3 = drpVar.h;
            for (defpackage.drh drhVar : drjVar3.j) {
                if (drhVar instanceof drj) {
                    g((drj) drhVar, i, drjVar2, arrayList, ssVar2);
                }
            }
            drj drjVar4 = drpVar.i;
            for (defpackage.drh drhVar2 : drjVar4.j) {
                if (drhVar2 instanceof drj) {
                    g((drj) drhVar2, i, drjVar2, arrayList, ssVar2);
                }
            }
            if (i == 1 && (drpVar instanceof drp)) {
                for (defpackage.drh drhVar3 : drpVar.a.j) {
                    if (drhVar3 instanceof drj) {
                        g((drj) drhVar3, 1, drjVar2, arrayList, ssVar2);
                    }
                }
            }
            java.util.Iterator it = drjVar3.k.iterator();
            while (it.hasNext()) {
                g((drj) it.next(), i, drjVar2, arrayList, ssVar2);
            }
            java.util.Iterator it2 = drjVar4.k.iterator();
            while (it2.hasNext()) {
                g((drj) it2.next(), i, drjVar2, arrayList, ssVar2);
            }
            if (i == 1 && (drpVar instanceof drp)) {
                java.util.Iterator it3 = drpVar.a.k.iterator();
                while (it3.hasNext()) {
                    g((drj) it3.next(), 1, drjVar2, arrayList, ssVar2);
                }
            }
        }
    }

    public final int a(defpackage.dqw dqwVar, int i) {
        java.util.ArrayList arrayList;
        long jA;
        java.util.ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            ss ssVar = (ss) arrayList2.get(i2);
            java.lang.Object obj = ssVar.b;
            if (!(obj instanceof drg) ? !(i != 0 ? (obj instanceof drp) : (obj instanceof dro)) : ((drg) obj).f != i) {
                drj drjVar = i == 0 ? dqwVar.o.h : dqwVar.p.h;
                drj drjVar2 = i == 0 ? dqwVar.o.i : dqwVar.p.i;
                boolean zContains = ((defpackage.drr) obj).h.k.contains(drjVar);
                boolean zContains2 = ((defpackage.drr) ssVar.b).i.k.contains(drjVar2);
                long jA2 = ((defpackage.drr) ssVar.b).a();
                if (zContains && zContains2) {
                    long jB = ssVar.b(((defpackage.drr) ssVar.b).h, j);
                    long jA3 = ssVar.a(((defpackage.drr) ssVar.b).i, j);
                    long j2 = jB - jA2;
                    defpackage.drr drrVar = (defpackage.drr) ssVar.b;
                    int i3 = drrVar.i.e;
                    arrayList = arrayList2;
                    long j3 = i3;
                    if (j2 >= (-i3)) {
                        j2 += j3;
                    }
                    long j4 = (-jA3) - jA2;
                    long j5 = drrVar.h.e;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    defpackage.dqv dqvVar = drrVar.d;
                    float f = i == 0 ? dqvVar.ao : dqvVar.ap;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j6 / f) + (j2 / f2)) : 0L;
                    jA = (j5 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        drj drjVar3 = ((defpackage.drr) ssVar.b).h;
                        jA = java.lang.Math.max(ssVar.b(drjVar3, drjVar3.e), ((long) ((defpackage.drr) ssVar.b).h.e) + jA2);
                    } else if (zContains2) {
                        drj drjVar4 = ((defpackage.drr) ssVar.b).i;
                        jA = java.lang.Math.max(-ssVar.a(drjVar4, drjVar4.e), ((long) (-((defpackage.drr) ssVar.b).i.e)) + jA2);
                    } else {
                        defpackage.drr drrVar2 = (defpackage.drr) ssVar.b;
                        jA = (((long) drrVar2.h.e) + drrVar2.a()) - ((long) ((defpackage.drr) ssVar.b).i.e);
                    }
                }
            } else {
                jA = j;
                arrayList = arrayList2;
            }
            jMax = java.lang.Math.max(jMax, jA);
            i2++;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        java.util.ArrayList arrayList = this.e;
        arrayList.clear();
        defpackage.dqw dqwVar = this.d;
        dqwVar.o.d();
        dqwVar.p.d();
        arrayList.add(dqwVar.o);
        arrayList.add(dqwVar.p);
        java.util.ArrayList arrayList2 = dqwVar.aL;
        int size = arrayList2.size();
        java.util.HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            defpackage.dqv dqvVar = (defpackage.dqv) arrayList2.get(i);
            if (dqvVar instanceof defpackage.dqz) {
                arrayList.add(new drm(dqvVar));
            } else {
                if (dqvVar.R()) {
                    if (dqvVar.m == null) {
                        dqvVar.m = new drg(dqvVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(dqvVar.m);
                } else {
                    arrayList.add(dqvVar.o);
                }
                if (dqvVar.S()) {
                    if (dqvVar.n == null) {
                        dqvVar.n = new drg(dqvVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(dqvVar.n);
                } else {
                    arrayList.add(dqvVar.p);
                }
                if (dqvVar instanceof defpackage.dra) {
                    arrayList.add(new drn(dqvVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.drr) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            defpackage.drr drrVar = (defpackage.drr) arrayList.get(i3);
            if (drrVar.d != dqwVar) {
                drrVar.b();
            }
        }
        java.util.ArrayList arrayList3 = this.g;
        arrayList3.clear();
        ss.c = 0;
        defpackage.dqw dqwVar2 = this.a;
        e(dqwVar2.o, 0, arrayList3);
        e(dqwVar2.p, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        defpackage.dri driVar;
        drk drkVar;
        java.util.ArrayList arrayList = this.a.aL;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            defpackage.dqv dqvVar = (defpackage.dqv) arrayList.get(i2);
            if (dqvVar.l) {
                driVar = this;
            } else {
                int[] iArr = dqvVar.aA;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dqvVar.C;
                int i6 = dqvVar.D;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                drk drkVar2 = dqvVar.o.e;
                boolean z3 = drkVar2.i;
                drk drkVar3 = dqvVar.p.e;
                boolean z4 = drkVar3.i;
                if (z3 && z4) {
                    driVar = this;
                    driVar.f(dqvVar, 1, drkVar2.f, 1, drkVar3.f);
                    dqvVar.l = true;
                } else {
                    if (z3 && z2) {
                        this.f(dqvVar, 1, drkVar2.f, 2, drkVar3.f);
                        if (i4 == 3) {
                            dqvVar.p.e.m = dqvVar.h();
                        } else {
                            dqvVar.p.e.c(dqvVar.h());
                            dqvVar.l = true;
                        }
                    } else if (z4 && z) {
                        driVar = this;
                        driVar.f(dqvVar, 2, drkVar2.f, 1, drkVar3.f);
                        if (i == 3) {
                            dqvVar.o.e.m = dqvVar.j();
                        } else {
                            dqvVar.o.e.c(dqvVar.j());
                            dqvVar.l = true;
                        }
                    }
                    driVar = this;
                }
                if (dqvVar.l && (drkVar = dqvVar.p.b) != null) {
                    drkVar.c(dqvVar.al);
                }
            }
            i2++;
            this = driVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0300 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[PHI: r6
  0x00b1: PHI (r6v5 int) = (r6v3 int), (r6v2 int) binds: [B:56:0x00ad, B:52:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a A[ADDED_TO_REGION] */
    public final void d(defpackage.dqw dqwVar) {
        char c;
        int iJ;
        int i;
        int iH;
        int i2;
        float f;
        java.util.ArrayList arrayList = dqwVar.aL;
        int size = arrayList.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            defpackage.dqv dqvVar = (defpackage.dqv) arrayList.get(i3);
            int[] iArr = dqvVar.aA;
            int i4 = iArr[c2];
            int i5 = iArr[1];
            if (dqvVar.ar == 8) {
                dqvVar.l = true;
                c = c2;
            } else {
                float f2 = dqvVar.H;
                int i6 = 2;
                if (f2 < 1.0f && i4 == 3) {
                    dqvVar.C = 2;
                    i4 = 3;
                }
                float f3 = dqvVar.K;
                if (f3 < 1.0f && i5 == 3) {
                    dqvVar.D = 2;
                    i5 = 3;
                }
                if (dqvVar.ah > 0.0f) {
                    if (i4 == 3 && (i5 == 2 || i5 == 1)) {
                        dqvVar.C = 3;
                    } else if (i5 == 3 && (i4 == 2 || i4 == 1)) {
                        dqvVar.D = 3;
                    } else if (i4 == 3 && i5 == 3) {
                        if (dqvVar.C == 0) {
                            dqvVar.C = 3;
                        }
                        if (dqvVar.D == 0) {
                            dqvVar.D = 3;
                        }
                    }
                }
                if (i4 == 3 && dqvVar.C == 1 && (dqvVar.T.e == null || dqvVar.V.e == null)) {
                    i4 = 2;
                }
                if (i5 == 3 && dqvVar.D == 1 && (dqvVar.U.e == null || dqvVar.W.e == null)) {
                    i5 = 2;
                }
                dro droVar = dqvVar.o;
                droVar.j = i4;
                int i7 = dqvVar.C;
                droVar.c = i7;
                drp drpVar = dqvVar.p;
                drpVar.j = i5;
                c = c2;
                int i8 = dqvVar.D;
                drpVar.c = i8;
                if (i4 == 4 || i4 == 1) {
                    if (i5 != 4 || i5 == 1) {
                        i6 = i5;
                    } else if (i5 != 2) {
                        if (i4 != 3 && (i5 == 2 || i5 == 1)) {
                            if (i7 == 3) {
                                if (i5 == 2) {
                                    f(dqvVar, 2, 0, 2, 0);
                                }
                                int iH2 = dqvVar.h();
                                f(dqvVar, 1, (int) ((iH2 * dqvVar.ah) + 0.5f), 1, iH2);
                                dqvVar.o.e.c(dqvVar.j());
                                dqvVar.p.e.c(dqvVar.h());
                                dqvVar.l = true;
                            } else if (i7 == 1) {
                                f(dqvVar, 2, 0, i5, 0);
                                dqvVar.o.e.m = dqvVar.j();
                            } else if (i7 == 2) {
                                int i9 = dqwVar.aA[c];
                                if (i9 == 1 || i9 == 4) {
                                    f(dqvVar, 1, (int) ((f2 * dqwVar.j()) + 0.5f), i5, dqvVar.h());
                                    dqvVar.o.e.c(dqvVar.j());
                                    dqvVar.p.e.c(dqvVar.h());
                                    dqvVar.l = true;
                                }
                            } else {
                                defpackage.dqu[] dquVarArr = dqvVar.ab;
                                if (dquVarArr[c].e == null || dquVarArr[1].e == null) {
                                    f(dqvVar, 2, 0, i5, 0);
                                    dqvVar.o.e.c(dqvVar.j());
                                    dqvVar.p.e.c(dqvVar.h());
                                    dqvVar.l = true;
                                }
                            }
                        }
                        if (i5 == 3 || !(i4 == 2 || i4 == 1)) {
                            i2 = i4;
                            f = f2;
                        } else if (i8 == 3) {
                            if (i4 == 2) {
                                f(dqvVar, 2, 0, 2, 0);
                            }
                            int iJ2 = dqvVar.j();
                            float f4 = dqvVar.ah;
                            if (dqvVar.ai == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(dqvVar, 1, iJ2, 1, (int) ((iJ2 * f4) + 0.5f));
                            dqvVar.o.e.c(dqvVar.j());
                            dqvVar.p.e.c(dqvVar.h());
                            dqvVar.l = true;
                        } else if (i8 == 1) {
                            f(dqvVar, i4, 0, 2, 0);
                            dqvVar.p.e.m = dqvVar.h();
                        } else {
                            i2 = i4;
                            f = f2;
                            if (i8 == 2) {
                                int i10 = dqwVar.aA[1];
                                if (i10 == 1 || i10 == 4) {
                                    f(dqvVar, i2, dqvVar.j(), 1, (int) ((dqwVar.h() * f3) + 0.5f));
                                    dqvVar.o.e.c(dqvVar.j());
                                    dqvVar.p.e.c(dqvVar.h());
                                    dqvVar.l = true;
                                }
                            } else {
                                defpackage.dqu[] dquVarArr2 = dqvVar.ab;
                                if (dquVarArr2[2].e == null || dquVarArr2[3].e == null) {
                                    f(dqvVar, 2, 0, 3, 0);
                                    dqvVar.o.e.c(dqvVar.j());
                                    dqvVar.p.e.c(dqvVar.h());
                                    dqvVar.l = true;
                                } else if (i2 != 3 && i5 == 3) {
                                    if (i7 == 1 || i8 == 1) {
                                        f(dqvVar, 2, 0, 2, 0);
                                        dqvVar.o.e.m = dqvVar.j();
                                        dqvVar.p.e.m = dqvVar.h();
                                    } else if (i8 == 2 && i7 == 2) {
                                        int[] iArr2 = dqwVar.aA;
                                        if (iArr2[c] == 1 && iArr2[1] == 1) {
                                            f(dqvVar, 1, (int) ((f * dqwVar.j()) + 0.5f), 1, (int) ((f3 * dqwVar.h()) + 0.5f));
                                            dqvVar.o.e.c(dqvVar.j());
                                            dqvVar.p.e.c(dqvVar.h());
                                            dqvVar.l = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (i2 != 3) {
                        }
                    }
                    iJ = dqvVar.j();
                    if (i4 == 4) {
                        iJ = (dqwVar.j() - dqvVar.T.f) - dqvVar.V.f;
                        i = 1;
                    } else {
                        i = i4;
                    }
                    int i11 = iJ;
                    iH = dqvVar.h();
                    if (i6 == 4) {
                        iH = (dqwVar.h() - dqvVar.U.f) - dqvVar.W.f;
                        i6 = 1;
                    }
                    f(dqvVar, i, i11, i6, iH);
                    dqvVar.o.e.c(dqvVar.j());
                    dqvVar.p.e.c(dqvVar.h());
                    dqvVar.l = true;
                } else if (i4 == 2) {
                    i4 = 2;
                    if (i5 != 4) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                    iJ = dqvVar.j();
                    if (i4 == 4) {
                        iJ = (dqwVar.j() - dqvVar.T.f) - dqvVar.V.f;
                        i = 1;
                    } else {
                        i = i4;
                    }
                    int i12 = iJ;
                    iH = dqvVar.h();
                    if (i6 == 4) {
                        iH = (dqwVar.h() - dqvVar.U.f) - dqvVar.W.f;
                        i6 = 1;
                    }
                    f(dqvVar, i, i12, i6, iH);
                    dqvVar.o.e.c(dqvVar.j());
                    dqvVar.p.e.c(dqvVar.h());
                    dqvVar.l = true;
                } else if (i4 != 3) {
                    if (i5 == 3) {
                        i2 = i4;
                        f = f2;
                        if (i2 != 3) {
                        }
                    } else {
                        i2 = i4;
                        f = f2;
                        if (i2 != 3) {
                        }
                    }
                } else if (i5 == 3) {
                    i2 = i4;
                    f = f2;
                    if (i2 != 3) {
                    }
                } else {
                    i2 = i4;
                    f = f2;
                    if (i2 != 3) {
                    }
                }
            }
            i3++;
            c2 = c;
        }
    }
}

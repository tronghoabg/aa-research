package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bal implements defpackage.azx {
    public boolean a;
    public long b;
    public long c;
    public boolean d;
    final /* synthetic */ defpackage.skd e;
    private final int f;
    private final defpackage.affc g;
    private defpackage.dlm h;
    private defpackage.cvk i;
    private defpackage.cvj j;
    private boolean k;
    private boolean l;
    private java.lang.Object m;
    private boolean n;
    private defpackage.bak o;
    private boolean p;
    private long q;
    private final defpackage.epq r;

    public bal(defpackage.skd skdVar, int i, defpackage.epq epqVar, defpackage.affc affcVar) {
        this.e = skdVar;
        this.f = i;
        this.r = epqVar;
        this.g = affcVar;
        long j = aitt.a;
        this.q = java.lang.System.nanoTime() - aitt.a;
    }

    private final void f() {
        defpackage.cvj cvjVar = this.j;
        if (cvjVar != null) {
            cvjVar.b();
        }
        this.j = null;
        defpackage.cvk cvkVar = this.i;
        if (cvkVar != null) {
            cvkVar.b();
        }
        this.i = null;
        this.o = null;
    }

    private final boolean g() {
        if (this.l) {
            return true;
        }
        defpackage.cvj cvjVar = this.j;
        return cvjVar != null && cvjVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:104:0x0201 A[LOOP:3: B:91:0x01d8->B:104:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f0  */
    /* JADX WARN: Type inference failed for: r5v2, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [azm, java.lang.Object] */
    private final boolean h(defpackage.ayh ayhVar) {
        java.util.List list;
        defpackage.bal balVar;
        defpackage.bal balVar2;
        java.util.List list2;
        boolean z;
        defpackage.ctt cttVar;
        int i = this.f;
        defpackage.vx.c("compose:lazy:prefetch:execute:item", i);
        defpackage.skd skdVar = this.e;
        java.lang.Object obj = skdVar.a;
        ?? Invoke = ((defpackage.ngb) obj).c.invoke();
        if (!this.a) {
            int iB = Invoke.b();
            if (i >= 0 && i < iB) {
                java.lang.Object objD = Invoke.d(i);
                java.lang.Object obj2 = this.m;
                if (obj2 != null && !defpackage.afga.f(objD, obj2)) {
                    f();
                    return false;
                }
                java.lang.Object objC = Invoke.c(i);
                defpackage.epq epqVar = this.r;
                java.lang.Object obj3 = epqVar.a;
                if (epqVar.b != objC || obj3 == null) {
                    defpackage.aau aauVar = (defpackage.aau) epqVar.c;
                    java.lang.Object objA = aauVar.a(objC);
                    if (objA == null) {
                        objA = new defpackage.ayj();
                        aauVar.m(objC, objA);
                    }
                    obj3 = (defpackage.ayj) objA;
                    epqVar.b = objC;
                    epqVar.a = obj3;
                }
                g();
                long jA = ayhVar.a();
                this.b = jA;
                long j = aitt.a;
                this.q = java.lang.System.nanoTime() - aitt.a;
                this.c = 0L;
                defpackage.vx.c("compose:lazy:prefetch:available_time_nanos", jA);
                if (!g()) {
                    defpackage.ayj ayjVar = (defpackage.ayj) obj3;
                    if (d(this.b, ayjVar.a + ayjVar.b)) {
                        defpackage.cvj cvjVar = this.j;
                        if (cvjVar == null) {
                            defpackage.affg affgVarZ = ((defpackage.ngb) obj).z(i, objD, objC);
                            defpackage.ctu ctuVarA = ((defpackage.cvl) skdVar.d).a();
                            if (ctuVarA.a.am()) {
                                ctuVarA.m(objD, affgVarZ, true);
                                z = false;
                                cttVar = new defpackage.ctt(ctuVarA, objD, 0);
                            } else {
                                cttVar = new defpackage.ctt(ctuVarA, objD, 1);
                                z = false;
                            }
                            cvjVar = cttVar;
                            this.j = cvjVar;
                            this.m = objD;
                        } else {
                            z = false;
                        }
                        this.d = z;
                        while (!cvjVar.c() && !this.d) {
                            final defpackage.ayj ayjVar2 = (defpackage.ayj) obj3;
                            cvjVar.d(new defpackage.byc() { // from class: baj
                                @Override // defpackage.byc
                                public final boolean a() {
                                    defpackage.bal balVar3 = this.a;
                                    if (balVar3.d) {
                                        return true;
                                    }
                                    defpackage.ayj ayjVar3 = ayjVar2;
                                    balVar3.c();
                                    ayjVar3.a(balVar3.c);
                                    boolean z2 = !balVar3.d(balVar3.b, ayjVar3.a + ayjVar3.b);
                                    balVar3.d = z2;
                                    return z2;
                                }
                            });
                        }
                        c();
                        boolean z2 = this.d;
                        long j2 = this.c;
                        if (z2) {
                            ((defpackage.ayj) obj3).b = defpackage.ayj.b(j2, ((defpackage.ayj) obj3).b);
                        } else {
                            ((defpackage.ayj) obj3).a(j2);
                        }
                    }
                    if (!g()) {
                        return true;
                    }
                }
                defpackage.cvj cvjVar2 = this.j;
                if (cvjVar2 != null) {
                    defpackage.ayj ayjVar3 = (defpackage.ayj) obj3;
                    if (!d(this.b, ayjVar3.c)) {
                        return true;
                    }
                    this.i = cvjVar2.a();
                    this.j = null;
                    this.l = true;
                    c();
                    ayjVar3.c = defpackage.ayj.b(this.c, ayjVar3.c);
                }
                if (!this.n) {
                    if (this.b <= r12) {
                        return true;
                    }
                    defpackage.cvk cvkVar = this.i;
                    if (cvkVar == null) {
                        defpackage.asq.a("Should precompose before resolving nested prefetch states");
                        throw new defpackage.afap();
                    }
                    defpackage.afgv afgvVar = new defpackage.afgv();
                    cvkVar.d(new defpackage.aun(afgvVar, 20));
                    java.util.List list3 = (java.util.List) afgvVar.a;
                    this.o = list3 != null ? new defpackage.bak(this, list3) : null;
                    this.n = true;
                }
                defpackage.bak bakVar = this.o;
                if (bakVar != null) {
                    int i2 = ((defpackage.ayj) obj3).e;
                    boolean z3 = this.p;
                    int i3 = bakVar.c;
                    java.util.List list4 = bakVar.a;
                    if (i3 < list4.size()) {
                        if (bakVar.f.a) {
                            defpackage.asq.d("Should not execute nested prefetch on canceled request");
                        }
                        int size = list4.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((defpackage.azy) list4.get(i4)).b = i2;
                        }
                        while (bakVar.c < list4.size()) {
                            java.util.List[] listArr = bakVar.b;
                            if (listArr[bakVar.c] != null) {
                                list = listArr[bakVar.c];
                                list.getClass();
                                while (bakVar.d < list.size()) {
                                    balVar = (defpackage.bal) list.get(bakVar.d);
                                    if (z3) {
                                        if (true != (balVar instanceof defpackage.bal)) {
                                            balVar2 = null;
                                        } else {
                                            balVar2 = balVar;
                                        }
                                        if (balVar2 != null) {
                                            balVar2.b();
                                        }
                                    }
                                    bakVar.e = true;
                                    if (balVar.e(ayhVar)) {
                                        bakVar.d++;
                                    }
                                }
                                bakVar.d = 0;
                                bakVar.c++;
                            } else if (ayhVar.a() > r12) {
                                int i5 = bakVar.c;
                                defpackage.azy azyVar = (defpackage.azy) list4.get(i5);
                                defpackage.affc affcVar = azyVar.a;
                                if (affcVar == null) {
                                    list2 = defpackage.afce.a;
                                } else {
                                    defpackage.azw azwVar = new defpackage.azw(azyVar, azyVar.b);
                                    affcVar.invoke(azwVar);
                                    java.util.List list5 = azwVar.b;
                                    azyVar.d = list5.size();
                                    list2 = list5;
                                }
                                listArr[i5] = list2;
                                list = listArr[bakVar.c];
                                list.getClass();
                                while (bakVar.d < list.size()) {
                                    balVar = (defpackage.bal) list.get(bakVar.d);
                                    if (z3) {
                                        if (true != (balVar instanceof defpackage.bal)) {
                                            balVar2 = null;
                                        } else {
                                            balVar2 = balVar;
                                        }
                                        if (balVar2 != null) {
                                            balVar2.b();
                                        }
                                    }
                                    bakVar.e = true;
                                    if (balVar.e(ayhVar)) {
                                        bakVar.d++;
                                    }
                                }
                                bakVar.d = 0;
                                bakVar.c++;
                            }
                            return true;
                        }
                    }
                }
                defpackage.bak bakVar2 = this.o;
                if (bakVar2 != null && bakVar2.e) {
                    c();
                    defpackage.vx.c("compose:lazy:prefetch:execute:item", this.f);
                    defpackage.bak bakVar3 = this.o;
                    if (bakVar3 != null) {
                        bakVar3.e = false;
                    }
                }
                defpackage.dlm dlmVar = this.h;
                if (!this.k && dlmVar != null) {
                    defpackage.ayj ayjVar4 = (defpackage.ayj) obj3;
                    if (!d(this.b, ayjVar4.d)) {
                        return true;
                    }
                    long j3 = dlmVar.a;
                    if (this.a) {
                        defpackage.asq.c("Callers should check whether the request is still valid before calling performMeasure()");
                    }
                    if (this.k) {
                        defpackage.asq.c("Request was already measured!");
                    }
                    this.k = true;
                    defpackage.cvk cvkVar2 = this.i;
                    if (cvkVar2 == null) {
                        defpackage.asq.a("performComposition() must be called before performMeasure()");
                        throw new defpackage.afap();
                    }
                    int iA = cvkVar2.a();
                    for (int i6 = 0; i6 < iA; i6++) {
                        cvkVar2.c(i6, j3);
                    }
                    c();
                    ayjVar4.d = defpackage.ayj.b(this.c, ayjVar4.d);
                    defpackage.affc affcVar2 = this.g;
                    if (affcVar2 != null) {
                        affcVar2.invoke(this);
                    }
                }
                defpackage.bak bakVar4 = this.o;
                if (!this.k || !this.n || bakVar4 == null) {
                    return false;
                }
                java.util.List list6 = bakVar4.a;
                int size2 = list6.size();
                int iMin = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < size2; i7++) {
                    iMin = java.lang.Math.min(iMin, ((defpackage.azy) list6.get(i7)).c);
                }
                if (iMin == Integer.MAX_VALUE) {
                    iMin = 0;
                }
                defpackage.ayj ayjVar5 = (defpackage.ayj) obj3;
                int i8 = ayjVar5.e;
                ayjVar5.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                int size3 = list6.size();
                int iMin2 = Integer.MAX_VALUE;
                for (int i9 = 0; i9 < size3; i9++) {
                    iMin2 = java.lang.Math.min(iMin2, ((defpackage.azy) list6.get(i9)).d);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    iMin2 = 0;
                }
                if (iMin2 >= iMin) {
                    return false;
                }
                ayjVar5.d = 0L;
                return false;
            }
        }
        f();
        return false;
    }

    @Override // defpackage.azx
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        f();
    }

    @Override // defpackage.azx
    public final void b() {
        this.p = true;
    }

    public final void c() {
        long jA;
        long j = aitt.a;
        long jNanoTime = java.lang.System.nanoTime() - aitt.a;
        long j2 = this.q;
        long j3 = (j2 - 1) | 1;
        long j4 = Long.MAX_VALUE;
        aits aitsVar = aits.a;
        if (j3 != Long.MAX_VALUE) {
            jA = (((-1) + jNanoTime) | 1) == Long.MAX_VALUE ? ahyc.a(jNanoTime) : ahyc.b(jNanoTime, j2, aitsVar);
        } else if (jNanoTime == j2) {
            long j5 = aitq.a;
            jA = 0;
        } else {
            jA = aitq.i(ahyc.a(j2));
        }
        long j6 = aitq.a;
        long j7 = jA >> 1;
        if (((((int) jA) & 1) ^ 1) != 0) {
            j4 = j7;
        } else if (j7 <= 9223372036854L) {
            j4 = j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
        }
        this.c = j4;
        long j8 = this.b - j4;
        this.b = j8;
        this.q = jNanoTime;
        defpackage.vx.c("compose:lazy:prefetch:available_time_nanos", j8);
    }

    public final boolean d(long j, long j2) {
        if (true == this.p) {
            j2 = 0;
        }
        return j > j2;
    }

    public final boolean e(defpackage.ayh ayhVar) {
        if (!this.e.b) {
            return false;
        }
        boolean zH = this.p ? h(ayhVar) : h(ayhVar);
        defpackage.vx.c("compose:lazy:prefetch:execute:item", -1L);
        return zH;
    }

    public final java.lang.String toString() {
        return "HandleAndRequestImpl { index = " + this.f + ", constraints = " + this.h + ", isComposed = " + g() + ", isMeasured = " + this.k + ", isCanceled = " + this.a + " }";
    }

    public bal(defpackage.skd skdVar, int i, long j, defpackage.epq epqVar, defpackage.affc affcVar) {
        this(skdVar, i, epqVar, affcVar);
        this.h = new defpackage.dlm(j);
    }
}

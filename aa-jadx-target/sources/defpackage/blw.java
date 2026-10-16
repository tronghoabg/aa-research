package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blw {
    private final defpackage.bwx A;
    private int B;
    private defpackage.blk C;
    public final defpackage.bfo a;
    public defpackage.djv b;
    public defpackage.affc c;
    public defpackage.beg d;
    public final defpackage.bwx e;
    public defpackage.afer f;
    public aiuw g;
    public defpackage.cit h;
    public final defpackage.bwx i;
    public final defpackage.bwx j;
    public long k;
    public defpackage.dgc l;
    public long m;
    public defpackage.dkd n;
    public defpackage.dgc o;
    public final defpackage.bwx p;
    public final defpackage.beq q;
    public final defpackage.bkb r;
    public boolean s;
    public defpackage.bki t;
    public defpackage.daw u;
    public defpackage.dki v;
    public defpackage.vuj w;
    public defpackage.kwv x;
    public defpackage.kwv y;
    private final defpackage.bwx z;

    public blw(defpackage.bfo bfoVar) {
        this.a = bfoVar;
        this.b = defpackage.bfq.a;
        this.c = new defpackage.bev(15);
        java.lang.String str = null;
        long j = 0;
        int i = 7;
        defpackage.dkd dkdVar = new defpackage.dkd(str, j, i);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(dkdVar, bxvVar);
        this.v = defpackage.dkh.a;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.k = 0L;
        this.m = 0L;
        this.z = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.A = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.B = -1;
        this.n = new defpackage.dkd(str, j, i);
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, bxvVar);
        this.w = new defpackage.vuj(null, null);
        this.q = new defpackage.blu(this);
        this.r = new defpackage.bls(this);
    }

    public final void A() {
        aiuw aiuwVar = this.g;
        if (aiuwVar != null) {
            ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.blt(this, null), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    public final long a(boolean z) {
        defpackage.bfi bfiVarE;
        defpackage.dfb dfbVarE;
        long j;
        int iMax;
        defpackage.beg begVar = this.d;
        if (begVar != null && (bfiVarE = begVar.e()) != null && (dfbVarE = e()) != null) {
            defpackage.dga dgaVar = bfiVarE.a;
            if (defpackage.afga.f(dfbVarE.b, dgaVar.a.a.b)) {
                if (z) {
                    long j2 = f().b;
                    long j3 = defpackage.dgc.a;
                    j = j2 >> 32;
                } else {
                    long j4 = f().b;
                    long j5 = defpackage.dgc.a;
                    j = j4 & 4294967295L;
                }
                int iA = this.b.a((int) j);
                boolean zJ = defpackage.dgc.j(f().b);
                int iG = dgaVar.g(iA);
                if (iG >= dgaVar.e()) {
                    return 9205357640488583168L;
                }
                if (z) {
                    if (zJ) {
                        zJ = true;
                        if (z) {
                        }
                        iMax = java.lang.Math.max(iA - 1, 0);
                    } else {
                        iMax = iA;
                    }
                } else if (z && zJ) {
                    iMax = iA;
                } else {
                    iMax = java.lang.Math.max(iA - 1, 0);
                }
                int iP = dgaVar.p(iMax);
                int iQ = dgaVar.q(iA);
                defpackage.dfi dfiVar = dgaVar.b;
                dfiVar.j(iA);
                defpackage.dfk dfkVar = (defpackage.dfk) dfiVar.h.get(iA == dfiVar.h().a() ? dfiVar.h.size() - 1 : defpackage.dai.u(dfiVar.h, iA));
                defpackage.deu deuVar = dfkVar.g;
                int iE = dfkVar.e(iA);
                float fE = iP == iQ ? deuVar.b.e(iE, false) : deuVar.b.f(iE, false);
                long j6 = dgaVar.c;
                return (((long) java.lang.Float.floatToRawIntBits(defpackage.afqt.d(dgaVar.a(iG), 0.0f, (int) (j6 & 4294967295L)))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(defpackage.afqt.d(fE, 0.0f, (int) (j6 >> 32)))) << 32);
            }
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final long b(defpackage.dkd r24, long r25, boolean r27, boolean r28, defpackage.bks r29, boolean r30, defpackage.cpr r31) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blw.b(dkd, long, boolean, boolean, bks, boolean, cpr):long");
    }

    public final defpackage.bdy c() {
        return (defpackage.bdy) this.z.a();
    }

    public final defpackage.cji d() {
        return (defpackage.cji) this.A.a();
    }

    public final defpackage.dfb e() {
        defpackage.bep bepVar;
        defpackage.beg begVar = this.d;
        if (begVar == null || (bepVar = begVar.a) == null) {
            return null;
        }
        return bepVar.a;
    }

    public final defpackage.dkd f() {
        return (defpackage.dkd) this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.blv blvVar;
        if (afdkVar instanceof defpackage.blv) {
            blvVar = (defpackage.blv) afdkVar;
            int i = blvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                blvVar.c = i - Integer.MIN_VALUE;
            } else {
                blvVar = new defpackage.blv(this, afdkVar);
            }
        } else {
            blvVar = new defpackage.blv(this, afdkVar);
        }
        java.lang.Object objValueOf = blvVar.a;
        java.lang.Object obj = defpackage.afdr.a;
        int i2 = blvVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(objValueOf);
            defpackage.kwv kwvVar = this.x;
            if (kwvVar != null) {
                blvVar.d = this;
                blvVar.c = 1;
                android.content.ClipDescription primaryClipDescription = ((defpackage.czt) kwvVar.a).a().getPrimaryClipDescription();
                objValueOf = java.lang.Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return defpackage.afbk.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = blvVar.d;
        defpackage.afga.cz(objValueOf);
        java.lang.Boolean bool = (java.lang.Boolean) objValueOf;
        bool.booleanValue();
        this.p.b(bool);
        return defpackage.afbk.a;
    }

    public final defpackage.afau h() {
        java.lang.String str;
        defpackage.dgc dgcVar;
        defpackage.dfb dfbVarE = e();
        if (dfbVarE == null || (str = dfbVarE.b) == null || (dgcVar = this.o) == null) {
            return null;
        }
        defpackage.djv djvVar = this.b;
        long j = dgcVar.b;
        return new defpackage.afau(str, new defpackage.dgc(defpackage.dax.g(djvVar.a((int) (j >> 32)), this.b.a((int) (j & 4294967295L)))));
    }

    public final void i(defpackage.cji cjiVar) {
        int iMax;
        if (!defpackage.dgc.i(f().b)) {
            defpackage.beg begVar = this.d;
            defpackage.bfi bfiVarE = begVar != null ? begVar.e() : null;
            if (cjiVar == null || bfiVarE == null) {
                long j = f().b;
                iMax = java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                iMax = this.b.b(bfiVarE.a(cjiVar.a, true));
            }
            defpackage.dkd dkdVarB = defpackage.dkd.b(f(), null, defpackage.dax.g(iMax, iMax), 5);
            this.c.invoke(dkdVarB);
            this.o = new defpackage.dgc(dkdVarB.b);
        }
        q((cjiVar == null || f().a().length() <= 0) ? defpackage.bdz.a : defpackage.bdz.c);
        t(false);
    }

    public final void j(boolean z) {
        defpackage.cit citVar;
        defpackage.beg begVar = this.d;
        if (begVar != null && !begVar.q() && (citVar = this.h) != null) {
            citVar.a(7);
        }
        this.n = f();
        t(z);
        q(defpackage.bdz.b);
    }

    public final void k() {
        t(false);
        q(defpackage.bdz.a);
    }

    public final void l() {
        defpackage.bhn bhnVar;
        aiwg aiwgVar;
        java.lang.Object obj = this.w.b;
        if (obj == null || (aiwgVar = (bhnVar = (defpackage.bhn) obj).d) == null) {
            return;
        }
        aiwgVar.s((java.util.concurrent.CancellationException) null);
        bhnVar.d = null;
    }

    public final void m(defpackage.dgc dgcVar) {
        defpackage.bki bkiVar;
        defpackage.dfb dfbVarE;
        java.lang.String str;
        aiuw aiuwVar;
        if (dgcVar == null || (bkiVar = this.t) == null || (dfbVarE = e()) == null || (str = dfbVarE.b) == null) {
            return;
        }
        defpackage.djv djvVar = this.b;
        long j = dgcVar.b;
        long jG = defpackage.dax.g(djvVar.a((int) (j >> 32)), djvVar.a((int) (j & 4294967295L)));
        if (str.length() <= 0 || defpackage.dgc.i(jG) || (aiuwVar = this.g) == null) {
            return;
        }
        ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.blr(bkiVar, str, jG, dgcVar, this, djvVar, null), 3);
    }

    public final void n(defpackage.cji cjiVar) {
        this.A.b(cjiVar);
    }

    public final void o(long j) {
        defpackage.beg begVar = this.d;
        if (begVar != null) {
            begVar.h(j);
        }
        defpackage.beg begVar2 = this.d;
        if (begVar2 != null) {
            begVar2.l(defpackage.dgc.a);
        }
        if (defpackage.dgc.i(j)) {
            return;
        }
        k();
    }

    public final void p(defpackage.bdy bdyVar) {
        this.z.b(bdyVar);
    }

    public final void q(defpackage.bdz bdzVar) {
        defpackage.beg begVar = this.d;
        if (begVar != null) {
            if (begVar.d() == bdzVar) {
                begVar = null;
            }
            if (begVar != null) {
                begVar.i(bdzVar);
            }
        }
    }

    public final void r(long j) {
        defpackage.beg begVar = this.d;
        if (begVar != null) {
            begVar.l(j);
        }
        defpackage.beg begVar2 = this.d;
        if (begVar2 != null) {
            begVar2.h(defpackage.dgc.a);
        }
        if (defpackage.dgc.i(j)) {
            return;
        }
        k();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [cwm, java.lang.Object] */
    public final void s() {
        defpackage.beg begVar;
        defpackage.bht bhtVar;
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            if (!v() || ((begVar = this.d) != null && !begVar.u())) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                return;
            }
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            defpackage.vuj vujVar = this.w;
            if (vujVar.a == 1) {
                defpackage.asq.d("ToolbarRequester is not initialized.");
            }
            ?? r5 = vujVar.b;
            if (r5 != 0) {
                defpackage.cge cgeVar = (defpackage.cge) r5;
                if (cgeVar.A) {
                    defpackage.bhn bhnVar = (defpackage.bhn) r5;
                    aiwg aiwgVar = bhnVar.d;
                    if ((aiwgVar == null || !aiwgVar.t()) && (bhtVar = (defpackage.bht) defpackage.cjv.y(r5, defpackage.bhu.b)) != null) {
                        bhnVar.d = ahoc.d(cgeVar.N(), (defpackage.afdo) null, 4, new defpackage.bhm(bhnVar, bhtVar, null), 1);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            throw th;
        }
    }

    public final void t(boolean z) {
        defpackage.beg begVar = this.d;
        if (begVar != null) {
            begVar.n(z);
        }
        if (z) {
            s();
        } else {
            l();
        }
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }

    public final boolean v() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    public final boolean w() {
        return !defpackage.dgc.i(f().b);
    }

    public final void y(boolean z) {
        aiuw aiuwVar = this.g;
        if (aiuwVar != null) {
            ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.blo(this, z, null), 1);
        }
    }

    public final void z() {
        aiuw aiuwVar = this.g;
        if (aiuwVar != null) {
            ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.ber(this, (defpackage.afdk) null, 4, (byte[]) null), 1);
        }
    }

    public blw() {
        this(null);
    }
}

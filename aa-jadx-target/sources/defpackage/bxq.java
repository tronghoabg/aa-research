package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bxq extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.bxt c;
    final /* synthetic */ defpackage.affh d;
    final /* synthetic */ defpackage.bwq e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxq(defpackage.bxt bxtVar, defpackage.affh affhVar, defpackage.bwq bwqVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = bxtVar;
        this.d = affhVar;
        this.e = bwqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bxq bxqVar = new defpackage.bxq(this.c, this.d, this.e, afdkVar);
        bxqVar.f = obj;
        return bxqVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010e A[Catch: all -> 0x0126, TryCatch #3 {, blocks: (B:53:0x010a, B:55:0x010e, B:56:0x0110, B:58:0x0116), top: B:98:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0116 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #3 {, blocks: (B:53:0x010a, B:55:0x010e, B:56:0x0110, B:58:0x0116), top: B:98:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013b A[Catch: all -> 0x0151, TryCatch #0 {, blocks: (B:73:0x0137, B:75:0x013b, B:76:0x013d, B:78:0x0143), top: B:93:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0143 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {, blocks: (B:73:0x0137, B:75:0x013b, B:76:0x013d, B:78:0x0143), top: B:93:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ceg] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ceg] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aiwg aiwgVarQ;
        ajba ajbaVar;
        defpackage.ccq ccqVar;
        defpackage.ccq ccqVar2;
        ?? r0;
        java.util.List listZ;
        ?? r1;
        defpackage.bxt bxtVar;
        defpackage.bxt bxtVar2;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.b != 0) {
            r0 = this.a;
            aiwgVarQ = (aiwg) this.f;
            try {
                defpackage.afga.cz(obj);
                r1 = r0;
                r1.a();
                bxtVar2 = this.c;
                synchronized (bxtVar2.c) {
                    if (bxtVar2.d == aiwgVarQ) {
                        bxtVar2.d = null;
                    }
                    if (bxtVar2.A() != null) {
                        defpackage.bvg.b("called outside of runRecomposeAndApplyChanges");
                    }
                }
                defpackage.dai.aK(this.c.t);
                return defpackage.afbk.a;
            } catch (java.lang.Throwable th) {
                th = th;
                r0.a();
                bxtVar = this.c;
                synchronized (bxtVar.c) {
                    if (bxtVar.d == aiwgVarQ) {
                        bxtVar.d = null;
                    }
                    if (bxtVar.A() != null) {
                        defpackage.bvg.b("called outside of runRecomposeAndApplyChanges");
                    }
                }
                defpackage.dai.aK(this.c.t);
                throw th;
            }
        }
        defpackage.afga.cz(obj);
        aiwgVarQ = defpackage.afgz.q(((aiuw) this.f).c());
        defpackage.bxt bxtVar3 = this.c;
        synchronized (bxtVar3.c) {
            java.lang.Throwable th2 = bxtVar3.e;
            if (th2 != null) {
                throw th2;
            }
            if (((defpackage.bxo) bxtVar3.l.b()).compareTo(defpackage.bxo.b) <= 0) {
                throw new java.lang.IllegalStateException("Recomposer shut down");
            }
            if (bxtVar3.d != null) {
                throw new java.lang.IllegalStateException("Recomposer already running");
            }
            bxtVar3.d = aiwgVarQ;
            if (bxtVar3.A() != null) {
                defpackage.bvg.b("called outside of runRecomposeAndApplyChanges");
            }
        }
        defpackage.bxt bxtVar4 = this.c;
        defpackage.ceg cegVarI = defpackage.bzd.i(new defpackage.amc(bxtVar4, 13));
        do {
            defpackage.dai daiVar = bxtVar4.t;
            ajbaVar = defpackage.bxt.k;
            ccqVar = (defpackage.ccq) ajbaVar.b();
            defpackage.cca ccaVar = ccqVar.d;
            if (ccaVar.containsKey(daiVar)) {
                ccqVar2 = ccqVar;
            } else if (ccqVar.isEmpty()) {
                defpackage.cct cctVar = defpackage.cct.a;
                ccqVar2 = new defpackage.ccq(daiVar, daiVar, ccaVar.b(daiVar, new defpackage.bil(cctVar, cctVar)));
            } else {
                java.lang.Object obj2 = ccqVar.c;
                java.lang.Object obj3 = ccaVar.get(obj2);
                obj3.getClass();
                ccqVar2 = new defpackage.ccq(ccqVar.b, daiVar, ccaVar.b(obj2, ((defpackage.bil) obj3).e(daiVar)).b(daiVar, new defpackage.bil(obj2, defpackage.cct.a)));
            }
            if (ccqVar == ccqVar2) {
                break;
            }
        } while (!ajbaVar.e(ccqVar, ccqVar2));
        try {
            synchronized (bxtVar4.c) {
                listZ = bxtVar4.z();
            }
            int size = listZ.size();
            for (int i = 0; i < size; i++) {
                for (java.lang.Object obj4 : ((defpackage.bzm) ((defpackage.bvk) listZ.get(i)).e).c) {
                    defpackage.bxl bxlVar = obj4 instanceof defpackage.bxl ? (defpackage.bxl) obj4 : null;
                    if (bxlVar != null) {
                        bxlVar.a();
                    }
                }
            }
            defpackage.amx amxVar = new defpackage.amx(this.d, this.e, (defpackage.afdk) null, 5);
            this.f = aiwgVarQ;
            this.a = cegVarI;
            this.b = 1;
            if (ahoi.a(amxVar, this) == afdrVar) {
                return afdrVar;
            }
            r1 = cegVarI;
            r1.a();
            bxtVar2 = this.c;
            synchronized (bxtVar2.c) {
                if (bxtVar2.d == aiwgVarQ) {
                    bxtVar2.d = null;
                }
                if (bxtVar2.A() != null) {
                    defpackage.bvg.b("called outside of runRecomposeAndApplyChanges");
                }
                defpackage.dai.aK(this.c.t);
                return defpackage.afbk.a;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            r0 = cegVarI;
            r0.a();
            bxtVar = this.c;
            synchronized (bxtVar.c) {
                if (bxtVar.d == aiwgVarQ) {
                    bxtVar.d = null;
                }
                if (bxtVar.A() != null) {
                    defpackage.bvg.b("called outside of runRecomposeAndApplyChanges");
                }
                defpackage.dai.aK(this.c.t);
                throw th;
            }
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bxq) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}

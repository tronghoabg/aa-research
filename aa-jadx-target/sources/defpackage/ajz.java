package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ajz implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bwx, bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [dlo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v48, types: [bhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v54, types: [bhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v59, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [cdv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cds, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        java.lang.Object obj;
        glm glmVar;
        defpackage.dfb dfbVarE;
        defpackage.bdy bdyVarC;
        int iE;
        defpackage.bfi bfiVarE;
        defpackage.beg begVar;
        defpackage.bep bepVar;
        defpackage.dfb dfbVar;
        int i = 4;
        java.lang.Object[] objArr = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.afgv) this.a).a = defpackage.cjv.y(this.b, defpackage.cuv.a);
                return defpackage.afbk.a;
            case 1:
                defpackage.ajd ajdVar = (defpackage.ajd) this.b;
                defpackage.cld cldVar = ajdVar.c;
                ?? r14 = this.a;
                defpackage.cxn cxnVar = (defpackage.cxn) r14;
                ajdVar.d = cldVar.a(cxnVar.o(), cxnVar.p(), r14);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.bag(this.a, defpackage.afcf.a, this.b);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bbi bbiVar = (defpackage.bbi) this.a.a();
                defpackage.bby bbyVar = (defpackage.bby) this.b;
                return new defpackage.bbk(bbyVar, bbiVar, new defpackage.sns(bbyVar.e.d.a(), bbiVar));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Boolean.valueOf(defpackage.afw.W((defpackage.bby) this.b, this.a));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(defpackage.afw.X((defpackage.bby) this.b, this.a));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(defpackage.afw.W((defpackage.bby) this.b, this.a));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(defpackage.afw.X((defpackage.bby) this.b, this.a));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r0 = this.b;
                long j = ((defpackage.dkd) r0.a()).b;
                long j2 = defpackage.dgc.a;
                java.lang.Object obj2 = this.a;
                defpackage.dkd dkdVar = (defpackage.dkd) obj2;
                if (dkdVar.b != j || !defpackage.afga.f(dkdVar.c, ((defpackage.dkd) r0.a()).c)) {
                    r0.b(obj2);
                }
                return defpackage.afbk.a;
            case 9:
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = this.b;
                if (obj4 != null) {
                    defpackage.bfk bfkVar = (defpackage.bfk) obj4;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = bfkVar.c;
                    if (snapshotStateList.isEmpty()) {
                        obj = bfkVar.b;
                    } else {
                        defpackage.bem bemVar = new defpackage.bem(bfkVar.b);
                        java.util.List listE = snapshotStateList.e();
                        int size = listE.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((defpackage.affc) listE.get(i2)).invoke(bemVar);
                        }
                        obj = bemVar.b;
                    }
                    bfkVar.b = (defpackage.dfb) obj;
                    if (obj != null) {
                        return obj;
                    }
                }
                return obj3;
            case 10:
                defpackage.dfg dfgVar = (defpackage.dfg) ((defpackage.dfa) this.a).a;
                boolean z = dfgVar instanceof defpackage.dff;
                java.lang.Object obj5 = this.b;
                if (z) {
                    try {
                        ((defpackage.kwv) obj5).K(((defpackage.dff) dfgVar).a);
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                } else if ((dfgVar instanceof defpackage.dfe) && (glmVar = ((defpackage.dfe) dfgVar).c) != null) {
                    glmVar.b(dfgVar);
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.bfd bfdVar = new defpackage.bfd(this.a, i);
                defpackage.bgk bgkVar = (defpackage.bgk) this.b;
                return (defpackage.bfx) bgkVar.a("dataBuilder", bgkVar.d, bfdVar);
            case 12:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                defpackage.ajz ajzVar = new defpackage.ajz(obj7, obj6, 14, objArr == true ? 1 : 0);
                defpackage.bgk bgkVar2 = (defpackage.bgk) obj7;
                return (defpackage.cjj) bgkVar2.a("positioner", bgkVar2.e, ajzVar);
            case 13:
                ((defpackage.afgv) this.a).a = this.b.invoke();
                return defpackage.afbk.a;
            case 14:
                java.lang.Object objInvoke = ((defpackage.bgk) this.b).b.invoke();
                defpackage.ctc ctcVar = (defpackage.ctc) (true == ((defpackage.ctc) objInvoke).t() ? objInvoke : null);
                return ctcVar == null ? defpackage.cjj.a : this.a.c(ctcVar).f(ctcVar.j(0L));
            case 15:
                int i3 = defpackage.bgq.a;
                ((defpackage.bfy) this.b).d.invoke(this.a);
                return defpackage.afbk.a;
            case 16:
                int i4 = defpackage.bgq.a;
                return new defpackage.dlw(defpackage.dlv.d(this.b.a((defpackage.ctc) this.a.invoke())));
            case 17:
                ((defpackage.afgv) this.a).a = defpackage.cjv.y(this.b, defpackage.cuv.a);
                return defpackage.afbk.a;
            case 18:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 4, new defpackage.ber((defpackage.affc) this.b, (defpackage.afdk) null, 5), 1);
                return defpackage.afbk.a;
            case 19:
                long j3 = ((defpackage.dly) this.a.a()).a;
                defpackage.blw blwVar = (defpackage.blw) this.b;
                defpackage.cji cjiVarD = blwVar.d();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (cjiVarD != null && (dfbVarE = blwVar.e()) != null && dfbVarE.a() != 0 && (bdyVarC = blwVar.c()) != null) {
                    int iOrdinal = bdyVarC.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        iE = defpackage.dgc.e(blwVar.f().b);
                    } else {
                        if (iOrdinal != 2) {
                            throw new defpackage.afas();
                        }
                        iE = defpackage.dgc.a(blwVar.f().b);
                    }
                    defpackage.beg begVar2 = blwVar.d;
                    if (begVar2 != null && (bfiVarE = begVar2.e()) != null && (begVar = blwVar.d) != null && (bepVar = begVar.a) != null && (dfbVar = bepVar.a) != null) {
                        long j4 = cjiVarD.a;
                        int iG = defpackage.afqt.g(blwVar.b.a(iE), 0, dfbVar.a());
                        long jB = bfiVarE.b(j4) >> 32;
                        defpackage.dga dgaVar = bfiVarE.a;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) jB);
                        int iG2 = dgaVar.g(iG);
                        float fB = dgaVar.b(iG2);
                        float fC = dgaVar.c(iG2);
                        float fD = defpackage.afqt.d(fIntBitsToFloat, java.lang.Math.min(fB, fC), java.lang.Math.max(fB, fC));
                        if (defpackage.a.i(j3, 0L) || java.lang.Math.abs(fIntBitsToFloat - fD) <= ((int) (j3 >> 32)) / 2) {
                            float fD2 = dgaVar.d(iG2);
                            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fD)) << 32) | (((long) java.lang.Float.floatToRawIntBits(((dgaVar.a(iG2) - fD2) / 2.0f) + fD2)) & 4294967295L);
                        }
                    }
                }
                return new defpackage.cji(jFloatToRawIntBits);
            default:
                defpackage.bws bwsVar = (defpackage.bws) this.a;
                ((defpackage.bwc) this.b).am(bwsVar.a, bwsVar.h, bwsVar.b);
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ ajz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}

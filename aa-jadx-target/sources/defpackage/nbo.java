package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nbo extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(aiwg aiwgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = aiwgVar;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, nqe] */
    /* JADX WARN: Type inference failed for: r2v25, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, nqe] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.nbo((nbp) this.b, afdkVar, 0);
            case 1:
                return new defpackage.nbo((nbp) this.b, afdkVar, 1, (byte[]) null);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.nbo((defpackage.tc) this.b, afdkVar, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.nbo((neu) this.b, afdkVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.nbo((nqe) this.b, afdkVar, 4);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.nbo((nqe) this.b, afdkVar, 5, (byte[]) null);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.nbo((defpackage.tc) this.b, afdkVar, 6, (byte[]) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.nbo((defpackage.oqk) this.b, afdkVar, 7);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.nbo((kzy) this.b, afdkVar, 8);
            case 9:
                return new defpackage.nbo((pgd) this.b, afdkVar, 9);
            case 10:
                return new defpackage.nbo((defpackage.tcn) this.b, afdkVar, 10);
            case 11:
                return new defpackage.nbo((defpackage.bxt) this.b, afdkVar, 11);
            case 12:
                return new defpackage.nbo((defpackage.ndd) this.b, afdkVar, 12);
            case 13:
                return new defpackage.nbo((aiwg) this.b, afdkVar, 13);
            case 14:
                return new defpackage.nbo((xtl) this.b, afdkVar, 14);
            case 15:
                return new defpackage.nbo((xtl) this.b, afdkVar, 15, (byte[]) null);
            default:
                return new defpackage.nbo((aizj) this.b, afdkVar, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, nqe] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, nqe] */
    /* JADX WARN: Type inference failed for: r12v69, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v76, types: [aizj, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v7 java.lang.Object, still in use, count: 2, list:
          (r8v7 java.lang.Object) from 0x01ef: PHI (r8 I:??) = (r8v4 java.lang.Object), (r8v7 java.lang.Object) binds: [B:97:0x01ee, B:215:0x01ef] A[DONT_GENERATE, DONT_INLINE]
          (r8v7 java.lang.Object) from 0x01e3: CHECK_CAST (android.appwidget.AppWidgetProviderInfo) (r8v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbo.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 9:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 10:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 11:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 12:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 13:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 14:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 15:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.nbo) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(aizj aizjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = aizjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.bxt bxtVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = bxtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(kzy kzyVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = kzyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(nbp nbpVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = nbpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(nbp nbpVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = nbpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.ndd nddVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = nddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(neu neuVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = neuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(nqe nqeVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = nqeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(nqe nqeVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = nqeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.oqk oqkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = oqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(pgd pgdVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = pgdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.tc tcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = tcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.tc tcVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = tcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.tcn tcnVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = tcnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(xtl xtlVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = xtlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(xtl xtlVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = xtlVar;
    }
}

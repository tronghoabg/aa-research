package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ber extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = affcVar;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [affc, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.ber((defpackage.jlj) this.b, afdkVar, 0);
            case 1:
                return new defpackage.ber((defpackage.bby) this.b, afdkVar, 1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.ber((defpackage.bil) this.b, afdkVar, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.ber((defpackage.blw) this.b, afdkVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.ber((defpackage.blw) this.b, afdkVar, 4, (byte[]) null);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.ber((defpackage.affc) this.b, afdkVar, 5);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.ber((defpackage.dcx) this.b, afdkVar, 6);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.ber((defpackage.dcx) this.b, afdkVar, 7, (byte[]) null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.ber((defpackage.dhr) this.b, afdkVar, 8);
            case 9:
                return new defpackage.ber((defpackage.egk) this.b, afdkVar, 9);
            case 10:
                return new defpackage.ber((defpackage.egk) this.b, afdkVar, 10, (byte[]) null);
            default:
                return new defpackage.ber((defpackage.odw) this.b, afdkVar, 11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        if (r12 == r0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r1.hd(r2, r12) == r0) goto L19;
     */
    /* JADX WARN: Type inference failed for: r13v15, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [asj, java.lang.Object] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ber.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.ber) b(new defpackage.cji(((defpackage.cji) obj).a), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 9:
                return ((defpackage.ber) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 10:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.ber) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.bby bbyVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = bbyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.bil bilVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = bilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.blw blwVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = blwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.blw blwVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = blwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.dcx dcxVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = dcxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.dcx dcxVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = dcxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.dhr dhrVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = dhrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.egk egkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = egkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.egk egkVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = egkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.jlj jljVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = jljVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(defpackage.odw odwVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = odwVar;
    }
}

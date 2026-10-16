package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ezu extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezu(aizj aizjVar, ajaj ajajVar, java.lang.Object obj, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.c = aizjVar;
        this.d = ajajVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ajaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.f;
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            fab fabVar = (fab) obj2;
            defpackage.ezu ezuVar = new defpackage.ezu(fabVar, (int[]) this.c, (java.lang.String[]) this.d, afdkVar, 0);
            ezuVar.e = obj;
            return ezuVar;
        }
        if (i != 1) {
            defpackage.ezu ezuVar2 = new defpackage.ezu((aizj) this.c, (ajaj) this.d, this.b, afdkVar, 2);
            ezuVar2.e = obj;
            return ezuVar2;
        }
        defpackage.ezu ezuVar3 = new defpackage.ezu((ezi) this.b, (aiuf) this.d, (defpackage.affg) this.c, afdkVar, 1);
        ezuVar3.e = obj;
        return ezuVar3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0183 A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:72:0x017c, B:74:0x0183, B:76:0x0195, B:77:0x0198, B:79:0x019d, B:81:0x01a1), top: B:90:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:72:0x017c, B:74:0x0183, B:76:0x0195, B:77:0x0198, B:79:0x019d, B:81:0x01a1), top: B:90:0x017c }] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (ahoc.a((defpackage.afdo) r5, r9, r22) != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r5.h(r6, r22) == r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [afdk] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v19, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezu.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((defpackage.ezu) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return ((defpackage.ezu) b((ajar) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.ezu) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezu(ezi eziVar, aiuf aiufVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = eziVar;
        this.d = aiufVar;
        this.c = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezu(fab fabVar, int[] iArr, java.lang.String[] strArr, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = fabVar;
        this.c = iArr;
        this.d = strArr;
    }
}

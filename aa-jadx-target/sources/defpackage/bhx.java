package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhx extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.bhy d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhx(defpackage.bhy bhyVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = bhyVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bhx bhxVar = new defpackage.bhx(this.d, afdkVar);
        bhxVar.e = obj;
        return bhxVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r8 != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r9 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        if (r3 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0190, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00be -> B:34:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0153 -> B:63:0x0156). Please report as a decompilation issue!!! */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhx.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bhx) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}

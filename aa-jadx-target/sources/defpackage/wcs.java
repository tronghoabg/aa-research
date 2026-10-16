package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class wcs extends defpackage.wcz {
    private final defpackage.wco d;
    private volatile java.lang.Object e;

    public wcs(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar, defpackage.wco wcoVar) {
        super(str, str2, wdoVar);
        this.d = wcoVar;
    }

    @Override // defpackage.wck
    protected final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.wck
    protected final java.lang.Object c(java.lang.String str) throws java.io.IOException {
        return this.d.a(android.util.Base64.decode(str, 3));
    }

    @Override // defpackage.wcn
    public final java.lang.Object d() {
        return this.e;
    }

    @Override // defpackage.wcn
    public final void g(java.lang.Object obj) {
        this.e = obj;
    }
}

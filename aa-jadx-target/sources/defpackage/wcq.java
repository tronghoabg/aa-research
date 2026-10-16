package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class wcq extends defpackage.wcz {
    private volatile boolean d;

    public wcq(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar) {
        super(str, str2, wdoVar);
    }

    @Override // defpackage.wck
    protected final /* synthetic */ java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        return (java.lang.Boolean) obj;
    }

    @Override // defpackage.wck
    protected final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) throws java.io.IOException {
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
    }

    @Override // defpackage.wcn
    public final /* bridge */ /* synthetic */ java.lang.Object d() {
        return java.lang.Boolean.valueOf(this.d);
    }

    @Override // defpackage.wcn
    public final /* bridge */ /* synthetic */ void g(java.lang.Object obj) {
        this.d = ((java.lang.Boolean) obj).booleanValue();
    }
}

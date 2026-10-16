package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class wcw extends defpackage.wcz {
    private volatile long d;

    public wcw(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar) {
        super(str, str2, wdoVar);
    }

    @Override // defpackage.wck
    protected final /* synthetic */ java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        return (java.lang.Long) obj;
    }

    @Override // defpackage.wck
    protected final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) throws java.io.IOException {
        return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
    }

    @Override // defpackage.wcn
    public final /* bridge */ /* synthetic */ java.lang.Object d() {
        return java.lang.Long.valueOf(this.d);
    }

    @Override // defpackage.wcn
    public final /* bridge */ /* synthetic */ void g(java.lang.Object obj) {
        this.d = ((java.lang.Long) obj).longValue();
    }
}

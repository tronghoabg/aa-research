package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ehd implements defpackage.ehh {
    private final defpackage.abpy a;
    private final defpackage.abol b;

    public ehd(defpackage.abpy abpyVar, defpackage.abol abolVar) {
        abpyVar.getClass();
        abolVar.getClass();
        this.a = abpyVar;
        this.b = abolVar;
    }

    @Override // defpackage.ehh
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    @Override // defpackage.ehh
    public final java.lang.Object b(java.io.InputStream inputStream) throws defpackage.eex {
        try {
            java.lang.Object objI = this.a.M().i(inputStream, this.b);
            objI.getClass();
            return objI;
        } catch (defpackage.abpp e) {
            throw new defpackage.eex("Cannot read proto.", e);
        }
    }

    @Override // defpackage.ehh
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        ((defpackage.abpy) obj).g(outputStream);
        return defpackage.afbk.a;
    }
}

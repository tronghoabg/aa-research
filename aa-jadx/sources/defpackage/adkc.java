package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adkc implements defpackage.adkd {
    public static final defpackage.adkd a = new defpackage.adkc(0);
    private final /* synthetic */ int b;

    public adkc(int i) {
        this.b = i;
    }

    @Override // defpackage.adkt
    public final java.io.InputStream a(java.io.InputStream inputStream) {
        return this.b != 0 ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.adke, defpackage.adkt
    public final java.lang.String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}

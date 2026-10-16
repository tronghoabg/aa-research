package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adkc implements adkd {
    public static final adkd a = new defpackage.adkc(0);
    private final /* synthetic */ int b;

    public adkc(int i) {
        this.b = i;
    }

    public final java.io.InputStream a(java.io.InputStream inputStream) {
        return this.b != 0 ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    public final java.lang.String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrt extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private final java.net.HttpURLConnection a;

    /* JADX WARN: Illegal instructions before constructor call */
    public hrt(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (java.io.IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.a.disconnect();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }
}

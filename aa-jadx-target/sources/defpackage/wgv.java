package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class wgv implements defpackage.wgu {
    protected android.net.Uri a(android.net.Uri uri) throws java.io.IOException {
        throw null;
    }

    protected abstract defpackage.wgu b();

    @Override // defpackage.wgu
    public /* synthetic */ java.io.File c(android.net.Uri uri) {
        throw null;
    }

    @Override // defpackage.wgu
    public java.io.InputStream d(android.net.Uri uri) throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.wgu
    public boolean f(android.net.Uri uri) throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.wgu
    public final void g(android.net.Uri uri) throws java.io.IOException {
        b().g(a(uri));
    }

    @Override // defpackage.wgu
    public final void h(android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        b().h(a(uri), a(uri2));
    }

    @Override // defpackage.wgu
    public final defpackage.wgf k() throws java.io.IOException {
        return ((defpackage.wfy) b()).a;
    }

    @Override // defpackage.wgu
    public final java.io.OutputStream l(android.net.Uri uri) throws java.io.IOException {
        return b().l(a(uri));
    }
}

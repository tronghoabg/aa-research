package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wfv extends defpackage.wgv {
    private final android.content.Context a;
    private final defpackage.wgu b;
    private final java.lang.Object c = new java.lang.Object();
    private volatile java.lang.String d;

    public wfv(defpackage.rkq rkqVar) {
        this.b = new defpackage.wfy((defpackage.wgf) rkqVar.b);
        this.a = (android.content.Context) rkqVar.a;
    }

    private final boolean i(android.net.Uri uri) {
        return (android.text.TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgc */
    private static final void j() throws wgc {
        throw new wgc("Android backend cannot perform remote operations without a remote backend");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgg */
    @Override // defpackage.wgv
    protected final android.net.Uri a(android.net.Uri uri) throws wgg, java.io.IOException {
        if (i(uri)) {
            throw new wgg("Operation across authorities is not allowed.");
        }
        java.io.File fileC = c(uri);
        android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme("file").authority("").path("/");
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(defpackage.wgo.a(ygrVar.g())).build();
    }

    @Override // defpackage.wgv
    protected final defpackage.wgu b() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgc */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wgg */
    @Override // defpackage.wgv, defpackage.wgu
    public final java.io.File c(android.net.Uri uri) throws wgc, wgg, java.io.IOException {
        if (i(uri)) {
            throw new java.io.IOException("operation is not permitted in other authorities.");
        }
        android.content.Context context = this.a;
        java.io.File fileY = new defpackage.kwv(context, (char[]) null).y(uri);
        if (!defpackage.tnx.e(context)) {
            java.lang.String str = this.d;
            if (str == null) {
                synchronized (this.c) {
                    str = this.d;
                    if (str == null) {
                        java.lang.String absolutePath = defpackage.sqs.bH(a$.ExternalSyntheticApiModelOutline2.m(context)).getParentFile().getAbsolutePath();
                        this.d = absolutePath;
                        str = absolutePath;
                    }
                }
            }
            if (!fileY.getAbsolutePath().startsWith(str)) {
                throw new wgc("Cannot access credential-protected data from direct boot");
            }
        }
        return fileY;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgc */
    @Override // defpackage.wgv, defpackage.wgu
    public final java.io.InputStream d(android.net.Uri uri) throws wgc, java.io.IOException {
        if (!i(uri)) {
            return this.b.d(a(uri));
        }
        j();
        throw null;
    }

    @Override // defpackage.wgu
    public final java.lang.String e() {
        return "android";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgc */
    @Override // defpackage.wgv, defpackage.wgu
    public final boolean f(android.net.Uri uri) throws wgc, java.io.IOException {
        if (!i(uri)) {
            return this.b.f(a(uri));
        }
        j();
        throw null;
    }
}

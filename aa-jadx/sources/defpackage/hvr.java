package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvr implements defpackage.hvf {
    protected final boolean a;
    private final android.net.Uri b;
    private final android.content.ContentResolver c;
    private java.lang.Object d;

    public hvr(android.content.ContentResolver contentResolver, android.net.Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    @Override // defpackage.hvf
    public final void c() {
        java.lang.Object obj = this.d;
        if (obj != null) {
            try {
                g(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        try {
            java.lang.Object objF = f(this.b, this.c);
            this.d = objF;
            hveVar.f(objF);
        } catch (java.io.FileNotFoundException e) {
            if (android.util.Log.isLoggable("LocalUriFetcher", 3)) {
                android.util.Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            hveVar.g(e);
        }
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    protected abstract java.lang.Object f(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException;

    protected abstract void g(java.lang.Object obj) throws java.io.IOException;

    protected final android.content.res.AssetFileDescriptor h(android.net.Uri uri) throws java.io.FileNotFoundException {
        return (this.a && defpackage.hef.g(uri) && defpackage.hef.f()) ? defpackage.hef.e(uri, this.c) : this.c.openAssetFileDescriptor(uri, "r");
    }

    @Override // defpackage.hvf
    public final void b() {
    }
}

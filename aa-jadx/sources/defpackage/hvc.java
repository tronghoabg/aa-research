package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvc implements defpackage.hvf {
    private final java.lang.String a;
    private final android.content.res.AssetManager b;
    private java.lang.Object c;

    public hvc(android.content.res.AssetManager assetManager, java.lang.String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.hvf
    public final void c() {
        java.lang.Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            g(obj);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        try {
            java.lang.Object objF = f(this.b, this.a);
            this.c = objF;
            hveVar.f(objF);
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("AssetPathFetcher", 3)) {
                android.util.Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            hveVar.g(e);
        }
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    protected abstract java.lang.Object f(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException;

    protected abstract void g(java.lang.Object obj) throws java.io.IOException;

    @Override // defpackage.hvf
    public final void b() {
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adna {
    private final defpackage.admx a;
    private final java.lang.Object b;
    private volatile byte[] c;

    public adna(defpackage.admx admxVar, java.lang.Object obj) {
        this.a = admxVar;
        this.b = obj;
    }

    public static defpackage.admx a(defpackage.admy admyVar) {
        java.lang.Object obj = admyVar.c;
        return (defpackage.admx) (defpackage.admx.class.isInstance(obj) ? defpackage.admx.class.cast(obj) : null);
    }

    public final java.io.InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = defpackage.adnd.i(b());
                }
            }
        }
        return this.c;
    }
}

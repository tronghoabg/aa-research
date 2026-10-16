package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ibz implements defpackage.ibh {
    private final defpackage.iby a;
    private final defpackage.ifw b;

    public ibz(defpackage.iby ibyVar, defpackage.ifw ifwVar) {
        this.a = ibyVar;
        this.b = ifwVar;
    }

    @Override // defpackage.ibh
    public final void a(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap) throws java.io.IOException {
        java.io.IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            hxnVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.ibh
    public final void b() {
        this.a.a();
    }
}

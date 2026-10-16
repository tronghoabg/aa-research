package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbi extends defpackage.wbn {
    public wbi(defpackage.wbl wblVar, java.lang.String str, java.lang.Object obj) {
        super(wblVar, str, obj, false);
    }

    @Override // defpackage.wbn
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            try {
                return (defpackage.acbu) defpackage.abox.x(defpackage.acbu.a, android.util.Base64.decode((java.lang.String) obj, 3));
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", defpackage.wav.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}

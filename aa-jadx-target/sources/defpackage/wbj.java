package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wbj extends defpackage.wbn {
    final /* synthetic */ defpackage.wbk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbj(defpackage.wbl wblVar, java.lang.String str, java.lang.String str2, defpackage.wbk wbkVar) {
        super(wblVar, str, str2);
        this.a = wbkVar;
    }

    @Override // defpackage.wbn
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            try {
                return this.a.a(android.util.Base64.decode((java.lang.String) obj, 3));
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", defpackage.wav.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}

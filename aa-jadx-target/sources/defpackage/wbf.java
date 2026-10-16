package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbf extends defpackage.wbn {
    public wbf(defpackage.wbl wblVar, java.lang.String str, java.lang.Boolean bool, boolean z) {
        super(wblVar, str, bool, z);
    }

    @Override // defpackage.wbn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (defpackage.sye.c.matcher(str).matches()) {
                return java.lang.Boolean.TRUE;
            }
            if (defpackage.sye.d.matcher(str).matches()) {
                return java.lang.Boolean.FALSE;
            }
        }
        android.util.Log.e("PhenotypeFlag", defpackage.wav.b(obj, this, "Invalid boolean value for "));
        return null;
    }
}

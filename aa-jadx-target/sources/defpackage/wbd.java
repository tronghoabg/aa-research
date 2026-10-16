package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wbd extends defpackage.wbn {
    public wbd(defpackage.wbl wblVar, java.lang.String str, java.lang.Long l) {
        super(wblVar, str, l, true);
    }

    @Override // defpackage.wbn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", defpackage.wav.b(obj, this, "Invalid long value for "));
        return null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uwz extends defpackage.uxj {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/Texture");

    public uwz(java.lang.String str, int i, int i2) {
        super(str, null, i, i2);
    }

    final synchronized void a(android.graphics.Bitmap bitmap, int i, int i2) {
        int width;
        int height;
        boolean z = true;
        try {
            if (bitmap == null) {
                width = defpackage.vab.c(i, 1);
                height = defpackage.vab.c(i2, 1);
            } else {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            }
            int i3 = defpackage.uuy.a().b;
            if (width > i3 || height > i3) {
                throw new java.lang.IllegalArgumentException("Textures with dimensions " + width + "x" + height + " are larger than  the maximum supported size " + i3 + "x" + i3);
            }
            if (this.g == 1) {
                z = false;
            }
            if (bitmap == null) {
                ((defpackage.ype) ((defpackage.ype) a.g()).ai((char) 9718)).u("Null bitmap");
                return;
            }
            d(new defpackage.uvv(bitmap, z));
            bitmap.getRowBytes();
            bitmap.getHeight();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}

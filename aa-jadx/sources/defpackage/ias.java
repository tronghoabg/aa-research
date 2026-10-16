package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ias extends defpackage.iap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Paint paint = defpackage.icc.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (android.util.Log.isLoggable("TransformationUtils", 2)) {
                android.util.Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return defpackage.icc.c(hxnVar, bitmap, i, i2);
        }
        if (android.util.Log.isLoggable("TransformationUtils", 2)) {
            android.util.Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.ias;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return -670243078;
    }
}

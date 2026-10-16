package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iar extends defpackage.iap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        float height;
        float f;
        android.graphics.Paint paint = defpackage.icc.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int width = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float f2 = i2;
        float f3 = i;
        float width2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (width > height2) {
            height = f2 / bitmap.getHeight();
            f = 0.0f;
            width2 = (f3 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width3 = f3 / bitmap.getWidth();
            float height3 = (f2 - (bitmap.getHeight() * width3)) * 0.5f;
            height = width3;
            f = height3;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (f + 0.5f));
        android.graphics.Bitmap bitmapA = hxnVar.a(i, i2, defpackage.icc.b(bitmap));
        defpackage.icc.e(bitmap, bitmapA);
        defpackage.icc.d(bitmap, bitmapA, matrix);
        if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && android.util.Log.isLoggable("GlideMemoryTracking", 3))) {
            defpackage.igg.k("TransformationUtils [centerCrop]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapA;
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.iar;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return -599754482;
    }
}

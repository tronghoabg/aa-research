package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iat extends defpackage.iap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapA;
        android.graphics.Paint paint = defpackage.icc.a;
        int iMin = java.lang.Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = java.lang.Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        android.graphics.RectF rectF = new android.graphics.RectF(f4, f5, f2 + f4, f3 + f5);
        android.graphics.Bitmap.Config configA = defpackage.icc.a(bitmap);
        float f6 = f / 2.0f;
        if (configA.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = hxnVar.a(bitmap.getWidth(), bitmap.getHeight(), configA);
            new android.graphics.Canvas(bitmapA).drawBitmap(bitmap, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (android.graphics.Paint) null);
        }
        android.graphics.Bitmap bitmapA2 = hxnVar.a(iMin, iMin, defpackage.icc.a(bitmap));
        bitmapA2.setHasAlpha(true);
        defpackage.icc.c.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapA2);
            canvas.drawCircle(f6, f6, f6, defpackage.icc.a);
            canvas.drawBitmap(bitmapA, (android.graphics.Rect) null, rectF, defpackage.icc.b);
            canvas.setBitmap(null);
            defpackage.icc.c.unlock();
            if (!bitmapA.equals(bitmap)) {
                hxnVar.d(bitmapA);
            }
            return bitmapA2;
        } catch (java.lang.Throwable th) {
            defpackage.icc.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.iat;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return 1101716364;
    }
}

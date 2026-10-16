package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jrn extends defpackage.iap {
    private static final byte[] b = "BitmapPhoneOemShapeTransformation".getBytes(java.nio.charset.StandardCharsets.UTF_8);

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        canvas.drawPath(defpackage.lfx.b().a(i), paint);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.jrn;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return 1432406642;
    }
}

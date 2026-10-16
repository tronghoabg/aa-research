package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omw extends defpackage.iap {
    static final byte[] b = "BlurTransformation".getBytes();
    private final android.content.Context c;

    public omw(android.content.Context context) {
        this.c = context;
    }

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iap
    protected final android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, java.lang.Math.round(bitmap.getWidth() * 0.2f), java.lang.Math.round(bitmap.getHeight() * 0.2f), true);
        if (bitmapCreateScaledBitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888) {
            bitmapCreateScaledBitmap = bitmapCreateScaledBitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
        }
        android.content.Context context = this.c;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateScaledBitmap);
        android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(context);
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
        android.renderscript.Allocation allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(18.0f);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}

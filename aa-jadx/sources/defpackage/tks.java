package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tks extends defpackage.tkr {
    private final android.graphics.Paint b;
    private final android.graphics.Paint c;

    public tks(defpackage.tkv tkvVar) {
        super(tkvVar);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.b = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        this.c = paint2;
    }

    @Override // defpackage.tkv
    public final androidx.core.graphics.drawable.IconCompat b(java.lang.Object obj) {
        android.graphics.Bitmap bitmapD = this.a.b(obj).d();
        if (bitmapD == null) {
            throw new java.lang.IllegalStateException("Only IconCompat backed with a Bitmap are supported");
        }
        int iMin = java.lang.Math.min(bitmapD.getWidth(), bitmapD.getHeight());
        android.graphics.Bitmap.Config config = bitmapD.getConfig();
        config.getClass();
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, config);
        bitmapCreateBitmap.setDensity(bitmapD.getDensity());
        bitmapCreateBitmap.getClass();
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        e(canvas, this.b);
        canvas.drawBitmap(bitmapD, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.c);
        return androidx.core.graphics.drawable.IconCompat.k(bitmapCreateBitmap);
    }

    public abstract void e(android.graphics.Canvas canvas, android.graphics.Paint paint);
}

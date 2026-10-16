package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ibp implements defpackage.iga {
    @Override // defpackage.iga
    public final java.lang.Object a() {
        boolean z = false;
        if (android.os.Build.VERSION.SDK_INT == 34) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
            android.graphics.Bitmap bitmapCopy = bitmapCreateBitmap.copy(android.graphics.Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (android.util.Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                android.util.Log.v("GainmapWorkaroundCalc", defpackage.a.bQ(z, "calculateNeedsGainmapDecodeWorkaround="));
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}

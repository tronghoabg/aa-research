package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ian implements defpackage.huz {
    public static final defpackage.huv a = new defpackage.huv("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, defpackage.huv.a);
    public static final defpackage.huv b = new defpackage.huv("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, defpackage.huv.a);
    private final defpackage.hxu c;

    public ian(defpackage.hxu hxuVar) {
        this.c = hxuVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0078, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.huj
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.huw huwVar) throws java.lang.Throwable {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((defpackage.hxg) obj).c();
        android.graphics.Bitmap.CompressFormat compressFormat = (android.graphics.Bitmap.CompressFormat) huwVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? android.graphics.Bitmap.CompressFormat.PNG : android.graphics.Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = defpackage.igb.a;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((java.lang.Integer) huwVar.b(a)).intValue();
        java.io.OutputStream hvdVar = null;
        try {
            try {
                try {
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            defpackage.hxu hxuVar = this.c;
                            hvdVar = hxuVar != null ? new defpackage.hvd(fileOutputStream, hxuVar) : fileOutputStream;
                            bitmap.compress(compressFormat, iIntValue, hvdVar);
                            hvdVar.close();
                            this = 1;
                            hvdVar.close();
                        } catch (java.io.IOException e) {
                            e = e;
                            hvdVar = fileOutputStream;
                            if (android.util.Log.isLoggable("BitmapEncoder", 3)) {
                                android.util.Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            this = 0;
                            this = 0;
                            if (hvdVar != null) {
                                hvdVar.close();
                            }
                            if (android.util.Log.isLoggable("BitmapEncoder", 2)) {
                                android.util.Log.v("BitmapEncoder", "Compressed with type: " + java.lang.String.valueOf(compressFormat) + " of size " + defpackage.igg.a(bitmap) + " in " + defpackage.igb.a(jElapsedRealtimeNanos) + ", options format: " + java.lang.String.valueOf(huwVar.b(b)) + ", hasAlpha: " + bitmap.hasAlpha());
                            }
                            return this;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            hvdVar = fileOutputStream;
                            if (hvdVar != null) {
                                try {
                                    hvdVar.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.io.IOException e2) {
                        e = e2;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException unused2) {
            }
            if (android.util.Log.isLoggable("BitmapEncoder", 2)) {
                android.util.Log.v("BitmapEncoder", "Compressed with type: " + java.lang.String.valueOf(compressFormat) + " of size " + defpackage.igg.a(bitmap) + " in " + defpackage.igb.a(jElapsedRealtimeNanos) + ", options format: " + java.lang.String.valueOf(huwVar.b(b)) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return this;
        } catch (java.lang.Throwable th3) {
            throw th3;
        }
    }

    @Override // defpackage.huz
    public final int b() {
        return 2;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaby {
    static final android.graphics.Paint a;
    static final android.graphics.Bitmap.Config b;
    private static defpackage.aaby c;
    private android.graphics.Bitmap d;
    private android.graphics.Bitmap e;
    private android.graphics.Bitmap f;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-16777216);
        a = paint;
        b = android.graphics.Bitmap.Config.ARGB_8888;
    }

    public aaby() {
        synchronized (this) {
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public static synchronized defpackage.aaby h() {
        defpackage.aaby aabyVar;
        aabyVar = c;
        if (aabyVar == null) {
            aabyVar = new defpackage.aaby();
            c = aabyVar;
        }
        return aabyVar;
    }

    final synchronized android.graphics.Bitmap a() {
        int[] iArr;
        iArr = new int[defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE];
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr, 0, 257, -16777216);
        return android.graphics.Bitmap.createBitmap(iArr, 1, defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, b);
    }

    final synchronized android.graphics.Bitmap b(android.graphics.Canvas canvas) {
        android.graphics.Bitmap.Config config;
        android.graphics.Bitmap bitmapCreateBitmap;
        config = b;
        bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, config);
        canvas.setBitmap(bitmapCreateBitmap);
        android.graphics.Paint paint = a;
        canvas.drawRect(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 257.0f, 512.0f, 0.01f, paint);
        canvas.drawCircle(256.0f, 256.0f, 256.0f, paint);
        return bitmapCreateBitmap.copy(config, false);
    }

    final synchronized android.graphics.Bitmap c() {
        return android.graphics.Bitmap.createBitmap(new int[]{-16777216}, 1, 1, b);
    }

    public final synchronized android.graphics.Bitmap d() {
        if (this.e == null) {
            android.graphics.Bitmap bitmapA = a();
            this.e = bitmapA;
            bitmapA.isMutable();
        }
        return this.e;
    }

    public final android.graphics.Bitmap e(int i) {
        if (i == 0) {
            return d();
        }
        if (i == 1) {
            return g();
        }
        if (i != 2) {
            return i != 3 ? d() : d();
        }
        return f();
    }

    public final synchronized android.graphics.Bitmap f() {
        if (this.f == null) {
            android.graphics.Bitmap bitmapB = b(new android.graphics.Canvas());
            this.f = bitmapB;
            bitmapB.isMutable();
        }
        return this.f;
    }

    public final synchronized android.graphics.Bitmap g() {
        if (this.d == null) {
            android.graphics.Bitmap bitmapC = c();
            this.d = bitmapC;
            bitmapC.isMutable();
        }
        return this.d;
    }
}

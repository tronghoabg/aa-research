package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lgc {
    public final int a;
    public final android.graphics.Bitmap b;
    public final android.graphics.Bitmap c;
    public final android.graphics.Canvas d;
    public final android.graphics.Paint e;
    public final android.graphics.Paint f;
    public final byte[] g;
    public final int[] h;
    public final float[] i;
    public final float[] j;
    public final android.graphics.Rect k;
    public final android.graphics.Matrix l;
    public final android.graphics.Paint m;
    public final android.graphics.Canvas n;

    public lgc(int i, float f) {
        this.a = i;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ALPHA_8);
        this.b = bitmapCreateBitmap;
        this.d = new android.graphics.Canvas(bitmapCreateBitmap);
        int i2 = i * i;
        this.g = new byte[i2];
        this.h = new int[i2];
        this.i = new float[i];
        this.j = new float[i];
        this.k = new android.graphics.Rect();
        android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        this.c = bitmapCreateBitmap2;
        this.n = new android.graphics.Canvas(bitmapCreateBitmap2);
        android.graphics.Paint paint = new android.graphics.Paint(0);
        this.m = paint;
        paint.setColor(-1);
        android.graphics.Paint paint2 = new android.graphics.Paint(0);
        this.e = paint2;
        paint2.setColor(-65536);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.XOR));
        android.graphics.Paint paint3 = new android.graphics.Paint(0);
        this.f = paint3;
        paint3.setStrokeWidth(f + f);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setColor(-16777216);
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.l = new android.graphics.Matrix();
    }

    public static void a(float[] fArr, int i, int i2, int i3) {
        float f;
        int i4 = -1;
        float[] fArr2 = new float[fArr.length - 1];
        float f2 = Float.MAX_VALUE;
        for (int i5 = i2 + 1; i5 <= i3; i5++) {
            float f3 = fArr[i5];
            if (f3 > -1.0f) {
                if (f2 != Float.MAX_VALUE) {
                    float f4 = ((f3 - fArr[i4]) / (i5 - i4)) - f2;
                    float f5 = i;
                    if (f4 * f5 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        while (i4 > i2) {
                            i4--;
                            if ((((fArr[i5] - fArr[i4]) / (i5 - i4)) - fArr2[i4]) * f5 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                break;
                            }
                        }
                    }
                } else {
                    i4 = i2;
                }
                float f6 = fArr[i5] - fArr[i4];
                int i6 = i5 - i4;
                int i7 = i4;
                while (true) {
                    f = f6 / i6;
                    if (i7 >= i5) {
                        break;
                    }
                    fArr2[i7] = f;
                    fArr[i7] = fArr[i4] + (f * (i7 - i4));
                    i7++;
                }
                i4 = i5;
                f2 = f;
            }
        }
    }
}

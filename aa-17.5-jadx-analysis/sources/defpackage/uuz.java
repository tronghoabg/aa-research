package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uuz {
    public Bitmap a;
    public final byte[] b;
    public final usq c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final utc j;
    public ajll k;

    public uuz(byte[] bArr, int i, int i2, int i3, boolean z) {
        int iF;
        int iF2;
        if (uuc.a().a(z)) {
            iF = i2;
            iF2 = i3;
        } else {
            iF = f(i2);
            iF2 = f(i3);
            if (!g(i2) || !g(i3)) {
                byte[] bArr2 = new byte[i * iF * iF2];
                for (int i4 = 0; i4 < i3; i4++) {
                    System.arraycopy(bArr, i4 * i2 * i, bArr2, i4 * iF * i, i2 * i);
                }
                bArr = bArr2;
            }
            if (z) {
                i2 = iF;
                i3 = iF2;
            }
        }
        this.a = null;
        this.b = bArr;
        this.k = null;
        this.c = null;
        this.j = null;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = iF;
        this.h = iF2;
        this.i = z;
    }

    public static Bitmap e(Bitmap bitmap, Bitmap.Config config, boolean z) {
        if (g(bitmap.getWidth()) && g(bitmap.getHeight())) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iF = f(width);
        int iF2 = f(height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF2, config);
        if (bitmapCreateBitmap == null) {
            throw new OutOfMemoryError(a.bo(iF2, iF, "Could not allocate new bitmap of size ", " * "));
        }
        bitmapCreateBitmap.setDensity(bitmap.getDensity());
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        if (z) {
            canvas.drawBitmap(bitmap, new Rect(0, 0, width, height), new Rect(0, 0, iF, iF2), paint);
            return bitmapCreateBitmap;
        }
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        if (iF > width) {
            canvas.drawBitmap(bitmap, new Rect(width - 1, 0, width, height), new Rect(width, 0, width + 1, height), paint);
        }
        if (iF2 > height) {
            canvas.drawBitmap(bitmap, new Rect(0, height - 1, width, height), new Rect(0, height, width, height + 1), paint);
        }
        if (iF > width && iF2 > height) {
            canvas.drawBitmap(bitmap, new Rect(width - 1, height - 1, width, height), new Rect(width, height, width + 1, height + 1), paint);
        }
        return bitmapCreateBitmap;
    }

    public static int f(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 += i2;
        }
        return i2;
    }

    private static boolean g(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public final float a() {
        float f = this.e;
        float f2 = this.g;
        return ((f + f) - 1.0f) * (1.0f / (f2 + f2));
    }

    public final float b() {
        float f = this.f;
        float f2 = this.h;
        return ((f + f) - 1.0f) * (1.0f / (f2 + f2));
    }

    public final float c() {
        float f = this.g;
        return 1.0f / (f + f);
    }

    public final float d() {
        float f = this.h;
        return 1.0f / (f + f);
    }

    public uuz(utc utcVar, int i, int i2) {
        this.a = null;
        this.b = null;
        this.k = null;
        this.c = null;
        this.j = utcVar;
        this.d = 0;
        this.e = i;
        this.f = i2;
        this.g = i;
        this.h = i2;
        this.i = false;
    }

    public uuz(Bitmap bitmap, boolean z) {
        int width;
        int height;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        if (uuc.a().a(z)) {
            width = width2;
            height = height2;
        } else {
            bitmap = e(bitmap, bitmap.getConfig(), z);
            width = bitmap.getWidth();
            height = bitmap.getHeight();
            if (z) {
                width2 = width;
                height2 = height;
            }
        }
        this.a = bitmap;
        this.b = null;
        this.k = null;
        this.c = null;
        this.j = null;
        this.d = 0;
        this.e = width2;
        this.f = height2;
        this.g = width;
        this.h = height;
        this.i = z;
    }

    public uuz(usq usqVar, int i, int i2, int i3, int i4, boolean z) {
        this.a = null;
        this.b = null;
        this.k = null;
        this.c = usqVar;
        this.j = null;
        this.d = 0;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
    }
}

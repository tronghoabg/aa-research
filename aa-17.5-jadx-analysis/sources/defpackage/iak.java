package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class iak extends iag {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iag
    protected final Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapA;
        Paint paint = ibt.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap.Config configA = ibt.a(bitmap);
        float f6 = f / 2.0f;
        if (configA.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = hxeVar.a(bitmap.getWidth(), bitmap.getHeight(), configA);
            new Canvas(bitmapA).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
        Bitmap bitmapA2 = hxeVar.a(iMin, iMin, ibt.a(bitmap));
        bitmapA2.setHasAlpha(true);
        ibt.c.lock();
        try {
            Canvas canvas = new Canvas(bitmapA2);
            canvas.drawCircle(f6, f6, f6, ibt.a);
            canvas.drawBitmap(bitmapA, (Rect) null, rectF, ibt.b);
            canvas.setBitmap(null);
            ibt.c.unlock();
            if (!bitmapA.equals(bitmap)) {
                hxeVar.d(bitmapA);
            }
            return bitmapA2;
        } catch (Throwable th) {
            ibt.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        return obj instanceof iak;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return 1101716364;
    }
}

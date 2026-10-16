package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class iai extends iag {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.iag
    protected final Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2) {
        float height;
        float f;
        Paint paint = ibt.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float f2 = i2;
        float f3 = i;
        float width2 = BitmapDescriptorFactory.HUE_RED;
        if (width > height2) {
            height = f2 / bitmap.getHeight();
            f = 0.0f;
            width2 = (f3 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width3 = f3 / bitmap.getWidth();
            float height3 = (f2 - (bitmap.getHeight() * width3)) * 0.5f;
            height = width3;
            f = height3;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (f + 0.5f));
        Bitmap bitmapA = hxeVar.a(i, i2, ibt.b(bitmap));
        ibt.e(bitmap, bitmapA);
        ibt.d(bitmap, bitmapA, matrix);
        if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && Log.isLoggable("GlideMemoryTracking", 3))) {
            ify.k("TransformationUtils [centerCrop]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapA;
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        return obj instanceof iai;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return -599754482;
    }
}

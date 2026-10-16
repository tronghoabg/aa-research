package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m8093ActualImageBitmapx__hDU(int i2, int i3, int i4, boolean z, ColorSpace colorSpace) {
        m8094toBitmapConfig1JJdX4A(i4);
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, m8094toBitmapConfig1JJdX4A(i4), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace)));
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    public static final ImageBitmap createImageBitmap(byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m8094toBitmapConfig1JJdX4A(int i2) {
        return ImageBitmapConfig.m8468equalsimpl0(i2, ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ()) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.m8468equalsimpl0(i2, ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ()) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.m8468equalsimpl0(i2, ImageBitmapConfig.Companion.m8476getRgb565_sVssgQ()) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.m8468equalsimpl0(i2, ImageBitmapConfig.Companion.m8474getF16_sVssgQ()) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.m8468equalsimpl0(i2, ImageBitmapConfig.Companion.m8475getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ() : config == Bitmap.Config.RGB_565 ? ImageBitmapConfig.Companion.m8476getRgb565_sVssgQ() : config == Bitmap.Config.ARGB_4444 ? ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ() : config == Bitmap.Config.RGBA_F16 ? ImageBitmapConfig.Companion.m8474getF16_sVssgQ() : config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.Companion.m8475getGpu_sVssgQ() : ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
    }
}

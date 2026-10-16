package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m8477ImageBitmapx__hDU(int i2, int i3, int i4, boolean z, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m8093ActualImageBitmapx__hDU(i2, i3, i4, z, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m8478ImageBitmapx__hDU$default(int i2, int i3, int i4, boolean z, ColorSpace colorSpace, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
        }
        boolean z2 = z | (!((i5 & 8) == 0));
        if ((i5 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m8477ImageBitmapx__hDU(i2, i3, i4, z2, colorSpace);
    }

    public static final ImageBitmap decodeToImageBitmap(byte[] bArr) {
        return AndroidImageBitmap_androidKt.createImageBitmap(bArr);
    }

    public static final PixelMap toPixelMap(ImageBitmap imageBitmap, int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) {
        imageBitmap.readPixels(iArr, i2, i3, i4, i5, i6, i7);
        return new PixelMap(iArr, i4, i5, i6, i7);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        int width = (i8 & 4) != 0 ? imageBitmap.getWidth() : i4;
        int height = (i8 & 8) != 0 ? imageBitmap.getHeight() : i5;
        int[] iArr2 = (i8 & 16) != 0 ? new int[width * height] : iArr;
        int i11 = i8 & 1;
        int i12 = (i8 & 2) != 0 ? 0 : i3;
        int i13 = 1 == i11 ? 0 : i2;
        int i14 = (i8 & 32) == 0 ? i6 : 0;
        if ((i8 & 64) != 0) {
            i10 = width;
            i9 = i10;
        } else {
            i9 = i7;
            i10 = width;
        }
        return toPixelMap(imageBitmap, i13, i12, i10, height, iArr2, i14, i9);
    }
}

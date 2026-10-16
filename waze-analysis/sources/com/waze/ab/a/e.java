package com.waze.ab.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements d {
    @Override // com.waze.ab.a.d
    public final void a(String str, int i2, int i3) {
        h.g.b.x.f(str, "fileName");
        com.waze.sharedui.utils.f.k(str, i2, i3);
    }

    @Override // com.waze.ab.a.d
    public final String b(String str, String str2, int i2, int i3) {
        int i4;
        Bitmap bitmapCreateBitmap;
        h.g.b.x.f(str, "originalImagePath");
        h.g.b.x.f(str2, "outputImageName");
        h.g.b.x.f(str, "originalImagePath");
        h.g.b.x.f(str2, "outputImageName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.waze.shared_infra.i.h.b("FallBackImageCrop", "cropAndScaleImage: Failed to decode bounds for ".concat(String.valueOf(str)));
            return null;
        }
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        int iH = h.k.n.h(i2, i3);
        if (i6 > iH || i5 > iH) {
            int i7 = i6 / 2;
            int i8 = i5 / 2;
            i4 = 1;
            while (i7 / i4 >= iH && i8 / i4 >= iH) {
                i4 += i4;
            }
        } else {
            i4 = 1;
        }
        int i9 = 0;
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (bitmapDecodeFile == null) {
                com.waze.shared_infra.i.h.d("FallBackImageCrop", "cropAndScaleImage: Failed decoding file, resulting bitmap is null for ".concat(String.valueOf(str)));
                return null;
            }
            int width = bitmapDecodeFile.getWidth();
            long j2 = width;
            int height = bitmapDecodeFile.getHeight();
            long j3 = height;
            if (j2 > j3) {
                width = (int) j3;
            } else if (j3 > j2) {
                height = (int) j2;
            }
            int width2 = (bitmapDecodeFile.getWidth() - width) / 2;
            int height2 = (bitmapDecodeFile.getHeight() - height) / 2;
            if (width2 < 0) {
                com.waze.shared_infra.i.h.k("FallBackImageCrop", "cropAndScaleImage: Calculated crop x < 0 (" + width2 + "), adjusting to 0. Captured width: " + bitmapDecodeFile.getWidth() + ", cropWidth: " + width);
                width2 = 0;
            }
            if (height2 < 0) {
                com.waze.shared_infra.i.h.k("FallBackImageCrop", "cropAndScaleImage: Calculated crop y < 0 (" + height2 + "), adjusting to 0. Captured height: " + bitmapDecodeFile.getHeight() + ", cropHeight: " + height);
            } else {
                i9 = height2;
            }
            if (width2 + width > bitmapDecodeFile.getWidth()) {
                width = bitmapDecodeFile.getWidth() - width2;
                com.waze.shared_infra.i.h.k("FallBackImageCrop", "cropAndScaleImage: Adjusted cropWidth to " + width + " to fit within bitmap bounds.");
            }
            if (i9 + height > bitmapDecodeFile.getHeight()) {
                height = bitmapDecodeFile.getHeight() - i9;
                com.waze.shared_infra.i.h.k("FallBackImageCrop", "cropAndScaleImage: Adjusted cropHeight to " + height + " to fit within bitmap bounds.");
            }
            if (width <= 0 || height <= 0) {
                com.waze.shared_infra.i.h.d("FallBackImageCrop", "cropAndScaleImage: Invalid crop dimensions (width: " + width + ", height: " + height + ") for " + str);
                bitmapDecodeFile.recycle();
                return null;
            }
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, width2, i9, width, height);
                h.g.b.x.c(bitmapCreateBitmap);
                if (!h.g.b.x.n(bitmapDecodeFile, bitmapCreateBitmap)) {
                    bitmapDecodeFile.recycle();
                }
            } catch (Exception e2) {
                com.waze.shared_infra.i.h.f("FallBackImageCrop", "cropAndScaleImage: Error creating cropped bitmap for ".concat(String.valueOf(str)), e2);
                bitmapDecodeFile.recycle();
            }
            try {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i3, true);
                h.g.b.x.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                if (!h.g.b.x.n(bitmapCreateBitmap, bitmapCreateScaledBitmap)) {
                    bitmapCreateBitmap.recycle();
                }
                String strC = com.waze.shared_infra.s.h.c(bitmapCreateScaledBitmap, str2);
                bitmapCreateScaledBitmap.recycle();
                return strC;
            } catch (Exception e3) {
                com.waze.shared_infra.i.h.f("FallBackImageCrop", "cropAndScaleImage: Error scaling bitmap for " + str + " to " + i2 + " x " + i3, e3);
                bitmapCreateBitmap.recycle();
                return null;
            }
        } catch (Exception e4) {
            com.waze.shared_infra.i.h.f("FallBackImageCrop", "cropAndScaleImage: Failed decoding file " + str + " with sampleSize " + i4, e4);
        }
    }
}

package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class uwc extends uwm {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/Texture");

    public uwc(String str, int i, int i2) {
        super(str, null, i, i2);
    }

    final synchronized void a(Bitmap bitmap, int i, int i2) {
        int width;
        int height;
        boolean z = true;
        if (bitmap == null) {
            width = uzg.c(i, 1);
            height = uzg.c(i2, 1);
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        int i3 = uuc.a().b;
        if (width > i3 || height > i3) {
            throw new IllegalArgumentException("Textures with dimensions " + width + "x" + height + " are larger than  the maximum supported size " + i3 + "x" + i3);
        }
        if (this.g == 1) {
            z = false;
        }
        if (bitmap == null) {
            ((ynz) ((ynz) a.g()).ai((char) 9690)).u("Null bitmap");
            return;
        }
        d(new uuz(bitmap, z));
        bitmap.getRowBytes();
        bitmap.getHeight();
    }
}

package com.carstream.tech.launcher;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class AppIcon {
    private static final Map<String, Bitmap> CACHE = new HashMap();

    private AppIcon() {
    }

    public static void clearCache() {
        CACHE.clear();
    }

    private static boolean fullBleed(Drawable drawable, int i) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, 24, 24);
            drawable.draw(canvas);
            int[][] iArr = {new int[]{2, 2}, new int[]{21, 2}, new int[]{2, 21}, new int[]{21, 21}};
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr2 = iArr[i3];
                if (Color.alpha(bitmapCreateBitmap.getPixel(iArr2[0], iArr2[1])) > 200) {
                    i2++;
                }
            }
            bitmapCreateBitmap.recycle();
            return i2 >= 3;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static Bitmap get(String str, Drawable drawable, int i, boolean z) {
        String str2 = str + "@" + i + (z ? "n" : "d");
        Map<String, Bitmap> map = CACHE;
        Bitmap bitmap = map.get(str2);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapRender = render(drawable, i, z);
        if (bitmapRender != null) {
            map.put(str2, bitmapRender);
        }
        return bitmapRender;
    }

    private static Path maskPath(int i) {
        try {
            AdaptiveIconDrawable adaptiveIconDrawable = new AdaptiveIconDrawable(new ColorDrawable(0), new ColorDrawable(0));
            adaptiveIconDrawable.setBounds(0, 0, i, i);
            Path iconMask = adaptiveIconDrawable.getIconMask();
            if (iconMask != null) {
                if (!iconMask.isEmpty()) {
                    return iconMask;
                }
            }
        } catch (Throwable unused) {
        }
        Path path = new Path();
        float f = i;
        float f2 = 0.25f * f;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f), f2, f2, Path.Direction.CW);
        return path;
    }

    private static Bitmap render(Drawable drawable, int i, boolean z) {
        if (drawable != null && i > 0) {
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if ((drawable instanceof AdaptiveIconDrawable) || fullBleed(drawable, i)) {
                    drawable.setBounds(0, 0, i, i);
                    drawable.draw(canvas);
                } else {
                    Paint paint = new Paint(1);
                    paint.setColor(z ? -13882322 : -1);
                    float f = i;
                    canvas.drawRect(0.0f, 0.0f, f, f, paint);
                    int iRound = Math.round(f * 0.16f);
                    int i2 = i - iRound;
                    drawable.setBounds(iRound, iRound, i2, i2);
                    drawable.draw(canvas);
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i, config);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                canvas2.drawPath(maskPath(i), paint2);
                Paint paint3 = new Paint(1);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint3);
                bitmapCreateBitmap2.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

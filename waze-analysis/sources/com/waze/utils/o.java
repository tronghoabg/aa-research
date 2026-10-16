package com.waze.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {
    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void b(ImageView imageView, int i2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, 1.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public static void c(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static Bitmap d(String str) throws Throwable {
        Throwable th;
        IOException e2;
        InputStream inputStreamOpenStream;
        MalformedURLException e3;
        OutOfMemoryError e4;
        FileNotFoundException e5;
        URL url;
        ?? r1 = 0;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                url = new URL(str);
                inputStreamOpenStream = url.openStream();
            } catch (Throwable th2) {
                th = th2;
                r1 = str;
                c(r1);
                throw th;
            }
        } catch (FileNotFoundException e6) {
            e5 = e6;
            inputStreamOpenStream = null;
        } catch (OutOfMemoryError e7) {
            e4 = e7;
            inputStreamOpenStream = null;
        } catch (MalformedURLException e8) {
            e3 = e8;
            inputStreamOpenStream = null;
        } catch (IOException e9) {
            e2 = e9;
            inputStreamOpenStream = null;
        } catch (Throwable th3) {
            th = th3;
            c(r1);
            throw th;
        }
        if (inputStreamOpenStream == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i2 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenStream, null, options);
            if (!options.mCancel && options.outWidth != -1 && options.outHeight != -1) {
                double d2 = options.outWidth;
                double d3 = options.outHeight;
                int iCeil = (int) Math.ceil(Math.sqrt((d2 * d3) / 262144.0d));
                int iMin = (int) Math.min(Math.floor(d2 / 250.0d), Math.floor(d3 / 250.0d));
                if (iMin >= iCeil) {
                    iCeil = iMin;
                }
                if (iCeil <= 8) {
                    while (i2 < iCeil) {
                        i2 += i2;
                    }
                } else {
                    i2 = ((iCeil + 7) / 8) * 8;
                }
                options.inSampleSize = i2;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                c(inputStreamOpenStream);
                inputStreamOpenStream = url.openStream();
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream, null, options);
            }
        } catch (FileNotFoundException e10) {
            e5 = e10;
            Log.e("Util", "Got fnf exception " + e5.toString());
            c(inputStreamOpenStream);
            return bitmapDecodeStream;
        } catch (OutOfMemoryError e11) {
            e4 = e11;
            Log.e("Util", "Got oom exception " + e4.toString());
            c(inputStreamOpenStream);
            return bitmapDecodeStream;
        } catch (MalformedURLException e12) {
            e3 = e12;
            Log.e("Util", "Got bad url exception " + e3.toString());
            c(inputStreamOpenStream);
            return bitmapDecodeStream;
        } catch (IOException e13) {
            e2 = e13;
            Log.e("Util", "Got io exception " + e2.toString());
            c(inputStreamOpenStream);
            return bitmapDecodeStream;
        }
        c(inputStreamOpenStream);
        return bitmapDecodeStream;
    }

    public static int e(f fVar) {
        return fVar.b();
    }
}

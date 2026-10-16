package com.waze.map;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.waze.R;
import com.waze.mg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static float f27982a;

    /* renamed from: b, reason: collision with root package name */
    private static Typeface f27983b;

    /* renamed from: c, reason: collision with root package name */
    private static Typeface f27984c;

    /* renamed from: d, reason: collision with root package name */
    private static final b f27985d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static int f27986e = 0;

    public static b c() {
        return f27985d;
    }

    private static final void d(Paint paint, String str, CanvasFont$TextMetrics canvasFont$TextMetrics) {
        int length = str.length();
        if (length > 3) {
            length = 3;
        }
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvasFont$TextMetrics.mBaseLine = -paint.ascent();
        canvasFont$TextMetrics.mAscent = (int) (paint.ascent() + 0.5f);
        canvasFont$TextMetrics.mDescent = (int) (paint.descent() + 0.5f);
        canvasFont$TextMetrics.mHeight = (int) (((canvasFont$TextMetrics.mBaseLine + paint.descent()) * (((length - 1) * 0.2d) + 1.0d)) + 0.5d);
        int iMeasureText = (int) (paint.measureText(str) + 0.5f);
        canvasFont$TextMetrics.mWidth = iMeasureText;
        canvasFont$TextMetrics.mWidthOrig = iMeasureText;
        canvasFont$TextMetrics.mHeightOrig = (int) (canvasFont$TextMetrics.mBaseLine + paint.descent() + 0.5f);
    }

    private static final Paint e(int i2, boolean z, int i3) throws Resources.NotFoundException {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(i2);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setLetterSpacing(0.04f);
        if ((i3 & 1) > 0) {
            Typeface font = f27983b;
            if (font == null) {
                font = mg.a().getResources().getFont(R.font.roboto_bold);
                f27983b = font;
            }
            paint.setTypeface(font);
        } else {
            Typeface font2 = f27984c;
            if (font2 == null) {
                font2 = mg.a().getResources().getFont(R.font.roboto_regular);
                f27984c = font2;
            }
            paint.setTypeface(font2);
        }
        paint.setColor(-1);
        if (!z) {
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.round(f27982a * 2.5f));
        paint.setStrokeMiter(Math.round(f27982a));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setLetterSpacing(0.06f);
        return paint;
    }

    public final Bitmap a(String str, int i2, boolean z, int i3, Bitmap.Config config, CanvasFont$TextMetrics canvasFont$TextMetrics) throws Resources.NotFoundException, IOException {
        int i4;
        Paint paintE = e(i2, z, i3);
        d(paintE, str, canvasFont$TextMetrics);
        int i5 = canvasFont$TextMetrics.mWidth;
        if (i5 <= 0 || (i4 = canvasFont$TextMetrics.mHeight) <= 0) {
            canvasFont$TextMetrics.mWidth = 0;
            canvasFont$TextMetrics.mHeight = 0;
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i4, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i6 = canvasFont$TextMetrics.mHeight - canvasFont$TextMetrics.mHeightOrig;
        canvas.drawText(str, canvasFont$TextMetrics.mWidth / 2, canvasFont$TextMetrics.mBaseLine + (i6 / 2), paintE);
        if (f27986e == -1) {
            try {
                byte[] bArr = new byte[bitmapCreateBitmap.getByteCount()];
                bitmapCreateBitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
                long j2 = com.waze.t.f40624a;
                File file = new File(com.waze.t.f(mg.a()) + "/waze/TestText_" + str + "_" + bitmapCreateBitmap.getWidth() + "_" + bitmapCreateBitmap.getHeight() + "_size_" + i2 + ".raw");
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            f27986e++;
        }
        return bitmapCreateBitmap;
    }

    public final CanvasFont$TextMetrics b(String str, int i2, boolean z, int i3) throws Resources.NotFoundException {
        Paint paintE = e(i2, z, i3);
        CanvasFont$TextMetrics canvasFont$TextMetrics = new CanvasFont$TextMetrics();
        d(paintE, str, canvasFont$TextMetrics);
        if (canvasFont$TextMetrics.mWidth > 0 && canvasFont$TextMetrics.mHeight > 0) {
            return canvasFont$TextMetrics;
        }
        canvasFont$TextMetrics.mWidth = 0;
        canvasFont$TextMetrics.mHeight = 0;
        return canvasFont$TextMetrics;
    }
}

package com.carstream.tech.core.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.graphics.PathParser;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SplashArt extends View {
    public static final int L = Color.parseColor("#FFF1E6");
    public static final int M = Color.parseColor("#E2542F");
    public static final int N = Color.parseColor("#A33716");
    public static final int O = Color.parseColor("#C98A6D");
    public final Path A;
    public final Matrix B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final Path K;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public final Paint y;
    public final RectF z;

    public SplashArt(Context context) {
        super(context);
        this.a = 1.0f;
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = -2.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = false;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 1.0f;
        this.v = 0.0f;
        this.w = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.z = new RectF();
        this.A = new Path();
        this.B = new Matrix();
        this.C = PathParser.createPathFromPathData("M2,27.4 C2,22.6 3.8,20.8 7.6,20.6 L89,19 C95,19.4 98.2,22.4 98.4,27 L98.4,30.4 C98.4,32.4 96.8,33.2 94.4,33.2 L84.5,33.2 A8.5,8.5 0 0 0 67.5,33.2 L34.5,33.2 A8.5,8.5 0 0 0 17.5,33.2 L8,33.2 C4.2,33.2 2,31.8 2,29.4 Z");
        this.D = PathParser.createPathFromPathData("M19,21 L27.5,7.6 C28.8,6 30.4,5.4 32.6,5.4 L57.6,5.4 C60.2,5.4 62,6.2 63.4,8 L72.6,20.2 Z");
        this.E = PathParser.createPathFromPathData("M25.2,18.6 L31.4,9.2 C32,8.6 32.6,8.4 33.6,8.4 L47.2,8.4 L47.2,18.6 Z");
        this.F = PathParser.createPathFromPathData("M49.8,8.4 L57.4,8.4 C58.4,8.4 59,8.8 59.6,9.6 L66.2,18.6 L49.8,18.6 Z");
        this.G = PathParser.createPathFromPathData("M372.17,364.5 L406.97,384 L372.17,403.5 Z");
        this.H = PathParser.createPathFromPathData("M25.2,26.6 h1.6 v3.2 h-1.6 z M25.2,36.6 h1.6 v3.2 h-1.6 z");
        this.I = PathParser.createPathFromPathData("M75.2,26.6 h1.6 v3.2 h-1.6 z M75.2,36.6 h1.6 v3.2 h-1.6 z");
        this.J = PathParser.createPathFromPathData("M84,338 h34 v9 h-34 z M152,338 h34 v9 h-34 z M220,338 h34 v9 h-34 z M288,338 h34 v9 h-34 z M356,338 h34 v9 h-34 z M424,338 h34 v9 h-34 z M492,338 h34 v9 h-34 z");
        this.K = PathParser.createPathFromPathData("M389,381 h30 v22 h-30 z M394,381 v-7 a10,10 0 0 1 20,0 v7 h-6 v-7 a4,4 0 0 0 -8,0 v7 z");
    }

    public static int a(float f) {
        return Math.max(0, Math.min(255, Math.round(f * 255.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fMin = Math.min(getWidth(), getHeight());
        if (fMin <= 0.0f) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate((getWidth() - fMin) / 2.0f, (getHeight() - fMin) / 2.0f);
        float f = fMin / 512.0f;
        canvas.scale(f, f);
        float f2 = this.a;
        canvas.scale(f2, f2, 256.0f, 256.0f);
        int iA = a(this.b);
        Paint paint = this.y;
        int i = L;
        if (iA != 0) {
            int iSave2 = canvas.save();
            RectF rectF = this.z;
            rectF.set(76.8f, 120.32f, 435.2f, 355.84f);
            Path path = this.A;
            path.reset();
            path.addRoundRect(rectF, 35.84f, 30.62f, Path.Direction.CW);
            canvas.clipPath(path);
            int i2 = M;
            paint.setColor(i2);
            paint.setAlpha(iA);
            canvas.drawRect(rectF, paint);
            int iA2 = a(this.c * this.b);
            if (iA2 != 0) {
                paint.setColor(i);
                float f3 = iA2;
                paint.setAlpha((int) (0.34f * f3));
                canvas.drawRect(76.8f, 120.32f, 435.2f, 167.42f, paint);
                if (!this.q) {
                    paint.setAlpha(iA2);
                    canvas.drawCircle(109.05f, 143.87f, 10.75f, paint);
                    paint.setAlpha((int) (f3 * 0.6f));
                    canvas.drawCircle(148.5f, 143.87f, 10.75f, paint);
                }
            }
            int iA3 = a(this.p * this.b);
            if (iA3 != 0) {
                int iSave3 = canvas.save();
                canvas.translate(this.o, 0.0f);
                paint.setColor(i);
                paint.setAlpha(iA3);
                canvas.drawPath(this.J, paint);
                canvas.restoreToCount(iSave3);
            }
            int iA4 = a(this.e * this.b);
            if (iA4 != 0) {
                int iSave4 = canvas.save();
                canvas.translate(this.d * 358.4f, 0.0f);
                canvas.translate(this.r, this.t);
                float f4 = this.s;
                if (f4 != 0.0f) {
                    canvas.rotate(f4, 256.0f, 296.0f);
                }
                Matrix matrix = this.B;
                matrix.reset();
                matrix.setScale(3.0464f, 3.0464f);
                matrix.postTranslate(98.28f, 195.59f);
                canvas.concat(matrix);
                canvas.translate(0.0f, this.m);
                float f5 = this.n;
                if (f5 != 0.0f) {
                    canvas.rotate(f5, 50.0f, 26.0f);
                }
                paint.setColor(i);
                paint.setAlpha(iA4);
                canvas.drawPath(this.C, paint);
                canvas.drawPath(this.D, paint);
                canvas.drawCircle(26.0f, 33.2f, 7.4f, paint);
                canvas.drawCircle(76.0f, 33.2f, 7.4f, paint);
                paint.setColor(i2);
                paint.setAlpha(iA4);
                canvas.drawPath(this.E, paint);
                canvas.drawPath(this.F, paint);
                canvas.drawCircle(26.0f, 33.2f, 3.2f, paint);
                canvas.drawCircle(76.0f, 33.2f, 3.2f, paint);
                int iA5 = a(this.l * this.e * this.b);
                if (iA5 != 0) {
                    paint.setColor(i2);
                    paint.setAlpha(iA5);
                    int iSave5 = canvas.save();
                    canvas.rotate(this.k, 26.0f, 33.2f);
                    canvas.drawPath(this.H, paint);
                    canvas.restoreToCount(iSave5);
                    int iSave6 = canvas.save();
                    canvas.rotate(this.k, 76.0f, 33.2f);
                    canvas.drawPath(this.I, paint);
                    canvas.restoreToCount(iSave6);
                }
                canvas.restoreToCount(iSave4);
            }
            float f6 = this.f;
            if (f6 >= -1.5f && f6 <= 2.5f) {
                float f7 = (f6 * 358.4f) + 76.8f;
                paint.setColor(i);
                paint.setAlpha((int) (a(this.b) * 0.3f));
                canvas.drawRect(f7, 120.32f, f7 + 107.520004f, 355.84f, paint);
            }
            canvas.restoreToCount(iSave2);
        }
        boolean z = this.q;
        int i3 = N;
        if (z) {
            int iA6 = a(this.x * this.b);
            if (iA6 > 0) {
                paint.setColor(i3);
                paint.setAlpha(iA6);
                canvas.drawCircle(404.0f, 384.0f, this.w * 40.0f, paint);
            }
        } else {
            int iA7 = a(this.j * this.b);
            if (iA7 != 0) {
                paint.setColor(i3);
                paint.setAlpha(iA7);
                canvas.drawCircle(384.0f, 384.0f, this.i * 59.4f, paint);
            }
        }
        int iA8 = a(this.h * this.b);
        if (iA8 != 0) {
            if (this.q) {
                paint.setColor(i);
                paint.setAlpha(iA8);
                canvas.drawCircle(404.0f, 384.0f, 51.0f, paint);
                int iSave7 = canvas.save();
                float f8 = this.u;
                canvas.scale(f8, f8, 404.0f, 384.0f);
                canvas.rotate(this.v, 404.0f, 384.0f);
                paint.setColor(i3);
                paint.setAlpha(iA8);
                canvas.drawCircle(404.0f, 384.0f, 40.0f, paint);
                paint.setColor(i);
                paint.setAlpha(iA8);
                canvas.drawPath(this.K, paint);
                canvas.restoreToCount(iSave7);
            } else {
                int iSave8 = canvas.save();
                float f9 = this.g;
                canvas.scale(f9, f9, 384.0f, 384.0f);
                paint.setColor(i);
                paint.setAlpha(iA8);
                canvas.drawCircle(384.0f, 384.0f, 59.4f, paint);
                paint.setColor(i3);
                paint.setAlpha(iA8);
                canvas.drawCircle(384.0f, 384.0f, 51.2f, paint);
                paint.setColor(i);
                paint.setAlpha(iA8);
                canvas.drawPath(this.G, paint);
                canvas.restoreToCount(iSave8);
            }
        }
        canvas.restoreToCount(iSave);
    }
}

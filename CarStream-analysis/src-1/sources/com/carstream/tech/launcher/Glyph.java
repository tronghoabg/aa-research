package com.carstream.tech.launcher;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class Glyph extends View {
    public static final int BOLT = 16;
    public static final int BT = 9;
    public static final int CLOSE = 13;
    public static final int CLOUD = 17;
    public static final int GAUGE = 14;
    public static final int GEAR = 12;
    public static final int MINUS = 4;
    public static final int MOON = 10;
    public static final int MUTE = 7;
    public static final int NEXT = 3;
    public static final int PAUSE = 2;
    public static final int PIN = 15;
    public static final int PIN_DIEN = 19;
    public static final int PLAY = 1;
    public static final int PLUS = 5;
    public static final int PREV = 0;
    public static final int RAIN = 18;
    public static final int SPEAKER = 6;
    public static final int SUN = 11;
    public static final int WIFI = 8;
    private int color;
    private int kind;
    private final Paint p;

    public Glyph(Context context, int i, int i2) {
        super(context);
        this.p = new Paint(1);
        this.kind = i;
        this.color = i2;
        setClickable(true);
    }

    private static void boTron(Paint paint, float f) {
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(Math.max(1.5f, f * 0.16f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private static Path circle(float f, float f2, float f3) {
        Path path = new Path();
        path.addCircle(f, f2, f3, Path.Direction.CW);
        return path;
    }

    private static Path rect(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.addRect(new RectF(f, f2, f3, f4), Path.Direction.CW);
        return path;
    }

    private static Path tamGiac(float f, float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f, f2 - f3);
        path.lineTo((f4 * f3 * f5) + f, f2);
        path.lineTo(f, f2 + f3);
        path.close();
        return path;
    }

    public static void ve(Canvas canvas, Paint paint, int i, float f, float f2, float f3, int i2) {
        paint.setColor(i2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(null);
        switch (i) {
            case 0:
            case 3:
                boTron(paint, f3);
                float f4 = i != 3 ? -1.0f : 1.0f;
                float f5 = 0.8f * f3;
                float f6 = f4 * f3;
                canvas.drawPath(tamGiac(f - (0.92f * f6), f2, f5, f4, 1.42f), paint);
                canvas.drawPath(tamGiac((f6 * 0.1f) + f, f2, f5, f4, 1.42f), paint);
                break;
            case 1:
                boTron(paint, f3);
                canvas.drawPath(tamGiac(f - (f3 * 0.55f), f2, 0.86f * f3, 1.0f, 1.64f), paint);
                break;
            case 2:
                boTron(paint, f3);
                float f7 = f3 * 0.34f;
                float f8 = f3 * 0.26f;
                float f9 = 0.34f * f7;
                float f10 = f - f8;
                float f11 = f2 - f3;
                float f12 = f2 + f3;
                canvas.drawRoundRect(new RectF(f10 - f7, f11, f10, f12), f9, f9, paint);
                float f13 = f + f8;
                canvas.drawRoundRect(new RectF(f13, f11, f7 + f13, f12), f9, f9, paint);
                break;
            case 4:
            case 5:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, 0.3f * f3));
                paint.setStrokeCap(Paint.Cap.ROUND);
                canvas.drawLine(f - f3, f2, f + f3, f2, paint);
                if (i == 5) {
                    canvas.drawLine(f, f2 - f3, f, f2 + f3, paint);
                    break;
                }
                break;
            case 6:
            case 7:
                paint.setStyle(style);
                Path path = new Path();
                float f14 = f - f3;
                float f15 = f3 * 0.42f;
                float f16 = f2 - f15;
                path.moveTo(f14, f16);
                float f17 = f - (0.35f * f3);
                path.lineTo(f17, f16);
                float f18 = (0.25f * f3) + f;
                path.lineTo(f18, f2 - f3);
                path.lineTo(f18, f2 + f3);
                float f19 = f15 + f2;
                path.lineTo(f17, f19);
                path.lineTo(f14, f19);
                path.close();
                canvas.drawPath(path, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, f3 * 0.2f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                if (i == 7) {
                    float f20 = (0.5f * f3) + f;
                    float f21 = 0.45f * f3;
                    float f22 = f2 - f21;
                    float f23 = (1.05f * f3) + f;
                    float f24 = f21 + f2;
                    canvas.drawLine(f20, f22, f23, f24, paint);
                    canvas.drawLine(f23, f22, f20, f24, paint);
                    break;
                } else {
                    float f25 = 0.62f * f3;
                    canvas.drawArc(new RectF((f3 * 0.1f) + f, f2 - f25, (f3 * 0.95f) + f, f25 + f2), -55.0f, 110.0f, false, paint);
                    break;
                }
            case 8:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, 0.24f * f3));
                paint.setStrokeCap(Paint.Cap.ROUND);
                float f26 = (f3 * 0.72f) + f2;
                for (int i3 = 3; i3 >= 1; i3--) {
                    float f27 = ((i3 * 0.36f) + 0.16f) * f3;
                    canvas.drawArc(new RectF(f - f27, f26 - f27, f + f27, f27 + f26), -145.0f, 110.0f, false, paint);
                }
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f, f26, Math.max(1.6f, 0.15f * f3), paint);
                break;
            case 9:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, f3 * 0.22f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                Path path2 = new Path();
                float f28 = f - (0.62f * f3);
                float f29 = f3 * 0.42f;
                path2.moveTo(f28, f2 - f29);
                float f30 = (f3 * 0.52f) + f;
                float f31 = 0.46f * f3;
                path2.lineTo(f30, f2 + f31);
                float f32 = f3 * 0.95f;
                path2.lineTo(f, f2 + f32);
                path2.lineTo(f, f2 - f32);
                path2.lineTo(f30, f2 - f31);
                path2.lineTo(f28, f29 + f2);
                canvas.drawPath(path2, paint);
                break;
            case 10:
                paint.setStyle(style);
                Path path3 = new Path();
                Path.Direction direction = Path.Direction.CW;
                path3.addCircle(f, f2, f3 * 0.95f, direction);
                Path path4 = new Path();
                path4.addCircle((f3 * 0.52f) + f, f2 - (f3 * 0.42f), 0.88f * f3, direction);
                path3.op(path4, Path.Op.DIFFERENCE);
                canvas.drawPath(path3, paint);
                break;
            case 11:
                paint.setStyle(style);
                canvas.drawCircle(f, f2, f3 * 0.44f, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, 0.19f * f3));
                paint.setStrokeCap(Paint.Cap.ROUND);
                for (int i4 = 0; i4 < 8; i4++) {
                    double d = i4 * 0.7853981633974483d;
                    float fCos = ((float) Math.cos(d)) * f3;
                    float fSin = ((float) Math.sin(d)) * f3;
                    canvas.drawLine((0.66f * fCos) + f, (0.66f * fSin) + f2, (fCos * 0.98f) + f, (fSin * 0.98f) + f2, paint);
                }
                break;
            case 12:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(1.6f, 0.185f * f3));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                float f33 = 0.9f * f3;
                float f34 = 0.6f * f3;
                RectF rectF = new RectF(f - f33, f2 - f33, f + f33, f33 + f2);
                RectF rectF2 = new RectF(f - f34, f2 - f34, f + f34, f34 + f2);
                Path path5 = new Path();
                int i5 = 0;
                while (i5 < 8) {
                    float f35 = i5 * 45.0f;
                    path5.arcTo(rectF, f35 - 13.0f, 26.0f, i5 == 0);
                    path5.arcTo(rectF2, f35 + 13.0f, 19.0f, false);
                    i5++;
                }
                path5.close();
                canvas.drawPath(path5, paint);
                canvas.drawCircle(f, f2, f3 * 0.26f, paint);
                break;
            case 13:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, f3 * 0.26f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                float f36 = 0.7f * f3;
                float f37 = f - f36;
                float f38 = f2 - f36;
                float f39 = f + f36;
                float f40 = f36 + f2;
                canvas.drawLine(f37, f38, f39, f40, paint);
                canvas.drawLine(f39, f38, f37, f40, paint);
                break;
            case 14:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2.0f, f3 * 0.2f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                float f41 = f3 * 0.92f;
                canvas.drawArc(new RectF(f - f41, f2 - f41, f + f41, f2 + f41), 160.0f, 220.0f, false, paint);
                canvas.drawLine(f, f2, (0.6f * f3) + f, f2 - (0.46f * f3), paint);
                paint.setStyle(style);
                canvas.drawCircle(f, f2, Math.max(1.6f, 0.16f * f3), paint);
                break;
            case 15:
                paint.setStyle(style);
                Path path6 = new Path();
                Path.Direction direction2 = Path.Direction.CW;
                path6.addCircle(f, f2 - (f3 * 0.22f), 0.68f * f3, direction2);
                Path path7 = new Path();
                float f42 = 0.48f * f3;
                float f43 = (f3 * 0.2f) + f2;
                path7.moveTo(f - f42, f43);
                path7.lineTo(f42 + f, f43);
                path7.lineTo(f, (f3 * 1.0f) + f2);
                path7.close();
                path6.op(path7, Path.Op.UNION);
                Path path8 = new Path();
                path8.addCircle(f, f2 - (0.24f * f3), f3 * 0.26f, direction2);
                path6.op(path8, Path.Op.DIFFERENCE);
                canvas.drawPath(path6, paint);
                break;
            case 16:
                paint.setStyle(style);
                Path path9 = new Path();
                float f44 = f3 * 0.98f;
                path9.moveTo((f3 * 0.34f) + f, f2 - f44);
                float f45 = (0.14f * f3) + f2;
                path9.lineTo(f - (f3 * 0.52f), f45);
                path9.lineTo(f - (0.04f * f3), f45);
                path9.lineTo(f - (0.3f * f3), f2 + f44);
                float f46 = f2 - (f3 * 0.18f);
                path9.lineTo((0.54f * f3) + f, f46);
                path9.lineTo((f3 * 0.06f) + f, f46);
                path9.close();
                canvas.drawPath(path9, paint);
                break;
            case 17:
            case 18:
                paint.setStyle(style);
                float f47 = i == 18 ? f2 - (f3 * 0.26f) : f2;
                Path path10 = new Path();
                float f48 = f3 * 0.42f;
                float f49 = f3 * 0.06f;
                float f50 = f47 + f49;
                path10.addCircle(f - f48, f50, f48, Path.Direction.CW);
                float f51 = f3 * 0.52f;
                Path pathCircle = circle(f + f49, f47 - (f3 * 0.26f), f51);
                Path.Op op = Path.Op.UNION;
                path10.op(pathCircle, op);
                path10.op(circle(f + f51, (0.08f * f3) + f47, 0.4f * f3), op);
                float f52 = f3 * 0.92f;
                path10.op(rect(f - (0.84f * f3), f50, f + f52, (0.48f * f3) + f47), op);
                canvas.drawPath(path10, paint);
                if (i == 18) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(Math.max(2.0f, f3 * 0.17f));
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    for (int i6 = -1; i6 <= 1; i6++) {
                        float f53 = (i6 * f3 * 0.44f) + f;
                        canvas.drawLine(f53, (f3 * 0.44f) + f2, f53 - (0.12f * f3), f2 + f52, paint);
                    }
                    break;
                }
                break;
            case 19:
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(1.6f, f3 * 0.17f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                float f54 = f3 * 0.52f;
                float f55 = f3 * 0.22f;
                canvas.drawRoundRect(new RectF(f - (f3 * 0.95f), f2 - f54, (0.55f * f3) + f, f2 + f54), f55, f55, paint);
                float f56 = (0.82f * f3) + f;
                float f57 = f3 * 0.18f;
                canvas.drawLine(f56, f2 - f57, f56, f2 + f57, paint);
                paint.setStyle(style);
                float f58 = 0.28f * f3;
                float f59 = 0.09f * f3;
                canvas.drawRoundRect(new RectF(f - (f3 * 0.72f), f2 - f58, (f3 * 0.1f) + f, f2 + f58), f59, f59, paint);
                break;
        }
    }

    private static float weight(int i) {
        if (i == 0) {
            return 0.2f;
        }
        switch (i) {
            case 3:
                return 0.2f;
            case 4:
            case 5:
                return 0.22f;
            case 6:
            case 7:
                return 0.28f;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 0.3f;
            case 17:
            case 18:
                return 0.32f;
            case 19:
                return 0.34f;
            default:
                return 0.19f;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        ve(canvas, this.p, this.kind, width / 2.0f, height / 2.0f, Math.min(width, height) * weight(this.kind), this.color);
    }

    public void setColor(int i) {
        this.color = i;
        invalidate();
    }

    public void setKind(int i) {
        this.kind = i;
        invalidate();
    }
}

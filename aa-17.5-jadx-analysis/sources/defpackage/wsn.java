package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wsn extends wsk {
    final Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;

    public wsn(wsv wsvVar) {
        super(wsvVar);
        this.g = 300.0f;
        this.f = new Pair(new wsj(), new wsj());
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2;
        Pair pair;
        float f9 = 1.0f - this.o;
        float fI = dlz.i(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f10 = ((1.0f - fI) * f9) + fI;
        float f11 = this.g;
        float f12 = f10 * f11;
        float fI2 = dlz.i(f2, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f13 = ((1.0f - fI2) * f9) + fI2;
        float f14 = this.i;
        float f15 = this.j;
        int i4 = (int) (f12 + ((int) ((i2 * dlz.i(f10, BitmapDescriptorFactory.HUE_RED, 0.01f)) / 0.01f)));
        int i5 = (int) ((f11 * f13) - ((int) ((i3 * (1.0f - dlz.i(f13, 0.99f, 1.0f))) / 0.01f)));
        if (f14 != f15) {
            float fMax = Math.max(f14, f15);
            float f16 = this.g;
            float f17 = fMax / f16;
            float f18 = this.i;
            float f19 = this.j;
            float fI3 = dlz.i(i4 / f16, BitmapDescriptorFactory.HUE_RED, f17) / f17;
            float fI4 = dlz.i((f16 - i5) / f16, BitmapDescriptorFactory.HUE_RED, f17) / f17;
            float f20 = ((1.0f - fI4) * f18) + (fI4 * f19);
            f5 = ((1.0f - fI3) * f18) + (fI3 * f19);
            f6 = f20;
        } else {
            f5 = f14;
            f6 = f5;
        }
        float f21 = -this.g;
        wsv wsvVar = (wsv) this.a;
        boolean z2 = wsvVar.c(this.n) && z && f3 > BitmapDescriptorFactory.HUE_RED;
        if (i4 <= i5) {
            float f22 = f21 / 2.0f;
            float f23 = i4 + f5;
            float f24 = i5 - f6;
            float f25 = f5 + f5;
            boolean z3 = z2;
            float f26 = f6 + f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            Pair pair2 = this.f;
            ((wsj) pair2.first).c();
            ((wsj) pair2.second).c();
            ((wsj) pair2.first).f(f23 + f22);
            ((wsj) pair2.second).f(f22 + f24);
            if (i4 == 0 && f24 + f6 < f23 + f5) {
                k(canvas, paint, (wsj) pair2.first, f25, this.h, f5, (wsj) pair2.second, f26, this.h, f6, true);
                return;
            }
            if (f23 - f5 > f24 - f6) {
                k(canvas, paint, (wsj) pair2.second, f26, this.h, f6, (wsj) pair2.first, f25, this.h, f5, false);
                return;
            }
            float f27 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(wsvVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z3) {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f28 = this.g;
                float f29 = f23 / f28;
                float f30 = f24 / f28;
                int i6 = this.n ? wsvVar.j : wsvVar.k;
                if (i6 != this.m) {
                    this.m = i6;
                    g();
                }
                path.rewind();
                float f31 = (-this.g) / 2.0f;
                boolean zC = wsvVar.c(this.n);
                if (zC) {
                    float f32 = this.g;
                    f7 = f25;
                    float f33 = this.l;
                    float f34 = f32 / f33;
                    float f35 = f4 / f34;
                    f31 -= f33 * f4;
                    float f36 = f34 / (f34 + 1.0f);
                    f30 = (f30 + f35) * f36;
                    f29 = (f29 + f35) * f36;
                } else {
                    f7 = f25;
                }
                float length = f29 * pathMeasure.getLength();
                float length2 = f30 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                wsj wsjVar = (wsj) pair2.first;
                wsjVar.c();
                f8 = f5;
                pathMeasure.getPosTan(length, (float[]) wsjVar.a, (float[]) wsjVar.b);
                wsj wsjVar2 = (wsj) pair2.second;
                wsjVar2.c();
                pathMeasure.getPosTan(length2, (float[]) wsjVar2.a, (float[]) wsjVar2.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f31, BitmapDescriptorFactory.HUE_RED);
                wsjVar.f(f31);
                wsjVar2.f(f31);
                if (zC) {
                    float f37 = this.k * f3;
                    matrix.postScale(1.0f, f37);
                    wsjVar.e(f37);
                    wsjVar2.e(f37);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                canvas.drawLine(((float[]) ((wsj) pair2.first).a)[0], ((float[]) ((wsj) pair2.first).a)[1], ((float[]) ((wsj) pair2.second).a)[0], ((float[]) ((wsj) pair2.second).a)[1], paint);
                canvas2 = canvas;
                f7 = f25;
                f8 = f5;
            }
            if (wsvVar.f()) {
                return;
            }
            if (f23 <= BitmapDescriptorFactory.HUE_RED || f8 <= BitmapDescriptorFactory.HUE_RED) {
                pair = pair2;
            } else {
                pair = pair2;
                k(canvas2, paint, (wsj) pair2.first, f7, this.h, f8, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
            }
            if (f24 >= this.g || f27 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            k(canvas, paint, (wsj) pair.second, f26, this.h, f27, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
        }
    }

    private final void k(Canvas canvas, Paint paint, wsj wsjVar, float f, float f2, float f3, wsj wsjVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float fMin = Math.min(f2, this.h);
        float f9 = -fMin;
        float f10 = fMin / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (wsjVar2 != null) {
            float fMin2 = Math.min(f5, this.h);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 1;
                float f14 = (((float[]) wsjVar2.a)[0] - fMin3) - (((float[]) wsjVar.a)[0] - f3);
                if (f14 > BitmapDescriptorFactory.HUE_RED) {
                    wsjVar2.f((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(BitmapDescriptorFactory.HUE_RED, f12, f13, f10);
            } else {
                c = 1;
                float f15 = (((float[]) wsjVar2.a)[0] + fMin3) - (((float[]) wsjVar.a)[0] + f3);
                if (f15 < BitmapDescriptorFactory.HUE_RED) {
                    wsjVar2.f((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, BitmapDescriptorFactory.HUE_RED, f10);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            float[] fArr = (float[]) wsjVar2.a;
            canvas.translate(fArr[0], fArr[c]);
            canvas.rotate(i((float[]) wsjVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i((float[]) wsjVar2.b));
            float[] fArr2 = (float[]) wsjVar2.a;
            canvas.translate(-fArr2[0], -fArr2[c]);
            float[] fArr3 = (float[]) wsjVar.a;
            canvas.translate(fArr3[0], fArr3[c]);
            canvas.rotate(i((float[]) wsjVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = (float[]) wsjVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i((float[]) wsjVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.wsk
    public final int a() {
        wsv wsvVar = (wsv) this.a;
        int i = wsvVar.a;
        int i2 = wsvVar.l;
        return i + i2 + i2;
    }

    @Override // defpackage.wsk
    public final int b() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    @Override // defpackage.wsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            float r0 = r8.g
            int r1 = r10.width()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            int r0 = r10.width()
            float r0 = (float) r0
            r8.g = r0
            r8.g()
        L15:
            int r0 = r8.a()
            float r0 = (float) r0
            int r1 = r10.left
            float r1 = (float) r1
            int r2 = r10.width()
            float r2 = (float) r2
            int r3 = r10.top
            float r3 = (float) r3
            int r4 = r10.height()
            float r4 = (float) r4
            int r10 = r10.height()
            float r10 = (float) r10
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            float r10 = r10 - r0
            float r10 = r10 / r5
            r4 = 0
            float r10 = java.lang.Math.max(r4, r10)
            float r3 = r3 + r10
            float r2 = r2 / r5
            float r1 = r1 + r2
            r9.translate(r1, r3)
            wrp r10 = r8.a
            wsv r10 = (defpackage.wsv) r10
            boolean r1 = r10.s
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4f
            r9.scale(r2, r3)
        L4f:
            float r1 = r8.g
            float r1 = r1 / r5
            float r0 = r0 / r5
            float r6 = -r1
            float r7 = -r0
            r9.clipRect(r6, r7, r1, r0)
            int r0 = r10.a
            float r1 = (float) r0
            float r6 = r1 * r11
            r8.h = r6
            r6 = 2
            int r0 = r0 / r6
            int r7 = r10.a()
            int r0 = java.lang.Math.min(r0, r7)
            float r0 = (float) r0
            float r0 = r0 * r11
            r8.i = r0
            int r0 = r10.l
            float r0 = (float) r0
            float r0 = r0 * r11
            r8.k = r0
            float r0 = r1 / r5
            int r7 = r10.g()
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r0, r7)
            float r0 = r0 * r11
            r8.j = r0
            r0 = 1
            if (r12 != 0) goto L8a
            if (r13 == 0) goto L88
            r13 = r0
            goto L8a
        L88:
            r11 = r3
            goto Lae
        L8a:
            if (r12 == 0) goto L90
            int r7 = r10.g
            if (r7 == r6) goto L96
        L90:
            if (r13 == 0) goto L99
            int r6 = r10.h
            if (r6 != r0) goto L99
        L96:
            r9.scale(r3, r2)
        L99:
            r0 = 3
            if (r12 != 0) goto La0
            int r12 = r10.h
            if (r12 == r0) goto La7
        La0:
            float r12 = r3 - r11
            float r1 = r1 * r12
            float r1 = r1 / r5
            r9.translate(r4, r1)
        La7:
            if (r13 == 0) goto L88
            int r9 = r10.h
            if (r9 == r0) goto Lae
            goto L88
        Lae:
            r8.o = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsn.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.wsk
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int iL = woy.l(i, i2);
        this.n = false;
        wsv wsvVar = (wsv) this.a;
        int iMin = Math.min(wsvVar.t, wsvVar.a);
        if (iMin <= 0 || iL == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iL);
        Integer num = wsvVar.u;
        float fFloatValue = num != null ? num.floatValue() + (wsvVar.t / 2.0f) : this.h / 2.0f;
        float f = iMin;
        k(canvas, paint, new wsj(new float[]{(this.g / 2.0f) - fFloatValue, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}), f, f, (this.i * f) / this.h, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
    }

    @Override // defpackage.wsk
    public final void e(Canvas canvas, Paint paint, wsi wsiVar, int i) {
        int iL = woy.l(wsiVar.c, i);
        this.n = wsiVar.h;
        float f = wsiVar.a;
        float f2 = wsiVar.b;
        int i2 = wsiVar.d;
        j(canvas, paint, f, f2, iL, i2, i2, wsiVar.e, wsiVar.f, true);
    }

    @Override // defpackage.wsk
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iL = woy.l(i, i2);
        this.n = false;
        j(canvas, paint, f, f2, iL, i3, i3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
    }

    @Override // defpackage.wsk
    public final void g() {
        Path path = this.b;
        path.rewind();
        wsv wsvVar = (wsv) this.a;
        if (wsvVar.c(this.n)) {
            int i = this.n ? wsvVar.j : wsvVar.k;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 + i3;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, BitmapDescriptorFactory.HUE_RED, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                path.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.l / 2.0f, -2.0f);
            matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.g, BitmapDescriptorFactory.HUE_RED);
        }
        this.d.setPath(path, false);
    }
}

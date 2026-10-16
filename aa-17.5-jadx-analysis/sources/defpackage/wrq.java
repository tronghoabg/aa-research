package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wrq extends wsk {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p;
    private final Pair q;

    public wrq(wsb wsbVar) {
        super(wsbVar);
        this.p = new RectF();
        this.q = new Pair(new wsj(), new wsj());
    }

    private final int j() {
        wsb wsbVar = (wsb) this.a;
        int i = wsbVar.r;
        int i2 = wsbVar.s;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < BitmapDescriptorFactory.HUE_RED) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= BitmapDescriptorFactory.HUE_RED) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float f12 = 1.0f - f11;
        float f13 = (1.0f - f6) * BitmapDescriptorFactory.HUE_RED;
        float f14 = f6 * f11;
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = (((f13 + f14) * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f15 = ((1.0f - f7) * f12) + f7;
        if (degrees3 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        wsb wsbVar = (wsb) this.a;
        boolean z2 = false;
        if (wsbVar.c(this.n) && z && f3 > BitmapDescriptorFactory.HUE_RED) {
            z2 = true;
        }
        float f16 = (f15 * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f17 = this.g;
        float f18 = f17 + f17;
        float f19 = degrees + degrees;
        if (degrees3 < f19) {
            float f20 = degrees3 / f19;
            float f21 = f16 + (degrees * f20);
            wsj wsjVar = new wsj();
            if (z2) {
                PathMeasure pathMeasure = this.d;
                float length = ((f21 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                float f22 = this.h * f3;
                float f23 = this.i;
                if (f23 != this.m || f22 != this.k) {
                    this.k = f22;
                    this.m = f23;
                    g();
                }
                pathMeasure.getPosTan(length, (float[]) wsjVar.a, (float[]) wsjVar.b);
            } else {
                wsjVar.d(f21 + 90.0f);
                wsjVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            l(canvas, paint, wsjVar, f18, this.f, f20);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(wsbVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f24 = f16 + degrees;
        float f25 = degrees3 - f19;
        Pair pair = this.q;
        ((wsj) pair.first).c();
        ((wsj) pair.second).c();
        if (z2) {
            PathMeasure pathMeasure2 = this.d;
            Path path = this.c;
            float f26 = f24 / 360.0f;
            float f27 = f25 / 360.0f;
            float f28 = this.h * f3;
            int i4 = this.n ? wsbVar.j : wsbVar.k;
            float f29 = this.i;
            if (f29 != this.m || f28 != this.k || i4 != this.l) {
                this.k = f28;
                this.l = i4;
                this.m = f29;
                g();
            }
            path.rewind();
            float fI = dlz.i(f27, BitmapDescriptorFactory.HUE_RED, 1.0f);
            if (wsbVar.c(this.n)) {
                float f30 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f26 += f30;
                f5 = -(f30 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f31 = f26 % 1.0f;
            float length2 = (pathMeasure2.getLength() * f31) / 2.0f;
            float length3 = ((f31 + fI) * pathMeasure2.getLength()) / 2.0f;
            pathMeasure2.getSegment(length2, length3, path, true);
            wsj wsjVar2 = (wsj) pair.first;
            wsjVar2.c();
            pathMeasure2.getPosTan(length2, (float[]) wsjVar2.a, (float[]) wsjVar2.b);
            wsj wsjVar3 = (wsj) pair.second;
            wsjVar3.c();
            pathMeasure2.getPosTan(length3, (float[]) wsjVar3.a, (float[]) wsjVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f5);
            wsjVar2.d(f5);
            wsjVar3.d(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((wsj) pair.first).d(f24 + 90.0f);
            ((wsj) pair.first).a(-this.i);
            ((wsj) pair.second).d(f24 + f25 + 90.0f);
            ((wsj) pair.second).a(-this.i);
            RectF rectF = this.p;
            float f32 = this.i;
            float f33 = -f32;
            rectF.set(f33, f33, f32, f32);
            canvas.drawArc(rectF, f24, f25, false, paint);
            canvas2 = canvas;
        }
        if (wsbVar.f() || this.g <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas2, paint, (wsj) pair.first, f18, this.f, 1.0f);
        l(canvas, paint, (wsj) pair.second, f18, this.f, 1.0f);
    }

    private final void l(Canvas canvas, Paint paint, wsj wsjVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = (this.g * fMin) / this.f;
        float f5 = -f;
        float f6 = f / 2.0f;
        float fMin2 = Math.min(f6, f4);
        RectF rectF = new RectF(f5 / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = (float[]) wsjVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) wsjVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // defpackage.wsk
    public final int a() {
        return j();
    }

    @Override // defpackage.wsk
    public final int b() {
        return j();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // defpackage.wsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r11, android.graphics.Rect r12, float r13, boolean r14, boolean r15) {
        /*
            r10 = this;
            int r0 = r12.width()
            float r0 = (float) r0
            int r1 = r10.j()
            float r1 = (float) r1
            int r2 = r12.height()
            float r2 = (float) r2
            int r3 = r10.j()
            float r3 = (float) r3
            wrp r4 = r10.a
            wsb r4 = (defpackage.wsb) r4
            int r5 = r4.r
            float r6 = (float) r5
            int r7 = r4.s
            float r7 = (float) r7
            int r8 = r12.left
            float r8 = (float) r8
            int r12 = r12.top
            float r12 = (float) r12
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r9
            float r6 = r6 + r7
            float r0 = r0 / r1
            float r2 = r2 / r3
            float r1 = r6 * r2
            float r3 = r6 * r0
            float r3 = r3 + r8
            float r1 = r1 + r12
            r11.translate(r3, r1)
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r11.rotate(r12)
            r11.scale(r0, r2)
            int r12 = r4.t
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L52
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r0, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r12 != r1) goto L52
            r12 = 1036831949(0x3dcccccd, float:0.1)
            r11.rotate(r12)
        L52:
            float r12 = -r6
            r11.clipRect(r12, r12, r6, r6)
            int r11 = r4.a
            float r12 = (float) r11
            float r1 = r12 * r13
            r10.f = r1
            int r1 = r11 / 2
            int r2 = r4.a()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            float r1 = r1 * r13
            r10.g = r1
            int r1 = r4.l
            float r1 = (float) r1
            float r1 = r1 * r13
            r10.h = r1
            int r5 = r5 - r11
            float r11 = (float) r5
            float r11 = r11 / r9
            r10.i = r11
            r1 = 1
            if (r14 != 0) goto L7f
            if (r15 == 0) goto L7d
            r15 = r1
            goto L7f
        L7d:
            r13 = r0
            goto Laf
        L7f:
            float r2 = r0 - r13
            float r2 = r2 * r12
            float r2 = r2 / r9
            r12 = 2
            if (r14 == 0) goto L8a
            int r3 = r4.g
            if (r3 == r12) goto L90
        L8a:
            if (r15 == 0) goto L94
            int r3 = r4.h
            if (r3 != r1) goto L94
        L90:
            float r11 = r11 + r2
            r10.i = r11
            goto La7
        L94:
            if (r14 == 0) goto L9d
            int r14 = r4.g
            if (r14 == r1) goto L9b
            goto L9d
        L9b:
            r1 = r15
            goto La3
        L9d:
            if (r15 == 0) goto La7
            int r14 = r4.h
            if (r14 != r12) goto La7
        La3:
            float r11 = r11 - r2
            r10.i = r11
            r15 = r1
        La7:
            if (r15 == 0) goto L7d
            int r11 = r4.h
            r12 = 3
            if (r11 == r12) goto Laf
            goto L7d
        Laf:
            r10.o = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrq.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.wsk
    public final void e(Canvas canvas, Paint paint, wsi wsiVar, int i) {
        int iL = woy.l(wsiVar.c, i);
        canvas.save();
        canvas.rotate(wsiVar.g);
        this.n = wsiVar.h;
        float f = wsiVar.a;
        float f2 = wsiVar.b;
        int i2 = wsiVar.d;
        k(canvas, paint, f, f2, iL, i2, i2, wsiVar.e, wsiVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.wsk
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iL = woy.l(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, iL, i3, i3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
    }

    @Override // defpackage.wsk
    public final void g() {
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, BitmapDescriptorFactory.HUE_RED);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        if (((wsb) this.a).c(this.n)) {
            PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = Math.max(3, (int) ((length / (this.n ? r1.j : r1.k)) / 2.0f));
            int i2 = iMax + iMax;
            this.j = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                wsj wsjVar = new wsj();
                float f3 = i3;
                pathMeasure.getPosTan(this.j * f3, (float[]) wsjVar.a, (float[]) wsjVar.b);
                wsj wsjVar2 = new wsj();
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) wsjVar2.a, (float[]) wsjVar2.b);
                arrayList.add(wsjVar);
                wsjVar2.a(f2 + f2);
                arrayList.add(wsjVar2);
            }
            arrayList.add((wsj) arrayList.get(0));
            wsj wsjVar3 = (wsj) arrayList.get(0);
            float[] fArr = (float[]) wsjVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                wsj wsjVar4 = (wsj) arrayList.get(i4);
                float f5 = this.j / 2.0f;
                wsj wsjVar5 = new wsj(wsjVar3);
                wsj wsjVar6 = new wsj(wsjVar4);
                float f6 = f5 * 0.48f;
                wsjVar5.b(f6);
                wsjVar6.b(-f6);
                float[] fArr2 = (float[]) wsjVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) wsjVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) wsjVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                wsjVar3 = wsjVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.wsk
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}

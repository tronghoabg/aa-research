package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class wum {
    private final wuu[] a = new wuu[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final wuu g = new wuu();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public wum() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new wuu();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static wum a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? wul.a : new wum();
    }

    static final wtz b(int i, wuk wukVar) {
        return i != 1 ? i != 2 ? i != 3 ? wukVar.c : wukVar.b : wukVar.e : wukVar.d;
    }

    private final boolean d(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(wuk wukVar, float[] fArr, float f, RectF rectF, wyd wydVar, Path path) {
        int i;
        float f2;
        char c;
        char c2;
        char c3;
        wub wubVar;
        char c4;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            wtz wtzVarB = fArr == null ? b(i2, wukVar) : new wty(fArr[i2]);
            wub wubVar2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? wukVar.k : wukVar.j : wukVar.m : wukVar.l;
            wuu[] wuuVarArr = this.a;
            wubVar2.a(wuuVarArr[i2], f, wtzVarB.a(rectF));
            int i3 = i2 + 1;
            Matrix[] matrixArr = this.b;
            matrixArr[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i2].setTranslate(pointF.x, pointF.y);
            float f3 = (i3 % 4) * 90;
            matrixArr[i2].preRotate(f3);
            float[] fArr2 = this.h;
            wuu wuuVar = wuuVarArr[i2];
            fArr2[0] = wuuVar.b;
            fArr2[1] = wuuVar.c;
            matrixArr[i2].mapPoints(fArr2);
            Matrix[] matrixArr2 = this.c;
            matrixArr2[i2].reset();
            matrixArr2[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i2].preRotate(f3);
            i2 = i3;
        }
        int i4 = 1;
        char c5 = 0;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            float[] fArr3 = this.h;
            wuu[] wuuVarArr2 = this.a;
            wuu wuuVar2 = wuuVarArr2[i5];
            fArr3[c5] = 0.0f;
            fArr3[i4] = wuuVar2.a;
            Matrix[] matrixArr3 = this.b;
            matrixArr3[i5].mapPoints(fArr3);
            if (i5 == 0) {
                path.moveTo(fArr3[c5], fArr3[i4]);
            } else {
                path.lineTo(fArr3[c5], fArr3[i4]);
            }
            wuuVarArr2[i5].c(matrixArr3[i5], path);
            if (wydVar != null) {
                wuu wuuVar3 = wuuVarArr2[i5];
                Matrix matrix = matrixArr3[i5];
                boolean z = wuuVar3.g;
                wue wueVar = (wue) wydVar.a;
                f2 = 0.0f;
                boolean z2 = c5;
                wueVar.s.set(i5, z2);
                wueVar.q[i5] = wuuVar3.a(matrix);
                c = z2;
            } else {
                f2 = 0.0f;
                c = c5;
            }
            int i6 = i5 + 1;
            wuu wuuVar4 = wuuVarArr2[i5];
            fArr3[c] = wuuVar4.b;
            fArr3[i4] = wuuVar4.c;
            matrixArr3[i5].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i7 = i6 % 4;
            wuu wuuVar5 = wuuVarArr2[i7];
            fArr4[c] = f2;
            fArr4[i4] = wuuVar5.a;
            matrixArr3[i7].mapPoints(fArr4);
            float fMax = Math.max(((float) Math.hypot(fArr3[c] - fArr4[c], fArr3[i4] - fArr4[i4])) - 0.001f, f2);
            wuu wuuVar6 = wuuVarArr2[i5];
            fArr3[0] = wuuVar6.b;
            fArr3[i4] = wuuVar6.c;
            matrixArr3[i5].mapPoints(fArr3);
            int i8 = i4;
            float fAbs = (i5 == i8 || i5 == 3) ? Math.abs(rectF.centerX() - fArr3[0]) : Math.abs(rectF.centerY() - fArr3[i8]);
            wuu wuuVar7 = this.g;
            wuuVar7.e(BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
            if (i5 != 1) {
                c2 = 2;
                if (i5 != 2) {
                    c3 = 3;
                    wubVar = i5 != 3 ? wukVar.g : wukVar.f;
                } else {
                    c3 = 3;
                    wubVar = wukVar.i;
                }
            } else {
                c2 = 2;
                c3 = 3;
                wubVar = wukVar.h;
            }
            wubVar.b(fMax, fAbs, f, wuuVar7);
            Path path4 = this.j;
            path4.reset();
            Matrix[] matrixArr4 = this.c;
            wuuVar7.c(matrixArr4[i5], path4);
            if (this.l && (d(path4, i5) || d(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[0] = 0.0f;
                i4 = 1;
                fArr3[1] = wuuVar7.a;
                matrixArr4[i5].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                wuuVar7.c(matrixArr4[i5], path2);
            } else {
                i4 = 1;
                wuuVar7.c(matrixArr4[i5], path);
            }
            if (wydVar != null) {
                Matrix matrix2 = matrixArr4[i5];
                wue wueVar2 = (wue) wydVar.a;
                c4 = 0;
                wueVar2.s.set(i5 + 4, false);
                wueVar2.r[i5] = wuuVar7.a(matrix2);
            } else {
                c4 = 0;
            }
            c5 = c4;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}

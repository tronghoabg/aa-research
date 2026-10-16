package com.google.android.material.k;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.BitSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final ab[] f6707a = new ab[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f6708b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f6709c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f6710d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f6711e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f6712f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final ab f6713g = new ab();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f6714h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f6715i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f6716j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f6717k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f6718l = true;

    public u() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f6707a[i2] = new ab();
            this.f6708b[i2] = new Matrix();
            this.f6709c[i2] = new Matrix();
        }
    }

    public static u a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? s.f6706a : new u();
    }

    static final d c(int i2, r rVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? rVar.f6695b : rVar.f6694a : rVar.f6697d : rVar.f6696c;
    }

    private final boolean d(Path path, int i2) {
        Path path2 = this.f6717k;
        path2.reset();
        this.f6707a[i2].b(this.f6708b[i2], path2);
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

    private static final float e(int i2) {
        return ((i2 + 1) % 4) * 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    public final void b(r rVar, float[] fArr, float f2, RectF rectF, t tVar, Path path) {
        int i2;
        int i3;
        float f3;
        int i4;
        char c2;
        f fVar;
        int i5;
        boolean z;
        path.rewind();
        Path path2 = this.f6711e;
        path2.rewind();
        Path path3 = this.f6712f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        ?? r7 = 0;
        int i6 = 0;
        while (true) {
            i3 = 1;
            if (i6 >= 4) {
                break;
            }
            d dVarC = fArr == null ? c(i6, rVar) : new c(fArr[i6]);
            f fVar2 = i6 != 1 ? i6 != 2 ? i6 != 3 ? rVar.f6703j : rVar.f6702i : rVar.f6705l : rVar.f6704k;
            ab[] abVarArr = this.f6707a;
            fVar2.a(abVarArr[i6], f2, dVarC.a(rectF));
            float fE = e(i6);
            Matrix[] matrixArr = this.f6708b;
            matrixArr[i6].reset();
            PointF pointF = this.f6710d;
            if (i6 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i6 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i6 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i6].setTranslate(pointF.x, pointF.y);
            matrixArr[i6].preRotate(fE);
            float[] fArr2 = this.f6714h;
            ab abVar = abVarArr[i6];
            fArr2[0] = abVar.f6632b;
            fArr2[1] = abVar.f6633c;
            matrixArr[i6].mapPoints(fArr2);
            float fE2 = e(i6);
            Matrix[] matrixArr2 = this.f6709c;
            matrixArr2[i6].reset();
            matrixArr2[i6].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i6].preRotate(fE2);
            i6++;
        }
        int i7 = 0;
        for (i2 = 4; i7 < i2; i2 = 4) {
            float[] fArr3 = this.f6714h;
            ab[] abVarArr2 = this.f6707a;
            ab abVar2 = abVarArr2[i7];
            fArr3[r7] = 0.0f;
            fArr3[i3] = abVar2.f6631a;
            Matrix[] matrixArr3 = this.f6708b;
            matrixArr3[i7].mapPoints(fArr3);
            if (i7 == 0) {
                path.moveTo(fArr3[r7], fArr3[i3]);
            } else {
                path.lineTo(fArr3[r7], fArr3[i3]);
            }
            abVarArr2[i7].b(matrixArr3[i7], path);
            if (tVar != null) {
                ab abVar3 = abVarArr2[i7];
                Matrix matrix = matrixArr3[i7];
                i4 = i3;
                k kVar = ((h) tVar).f6652a;
                f3 = 0.0f;
                kVar.f6674i.set(i7, r7);
                kVar.f6672g[i7] = abVar3.a(matrix);
            } else {
                f3 = 0.0f;
                i4 = i3;
            }
            int i8 = i7 + 1;
            ab abVar4 = abVarArr2[i7];
            fArr3[r7] = abVar4.f6632b;
            fArr3[i4] = abVar4.f6633c;
            matrixArr3[i7].mapPoints(fArr3);
            float[] fArr4 = this.f6715i;
            int i9 = i8 % 4;
            ab abVar5 = abVarArr2[i9];
            fArr4[r7] = f3;
            fArr4[i4] = abVar5.f6631a;
            matrixArr3[i9].mapPoints(fArr4);
            ?? r17 = r7;
            int i10 = i7;
            float fMax = Math.max(((float) Math.hypot(fArr3[r7] - fArr4[r7], fArr3[i4] - fArr4[i4])) - 0.001f, f3);
            ab abVar6 = abVarArr2[i10];
            fArr3[r17 == true ? 1 : 0] = abVar6.f6632b;
            fArr3[i4] = abVar6.f6633c;
            matrixArr3[i10].mapPoints(fArr3);
            int i11 = i4;
            float fAbs = (i10 == i11 || i10 == 3) ? Math.abs(rectF.centerX() - fArr3[r17 == true ? 1 : 0]) : Math.abs(rectF.centerY() - fArr3[i11]);
            ab abVar7 = this.f6713g;
            abVar7.e();
            if (i10 == 1) {
                c2 = 3;
                fVar = rVar.f6700g;
            } else if (i10 != 2) {
                c2 = 3;
                fVar = i10 != 3 ? rVar.f6699f : rVar.f6698e;
            } else {
                c2 = 3;
                fVar = rVar.f6701h;
            }
            fVar.b(fMax, fAbs, f2, abVar7);
            Path path4 = this.f6716j;
            path4.reset();
            Matrix[] matrixArr4 = this.f6709c;
            abVar7.b(matrixArr4[i10], path4);
            if (this.f6718l && (d(path4, i10) || d(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[r17 == true ? 1 : 0] = 0.0f;
                i5 = 1;
                fArr3[1] = abVar7.f6631a;
                matrixArr4[i10].mapPoints(fArr3);
                path2.moveTo(fArr3[r17 == true ? 1 : 0], fArr3[1]);
                abVar7.b(matrixArr4[i10], path2);
            } else {
                i5 = 1;
                abVar7.b(matrixArr4[i10], path);
            }
            if (tVar != null) {
                Matrix matrix2 = matrixArr4[i10];
                k kVar2 = ((h) tVar).f6652a;
                BitSet bitSet = kVar2.f6674i;
                z = r17 == true ? 1 : 0;
                bitSet.set(i10 + 4, z);
                kVar2.f6673h[i10] = abVar7.a(matrix2);
            } else {
                z = r17 == true ? 1 : 0;
            }
            i7 = i8;
            r7 = z;
            i3 = i5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}

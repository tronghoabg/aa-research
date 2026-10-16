package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.x;
import com.airbnb.lottie.ae;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends b {

    /* renamed from: d, reason: collision with root package name */
    private final String f1801d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1802e;

    /* renamed from: f, reason: collision with root package name */
    private final LongSparseArray f1803f;

    /* renamed from: g, reason: collision with root package name */
    private final LongSparseArray f1804g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f1805h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1806i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1807j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1808k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1809l;
    private x m;
    private final int n;

    public j(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.f fVar) {
        super(sVar, bVar, com.airbnb.lottie.b.o.d(fVar.m()), ae.c(fVar.n()), fVar.b(), fVar.f(), fVar.d(), fVar.j(), fVar.c());
        this.f1803f = new LongSparseArray();
        this.f1804g = new LongSparseArray();
        this.f1805h = new RectF();
        this.f1801d = fVar.i();
        this.n = fVar.l();
        this.f1802e = fVar.k();
        this.f1806i = (int) (sVar.i().a() / 32.0f);
        com.airbnb.lottie.a.b.f fVarA = fVar.e().a();
        this.f1807j = fVarA;
        fVarA.i(this);
        bVar.l(fVarA);
        com.airbnb.lottie.a.b.f fVarA2 = fVar.h().a();
        this.f1808k = fVarA2;
        fVarA2.i(this);
        bVar.l(fVarA2);
        com.airbnb.lottie.a.b.f fVarA3 = fVar.g().a();
        this.f1809l = fVarA3;
        fVarA3.i(this);
        bVar.l(fVarA3);
    }

    private final int h() {
        float f2 = this.f1806i;
        float fD = this.f1808k.d() * f2;
        com.airbnb.lottie.a.b.f fVar = this.f1809l;
        int iRound = Math.round(fD);
        float fD2 = fVar.d() * f2;
        com.airbnb.lottie.a.b.f fVar2 = this.f1807j;
        int iRound2 = Math.round(fD2);
        int iRound3 = Math.round(fVar2.d() * f2);
        int i2 = iRound != 0 ? iRound * DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private final int[] i(int[] iArr) {
        x xVar = this.m;
        if (xVar != null) {
            Integer[] numArr = (Integer[]) xVar.f();
            int length = iArr.length;
            int length2 = numArr.length;
            int i2 = 0;
            if (length == length2) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[length2];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.a.a.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == com.airbnb.lottie.x.L) {
            x xVar = this.m;
            if (xVar != null) {
                this.f1747a.n(xVar);
            }
            if (cVar == null) {
                this.m = null;
                return;
            }
            x xVar2 = new x(cVar);
            this.m = xVar2;
            xVar2.i(this);
            this.f1747a.l(this.m);
        }
    }

    @Override // com.airbnb.lottie.a.a.b, com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Shader radialGradient;
        if (this.f1802e) {
            return;
        }
        c(this.f1805h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            LongSparseArray longSparseArray = this.f1803f;
            long j2 = iH;
            shader = (LinearGradient) longSparseArray.get(j2);
            if (shader == null) {
                PointF pointF = (PointF) this.f1808k.f();
                PointF pointF2 = (PointF) this.f1809l.f();
                com.airbnb.lottie.d.b.d dVar = (com.airbnb.lottie.d.b.d) this.f1807j.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(dVar.e()), dVar.d(), Shader.TileMode.CLAMP);
                longSparseArray.put(j2, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            LongSparseArray longSparseArray2 = this.f1804g;
            long j3 = iH2;
            shader = (RadialGradient) longSparseArray2.get(j3);
            if (shader == null) {
                PointF pointF3 = (PointF) this.f1808k.f();
                PointF pointF4 = (PointF) this.f1809l.f();
                com.airbnb.lottie.d.b.d dVar2 = (com.airbnb.lottie.d.b.d) this.f1807j.f();
                int[] iArrI = i(dVar2.e());
                float[] fArrD = dVar2.d();
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrI, fArrD, Shader.TileMode.CLAMP);
                longSparseArray2.put(j3, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f1748b.setShader(shader);
        super.b(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1801d;
    }
}

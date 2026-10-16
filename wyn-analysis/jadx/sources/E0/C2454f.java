package e0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d0.AbstractC2382a;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454f implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Path f34364a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f34365b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public final float[] f34366c = new float[8];

    public C2454f(Path path) {
        this.f34364a = path;
        new Matrix();
    }

    public final void a(d0.e eVar) {
        RectF rectF = this.f34365b;
        rectF.set(eVar.f33941a, eVar.f33942b, eVar.f33943c, eVar.f33944d);
        long j8 = eVar.f33945e;
        float fB = AbstractC2382a.b(j8);
        float[] fArr = this.f34366c;
        fArr[0] = fB;
        fArr[1] = AbstractC2382a.c(j8);
        long j10 = eVar.f33946f;
        fArr[2] = AbstractC2382a.b(j10);
        fArr[3] = AbstractC2382a.c(j10);
        long j11 = eVar.f33947g;
        fArr[4] = AbstractC2382a.b(j11);
        fArr[5] = AbstractC2382a.c(j11);
        long j12 = eVar.f33948h;
        fArr[6] = AbstractC2382a.b(j12);
        fArr[7] = AbstractC2382a.c(j12);
        this.f34364a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    public final boolean b(x xVar, x xVar2, int i5) {
        Path.Op op = i5 == 0 ? Path.Op.DIFFERENCE : i5 == 1 ? Path.Op.INTERSECT : i5 == 4 ? Path.Op.REVERSE_DIFFERENCE : i5 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(xVar instanceof C2454f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        C2454f c2454f = (C2454f) xVar;
        if (xVar2 instanceof C2454f) {
            return this.f34364a.op(c2454f.f34364a, ((C2454f) xVar2).f34364a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.f34364a.reset();
    }
}

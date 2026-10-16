package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RoundedPolygon {
    public static final Companion Companion = new Companion(null);
    private final long center;
    private final List<Cubic> cubics;
    private final List<Feature> features;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b A[LOOP:0: B:11:0x0093->B:35:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7 A[EDGE_INSN: B:51:0x00a7->B:19:0x00a7 BREAK  A[LOOP:0: B:11:0x0093->B:35:0x010b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private RoundedPolygon(java.util.List<? extends androidx.graphics.shapes.Feature> r18, long r19) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.shapes.RoundedPolygon.<init>(java.util.List, long):void");
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        roundedPolygon.calculateBounds(fArr, z | (!((i2 & 2) == 0)));
        return fArr;
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        roundedPolygon.calculateMaxBounds(fArr);
        return fArr;
    }

    public final float[] calculateBounds(float[] fArr, boolean z) {
        x.f(fArr, "bounds");
        if (fArr.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            this.cubics.get(i2).calculateBounds$graphics_shapes(fArr, z);
            fMin = Math.min(fMin, fArr[0]);
            fMin2 = Math.min(fMin2, fArr[1]);
            fMax = Math.max(fMax, fArr[2]);
            fMax2 = Math.max(fMax2, fArr[3]);
        }
        fArr[0] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        return fArr;
    }

    public final float[] calculateMaxBounds(float[] fArr) {
        x.f(fArr, "bounds");
        if (fArr.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            Cubic cubic = this.cubics.get(i2);
            float anchor0X = cubic.getAnchor0X() - getCenterX();
            float anchor0Y = cubic.getAnchor0Y() - getCenterY();
            float f2 = Utils.DistanceEpsilon;
            long jM11928pointOnCurveOOQOV4g$graphics_shapes = cubic.m11928pointOnCurveOOQOV4g$graphics_shapes(0.5f);
            fMax = Math.max(fMax, Math.max(Utils.distanceSquared(anchor0X, anchor0Y), Utils.distanceSquared(PointKt.m11940getXDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes) - getCenterX(), PointKt.m11941getYDnnuFBc(jM11928pointOnCurveOOQOV4g$graphics_shapes) - getCenterY())));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        fArr[0] = getCenterX() - fSqrt;
        fArr[1] = getCenterY() - fSqrt;
        fArr[2] = getCenterX() + fSqrt;
        fArr[3] = getCenterY() + fSqrt;
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedPolygon) {
            return x.n(this.features, ((RoundedPolygon) obj).features);
        }
        return false;
    }

    /* renamed from: getCenter-1ufDz9w$graphics_shapes, reason: not valid java name */
    public final long m11958getCenter1ufDz9w$graphics_shapes() {
        return this.center;
    }

    public final float getCenterX() {
        return PointKt.m11940getXDnnuFBc(this.center);
    }

    public final float getCenterY() {
        return PointKt.m11941getYDnnuFBc(this.center);
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public final List<Feature> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final RoundedPolygon normalized() {
        float[] fArrCalculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f2 = fArrCalculateBounds$default[2] - fArrCalculateBounds$default[0];
        float f3 = fArrCalculateBounds$default[3] - fArrCalculateBounds$default[1];
        final float fMax = Math.max(f2, f3);
        final float f4 = ((fMax - f2) / 2.0f) - fArrCalculateBounds$default[0];
        final float f5 = ((fMax - f3) / 2.0f) - fArrCalculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon.normalized.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY */
            public final long mo6289transformXgqJiTY(float f6, float f7) {
                float f8 = f7 + f5;
                float f9 = f6 + f4;
                float f10 = fMax;
                return FloatFloatPair.m1675constructorimpl(f9 / f10, f8 / f10);
            }
        });
    }

    public String toString() throws IOException {
        return "[RoundedPolygon. Cubics = " + i.aM(this.cubics, null, null, null, 0, null, 63) + " || Features = " + i.aM(this.features, null, null, null, 0, null, 63) + " || Center = (" + getCenterX() + ", " + getCenterY() + ")]";
    }

    public final RoundedPolygon transformed(PointTransformer pointTransformer) {
        x.f(pointTransformer, "f");
        List<Feature> list = this.features;
        long jM11947transformedso9K2fw = PointKt.m11947transformedso9K2fw(this.center, pointTransformer);
        List listB = i.b();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            listB.add(this.features.get(i2).transformed(pointTransformer));
        }
        return new RoundedPolygon(i.a(listB), jM11947transformedso9K2fw, null);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final float[] calculateBounds(float[] fArr) {
        x.f(fArr, "bounds");
        return calculateBounds$default(this, fArr, false, 2, null);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public /* synthetic */ RoundedPolygon(List list, long j2, o oVar) {
        this(list, j2);
    }
}

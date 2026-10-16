package androidx.compose.foundation.shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CutCornerShapeKt {
    public static final CutCornerShape CutCornerShape(float f2, float f3, float f4, float f5) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return CutCornerShape(f2, f3, f4, f5);
    }

    /* renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final CutCornerShape m3079CutCornerShape0680j_4(float f2) {
        return CutCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2));
    }

    /* renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final CutCornerShape m3080CutCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new CutCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2), CornerSizeKt.m3078CornerSize0680j_4(f3), CornerSizeKt.m3078CornerSize0680j_4(f4), CornerSizeKt.m3078CornerSize0680j_4(f5));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ CutCornerShape m3081CutCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m3080CutCornerShapea9UjIt4(f2, f3, f4, f5);
    }

    public static final CutCornerShape lerp(CutCornerShape cutCornerShape, CutCornerShape cutCornerShape2, float f2) {
        return new CutCornerShape(RoundedCornerShapeKt.lerp(cutCornerShape.getTopStart(), cutCornerShape2.getTopStart(), f2), RoundedCornerShapeKt.lerp(cutCornerShape.getTopEnd(), cutCornerShape2.getTopEnd(), f2), RoundedCornerShapeKt.lerp(cutCornerShape.getBottomEnd(), cutCornerShape2.getBottomEnd(), f2), RoundedCornerShapeKt.lerp(cutCornerShape.getBottomStart(), cutCornerShape2.getBottomStart(), f2));
    }

    public static final CutCornerShape CutCornerShape(float f2) {
        return CutCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final CutCornerShape CutCornerShape(CornerSize cornerSize) {
        return new CutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final CutCornerShape CutCornerShape(int i2) {
        return CutCornerShape(CornerSizeKt.CornerSize(i2));
    }

    public static final CutCornerShape CutCornerShape(int i2, int i3, int i4, int i5) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if (1 == (i6 & 1)) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return CutCornerShape(i2, i3, i4, i5);
    }
}

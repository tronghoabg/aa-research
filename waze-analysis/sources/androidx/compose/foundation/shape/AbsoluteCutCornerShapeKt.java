package androidx.compose.foundation.shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShapeKt {
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f2, float f3, float f4, float f5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return AbsoluteCutCornerShape(f2, f3, f4, f5);
    }

    /* renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m3070AbsoluteCutCornerShape0680j_4(float f2) {
        return AbsoluteCutCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m3071AbsoluteCutCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2), CornerSizeKt.m3078CornerSize0680j_4(f3), CornerSizeKt.m3078CornerSize0680j_4(f4), CornerSizeKt.m3078CornerSize0680j_4(f5));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m3072AbsoluteCutCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return m3071AbsoluteCutCornerShapea9UjIt4(f2, f3, f4, f5);
    }

    public static final AbsoluteCutCornerShape lerp(AbsoluteCutCornerShape absoluteCutCornerShape, AbsoluteCutCornerShape absoluteCutCornerShape2, float f2) {
        return new AbsoluteCutCornerShape(RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getTopStart(), absoluteCutCornerShape2.getTopStart(), f2), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getTopEnd(), absoluteCutCornerShape2.getTopEnd(), f2), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getBottomEnd(), absoluteCutCornerShape2.getBottomEnd(), f2), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getBottomStart(), absoluteCutCornerShape2.getBottomStart(), f2));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f2) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(CornerSize cornerSize) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i2) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i2));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i2, int i3, int i4, int i5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
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
        return AbsoluteCutCornerShape(i2, i3, i4, i5);
    }
}

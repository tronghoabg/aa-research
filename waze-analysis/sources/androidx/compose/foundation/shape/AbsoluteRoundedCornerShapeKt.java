package androidx.compose.foundation.shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f2, float f3, float f4, float f5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return AbsoluteRoundedCornerShape(f2, f3, f4, f5);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m3074AbsoluteRoundedCornerShape0680j_4(float f2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m3075AbsoluteRoundedCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2), CornerSizeKt.m3078CornerSize0680j_4(f3), CornerSizeKt.m3078CornerSize0680j_4(f4), CornerSizeKt.m3078CornerSize0680j_4(f5));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m3076AbsoluteRoundedCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return m3075AbsoluteRoundedCornerShapea9UjIt4(f2, f3, f4, f5);
    }

    public static final AbsoluteRoundedCornerShape lerp(AbsoluteRoundedCornerShape absoluteRoundedCornerShape, AbsoluteRoundedCornerShape absoluteRoundedCornerShape2, float f2) {
        return new AbsoluteRoundedCornerShape(RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopStart(), absoluteRoundedCornerShape2.getTopStart(), f2), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopEnd(), absoluteRoundedCornerShape2.getTopEnd(), f2), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomEnd(), absoluteRoundedCornerShape2.getBottomEnd(), f2), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomStart(), absoluteRoundedCornerShape2.getBottomStart(), f2));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i2) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i2));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i2, int i3, int i4, int i5) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
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
        return AbsoluteRoundedCornerShape(i2, i3, i4, i5);
    }
}

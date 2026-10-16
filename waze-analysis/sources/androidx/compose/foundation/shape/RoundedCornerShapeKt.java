package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape RoundedCornerShape(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return RoundedCornerShape(f2, f3, f4, f5);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m3086RoundedCornerShape0680j_4(float f2) {
        return RoundedCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m3087RoundedCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new RoundedCornerShape(CornerSizeKt.m3078CornerSize0680j_4(f2), CornerSizeKt.m3078CornerSize0680j_4(f3), CornerSizeKt.m3078CornerSize0680j_4(f4), CornerSizeKt.m3078CornerSize0680j_4(f5));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m3088RoundedCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return m3087RoundedCornerShapea9UjIt4(f2, f3, f4, f5);
    }

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape lerp(RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, float f2) {
        return new RoundedCornerShape(lerp(roundedCornerShape.getTopStart(), roundedCornerShape2.getTopStart(), f2), lerp(roundedCornerShape.getTopEnd(), roundedCornerShape2.getTopEnd(), f2), lerp(roundedCornerShape.getBottomEnd(), roundedCornerShape2.getBottomEnd(), f2), lerp(roundedCornerShape.getBottomStart(), roundedCornerShape2.getBottomStart(), f2));
    }

    public static final RoundedCornerShape RoundedCornerShape(float f2) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f2));
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final RoundedCornerShape RoundedCornerShape(int i2) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i2));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i2, int i3, int i4, int i5) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
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
        return RoundedCornerShape(i2, i3, i4, i5);
    }

    public static final CornerSize lerp(final CornerSize cornerSize, final CornerSize cornerSize2, final float f2) {
        return new CornerSize() { // from class: androidx.compose.foundation.shape.RoundedCornerShapeKt.lerp.1
            @Override // androidx.compose.foundation.shape.CornerSize
            /* renamed from: toPx-TmRCtEA */
            public float mo3077toPxTmRCtEA(long j2, Density density) {
                return MathHelpersKt.lerp(cornerSize.mo3077toPxTmRCtEA(j2, density), cornerSize2.mo3077toPxTmRCtEA(j2, density), f2);
            }
        };
    }
}

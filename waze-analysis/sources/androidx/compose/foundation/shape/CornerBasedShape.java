package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape, Interpolatable {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i2 & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i2 & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i2 & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i2 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo3069createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        CornerSize cornerSize = this.bottomStart;
        CornerSize cornerSize2 = this.bottomEnd;
        CornerSize cornerSize3 = this.topEnd;
        float fMo3077toPxTmRCtEA = this.topStart.mo3077toPxTmRCtEA(j2, density);
        float fMo3077toPxTmRCtEA2 = cornerSize3.mo3077toPxTmRCtEA(j2, density);
        float fMo3077toPxTmRCtEA3 = cornerSize2.mo3077toPxTmRCtEA(j2, density);
        float fMo3077toPxTmRCtEA4 = cornerSize.mo3077toPxTmRCtEA(j2, density);
        float f2 = fMo3077toPxTmRCtEA + fMo3077toPxTmRCtEA4;
        float fM8048getMinDimensionimpl = Size.m8048getMinDimensionimpl(j2);
        if (f2 > fM8048getMinDimensionimpl) {
            float f3 = fM8048getMinDimensionimpl / f2;
            fMo3077toPxTmRCtEA *= f3;
            fMo3077toPxTmRCtEA4 *= f3;
        }
        float f4 = fMo3077toPxTmRCtEA2 + fMo3077toPxTmRCtEA3;
        if (f4 > fM8048getMinDimensionimpl) {
            float f5 = fM8048getMinDimensionimpl / f4;
            fMo3077toPxTmRCtEA2 *= f5;
            fMo3077toPxTmRCtEA3 *= f5;
        }
        float f6 = fMo3077toPxTmRCtEA2;
        if (fMo3077toPxTmRCtEA < 0.0f || f6 < 0.0f || fMo3077toPxTmRCtEA3 < 0.0f || fMo3077toPxTmRCtEA4 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + fMo3077toPxTmRCtEA + ", topEnd = " + f6 + ", bottomEnd = " + fMo3077toPxTmRCtEA3 + ", bottomStart = " + fMo3077toPxTmRCtEA4 + ")!");
        }
        return mo3069createOutlineLjSzlW0(j2, fMo3077toPxTmRCtEA, f6, fMo3077toPxTmRCtEA3, fMo3077toPxTmRCtEA4, layoutDirection);
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public Object lerp(Object obj, float f2) {
        return null;
    }
}

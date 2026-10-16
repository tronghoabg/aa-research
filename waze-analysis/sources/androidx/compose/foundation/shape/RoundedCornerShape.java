package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo3069createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m8070toRectuvyYCjk(j2));
        }
        Rect rectM8070toRectuvyYCjk = SizeKt.m8070toRectuvyYCjk(j2);
        float f6 = layoutDirection == LayoutDirection.Ltr ? f2 : f3;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f6);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
        float f7 = layoutDirection != LayoutDirection.Ltr ? f2 : f3;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(f7);
        float f8 = layoutDirection == LayoutDirection.Ltr ? f4 : f5;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f8);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f8);
        float f9 = layoutDirection != LayoutDirection.Ltr ? f4 : f5;
        return new Outline.Rounded(RoundRectKt.m8032RoundRectZAM2FJo(rectM8070toRectuvyYCjk, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f9) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f9) << 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return x.n(getTopStart(), roundedCornerShape.getTopStart()) && x.n(getTopEnd(), roundedCornerShape.getTopEnd()) && x.n(getBottomEnd(), roundedCornerShape.getBottomEnd()) && x.n(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        if (x.n(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = RoundedCornerShapeKt.RoundedCornerShape(0.0f);
        }
        if (obj instanceof RoundedCornerShape) {
            return RoundedCornerShapeKt.lerp(this, (RoundedCornerShape) obj, f2);
        }
        return null;
    }

    public String toString() {
        return a.a(this, new StringBuilder(), ", topEnd = ", ", bottomEnd = ", ", bottomStart = ", "RoundedCornerShape(topStart = ");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}

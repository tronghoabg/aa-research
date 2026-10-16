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
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    /* renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m3073toRadiusBz7bX_o(float f2) {
        return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo3069createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m8070toRectuvyYCjk(j2));
        }
        Rect rectM8070toRectuvyYCjk = SizeKt.m8070toRectuvyYCjk(j2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f4);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f4);
        long jFloatToRawIntBits7 = Float.floatToRawIntBits(f5);
        return new Outline.Rounded(RoundRectKt.m8032RoundRectZAM2FJo(rectM8070toRectuvyYCjk, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits7 << 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return x.n(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && x.n(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && x.n(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && x.n(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        if (x.n(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = AbsoluteRoundedCornerShapeKt.AbsoluteRoundedCornerShape(0.0f);
        }
        if (obj instanceof AbsoluteRoundedCornerShape) {
            return AbsoluteRoundedCornerShapeKt.lerp(this, (AbsoluteRoundedCornerShape) obj, f2);
        }
        return null;
    }

    public String toString() {
        return a.a(this, new StringBuilder(), ", topRight = ", ", bottomRight = ", ", bottomLeft = ", "AbsoluteRoundedCornerShape(topLeft = ");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteRoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}

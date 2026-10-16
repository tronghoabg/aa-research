package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo3069createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f5 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m8070toRectuvyYCjk(j2));
        }
        Path Path = AndroidPath_androidKt.Path();
        float f6 = layoutDirection == LayoutDirection.Ltr ? f2 : f3;
        Path.moveTo(0.0f, f6);
        Path.lineTo(f6, 0.0f);
        if (layoutDirection == LayoutDirection.Ltr) {
            f2 = f3;
        }
        int i2 = (int) (j2 >> 32);
        Path.lineTo(Float.intBitsToFloat(i2) - f2, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i2), f2);
        float f7 = layoutDirection == LayoutDirection.Ltr ? f4 : f5;
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        Path.lineTo(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) - f7);
        Path.lineTo(Float.intBitsToFloat(i2) - f7, Float.intBitsToFloat(i3));
        if (layoutDirection == LayoutDirection.Ltr) {
            f4 = f5;
        }
        Path.lineTo(f4, Float.intBitsToFloat(i3));
        Path.lineTo(0.0f, Float.intBitsToFloat(i3) - f4);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        return x.n(getTopStart(), cutCornerShape.getTopStart()) && x.n(getTopEnd(), cutCornerShape.getTopEnd()) && x.n(getBottomEnd(), cutCornerShape.getBottomEnd()) && x.n(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        if (x.n(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = CutCornerShapeKt.CutCornerShape(0.0f);
        }
        if (obj instanceof CutCornerShape) {
            return CutCornerShapeKt.lerp(this, (CutCornerShape) obj, f2);
        }
        return null;
    }

    public String toString() {
        return a.a(this, new StringBuilder(), ", topEnd = ", ", bottomEnd = ", ", bottomStart = ", "CutCornerShape(topStart = ");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}

package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BottomAppBarCutoutShape implements Shape {
    private final Shape cutoutShape;
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(Shape shape, FabPlacement fabPlacement) {
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(AppBarKt.BottomAppBarCutoutOffset);
        float width = this.fabPlacement.getWidth();
        float f2 = fMo2127toPx0680j_4 + fMo2127toPx0680j_4;
        float height = this.fabPlacement.getHeight();
        long jFloatToRawIntBits = Float.floatToRawIntBits(width + f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(height + f2);
        float left = this.fabPlacement.getLeft() - fMo2127toPx0680j_4;
        long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + left;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo2037createOutlinePq9zytI(j2, layoutDirection, density));
        path.mo8120translatek4lQ0M((Float.floatToRawIntBits(left) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(-fIntBitsToFloat2)));
        if (x.n(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            addRoundedEdges(path, left, fIntBitsToFloat, fIntBitsToFloat2, density.mo2127toPx0680j_4(AppBarKt.BottomAppBarRoundedEdgeRadius), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -((float) Math.sqrt((f4 * f4) - (f6 * f6)));
        k<Float, Float> kVarCalculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f7 - 1.0f, f6, f4);
        float fFloatValue = ((Number) kVarCalculateRoundedEdgeIntercept.a()).floatValue() + f4;
        float fFloatValue2 = ((Number) kVarCalculateRoundedEdgeIntercept.b()).floatValue() - f6;
        float f8 = f4 + f7;
        float f9 = f2 + f8;
        path.moveTo(f9 - f5, 0.0f);
        path.quadraticTo(f9 - 1.0f, 0.0f, f2 + fFloatValue, fFloatValue2);
        path.lineTo(f3 - fFloatValue, fFloatValue2);
        float f10 = f3 - f8;
        path.quadraticTo(1.0f + f10, 0.0f, f10 + f5, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i2 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    public final Shape component1() {
        return this.cutoutShape;
    }

    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    public final BottomAppBarCutoutShape copy(Shape shape, FabPlacement fabPlacement) {
        return new BottomAppBarCutoutShape(shape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        Path.CC.addRect$default(Path, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))), null, 2, null);
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo8117opN5in7k0(Path, Path2, PathOperation.Companion.m8564getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        return x.n(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && x.n(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}

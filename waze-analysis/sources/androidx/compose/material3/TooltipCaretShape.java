package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TooltipCaretShape implements Shape {
    private final Shape caretShape;
    private final Shape tooltipShape;
    private final MutableState<Matrix> transformationMatrix;
    private final Path tooltipPath = AndroidPath_androidKt.Path();
    private final Path combinedPath = AndroidPath_androidKt.Path();
    private final Path caretPath = AndroidPath_androidKt.Path();

    public TooltipCaretShape(MutableState<Matrix> mutableState, Shape shape, Shape shape2) {
        this.transformationMatrix = mutableState;
        this.tooltipShape = shape;
        this.caretShape = shape2;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        this.tooltipPath.reset();
        this.combinedPath.reset();
        this.caretPath.reset();
        Outline outlineMo2037createOutlinePq9zytI = this.tooltipShape.mo2037createOutlinePq9zytI(j2, layoutDirection, density);
        boolean z = outlineMo2037createOutlinePq9zytI instanceof Outline.Generic;
        Outline outlineMo2037createOutlinePq9zytI2 = this.caretShape.mo2037createOutlinePq9zytI(j2, layoutDirection, density);
        if (z) {
            Path.CC.m8542addPathUv8p0NA$default(this.tooltipPath, ((Outline.Generic) outlineMo2037createOutlinePq9zytI).getPath(), 0L, 2, null);
        } else if (outlineMo2037createOutlinePq9zytI instanceof Outline.Rounded) {
            Path.CC.addRoundRect$default(this.tooltipPath, ((Outline.Rounded) outlineMo2037createOutlinePq9zytI).getRoundRect(), null, 2, null);
        } else {
            if (!(outlineMo2037createOutlinePq9zytI instanceof Outline.Rectangle)) {
                throw new i();
            }
            Path.CC.addRect$default(this.tooltipPath, ((Outline.Rectangle) outlineMo2037createOutlinePq9zytI).getRect(), null, 2, null);
        }
        if (outlineMo2037createOutlinePq9zytI2 instanceof Outline.Generic) {
            Path.CC.m8542addPathUv8p0NA$default(this.caretPath, ((Outline.Generic) outlineMo2037createOutlinePq9zytI2).getPath(), 0L, 2, null);
        } else if (outlineMo2037createOutlinePq9zytI2 instanceof Outline.Rounded) {
            Path.CC.addRoundRect$default(this.caretPath, ((Outline.Rounded) outlineMo2037createOutlinePq9zytI2).getRoundRect(), null, 2, null);
        } else {
            if (!(outlineMo2037createOutlinePq9zytI2 instanceof Outline.Rectangle)) {
                throw new i();
            }
            Path.CC.addRect$default(this.caretPath, ((Outline.Rectangle) outlineMo2037createOutlinePq9zytI2).getRect(), null, 2, null);
        }
        this.caretPath.mo8119transform58bKbWc(this.transformationMatrix.getValue().m8515unboximpl());
        this.combinedPath.mo8117opN5in7k0(this.tooltipPath, this.caretPath, PathOperation.Companion.m8567getUnionb3I0S0c());
        return new Outline.Generic(this.combinedPath);
    }

    public final Path getCaretPath() {
        return this.caretPath;
    }

    public final Path getCombinedPath() {
        return this.combinedPath;
    }

    public final Path getTooltipPath() {
        return this.tooltipPath;
    }
}

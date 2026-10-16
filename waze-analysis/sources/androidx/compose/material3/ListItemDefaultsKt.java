package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemDefaultsKt {
    private static final boolean getHasCornerBasedShapes(ListItemShapes listItemShapes) {
        return (listItemShapes.getShape() instanceof CornerBasedShape) && (listItemShapes.getSelectedShape() instanceof CornerBasedShape) && (listItemShapes.getPressedShape() instanceof CornerBasedShape) && (listItemShapes.getFocusedShape() instanceof CornerBasedShape) && (listItemShapes.getHoveredShape() instanceof CornerBasedShape) && (listItemShapes.getDraggedShape() instanceof CornerBasedShape);
    }

    private static final boolean getHasRoundedCornerShapes(ListItemShapes listItemShapes) {
        return (listItemShapes.getShape() instanceof RoundedCornerShape) && (listItemShapes.getSelectedShape() instanceof RoundedCornerShape) && (listItemShapes.getPressedShape() instanceof RoundedCornerShape) && (listItemShapes.getFocusedShape() instanceof RoundedCornerShape) && (listItemShapes.getHoveredShape() instanceof RoundedCornerShape) && (listItemShapes.getDraggedShape() instanceof RoundedCornerShape);
    }

    public static final Shape shapeForInteraction(ListItemShapes listItemShapes, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        composer.startReplaceGroup(2080718032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2080718032, i2, -1, "androidx.compose.material3.shapeForInteraction (ListItemDefaults.kt:1076)");
        }
        Shape pressedShape = z2 ? listItemShapes.getPressedShape() : z5 ? listItemShapes.getDraggedShape() : z ? listItemShapes.getSelectedShape() : z3 ? listItemShapes.getFocusedShape() : z4 ? listItemShapes.getHoveredShape() : listItemShapes.getShape();
        if (getHasRoundedCornerShapes(listItemShapes)) {
            composer.startReplaceGroup(1703365676);
            composer.startMovableGroup(-1884714849, listItemShapes);
            x.d(pressedShape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            pressedShape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) pressedShape, finiteAnimationSpec, composer, (i2 >> 15) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (getHasCornerBasedShapes(listItemShapes)) {
            composer.startReplaceGroup(1703498542);
            composer.startMovableGroup(-1884710563, listItemShapes);
            x.d(pressedShape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            pressedShape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) pressedShape, finiteAnimationSpec, composer, (i2 >> 15) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.startReplaceGroup(1703594642);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return pressedShape;
    }

    private static /* synthetic */ void getHasCornerBasedShapes$annotations(ListItemShapes listItemShapes) {
    }

    private static /* synthetic */ void getHasRoundedCornerShapes$annotations(ListItemShapes listItemShapes) {
    }
}

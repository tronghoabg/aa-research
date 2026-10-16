package androidx.compose.material3;

import androidx.compose.material3.tokens.DragHandleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VerticalDragHandleDefaults {
    public static final int $stable = 0;
    public static final VerticalDragHandleDefaults INSTANCE = new VerticalDragHandleDefaults();
    private static final DragHandleSizes sizes = new DragHandleSizes(DpKt.m11186DpSizeYgX7TsA(DragHandleTokens.INSTANCE.m6657getWidthD9Ej5fM(), DragHandleTokens.INSTANCE.m6653getHeightD9Ej5fM()), DpKt.m11186DpSizeYgX7TsA(DragHandleTokens.INSTANCE.m6656getPressedWidthD9Ej5fM(), DragHandleTokens.INSTANCE.m6655getPressedHeightD9Ej5fM()), DpKt.m11186DpSizeYgX7TsA(DragHandleTokens.INSTANCE.m6651getDraggedWidthD9Ej5fM(), DragHandleTokens.INSTANCE.m6650getDraggedHeightD9Ej5fM()), null);

    private VerticalDragHandleDefaults() {
    }

    private final DragHandleColors getColors(ColorScheme colorScheme) {
        DragHandleColors defaultVerticalDragHandleColorsCached$material3 = colorScheme.getDefaultVerticalDragHandleColorsCached$material3();
        if (defaultVerticalDragHandleColorsCached$material3 != null) {
            return defaultVerticalDragHandleColorsCached$material3;
        }
        DragHandleColors dragHandleColors = new DragHandleColors(ColorSchemeKt.fromToken(colorScheme, DragHandleTokens.INSTANCE.getColor()), ColorSchemeKt.fromToken(colorScheme, DragHandleTokens.INSTANCE.getPressedColor()), ColorSchemeKt.fromToken(colorScheme, DragHandleTokens.INSTANCE.getDraggedColor()), null);
        colorScheme.setDefaultVerticalDragHandleColorsCached$material3(dragHandleColors);
        return dragHandleColors;
    }

    private final DragHandleShapes getShapes(Shapes shapes) {
        DragHandleShapes defaultVerticalDragHandleShapesCached$material3 = shapes.getDefaultVerticalDragHandleShapesCached$material3();
        if (defaultVerticalDragHandleShapesCached$material3 != null) {
            return defaultVerticalDragHandleShapesCached$material3;
        }
        DragHandleShapes dragHandleShapes = new DragHandleShapes(ShapesKt.fromToken(shapes, DragHandleTokens.INSTANCE.getShape()), ShapesKt.fromToken(shapes, DragHandleTokens.INSTANCE.getPressedShape()), ShapesKt.fromToken(shapes, DragHandleTokens.INSTANCE.getDraggedShape()));
        shapes.setDefaultVerticalDragHandleShapesCached$material3(dragHandleShapes);
        return dragHandleShapes;
    }

    /* renamed from: sizes-L9TjZb0$default, reason: not valid java name */
    public static /* synthetic */ DragHandleSizes m6100sizesL9TjZb0$default(VerticalDragHandleDefaults verticalDragHandleDefaults, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = DpSize.Companion.m11271getUnspecifiedMYxV2XQ();
        }
        long j5 = j2;
        if ((i2 & 2) != 0) {
            j3 = DpSize.Companion.m11271getUnspecifiedMYxV2XQ();
        }
        long j6 = j3;
        if ((i2 & 4) != 0) {
            j4 = DpSize.Companion.m11271getUnspecifiedMYxV2XQ();
        }
        return verticalDragHandleDefaults.m6102sizesL9TjZb0(j5, j6, j4);
    }

    public final DragHandleColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1465068453, i2, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:215)");
        }
        DragHandleColors colors = getColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors;
    }

    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final DragHandleColors m6101colorsRGew2ao(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2062501640, i2, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:234)");
        }
        DragHandleColors colors = getColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (jM8264getUnspecified0d7_KjU == 16) {
            jM8264getUnspecified0d7_KjU = colors.m4780getColor0d7_KjU();
        }
        if (jM8264getUnspecified0d7_KjU2 == 16) {
            jM8264getUnspecified0d7_KjU2 = colors.m4782getPressedColor0d7_KjU();
        }
        if (jM8264getUnspecified0d7_KjU3 == 16) {
            jM8264getUnspecified0d7_KjU3 = colors.m4781getDraggedColor0d7_KjU();
        }
        DragHandleColors dragHandleColors = new DragHandleColors(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dragHandleColors;
    }

    public final DragHandleShapes shapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(650848370, i2, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:265)");
        }
        if (1 == (i3 & 1)) {
            shape = null;
        }
        DragHandleShapes shapes = getShapes(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (shape == null) {
            shape = shapes.getShape();
        }
        if ((i3 & 2) != 0) {
            shape2 = null;
        }
        if (shape2 == null) {
            shape2 = shapes.getPressedShape();
        }
        if ((i3 & 4) != 0) {
            shape3 = null;
        }
        if (shape3 == null) {
            shape3 = shapes.getDraggedShape();
        }
        DragHandleShapes dragHandleShapes = new DragHandleShapes(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dragHandleShapes;
    }

    public final DragHandleSizes sizes() {
        return sizes;
    }

    /* renamed from: sizes-L9TjZb0, reason: not valid java name */
    public final DragHandleSizes m6102sizesL9TjZb0(long j2, long j3, long j4) {
        DragHandleSizes dragHandleSizes = sizes;
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j2 = dragHandleSizes.m4787getSizeMYxV2XQ();
        }
        return new DragHandleSizes(j2, j3 != InlineClassHelperKt.UnspecifiedPackedFloats ? j3 : dragHandleSizes.m4786getPressedSizeMYxV2XQ(), j4 != InlineClassHelperKt.UnspecifiedPackedFloats ? j4 : dragHandleSizes.m4785getDraggedSizeMYxV2XQ(), null);
    }

    public final DragHandleShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1385335639, i2, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:246)");
        }
        DragHandleShapes shapes = getShapes(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }
}

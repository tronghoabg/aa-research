package androidx.compose.material3;

import androidx.compose.material3.internal.ShapeUtilKt;
import androidx.compose.material3.tokens.LoadingIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shape;
import androidx.graphics.shapes.RoundedPolygon;
import h.a.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LoadingIndicatorDefaults {
    public static final int $stable;
    private static final float ActiveIndicatorScale;
    private static final float ContainerHeight;
    private static final float ContainerWidth;
    private static final List<RoundedPolygon> DeterminateIndicatorPolygons;
    public static final LoadingIndicatorDefaults INSTANCE = new LoadingIndicatorDefaults();
    private static final List<RoundedPolygon> IndeterminateIndicatorPolygons;
    private static final float IndicatorSize;

    static {
        float fM6843getContainerWidthD9Ej5fM = LoadingIndicatorTokens.INSTANCE.m6843getContainerWidthD9Ej5fM();
        ContainerWidth = fM6843getContainerWidthD9Ej5fM;
        float fM6842getContainerHeightD9Ej5fM = LoadingIndicatorTokens.INSTANCE.m6842getContainerHeightD9Ej5fM();
        ContainerHeight = fM6842getContainerHeightD9Ej5fM;
        float fM6841getActiveSizeD9Ej5fM = LoadingIndicatorTokens.INSTANCE.m6841getActiveSizeD9Ej5fM();
        IndicatorSize = fM6841getActiveSizeD9Ej5fM;
        IndeterminateIndicatorPolygons = i.i(MaterialShapes.Companion.getSoftBurst(), MaterialShapes.Companion.getCookie9Sided(), MaterialShapes.Companion.getPentagon(), MaterialShapes.Companion.getPill(), MaterialShapes.Companion.getSunny(), MaterialShapes.Companion.getCookie4Sided(), MaterialShapes.Companion.getOval());
        RoundedPolygon circle = MaterialShapes.Companion.getCircle();
        float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
        Matrix.m8506rotateZimpl(fArrM8492constructorimpl$default, 18.0f);
        DeterminateIndicatorPolygons = i.i(ShapeUtilKt.m6288transformedEL8BTi8(circle, fArrM8492constructorimpl$default), MaterialShapes.Companion.getSoftBurst());
        ActiveIndicatorScale = fM6841getActiveSizeD9Ej5fM / Math.min(fM6843getContainerWidthD9Ej5fM, fM6842getContainerHeightD9Ej5fM);
        $stable = 8;
    }

    private LoadingIndicatorDefaults() {
    }

    public final float getActiveIndicatorScale$material3() {
        return ActiveIndicatorScale;
    }

    public final long getContainedContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1228434263, i2, -1, "androidx.compose.material3.LoadingIndicatorDefaults.<get-containedContainerColor> (LoadingIndicator.kt:523)");
        }
        long value = ColorSchemeKt.getValue(LoadingIndicatorTokens.INSTANCE.getContainedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainedIndicatorColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(507506629, i2, -1, "androidx.compose.material3.LoadingIndicatorDefaults.<get-containedIndicatorColor> (LoadingIndicator.kt:519)");
        }
        long value = ColorSchemeKt.getValue(LoadingIndicatorTokens.INSTANCE.getContainedActiveColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m5171getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final Shape getContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-177211483, i2, -1, "androidx.compose.material3.LoadingIndicatorDefaults.<get-containerShape> (LoadingIndicator.kt:505)");
        }
        Shape value = ShapesKt.getValue(LoadingIndicatorTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m5172getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final List<RoundedPolygon> getDeterminateIndicatorPolygons() {
        return DeterminateIndicatorPolygons;
    }

    public final List<RoundedPolygon> getIndeterminateIndicatorPolygons() {
        return IndeterminateIndicatorPolygons;
    }

    public final long getIndicatorColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068204953, i2, -1, "androidx.compose.material3.LoadingIndicatorDefaults.<get-indicatorColor> (LoadingIndicator.kt:512)");
        }
        long value = ColorSchemeKt.getValue(LoadingIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m5173getIndicatorSizeD9Ej5fM() {
        return IndicatorSize;
    }
}

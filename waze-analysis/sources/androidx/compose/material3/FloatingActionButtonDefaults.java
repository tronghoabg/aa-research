package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabLargeTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FabPrimaryContainerTokens;
import androidx.compose.material3.tokens.FabSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float ShowHideTargetScale = 0.2f;
    private static final float MediumIconSize = FabMediumTokens.INSTANCE.m6709getIconSizeD9Ej5fM();
    private static final float LargeIconSize = 36.0f;

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m4857bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return floatingActionButtonDefaults.m4858bottomAppBarFabElevationa9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m4858bottomAppBarFabElevationa9UjIt4(float f2, float f3, float f4, float f5) {
        return new FloatingActionButtonElevation(f2, f3, f4, f5, null);
    }

    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m4859elevationxZ9QkE(float f2, float f3, float f4, float f5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FabPrimaryContainerTokens.INSTANCE.m6722getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FabPrimaryContainerTokens.INSTANCE.m6725getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FabPrimaryContainerTokens.INSTANCE.m6723getFocusedContainerElevationD9Ej5fM();
        }
        float f6 = f4;
        if ((i3 & 8) != 0) {
            f5 = FabPrimaryContainerTokens.INSTANCE.m6724getHoveredContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:1051)");
        }
        float f7 = f2;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f7, f3, f6, f5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }

    public final long getContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:1031)");
        }
        long value = ColorSchemeKt.getValue(FabPrimaryContainerTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtendedFabShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:1015)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeExtendedFabShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(854532185, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeExtendedFabShape> (FloatingActionButton.kt:1027)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4860getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    public final Shape getLargeShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:1011)");
        }
        Shape value = ShapesKt.getValue(FabLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumExtendedFabShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-996203963, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-mediumExtendedFabShape> (FloatingActionButton.kt:1023)");
        }
        CornerBasedShape largeIncreased = ShapeDefaults.INSTANCE.getLargeIncreased();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return largeIncreased;
    }

    /* renamed from: getMediumIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4861getMediumIconSizeD9Ej5fM() {
        return MediumIconSize;
    }

    public final Shape getMediumShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(356809117, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-mediumShape> (FloatingActionButton.kt:1007)");
        }
        CornerBasedShape largeIncreased = ShapeDefaults.INSTANCE.getLargeIncreased();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return largeIncreased;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:999)");
        }
        Shape value = ShapesKt.getValue(FabBaselineTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final float getShowHideTargetScale$material3() {
        return ShowHideTargetScale;
    }

    public final Shape getSmallExtendedFabShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-301808959, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallExtendedFabShape> (FloatingActionButton.kt:1019)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabSmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSmallShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:1003)");
        }
        Shape value = ShapesKt.getValue(FabSmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m4862loweredElevationxZ9QkE(float f2, float f3, float f4, float f5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = ElevationTokens.INSTANCE.m6671getLevel1D9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = ElevationTokens.INSTANCE.m6671getLevel1D9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = ElevationTokens.INSTANCE.m6671getLevel1D9Ej5fM();
        }
        float f6 = f4;
        if ((i3 & 8) != 0) {
            f5 = ElevationTokens.INSTANCE.m6672getLevel2D9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:1075)");
        }
        float f7 = f2;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f7, f3, f6, f5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation;
    }
}

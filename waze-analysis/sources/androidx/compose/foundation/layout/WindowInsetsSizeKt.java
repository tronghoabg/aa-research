package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    private static final WindowInsetsWidthCalculator startCalc = new WindowInsetsWidthCalculator() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.foundation.layout.WindowInsetsWidthCalculator
        public final int calculate(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
            return WindowInsetsSizeKt.startCalc$lambda$0(windowInsets, layoutDirection, density);
        }
    };
    private static final WindowInsetsWidthCalculator endCalc = new WindowInsetsWidthCalculator() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda1
        @Override // androidx.compose.foundation.layout.WindowInsetsWidthCalculator
        public final int calculate(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
            return WindowInsetsSizeKt.endCalc$lambda$0(windowInsets, layoutDirection, density);
        }
    };
    private static final WindowInsetsHeightCalculator topCalc = new WindowInsetsHeightCalculator() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda2
        @Override // androidx.compose.foundation.layout.WindowInsetsHeightCalculator
        public final int calculate(WindowInsets windowInsets, Density density) {
            return windowInsets.getTop(density);
        }
    };
    private static final WindowInsetsHeightCalculator bottomCalc = new WindowInsetsHeightCalculator() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda3
        @Override // androidx.compose.foundation.layout.WindowInsetsHeightCalculator
        public final int calculate(WindowInsets windowInsets, Density density) {
            return windowInsets.getBottom(density);
        }
    };

    static final int endCalc$lambda$0(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return layoutDirection == LayoutDirection.Rtl ? windowInsets.getLeft(density, layoutDirection) : windowInsets.getRight(density, layoutDirection);
    }

    static final int startCalc$lambda$0(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return layoutDirection == LayoutDirection.Ltr ? windowInsets.getLeft(density, layoutDirection) : windowInsets.getRight(density, layoutDirection);
    }

    public static final Modifier windowInsetsBottomHeight(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), bottomCalc));
    }

    public static final Modifier windowInsetsEndWidth(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), endCalc));
    }

    public static final Modifier windowInsetsStartWidth(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), startCalc));
    }

    public static final Modifier windowInsetsTopHeight(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifierElement(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), topCalc));
    }
}

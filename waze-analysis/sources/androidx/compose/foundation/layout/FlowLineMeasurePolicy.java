package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.FlowLineMeasurePolicy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$createConstraints-xF2OJ5Q, reason: not valid java name */
        public static long m2615$default$createConstraintsxF2OJ5Q(FlowLineMeasurePolicy flowLineMeasurePolicy, int i2, int i3, int i4, int i5, boolean z) {
            return flowLineMeasurePolicy.isHorizontal() ? RowKt.createRowConstraints(z, i2, i3, i4, i5) : ColumnKt.createColumnConstraints(z, i2, i3, i4, i5);
        }

        public static int $default$crossAxisSize(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
            return flowLineMeasurePolicy.isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
        }

        public static int $default$getCrossAxisPosition(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable, int i2, LayoutDirection layoutDirection, int i3) {
            CrossAxisAlignment crossAxisAlignment;
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(placeable);
            if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
                crossAxisAlignment = flowLineMeasurePolicy.getCrossAxisAlignment();
            }
            return crossAxisAlignment.align$foundation_layout(i2, flowLineMeasurePolicy.crossAxisSize(placeable), layoutDirection, placeable, i3);
        }

        public static int $default$mainAxisSize(FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
            return flowLineMeasurePolicy.isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
        }

        public static MeasureResult $default$placeHelper(final FlowLineMeasurePolicy flowLineMeasurePolicy, final Placeable[] placeableArr, MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, final int[] iArr2, final int i5, final int i6, final int i7) {
            boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
            int i8 = true != zIsHorizontal ? i3 : i4;
            int i9 = true != zIsHorizontal ? i4 : i3;
            final LayoutDirection layoutDirection = flowLineMeasurePolicy.isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
            return MeasureScope.CC.layout$default(measureScope, i9, i8, null, new l() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FlowLineMeasurePolicy.CC.placeHelper$lambda$0$0(iArr2, i5, i6, i7, placeableArr, flowLineMeasurePolicy, i4, layoutDirection, i2, iArr, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        public static void $default$populateMainAxisPositions(FlowLineMeasurePolicy flowLineMeasurePolicy, int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
            if (flowLineMeasurePolicy.isHorizontal()) {
                flowLineMeasurePolicy.getHorizontalArrangement().arrange(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
            } else {
                flowLineMeasurePolicy.getVerticalArrangement().arrange(measureScope, i2, iArr, iArr2);
            }
        }

        public static ab placeHelper$lambda$0$0(int[] iArr, int i2, int i3, int i4, Placeable[] placeableArr, FlowLineMeasurePolicy flowLineMeasurePolicy, int i5, LayoutDirection layoutDirection, int i6, int[] iArr2, Placeable.PlacementScope placementScope) {
            int i7 = iArr != null ? iArr[i2] : 0;
            for (int i8 = i3; i8 < i4; i8++) {
                int i9 = i8 - i3;
                Placeable placeable = placeableArr[i8];
                if (placeable == null) {
                    x.g();
                }
                int crossAxisPosition = flowLineMeasurePolicy.getCrossAxisPosition(placeable, i5, layoutDirection, i6) + i7;
                if (flowLineMeasurePolicy.isHorizontal()) {
                    Placeable.PlacementScope.place$default(placementScope, placeable, iArr2[i9], crossAxisPosition, 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, iArr2[i9], 0.0f, 4, null);
                }
            }
            return ab.f48028a;
        }
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z);

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    int crossAxisSize(Placeable placeable);

    CrossAxisAlignment getCrossAxisAlignment();

    int getCrossAxisPosition(Placeable placeable, int i2, LayoutDirection layoutDirection, int i3);

    Arrangement.Horizontal getHorizontalArrangement();

    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    int mainAxisSize(Placeable placeable);

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7);

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope);
}

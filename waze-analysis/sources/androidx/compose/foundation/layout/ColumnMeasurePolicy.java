package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Alignment.Horizontal horizontalAlignment;
    private final Arrangement.Vertical verticalArrangement;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    private final Arrangement.Vertical component1() {
        return this.verticalArrangement;
    }

    private final Alignment.Horizontal component2() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i2 & 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout(i2, crossAxisSize(placeable), layoutDirection, placeable, i3) : this.horizontalAlignment.align(crossAxisSize(placeable), i2, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab placeHelper$lambda$0$0(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i2, int i3, MeasureScope measureScope, int[] iArr, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Placeable placeable = placeableArr[i4];
            int i6 = i5 + 1;
            if (placeable == null) {
                x.g();
            }
            Placeable.PlacementScope.place$default(placementScope, placeable, columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i2, i3, measureScope.getLayoutDirection()), iArr[i5], 0.0f, 4, null);
            i4++;
            i5 = i6;
        }
        return ab.f48028a;
    }

    public final ColumnMeasurePolicy copy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        return new ColumnMeasurePolicy(vertical, horizontal);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z) {
        return ColumnKt.createColumnConstraints(z, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return x.n(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && x.n(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.verticalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.verticalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        return RowColumnMeasurePolicyKt.measure(this, Constraints.m11108getMinHeightimpl(j2), Constraints.m11109getMinWidthimpl(j2), Constraints.m11106getMaxHeightimpl(j2), Constraints.m11107getMaxWidthimpl(j2), measureScope.mo2121roundToPx0680j_4(this.verticalArrangement.mo2446getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS & 1024) != 0 ? null : null, (DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.verticalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.verticalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, final MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.CC.layout$default(measureScope, i4, i3, null, new l() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ColumnMeasurePolicy.placeHelper$lambda$0$0(placeableArr, this, i4, i2, measureScope, iArr, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.verticalArrangement.arrange(measureScope, i2, iArr, iArr2);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}

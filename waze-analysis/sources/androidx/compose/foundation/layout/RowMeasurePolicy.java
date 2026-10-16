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
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Arrangement.Horizontal horizontalArrangement;
    private final Alignment.Vertical verticalAlignment;

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    private final Arrangement.Horizontal component1() {
        return this.horizontalArrangement;
    }

    private final Alignment.Vertical component2() {
        return this.verticalAlignment;
    }

    public static /* synthetic */ RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = rowMeasurePolicy.horizontalArrangement;
        }
        if ((i2 & 2) != 0) {
            vertical = rowMeasurePolicy.verticalAlignment;
        }
        return rowMeasurePolicy.copy(horizontal, vertical);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3) {
        CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.align$foundation_layout(i2, crossAxisSize(placeable), LayoutDirection.Ltr, placeable, i3) : this.verticalAlignment.align(crossAxisSize(placeable), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab placeHelper$lambda$0$0(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i2, int i3, int[] iArr, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Placeable placeable = placeableArr[i4];
            int i6 = i5 + 1;
            if (placeable == null) {
                x.g();
            }
            Placeable.PlacementScope.place$default(placementScope, placeable, iArr[i5], rowMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i2, i3), 0.0f, 4, null);
            i4++;
            i5 = i6;
        }
        return ab.f48028a;
    }

    public final RowMeasurePolicy copy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        return new RowMeasurePolicy(horizontal, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z) {
        return RowKt.createRowConstraints(z, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return x.n(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && x.n(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        return RowColumnMeasurePolicyKt.measure(this, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), Constraints.m11107getMaxWidthimpl(j2), Constraints.m11106getMaxHeightimpl(j2), measureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM()), measureScope, list, new Placeable[list.size()], 0, list.size(), (DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS & 1024) != 0 ? null : null, (DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i2, final int[] iArr, int i3, final int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.CC.layout$default(measureScope, i3, i4, null, new l() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RowMeasurePolicy.placeHelper$lambda$0$0(placeableArr, this, i4, i2, iArr, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }
}

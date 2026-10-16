package androidx.compose.ui.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.CC.layout$default(measureScope, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (size == 1) {
            Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, ConstraintsKt.m11124constrainWidthK40F9xA(j2, placeableMo9741measureBRTryo0.getWidth()), ConstraintsKt.m11123constrainHeightK40F9xA(j2, placeableMo9741measureBRTryo0.getHeight()), null, new RootMeasurePolicy$measure$2(placeableMo9741measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            Placeable placeableMo9741measureBRTryo02 = list.get(i2).mo9741measureBRTryo0(j2);
            iMax = Math.max(placeableMo9741measureBRTryo02.getWidth(), iMax);
            iMax2 = Math.max(placeableMo9741measureBRTryo02.getHeight(), iMax2);
            arrayList.add(placeableMo9741measureBRTryo02);
        }
        return MeasureScope.CC.layout$default(measureScope, ConstraintsKt.m11124constrainWidthK40F9xA(j2, iMax), ConstraintsKt.m11123constrainHeightK40F9xA(j2, iMax2), null, new RootMeasurePolicy$measure$3(arrayList), 4, null);
    }
}

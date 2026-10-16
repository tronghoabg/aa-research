package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MeasurerKt {
    private static final boolean DEBUG = false;

    public static final String getAnyOrNullId(Measurable measurable) {
        String string;
        Object layoutId = LayoutIdKt.getLayoutId(measurable);
        if (layoutId == null) {
            layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
        }
        return (layoutId == null || (string = layoutId.toString()) == null) ? "null" : string;
    }
}

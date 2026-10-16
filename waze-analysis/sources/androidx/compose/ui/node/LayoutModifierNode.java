package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayoutModifierNode extends DelegatableNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.LayoutModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);
}

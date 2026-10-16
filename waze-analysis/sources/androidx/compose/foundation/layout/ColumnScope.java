package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import h.g.a.l;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface ColumnScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.ColumnScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f2, boolean z, int i2, Object obj) {
            if (obj == null) {
                return columnScope.weight(modifier, f2, z | (!((i2 & 2) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    Modifier alignBy(Modifier modifier, l<? super Measured, Integer> lVar);

    Modifier weight(Modifier modifier, float f2, boolean z);
}

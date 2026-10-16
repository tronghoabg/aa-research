package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import h.g.a.l;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface RowScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.RowScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier weight$default(RowScope rowScope, Modifier modifier, float f2, boolean z, int i2, Object obj) {
            if (obj == null) {
                return rowScope.weight(modifier, f2, z | (!((i2 & 2) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    Modifier align(Modifier modifier, Alignment.Vertical vertical);

    Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine);

    Modifier alignBy(Modifier modifier, l<? super Measured, Integer> lVar);

    Modifier alignByBaseline(Modifier modifier);

    Modifier weight(Modifier modifier, float f2, boolean z);
}

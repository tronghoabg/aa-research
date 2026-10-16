package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface FlowRowScope extends RowScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.FlowRowScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier fillMaxRowHeight$default(FlowRowScope flowRowScope, Modifier modifier, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
            }
            if (1 == (i2 & 1)) {
                f2 = 1.0f;
            }
            return flowRowScope.fillMaxRowHeight(modifier, f2);
        }
    }

    Modifier fillMaxRowHeight(Modifier modifier, float f2);
}

package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface ContextualFlowRowScope extends RowScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.ContextualFlowRowScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier fillMaxRowHeight$default(ContextualFlowRowScope contextualFlowRowScope, Modifier modifier, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
            }
            if (1 == (i2 & 1)) {
                f2 = 1.0f;
            }
            return contextualFlowRowScope.fillMaxRowHeight(modifier, f2);
        }
    }

    Modifier fillMaxRowHeight(Modifier modifier, float f2);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo2484getMaxHeightD9Ej5fM();

    /* renamed from: getMaxWidthInLine-D9Ej5fM, reason: not valid java name */
    float mo2485getMaxWidthInLineD9Ej5fM();
}

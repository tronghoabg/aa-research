package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface ContextualFlowColumnScope extends ColumnScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.ContextualFlowColumnScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier fillMaxColumnWidth$default(ContextualFlowColumnScope contextualFlowColumnScope, Modifier modifier, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
            }
            if (1 == (i2 & 1)) {
                f2 = 1.0f;
            }
            return contextualFlowColumnScope.fillMaxColumnWidth(modifier, f2);
        }
    }

    Modifier fillMaxColumnWidth(Modifier modifier, float f2);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo2479getMaxHeightInLineD9Ej5fM();

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo2480getMaxWidthD9Ej5fM();
}

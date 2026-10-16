package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface IntrinsicMeasureScope extends Density {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.IntrinsicMeasureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isLookingAhead(IntrinsicMeasureScope intrinsicMeasureScope) {
            return false;
        }
    }

    LayoutDirection getLayoutDirection();

    boolean isLookingAhead();
}

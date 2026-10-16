package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    public static final Modifier excludeFromSystemGesture(Modifier modifier, l<? super LayoutCoordinates, Rect> lVar) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, lVar);
    }
}

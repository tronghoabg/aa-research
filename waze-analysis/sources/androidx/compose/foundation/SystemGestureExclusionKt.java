package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    private static final Modifier excludeFromSystemGestureQ(l<? super LayoutCoordinates, Rect> lVar) {
        return new ExcludeFromSystemGestureElement(lVar);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        return modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, l<? super LayoutCoordinates, Rect> lVar) {
        return modifier.then(new ExcludeFromSystemGestureElement(lVar));
    }
}

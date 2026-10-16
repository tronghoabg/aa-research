package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import h.g.a.p;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DraggableAnchorsKt {
    public static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> pVar) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, pVar, orientation));
    }
}

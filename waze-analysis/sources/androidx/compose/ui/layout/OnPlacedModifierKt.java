package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnPlacedModifierKt {
    public static final Modifier onPlaced(Modifier modifier, l<? super LayoutCoordinates, ab> lVar) {
        return modifier.then(new OnPlacedElement(lVar));
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    public static final Modifier onGloballyPositioned(Modifier modifier, l<? super LayoutCoordinates, ab> lVar) {
        return modifier.then(new OnGloballyPositionedElement(lVar));
    }
}

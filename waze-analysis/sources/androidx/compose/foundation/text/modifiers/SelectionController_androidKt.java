package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionController_androidKt {
    public static final Modifier makeSelectionModifier(SelectionRegistrar selectionRegistrar, long j2, a<? extends LayoutCoordinates> aVar) {
        return SelectionControllerKt.makeDefaultSelectionModifier(selectionRegistrar, j2, aVar);
    }
}

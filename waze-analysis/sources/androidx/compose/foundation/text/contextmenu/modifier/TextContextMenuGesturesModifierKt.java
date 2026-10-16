package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuGesturesModifierKt {
    public static final Modifier showTextContextMenuOnSecondaryClick(Modifier modifier, p<? super Offset, ? super e<? super ab>, ? extends Object> pVar) {
        return modifier.then(new TextContextMenuGestureElement(pVar));
    }

    public static /* synthetic */ Modifier showTextContextMenuOnSecondaryClick$default(Modifier modifier, p pVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            pVar = null;
        }
        return showTextContextMenuOnSecondaryClick(modifier, pVar);
    }
}

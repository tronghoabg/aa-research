package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuModifier_androidKt {
    public static final Modifier addTextContextMenuComponentsWithContext(Modifier modifier, p<? super TextContextMenuBuilderScope, ? super Context, ab> pVar) {
        return modifier.then(new AddTextContextMenuDataComponentsWithContextElement(pVar));
    }
}

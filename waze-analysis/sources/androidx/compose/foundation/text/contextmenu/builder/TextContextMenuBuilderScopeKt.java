package androidx.compose.foundation.text.contextmenu.builder;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScopeKt {
    public static final boolean isSeparator(TextContextMenuComponent textContextMenuComponent) {
        return textContextMenuComponent == TextContextMenuSeparator.INSTANCE;
    }
}

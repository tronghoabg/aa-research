package androidx.compose.foundation.text.contextmenu.data;

import androidx.compose.ui.util.ListUtilsKt;
import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuData {
    private final List<TextContextMenuComponent> components;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TextContextMenuData Empty = new TextContextMenuData(i.h());

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuData(List<? extends TextContextMenuComponent> list) {
        this.components = list;
    }

    public final List<TextContextMenuComponent> getComponents() {
        return this.components;
    }

    public String toString() {
        return "TextContextMenuData(components=" + ListUtilsKt.fastJoinToString$default(this.components, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextContextMenuData getEmpty() {
            return TextContextMenuData.Empty;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

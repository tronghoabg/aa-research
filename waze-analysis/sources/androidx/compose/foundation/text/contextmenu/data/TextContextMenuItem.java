package androidx.compose.foundation.text.contextmenu.data;

import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final String label;
    private final int leadingIcon;
    private final l<TextContextMenuSession, ab> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuItem(Object obj, String str, int i2, l<? super TextContextMenuSession, ab> lVar) {
        super(obj);
        this.label = str;
        this.leadingIcon = i2;
        this.onClick = lVar;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    public final l<TextContextMenuSession, ab> getOnClick() {
        return this.onClick;
    }

    public String toString() {
        return "TextContextMenuItem(key=" + getKey() + ", label=\"" + this.label + "\", leadingIcon=" + this.leadingIcon + ')';
    }

    public /* synthetic */ TextContextMenuItem(Object obj, String str, int i2, l lVar, int i3, o oVar) {
        this(obj, str, (i3 & 4) != 0 ? 0 : i2, lVar);
    }
}

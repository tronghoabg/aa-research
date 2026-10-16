package androidx.compose.foundation.text.contextmenu.modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuDataTraverseKey {
    public static final TextContextMenuDataTraverseKey INSTANCE = new TextContextMenuDataTraverseKey();

    private TextContextMenuDataTraverseKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuDataTraverseKey)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -858256270;
    }

    public String toString() {
        return "TextContextMenuDataTraverseKey";
    }
}

package androidx.compose.foundation.text.contextmenu.data;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuKeys {
    public static final TextContextMenuKeys INSTANCE = new TextContextMenuKeys();
    private static final Object CutKey = new Object();
    private static final Object CopyKey = new Object();
    private static final Object PasteKey = new Object();
    private static final Object SelectAllKey = new Object();
    private static final Object AutofillKey = new Object();
    public static final int $stable = 8;

    private TextContextMenuKeys() {
    }

    public final Object getAutofillKey() {
        return AutofillKey;
    }

    public final Object getCopyKey() {
        return CopyKey;
    }

    public final Object getCutKey() {
        return CutKey;
    }

    public final Object getPasteKey() {
        return PasteKey;
    }

    public final Object getSelectAllKey() {
        return SelectAllKey;
    }
}

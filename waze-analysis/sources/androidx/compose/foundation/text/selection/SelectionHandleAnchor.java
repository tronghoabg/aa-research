package androidx.compose.foundation.text.selection;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionHandleAnchor {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectionHandleAnchor[] $VALUES;
    public static final SelectionHandleAnchor Left = new SelectionHandleAnchor("Left", 0);
    public static final SelectionHandleAnchor Middle = new SelectionHandleAnchor("Middle", 1);
    public static final SelectionHandleAnchor Right = new SelectionHandleAnchor("Right", 2);

    private static final /* synthetic */ SelectionHandleAnchor[] $values() {
        return new SelectionHandleAnchor[]{Left, Middle, Right};
    }

    static {
        SelectionHandleAnchor[] selectionHandleAnchorArr$values = $values();
        $VALUES = selectionHandleAnchorArr$values;
        $ENTRIES = b.a(selectionHandleAnchorArr$values);
    }

    private SelectionHandleAnchor(String str, int i2) {
    }

    public static a<SelectionHandleAnchor> getEntries() {
        return $ENTRIES;
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }
}

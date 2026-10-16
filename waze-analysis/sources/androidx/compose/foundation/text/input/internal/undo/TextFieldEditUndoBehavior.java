package androidx.compose.foundation.text.input.internal.undo;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES;
    public static final TextFieldEditUndoBehavior MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
    public static final TextFieldEditUndoBehavior ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
    public static final TextFieldEditUndoBehavior NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);

    private static final /* synthetic */ TextFieldEditUndoBehavior[] $values() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    static {
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr$values = $values();
        $VALUES = textFieldEditUndoBehaviorArr$values;
        $ENTRIES = b.a(textFieldEditUndoBehaviorArr$values);
    }

    private TextFieldEditUndoBehavior(String str, int i2) {
    }

    public static a<TextFieldEditUndoBehavior> getEntries() {
        return $ENTRIES;
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }
}

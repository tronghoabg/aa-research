package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextFieldType[] $VALUES;
    public static final TextFieldType Filled = new TextFieldType("Filled", 0);
    public static final TextFieldType Outlined = new TextFieldType("Outlined", 1);

    private static final /* synthetic */ TextFieldType[] $values() {
        return new TextFieldType[]{Filled, Outlined};
    }

    static {
        TextFieldType[] textFieldTypeArr$values = $values();
        $VALUES = textFieldTypeArr$values;
        $ENTRIES = b.a(textFieldTypeArr$values);
    }

    private TextFieldType(String str, int i2) {
    }

    public static a<TextFieldType> getEntries() {
        return $ENTRIES;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}

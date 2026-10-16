package androidx.compose.foundation.text.input.internal.undo;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextDeleteType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextDeleteType[] $VALUES;
    public static final TextDeleteType Start = new TextDeleteType("Start", 0);
    public static final TextDeleteType End = new TextDeleteType("End", 1);
    public static final TextDeleteType Inner = new TextDeleteType("Inner", 2);
    public static final TextDeleteType NotByUser = new TextDeleteType("NotByUser", 3);

    private static final /* synthetic */ TextDeleteType[] $values() {
        return new TextDeleteType[]{Start, End, Inner, NotByUser};
    }

    static {
        TextDeleteType[] textDeleteTypeArr$values = $values();
        $VALUES = textDeleteTypeArr$values;
        $ENTRIES = b.a(textDeleteTypeArr$values);
    }

    private TextDeleteType(String str, int i2) {
    }

    public static a<TextDeleteType> getEntries() {
        return $ENTRIES;
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) $VALUES.clone();
    }
}

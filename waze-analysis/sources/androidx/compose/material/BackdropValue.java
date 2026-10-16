package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BackdropValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackdropValue[] $VALUES;
    public static final BackdropValue Concealed = new BackdropValue("Concealed", 0);
    public static final BackdropValue Revealed = new BackdropValue("Revealed", 1);

    private static final /* synthetic */ BackdropValue[] $values() {
        return new BackdropValue[]{Concealed, Revealed};
    }

    static {
        BackdropValue[] backdropValueArr$values = $values();
        $VALUES = backdropValueArr$values;
        $ENTRIES = b.a(backdropValueArr$values);
    }

    private BackdropValue(String str, int i2) {
    }

    public static a<BackdropValue> getEntries() {
        return $ENTRIES;
    }

    public static BackdropValue valueOf(String str) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, str);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) $VALUES.clone();
    }
}

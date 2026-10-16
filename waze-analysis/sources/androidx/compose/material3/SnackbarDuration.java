package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Short = new SnackbarDuration("Short", 0);
    public static final SnackbarDuration Long = new SnackbarDuration("Long", 1);
    public static final SnackbarDuration Indefinite = new SnackbarDuration("Indefinite", 2);

    private static final /* synthetic */ SnackbarDuration[] $values() {
        return new SnackbarDuration[]{Short, Long, Indefinite};
    }

    static {
        SnackbarDuration[] snackbarDurationArr$values = $values();
        $VALUES = snackbarDurationArr$values;
        $ENTRIES = b.a(snackbarDurationArr$values);
    }

    private SnackbarDuration(String str, int i2) {
    }

    public static a<SnackbarDuration> getEntries() {
        return $ENTRIES;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}

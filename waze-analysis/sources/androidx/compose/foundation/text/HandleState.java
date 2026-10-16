package androidx.compose.foundation.text;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HandleState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HandleState[] $VALUES;
    public static final HandleState None = new HandleState("None", 0);
    public static final HandleState Selection = new HandleState("Selection", 1);
    public static final HandleState Cursor = new HandleState("Cursor", 2);

    private static final /* synthetic */ HandleState[] $values() {
        return new HandleState[]{None, Selection, Cursor};
    }

    static {
        HandleState[] handleStateArr$values = $values();
        $VALUES = handleStateArr$values;
        $ENTRIES = b.a(handleStateArr$values);
    }

    private HandleState(String str, int i2) {
    }

    public static a<HandleState> getEntries() {
        return $ENTRIES;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}

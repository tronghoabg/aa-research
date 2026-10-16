package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DismissDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DismissDirection[] $VALUES;
    public static final DismissDirection StartToEnd = new DismissDirection("StartToEnd", 0);
    public static final DismissDirection EndToStart = new DismissDirection("EndToStart", 1);

    private static final /* synthetic */ DismissDirection[] $values() {
        return new DismissDirection[]{StartToEnd, EndToStart};
    }

    static {
        DismissDirection[] dismissDirectionArr$values = $values();
        $VALUES = dismissDirectionArr$values;
        $ENTRIES = b.a(dismissDirectionArr$values);
    }

    private DismissDirection(String str, int i2) {
    }

    public static a<DismissDirection> getEntries() {
        return $ENTRIES;
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }
}

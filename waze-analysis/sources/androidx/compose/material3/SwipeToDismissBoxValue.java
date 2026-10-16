package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SwipeToDismissBoxValue[] $VALUES;
    public static final SwipeToDismissBoxValue StartToEnd = new SwipeToDismissBoxValue("StartToEnd", 0);
    public static final SwipeToDismissBoxValue EndToStart = new SwipeToDismissBoxValue("EndToStart", 1);
    public static final SwipeToDismissBoxValue Settled = new SwipeToDismissBoxValue("Settled", 2);

    private static final /* synthetic */ SwipeToDismissBoxValue[] $values() {
        return new SwipeToDismissBoxValue[]{StartToEnd, EndToStart, Settled};
    }

    static {
        SwipeToDismissBoxValue[] swipeToDismissBoxValueArr$values = $values();
        $VALUES = swipeToDismissBoxValueArr$values;
        $ENTRIES = b.a(swipeToDismissBoxValueArr$values);
    }

    private SwipeToDismissBoxValue(String str, int i2) {
    }

    public static a<SwipeToDismissBoxValue> getEntries() {
        return $ENTRIES;
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) $VALUES.clone();
    }
}

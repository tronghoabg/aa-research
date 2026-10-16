package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BottomDrawerValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BottomDrawerValue[] $VALUES;
    public static final BottomDrawerValue Closed = new BottomDrawerValue("Closed", 0);
    public static final BottomDrawerValue Open = new BottomDrawerValue("Open", 1);
    public static final BottomDrawerValue Expanded = new BottomDrawerValue("Expanded", 2);

    private static final /* synthetic */ BottomDrawerValue[] $values() {
        return new BottomDrawerValue[]{Closed, Open, Expanded};
    }

    static {
        BottomDrawerValue[] bottomDrawerValueArr$values = $values();
        $VALUES = bottomDrawerValueArr$values;
        $ENTRIES = b.a(bottomDrawerValueArr$values);
    }

    private BottomDrawerValue(String str, int i2) {
    }

    public static a<BottomDrawerValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) $VALUES.clone();
    }
}

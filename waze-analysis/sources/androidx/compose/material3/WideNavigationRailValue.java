package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WideNavigationRailValue[] $VALUES;
    public static final WideNavigationRailValue Collapsed = new WideNavigationRailValue("Collapsed", 0);
    public static final WideNavigationRailValue Expanded = new WideNavigationRailValue("Expanded", 1);

    private static final /* synthetic */ WideNavigationRailValue[] $values() {
        return new WideNavigationRailValue[]{Collapsed, Expanded};
    }

    static {
        WideNavigationRailValue[] wideNavigationRailValueArr$values = $values();
        $VALUES = wideNavigationRailValueArr$values;
        $ENTRIES = b.a(wideNavigationRailValueArr$values);
    }

    private WideNavigationRailValue(String str, int i2) {
    }

    public static a<WideNavigationRailValue> getEntries() {
        return $ENTRIES;
    }

    public static WideNavigationRailValue valueOf(String str) {
        return (WideNavigationRailValue) Enum.valueOf(WideNavigationRailValue.class, str);
    }

    public static WideNavigationRailValue[] values() {
        return (WideNavigationRailValue[]) $VALUES.clone();
    }
}

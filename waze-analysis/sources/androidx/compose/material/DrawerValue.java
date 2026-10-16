package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawerValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed = new DrawerValue("Closed", 0);
    public static final DrawerValue Open = new DrawerValue("Open", 1);

    private static final /* synthetic */ DrawerValue[] $values() {
        return new DrawerValue[]{Closed, Open};
    }

    static {
        DrawerValue[] drawerValueArr$values = $values();
        $VALUES = drawerValueArr$values;
        $ENTRIES = b.a(drawerValueArr$values);
    }

    private DrawerValue(String str, int i2) {
    }

    public static a<DrawerValue> getEntries() {
        return $ENTRIES;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}

package androidx.compose.material;

import androidx.webkit.Profile;
import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DismissValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DismissValue[] $VALUES;
    public static final DismissValue Default = new DismissValue(Profile.DEFAULT_PROFILE_NAME, 0);
    public static final DismissValue DismissedToEnd = new DismissValue("DismissedToEnd", 1);
    public static final DismissValue DismissedToStart = new DismissValue("DismissedToStart", 2);

    private static final /* synthetic */ DismissValue[] $values() {
        return new DismissValue[]{Default, DismissedToEnd, DismissedToStart};
    }

    static {
        DismissValue[] dismissValueArr$values = $values();
        $VALUES = dismissValueArr$values;
        $ENTRIES = b.a(dismissValueArr$values);
    }

    private DismissValue(String str, int i2) {
    }

    public static a<DismissValue> getEntries() {
        return $ENTRIES;
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }
}

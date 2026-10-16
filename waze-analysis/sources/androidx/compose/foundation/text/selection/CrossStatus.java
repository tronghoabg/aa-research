package androidx.compose.foundation.text.selection;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CrossStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CrossStatus[] $VALUES;
    public static final CrossStatus CROSSED = new CrossStatus("CROSSED", 0);
    public static final CrossStatus NOT_CROSSED = new CrossStatus("NOT_CROSSED", 1);
    public static final CrossStatus COLLAPSED = new CrossStatus("COLLAPSED", 2);

    private static final /* synthetic */ CrossStatus[] $values() {
        return new CrossStatus[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        CrossStatus[] crossStatusArr$values = $values();
        $VALUES = crossStatusArr$values;
        $ENTRIES = b.a(crossStatusArr$values);
    }

    private CrossStatus(String str, int i2) {
    }

    public static a<CrossStatus> getEntries() {
        return $ENTRIES;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }
}

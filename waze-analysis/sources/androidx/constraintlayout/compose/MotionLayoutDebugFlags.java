package androidx.constraintlayout.compose;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionLayoutDebugFlags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MotionLayoutDebugFlags[] $VALUES;
    public static final MotionLayoutDebugFlags NONE = new MotionLayoutDebugFlags("NONE", 0);
    public static final MotionLayoutDebugFlags SHOW_ALL = new MotionLayoutDebugFlags("SHOW_ALL", 1);
    public static final MotionLayoutDebugFlags UNKNOWN = new MotionLayoutDebugFlags("UNKNOWN", 2);

    private static final /* synthetic */ MotionLayoutDebugFlags[] $values() {
        return new MotionLayoutDebugFlags[]{NONE, SHOW_ALL, UNKNOWN};
    }

    static {
        MotionLayoutDebugFlags[] motionLayoutDebugFlagsArr$values = $values();
        $VALUES = motionLayoutDebugFlagsArr$values;
        $ENTRIES = b.a(motionLayoutDebugFlagsArr$values);
    }

    private MotionLayoutDebugFlags(String str, int i2) {
    }

    public static a<MotionLayoutDebugFlags> getEntries() {
        return $ENTRIES;
    }

    public static MotionLayoutDebugFlags valueOf(String str) {
        return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
    }

    public static MotionLayoutDebugFlags[] values() {
        return (MotionLayoutDebugFlags[]) $VALUES.clone();
    }
}

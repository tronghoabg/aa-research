package androidx.constraintlayout.compose;

import androidx.webkit.Profile;
import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionLayoutFlag {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MotionLayoutFlag[] $VALUES;
    public static final MotionLayoutFlag Default = new MotionLayoutFlag(Profile.DEFAULT_PROFILE_NAME, 0, 0);
    public static final MotionLayoutFlag FullMeasure = new MotionLayoutFlag("FullMeasure", 1, 1);

    private static final /* synthetic */ MotionLayoutFlag[] $values() {
        return new MotionLayoutFlag[]{Default, FullMeasure};
    }

    static {
        MotionLayoutFlag[] motionLayoutFlagArr$values = $values();
        $VALUES = motionLayoutFlagArr$values;
        $ENTRIES = b.a(motionLayoutFlagArr$values);
    }

    private MotionLayoutFlag(String str, int i2, long j2) {
    }

    public static a<MotionLayoutFlag> getEntries() {
        return $ENTRIES;
    }

    public static MotionLayoutFlag valueOf(String str) {
        return (MotionLayoutFlag) Enum.valueOf(MotionLayoutFlag.class, str);
    }

    public static MotionLayoutFlag[] values() {
        return (MotionLayoutFlag[]) $VALUES.clone();
    }
}

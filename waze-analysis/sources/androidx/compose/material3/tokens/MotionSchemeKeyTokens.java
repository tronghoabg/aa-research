package androidx.compose.material3.tokens;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MotionSchemeKeyTokens {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MotionSchemeKeyTokens[] $VALUES;
    public static final MotionSchemeKeyTokens DefaultSpatial = new MotionSchemeKeyTokens("DefaultSpatial", 0);
    public static final MotionSchemeKeyTokens FastSpatial = new MotionSchemeKeyTokens("FastSpatial", 1);
    public static final MotionSchemeKeyTokens SlowSpatial = new MotionSchemeKeyTokens("SlowSpatial", 2);
    public static final MotionSchemeKeyTokens DefaultEffects = new MotionSchemeKeyTokens("DefaultEffects", 3);
    public static final MotionSchemeKeyTokens FastEffects = new MotionSchemeKeyTokens("FastEffects", 4);
    public static final MotionSchemeKeyTokens SlowEffects = new MotionSchemeKeyTokens("SlowEffects", 5);

    private static final /* synthetic */ MotionSchemeKeyTokens[] $values() {
        return new MotionSchemeKeyTokens[]{DefaultSpatial, FastSpatial, SlowSpatial, DefaultEffects, FastEffects, SlowEffects};
    }

    static {
        MotionSchemeKeyTokens[] motionSchemeKeyTokensArr$values = $values();
        $VALUES = motionSchemeKeyTokensArr$values;
        $ENTRIES = b.a(motionSchemeKeyTokensArr$values);
    }

    private MotionSchemeKeyTokens(String str, int i2) {
    }

    public static a<MotionSchemeKeyTokens> getEntries() {
        return $ENTRIES;
    }

    public static MotionSchemeKeyTokens valueOf(String str) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, str);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) $VALUES.clone();
    }
}

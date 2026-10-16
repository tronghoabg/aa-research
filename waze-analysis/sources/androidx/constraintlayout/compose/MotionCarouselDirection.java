package androidx.constraintlayout.compose;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionCarouselDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MotionCarouselDirection[] $VALUES;
    public static final MotionCarouselDirection FORWARD = new MotionCarouselDirection("FORWARD", 0);
    public static final MotionCarouselDirection BACKWARD = new MotionCarouselDirection("BACKWARD", 1);

    private static final /* synthetic */ MotionCarouselDirection[] $values() {
        return new MotionCarouselDirection[]{FORWARD, BACKWARD};
    }

    static {
        MotionCarouselDirection[] motionCarouselDirectionArr$values = $values();
        $VALUES = motionCarouselDirectionArr$values;
        $ENTRIES = b.a(motionCarouselDirectionArr$values);
    }

    private MotionCarouselDirection(String str, int i2) {
    }

    public static a<MotionCarouselDirection> getEntries() {
        return $ENTRIES;
    }

    public static MotionCarouselDirection valueOf(String str) {
        return (MotionCarouselDirection) Enum.valueOf(MotionCarouselDirection.class, str);
    }

    public static MotionCarouselDirection[] values() {
        return (MotionCarouselDirection[]) $VALUES.clone();
    }
}

package androidx.compose.ui.hapticfeedback;

import h.a.i;
import h.g.a;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ HapticFeedbackType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m9035boximpl(int i2) {
        return new HapticFeedbackType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9037equalsimpl(int i2, Object obj) {
        return (obj instanceof HapticFeedbackType) && i2 == ((HapticFeedbackType) obj).m9041unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9038equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9040toStringimpl(int i2) {
        Companion companion = Companion;
        return m9038equalsimpl0(i2, companion.m9042getConfirm5zf0vsI()) ? "Confirm" : m9038equalsimpl0(i2, companion.m9043getContextClick5zf0vsI()) ? "ContextClick" : m9038equalsimpl0(i2, companion.m9044getGestureEnd5zf0vsI()) ? "GestureEnd" : m9038equalsimpl0(i2, companion.m9045getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m9038equalsimpl0(i2, companion.m9046getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m9038equalsimpl0(i2, companion.m9047getLongPress5zf0vsI()) ? "LongPress" : m9038equalsimpl0(i2, companion.m9048getReject5zf0vsI()) ? "Reject" : m9038equalsimpl0(i2, companion.m9049getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m9038equalsimpl0(i2, companion.m9050getSegmentTick5zf0vsI()) ? "SegmentTick" : m9038equalsimpl0(i2, companion.m9051getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m9038equalsimpl0(i2, companion.m9052getToggleOff5zf0vsI()) ? "ToggleOff" : m9038equalsimpl0(i2, companion.m9053getToggleOn5zf0vsI()) ? "ToggleOn" : m9038equalsimpl0(i2, companion.m9054getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m9037equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9040toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9041unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m9042getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9055getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m9043getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9056getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m9044getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9057getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m9045getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9058getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m9046getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9059getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m9047getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9060getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m9048getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9061getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m9049getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9062getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m9050getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9063getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m9051getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9064getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m9052getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9065getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m9053getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9066getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m9054getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m9067getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return i.i(HapticFeedbackType.m9035boximpl(m9042getConfirm5zf0vsI()), HapticFeedbackType.m9035boximpl(m9043getContextClick5zf0vsI()), HapticFeedbackType.m9035boximpl(m9044getGestureEnd5zf0vsI()), HapticFeedbackType.m9035boximpl(m9045getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m9035boximpl(m9046getKeyboardTap5zf0vsI()), HapticFeedbackType.m9035boximpl(m9047getLongPress5zf0vsI()), HapticFeedbackType.m9035boximpl(m9048getReject5zf0vsI()), HapticFeedbackType.m9035boximpl(m9049getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m9035boximpl(m9050getSegmentTick5zf0vsI()), HapticFeedbackType.m9035boximpl(m9051getTextHandleMove5zf0vsI()), HapticFeedbackType.m9035boximpl(m9052getToggleOff5zf0vsI()), HapticFeedbackType.m9035boximpl(m9053getToggleOn5zf0vsI()), HapticFeedbackType.m9035boximpl(m9054getVirtualKey5zf0vsI()));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9036constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9039hashCodeimpl(int i2) {
        return i2;
    }
}

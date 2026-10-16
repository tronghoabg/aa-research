package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetectorKt {
    private static final int PixelSensibility = 2;
    private static final int SmoothingFactor = 3;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addIndirectPointerInputChange-Qf4Zb88, reason: not valid java name */
    public static final void m2238addIndirectPointerInputChangeQf4Zb88(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, IndirectPointerInputEventSmoother indirectPointerInputEventSmoother, long j2) {
        velocityTracker.m9713addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), Offset.m7985plusMKHz9U(m2245primaryAxisPositiongrjNGvw(indirectPointerInputEventSmoother.m2247smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis), j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addIndirectPointerInputChange-jUCIxP8, reason: not valid java name */
    public static final void m2239addIndirectPointerInputChangejUCIxP8(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, IndirectPointerInputEventSmoother indirectPointerInputEventSmoother) {
        velocityTracker.m9713addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), m2245primaryAxisPositiongrjNGvw(indirectPointerInputEventSmoother.m2247smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis));
    }

    private static final boolean changedToDown(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.isConsumed() || indirectPointerInputChange.getPreviousPressed() || !indirectPointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUpIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChange-_bfSUIo, reason: not valid java name */
    public static final long m2240positionChange_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m2242positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChangeIgnoreConsumed-_bfSUIo, reason: not valid java name */
    public static final long m2241positionChangeIgnoreConsumed_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m2242positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChangeInternal-wfG_k4k, reason: not valid java name */
    public static final long m2242positionChangeInternalwfG_k4k(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        return (z || !indirectPointerInputChange.isConsumed()) ? Offset.m7984minusMKHz9U(m2244primaryAxisPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis), m2246primaryAxisPreviousPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis)) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: primaryAxisPosition-_bfSUIo, reason: not valid java name */
    public static final long m2244primaryAxisPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (orientation == null) {
            return indirectPointerInputChange.m9108getPositionF1C5BW0();
        }
        int iM9094getXnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9094getXnZO2Niw)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m9108getPositionF1C5BW0() >> 32));
        } else {
            int iM9095getYnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9095getYnZO2Niw)) {
                return indirectPointerInputChange.m9108getPositionF1C5BW0();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m9108getPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        if (orientation == Orientation.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits);
    }

    /* renamed from: primaryAxisPosition-grjNGvw, reason: not valid java name */
    private static final long m2245primaryAxisPositiongrjNGvw(long j2, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        if (orientation != null) {
            int iM9094getXnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9094getXnZO2Niw)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else {
                int iM9095getYnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw();
                if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9095getYnZO2Niw)) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                }
            }
            if (orientation == Orientation.Horizontal) {
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat) << 32;
                jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
                jFloatToRawIntBits2 = jFloatToRawIntBits4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            }
            return jFloatToRawIntBits | jFloatToRawIntBits2;
        }
        return j2;
    }

    /* renamed from: primaryAxisPreviousPosition-_bfSUIo, reason: not valid java name */
    private static final long m2246primaryAxisPreviousPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (orientation == null) {
            return indirectPointerInputChange.m9109getPreviousPositionF1C5BW0();
        }
        int iM9094getXnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9094getXnZO2Niw)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m9109getPreviousPositionF1C5BW0() >> 32));
        } else {
            int iM9095getYnZO2Niw = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !IndirectPointerEventPrimaryDirectionalMotionAxis.m9089equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m9092unboximpl(), iM9095getYnZO2Niw)) {
                return indirectPointerInputChange.m9109getPreviousPositionF1C5BW0();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m9109getPreviousPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        if (orientation == Orientation.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jFloatToRawIntBits);
    }
}

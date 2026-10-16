package androidx.compose.ui.input.indirect;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent_androidKt {
    private static final float RATIO_CUTOFF = 5.0f;

    /* renamed from: IndirectPointerEvent-eAXfkT4, reason: not valid java name */
    public static final IndirectPointerEvent m9083IndirectPointerEventeAXfkT4(MotionEvent motionEvent, int i2, MotionEvent motionEvent2) {
        return new AndroidIndirectPointerEvent(createIndirectPointerInputChangesFromMotionEvents(motionEvent, motionEvent2), convertActionToIndirectPointerEventType(motionEvent.getActionMasked()), i2, motionEvent, null);
    }

    /* renamed from: IndirectPointerEvent-eAXfkT4$default, reason: not valid java name */
    public static /* synthetic */ IndirectPointerEvent m9084IndirectPointerEventeAXfkT4$default(MotionEvent motionEvent, int i2, MotionEvent motionEvent2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9093getNonenZO2Niw();
        }
        if ((i3 & 4) != 0) {
            motionEvent2 = null;
        }
        return m9083IndirectPointerEventeAXfkT4(motionEvent, i2, motionEvent2);
    }

    /* renamed from: IndirectPointerEvent-ixkH3tc, reason: not valid java name */
    public static final IndirectPointerEvent m9085IndirectPointerEventixkH3tc(List<IndirectPointerInputChange> list, int i2, int i3, MotionEvent motionEvent) {
        return new AndroidIndirectPointerEvent(list, i2, i3, motionEvent, null);
    }

    public static final int convertActionToIndirectPointerEventType(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return IndirectPointerEventType.Companion.m9103getMove4ZHQPSE();
                }
                if (i2 != 5) {
                    if (i2 != 6) {
                        return IndirectPointerEventType.Companion.m9106getUnknown4ZHQPSE();
                    }
                }
            }
            return IndirectPointerEventType.Companion.m9105getRelease4ZHQPSE();
        }
        return IndirectPointerEventType.Companion.m9104getPress4ZHQPSE();
    }

    public static final List<IndirectPointerInputChange> createIndirectPointerInputChangesFromMotionEvents(MotionEvent motionEvent, MotionEvent motionEvent2) {
        long j2;
        boolean z;
        int i2;
        long jFloatToRawIntBits;
        long eventTime;
        boolean z2;
        MotionEvent motionEvent3 = motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        Integer numValueOf = motionEvent3 != null ? Integer.valueOf(motionEvent3.getActionMasked()) : null;
        boolean z3 = (numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 5) || (numValueOf != null && numValueOf.intValue() == 2);
        long eventTime2 = motionEvent.getEventTime();
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i3 = 0;
        while (i3 < pointerCount) {
            int pointerId = motionEvent.getPointerId(i3);
            long j3 = pointerId;
            float x = motionEvent.getX(i3);
            float y = motionEvent.getY(i3);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(x);
            boolean z4 = z3;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(y);
            if (i3 != actionIndex) {
                j2 = j3;
                z = true;
            } else {
                j2 = j3;
                z = false;
            }
            int iFindPointerIndex = motionEvent3 != null ? motionEvent3.findPointerIndex(pointerId) : -1;
            long j4 = (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (iFindPointerIndex >= 0) {
                x.c(motionEvent3);
                eventTime = motionEvent3.getEventTime();
                i2 = actionIndex;
                jFloatToRawIntBits = (Float.floatToRawIntBits(motionEvent3.getX(iFindPointerIndex)) << 32) | (Float.floatToRawIntBits(motionEvent3.getY(iFindPointerIndex)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                z2 = z4;
            } else {
                i2 = actionIndex;
                jFloatToRawIntBits = j4;
                eventTime = eventTime2;
                z2 = false;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new IndirectPointerInputChange(j2, eventTime2, j4, z, motionEvent.getPressure(i3), eventTime, jFloatToRawIntBits, z2, null));
            i3++;
            pointerCount = pointerCount;
            arrayList = arrayList2;
            z3 = z4;
            actionIndex = i2;
            motionEvent3 = motionEvent2;
        }
        return arrayList;
    }

    public static final MotionEvent getNativeEvent(IndirectPointerEvent indirectPointerEvent) {
        x.d(indirectPointerEvent, "null cannot be cast to non-null type androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent");
        return ((AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent$ui();
    }

    public static final int indirectPrimaryDirectionalScrollAxis(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw();
            }
            if (motionRange != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9094getXnZO2Niw();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9095getYnZO2Niw();
                }
            }
        }
        return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m9093getNonenZO2Niw();
    }
}

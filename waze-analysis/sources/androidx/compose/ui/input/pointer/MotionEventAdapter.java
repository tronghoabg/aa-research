package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.collection.SieveCacheKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.core.view.InputDeviceCompat;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private Offset inferredCursorRawOffset;
    private boolean isInFakeFingerGesture;
    private boolean isReinterpretingFakeFingerGesture;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private final LongSparseArray<IndirectPointerEventData> previousIndirectPointerEventData = new LongSparseArray<>(0, 1, null);
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j2 = this.nextId;
                this.nextId = 1 + j2;
                sparseLongArray.put(pointerId, j2);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j3 = this.nextId;
            this.nextId = 1 + j3;
            sparseLongArray2.put(pointerId2, j3);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui$default, reason: not valid java name */
    public static /* synthetic */ AndroidIndirectPointerEvent m9515convertToIndirectPointerEventk92h6UU$ui$default(MotionEventAdapter motionEventAdapter, MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            indirectPointerEventPrimaryDirectionalMotionAxis = null;
        }
        return motionEventAdapter.m9518convertToIndirectPointerEventk92h6UU$ui(motionEvent, indirectPointerEventPrimaryDirectionalMotionAxis);
    }

    /* renamed from: createPointerInputEventData-InuC1xA, reason: not valid java name */
    private final PointerInputEventData m9516createPointerInputEventDataInuC1xA(PositionCalculator positionCalculator, MotionEvent motionEvent, Offset offset, int i2, boolean z) {
        long j2;
        long jM7990unboximpl;
        long jMo9692screenToLocalMKHz9U;
        float fFloatValue;
        long j3;
        long jM7996getZeroF1C5BW0;
        Float f2;
        int i3;
        long j4;
        long jM7996getZeroF1C5BW02;
        long jM9517getComposePointerId_I2yYro = m9517getComposePointerId_I2yYro(motionEvent.getPointerId(i2));
        float pressure = motionEvent.getPressure(i2);
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(x);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(y);
        if (i2 == 0) {
            if (offset != null) {
                jM7990unboximpl = offset.m7990unboximpl();
                j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawX);
                j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                jM7990unboximpl = (Float.floatToRawIntBits(rawY) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (iFloatToRawIntBits << 32);
            }
            jMo9692screenToLocalMKHz9U = positionCalculator.mo9692screenToLocalMKHz9U(jM7990unboximpl);
        } else {
            j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            jM7990unboximpl = offset != null ? offset.m7990unboximpl() : MotionEventHelper.INSTANCE.m9530toRawOffsetdBAh8RU(motionEvent, i2);
            jMo9692screenToLocalMKHz9U = positionCalculator.mo9692screenToLocalMKHz9U(jM7990unboximpl);
        }
        int toolType = motionEvent.getToolType(i2);
        int iM9690getUnknownT8wyACA = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.Companion.m9690getUnknownT8wyACA() : PointerType.Companion.m9686getEraserT8wyACA() : PointerType.Companion.m9687getMouseT8wyACA() : PointerType.Companion.m9688getStylusT8wyACA() : ((motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD)) && (!this.isInFakeFingerGesture || this.isReinterpretingFakeFingerGesture)) ? PointerType.Companion.m9687getMouseT8wyACA() : PointerType.Companion.m9689getTouchT8wyACA() : PointerType.Companion.m9690getUnknownT8wyACA();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i4 = 0;
        while (true) {
            if (i4 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i2, i4);
            float historicalY = motionEvent.getHistoricalY(i2, i4);
            int i5 = historySize;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i3 = i4;
                j4 = jM9517getComposePointerId_I2yYro;
            } else {
                j4 = jM9517getComposePointerId_I2yYro;
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(historicalX) << 32;
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(historicalY) & j2;
                long historicalEventTime = motionEvent.getHistoricalEventTime(i4);
                Float fValueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, i2, i4));
                f2 = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                float fFloatValue2 = f2 != null ? f2.floatValue() : 1.0f;
                if (motionEvent.getClassification() == 3) {
                    i3 = i4;
                    jM7996getZeroF1C5BW02 = (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i2, i4)) << 32) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i2, i4)) & j2);
                } else {
                    i3 = i4;
                    jM7996getZeroF1C5BW02 = Offset.Companion.m7996getZeroF1C5BW0();
                }
                long j5 = jFloatToRawIntBits3 | jFloatToRawIntBits4;
                arrayList.add(new HistoricalChange(historicalEventTime, j5, fFloatValue2, jM7996getZeroF1C5BW02, j5, (o) null));
            }
            i4 = i3 + 1;
            historySize = i5;
            jM9517getComposePointerId_I2yYro = j4;
        }
        long j6 = jM9517getComposePointerId_I2yYro;
        long jFloatToRawIntBits5 = motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j2) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << 32) : Offset.Companion.m7996getZeroF1C5BW0();
        if (motionEvent.getClassification() == 5) {
            Float fValueOf2 = Float.valueOf(motionEvent.getAxisValue(52, i2));
            f2 = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            }
        }
        if (motionEvent.getClassification() == 3) {
            j3 = jFloatToRawIntBits5;
            jM7996getZeroF1C5BW0 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i2)) << 32) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i2)) & j2);
        } else {
            j3 = jFloatToRawIntBits5;
            jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        return new PointerInputEventData(j6, motionEvent.getEventTime(), jM7990unboximpl, jMo9692screenToLocalMKHz9U, z, pressure, iM9690getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(i2), false), arrayList, j3, fFloatValue, jM7996getZeroF1C5BW0, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & j2), null);
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m9517getComposePointerId_I2yYro(int i2) {
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i2);
        if (iIndexOfKey >= 0) {
            return this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        }
        long j2 = this.nextId;
        this.nextId = 1 + j2;
        this.motionEventToComposePointerIdMap.put(i2, j2);
        return j2;
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (motionEvent.getPointerId(i3) == i2) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() <= motionEvent.getPointerCount()) {
            return;
        }
        int size = this.motionEventToComposePointerIdMap.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
            if (!hasPointerId(motionEvent, iKeyAt)) {
                this.motionEventToComposePointerIdMap.removeAt(size);
                this.activeHoverIds.delete(iKeyAt);
            }
        }
    }

    private final void resetFakeFingerGesture() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent m9518convertToIndirectPointerEventk92h6UU$ui(android.view.MotionEvent r28, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.m9518convertToIndirectPointerEventk92h6UU$ui(android.view.MotionEvent, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis):androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent");
    }

    public final PointerInputEvent convertToPointerInputEvent$ui(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        boolean z;
        MotionEventAdapter motionEventAdapter;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            resetFakeFingerGesture();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            z = true;
        } else if (actionMasked == 10) {
            actionMasked = 10;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z2 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z3 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD));
            if (z2 || z3) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            motionEventAdapter = this;
            PositionCalculator positionCalculator2 = positionCalculator;
            motionEventAdapter.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            while (i2 < pointerCount) {
                motionEventAdapter.pointers.add(motionEventAdapter.m9516createPointerInputEventDataInuC1xA(positionCalculator2, motionEvent, null, i2, (z || i2 == actionIndex || (actionMasked == 8 && motionEvent.getButtonState() == 0)) ? false : true));
                i2++;
                positionCalculator2 = positionCalculator2;
            }
            motionEvent2 = motionEvent;
        } else {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                this.inferredCursorRawOffset = Offset.m7969boximpl((Float.floatToRawIntBits(motionEvent.getRawY(0)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(motionEvent.getRawX(0)) << 32));
            }
            motionEvent2 = motionEvent;
            motionEventAdapter = this;
            this.pointers.add(m9516createPointerInputEventDataInuC1xA(positionCalculator, motionEvent2, this.inferredCursorRawOffset, 0, false));
        }
        if (motionEvent2.getActionMasked() == 1) {
            motionEventAdapter.resetFakeFingerGesture();
        }
        motionEventAdapter.removeStaleIds(motionEvent2);
        return new PointerInputEvent(motionEvent2.getEventTime(), motionEventAdapter.pointers, motionEvent2);
    }

    public final void endStream(int i2) {
        this.activeHoverIds.delete(i2);
        this.motionEventToComposePointerIdMap.delete(i2);
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui() {
        return this.motionEventToComposePointerIdMap;
    }

    /* compiled from: WazeSource */
    @a
    /* loaded from: classes2.dex */
    final class IndirectPointerEventData {
        public static final Companion Companion = new Companion(null);
        private final long packedValue;

        private /* synthetic */ IndirectPointerEventData(long j2) {
            this.packedValue = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m9519boximpl(long j2) {
            return new IndirectPointerEventData(j2);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m9521constructorimpl(long j2, long j3, boolean z) {
            long jPackShorts = Companion.packShorts((short) Float.intBitsToFloat((int) (j3 >> 32)), (short) Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            long j4 = true != z ? 0L : 1L;
            long j5 = j2 & SieveCacheKt.NodeLinkMask;
            return (j5 + j5) | j4 | (jPackShorts << 32);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9522equalsimpl(long j2, Object obj) {
            return (obj instanceof IndirectPointerEventData) && j2 == ((IndirectPointerEventData) obj).m9529unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9523equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m9524getDownimpl(long j2) {
            return (j2 & 1) != 0;
        }

        /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m9525getPositionF1C5BW0(long j2) {
            Companion companion = Companion;
            int i2 = (int) (j2 >>> 32);
            float fUnpackShort1 = companion.unpackShort1(i2);
            float fUnpackShort2 = companion.unpackShort2(i2);
            return (Float.floatToRawIntBits(fUnpackShort2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fUnpackShort1) << 32);
        }

        /* renamed from: getUptime-impl, reason: not valid java name */
        public static final long m9526getUptimeimpl(long j2) {
            return (j2 >> 1) & SieveCacheKt.NodeLinkMask;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9527hashCodeimpl(long j2) {
            return MotionEventAdapter$IndirectPointerEventData$$ExternalSyntheticBackport0.m(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m9528toStringimpl(long j2) {
            return "IndirectPointerEventData(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return m9522equalsimpl(this.packedValue, obj);
        }

        public final long getPackedValue() {
            return this.packedValue;
        }

        public int hashCode() {
            return m9527hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m9528toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m9529unboximpl() {
            return this.packedValue;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int packShorts(short s, short s2) {
                return (s << 16) | ((char) s2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort1(int i2) {
                return (short) (i2 >> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort2(int i2) {
                return (short) ((char) i2);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m9520constructorimpl(long j2) {
            return j2;
        }
    }

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui$annotations() {
    }
}

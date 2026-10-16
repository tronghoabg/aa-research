package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private float[] viewToWindowMatrix;
    private long windowSize;
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;
    private long windowOffset = IntOffset.Companion.m11307getZeronOccac();
    private long screenOffset = IntOffset.Companion.m11307getZeronOccac();

    /* compiled from: WazeSource */
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final l<RelativeLayoutBounds, ab> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i2, long j2, long j3, DelegatableNode delegatableNode, l<? super RelativeLayoutBounds, ab> lVar) {
            this.id = i2;
            this.throttleMillis = j2;
            this.debounceMillis = j3;
            this.node = delegatableNode;
            this.callback = lVar;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m10358fire9b9wPM(long j2, long j3, long j4, long j5, float[] fArr) {
            RelativeLayoutBounds relativeLayoutBoundsM10359rectInfoForDg36KO4 = ThrottledCallbacksKt.m10359rectInfoForDg36KO4(this.node, j2, j3, j4, j5, ThrottledCallbacks.this.getWindowSize(), fArr);
            if (relativeLayoutBoundsM10359rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM10359rectInfoForDg36KO4);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final l<RelativeLayoutBounds, ab> getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j2) {
            this.bottomRight = j2;
        }

        public final void setLastInvokeMillis(long j2) {
            this.lastInvokeMillis = j2;
        }

        public final void setLastUninvokedFireMillis(long j2) {
            this.lastUninvokedFireMillis = j2;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j2) {
            this.topLeft = j2;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m10349debounceEntryb8qMvQI(Entry entry, long j2, long j3, float[] fArr, long j4, long j5) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return j5;
        }
        if (j4 - entry.getLastUninvokedFireMillis() < entry.getDebounceMillis()) {
            return Math.min(j5, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.setLastInvokeMillis(j4);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m10358fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j2, j3, fArr);
        return j5;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m10350fireWY9HvpM(Entry entry, long j2, long j3, float[] fArr, long j4) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z = true;
        if (j4 - lastInvokeMillis <= entry.getThrottleMillis() && lastInvokeMillis != Long.MIN_VALUE) {
            z = false;
        }
        long debounceMillis = entry.getDebounceMillis();
        entry.setLastUninvokedFireMillis(j4);
        if (z) {
            if (debounceMillis == 0) {
                entry.setLastInvokeMillis(j4);
                entry.m10358fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j2, j3, fArr);
                return;
            }
        } else if (debounceMillis == 0) {
            return;
        }
        long j5 = this.minDebounceDeadline;
        long debounceMillis2 = j4 + entry.getDebounceMillis();
        if (j5 <= 0 || debounceMillis2 >= j5) {
            return;
        }
        this.minDebounceDeadline = j5;
    }

    private final void linkedForEach(Entry entry, l<? super Entry, ab> lVar) {
        while (entry != null) {
            lVar.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, l<? super Entry, ab> lVar) {
        int i2;
        MutableIntObjectMap<Entry> mutableIntObjectMap2 = mutableIntObjectMap;
        Object[] objArr = mutableIntObjectMap2.values;
        long[] jArr = mutableIntObjectMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        for (Entry next = (Entry) objArr[(i3 << 3) + i5]; next != null; next = next.getNext()) {
                            lVar.invoke(next);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i2, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i2);
        if (entry2 == null) {
            mutableIntObjectMap.set(i2, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                if (next == null) {
                    x.g();
                }
            }
            next.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(MutableIntObjectMap<Entry> mutableIntObjectMap, int i2, Entry entry) {
        Entry entryRemove = mutableIntObjectMap.remove(i2);
        if (entryRemove == null) {
            return false;
        }
        if (x.n(entryRemove, entry)) {
            Entry next = entry.getNext();
            entry.setNext(null);
            if (next != null) {
                mutableIntObjectMap.put(i2, next);
                return true;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry.getNode().getNode());
            if (!layoutNodeRequireLayoutNode.isAttached()) {
                return true;
            }
            LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().unsetHasCallbacksFor(layoutNodeRequireLayoutNode);
            return true;
        }
        mutableIntObjectMap.put(i2, entryRemove);
        while (entryRemove != null) {
            Entry next2 = entryRemove.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == entry) {
                entryRemove.setNext(entry.getNext());
                entry.setNext(null);
                return true;
            }
            entryRemove = entryRemove.getNext();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = entry2;
            entry2 = next;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry3 != null) {
                    entry3.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final long roundDownToMultipleOf8(long j2) {
        return (j2 >> 3) << 3;
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i2, l<? super Entry, ab> lVar) {
        Entry entry = mutableIntObjectMap.get(i2);
        while (entry != null) {
            Entry next = entry.getNext();
            lVar.invoke(entry);
            entry = next;
        }
    }

    public final void fireGlobalChangeEntries(long j2) {
        long j3 = this.windowOffset;
        long j4 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry next = this.globalChangeEntries;
        if (next != null) {
            while (next != null) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long jM10339getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().m10339getOffsetFromRectListForBjo55l4(layoutNodeRequireLayoutNode);
                next.setTopLeft(jM10339getOffsetFromRectListForBjo55l4);
                next.setBottomRight(((IntOffset.m11297getYimpl(jM10339getOffsetFromRectListForBjo55l4) + layoutNodeRequireLayoutNode.getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((IntOffset.m11296getXimpl(jM10339getOffsetFromRectListForBjo55l4) + layoutNodeRequireLayoutNode.getWidth()) << 32));
                m10350fireWY9HvpM(next, j3, j4, fArr, j2);
                next = next.getNext();
            }
        }
    }

    public final void fireOnRectChangedEntries(long j2) {
        int i2;
        ThrottledCallbacks throttledCallbacks = this;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        long j3 = throttledCallbacks.windowOffset;
        long j4 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap2 = mutableIntObjectMap;
        Object[] objArr = mutableIntObjectMap2.values;
        long[] jArr = mutableIntObjectMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                long j6 = j5;
                int i5 = 0;
                while (true) {
                    char c2 = '\b';
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((j6 & 255) < 128) {
                        Entry next = (Entry) objArr[(i3 << 3) + i5];
                        while (next != null) {
                            int i6 = i5;
                            Entry entry = next;
                            throttledCallbacks.m10350fireWY9HvpM(entry, j3, j4, fArr, j2);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            c2 = c2;
                            i5 = i6;
                        }
                    }
                    j6 >>= c2;
                    i5++;
                    throttledCallbacks = this;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            }
            i3++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int i2, long j2, long j3, long j4) {
        Entry next = this.rectChangedMap.get(i2);
        while (true) {
            Entry entry = next;
            if (entry == null) {
                return;
            }
            next = entry.getNext();
            fireWithUpdatedRect$ui(entry, j2, j3, j4);
        }
    }

    public final void fireWithUpdatedRect$ui(Entry entry, long j2, long j3, long j4) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long j5 = j4 - lastInvokeMillis;
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = j5 >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        entry.setTopLeft(j2);
        entry.setBottomRight(j3);
        boolean z3 = !(z2 || throttleMillis == 0) || z2;
        if (z && z3) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(j4);
            entry.m10358fire9b9wPM(j2, j3, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.setLastUninvokedFireMillis(j4);
            long j6 = this.minDebounceDeadline;
            long j7 = j4 + debounceMillis;
            if (j6 <= 0 || j7 >= j6) {
                return;
            }
            this.minDebounceDeadline = j6;
        }
    }

    public final void forEachNewCallbackNeverInvoked(l<? super Entry, ab> lVar) {
        int i2;
        MutableIntObjectMap<Entry> rectChangedMap = getRectChangedMap();
        Object[] objArr = rectChangedMap.values;
        long[] jArr = rectChangedMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        Entry entry = (Entry) objArr[(i3 << 3) + i5];
                        for (Entry next = entry; next != null; next = next.getNext()) {
                            if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                lVar.invoke(entry);
                            }
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m10351getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m10352getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m10353getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int i2, long j2, long j3, DelegatableNode delegatableNode, l<? super RelativeLayoutBounds, ab> lVar) {
        Entry entry = new Entry(i2, j2, j3 == 0 ? j2 : j3, delegatableNode, lVar);
        addToGlobalEntries(entry);
        return entry;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int i2, long j2, long j3, DelegatableNode delegatableNode, l<? super RelativeLayoutBounds, ab> lVar) {
        Entry entry = new Entry(i2, j2, j3 == 0 ? j2 : j3, delegatableNode, lVar);
        multiPut(this.rectChangedMap, i2, entry);
        return entry;
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j2) {
        this.minDebounceDeadline = j2;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m10354setScreenOffsetgyyYBs(long j2) {
        this.screenOffset = j2;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m10355setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m10356setWindowOffsetgyyYBs(long j2) {
        this.windowOffset = j2;
    }

    public final void setWindowSize(long j2) {
        this.windowSize = j2;
    }

    public final void triggerDebounced(long j2) {
        long j3;
        long jM10349debounceEntryb8qMvQI;
        Object[] objArr;
        long[] jArr;
        int i2;
        int i3;
        long[] jArr2;
        char c2;
        if (this.minDebounceDeadline > j2) {
            return;
        }
        long j4 = this.windowOffset;
        long j5 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.rectChangedMap;
        Object[] objArr2 = mutableIntObjectMap.values;
        long[] jArr3 = mutableIntObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            jM10349debounceEntryb8qMvQI = Long.MAX_VALUE;
            while (true) {
                long j6 = jArr3[i4];
                j3 = Long.MAX_VALUE;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i4 - length;
                    long j7 = j6;
                    int i6 = 0;
                    while (true) {
                        char c3 = '\b';
                        i3 = 8 - ((~i5) >>> 31);
                        if (i6 >= i3) {
                            break;
                        }
                        if ((j7 & 255) < 128) {
                            Entry next = (Entry) objArr2[(i4 << 3) + i6];
                            while (next != null) {
                                Object[] objArr3 = objArr2;
                                int i7 = i4;
                                Entry entry = next;
                                jM10349debounceEntryb8qMvQI = m10349debounceEntryb8qMvQI(entry, j4, j5, fArr, j2, jM10349debounceEntryb8qMvQI);
                                c3 = c3;
                                jArr3 = jArr3;
                                next = entry.getNext();
                                i4 = i7;
                                objArr2 = objArr3;
                            }
                            jArr2 = jArr3;
                            c2 = c3;
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        j7 >>= c2;
                        i6++;
                        i4 = i4;
                        objArr2 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr2;
                    jArr = jArr3;
                    i2 = i4;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr2;
                    jArr = jArr3;
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
                objArr2 = objArr;
                jArr3 = jArr;
            }
        } else {
            j3 = Long.MAX_VALUE;
            jM10349debounceEntryb8qMvQI = Long.MAX_VALUE;
        }
        Entry next2 = this.globalChangeEntries;
        if (next2 != null) {
            long jM10349debounceEntryb8qMvQI2 = jM10349debounceEntryb8qMvQI;
            while (next2 != null) {
                jM10349debounceEntryb8qMvQI2 = m10349debounceEntryb8qMvQI(next2, j4, j5, fArr, j2, jM10349debounceEntryb8qMvQI2);
                next2 = next2.getNext();
            }
            jM10349debounceEntryb8qMvQI = jM10349debounceEntryb8qMvQI2;
        }
        if (jM10349debounceEntryb8qMvQI == j3) {
            jM10349debounceEntryb8qMvQI = -1;
        }
        this.minDebounceDeadline = jM10349debounceEntryb8qMvQI;
    }

    /* renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m10357updateOffsetsLDcG7Xg(long j2, long j3, float[] fArr, int i2, int i3) {
        boolean z;
        if (IntOffset.m11295equalsimpl0(j3, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = j3;
            z = true;
        }
        if (!IntOffset.m11295equalsimpl0(j2, this.screenOffset)) {
            this.screenOffset = j2;
            z = true;
        }
        if (fArr != null) {
            this.viewToWindowMatrix = fArr;
            z = true;
        }
        long j4 = i2;
        long j5 = this.windowSize;
        long j6 = (j4 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (j6 == j5) {
            return z;
        }
        this.windowSize = j6;
        return true;
    }
}

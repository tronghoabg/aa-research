package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import h.g.a.l;
import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    private final Object[] keys;
    private final int keysStartIndex;
    private final ObjectIntMap<Object> map;

    public NearestRangeKeyIndexMap(j jVar, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        IntervalList<Interval> intervals = lazyLayoutIntervalContent.getIntervals();
        final int iA = jVar.a();
        if (iA < 0) {
            InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
        }
        final int iMin = Math.min(jVar.b(), intervals.getSize() - 1);
        if (iMin < iA) {
            this.map = ObjectIntMapKt.emptyObjectIntMap();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i2 = (iMin - iA) + 1;
            this.keys = new Object[i2];
            this.keysStartIndex = iA;
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i2);
            intervals.forEach(iA, iMin, new l() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NearestRangeKeyIndexMap.lambda$1$0(iA, iMin, mutableObjectIntMap, this, (IntervalList.Interval) obj);
                }
            });
            this.map = mutableObjectIntMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[LOOP:0: B:4:0x0023->B:10:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[EDGE_INSN: B:13:0x0049->B:11:0x0049 BREAK  A[LOOP:0: B:4:0x0023->B:10:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab lambda$1$0(int r4, int r5, androidx.collection.MutableObjectIntMap r6, androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r7, androidx.compose.foundation.lazy.layout.IntervalList.Interval r8) {
        /*
            java.lang.Object r0 = r8.getValue()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            h.g.a.l r0 = r0.getKey()
            int r1 = r8.getStartIndex()
            int r4 = java.lang.Math.max(r4, r1)
            int r1 = r8.getStartIndex()
            int r2 = r8.getSize()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            int r5 = java.lang.Math.min(r5, r1)
            if (r4 > r5) goto L49
        L23:
            if (r0 == 0) goto L35
            int r1 = r8.getStartIndex()
            int r1 = r4 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.invoke(r1)
            if (r1 != 0) goto L39
        L35:
            java.lang.Object r1 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r4)
        L39:
            r6.set(r1, r4)
            java.lang.Object[] r2 = r7.keys
            int r3 = r7.keysStartIndex
            int r3 = r4 - r3
            r2[r3] = r1
            if (r4 == r5) goto L49
            int r4 = r4 + 1
            goto L23
        L49:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.lambda$1$0(int, int, androidx.collection.MutableObjectIntMap, androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap, androidx.compose.foundation.lazy.layout.IntervalList$Interval):h.ab");
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object obj) {
        ObjectIntMap<Object> objectIntMap = this.map;
        int iFindKeyIndex = objectIntMap.findKeyIndex(obj);
        if (iFindKeyIndex >= 0) {
            return objectIntMap.values[iFindKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i2) {
        int i3 = i2 - this.keysStartIndex;
        if (i3 < 0) {
            return null;
        }
        Object[] objArr = this.keys;
        if (i3 < objArr.length) {
            return objArr[i3];
        }
        return null;
    }
}

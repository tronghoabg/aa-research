package androidx.collection;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.c;
import h.g.b.x;
import h.k;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final void convertMetadataForCleanup(long[] jArr, int i2) {
        x.f(jArr, TtmlNode.TAG_METADATA);
        for (int i3 = 0; i3 < ((i2 + 7) >> 3); i3++) {
            long j2 = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iZ = c.z(jArr);
        int i4 = iZ - 1;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
    }

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        x.d(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }

    public static final long group(long[] jArr, int i2) {
        x.f(jArr, TtmlNode.TAG_METADATA);
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        return (((-i4) >> 63) & (jArr[i3 + 1] << (64 - i4))) | (jArr[i3] >>> i4);
    }

    public static final int h1(int i2) {
        return i2 >>> 7;
    }

    public static final int h2(int i2) {
        return i2 & 127;
    }

    public static final boolean hasNext(long j2) {
        return j2 != 0;
    }

    public static final int hash(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(long[] jArr, int i2) {
        x.f(jArr, TtmlNode.TAG_METADATA);
        return ((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(long[] jArr, int i2) {
        x.f(jArr, TtmlNode.TAG_METADATA);
        return ((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 128;
    }

    public static final boolean isFull(long[] jArr, int i2) {
        x.f(jArr, TtmlNode.TAG_METADATA);
        return ((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) < 128;
    }

    public static final int loadedCapacity(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int lowestBitSet(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }

    public static final long maskEmpty(long j2) {
        return j2 & ((~j2) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j2) {
        return j2 & ((~j2) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j2, int i2) {
        long j3 = j2 ^ (i2 * BitmaskLsb);
        return (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(k<? extends K, ? extends V>... kVarArr) {
        x.f(kVarArr, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(kVarArr.length);
        mutableScatterMap.putAll(kVarArr);
        return mutableScatterMap;
    }

    public static final long next(long j2) {
        return j2 & ((-1) + j2);
    }

    public static final int nextCapacity(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return i2 + i2 + 1;
    }

    public static final int normalizeCapacity(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final long readRawMetadata(long[] jArr, int i2) {
        x.f(jArr, "data");
        return (jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255;
    }

    public static final <K, V> MutableScatterMap<K, V> toMutableScatterMap(ScatterMap<K, V> scatterMap) {
        x.f(scatterMap, "<this>");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(scatterMap.getSize());
        mutableScatterMap.putAll(scatterMap);
        return mutableScatterMap;
    }

    public static final <K, V> ScatterMap<K, V> toScatterMap(ScatterMap<K, V> scatterMap) {
        x.f(scatterMap, "<this>");
        return scatterMap.isEmpty() ? emptyScatterMap() : toMutableScatterMap(scatterMap);
    }

    public static final int unloadedCapacity(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return i2 + ((i2 - 1) / 7);
    }

    public static final void writeMetadata(long[] jArr, int i2, int i3, long j2) {
        x.f(jArr, "data");
        int i4 = (i3 & 7) << 3;
        int i5 = i3 >> 3;
        long j3 = (j2 << i4) | ((~(255 << i4)) & jArr[i5]);
        jArr[i5] = j3;
        jArr[(((i3 - 7) & i2) + (i2 & 7)) >> 3] = j3;
    }

    public static final void writeRawMetadata(long[] jArr, int i2, long j2) {
        x.f(jArr, "data");
        int i3 = (i2 & 7) << 3;
        int i4 = i2 >> 3;
        long j3 = j2 << i3;
        jArr[i4] = j3 | ((~(255 << i3)) & jArr[i4]);
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final <K, V> MutableScatterMap<K, V> toMutableScatterMap(Map<K, ? extends V> map) {
        x.f(map, "<this>");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(map.size());
        mutableScatterMap.putAll(map);
        return mutableScatterMap;
    }

    public static final <K, V> ScatterMap<K, V> toScatterMap(Map<K, ? extends V> map) {
        x.f(map, "<this>");
        return map.isEmpty() ? emptyScatterMap() : toMutableScatterMap(map);
    }

    public static final boolean isFull(long j2) {
        return j2 < 128;
    }
}

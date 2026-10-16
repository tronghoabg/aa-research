package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.m.h;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SieveCache<K, V> {
    private int _capacity;
    private int _count;
    private int _maxSize;
    private int _size;
    private final l<K, V> createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;
    public Object[] keys;
    public long[] metadata;
    private long[] nodes;
    private final r<K, V, V, Boolean, ab> onEntryRemoved;
    private final p<K, V, Integer> sizeOf;
    private int tail;
    public Object[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(int i2, int i3, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super K, ? super V, ? super V, ? super Boolean, ab> rVar) {
        x.f(pVar, "sizeOf");
        x.f(lVar, "createValueFromKey");
        x.f(rVar, "onEntryRemoved");
        this.sizeOf = pVar;
        this.createValueFromKey = lVar;
        this.onEntryRemoved = rVar;
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (i2 <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i2;
        initializeStorage(ScatterMapKt.unloadedCapacity(i3));
    }

    static final int _init_$lambda$0(Object obj, Object obj2) {
        x.f(obj, "<unused var>");
        x.f(obj2, "<unused var>");
        return 1;
    }

    static final ab _init_$lambda$1(Object obj, Object obj2, Object obj3, boolean z) {
        x.f(obj, "<unused var>");
        x.f(obj2, "<unused var>");
        return ab.f48028a;
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i2 = this.hand;
        if (i2 == Integer.MAX_VALUE) {
            i2 = this.tail;
        }
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2];
            if (((int) ((j2 >> 62) & 1)) == 0) {
                break;
            }
            long j3 = SieveCacheKt.NodeLinkMask & (j2 >> 31);
            jArr[i2] = j2 & 4611686018427387903L;
            i2 = (int) j3;
            if (i2 == Integer.MAX_VALUE) {
                i2 = this.tail;
            }
        }
        int i3 = (int) (SieveCacheKt.NodeLinkMask & (jArr[i2] >> 31));
        this.hand = i3 != Integer.MAX_VALUE ? i3 : Integer.MAX_VALUE;
        return i2;
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    private final int findInsertIndex(K k2) {
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = this._capacity;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i2;
            long j2 = i2 & 127;
            long j3 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j4 = (ScatterMapKt.BitmaskLsb * j2) ^ j3;
            for (long j5 = (~j4) & ((-72340172838076673L) + j4) & (-9187201950435737472L); j5 != 0; j5 &= (-1) + j5) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (x.n(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._count++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j6 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j6 >> i12) & 255) != 128 ? 0 : 1);
                int i13 = this._capacity;
                long j7 = (j2 << i12) | ((~(255 << i12)) & j6);
                jArr2[i11] = j7;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j7;
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i9;
        }
    }

    private final int findKeyIndex(K k2) {
        int i2 = 0;
        int iHashCode = k2 != null ? k2.hashCode() : 0;
        int i3 = this._capacity;
        int i4 = iHashCode * ScatterMapKt.MurmurHashC1;
        int i5 = (i4 ^ (i4 << 16)) >>> 7;
        while (true) {
            int i6 = i5 & i3;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j3 = j2 ^ ((r1 & 127) * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i3;
                if (x.n(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i5 = i6 + i2;
        }
    }

    private final void fixupNodes(long[] jArr) {
        long[] jArr2 = this.nodes;
        int length = jArr2.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr2[i2];
            long j3 = j2 >> 31;
            long j4 = j2 & SieveCacheKt.NodeLinkMask;
            int i4 = (int) j4;
            long j5 = ((j2 & SieveCacheKt.NodeMetaMask) | (((int) (j3 & SieveCacheKt.NodeLinkMask)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[r10] & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jArr[i4]);
            }
            jArr2[i2] = i3 | j5;
            i2++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = (int) (jArr[i5] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = (int) (jArr[i6] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        int i7 = this.hand;
        if (i7 != Integer.MAX_VALUE) {
            this.hand = (int) (jArr[i7] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - getCount();
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[(i2 + 15) >> 3];
            c.aw(jArr2, -9187201950435737472L, jArr2.length);
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int i2) {
        long[] emptyNodes;
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            c.aw(emptyNodes, 4611686018427387903L, emptyNodes.length);
        }
        this.nodes = emptyNodes;
    }

    private final void markNodeVisited(int i2) {
        long[] jArr = this.nodes;
        jArr[i2] = (jArr[i2] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final void moveNodeToHead(int i2) {
        long[] jArr = this.nodes;
        int i3 = this.head;
        jArr[i2] = (i3 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = ((SieveCacheKt.NodeLinkMask & i2) << 31) | (jArr[i3] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = i2;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = i2;
        }
    }

    private final void removeNode(int i2) {
        long[] jArr = this.nodes;
        long j2 = jArr[i2];
        long j3 = j2 >> 31;
        long j4 = j2 & SieveCacheKt.NodeLinkMask;
        int i3 = (int) (j3 & SieveCacheKt.NodeLinkMask);
        int i4 = (int) j4;
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = (jArr[i3] & SieveCacheKt.NodeMetaAndPreviousMask) | i4;
        } else {
            this.head = i4;
        }
        if (i4 != Integer.MAX_VALUE) {
            jArr[i4] = (i3 << 31) | (jArr[i4] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i3;
        }
        if (this.hand == i2) {
            this.hand = i3;
        }
        jArr[i2] = 4611686018427387903L;
    }

    private final V removeValueAt(int i2) {
        this._count--;
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = this._capacity;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j2;
        this.keys[i2] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[i2];
        objArr[i2] = null;
        long[] jArr2 = this.nodes;
        long j3 = jArr2[i2];
        long j4 = j3 >> 31;
        long j5 = j3 & SieveCacheKt.NodeLinkMask;
        int i6 = (int) (j4 & SieveCacheKt.NodeLinkMask);
        int i7 = (int) j5;
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & SieveCacheKt.NodeMetaAndPreviousMask) | i7;
        } else {
            this.head = i7;
        }
        if (i7 != Integer.MAX_VALUE) {
            jArr2[i7] = (jArr2[i7] & SieveCacheKt.NodeMetaAndNextMask) | (i6 << 31);
        } else {
            this.tail = i6;
        }
        if (this.hand == i2) {
            this.hand = i6;
        }
        jArr2[i2] = 4611686018427387903L;
        return v;
    }

    public final void adjustStorage$collection() {
        int i2 = this._capacity;
        if (i2 <= 8 || Long.compare((getCount() * 32) ^ Long.MIN_VALUE, (i2 * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final boolean all(p<? super K, ? super V, Boolean> pVar) {
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i4;
                            Object obj = objArr[i6];
                            x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj2 = objArr2[i6];
                            x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            if (!pVar.invoke(obj, obj2).booleanValue()) {
                                return false;
                            }
                        }
                        j2 >>= 8;
                        i4++;
                    } else if (i5 != 8) {
                        return true;
                    }
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }

    public final boolean any(p<? super K, ? super V, Boolean> pVar) {
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i4;
                                Object obj = objArr[i6];
                                x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                                Object obj2 = objArr2[i6];
                                x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                                if (pVar.invoke(obj, obj2).booleanValue()) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean contains(K k2) {
        x.f(k2, "key");
        return findKeyIndex(k2) >= 0;
    }

    public final boolean containsKey(K k2) {
        x.f(k2, "key");
        return findKeyIndex(k2) >= 0;
    }

    public final boolean containsValue(V v) {
        x.f(v, "value");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                Object obj = objArr[(i2 << 3) + i4];
                                x.d(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                                if (x.n(v, obj)) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int count(p<? super K, ? super V, Boolean> pVar) {
        int i2;
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i3 - length;
                int i6 = 0;
                while (true) {
                    i2 = 8 - ((~i5) >>> 31);
                    if (i6 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i7 = (i3 << 3) + i6;
                        Object obj = objArr[i7];
                        x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i7];
                        x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (pVar.invoke(obj, obj2).booleanValue()) {
                            i4++;
                        }
                    }
                    j2 >>= 8;
                    i6++;
                }
                if (i2 != 8) {
                    return i4;
                }
            }
            if (i3 == length) {
                return i4;
            }
            i3++;
        }
    }

    public final void dropDeletes$collection() {
        int i2;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i3 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i3];
        long j2 = 9223372034707292159L;
        c.aw(jArr3, 9223372034707292159L, i3);
        int i4 = i3 + 7;
        int i5 = 0;
        for (int i6 = 0; i6 < (i4 >> 3); i6++) {
            long j3 = jArr[i6] & (-9187201950435737472L);
            jArr[i6] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int iZ = c.z(jArr);
        int i7 = iZ - 1;
        jArr[i7] = (jArr[i7] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i8 = 0;
        while (i8 != i3) {
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j4 = (jArr[i9] >> i10) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr[i8];
                int iHashCode = (obj != null ? obj.hashCode() : i5) * ScatterMapKt.MurmurHashC1;
                int i11 = iHashCode ^ (iHashCode << 16);
                int i12 = i11 >>> 7;
                long j5 = j2;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                int i13 = i12 & i3;
                int i14 = i5;
                long j6 = i11 & 127;
                if (((iFindFirstAvailableSlot - i13) & i3) / 8 == ((i8 - i13) & i3) / 8) {
                    int i15 = i8 + 1;
                    jArr[i9] = ((~(255 << i10)) & jArr[i9]) | (j6 << i10);
                    if (jArr3[i8] == j5) {
                        long j7 = i8;
                        jArr3[i8] = j7 | (j7 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i14];
                    i8 = i15;
                    j2 = j5;
                    i5 = i14;
                } else {
                    long j8 = i8;
                    int i16 = i8;
                    long j9 = iFindFirstAvailableSlot;
                    int i17 = iFindFirstAvailableSlot >> 3;
                    long j10 = jArr[i17];
                    int i18 = (iFindFirstAvailableSlot & 7) << 3;
                    long j11 = j6 << i18;
                    int i19 = i3;
                    Object[] objArr3 = objArr;
                    long j12 = j10 & (~(255 << i18));
                    if (((j10 >> i18) & 255) == 128) {
                        long j13 = j8 << 32;
                        long j14 = ~(255 << i10);
                        jArr[i17] = j12 | j11;
                        jArr[i9] = (j14 & jArr[i9]) | (128 << i10);
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = null;
                        objArr2[iFindFirstAvailableSlot] = objArr2[i16];
                        objArr2[i16] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = 4611686018427387903L;
                        int i20 = (int) ((jArr3[i16] >> 32) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                        if (i20 != Integer.MAX_VALUE) {
                            jArr3[i20] = j9 | (jArr3[i20] & (-4294967296L));
                            jArr3[i16] = (jArr3[i16] & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (-4294967296L);
                        } else {
                            jArr3[i16] = 9223372032559808512L | j9;
                        }
                        jArr3[iFindFirstAvailableSlot] = SieveCacheKt.NodeLinkMask | j13;
                        i2 = i16;
                    } else {
                        long j15 = j9 << 32;
                        jArr[i17] = j12 | j11;
                        Object obj2 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = obj2;
                        Object obj3 = objArr2[iFindFirstAvailableSlot];
                        objArr2[iFindFirstAvailableSlot] = objArr2[i16];
                        objArr2[i16] = obj3;
                        long j16 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i21 = (int) ((jArr3[i16] >> 32) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                        if (i21 != Integer.MAX_VALUE) {
                            jArr3[i21] = j9 | (jArr3[i21] & (-4294967296L));
                            jArr3[i16] = j15 | (jArr3[i16] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                        } else {
                            jArr3[i16] = j15 | j9;
                            i21 = i16;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i21 << 32) | j8;
                        i2 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i14];
                    i8 = i2 + 1;
                    j2 = j5;
                    i5 = i14;
                    i3 = i19;
                    objArr = objArr3;
                }
            } else {
                i8++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) obj;
        if (sieveCache.getSize() != getSize() || sieveCache._count != this._count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i4;
                                Object obj2 = objArr[i6];
                                x.d(obj2, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                                Object obj3 = objArr2[i6];
                                x.d(obj3, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                                if (!x.n(obj3, sieveCache.get(obj2))) {
                                    return false;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void forEach(p<? super K, ? super V, ab> pVar) {
        int i2;
        x.f(pVar, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
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
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i6];
                        x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        pVar.invoke(obj, obj2);
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

    public final void forEachIndexed(l<? super Integer, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        long[] jArr = this.metadata;
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
                        lVar.invoke(Integer.valueOf((i3 << 3) + i5));
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

    public final void forEachKey(l<? super K, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
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
                        Object obj = objArr[(i3 << 3) + i5];
                        x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        lVar.invoke(obj);
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

    public final void forEachValue(l<? super V, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
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
                        Object obj = objArr[(i3 << 3) + i5];
                        x.d(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        lVar.invoke(obj);
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

    public final V get(K k2) {
        x.f(k2, "key");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            long[] jArr = this.nodes;
            jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
            return (V) this.values[iFindKeyIndex];
        }
        V vInvoke = this.createValueFromKey.invoke(k2);
        if (vInvoke == null) {
            return null;
        }
        put(k2, vInvoke);
        return vInvoke;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getCount() {
        return this._count;
    }

    public final int getMaxSize() {
        return this._maxSize;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i2;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iHashCode = 0;
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
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i6];
                        x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i3 == length) {
                return iHashCode;
            }
            i3++;
        }
    }

    public final boolean isEmpty() {
        return this._count == 0;
    }

    public final boolean isNotEmpty() {
        return this._count != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> scatterSet) {
        int i2;
        x.f(scatterSet, "keys");
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
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
                        remove(objArr[(i3 << 3) + i5]);
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

    public final boolean none() {
        return this._count == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(k<? extends K, ? extends V> kVar) {
        x.f(kVar, "pair");
        put(kVar.c(), kVar.d());
    }

    public final V put(K k2, V v) {
        x.f(k2, "key");
        x.f(v, "value");
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = v;
        this.keys[iFindInsertIndex] = k2;
        int iIntValue = this._size + this.sizeOf.invoke(k2, v).intValue();
        this._size = iIntValue;
        if (v2 != null) {
            this._size = iIntValue - ((Number) this.sizeOf.invoke(k2, v2)).intValue();
            this.onEntryRemoved.invoke(k2, v2, v, false);
            trimToSize(this._maxSize);
            return v2;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iFindInsertIndex] = (i2 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & SieveCacheKt.NodeMetaAndNextMask) | (iFindInsertIndex << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail != Integer.MAX_VALUE) {
            return null;
        }
        this.tail = iFindInsertIndex;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(SieveCache<K, V> sieveCache) {
        int i2;
        x.f(sieveCache, TypedValues.TransitionType.S_FROM);
        Object[] objArr = sieveCache.keys;
        Object[] objArr2 = sieveCache.values;
        long[] jArr = sieveCache.metadata;
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
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i6];
                        x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        put(obj, obj2);
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

    public final boolean remove(K k2, V v) {
        V vRemoveValueAt;
        x.f(k2, "key");
        x.f(v, "value");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0 || !x.n(this.values[iFindKeyIndex], v) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this._size -= this.sizeOf.invoke(k2, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(k2, vRemoveValueAt, null, false);
        return true;
    }

    public final void removeIf(p<? super K, ? super V, Boolean> pVar) {
        x.f(pVar, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i4;
                            Object obj = this.keys[i6];
                            x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj2 = this.values[i6];
                            x.d(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            if (pVar.invoke(obj, obj2).booleanValue()) {
                                V vRemoveValueAt = removeValueAt(i6);
                                if (vRemoveValueAt == null) {
                                    return;
                                }
                                this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                                this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, false);
                            } else {
                                continue;
                            }
                        }
                        j2 >>= 8;
                        i4++;
                    } else if (i5 != 8) {
                        return;
                    }
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void resize(int i2) {
        this._maxSize = i2;
        trimToSize(i2);
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i3 = this._capacity;
        int[] iArr = new int[i3];
        initializeStorage(i2);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i4 = this._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = findFirstAvailableSlot((iHashCode ^ (iHashCode << 16)) >>> 7);
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i6] & (~(255 << i7))) | ((r15 & 127) << i7);
                jArr4[i6] = j2;
                jArr4[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                objArr4[iFindFirstAvailableSlot] = obj;
                objArr5[iFindFirstAvailableSlot] = objArr3[i5];
                jArr5[iFindFirstAvailableSlot] = jArr3[i5];
                iArr[i5] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i5++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final void set(K k2, V v) {
        x.f(k2, "key");
        x.f(v, "value");
        put(k2, v);
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this._size + ", capacity=" + this._capacity + ", count=" + this._count + "]";
    }

    public final void trimToSize(int i2) {
        int iFindEvictionCandidate;
        while (this._size > i2 && getCount() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            x.d(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, true);
            }
        }
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public final void plusAssign(SieveCache<K, V> sieveCache) {
        x.f(sieveCache, TypedValues.TransitionType.S_FROM);
        putAll(sieveCache);
    }

    public final void plusAssign(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        x.f(iterable, "pairs");
        putAll(iterable);
    }

    public final void plusAssign(Map<K, ? extends V> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        putAll(map);
    }

    public final void plusAssign(ScatterMap<K, V> scatterMap) {
        x.f(scatterMap, TypedValues.TransitionType.S_FROM);
        putAll(scatterMap);
    }

    public final void plusAssign(h<? extends k<? extends K, ? extends V>> hVar) {
        x.f(hVar, "pairs");
        putAll(hVar);
    }

    public final void plusAssign(k<? extends K, ? extends V>[] kVarArr) {
        x.f(kVarArr, "pairs");
        putAll(kVarArr);
    }

    public final V remove(K k2) {
        V vRemoveValueAt;
        x.f(k2, "key");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this._size -= this.sizeOf.invoke(k2, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(k2, vRemoveValueAt, null, false);
        return vRemoveValueAt;
    }

    public /* synthetic */ SieveCache(int i2, int i3, p pVar, AnonymousClass2 anonymousClass2, r rVar, int i4, o oVar) {
        this(i2, (i4 & 2) != 0 ? 6 : i3, (i4 & 4) != 0 ? new p() { // from class: androidx.collection.SieveCache$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                SieveCache._init_$lambda$0(obj, obj2);
                return 1;
            }
        } : pVar, (i4 & 8) != 0 ? new l() { // from class: androidx.collection.SieveCache.2
            @Override // h.g.a.l
            public final Void invoke(K k2) {
                x.f(k2, "it");
                return null;
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnonymousClass2) obj);
                return null;
            }
        } : anonymousClass2, (i4 & 16) != 0 ? new r() { // from class: androidx.collection.SieveCache$$ExternalSyntheticLambda2
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SieveCache._init_$lambda$1(obj, obj2, obj3, ((Boolean) obj4).booleanValue());
            }
        } : rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> objectList) {
        x.f(objectList, "keys");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    public final void minusAssign(Iterable<? extends K> iterable) {
        x.f(iterable, "keys");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(K k2) {
        x.f(k2, "key");
        remove(k2);
    }

    public final void minusAssign(h<? extends K> hVar) {
        x.f(hVar, "keys");
        Iterator<? extends K> it = hVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(K[] kArr) {
        x.f(kArr, "keys");
        for (K k2 : kArr) {
            remove(k2);
        }
    }

    private final void fixupNodes(int[] iArr) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr[i2];
            long j3 = j2 >> 31;
            long j4 = j2 & SieveCacheKt.NodeLinkMask;
            int i4 = (int) j4;
            long j5 = ((j2 & SieveCacheKt.NodeMetaMask) | (((int) (j3 & SieveCacheKt.NodeLinkMask)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r8])) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i3 = iArr[i4];
            }
            jArr[i2] = j5 | i3;
            i2++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = iArr[i5];
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = iArr[i6];
        }
        int i7 = this.hand;
        if (i7 != Integer.MAX_VALUE) {
            this.hand = iArr[i7];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> scatterMap) {
        int i2;
        x.f(scatterMap, TypedValues.TransitionType.S_FROM);
        Object[] objArr = scatterMap.keys;
        Object[] objArr2 = scatterMap.values;
        long[] jArr = scatterMap.metadata;
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
                        int i6 = (i3 << 3) + i5;
                        put(objArr[i6], objArr2[i6]);
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

    public final boolean any() {
        return this._count != 0;
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        x.f(iterable, "pairs");
        for (k<? extends K, ? extends V> kVar : iterable) {
            put(kVar.a(), kVar.b());
        }
    }

    public final void putAll(Map<K, ? extends V> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(h<? extends k<? extends K, ? extends V>> hVar) {
        x.f(hVar, "pairs");
        for (k<? extends K, ? extends V> kVar : hVar) {
            put(kVar.a(), kVar.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(k<? extends K, ? extends V>[] kVarArr) {
        x.f(kVarArr, "pairs");
        for (k<? extends K, ? extends V> kVar : kVarArr) {
            put(kVar.a(), kVar.b());
        }
    }
}

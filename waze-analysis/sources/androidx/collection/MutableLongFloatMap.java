package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.c;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableLongFloatMap extends LongFloatMap {
    private int growthLimit;

    public MutableLongFloatMap(int i2) {
        super(null);
        if (i2 < 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
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

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            c.aw(jArr, -9187201950435737472L, jArr.length);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        initializeGrowth();
    }

    private final void initializeStorage(int i2) {
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new long[iMax];
        this.values = new float[iMax];
    }

    public final void adjustStorage$collection() {
        int i2 = this._capacity;
        if (i2 <= 8 || Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i2 * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            long[] jArr = this.metadata;
            c.aw(jArr, -9187201950435737472L, jArr.length);
            long[] jArr2 = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i2 + 7;
        long[] jArr2 = this.keys;
        float[] fArr = this.values;
        boolean z = false;
        for (int i4 = 0; i4 < (i3 >> 3); i4++) {
            long j2 = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iZ = c.z(jArr);
        int i5 = iZ - 1;
        long j3 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i6 = 0;
        while (i6 != i2) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j4 = (jArr[i7] >> i8) & 255;
            if (j4 != 128 && j4 == 254) {
                int iM = MutableLongFloatMap$$ExternalSyntheticBackport0.m(jArr2[i6]) * ScatterMapKt.MurmurHashC1;
                int i9 = iM ^ (iM << 16);
                int i10 = i9 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                int i11 = i10 & i2;
                boolean z2 = z;
                long j5 = i9 & 127;
                if (((iFindFirstAvailableSlot - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr[i7] = (j5 << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[c.z(jArr)] = (jArr[z2 ? 1 : 0] & j3) | Long.MIN_VALUE;
                    i6++;
                    z = z2 ? 1 : 0;
                } else {
                    int i12 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr[i12];
                    int i13 = (iFindFirstAvailableSlot & 7) << 3;
                    long j7 = j5 << i13;
                    long j8 = j3;
                    long j9 = j6 & (~(255 << i13));
                    if (((j6 >> i13) & 255) == 128) {
                        long j10 = ~(255 << i8);
                        jArr[i12] = j7 | j9;
                        jArr[i7] = (jArr[i7] & j10) | (128 << i8);
                        jArr2[iFindFirstAvailableSlot] = jArr2[i6];
                        jArr2[i6] = 0;
                        fArr[iFindFirstAvailableSlot] = fArr[i6];
                        fArr[i6] = 0.0f;
                    } else {
                        jArr[i12] = j7 | j9;
                        long j11 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i6];
                        jArr2[i6] = j11;
                        float f2 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i6];
                        fArr[i6] = f2;
                        i6--;
                    }
                    jArr[c.z(jArr)] = (jArr[z2 ? 1 : 0] & j8) | Long.MIN_VALUE;
                    i6++;
                    z = z2 ? 1 : 0;
                    j3 = j8;
                }
            } else {
                i6++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(long j2) {
        int iM = MutableLongFloatMap$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iM ^ (iM << 16);
        int i3 = i2 >>> 7;
        int i4 = this._capacity;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i6;
            long j3 = i2 & 127;
            long j4 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j5 = (ScatterMapKt.BitmaskLsb * j3) ^ j4;
            for (long j6 = (~j5) & ((-72340172838076673L) + j5) & (-9187201950435737472L); j6 != 0; j6 &= (-1) + j6) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j7 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j7 >> i12) & 255) != 128 ? 0 : 1);
                int i13 = this._capacity;
                long j8 = (j3 << i12) | ((~(255 << i12)) & j7);
                jArr2[i11] = j8;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j8;
                return ~iFindFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final float getOrPut(long j2, a<Float> aVar) {
        x.f(aVar, "defaultValue");
        int iFindInsertIndex = findInsertIndex(j2);
        if (iFindInsertIndex >= 0) {
            return this.values[iFindInsertIndex];
        }
        float fFloatValue = aVar.invoke().floatValue();
        int i2 = ~iFindInsertIndex;
        this.keys[i2] = j2;
        this.values[i2] = fFloatValue;
        return fFloatValue;
    }

    public final void minusAssign(LongSet longSet) {
        int i2;
        x.f(longSet, "keys");
        long[] jArr = longSet.elements;
        long[] jArr2 = longSet.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr2[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        remove(jArr[(i3 << 3) + i5]);
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

    public final void plusAssign(LongFloatMap longFloatMap) {
        x.f(longFloatMap, TypedValues.TransitionType.S_FROM);
        putAll(longFloatMap);
    }

    public final float put(long j2, float f2, float f3) {
        int iFindInsertIndex = findInsertIndex(j2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = j2;
        this.values[iFindInsertIndex] = f2;
        return f3;
    }

    public final void putAll(LongFloatMap longFloatMap) {
        int i2;
        x.f(longFloatMap, TypedValues.TransitionType.S_FROM);
        long[] jArr = longFloatMap.keys;
        float[] fArr = longFloatMap.values;
        long[] jArr2 = longFloatMap.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr2[i3];
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
                        set(jArr[i6], fArr[i6]);
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

    public final boolean remove(long j2, float f2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(p<? super Long, ? super Float, Boolean> pVar) {
        int i2;
        x.f(pVar, "predicate");
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
                        if (pVar.invoke(Long.valueOf(this.keys[i6]), Float.valueOf(this.values[i6])).booleanValue()) {
                            removeValueAt(i6);
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

    public final void removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = this._capacity;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j2;
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr;
        MutableLongFloatMap mutableLongFloatMap = this;
        long[] jArr2 = mutableLongFloatMap.metadata;
        long[] jArr3 = mutableLongFloatMap.keys;
        float[] fArr = mutableLongFloatMap.values;
        int i3 = mutableLongFloatMap._capacity;
        initializeStorage(i2);
        long[] jArr4 = mutableLongFloatMap.metadata;
        long[] jArr5 = mutableLongFloatMap.keys;
        float[] fArr2 = mutableLongFloatMap.values;
        int i4 = mutableLongFloatMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i5];
                int iM = MutableLongFloatMap$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = mutableLongFloatMap.findFirstAvailableSlot((iM ^ (iM << 16)) >>> 7);
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j3 = ((r14 & 127) << i7) | (jArr4[i6] & (~(255 << i7)));
                jArr4[i6] = j3;
                jArr4[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j3;
                jArr5[iFindFirstAvailableSlot] = j2;
                fArr2[iFindFirstAvailableSlot] = fArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableLongFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long j2, float f2) {
        int iFindInsertIndex = findInsertIndex(j2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = j2;
        this.values[iFindInsertIndex] = f2;
    }

    public final int trim() {
        int i2 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i2) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i2 - this._capacity;
    }

    public MutableLongFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongFloatMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void put(long j2, float f2) {
        set(j2, f2);
    }

    public final void remove(long j2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void minusAssign(LongList longList) {
        x.f(longList, "keys");
        long[] jArr = longList.content;
        int i2 = longList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final void minusAssign(long[] jArr) {
        x.f(jArr, "keys");
        for (long j2 : jArr) {
            remove(j2);
        }
    }
}

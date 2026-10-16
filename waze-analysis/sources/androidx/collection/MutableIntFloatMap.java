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
public final class MutableIntFloatMap extends IntFloatMap {
    private int growthLimit;

    public MutableIntFloatMap(int i2) {
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
        this.keys = new int[iMax];
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
        int[] iArr = this.keys;
        float[] fArr = this.values;
        int i4 = 0;
        for (int i5 = 0; i5 < (i3 >> 3); i5++) {
            long j2 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iZ = c.z(jArr);
        int i6 = iZ - 1;
        long j3 = 72057594037927935L;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i7 = 0;
        while (i7 != i2) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j4 = (jArr[i8] >> i9) & 255;
            if (j4 != 128 && j4 == 254) {
                int i10 = iArr[i7] * ScatterMapKt.MurmurHashC1;
                int i11 = i10 ^ (i10 << 16);
                int i12 = i11 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                int i13 = i12 & i2;
                int i14 = i4;
                long j5 = i11 & 127;
                if (((iFindFirstAvailableSlot - i13) & i2) / 8 == ((i7 - i13) & i2) / 8) {
                    jArr[i8] = (j5 << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[c.z(jArr)] = (jArr[i14] & j3) | Long.MIN_VALUE;
                    i7++;
                    i4 = i14;
                } else {
                    int i15 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr[i15];
                    int i16 = (iFindFirstAvailableSlot & 7) << 3;
                    long j7 = j5 << i16;
                    long j8 = j3;
                    long j9 = j6 & (~(255 << i16));
                    if (((j6 >> i16) & 255) == 128) {
                        long j10 = ~(255 << i9);
                        jArr[i15] = j7 | j9;
                        jArr[i8] = (jArr[i8] & j10) | (128 << i9);
                        iArr[iFindFirstAvailableSlot] = iArr[i7];
                        iArr[i7] = i14;
                        fArr[iFindFirstAvailableSlot] = fArr[i7];
                        fArr[i7] = 0.0f;
                    } else {
                        jArr[i15] = j7 | j9;
                        int i17 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i7];
                        iArr[i7] = i17;
                        float f2 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i7];
                        fArr[i7] = f2;
                        i7--;
                    }
                    jArr[c.z(jArr)] = (jArr[i14] & j8) | Long.MIN_VALUE;
                    i7++;
                    i4 = i14;
                    j3 = j8;
                }
            } else {
                i7++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(int i2) {
        int i3 = ScatterMapKt.MurmurHashC1 * i2;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = this._capacity;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = i8;
            long j2 = i4 & 127;
            long j3 = (((-i10) >> 63) & (jArr[i9 + 1] << (64 - i10))) | (jArr[i9] >>> i10);
            long j4 = (ScatterMapKt.BitmaskLsb * j2) ^ j3;
            for (long j5 = (~j4) & ((-72340172838076673L) + j4) & (-9187201950435737472L); j5 != 0; j5 &= (-1) + j5) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i5);
                }
                this._size++;
                int i12 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i13 = iFindFirstAvailableSlot >> 3;
                long j6 = jArr2[i13];
                int i14 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i12 - (((j6 >> i14) & 255) != 128 ? 0 : 1);
                int i15 = this._capacity;
                long j7 = ((~(255 << i14)) & j6) | (j2 << i14);
                jArr2[i13] = j7;
                jArr2[(((iFindFirstAvailableSlot - 7) & i15) + (i15 & 7)) >> 3] = j7;
                return ~iFindFirstAvailableSlot;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final float getOrPut(int i2, a<Float> aVar) {
        x.f(aVar, "defaultValue");
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex >= 0) {
            return this.values[iFindInsertIndex];
        }
        float fFloatValue = aVar.invoke().floatValue();
        int i3 = ~iFindInsertIndex;
        this.keys[i3] = i2;
        this.values[i3] = fFloatValue;
        return fFloatValue;
    }

    public final void minusAssign(IntSet intSet) {
        int i2;
        x.f(intSet, "keys");
        int[] iArr = intSet.elements;
        long[] jArr = intSet.metadata;
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
                        remove(iArr[(i3 << 3) + i5]);
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

    public final void plusAssign(IntFloatMap intFloatMap) {
        x.f(intFloatMap, TypedValues.TransitionType.S_FROM);
        putAll(intFloatMap);
    }

    public final float put(int i2, float f2, float f3) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = i2;
        this.values[iFindInsertIndex] = f2;
        return f3;
    }

    public final void putAll(IntFloatMap intFloatMap) {
        int i2;
        x.f(intFloatMap, TypedValues.TransitionType.S_FROM);
        int[] iArr = intFloatMap.keys;
        float[] fArr = intFloatMap.values;
        long[] jArr = intFloatMap.metadata;
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
                        set(iArr[i6], fArr[i6]);
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

    public final boolean remove(int i2, float f2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(p<? super Integer, ? super Float, Boolean> pVar) {
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
                        if (pVar.invoke(Integer.valueOf(this.keys[i6]), Float.valueOf(this.values[i6])).booleanValue()) {
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
        MutableIntFloatMap mutableIntFloatMap = this;
        long[] jArr2 = mutableIntFloatMap.metadata;
        int[] iArr = mutableIntFloatMap.keys;
        float[] fArr = mutableIntFloatMap.values;
        int i3 = mutableIntFloatMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableIntFloatMap.metadata;
        int[] iArr2 = mutableIntFloatMap.keys;
        float[] fArr2 = mutableIntFloatMap.values;
        int i4 = mutableIntFloatMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int i7 = ScatterMapKt.MurmurHashC1 * i6;
                int iFindFirstAvailableSlot = mutableIntFloatMap.findFirstAvailableSlot((i7 ^ (i7 << 16)) >>> 7);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j2 = ((r11 & 127) << i9) | (jArr3[i8] & (~(255 << i9)));
                jArr3[i8] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                iArr2[iFindFirstAvailableSlot] = i6;
                fArr2[iFindFirstAvailableSlot] = fArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(int i2, float f2) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = i2;
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

    public MutableIntFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntFloatMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void put(int i2, float f2) {
        set(i2, f2);
    }

    public final void remove(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void minusAssign(IntList intList) {
        x.f(intList, "keys");
        int[] iArr = intList.content;
        int i2 = intList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(iArr[i3]);
        }
    }

    public final void minusAssign(int i2) {
        remove(i2);
    }

    public final void minusAssign(int[] iArr) {
        x.f(iArr, "keys");
        for (int i2 : iArr) {
            remove(i2);
        }
    }
}

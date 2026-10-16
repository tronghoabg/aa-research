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
public final class MutableFloatIntMap extends FloatIntMap {
    private int growthLimit;

    public MutableFloatIntMap(int i2) {
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
        this.keys = new float[iMax];
        this.values = new int[iMax];
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
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                int iFloatToIntBits = Float.floatToIntBits(fArr[i7]) * ScatterMapKt.MurmurHashC1;
                int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int i11 = i10 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                int i12 = i11 & i2;
                int i13 = i4;
                long j5 = i10 & 127;
                if (((iFindFirstAvailableSlot - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                    jArr[i8] = (j5 << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[c.z(jArr)] = (jArr[i13] & j3) | Long.MIN_VALUE;
                    i7++;
                    i4 = i13;
                } else {
                    int i14 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr[i14];
                    int i15 = (iFindFirstAvailableSlot & 7) << 3;
                    long j7 = j5 << i15;
                    long j8 = j3;
                    long j9 = j6 & (~(255 << i15));
                    if (((j6 >> i15) & 255) == 128) {
                        long j10 = ~(255 << i9);
                        jArr[i14] = j7 | j9;
                        jArr[i8] = (jArr[i8] & j10) | (128 << i9);
                        fArr[iFindFirstAvailableSlot] = fArr[i7];
                        fArr[i7] = 0.0f;
                        iArr[iFindFirstAvailableSlot] = iArr[i7];
                        iArr[i7] = i13;
                    } else {
                        jArr[i14] = j7 | j9;
                        float f2 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i7];
                        fArr[i7] = f2;
                        int i16 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i7];
                        iArr[i7] = i16;
                        i7--;
                    }
                    jArr[c.z(jArr)] = (jArr[i13] & j8) | Long.MIN_VALUE;
                    i7++;
                    i4 = i13;
                    j3 = j8;
                }
            } else {
                i7++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(float f2) {
        int iFloatToIntBits = Float.floatToIntBits(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i3 = i2 >>> 7;
        int i4 = this._capacity;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i6;
            long j2 = i2 & 127;
            long j3 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j4 = (ScatterMapKt.BitmaskLsb * j2) ^ j3;
            for (long j5 = (~j4) & ((-72340172838076673L) + j4) & (-9187201950435737472L); j5 != 0; j5 &= (-1) + j5) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j6 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j6 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j7 = (j2 << i12) | ((~(255 << i12)) & j6);
                jArr2[i11] = j7;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j7;
                return ~iFindFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int getOrPut(float f2, a<Integer> aVar) {
        x.f(aVar, "defaultValue");
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex >= 0) {
            return this.values[iFindInsertIndex];
        }
        int iIntValue = aVar.invoke().intValue();
        int i2 = ~iFindInsertIndex;
        this.keys[i2] = f2;
        this.values[i2] = iIntValue;
        return iIntValue;
    }

    public final void minusAssign(FloatSet floatSet) {
        int i2;
        x.f(floatSet, "keys");
        float[] fArr = floatSet.elements;
        long[] jArr = floatSet.metadata;
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
                        remove(fArr[(i3 << 3) + i5]);
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

    public final void plusAssign(FloatIntMap floatIntMap) {
        x.f(floatIntMap, TypedValues.TransitionType.S_FROM);
        putAll(floatIntMap);
    }

    public final int put(float f2, int i2, int i3) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = i2;
        return i3;
    }

    public final void putAll(FloatIntMap floatIntMap) {
        int i2;
        x.f(floatIntMap, TypedValues.TransitionType.S_FROM);
        float[] fArr = floatIntMap.keys;
        int[] iArr = floatIntMap.values;
        long[] jArr = floatIntMap.metadata;
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
                        set(fArr[i6], iArr[i6]);
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

    public final boolean remove(float f2, int i2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != i2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(p<? super Float, ? super Integer, Boolean> pVar) {
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
                        if (pVar.invoke(Float.valueOf(this.keys[i6]), Integer.valueOf(this.values[i6])).booleanValue()) {
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
        MutableFloatIntMap mutableFloatIntMap = this;
        long[] jArr2 = mutableFloatIntMap.metadata;
        float[] fArr = mutableFloatIntMap.keys;
        int[] iArr = mutableFloatIntMap.values;
        int i3 = mutableFloatIntMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableFloatIntMap.metadata;
        float[] fArr2 = mutableFloatIntMap.keys;
        int[] iArr2 = mutableFloatIntMap.values;
        int i4 = mutableFloatIntMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                float f2 = fArr[i5];
                int iFloatToIntBits = Float.floatToIntBits(f2) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = mutableFloatIntMap.findFirstAvailableSlot((iFloatToIntBits ^ (iFloatToIntBits << 16)) >>> 7);
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j2 = ((r11 & 127) << i7) | (jArr3[i6] & (~(255 << i7)));
                jArr3[i6] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                fArr2[iFindFirstAvailableSlot] = f2;
                iArr2[iFindFirstAvailableSlot] = iArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableFloatIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float f2, int i2) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = i2;
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

    public MutableFloatIntMap() {
        this(0, 1, null);
    }

    public final void remove(float f2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public /* synthetic */ MutableFloatIntMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void put(float f2, int i2) {
        set(f2, i2);
    }

    public final void minusAssign(FloatList floatList) {
        x.f(floatList, "keys");
        float[] fArr = floatList.content;
        int i2 = floatList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(fArr[i3]);
        }
    }

    public final void minusAssign(float f2) {
        remove(f2);
    }

    public final void minusAssign(float[] fArr) {
        x.f(fArr, "keys");
        for (float f2 : fArr) {
            remove(f2);
        }
    }
}

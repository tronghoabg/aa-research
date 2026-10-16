package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableIntSet extends IntSet {
    private int growthLimit;

    public MutableIntSet(int i2) {
        super(null);
        if (i2 < 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    private final int findAbsoluteInsertIndex(int i2) {
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
                if (this.elements[iNumberOfTrailingZeros] == i2) {
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
                return iFindFirstAvailableSlot;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
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
        this.elements = new int[iMax];
    }

    private final void removeElementAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = this._capacity;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j2;
    }

    public final boolean add(int i2) {
        int i3 = this._size;
        this.elements[findAbsoluteInsertIndex(i2)] = i2;
        return this._size != i3;
    }

    public final boolean addAll(IntSet intSet) {
        x.f(intSet, "elements");
        int i2 = this._size;
        plusAssign(intSet);
        return i2 != this._size;
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
        int[] iArr = this.elements;
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
                    } else {
                        jArr[i15] = j7 | j9;
                        int i17 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i7];
                        iArr[i7] = i17;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r0
            androidx.collection.IntSet r2 = (androidx.collection.IntSet) r2
            int r3 = r2._capacity
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r1
            int r5 = r4 << 16
            r4 = r4 ^ r5
            int r5 = r4 >>> 7
            r5 = r5 & r3
            r6 = 0
        L14:
            r7 = r4 & 127(0x7f, float:1.78E-43)
            long[] r8 = r2.metadata
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            int r10 = r10 + 1
            r13 = r8[r10]
            int r8 = 64 - r9
            long r13 = r13 << r8
            long r8 = (long) r9
            long r8 = -r8
            r10 = r3
            r15 = r4
            long r3 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r13
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r3 = r3 * r11
            long r3 = r3 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r3
            long r3 = ~r3
            long r3 = r3 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r11
        L48:
            r13 = 0
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 == 0) goto L62
            int r9 = java.lang.Long.numberOfTrailingZeros(r3)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r10
            int[] r13 = r2.elements
            r13 = r13[r9]
            if (r13 != r1) goto L5d
            goto L6c
        L5d:
            r13 = -1
            long r13 = r13 + r3
            long r3 = r3 & r13
            goto L48
        L62:
            long r3 = ~r7
            r9 = 6
            long r3 = r3 << r9
            long r3 = r3 & r7
            long r3 = r3 & r11
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L72
            r9 = -1
        L6c:
            if (r9 < 0) goto L71
            r0.removeElementAt(r9)
        L71:
            return
        L72:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r10
            r3 = r10
            r4 = r15
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.minusAssign(int):void");
    }

    public final void plusAssign(IntSet intSet) {
        int i2;
        x.f(intSet, "elements");
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
                        plusAssign(iArr[(i3 << 3) + i5]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r0
            androidx.collection.IntSet r2 = (androidx.collection.IntSet) r2
            int r3 = r2._capacity
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r1
            int r5 = r4 << 16
            r4 = r4 ^ r5
            int r5 = r4 >>> 7
            r5 = r5 & r3
            r7 = 0
        L14:
            r8 = r4 & 127(0x7f, float:1.78E-43)
            long[] r9 = r2.metadata
            r10 = r5 & 7
            int r11 = r5 >> 3
            r12 = r9[r11]
            int r10 = r10 << 3
            long r12 = r12 >>> r10
            r14 = 1
            int r11 = r11 + r14
            r15 = r9[r11]
            int r9 = 64 - r10
            long r15 = r15 << r9
            long r9 = (long) r10
            long r9 = -r9
            r17 = r7
            long r6 = (long) r8
            r8 = 63
            long r8 = r9 >> r8
            long r8 = r8 & r15
            long r8 = r8 | r12
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r12
            long r6 = r6 ^ r8
            r12 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r12 = r12 + r6
            long r6 = ~r6
            long r6 = r6 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r12
        L48:
            r15 = 0
            int r10 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r5
            r10 = r10 & r3
            int[] r15 = r2.elements
            r15 = r15[r10]
            if (r15 != r1) goto L5d
            goto L6c
        L5d:
            r15 = -1
            long r15 = r15 + r6
            long r6 = r6 & r15
            goto L48
        L62:
            long r6 = ~r8
            r10 = 6
            long r6 = r6 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r6 == 0) goto L77
            r10 = -1
        L6c:
            if (r10 < 0) goto L70
            r6 = r14
            goto L71
        L70:
            r6 = 0
        L71:
            if (r6 == 0) goto L76
            r0.removeElementAt(r10)
        L76:
            return r6
        L77:
            int r7 = r17 + 8
            int r5 = r5 + r7
            r5 = r5 & r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.remove(int):boolean");
    }

    public final boolean removeAll(IntSet intSet) {
        x.f(intSet, "elements");
        int i2 = this._size;
        minusAssign(intSet);
        return i2 != this._size;
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr;
        MutableIntSet mutableIntSet = this;
        long[] jArr2 = mutableIntSet.metadata;
        int[] iArr = mutableIntSet.elements;
        int i3 = mutableIntSet._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableIntSet.metadata;
        int[] iArr2 = mutableIntSet.elements;
        int i4 = mutableIntSet._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int i7 = ScatterMapKt.MurmurHashC1 * i6;
                int iFindFirstAvailableSlot = mutableIntSet.findFirstAvailableSlot((i7 ^ (i7 << 16)) >>> 7);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j2 = ((r9 & 127) << i9) | ((~(255 << i9)) & jArr3[i8]);
                jArr3[i8] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                iArr2[iFindFirstAvailableSlot] = i6;
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntSet = this;
            jArr2 = jArr;
        }
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

    public final boolean addAll(int[] iArr) {
        x.f(iArr, "elements");
        int i2 = this._size;
        plusAssign(iArr);
        return i2 != this._size;
    }

    public final boolean removeAll(int[] iArr) {
        x.f(iArr, "elements");
        int i2 = this._size;
        minusAssign(iArr);
        return i2 != this._size;
    }

    public MutableIntSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntSet(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void plusAssign(int i2) {
        this.elements[findAbsoluteInsertIndex(i2)] = i2;
    }

    public final void plusAssign(int[] iArr) {
        x.f(iArr, "elements");
        for (int i2 : iArr) {
            plusAssign(i2);
        }
    }

    public final void minusAssign(IntSet intSet) {
        int i2;
        x.f(intSet, "elements");
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
                        minusAssign(iArr[(i3 << 3) + i5]);
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

    public final void minusAssign(int[] iArr) {
        x.f(iArr, "elements");
        for (int i2 : iArr) {
            minusAssign(i2);
        }
    }
}

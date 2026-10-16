package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableLongSet extends LongSet {
    private int growthLimit;

    public MutableLongSet(int i2) {
        super(null);
        if (i2 < 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    private final int findAbsoluteInsertIndex(long j2) {
        int iM = MutableLongSet$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[iNumberOfTrailingZeros] == j2) {
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
                return iFindFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
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
        this.elements = new long[iMax];
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

    public final boolean add(long j2) {
        int i2 = this._size;
        this.elements[findAbsoluteInsertIndex(j2)] = j2;
        return this._size != i2;
    }

    public final boolean addAll(LongSet longSet) {
        x.f(longSet, "elements");
        int i2 = this._size;
        plusAssign(longSet);
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
        long[] jArr2 = this.elements;
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
                int iM = MutableLongSet$$ExternalSyntheticBackport0.m(jArr2[i6]) * ScatterMapKt.MurmurHashC1;
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
                    } else {
                        jArr[i12] = j7 | j9;
                        long j11 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i6];
                        jArr2[i6] = j11;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        r12 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r0
            androidx.collection.LongSet r1 = (androidx.collection.LongSet) r1
            int r2 = r1._capacity
            int r3 = androidx.collection.MutableLongSet$$ExternalSyntheticBackport0.m(r17)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r3 >>> 7
            r4 = r4 & r2
            r5 = 0
        L16:
            r6 = r3 & 127(0x7f, float:1.78E-43)
            long[] r7 = r1.metadata
            r8 = r4 & 7
            int r9 = r4 >> 3
            r10 = r7[r9]
            int r8 = r8 << 3
            long r10 = r10 >>> r8
            int r9 = r9 + 1
            r12 = r7[r9]
            int r7 = 64 - r8
            long r12 = r12 << r7
            long r7 = (long) r8
            long r7 = -r7
            long r14 = (long) r6
            r6 = 63
            long r6 = r7 >> r6
            long r6 = r6 & r12
            long r6 = r6 | r10
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r8
            long r8 = r6 ^ r14
            r10 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r10 = r10 + r8
            long r8 = ~r8
            long r8 = r8 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
        L49:
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 == 0) goto L65
            int r12 = java.lang.Long.numberOfTrailingZeros(r8)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r2
            long[] r13 = r1.elements
            r14 = r13[r12]
            int r13 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r13 != 0) goto L60
            goto L6f
        L60:
            r12 = -1
            long r12 = r12 + r8
            long r8 = r8 & r12
            goto L49
        L65:
            long r8 = ~r6
            r14 = 6
            long r8 = r8 << r14
            long r6 = r6 & r8
            long r6 = r6 & r10
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto L75
            r12 = -1
        L6f:
            if (r12 < 0) goto L74
            r0.removeElementAt(r12)
        L74:
            return
        L75:
            int r5 = r5 + 8
            int r4 = r4 + r5
            r4 = r4 & r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.minusAssign(long):void");
    }

    public final void plusAssign(LongSet longSet) {
        int i2;
        x.f(longSet, "elements");
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
                        plusAssign(jArr[(i3 << 3) + i5]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(long r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r0
            androidx.collection.LongSet r1 = (androidx.collection.LongSet) r1
            int r2 = r1._capacity
            int r3 = androidx.collection.MutableLongSet$$ExternalSyntheticBackport0.m(r20)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r3 >>> 7
            r4 = r4 & r2
            r6 = 0
        L16:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r1.metadata
            r9 = r4 & 7
            int r10 = r4 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r6
            long r5 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r11
            long r5 = r5 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r5
            long r5 = ~r5
            long r5 = r5 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r11
        L4a:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L66
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r4
            r9 = r9 & r2
            long[] r14 = r1.elements
            r17 = r14[r9]
            int r14 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r14 != 0) goto L61
            goto L70
        L61:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L4a
        L66:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L7b
            r9 = -1
        L70:
            if (r9 < 0) goto L74
            r5 = r13
            goto L75
        L74:
            r5 = 0
        L75:
            if (r5 == 0) goto L7a
            r0.removeElementAt(r9)
        L7a:
            return r5
        L7b:
            int r6 = r16 + 8
            int r4 = r4 + r6
            r4 = r4 & r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.remove(long):boolean");
    }

    public final boolean removeAll(LongSet longSet) {
        x.f(longSet, "elements");
        int i2 = this._size;
        minusAssign(longSet);
        return i2 != this._size;
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr;
        MutableLongSet mutableLongSet = this;
        long[] jArr2 = mutableLongSet.metadata;
        long[] jArr3 = mutableLongSet.elements;
        int i3 = mutableLongSet._capacity;
        initializeStorage(i2);
        long[] jArr4 = mutableLongSet.metadata;
        long[] jArr5 = mutableLongSet.elements;
        int i4 = mutableLongSet._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i5];
                int iM = MutableLongSet$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = mutableLongSet.findFirstAvailableSlot((iM ^ (iM << 16)) >>> 7);
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j3 = ((r12 & 127) << i7) | (jArr4[i6] & (~(255 << i7)));
                jArr4[i6] = j3;
                jArr4[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j3;
                jArr5[iFindFirstAvailableSlot] = j2;
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableLongSet = this;
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

    public final boolean addAll(long[] jArr) {
        x.f(jArr, "elements");
        int i2 = this._size;
        plusAssign(jArr);
        return i2 != this._size;
    }

    public final boolean removeAll(long[] jArr) {
        x.f(jArr, "elements");
        int i2 = this._size;
        minusAssign(jArr);
        return i2 != this._size;
    }

    public MutableLongSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongSet(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void plusAssign(long j2) {
        this.elements[findAbsoluteInsertIndex(j2)] = j2;
    }

    public final void plusAssign(long[] jArr) {
        x.f(jArr, "elements");
        for (long j2 : jArr) {
            plusAssign(j2);
        }
    }

    public final void minusAssign(LongSet longSet) {
        int i2;
        x.f(longSet, "elements");
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
                        minusAssign(jArr[(i3 << 3) + i5]);
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

    public final void minusAssign(long[] jArr) {
        x.f(jArr, "elements");
        for (long j2 : jArr) {
            minusAssign(j2);
        }
    }
}

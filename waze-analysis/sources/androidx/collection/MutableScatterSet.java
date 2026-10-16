package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.m.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    public MutableScatterSet(int i2) {
        super(null);
        if (i2 < 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    private final int findAbsoluteInsertIndex(E e2) {
        int iHashCode = (e2 != null ? e2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
                if (x.n(this.elements[iNumberOfTrailingZeros], e2)) {
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
                this.growthLimit = i10 - (((j6 >> i12) & 255) != 128 ? 0 : 1);
                int i13 = this._capacity;
                long j7 = (j2 << i12) | ((~(255 << i12)) & j6);
                jArr2[i11] = j7;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j7;
                return iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i9;
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
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
    }

    public final boolean add(E e2) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e2)] = e2;
        return getSize() != size;
    }

    public final boolean addAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        int size = getSize();
        plusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final void adjustStorage$collection() {
        int i2 = this._capacity;
        if (i2 <= 8 || Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i2 * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final Set<E> asMutableSet() {
        Set<E> set = this.mutableSetWrapper;
        if (set != null) {
            return set;
        }
        MutableSetWrapper mutableSetWrapper = new MutableSetWrapper(this);
        this.mutableSetWrapper = mutableSetWrapper;
        return mutableSetWrapper;
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
        Object[] objArr = this.elements;
        int i4 = this._capacity;
        x.f(objArr, "<this>");
        Arrays.fill(objArr, 0, i4, (Object) null);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i2 + 7;
        Object[] objArr = this.elements;
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
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i4) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
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
                        objArr[iFindFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = null;
                    } else {
                        jArr[i14] = j7 | j9;
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = obj2;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r0
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            r3 = 0
            if (r1 == 0) goto Lf
            int r4 = r1.hashCode()
            goto L10
        Lf:
            r4 = r3
        L10:
            int r5 = r2._capacity
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r6
            int r6 = r4 << 16
            r4 = r4 ^ r6
            int r6 = r4 >>> 7
            r6 = r6 & r5
        L1c:
            r7 = r4 & 127(0x7f, float:1.78E-43)
            long[] r8 = r2.metadata
            r9 = r6 & 7
            int r10 = r6 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            int r10 = r10 + 1
            r13 = r8[r10]
            int r8 = 64 - r9
            long r13 = r13 << r8
            long r8 = (long) r9
            long r8 = -r8
            r15 = r3
            r10 = r4
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
        L50:
            r13 = 0
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 == 0) goto L6e
            int r9 = java.lang.Long.numberOfTrailingZeros(r3)
            int r9 = r9 >> 3
            int r9 = r9 + r6
            r9 = r9 & r5
            java.lang.Object[] r13 = r2.elements
            r13 = r13[r9]
            boolean r13 = h.g.b.x.n(r13, r1)
            if (r13 == 0) goto L69
            goto L78
        L69:
            r13 = -1
            long r13 = r13 + r3
            long r3 = r3 & r13
            goto L50
        L6e:
            long r3 = ~r7
            r9 = 6
            long r3 = r3 << r9
            long r3 = r3 & r7
            long r3 = r3 & r11
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L7e
            r9 = -1
        L78:
            if (r9 < 0) goto L7d
            r0.removeElementAt(r9)
        L7d:
            return
        L7e:
            int r3 = r15 + 8
            int r6 = r6 + r3
            r6 = r6 & r5
            r4 = r10
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> scatterSet) {
        int i2;
        x.f(scatterSet, "elements");
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
                        plusAssign((MutableScatterSet<E>) objArr[(i3 << 3) + i5]);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r0
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            if (r1 == 0) goto Le
            int r4 = r1.hashCode()
            goto Lf
        Le:
            r4 = 0
        Lf:
            int r5 = r2._capacity
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r6
            int r6 = r4 << 16
            r4 = r4 ^ r6
            int r6 = r4 >>> 7
            r6 = r6 & r5
            r7 = 0
        L1c:
            r8 = r4 & 127(0x7f, float:1.78E-43)
            long[] r9 = r2.metadata
            r10 = r6 & 7
            int r11 = r6 >> 3
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
            r17 = r4
            long r3 = (long) r8
            r8 = 63
            long r8 = r9 >> r8
            long r8 = r8 & r15
            long r8 = r8 | r12
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r3 = r3 * r12
            long r3 = r3 ^ r8
            r12 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r12 = r12 + r3
            long r3 = ~r3
            long r3 = r3 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r12
        L50:
            r15 = 0
            int r10 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r10 == 0) goto L6e
            int r10 = java.lang.Long.numberOfTrailingZeros(r3)
            int r10 = r10 >> 3
            int r10 = r10 + r6
            r10 = r10 & r5
            java.lang.Object[] r15 = r2.elements
            r15 = r15[r10]
            boolean r15 = h.g.b.x.n(r15, r1)
            if (r15 == 0) goto L69
            goto L78
        L69:
            r15 = -1
            long r15 = r15 + r3
            long r3 = r3 & r15
            goto L50
        L6e:
            long r3 = ~r8
            r10 = 6
            long r3 = r3 << r10
            long r3 = r3 & r8
            long r3 = r3 & r12
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 == 0) goto L83
            r10 = -1
        L78:
            if (r10 < 0) goto L7c
            r3 = r14
            goto L7d
        L7c:
            r3 = 0
        L7d:
            if (r3 == 0) goto L82
            r0.removeElementAt(r10)
        L82:
            return r3
        L83:
            int r7 = r7 + 8
            int r6 = r6 + r7
            r6 = r6 & r5
            r4 = r17
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        int size = getSize();
        minusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final void removeElementAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = this._capacity;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i3] & (~(255 << i5))) | (254 << i5);
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j2;
        this.elements[i2] = null;
    }

    public final void removeIf(l<? super E, Boolean> lVar) {
        int i2;
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
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
                        if (lVar.invoke(objArr[i6]).booleanValue()) {
                            removeElementAt(i6);
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

    public final void resizeStorage$collection(int i2) {
        int i3;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i4 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i5 = this._capacity;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = findFirstAvailableSlot((iHashCode ^ (iHashCode << 16)) >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                i3 = i6;
                long j2 = ((r10 & 127) << i8) | (jArr2[i7] & (~(255 << i8)));
                jArr2[i7] = j2;
                jArr2[(((iFindFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                objArr2[iFindFirstAvailableSlot] = obj;
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(h.g.a.l<? super E, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "predicate"
            h.g.b.x.f(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0.getSize()
            r4 = r0
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            long[] r4 = r4.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5f
            r7 = r6
        L1b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5a
            int r10 = r7 - r5
            r11 = r6
        L2e:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L58
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L54
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r2[r12]
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L54
            r0.removeElementAt(r12)
        L54:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L2e
        L58:
            if (r12 != r13) goto L5f
        L5a:
            if (r7 == r5) goto L5f
            int r7 = r7 + 1
            goto L1b
        L5f:
            int r0 = r0.getSize()
            if (r3 == r0) goto L67
            r0 = 1
            return r0
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(h.g.a.l):boolean");
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

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableScatterSet(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final boolean addAll(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "elements");
        int size = getSize();
        plusAssign((OrderedScatterSet) orderedScatterSet);
        return size != getSize();
    }

    public final boolean removeAll(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "elements");
        int size = getSize();
        minusAssign((OrderedScatterSet) orderedScatterSet);
        return size != getSize();
    }

    public final boolean addAll(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "elements");
        int size = getSize();
        plusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final boolean removeAll(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "elements");
        int size = getSize();
        minusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final boolean addAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        int size = getSize();
        plusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean removeAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        int size = getSize();
        minusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean addAll(h<? extends E> hVar) {
        x.f(hVar, "elements");
        int size = getSize();
        plusAssign((h) hVar);
        return size != getSize();
    }

    public final boolean removeAll(h<? extends E> hVar) {
        x.f(hVar, "elements");
        int size = getSize();
        minusAssign((h) hVar);
        return size != getSize();
    }

    public final boolean addAll(E[] eArr) {
        x.f(eArr, "elements");
        int size = getSize();
        plusAssign((Object[]) eArr);
        return size != getSize();
    }

    public final boolean removeAll(E[] eArr) {
        x.f(eArr, "elements");
        int size = getSize();
        minusAssign((Object[]) eArr);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "elements");
        Object[] objArr = orderedScatterSet.elements;
        long[] jArr = orderedScatterSet.nodes;
        int i2 = orderedScatterSet.tail;
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2] >> 31;
            plusAssign((MutableScatterSet<E>) objArr[i2]);
            i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            plusAssign((MutableScatterSet<E>) objArr[i3]);
        }
    }

    public final void plusAssign(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E e2) {
        this.elements[findAbsoluteInsertIndex(e2)] = e2;
    }

    public final void plusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            plusAssign((MutableScatterSet<E>) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(androidx.collection.ScatterSet<E> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "elements"
            h.g.b.x.f(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            r4 = r0
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            long[] r4 = r4.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L19:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            r11 = r6
        L2c:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L50
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L4c
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r2[r12]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r12)
        L4c:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L2c
        L50:
            if (r12 != r13) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L19
        L57:
            int r0 = r0._size
            if (r3 == r0) goto L5d
            r0 = 1
            return r0
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(androidx.collection.ScatterSet):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection<? extends E> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "elements"
            h.g.b.x.f(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            r4 = r0
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            long[] r4 = r4.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5a
            r7 = r6
        L19:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L55
            int r10 = r7 - r5
            r11 = r6
        L2c:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L53
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L4f
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r12]
            boolean r14 = h.a.i.ax(r14, r15)
            if (r14 != 0) goto L4f
            r0.removeElementAt(r12)
        L4f:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L2c
        L53:
            if (r12 != r13) goto L5a
        L55:
            if (r7 == r5) goto L5a
            int r7 = r7 + 1
            goto L19
        L5a:
            int r0 = r0._size
            if (r3 == r0) goto L60
            r0 = 1
            return r0
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(java.util.Collection):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(androidx.collection.OrderedScatterSet<E> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "elements"
            h.g.b.x.f(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            r4 = r0
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            long[] r4 = r4.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L19:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            r11 = r6
        L2c:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L50
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L4c
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r2[r12]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r12)
        L4c:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L2c
        L50:
            if (r12 != r13) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L19
        L57:
            int r0 = r0._size
            if (r3 == r0) goto L5d
            r0 = 1
            return r0
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(androidx.collection.OrderedScatterSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "elements");
        Object[] objArr = orderedScatterSet.elements;
        long[] jArr = orderedScatterSet.nodes;
        int i2 = orderedScatterSet.tail;
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2] >> 31;
            minusAssign((MutableScatterSet<E>) objArr[i2]);
            i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> scatterSet) {
        int i2;
        x.f(scatterSet, "elements");
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
                        minusAssign((MutableScatterSet<E>) objArr[(i3 << 3) + i5]);
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

    public final void minusAssign(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            minusAssign((MutableScatterSet<E>) objArr[i3]);
        }
    }

    public final void minusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final void minusAssign(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            minusAssign((MutableScatterSet<E>) e2);
        }
    }
}

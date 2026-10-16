package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.m.h;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet(int i2) {
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
        long[] emptyNodes;
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            c.aw(emptyNodes, 4611686018427387903L, emptyNodes.length);
        }
        this.nodes = emptyNodes;
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
        jArr[i2] = 4611686018427387903L;
    }

    public final boolean add(E e2) {
        int size = getSize();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(e2);
        this.elements[iFindAbsoluteInsertIndex] = e2;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i2 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((SieveCacheKt.NodeLinkMask & iFindAbsoluteInsertIndex) << 31) | (jArr[i2] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
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
        return new MutableOrderedSetWrapper(this);
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
        c.j(this.elements, null, 0, this._capacity);
        long[] jArr3 = this.nodes;
        c.aw(jArr3, 4611686018427387903L, jArr3.length);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        Object[] objArr;
        int i2;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i3 = this._capacity;
        Object[] objArr2 = this.elements;
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
                Object obj = objArr2[i8];
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
                    long j12 = j10 & (~(255 << i18));
                    int i19 = i3;
                    if (((j10 >> i18) & 255) == 128) {
                        long j13 = j8 << 32;
                        objArr = objArr2;
                        long j14 = ~(255 << i10);
                        jArr[i17] = j11 | j12;
                        jArr[i9] = (j14 & jArr[i9]) | (128 << i10);
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
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
                        objArr = objArr2;
                        long j15 = j9 << 32;
                        jArr[i17] = j11 | j12;
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
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
                    objArr2 = objArr;
                    i3 = i19;
                }
            } else {
                i8++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
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
            androidx.collection.OrderedScatterSet r2 = (androidx.collection.OrderedScatterSet) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
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
                        plusAssign((MutableOrderedScatterSet<E>) objArr[(i3 << 3) + i5]);
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
            androidx.collection.OrderedScatterSet r2 = (androidx.collection.OrderedScatterSet) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
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
            jArr2[i7] = (i6 << 31) | (jArr2[i7] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i6;
        }
        jArr2[i2] = 4611686018427387903L;
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
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i3 = this._capacity;
        int[] iArr = new int[i3];
        initializeStorage(i2);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
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
                long j2 = ((r13 & 127) << i7) | (jArr4[i6] & (~(255 << i7)));
                jArr4[i6] = j2;
                jArr4[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                objArr3[iFindFirstAvailableSlot] = obj;
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
            androidx.collection.OrderedScatterSet r4 = (androidx.collection.OrderedScatterSet) r4
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(h.g.a.l):boolean");
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

    public final void trimToSize(int i2) {
        int i3;
        long[] jArr = this.nodes;
        int i4 = this.head;
        while (i4 != Integer.MAX_VALUE && (i3 = this._size) > i2 && i3 != 0) {
            long j2 = jArr[i4] & SieveCacheKt.NodeLinkMask;
            removeElementAt(i4);
            i4 = (int) j2;
        }
    }

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableOrderedScatterSet(int i2, int i3, o oVar) {
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
            plusAssign((MutableOrderedScatterSet<E>) objArr[i2]);
            i2 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            plusAssign((MutableOrderedScatterSet<E>) objArr[i3]);
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
    }

    public final void plusAssign(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E e2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(e2);
        this.elements[iFindAbsoluteInsertIndex] = e2;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i2 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((SieveCacheKt.NodeLinkMask & iFindAbsoluteInsertIndex) << 31) | (jArr[i2] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    public final void plusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            plusAssign((MutableOrderedScatterSet<E>) e2);
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
            androidx.collection.OrderedScatterSet r4 = (androidx.collection.OrderedScatterSet) r4
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.ScatterSet):boolean");
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
            androidx.collection.OrderedScatterSet r4 = (androidx.collection.OrderedScatterSet) r4
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(java.util.Collection):boolean");
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
            androidx.collection.OrderedScatterSet r4 = (androidx.collection.OrderedScatterSet) r4
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.OrderedScatterSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "elements");
        Object[] objArr = orderedScatterSet.elements;
        long[] jArr = orderedScatterSet.nodes;
        int i2 = orderedScatterSet.tail;
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2] >> 31;
            minusAssign((MutableOrderedScatterSet<E>) objArr[i2]);
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
                        minusAssign((MutableOrderedScatterSet<E>) objArr[(i3 << 3) + i5]);
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
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            minusAssign((MutableOrderedScatterSet<E>) objArr[i3]);
        }
    }

    public final void minusAssign(h<? extends E> hVar) {
        x.f(hVar, "elements");
        Iterator<? extends E> it = hVar.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void minusAssign(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            minusAssign((MutableOrderedScatterSet<E>) e2);
        }
    }
}

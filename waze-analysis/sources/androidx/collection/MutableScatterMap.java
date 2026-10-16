package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.c;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.m.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;
    private Map<K, V> mutableMapWrapper;

    public MutableScatterMap(int i2) {
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
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
    }

    public final void adjustStorage$collection() {
        int i2 = this._capacity;
        if (i2 <= 8 || Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i2 * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final Map<K, V> asMutableMap() {
        Map<K, V> map = this.mutableMapWrapper;
        if (map != null) {
            return map;
        }
        MutableMapWrapper mutableMapWrapper = new MutableMapWrapper(this);
        this.mutableMapWrapper = mutableMapWrapper;
        return mutableMapWrapper;
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
        Object[] objArr = this.values;
        int i4 = this._capacity;
        x.f(objArr, "<this>");
        Arrays.fill(objArr, 0, i4, (Object) null);
        Object[] objArr2 = this.keys;
        int i5 = this._capacity;
        x.f(objArr2, "<this>");
        Arrays.fill(objArr2, 0, i5, (Object) null);
        initializeGrowth();
    }

    public final V compute(K k2, p<? super K, ? super V, ? extends V> pVar) {
        x.f(pVar, "computeBlock");
        int iFindInsertIndex = findInsertIndex(k2);
        boolean z = iFindInsertIndex < 0;
        V vInvoke = pVar.invoke(k2, z ? null : this.values[iFindInsertIndex]);
        if (!z) {
            this.values[iFindInsertIndex] = vInvoke;
            return vInvoke;
        }
        int i2 = ~iFindInsertIndex;
        this.keys[i2] = k2;
        this.values[i2] = vInvoke;
        return vInvoke;
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i2 + 7;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i4 = 0;
        for (int i5 = 0; i5 < (i3 >> 3); i5++) {
            long j2 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iZ = c.z(jArr);
        int i6 = iZ - 1;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i7 = 0;
        while (i7 != i2) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i4) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                int i12 = i11 & i2;
                int i13 = i4;
                long j4 = i10 & 127;
                if (((iFindFirstAvailableSlot - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                    jArr[i8] = (j4 << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[c.z(jArr)] = jArr[i13];
                } else {
                    int i14 = iFindFirstAvailableSlot >> 3;
                    long j5 = jArr[i14];
                    int i15 = (iFindFirstAvailableSlot & 7) << 3;
                    long j6 = j4 << i15;
                    long j7 = j5 & (~(255 << i15));
                    if (((j5 >> i15) & 255) == 128) {
                        long j8 = ~(255 << i9);
                        jArr[i14] = j6 | j7;
                        jArr[i8] = (jArr[i8] & j8) | (128 << i9);
                        objArr[iFindFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = null;
                        objArr2[iFindFirstAvailableSlot] = objArr2[i7];
                        objArr2[i7] = null;
                    } else {
                        jArr[i14] = j6 | j7;
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = obj2;
                        Object obj3 = objArr2[iFindFirstAvailableSlot];
                        objArr2[iFindFirstAvailableSlot] = objArr2[i7];
                        objArr2[i7] = obj3;
                        i7--;
                    }
                    jArr[c.z(jArr)] = jArr[i13];
                }
                i7++;
                i4 = i13;
            } else {
                i7++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(K k2) {
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
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i9;
        }
    }

    public final V getOrPut(K k2, a<? extends V> aVar) {
        x.f(aVar, "defaultValue");
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            V vInvoke = aVar.invoke();
            int i2 = ~iFindInsertIndex;
            this.keys[i2] = k2;
            this.values[i2] = vInvoke;
            return vInvoke;
        }
        V v = (V) this.values[iFindInsertIndex];
        if (v != null) {
            return v;
        }
        V vInvoke2 = aVar.invoke();
        this.keys[iFindInsertIndex] = k2;
        this.values[iFindInsertIndex] = vInvoke2;
        return vInvoke2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(k<? extends K, ? extends V> kVar) {
        x.f(kVar, "pair");
        set(kVar.c(), kVar.d());
    }

    public final V put(K k2, V v) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = k2;
        objArr[iFindInsertIndex] = v;
        return v2;
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
                        set(objArr[i6], objArr2[i6]);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(K r19, V r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r0
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
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
            r11 = 0
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
        L51:
            r15 = 0
            int r10 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r10 == 0) goto L6f
            int r10 = java.lang.Long.numberOfTrailingZeros(r3)
            int r10 = r10 >> 3
            int r10 = r10 + r6
            r10 = r10 & r5
            java.lang.Object[] r15 = r2.keys
            r15 = r15[r10]
            boolean r15 = h.g.b.x.n(r15, r1)
            if (r15 == 0) goto L6a
            goto L79
        L6a:
            r15 = -1
            long r15 = r15 + r3
            long r3 = r3 & r15
            goto L51
        L6f:
            long r3 = ~r8
            r10 = 6
            long r3 = r3 << r10
            long r3 = r3 & r8
            long r3 = r3 & r12
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 == 0) goto L8c
            r10 = -1
        L79:
            if (r10 < 0) goto L8b
            java.lang.Object[] r1 = r0.values
            r1 = r1[r10]
            r3 = r20
            boolean r1 = h.g.b.x.n(r1, r3)
            if (r1 == 0) goto L8b
            r0.removeValueAt(r10)
            return r14
        L8b:
            return r11
        L8c:
            r3 = r20
            int r7 = r7 + 8
            int r6 = r6 + r7
            r6 = r6 & r5
            r4 = r17
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final void removeIf(p<? super K, ? super V, Boolean> pVar) {
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
                        if (pVar.invoke(this.keys[i6], this.values[i6]).booleanValue()) {
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

    public final V removeValueAt(int i2) {
        this._size--;
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
        return v;
    }

    public final void resizeStorage$collection(int i2) {
        int i3;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i4 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
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
                long j2 = ((r12 & 127) << i8) | (jArr2[i7] & (~(255 << i8)));
                jArr2[i7] = j2;
                jArr2[(((iFindFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i3];
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
        }
    }

    public final void set(K k2, V v) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = k2;
        this.values[iFindInsertIndex] = v;
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

    public final void plusAssign(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        x.f(iterable, "pairs");
        putAll(iterable);
    }

    public final void plusAssign(Map<K, ? extends V> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        putAll(map);
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public final void plusAssign(ScatterMap<K, V> scatterMap) {
        x.f(scatterMap, TypedValues.TransitionType.S_FROM);
        putAll(scatterMap);
    }

    public /* synthetic */ MutableScatterMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
    }

    public final void plusAssign(h<? extends k<? extends K, ? extends V>> hVar) {
        x.f(hVar, "pairs");
        putAll(hVar);
    }

    public final void plusAssign(k<? extends K, ? extends V>[] kVarArr) {
        x.f(kVarArr, "pairs");
        putAll(kVarArr);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        x.f(iterable, "pairs");
        for (k<? extends K, ? extends V> kVar : iterable) {
            set(kVar.a(), kVar.b());
        }
    }

    public final void putAll(Map<K, ? extends V> map) {
        x.f(map, TypedValues.TransitionType.S_FROM);
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(h<? extends k<? extends K, ? extends V>> hVar) {
        x.f(hVar, "pairs");
        for (k<? extends K, ? extends V> kVar : hVar) {
            set(kVar.a(), kVar.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(k<? extends K, ? extends V>[] kVarArr) {
        x.f(kVarArr, "pairs");
        for (k<? extends K, ? extends V> kVar : kVarArr) {
            set(kVar.a(), kVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(K r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r0
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
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
            java.lang.Object[] r13 = r2.keys
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
            if (r3 == 0) goto L81
            r9 = -1
        L78:
            if (r9 < 0) goto L7f
            java.lang.Object r0 = r0.removeValueAt(r9)
            return r0
        L7f:
            r0 = 0
            return r0
        L81:
            int r3 = r15 + 8
            int r6 = r6 + r3
            r6 = r6 & r5
            r4 = r10
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }
}

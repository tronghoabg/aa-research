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
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    private int growthLimit;

    public MutableFloatObjectMap(int i2) {
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
        this.values = new Object[iMax];
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
        c.j(this.values, null, 0, this._capacity);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i2 + 7;
        float[] fArr = this.keys;
        Object[] objArr = this.values;
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
                int iFloatToIntBits = Float.floatToIntBits(fArr[i6]) * ScatterMapKt.MurmurHashC1;
                int i9 = iFloatToIntBits ^ (iFloatToIntBits << 16);
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
                        fArr[iFindFirstAvailableSlot] = fArr[i6];
                        fArr[i6] = 0.0f;
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        jArr[i12] = j7 | j9;
                        float f2 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i6];
                        fArr[i6] = f2;
                        Object obj = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj;
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

    public final V getOrPut(float f2, a<? extends V> aVar) {
        x.f(aVar, "defaultValue");
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            V vInvoke = aVar.invoke();
            int i2 = ~iFindInsertIndex;
            this.keys[i2] = f2;
            this.values[i2] = vInvoke;
            return vInvoke;
        }
        V v = (V) this.values[iFindInsertIndex];
        if (v != null) {
            return v;
        }
        V vInvoke2 = aVar.invoke();
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = vInvoke2;
        return vInvoke2;
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

    public final void plusAssign(FloatObjectMap<V> floatObjectMap) {
        x.f(floatObjectMap, TypedValues.TransitionType.S_FROM);
        putAll(floatObjectMap);
    }

    public final V put(float f2, V v) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = f2;
        objArr[iFindInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(FloatObjectMap<V> floatObjectMap) {
        int i2;
        x.f(floatObjectMap, TypedValues.TransitionType.S_FROM);
        float[] fArr = floatObjectMap.keys;
        Object[] objArr = floatObjectMap.values;
        long[] jArr = floatObjectMap.metadata;
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
                        set(fArr[i6], objArr[i6]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(float r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r0
            androidx.collection.FloatObjectMap r1 = (androidx.collection.FloatObjectMap) r1
            int r2 = java.lang.Float.floatToIntBits(r18)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r1._capacity
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r4 = r4 & r3
            r6 = 0
        L16:
            r7 = r2 & 127(0x7f, float:1.78E-43)
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
            r10 = 0
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
        L4b:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L67
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r4
            r9 = r9 & r3
            float[] r14 = r1.keys
            r14 = r14[r9]
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 != 0) goto L62
            goto L71
        L62:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L4b
        L67:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L84
            r9 = -1
        L71:
            if (r9 < 0) goto L83
            java.lang.Object[] r1 = r0.values
            r1 = r1[r9]
            r5 = r19
            boolean r1 = h.g.b.x.n(r1, r5)
            if (r1 == 0) goto L83
            r0.removeValueAt(r9)
            return r13
        L83:
            return r10
        L84:
            r5 = r19
            int r6 = r16 + 8
            int r4 = r4 + r6
            r4 = r4 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float, java.lang.Object):boolean");
    }

    public final void removeIf(p<? super Float, ? super V, Boolean> pVar) {
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
                        if (pVar.invoke(Float.valueOf(this.keys[i6]), this.values[i6]).booleanValue()) {
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
        Object[] objArr = this.values;
        V v = (V) objArr[i2];
        objArr[i2] = null;
        return v;
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr;
        MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        long[] jArr2 = mutableFloatObjectMap.metadata;
        float[] fArr = mutableFloatObjectMap.keys;
        Object[] objArr = mutableFloatObjectMap.values;
        int i3 = mutableFloatObjectMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableFloatObjectMap.metadata;
        float[] fArr2 = mutableFloatObjectMap.keys;
        Object[] objArr2 = mutableFloatObjectMap.values;
        int i4 = mutableFloatObjectMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                float f2 = fArr[i5];
                int iFloatToIntBits = Float.floatToIntBits(f2) * ScatterMapKt.MurmurHashC1;
                int iFindFirstAvailableSlot = mutableFloatObjectMap.findFirstAvailableSlot((iFloatToIntBits ^ (iFloatToIntBits << 16)) >>> 7);
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j2 = ((r11 & 127) << i7) | (jArr3[i6] & (~(255 << i7)));
                jArr3[i6] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                fArr2[iFindFirstAvailableSlot] = f2;
                objArr2[iFindFirstAvailableSlot] = objArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableFloatObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float f2, V v) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f2;
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

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatObjectMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 6 : i2);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        r12 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(float r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r0
            androidx.collection.FloatObjectMap r1 = (androidx.collection.FloatObjectMap) r1
            int r2 = java.lang.Float.floatToIntBits(r17)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r1._capacity
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r4 = r4 & r3
            r5 = 0
        L16:
            r6 = r2 & 127(0x7f, float:1.78E-43)
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
            r12 = r12 & r3
            float[] r13 = r1.keys
            r13 = r13[r12]
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
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
            if (r6 == 0) goto L78
            r12 = -1
        L6f:
            if (r12 < 0) goto L76
            java.lang.Object r0 = r0.removeValueAt(r12)
            return r0
        L76:
            r0 = 0
            return r0
        L78:
            int r5 = r5 + 8
            int r4 = r4 + r5
            r4 = r4 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float):java.lang.Object");
    }
}

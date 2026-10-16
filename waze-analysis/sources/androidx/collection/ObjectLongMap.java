package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ObjectLongMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public long[] values;

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, p pVar, int i3, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i4;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence charSequence5 = (i3 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i3 & 4) != 0 ? "" : charSequence3;
        int i5 = (i3 & 8) != 0 ? -1 : i2;
        CharSequence charSequence8 = (i3 & 16) != 0 ? "..." : charSequence4;
        x.f(charSequence5, "separator");
        x.f(charSequence6, "prefix");
        x.f(charSequence7, "postfix");
        x.f(charSequence8, "truncated");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence6);
        Object[] objArr = objectLongMap.keys;
        long[] jArr3 = objectLongMap.values;
        long[] jArr4 = objectLongMap.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j2 = jArr4[i6];
                int i8 = i6;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            jArr = jArr4;
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                i4 = i9;
                                Object obj2 = objArr[i12];
                                long j3 = jArr3[i12];
                                if (i7 != 0) {
                                    sb.append(charSequence5);
                                }
                                if (i7 == i5) {
                                    sb.append(charSequence8);
                                    break loop0;
                                }
                                jArr2 = jArr4;
                                sb.append((CharSequence) pVar.invoke(obj2, Long.valueOf(j3)));
                                i7++;
                            } else {
                                jArr2 = jArr4;
                                i4 = i9;
                            }
                            j2 >>= i4;
                            i11++;
                            i9 = i4;
                            jArr4 = jArr2;
                        }
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length) {
                    break;
                }
                i6 = i8 + 1;
                jArr4 = jArr;
            }
        }
        sb.append(charSequence7);
        return sb.toString();
    }

    public final boolean all(p<? super K, ? super Long, Boolean> pVar) {
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i4;
                            if (!pVar.invoke(objArr[i6], Long.valueOf(jArr[i6])).booleanValue()) {
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

    public final boolean any(p<? super K, ? super Long, Boolean> pVar) {
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
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
                                if (pVar.invoke(objArr[i6], Long.valueOf(jArr[i6])).booleanValue()) {
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
        return containsKey(k2);
    }

    public final boolean containsKey(K k2) {
        return findKeyIndex(k2) >= 0;
    }

    public final boolean containsValue(long j2) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr2[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
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
                            if ((255 & j3) < 128 && j2 == jArr[(i2 << 3) + i4]) {
                                return true;
                            }
                            j3 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int count(p<? super K, ? super Long, Boolean> pVar) {
        int i2;
        x.f(pVar, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j2 = jArr2[i3];
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
                        if (pVar.invoke(objArr[i7], Long.valueOf(jArr[i7])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ObjectLongMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ObjectLongMap r1 = (androidx.collection.ObjectLongMap) r1
            int r3 = r1.getSize()
            int r5 = r0.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.keys
            long[] r5 = r0.values
            long[] r0 = r0.metadata
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6e
            r7 = r4
        L27:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L69
            int r10 = r7 - r6
            r11 = r4
        L3a:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L67
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L63
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r15 = r5[r12]
            int r12 = r1.findKeyIndex(r14)
            if (r12 < 0) goto L62
            long[] r14 = r1.values
            r17 = r14[r12]
            int r12 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L63
        L62:
            return r4
        L63:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L3a
        L67:
            if (r12 != r13) goto L6e
        L69:
            if (r7 == r6) goto L6e
            int r7 = r7 + 1
            goto L27
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex(K k2) {
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

    public final void forEach(p<? super K, ? super Long, ab> pVar) {
        int i2;
        x.f(pVar, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
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
                        pVar.invoke(objArr[i6], Long.valueOf(jArr[i6]));
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
                        lVar.invoke(objArr[(i3 << 3) + i5]);
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

    public final void forEachValue(l<? super Long, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
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
                        lVar.invoke(Long.valueOf(jArr[(i3 << 3) + i5]));
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

    public final long get(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("There is no key " + k2 + " in the map");
        }
        return this.values[iFindKeyIndex];
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final long getOrDefault(K k2, long j2) {
        int iFindKeyIndex = findKeyIndex(k2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j2;
    }

    public final long getOrElse(K k2, a<Long> aVar) {
        x.f(aVar, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : aVar.invoke().longValue();
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i2;
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iHashCode = 0;
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
                        Object obj = objArr[i6];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ObjectLongMap$$ExternalSyntheticBackport0.m(jArr[i6]);
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
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        CharSequence charSequence5 = charSequence;
        x.f(charSequence5, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i3 - length;
                    int i6 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i8 = (i3 << 3) + i6;
                                c2 = '\b';
                                Object obj = objArr[i8];
                                long j3 = jArr2[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence5);
                                }
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                            charSequence5 = charSequence;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                charSequence5 = charSequence;
                jArr3 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j2 = jArr2[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = (~(i5 - length)) >>> 31;
                    int i8 = 0;
                    while (true) {
                        i3 = 8 - i7;
                        if (i8 >= i3) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = objArr[i9];
                            i4 = i5;
                            long j3 = jArr[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i4 = i5;
                        }
                        j2 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    int i10 = i5;
                    if (i3 != 8) {
                        break;
                    }
                    i2 = i10;
                } else {
                    i2 = i5;
                }
                if (i2 == length) {
                    break;
                }
                i5 = i2 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public /* synthetic */ ObjectLongMap(o oVar) {
        this();
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return getSize();
    }

    public final String joinToString(CharSequence charSequence) {
        x.f(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, null, 16, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        char c2;
        long j2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                } else {
                    int i5 = i3 - length;
                    int i6 = 0;
                    while (true) {
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j3) < 128) {
                                int i8 = (i3 << 3) + i6;
                                c2 = '\b';
                                Object obj = objArr[i8];
                                j2 = j3;
                                long j4 = jArr[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(obj);
                                sb.append('=');
                                sb.append(j4);
                                i4++;
                            } else {
                                c2 = '\b';
                                j2 = j3;
                            }
                            j3 = j2 >> c2;
                            i6++;
                        }
                    }
                }
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        CharSequence charSequence4 = charSequence;
        x.f(charSequence4, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i3 - length;
                    int i6 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i8 = (i3 << 3) + i6;
                                c2 = '\b';
                                Object obj = objArr[i8];
                                long j3 = jArr2[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence4);
                                }
                                if (i4 == i2) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                            charSequence4 = charSequence;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                charSequence4 = charSequence;
                jArr3 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                c2 = '\b';
                                Object obj = objArr[i7];
                                long j3 = jArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                c2 = '\b';
                                Object obj = objArr[i7];
                                long j3 = jArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                c2 = '\b';
                                Object obj = objArr[i7];
                                long j3 = jArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return objectLongMap.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final String joinToString(p<? super K, ? super Long, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr3;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                c2 = '\b';
                                Object obj = objArr[i7];
                                long j3 = jArr2[i7];
                                if (i3 != 0) {
                                    sb.append((CharSequence) str);
                                }
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(obj, Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr3 = jArr;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }
}

package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, p pVar, int i3, Object obj) {
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
        int[] iArr = intIntMap.keys;
        int[] iArr2 = intIntMap.values;
        long[] jArr3 = intIntMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j2 = jArr3[i6];
                int i8 = i6;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            jArr = jArr3;
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                int i13 = iArr[i12];
                                int i14 = iArr2[i12];
                                if (i7 != 0) {
                                    sb.append(charSequence5);
                                }
                                if (i7 == i5) {
                                    sb.append(charSequence8);
                                    break loop0;
                                }
                                i4 = i9;
                                Integer numValueOf = Integer.valueOf(i13);
                                jArr2 = jArr3;
                                sb.append((CharSequence) pVar.invoke(numValueOf, Integer.valueOf(i14)));
                                i7++;
                            } else {
                                jArr2 = jArr3;
                                i4 = i9;
                            }
                            j2 >>= i4;
                            i11++;
                            i9 = i4;
                            jArr3 = jArr2;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i8 == length) {
                    break;
                }
                i6 = i8 + 1;
                jArr3 = jArr;
            }
        }
        sb.append(charSequence7);
        return sb.toString();
    }

    public final boolean all(p<? super Integer, ? super Integer, Boolean> pVar) {
        x.f(pVar, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i4;
                            if (!pVar.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr2[i6])).booleanValue()) {
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

    public final boolean any(p<? super Integer, ? super Integer, Boolean> pVar) {
        x.f(pVar, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
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
                                if (pVar.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr2[i6])).booleanValue()) {
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

    public final boolean contains(int i2) {
        return containsKey(i2);
    }

    public final boolean containsKey(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public final boolean containsValue(int i2) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                } else {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128 && i2 == iArr[(i3 << 3) + i5]) {
                                return true;
                            }
                            j2 >>= 8;
                            i5++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int count(p<? super Integer, ? super Integer, Boolean> pVar) {
        int i2;
        x.f(pVar, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j2 = jArr[i3];
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
                        if (pVar.invoke(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr2[i7])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.IntIntMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.IntIntMap r1 = (androidx.collection.IntIntMap) r1
            int r3 = r1.getSize()
            int r5 = r0.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            int[] r3 = r0.keys
            int[] r5 = r0.values
            long[] r0 = r0.metadata
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6c
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
            if (r10 == 0) goto L67
            int r10 = r7 - r6
            r11 = r4
        L3a:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L65
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L61
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r5[r12]
            int r14 = r1.findKeyIndex(r14)
            if (r14 < 0) goto L60
            int[] r15 = r1.values
            r14 = r15[r14]
            if (r12 != r14) goto L60
            goto L61
        L60:
            return r4
        L61:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L3a
        L65:
            if (r12 != r13) goto L6c
        L67:
            if (r7 == r6) goto L6c
            int r7 = r7 + 1
            goto L27
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex(int i2) {
        int i3 = ScatterMapKt.MurmurHashC1 * i2;
        int i4 = this._capacity;
        int i5 = ((i3 ^ (i3 << 16)) >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j3 = j2 ^ ((r0 & 127) * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void forEach(p<? super Integer, ? super Integer, ab> pVar) {
        int i2;
        x.f(pVar, "block");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                        pVar.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr2[i6]));
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

    public final void forEachKey(l<? super Integer, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        int[] iArr = this.keys;
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
                        lVar.invoke(Integer.valueOf(iArr[(i3 << 3) + i5]));
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

    public final void forEachValue(l<? super Integer, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        int[] iArr = this.values;
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
                        lVar.invoke(Integer.valueOf(iArr[(i3 << 3) + i5]));
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

    public final int get(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + i2);
        }
        return this.values[iFindKeyIndex];
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getOrDefault(int i2, int i3) {
        int iFindKeyIndex = findKeyIndex(i2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : i3;
    }

    public final int getOrElse(int i2, a<Integer> aVar) {
        x.f(aVar, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
        return iFindKeyIndex < 0 ? aVar.invoke().intValue() : this.values[iFindKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i2;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j2 = jArr[i3];
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
                        i4 += iArr2[i7] ^ iArr[i7];
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

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i3 - length;
                    int i6 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i8 = (i3 << 3) + i6;
                                int i9 = iArr[i8];
                                int i10 = iArr2[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i9), Integer.valueOf(i10)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr2 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[PHI: r8
  0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.keys
            int[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6d
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r7 - r5
            r12 = r6
        L33:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L66
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L62
            int r13 = r7 << 3
            int r13 = r13 + r12
            r15 = r2[r13]
            r13 = r3[r13]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r13)
            int r8 = r8 + 1
            int r13 = r0._size
            if (r8 >= r13) goto L62
            java.lang.String r13 = ", "
            r1.append(r13)
        L62:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L33
        L66:
            if (r13 != r14) goto L6d
        L68:
            if (r7 == r5) goto L6d
            int r7 = r7 + 1
            goto L20
        L6d:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "toString(...)"
            h.g.b.x.e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.toString():java.lang.String");
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

    public /* synthetic */ IntIntMap(o oVar) {
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
        long[] jArr;
        long[] jArr2;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            jArr = jArr3;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                int i8 = (i3 << 3) + i6;
                                c2 = '\b';
                                int i9 = iArr[i8];
                                int i10 = iArr2[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                jArr2 = jArr3;
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(i9);
                                sb.append('=');
                                sb.append(i10);
                                i4++;
                            } else {
                                jArr2 = jArr3;
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                            jArr3 = jArr2;
                        }
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i3 - length;
                    int i6 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i8 = (i3 << 3) + i6;
                                int i9 = iArr[i8];
                                int i10 = iArr2[i8];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i4 == i2) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i9), Integer.valueOf(i10)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr2 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                int i8 = iArr[i7];
                                int i9 = iArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i8), Integer.valueOf(i9)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                int i8 = iArr[i7];
                                int i9 = iArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i8), Integer.valueOf(i9)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(charSequence, "separator");
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                int i8 = iArr[i7];
                                int i9 = iArr2[i7];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i8), Integer.valueOf(i9)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(p<? super Integer, ? super Integer, ? extends CharSequence> pVar) {
        long[] jArr;
        char c2;
        x.f(pVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        jArr = jArr2;
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                int i7 = (i2 << 3) + i5;
                                int i8 = iArr[i7];
                                int i9 = iArr2[i7];
                                if (i3 != 0) {
                                    sb.append((CharSequence) str);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(pVar.invoke(Integer.valueOf(i8), Integer.valueOf(i9)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                            jArr2 = jArr;
                        }
                    }
                } else {
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return intIntMap.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }
}

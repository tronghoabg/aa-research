package androidx.collection;

import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence6);
        long[] jArr = longSet.elements;
        long[] jArr2 = longSet.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j2 = jArr2[i6];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                } else {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            if ((j2 & 255) < 128) {
                                long j3 = jArr[(i6 << 3) + i10];
                                if (i7 != 0) {
                                    sb.append(charSequence5);
                                }
                                if (i7 == i5) {
                                    sb.append(charSequence8);
                                    break loop0;
                                }
                                i4 = i8;
                                sb.append((CharSequence) lVar.invoke(Long.valueOf(j3)));
                                i7++;
                            } else {
                                i4 = i8;
                            }
                            j2 >>= i4;
                            i10++;
                            i8 = i4;
                        }
                    }
                }
            }
        }
        sb.append(charSequence7);
        return sb.toString();
    }

    public final boolean all(l<? super Long, Boolean> lVar) {
        x.f(lVar, "predicate");
        long[] jArr = this.elements;
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
                        if ((255 & j2) < 128 && !lVar.invoke(Long.valueOf(jArr[(i2 << 3) + i4])).booleanValue()) {
                            return false;
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

    public final boolean any(l<? super Long, Boolean> lVar) {
        x.f(lVar, "predicate");
        long[] jArr = this.elements;
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
                            if ((255 & j2) < 128 && lVar.invoke(Long.valueOf(jArr[(i2 << 3) + i4])).booleanValue()) {
                                return true;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (((((~r6) << 6) & r6) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(long r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = androidx.collection.LongSet$$ExternalSyntheticBackport0.m(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0._capacity
            r2 = r2 & r3
            r5 = 0
        L13:
            r6 = r1 & 127(0x7f, float:1.78E-43)
            long[] r7 = r0.metadata
            r8 = r2 & 7
            int r9 = r2 >> 3
            r10 = r7[r9]
            int r8 = r8 << 3
            long r10 = r10 >>> r8
            r12 = 1
            int r9 = r9 + r12
            r13 = r7[r9]
            int r7 = 64 - r8
            long r13 = r13 << r7
            long r7 = (long) r8
            long r7 = -r7
            r15 = r5
            r9 = 0
            long r4 = (long) r6
            r6 = 63
            long r6 = r7 >> r6
            long r6 = r6 & r13
            long r6 = r6 | r10
            r10 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r10
            long r4 = r4 ^ r6
            r10 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r10 = r10 + r4
            long r4 = ~r4
            long r4 = r4 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r10
        L47:
            r13 = 0
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L65
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            int r8 = r8 >> 3
            int r8 = r8 + r2
            r8 = r8 & r3
            long[] r13 = r0.elements
            r16 = r13[r8]
            int r13 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r13 != 0) goto L60
            if (r8 < 0) goto L73
            return r12
        L60:
            r13 = -1
            long r13 = r13 + r4
            long r4 = r4 & r13
            goto L47
        L65:
            long r4 = ~r6
            r8 = 6
            long r4 = r4 << r8
            long r4 = r4 & r6
            long r4 = r4 & r10
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L73
            int r5 = r15 + 8
            int r2 = r2 + r5
            r2 = r2 & r3
            goto L13
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    public final int count(l<? super Long, Boolean> lVar) {
        int i2;
        x.f(lVar, "predicate");
        long[] jArr = this.elements;
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
                    if ((255 & j2) < 128 && lVar.invoke(Long.valueOf(jArr[(i3 << 3) + i6])).booleanValue()) {
                        i4++;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) obj;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
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
                            if ((255 & j2) < 128 && !longSet.contains(jArr[(i2 << 3) + i4])) {
                                return false;
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final int findElementIndex$collection(long j2) {
        int iM = LongSet$$ExternalSyntheticBackport0.m(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = this._capacity;
        int i3 = ((iM ^ (iM << 16)) >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j3 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j4 = j3 ^ ((r0 & 127) * ScatterMapKt.BitmaskLsb);
            for (long j5 = (~j4) & ((-72340172838076673L) + j4) & (-9187201950435737472L); j5 != 0; j5 &= (-1) + j5) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i3) & i2;
                if (this.elements[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final long first(l<? super Long, Boolean> lVar) {
        x.f(lVar, "predicate");
        long[] jArr = this.elements;
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
                                long j3 = jArr[(i2 << 3) + i4];
                                if (lVar.invoke(Long.valueOf(j3)).booleanValue()) {
                                    return j3;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final void forEach(l<? super Long, ab> lVar) {
        int i2;
        x.f(lVar, "block");
        long[] jArr = this.elements;
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

    public final void forEachIndex(l<? super Integer, ab> lVar) {
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

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i2;
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iM = 0;
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
                        iM += LongSet$$ExternalSyntheticBackport0.m(jArr[(i3 << 3) + i5]);
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return iM;
                }
            }
            if (i3 == length) {
                return iM;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
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
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i3 << 3) + i6];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public /* synthetic */ LongSet(o oVar) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final long first() {
        long[] jArr = this.elements;
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
                                return jArr[(i2 << 3) + i4];
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final int count() {
        return this._size;
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
        int i3;
        int i4;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j2 = jArr2[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i5 - length;
                    int i8 = 0;
                    while (true) {
                        int i9 = 8 - ((~i7) >>> 31);
                        if (i8 >= i9) {
                            int i10 = i5;
                            if (i9 != 8) {
                                break;
                            }
                            i3 = i10;
                        } else {
                            if ((j2 & 255) < 128) {
                                i4 = i5;
                                long j3 = jArr[(i5 << 3) + i8];
                                if (i6 != 0) {
                                    sb.append(charSequence);
                                }
                                if (i6 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                sb.append(j3);
                                i6++;
                            } else {
                                i4 = i5;
                            }
                            j2 >>= 8;
                            i8++;
                            i5 = i4;
                        }
                    }
                } else {
                    i3 = i5;
                }
                if (i3 == length) {
                    break;
                }
                i5 = i3 + 1;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
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
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i3 << 3) + i6];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i4 == i2) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i4++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i6++;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i2 << 3) + i5];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                        }
                    }
                }
            }
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i2 << 3) + i5];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                        }
                    }
                }
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i2 << 3) + i5];
                                if (i3 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                        }
                    }
                }
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return longSet.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final String joinToString(l<? super Long, ? extends CharSequence> lVar) {
        char c2;
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                } else {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                long j3 = jArr[(i2 << 3) + i5];
                                if (i3 != 0) {
                                    sb.append((CharSequence) str);
                                }
                                c2 = '\b';
                                if (i3 == -1) {
                                    sb.append((CharSequence) str);
                                    break loop0;
                                }
                                sb.append(lVar.invoke(Long.valueOf(j3)));
                                i3++;
                            } else {
                                c2 = '\b';
                            }
                            j2 >>= c2;
                            i5++;
                        }
                    }
                }
            }
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }
}

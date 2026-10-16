package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public long[] metadata;
    public Set<E> mutableSetWrapper;

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return scatterSet.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence5, lVar2);
    }

    static final CharSequence toString$lambda$0(ScatterSet scatterSet, Object obj) {
        return obj == scatterSet ? "(this)" : String.valueOf(obj);
    }

    public final boolean all(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
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
                        if ((255 & j2) < 128 && !lVar.invoke(objArr[(i2 << 3) + i4]).booleanValue()) {
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

    public final boolean any(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
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
                            if ((255 & j2) < 128 && lVar.invoke(objArr[(i2 << 3) + i4]).booleanValue()) {
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

    public final Set<E> asSet() {
        Set<E> set = this.mutableSetWrapper;
        if (set != null) {
            return set;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) this;
        MutableSetWrapper mutableSetWrapper = new MutableSetWrapper(mutableScatterSet);
        mutableScatterSet.mutableSetWrapper = mutableSetWrapper;
        return mutableSetWrapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0._capacity
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.metadata
            r9 = r5 & 7
            int r10 = r5 >> 3
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
            r16 = r3
            r10 = 0
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4e:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6e
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.elements
            r14 = r14[r9]
            boolean r14 = h.g.b.x.n(r14, r1)
            if (r14 == 0) goto L69
            if (r9 < 0) goto L7e
            return r13
        L69:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4e
        L6e:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L7e
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
    }

    public final int count(l<? super E, Boolean> lVar) {
        int i2;
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
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
                    if ((255 & j2) < 128 && lVar.invoke(objArr[(i3 << 3) + i6]).booleanValue()) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.elements;
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
                            if ((255 & j2) < 128 && !scatterSet.contains(objArr[(i2 << 3) + i4])) {
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

    public final int findElementIndex$collection(E e2) {
        int i2 = 0;
        int iHashCode = e2 != null ? e2.hashCode() : 0;
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
                if (x.n(this.elements[iNumberOfTrailingZeros], e2)) {
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

    /* JADX WARN: Type inference failed for: r8v8, types: [E, java.lang.Object] */
    public final E first(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
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
                                ?? r8 = (Object) objArr[(i2 << 3) + i4];
                                if (lVar.invoke(r8).booleanValue()) {
                                    return r8;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new e();
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [E, java.lang.Object] */
    public final E firstOrNull(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
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
                            ?? r8 = (Object) objArr[(i2 << 3) + i4];
                            if (lVar.invoke(r8).booleanValue()) {
                                return r8;
                            }
                        }
                        j2 >>= 8;
                        i4++;
                    } else if (i5 != 8) {
                        return null;
                    }
                }
            }
            if (i2 == length) {
                return null;
            }
            i2++;
        }
    }

    public final void forEach(l<? super E, ab> lVar) {
        int i2;
        x.f(lVar, "block");
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
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iHashCode = 0;
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
                        Object obj = objArr[(i3 << 3) + i5];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super E, ? extends CharSequence> lVar) {
        char c2;
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr[i3];
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
                                Object obj = objArr[(i3 << 3) + i6];
                                if (i4 != 0) {
                                    sb.append(charSequence);
                                }
                                c2 = '\b';
                                if (i4 == i2) {
                                    sb.append(charSequence4);
                                    break loop0;
                                }
                                if (lVar == null) {
                                    sb.append(obj);
                                } else {
                                    sb.append(lVar.invoke(obj));
                                }
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
        return joinToString$default(this, null, "[", "]", 0, null, new l() { // from class: androidx.collection.ScatterSet$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ScatterSet.toString$lambda$0(this.f$0, obj);
            }
        }, 25, null);
    }

    public /* synthetic */ ScatterSet(o oVar) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return getSize();
    }

    public final E first() {
        Object[] objArr = this.elements;
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
                                return (E) objArr[(i2 << 3) + i4];
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The ScatterSet is empty");
        throw new e();
    }

    public final String joinToString(CharSequence charSequence) {
        x.f(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, null, null, 48, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, charSequence4, null, 32, null);
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }
}

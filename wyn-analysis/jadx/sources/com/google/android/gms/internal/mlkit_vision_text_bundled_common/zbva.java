package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zbva extends zbsl implements RandomAccess, zbum {
    private static final zbva zba = new zbva(new long[0], 0, false);
    private long[] zbb;
    private int zbc;

    public zbva() {
        this(new long[10], 0, true);
    }

    public static zbva zbf() {
        return zba;
    }

    private final String zbh(int i5) {
        return v.e(i5, this.zbc, "Index:", ", Size:");
    }

    private final void zbi(int i5) {
        if (i5 < 0 || i5 >= this.zbc) {
            throw new IndexOutOfBoundsException(zbh(i5));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zba();
        if (i5 < 0 || i5 > (i10 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i5));
        }
        int i11 = i5 + 1;
        long[] jArr = this.zbb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i5, jArr, i11, i10 - i5);
        } else {
            long[] jArr2 = new long[M6.C(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            System.arraycopy(this.zbb, i5, jArr2, i11, this.zbc - i5);
            this.zbb = jArr2;
        }
        this.zbb[i5] = jLongValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbva)) {
            return super.addAll(collection);
        }
        zbva zbvaVar = (zbva) collection;
        int i5 = zbvaVar.zbc;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zbc;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        long[] jArr = this.zbb;
        if (i11 > jArr.length) {
            this.zbb = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zbvaVar.zbb, 0, this.zbb, this.zbc, zbvaVar.zbc);
        this.zbc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbva)) {
            return super.equals(obj);
        }
        zbva zbvaVar = (zbva) obj;
        if (this.zbc != zbvaVar.zbc) {
            return false;
        }
        long[] jArr = zbvaVar.zbb;
        for (int i5 = 0; i5 < this.zbc; i5++) {
            if (this.zbb[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zbi(i5);
        return Long.valueOf(this.zbb[i5]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zbc; i10++) {
            long j8 = this.zbb[i10];
            byte[] bArr = zbuo.zbb;
            i5 = (i5 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i5 = this.zbc;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zbb[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zba();
        zbi(i5);
        long[] jArr = this.zbb;
        long j8 = jArr[i5];
        if (i5 < this.zbc - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zba();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zbb;
        System.arraycopy(jArr, i10, jArr, i5, this.zbc - i10);
        this.zbc -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zba();
        zbi(i5);
        long[] jArr = this.zbb;
        long j8 = jArr[i5];
        jArr[i5] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i5) {
        if (i5 >= this.zbc) {
            return new zbva(Arrays.copyOf(this.zbb, i5), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zbe(int i5) {
        zbi(i5);
        return this.zbb[i5];
    }

    public final void zbg(long j8) {
        zba();
        int i5 = this.zbc;
        long[] jArr = this.zbb;
        if (i5 == jArr.length) {
            long[] jArr2 = new long[M6.C(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            this.zbb = jArr2;
        }
        long[] jArr3 = this.zbb;
        int i10 = this.zbc;
        this.zbc = i10 + 1;
        jArr3[i10] = j8;
    }

    private zbva(long[] jArr, int i5, boolean z2) {
        super(z2);
        this.zbb = jArr;
        this.zbc = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Long) obj).longValue());
        return true;
    }
}

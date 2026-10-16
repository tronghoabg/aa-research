package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zbug extends zbsl implements RandomAccess, zbul {
    private static final zbug zba = new zbug(new int[0], 0, false);
    private int[] zbb;
    private int zbc;

    public zbug() {
        this(new int[10], 0, true);
    }

    public static zbug zbf() {
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
        int iIntValue = ((Integer) obj).intValue();
        zba();
        if (i5 < 0 || i5 > (i10 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i5));
        }
        int i11 = i5 + 1;
        int[] iArr = this.zbb;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i5, iArr, i11, i10 - i5);
        } else {
            int[] iArr2 = new int[M6.C(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.zbb, i5, iArr2, i11, this.zbc - i5);
            this.zbb = iArr2;
        }
        this.zbb[i5] = iIntValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbug)) {
            return super.addAll(collection);
        }
        zbug zbugVar = (zbug) collection;
        int i5 = zbugVar.zbc;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zbc;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.zbb;
        if (i11 > iArr.length) {
            this.zbb = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zbugVar.zbb, 0, this.zbb, this.zbc, zbugVar.zbc);
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
        if (!(obj instanceof zbug)) {
            return super.equals(obj);
        }
        zbug zbugVar = (zbug) obj;
        if (this.zbc != zbugVar.zbc) {
            return false;
        }
        int[] iArr = zbugVar.zbb;
        for (int i5 = 0; i5 < this.zbc; i5++) {
            if (this.zbb[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zbi(i5);
        return Integer.valueOf(this.zbb[i5]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zbc; i10++) {
            i5 = (i5 * 31) + this.zbb[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i5 = this.zbc;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zbb[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zba();
        zbi(i5);
        int[] iArr = this.zbb;
        int i10 = iArr[i5];
        if (i5 < this.zbc - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zba();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zbb;
        System.arraycopy(iArr, i10, iArr, i5, this.zbc - i10);
        this.zbc -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zba();
        zbi(i5);
        int[] iArr = this.zbb;
        int i10 = iArr[i5];
        iArr[i5] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i5) {
        if (i5 >= this.zbc) {
            return new zbug(Arrays.copyOf(this.zbb, i5), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zbe(int i5) {
        zbi(i5);
        return this.zbb[i5];
    }

    public final void zbg(int i5) {
        zba();
        int i10 = this.zbc;
        int[] iArr = this.zbb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[M6.C(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zbb = iArr2;
        }
        int[] iArr3 = this.zbb;
        int i11 = this.zbc;
        this.zbc = i11 + 1;
        iArr3[i11] = i5;
    }

    private zbug(int[] iArr, int i5, boolean z2) {
        super(z2);
        this.zbb = iArr;
        this.zbc = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Integer) obj).intValue());
        return true;
    }
}

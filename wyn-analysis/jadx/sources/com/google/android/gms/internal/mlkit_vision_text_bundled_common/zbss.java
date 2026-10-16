package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zbss extends zbsl implements RandomAccess, zbun {
    private boolean[] zba;
    private int zbb;

    static {
        new zbss(new boolean[0], 0, false);
    }

    public zbss() {
        this(new boolean[10], 0, true);
    }

    private final String zbg(int i5) {
        return v.e(i5, this.zbb, "Index:", ", Size:");
    }

    private final void zbh(int i5) {
        if (i5 < 0 || i5 >= this.zbb) {
            throw new IndexOutOfBoundsException(zbg(i5));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zba();
        if (i5 < 0 || i5 > (i10 = this.zbb)) {
            throw new IndexOutOfBoundsException(zbg(i5));
        }
        int i11 = i5 + 1;
        boolean[] zArr = this.zba;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i5, zArr, i11, i10 - i5);
        } else {
            boolean[] zArr2 = new boolean[M6.C(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            System.arraycopy(this.zba, i5, zArr2, i11, this.zbb - i5);
            this.zba = zArr2;
        }
        this.zba[i5] = zBooleanValue;
        this.zbb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbss)) {
            return super.addAll(collection);
        }
        zbss zbssVar = (zbss) collection;
        int i5 = zbssVar.zbb;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zbb;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        boolean[] zArr = this.zba;
        if (i11 > zArr.length) {
            this.zba = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zbssVar.zba, 0, this.zba, this.zbb, zbssVar.zbb);
        this.zbb = i11;
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
        if (!(obj instanceof zbss)) {
            return super.equals(obj);
        }
        zbss zbssVar = (zbss) obj;
        if (this.zbb != zbssVar.zbb) {
            return false;
        }
        boolean[] zArr = zbssVar.zba;
        for (int i5 = 0; i5 < this.zbb; i5++) {
            if (this.zba[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zbh(i5);
        return Boolean.valueOf(this.zba[i5]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZba = 1;
        for (int i5 = 0; i5 < this.zbb; i5++) {
            iZba = (iZba * 31) + zbuo.zba(this.zba[i5]);
        }
        return iZba;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.zbb;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zba[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zba();
        zbh(i5);
        boolean[] zArr = this.zba;
        boolean z2 = zArr[i5];
        if (i5 < this.zbb - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.zbb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zba();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zba;
        System.arraycopy(zArr, i10, zArr, i5, this.zbb - i10);
        this.zbb -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zba();
        zbh(i5);
        boolean[] zArr = this.zba;
        boolean z2 = zArr[i5];
        zArr[i5] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i5) {
        if (i5 >= this.zbb) {
            return new zbss(Arrays.copyOf(this.zba, i5), this.zbb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zbe(boolean z2) {
        zba();
        int i5 = this.zbb;
        boolean[] zArr = this.zba;
        if (i5 == zArr.length) {
            boolean[] zArr2 = new boolean[M6.C(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            this.zba = zArr2;
        }
        boolean[] zArr3 = this.zba;
        int i10 = this.zbb;
        this.zbb = i10 + 1;
        zArr3[i10] = z2;
    }

    public final boolean zbf(int i5) {
        zbh(i5);
        return this.zba[i5];
    }

    private zbss(boolean[] zArr, int i5, boolean z2) {
        super(z2);
        this.zba = zArr;
        this.zbb = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbe(((Boolean) obj).booleanValue());
        return true;
    }
}

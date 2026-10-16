package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import Va.M6;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zbvv extends zbsl implements RandomAccess {
    private static final zbvv zba = new zbvv(new Object[0], 0, false);
    private Object[] zbb;
    private int zbc;

    public zbvv() {
        this(new Object[10], 0, true);
    }

    public static zbvv zbe() {
        return zba;
    }

    private final String zbf(int i5) {
        return v.e(i5, this.zbc, "Index:", ", Size:");
    }

    private final void zbg(int i5) {
        if (i5 < 0 || i5 >= this.zbc) {
            throw new IndexOutOfBoundsException(zbf(i5));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        zba();
        if (i5 < 0 || i5 > (i10 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbf(i5));
        }
        int i11 = i5 + 1;
        Object[] objArr = this.zbb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i5, objArr, i11, i10 - i5);
        } else {
            Object[] objArr2 = new Object[M6.C(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.zbb, i5, objArr2, i11, this.zbc - i5);
            this.zbb = objArr2;
        }
        this.zbb[i5] = obj;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zbg(i5);
        return this.zbb[i5];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zba();
        zbg(i5);
        Object[] objArr = this.zbb;
        Object obj = objArr[i5];
        if (i5 < this.zbc - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zba();
        zbg(i5);
        Object[] objArr = this.zbb;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i5) {
        if (i5 >= this.zbc) {
            return new zbvv(Arrays.copyOf(this.zbb, i5), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    private zbvv(Object[] objArr, int i5, boolean z2) {
        super(z2);
        this.zbb = objArr;
        this.zbc = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zba();
        int i5 = this.zbc;
        Object[] objArr = this.zbb;
        if (i5 == objArr.length) {
            this.zbb = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zbb;
        int i10 = this.zbc;
        this.zbc = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

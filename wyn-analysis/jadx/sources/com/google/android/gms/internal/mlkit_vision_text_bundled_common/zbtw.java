package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zbtw extends zbsl implements RandomAccess, zbuk {
    private static final zbtw zba = new zbtw(new float[0], 0, false);
    private float[] zbb;
    private int zbc;

    public zbtw() {
        this(new float[10], 0, true);
    }

    public static zbtw zbf() {
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
        float fFloatValue = ((Float) obj).floatValue();
        zba();
        if (i5 < 0 || i5 > (i10 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i5));
        }
        int i11 = i5 + 1;
        float[] fArr = this.zbb;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i5, fArr, i11, i10 - i5);
        } else {
            float[] fArr2 = new float[M6.C(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.zbb, i5, fArr2, i11, this.zbc - i5);
            this.zbb = fArr2;
        }
        this.zbb[i5] = fFloatValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbtw)) {
            return super.addAll(collection);
        }
        zbtw zbtwVar = (zbtw) collection;
        int i5 = zbtwVar.zbc;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zbc;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        float[] fArr = this.zbb;
        if (i11 > fArr.length) {
            this.zbb = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zbtwVar.zbb, 0, this.zbb, this.zbc, zbtwVar.zbc);
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
        if (!(obj instanceof zbtw)) {
            return super.equals(obj);
        }
        zbtw zbtwVar = (zbtw) obj;
        if (this.zbc != zbtwVar.zbc) {
            return false;
        }
        float[] fArr = zbtwVar.zbb;
        for (int i5 = 0; i5 < this.zbc; i5++) {
            if (Float.floatToIntBits(this.zbb[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zbi(i5);
        return Float.valueOf(this.zbb[i5]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i5 = 0; i5 < this.zbc; i5++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zbb[i5]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i5 = this.zbc;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zbb[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zba();
        zbi(i5);
        float[] fArr = this.zbb;
        float f10 = fArr[i5];
        if (i5 < this.zbc - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zba();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zbb;
        System.arraycopy(fArr, i10, fArr, i5, this.zbc - i10);
        this.zbc -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zba();
        zbi(i5);
        float[] fArr = this.zbb;
        float f10 = fArr[i5];
        fArr[i5] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i5) {
        if (i5 >= this.zbc) {
            return new zbtw(Arrays.copyOf(this.zbb, i5), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zbe(int i5) {
        zbi(i5);
        return this.zbb[i5];
    }

    public final void zbg(float f10) {
        zba();
        int i5 = this.zbc;
        float[] fArr = this.zbb;
        if (i5 == fArr.length) {
            float[] fArr2 = new float[M6.C(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.zbb = fArr2;
        }
        float[] fArr3 = this.zbb;
        int i10 = this.zbc;
        this.zbc = i10 + 1;
        fArr3[i10] = f10;
    }

    private zbtw(float[] fArr, int i5, boolean z2) {
        super(z2);
        this.zbb = fArr;
        this.zbc = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Float) obj).floatValue());
        return true;
    }
}

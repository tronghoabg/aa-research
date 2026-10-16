package com.google.android.recaptcha.internal;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzkk extends zzii implements RandomAccess, zzkz, zzmf {
    private float[] zza;
    private int zzb;

    static {
        new zzkk(new float[0], 0, false);
    }

    public zzkk() {
        this(new float[10], 0, true);
    }

    private final String zzg(int i5) {
        return v.e(i5, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i5) {
        if (i5 < 0 || i5 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
        int i11 = i5 + 1;
        float[] fArr = this.zza;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i5, fArr, i11, i10 - i5);
        } else {
            float[] fArr2 = new float[M6.C(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.zza, i5, fArr2, i11, this.zzb - i5);
            this.zza = fArr2;
        }
        this.zza[i5] = fFloatValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzkk)) {
            return super.addAll(collection);
        }
        zzkk zzkkVar = (zzkk) collection;
        int i5 = zzkkVar.zzb;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        float[] fArr = this.zza;
        if (i11 > fArr.length) {
            this.zza = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zzkkVar.zza, 0, this.zza, this.zzb, zzkkVar.zzb);
        this.zzb = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return super.equals(obj);
        }
        zzkk zzkkVar = (zzkk) obj;
        if (this.zzb != zzkkVar.zzb) {
            return false;
        }
        float[] fArr = zzkkVar.zza;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            if (Float.floatToIntBits(this.zza[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzh(i5);
        return Float.valueOf(this.zza[i5]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zza[i5]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i5 = this.zzb;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zza[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzh(i5);
        float[] fArr = this.zza;
        float f10 = fArr[i5];
        if (i5 < this.zzb - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zza();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zza;
        System.arraycopy(fArr, i10, fArr, i5, this.zzb - i10);
        this.zzb -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzh(i5);
        float[] fArr = this.zza;
        float f10 = fArr[i5];
        fArr[i5] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i5) {
        if (i5 >= this.zzb) {
            return new zzkk(Arrays.copyOf(this.zza, i5), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i5) {
        zzh(i5);
        return this.zza[i5];
    }

    public final void zzf(float f10) {
        zza();
        int i5 = this.zzb;
        float[] fArr = this.zza;
        if (i5 == fArr.length) {
            float[] fArr2 = new float[M6.C(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        fArr3[i10] = f10;
    }

    private zzkk(float[] fArr, int i5, boolean z2) {
        super(z2);
        this.zza = fArr;
        this.zzb = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}

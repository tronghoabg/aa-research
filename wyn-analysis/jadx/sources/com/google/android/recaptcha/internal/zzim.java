package com.google.android.recaptcha.internal;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzim extends zzii implements RandomAccess, zzkz, zzmf {
    private boolean[] zza;
    private int zzb;

    static {
        new zzim(new boolean[0], 0, false);
    }

    public zzim() {
        this(new boolean[10], 0, true);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
        int i11 = i5 + 1;
        boolean[] zArr = this.zza;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i5, zArr, i11, i10 - i5);
        } else {
            boolean[] zArr2 = new boolean[M6.C(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            System.arraycopy(this.zza, i5, zArr2, i11, this.zzb - i5);
            this.zza = zArr2;
        }
        this.zza[i5] = zBooleanValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzim)) {
            return super.addAll(collection);
        }
        zzim zzimVar = (zzim) collection;
        int i5 = zzimVar.zzb;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        boolean[] zArr = this.zza;
        if (i11 > zArr.length) {
            this.zza = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzimVar.zza, 0, this.zza, this.zzb, zzimVar.zzb);
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
        if (!(obj instanceof zzim)) {
            return super.equals(obj);
        }
        zzim zzimVar = (zzim) obj;
        if (this.zzb != zzimVar.zzb) {
            return false;
        }
        boolean[] zArr = zzimVar.zza;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            if (this.zza[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzh(i5);
        return Boolean.valueOf(this.zza[i5]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            iZza = (iZza * 31) + zzla.zza(this.zza[i5]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.zzb;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zza[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzh(i5);
        boolean[] zArr = this.zza;
        boolean z2 = zArr[i5];
        if (i5 < this.zzb - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zza();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zza;
        System.arraycopy(zArr, i10, zArr, i5, this.zzb - i10);
        this.zzb -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i5);
        boolean[] zArr = this.zza;
        boolean z2 = zArr[i5];
        zArr[i5] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i5) {
        if (i5 >= this.zzb) {
            return new zzim(Arrays.copyOf(this.zza, i5), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z2) {
        zza();
        int i5 = this.zzb;
        boolean[] zArr = this.zza;
        if (i5 == zArr.length) {
            boolean[] zArr2 = new boolean[M6.C(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        zArr3[i10] = z2;
    }

    public final boolean zzf(int i5) {
        zzh(i5);
        return this.zza[i5];
    }

    private zzim(boolean[] zArr, int i5, boolean z2) {
        super(z2);
        this.zza = zArr;
        this.zzb = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}

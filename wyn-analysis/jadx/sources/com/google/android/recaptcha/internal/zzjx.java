package com.google.android.recaptcha.internal;

import R8.v;
import Va.M6;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzjx extends zzii implements RandomAccess, zzkz, zzmf {
    private double[] zza;
    private int zzb;

    static {
        new zzjx(new double[0], 0, false);
    }

    public zzjx() {
        this(new double[10], 0, true);
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
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i5 < 0 || i5 > (i10 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i5));
        }
        int i11 = i5 + 1;
        double[] dArr = this.zza;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i5, dArr, i11, i10 - i5);
        } else {
            double[] dArr2 = new double[M6.C(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            System.arraycopy(this.zza, i5, dArr2, i11, this.zzb - i5);
            this.zza = dArr2;
        }
        this.zza[i5] = dDoubleValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzjx)) {
            return super.addAll(collection);
        }
        zzjx zzjxVar = (zzjx) collection;
        int i5 = zzjxVar.zzb;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzb;
        if (f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        double[] dArr = this.zza;
        if (i11 > dArr.length) {
            this.zza = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(zzjxVar.zza, 0, this.zza, this.zzb, zzjxVar.zzb);
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
        if (!(obj instanceof zzjx)) {
            return super.equals(obj);
        }
        zzjx zzjxVar = (zzjx) obj;
        if (this.zzb != zzjxVar.zzb) {
            return false;
        }
        double[] dArr = zzjxVar.zza;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            if (Double.doubleToLongBits(this.zza[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzh(i5);
        return Double.valueOf(this.zza[i5]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i10]);
            byte[] bArr = zzla.zzb;
            i5 = (i5 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i5 = this.zzb;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zza[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zza();
        zzh(i5);
        double[] dArr = this.zza;
        double d3 = dArr[i5];
        if (i5 < this.zzb - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zza();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zza;
        System.arraycopy(dArr, i10, dArr, i5, this.zzb - i10);
        this.zzb -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i5);
        double[] dArr = this.zza;
        double d3 = dArr[i5];
        dArr[i5] = dDoubleValue;
        return Double.valueOf(d3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i5) {
        if (i5 >= this.zzb) {
            return new zzjx(Arrays.copyOf(this.zza, i5), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i5) {
        zzh(i5);
        return this.zza[i5];
    }

    public final void zzf(double d3) {
        zza();
        int i5 = this.zzb;
        double[] dArr = this.zza;
        if (i5 == dArr.length) {
            double[] dArr2 = new double[M6.C(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        dArr3[i10] = d3;
    }

    private zzjx(double[] dArr, int i5, boolean z2) {
        super(z2);
        this.zza = dArr;
        this.zzb = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}

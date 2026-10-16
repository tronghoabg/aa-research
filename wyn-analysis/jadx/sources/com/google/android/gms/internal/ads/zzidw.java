package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzidw extends zzicx implements RandomAccess, zzies, zzigi {
    private static final double[] zza;
    private static final zzidw zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzidw(dArr, 0, false);
    }

    public zzidw() {
        this(zza, 0, true);
    }

    public static zzidw zzd() {
        return zzb;
    }

    private static int zzj(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final void zzk(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
    }

    private final String zzl(int i5) {
        int i10 = this.zzd;
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdW();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
        int i11 = i5 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i10 < length) {
            System.arraycopy(dArr, i5, dArr, i11, i10 - i5);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i5);
            System.arraycopy(this.zzc, i5, dArr2, i11, this.zzd - i5);
            this.zzc = dArr2;
        }
        this.zzc[i5] = dDoubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof zzidw)) {
            return super.addAll(collection);
        }
        zzidw zzidwVar = (zzidw) collection;
        int i5 = zzidwVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        double[] dArr = this.zzc;
        if (i11 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(zzidwVar.zzc, 0, this.zzc, this.zzd, zzidwVar.zzd);
        this.zzd = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzidw)) {
            return super.equals(obj);
        }
        zzidw zzidwVar = (zzidw) obj;
        if (this.zzd != zzidwVar.zzd) {
            return false;
        }
        double[] dArr = zzidwVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (Double.doubleToLongBits(this.zzc[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzk(i5);
        return Double.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzc[i10]);
            byte[] bArr = zzifc.zza;
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
        int i5 = this.zzd;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zzc[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdW();
        zzk(i5);
        double[] dArr = this.zzc;
        double d3 = dArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zzdW();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i10, dArr, i5, this.zzd - i10);
        this.zzd -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdW();
        zzk(i5);
        double[] dArr = this.zzc;
        double d3 = dArr[i5];
        dArr[i5] = dDoubleValue;
        return Double.valueOf(d3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzies zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzidw(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzf(int i5) {
        zzk(i5);
        return this.zzc[i5];
    }

    public final void zzg(double d3) {
        zzdW();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        dArr2[i10] = d3;
    }

    public final void zzi(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzidw(double[] dArr, int i5, boolean z2) {
        super(z2);
        this.zzc = dArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}

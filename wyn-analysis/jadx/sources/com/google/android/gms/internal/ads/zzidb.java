package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzidb extends zzicx implements RandomAccess, zzier, zzigi {
    private static final boolean[] zza;
    private static final zzidb zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzidb(zArr, 0, false);
    }

    public zzidb() {
        this(zza, 0, true);
    }

    public static zzidb zzd() {
        return zzb;
    }

    private static int zzi(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final void zzj(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i5));
        }
    }

    private final String zzk(int i5) {
        int i10 = this.zzd;
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdW();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i5));
        }
        int i11 = i5 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i5, zArr, i11, i10 - i5);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i5);
            System.arraycopy(this.zzc, i5, zArr2, i11, this.zzd - i5);
            this.zzc = zArr2;
        }
        this.zzc[i5] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof zzidb)) {
            return super.addAll(collection);
        }
        zzidb zzidbVar = (zzidb) collection;
        int i5 = zzidbVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        boolean[] zArr = this.zzc;
        if (i11 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzidbVar.zzc, 0, this.zzc, this.zzd, zzidbVar.zzd);
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
        if (!(obj instanceof zzidb)) {
            return super.equals(obj);
        }
        zzidb zzidbVar = (zzidb) obj;
        if (this.zzd != zzidbVar.zzd) {
            return false;
        }
        boolean[] zArr = zzidbVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (this.zzc[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzj(i5);
        return Boolean.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            iZzb = (iZzb * 31) + zzifc.zzb(this.zzc[i5]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.zzd;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zzc[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdW();
        zzj(i5);
        boolean[] zArr = this.zzc;
        boolean z2 = zArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zzdW();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i10, zArr, i5, this.zzd - i10);
        this.zzd -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdW();
        zzj(i5);
        boolean[] zArr = this.zzc;
        boolean z2 = zArr[i5];
        zArr[i5] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzier zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzidb(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i5) {
        zzj(i5);
        return this.zzc[i5];
    }

    public final void zzg(boolean z2) {
        zzdW();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        zArr2[i10] = z2;
    }

    private zzidb(boolean[] zArr, int i5, boolean z2) {
        super(z2);
        this.zzc = zArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}

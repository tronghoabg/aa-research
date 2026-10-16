package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzigk extends zzicx implements RandomAccess {
    private static final Object[] zza;
    private static final zzigk zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzigk(objArr, 0, false);
    }

    public zzigk() {
        this(zza, 0, true);
    }

    public static zzigk zzd() {
        return zzb;
    }

    private static int zzf(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
    }

    private final String zzi(int i5) {
        int i10 = this.zzd;
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        zzdW();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
        int i11 = i5 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i5, objArr, i11, i10 - i5);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i5);
            System.arraycopy(this.zzc, i5, objArr2, i11, this.zzd - i5);
            this.zzc = objArr2;
        }
        this.zzc[i5] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i5 = this.zzd;
        if (i5 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzigk)) {
            for (int i10 = 0; i10 < i5; i10++) {
                if (!this.zzc[i10].equals(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        zzigk zzigkVar = (zzigk) obj;
        for (int i11 = 0; i11 < i5; i11++) {
            if (!this.zzc[i11].equals(zzigkVar.zzc[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zzg(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = this.zzd;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i5; i10++) {
            iHashCode = (iHashCode * 31) + this.zzc[i10].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zzdW();
        zzg(i5);
        Object[] objArr = this.zzc;
        Object obj = objArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zzdW();
        zzg(i5);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    public final /* bridge */ /* synthetic */ zzifb zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzigk(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzigk(Object[] objArr, int i5, boolean z2) {
        super(z2);
        this.zzc = objArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdW();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

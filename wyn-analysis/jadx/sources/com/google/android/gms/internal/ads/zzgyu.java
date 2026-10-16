package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgyu extends zzgxd {
    static final zzgyu zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgyu(objArr, 0, objArr, 0, 0);
    }

    public zzgyu(Object[] objArr, int i5, Object[] objArr2, int i10, int i11) {
        this.zzb = objArr;
        this.zze = i5;
        this.zzc = objArr2;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzgwm.zzb(obj);
                while (true) {
                    int i5 = iZzb & this.zzf;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i5 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* renamed from: zza */
    public final zzgzh iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg(Object[] objArr, int i5) {
        Object[] objArr2 = this.zzb;
        int i10 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, i5, i10);
        return i5 + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final boolean zzr() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final zzgwt zzs() {
        return zzgwt.zzt(this.zzb, this.zzg);
    }
}

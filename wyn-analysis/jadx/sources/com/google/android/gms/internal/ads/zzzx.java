package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class zzzx implements zzabb {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzzx(zzbg zzbgVar, int[] iArr, int i5) {
        int length = iArr.length;
        zzgtr.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.zzd[i10] = zzbgVar.zza(iArr[i10]);
        }
        Arrays.sort(this.zzd, zzzw.zza);
        this.zzc = new int[this.zzb];
        for (int i11 = 0; i11 < this.zzb; i11++) {
            this.zzc[i11] = zzbgVar.zzb(this.zzd[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzx zzzxVar = (zzzx) obj;
            if (this.zza.equals(zzzxVar.zza) && Arrays.equals(this.zzc, zzzxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zze;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final zzv zzb(int i5) {
        return this.zzd[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzf(int i5) {
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzg(int i5) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zzc[i10] == i5) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzh() {
        return this.zzc[0];
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class zznq {
    private final zzs zza;
    private final SparseArray zzb;

    public zznq(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i5 = 0; i5 < zzsVar.zzb(); i5++) {
            int iZzc = zzsVar.zzc(i5);
            zznp zznpVar = (zznp) sparseArray.get(iZzc);
            zznpVar.getClass();
            sparseArray2.append(iZzc, zznpVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznp zza(int i5) {
        zznp zznpVar = (zznp) this.zzb.get(i5);
        zznpVar.getClass();
        return zznpVar;
    }

    public final boolean zzb(int i5) {
        return this.zza.zza(i5);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i5) {
        return this.zza.zzc(i5);
    }
}

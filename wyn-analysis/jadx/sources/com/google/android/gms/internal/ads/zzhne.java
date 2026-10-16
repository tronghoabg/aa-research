package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzhne {
    private static final zzhne zza = (zzhne) zzhoj.zza(zzhnd.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhoh(new zzhoe(), null));

    public static zzhne zza() {
        return zza;
    }

    public final synchronized void zzb(zzhmh zzhmhVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.zza(zzhmhVar);
        atomicReference.set(new zzhoh(zzhoeVar, null));
    }

    public final synchronized void zzc(zzhme zzhmeVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.zzb(zzhmeVar);
        atomicReference.set(new zzhoh(zzhoeVar, null));
    }

    public final synchronized void zzd(zzhnl zzhnlVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.zzc(zzhnlVar);
        atomicReference.set(new zzhoh(zzhoeVar, null));
    }

    public final synchronized void zze(zzhni zzhniVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhoe zzhoeVar = new zzhoe((zzhoh) atomicReference.get());
        zzhoeVar.zzd(zzhniVar);
        atomicReference.set(new zzhoh(zzhoeVar, null));
    }

    public final boolean zzf(zzhod zzhodVar) {
        return ((zzhoh) this.zzb.get()).zza(zzhodVar);
    }

    public final zzhdz zzg(zzhod zzhodVar, zzhey zzheyVar) throws GeneralSecurityException {
        return ((zzhoh) this.zzb.get()).zzb(zzhodVar, zzheyVar);
    }

    public final zzhod zzh(zzhdz zzhdzVar, Class cls, zzhey zzheyVar) throws GeneralSecurityException {
        return ((zzhoh) this.zzb.get()).zzc(zzhdzVar, cls, zzheyVar);
    }

    public final boolean zzi(zzhod zzhodVar) {
        return ((zzhoh) this.zzb.get()).zzd(zzhodVar);
    }

    public final zzheq zzj(zzhod zzhodVar) throws GeneralSecurityException {
        return ((zzhoh) this.zzb.get()).zze(zzhodVar);
    }

    public final zzhod zzk(zzheq zzheqVar, Class cls) throws GeneralSecurityException {
        return ((zzhoh) this.zzb.get()).zzf(zzheqVar, cls);
    }
}

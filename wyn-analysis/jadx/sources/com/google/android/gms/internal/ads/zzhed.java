package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhed {
    private boolean zza;
    private final zzheq zzc;
    private final zzheb zzb = zzheb.zza;
    private zzhee zzd = null;
    private zzhef zze = null;

    public /* synthetic */ zzhed(zzheq zzheqVar, byte[] bArr) {
        this.zzc = zzheqVar;
    }

    public final zzhed zza() {
        zzhef zzhefVar = this.zze;
        if (zzhefVar != null) {
            zzhefVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhed zzb() {
        this.zzd = zzhee.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z2) {
        this.zza = false;
    }

    public final /* synthetic */ zzheb zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzheq zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzhee zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzhef zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzhef zzhefVar) {
        this.zze = zzhefVar;
    }
}

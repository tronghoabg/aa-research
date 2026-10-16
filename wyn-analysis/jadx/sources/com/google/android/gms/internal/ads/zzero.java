package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzero implements zzema {
    private final zzbjs zza;
    private final zzhcp zzb;
    private final zzfps zzc;
    private final zzerx zzd;

    public zzero(zzfps zzfpsVar, zzhcp zzhcpVar, zzbjs zzbjsVar, zzerx zzerxVar) {
        this.zzc = zzfpsVar;
        this.zzb = zzhcpVar;
        this.zza = zzbjsVar;
        this.zzd = zzerxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar;
        return (this.zza == null || (zzfksVar = zzfknVar.zzs) == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzcgd zzcgdVar = new zzcgd();
        zzert zzertVar = new zzert();
        zzertVar.zzd(new zzerm(this, zzcgdVar, zzfkyVar, zzfknVar, zzertVar));
        zzfks zzfksVar = zzfknVar.zzs;
        final zzbjn zzbjnVar = new zzbjn(zzertVar, zzfksVar.zzb, zzfksVar.zza);
        zzfpm zzfpmVar = zzfpm.CUSTOM_RENDER_SYN;
        zzfps zzfpsVar = this.zzc;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zzd(new zzfoy() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbjnVar);
            }
        }, this.zzb, zzfpmVar, zzfpsVar).zzj(zzfpm.CUSTOM_RENDER_ACK).zze(zzcgdVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbjn zzbjnVar) throws RemoteException {
        this.zza.zze(zzbjnVar);
    }

    public final /* synthetic */ zzerx zzd() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzerj implements zzema {
    private final Context zza;
    private final zzcwx zzb;
    private final zzbjs zzc;
    private final zzhcp zzd;
    private final zzfps zze;

    public zzerj(Context context, zzcwx zzcwxVar, zzfps zzfpsVar, zzhcp zzhcpVar, zzbjs zzbjsVar) {
        this.zza = context;
        this.zzb = zzcwxVar;
        this.zze = zzfpsVar;
        this.zzd = zzhcpVar;
        this.zzc = zzbjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar;
        return (this.zzc == null || (zzfksVar = zzfknVar.zzs) == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzerf zzerfVar = new zzerf(this, new View(this.zza), null, zzerh.zza, (zzfko) zzfknVar.zzu.get(0));
        zzcvt zzcvtVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, null), zzerfVar);
        zzeri zzeriVarZzl = zzcvtVarZzf.zzl();
        zzfks zzfksVar = zzfknVar.zzs;
        final zzbjn zzbjnVar = new zzbjn(zzeriVarZzl, zzfksVar.zzb, zzfksVar.zza);
        zzfpm zzfpmVar = zzfpm.CUSTOM_RENDER_SYN;
        zzfps zzfpsVar = this.zze;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zzd(new zzfoy() { // from class: com.google.android.gms.internal.ads.zzerg
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbjnVar);
            }
        }, this.zzd, zzfpmVar, zzfpsVar).zzj(zzfpm.CUSTOM_RENDER_ACK).zze(zzhcf.zza(zzcvtVarZzf.zzi())).zzi();
    }

    public final /* synthetic */ void zzc(zzbjn zzbjnVar) throws RemoteException {
        this.zzc.zze(zzbjnVar);
    }
}

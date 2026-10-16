package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdvf {
    private final C6.a zzb;
    private final Context zzc;
    private final zzdzt zzd;
    private final Executor zze;
    private final zzbaw zzf;
    private final H6.a zzg;
    private final zzeko zzi;
    private final zzfsm zzj;
    private final zzekz zzk;
    private final zzflk zzl;
    private p8.p zzm;
    private final zzdut zza = new zzdut();
    private final zzbqo zzh = new zzbqo();

    public zzdvf(zzdvd zzdvdVar) {
        this.zzc = zzdvdVar.zzb();
        this.zze = zzdvdVar.zze();
        this.zzf = zzdvdVar.zzf();
        this.zzg = zzdvdVar.zzg();
        this.zzb = zzdvdVar.zza();
        this.zzi = zzdvdVar.zzd();
        this.zzj = zzdvdVar.zzh();
        this.zzd = zzdvdVar.zzc();
        this.zzk = zzdvdVar.zzi();
        this.zzl = zzdvdVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzeN);
        zzbaw zzbawVar = this.zzf;
        C6.a aVar = this.zzb;
        zzekz zzekzVar = this.zzk;
        p8.p pVarZzk = zzhcf.zzk(zzclr.zzb(this.zzc, this.zzg, str, zzbawVar, aVar, zzekzVar, this.zzl, this.zzd), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdvc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzclb zzclbVar = (zzclb) obj;
                this.zza.zzi(zzclbVar);
                return zzclbVar;
            }
        }, this.zze);
        this.zzm = pVarZzk;
        zzcgb.zza(pVarZzk, "NativeJavascriptExecutor.initializeEngine", zzcfy.zzh);
    }

    public final synchronized void zzb() {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return;
        }
        zzhcf.zzr(pVar, new zzduu(this), this.zze);
        this.zzm = null;
    }

    public final synchronized p8.p zzc(final String str, final JSONObject jSONObject) {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return zzhcf.zza(null);
        }
        return zzhcf.zzj(pVar, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdvb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzclb) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbpx zzbpxVar) {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return;
        }
        zzhcf.zzr(pVar, new zzduv(this, str, zzbpxVar), this.zze);
    }

    public final synchronized void zze(String str, zzbpx zzbpxVar) {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return;
        }
        zzhcf.zzr(pVar, new zzduw(this, str, zzbpxVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return;
        }
        zzhcf.zzr(pVar, new zzdux(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        p8.p pVar = this.zzm;
        if (pVar == null) {
            return;
        }
        zzhcf.zzr(pVar, new zzduy(this, zzfknVar, zzfkqVar, zzctqVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbpx zzbpxVar) {
        zzd(str, new zzdve(this, weakReference, str, zzbpxVar, null));
    }

    public final /* synthetic */ zzclb zzi(zzclb zzclbVar) {
        zzclbVar.zzab("/result", this.zzh);
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        C6.b bVar = new C6.b(this.zzc, null);
        zzeko zzekoVar = this.zzi;
        zzfsm zzfsmVar = this.zzj;
        zzdzt zzdztVar = this.zzd;
        zzdut zzdutVar = this.zza;
        zzcmzVarZzP.zzab(null, zzdutVar, zzdutVar, zzdutVar, zzdutVar, false, null, bVar, null, null, zzekoVar, zzfsmVar, zzdztVar, null, null, null, null, null, null, null, null, null);
        return zzclbVar;
    }

    public final /* synthetic */ p8.p zzj(String str, JSONObject jSONObject, zzclb zzclbVar) {
        return this.zzh.zzc(zzclbVar, str, jSONObject);
    }

    public final /* synthetic */ zzdut zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdzt zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzeko zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfsm zzn() {
        return this.zzj;
    }
}

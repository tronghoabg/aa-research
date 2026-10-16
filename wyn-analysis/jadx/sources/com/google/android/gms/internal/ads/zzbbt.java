package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbbt implements zzfzk {
    private final zzfxs zza;
    private final zzfyg zzb;
    private final zzbcg zzc;
    private final zzbbs zzd;
    private final zzbbc zze;
    private final zzbci zzf;
    private final zzbca zzg;
    private final zzbbr zzh;

    public zzbbt(zzfxs zzfxsVar, zzfyg zzfygVar, zzbcg zzbcgVar, zzbbs zzbbsVar, zzbbc zzbbcVar, zzbci zzbciVar, zzbca zzbcaVar, zzbbr zzbbrVar) {
        this.zza = zzfxsVar;
        this.zzb = zzfygVar;
        this.zzc = zzbcgVar;
        this.zzd = zzbbsVar;
        this.zze = zzbbcVar;
        this.zzf = zzbciVar;
        this.zzg = zzbcaVar;
        this.zzh = zzbbrVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfxs zzfxsVar = this.zza;
        zzayt zzaytVarZzb = this.zzb.zzb();
        map.put("v", zzfxsVar.zza());
        map.put("gms", Boolean.valueOf(zzfxsVar.zzc()));
        map.put("gv", Long.valueOf(zzaytVarZzb.zzd()));
        map.put("int", zzaytVarZzb.zzb());
        map.put("attts", Long.valueOf(zzaytVarZzb.zzh().zzb()));
        map.put("att", zzaytVarZzb.zzh().zzd());
        map.put("attkid", zzaytVarZzb.zzh().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzbca zzbcaVar = this.zzg;
        map.put("tcq", Long.valueOf(zzbcaVar.zze()));
        map.put("tpq", Long.valueOf(zzbcaVar.zzd()));
        map.put("tcv", Long.valueOf(zzbcaVar.zzf()));
        map.put("tpv", Long.valueOf(zzbcaVar.zzg()));
        map.put("tchv", Long.valueOf(zzbcaVar.zzi()));
        map.put("tphv", Long.valueOf(zzbcaVar.zzh()));
        map.put("tcc", Long.valueOf(zzbcaVar.zzj()));
        map.put("tpc", Long.valueOf(zzbcaVar.zzk()));
        zzbbc zzbbcVar = this.zze;
        if (zzbbcVar != null) {
            map.put("nt", Long.valueOf(zzbbcVar.zzc()));
        }
        zzbci zzbciVar = this.zzf;
        map.put("vs", Long.valueOf(zzbciVar.zzc()));
        map.put("vf", Long.valueOf(zzbciVar.zzd()));
        return map;
    }

    public final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzc() {
        Map mapZzf = zzf();
        mapZzf.put("vst", this.zzh.zzb());
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzd() {
        zzbcg zzbcgVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzbcgVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}

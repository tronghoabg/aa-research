package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzflr {
    public static zzbpx zza(final zzeko zzekoVar, final zzfsm zzfsmVar, final zzctq zzctqVar, final zzdlg zzdlgVar) {
        return new zzbpx() { // from class: com.google.android.gms.internal.ads.zzflq
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclb zzclbVar = (zzclb) obj;
                zzbpw.zzc(map, zzdlgVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("URL missing from click GMSG.");
                } else {
                    zzeko zzekoVar2 = zzekoVar;
                    zzfsm zzfsmVar2 = zzfsmVar;
                    zzhcf.zzr(zzbpw.zza(zzclbVar, str), new zzflo(zzclbVar, zzctqVar, zzfsmVar2, zzekoVar2), zzcfy.zza);
                }
            }
        };
    }

    public static zzbpx zzb(final zzeko zzekoVar, final zzfsm zzfsmVar) {
        return new zzbpx() { // from class: com.google.android.gms.internal.ads.zzflp
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final void zza(Object obj, Map map) {
                zzcks zzcksVar = (zzcks) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfkn zzfknVarZzC = zzcksVar.zzC();
                if (zzfknVarZzC != null && !zzfknVarZzC.zzai) {
                    zzfsmVar.zzb(str, zzfknVarZzC.zzax, null, null);
                    return;
                }
                zzfkq zzfkqVarZzaC = ((zzcmi) zzcksVar).zzaC();
                if (zzfkqVarZzaC == null) {
                    C6.n.f1857D.f1868h.zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                } else {
                    zzeko zzekoVar2 = zzekoVar;
                    C6.n.f1857D.k.getClass();
                    zzekoVar2.zze(new zzekq(System.currentTimeMillis(), zzfkqVarZzaC.zzb, str, 2));
                }
            }
        };
    }
}

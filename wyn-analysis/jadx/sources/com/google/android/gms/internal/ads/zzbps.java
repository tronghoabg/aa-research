package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.Map;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbps implements zzbpx {
    static final /* synthetic */ zzbps zza = new zzbps();

    private /* synthetic */ zzbps() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzg)).booleanValue() && str.isEmpty()) {
            int i10 = G6.L.f4523b;
            H6.l.f("URL is empty from httpTrack GMSG.");
        } else {
            zzcks zzcksVar = (zzcks) zzcmnVar;
            new G6.B(zzcmnVar.getContext(), ((zzcmv) zzcmnVar).zzs().f4927a, str, zzcksVar.zzC() != null ? zzcksVar.zzC().zzax : null).zzb();
        }
    }
}

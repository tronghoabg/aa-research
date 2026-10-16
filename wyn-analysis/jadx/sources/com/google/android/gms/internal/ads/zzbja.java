package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zzbja {
    private final String zza = (String) zzbkr.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbja(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        linkedHashMap.put("device", U.O());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        U u11 = nVar.f1863c;
        boolean zF = U.f(context);
        String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        linkedHashMap.put("is_lite_sdk", true != zF ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        Future futureZza = nVar.f1875p.zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbo) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbo) futureZza.get()).zzk));
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "CsiConfiguration.CsiConfiguration");
        }
        zzbio zzbioVar = zzbix.zzmW;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            Map map = this.zzb;
            U u12 = C6.n.f1857D.f1863c;
            map.put("is_bstar", true != U.d(context) ? "0" : str2);
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkW)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzdl)).booleanValue()) {
                C6.n nVar2 = C6.n.f1857D;
                if (zzgui.zzc(nVar2.f1868h.zzv())) {
                    return;
                }
                this.zzb.put("plugin", nVar2.f1868h.zzv());
            }
        }
    }

    public final String zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        return this.zzb;
    }
}

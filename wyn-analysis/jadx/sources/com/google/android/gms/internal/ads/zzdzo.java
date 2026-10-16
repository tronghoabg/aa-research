package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzdzo {
    private final ConcurrentHashMap zza;
    private final zzcfp zzb;
    private final zzflg zzc;
    private final String zzd;
    private final String zze;
    private final zzbaw zzf;
    private final M6.d zzg;
    private final Bundle zzh = new Bundle();
    private final Context zzi;

    public zzdzo(Context context, zzdzy zzdzyVar, zzcfp zzcfpVar, zzflg zzflgVar, String str, String str2, zzbaw zzbawVar, M6.d dVar) {
        ActivityManager.MemoryInfo memoryInfoI;
        ConcurrentHashMap concurrentHashMapZzd = zzdzyVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzcfpVar;
        this.zzc = zzflgVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzbawVar;
        this.zzg = dVar;
        this.zzi = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzi();
        zzbio zzbioVar = zzbix.zzcS;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbiv zzbivVar = c0395s.f2492c;
        if (zBooleanValue) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(C6.n.f1857D.f1868h.zzm()));
            if (((Boolean) zzbivVar.zzd(zzbix.zzdb)).booleanValue() && (memoryInfoI = H6.f.i(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoI.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoI.totalMem));
                zzd("low_m", true != memoryInfoI.lowMemory ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzdi)).booleanValue()) {
            zzd("ad_unit_id", zzflgVar.zzg);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzdc)).booleanValue()) {
            zzd("mem_tier", ((M6.a) dVar.f7525c.get()).name());
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzdd)).booleanValue()) {
            zzd("proc_tier", ((M6.c) dVar.f7527e.get()).name());
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzhZ)).booleanValue()) {
            int iB0 = AbstractC3772b.b0(zzflgVar) - 1;
            if (iB0 == 0) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("scar", "false");
                return;
            }
            if (iB0 == 1) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            } else if (iB0 == 2) {
                concurrentHashMapZzd.put("se", "r_adinfo");
            } else if (iB0 != 3) {
                concurrentHashMapZzd.put("se", "r_both");
            } else {
                concurrentHashMapZzd.put("se", "r_adstring");
            }
            concurrentHashMapZzd.put("scar", "true");
            zzd("ragent", zzflgVar.zzd.f2518p);
            zzd("rtype", AbstractC3772b.X(AbstractC3772b.Y(zzflgVar.zzd)));
        }
    }

    public final void zza(zzfky zzfkyVar) {
        zzfkx zzfkxVar = zzfkyVar.zzb;
        List list = zzfkxVar.zza;
        if (!list.isEmpty()) {
            int i5 = ((zzfkn) list.get(0)).zzb;
            zzd("ad_format", zzfkn.zza(i5));
            if (i5 == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcU)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfkxVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final synchronized Bundle zze() {
        return this.zzh;
    }

    public final synchronized void zzf(String str, long j8) {
        this.zzh.putLong(str, j8);
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzh.putAll(bundle);
    }

    public final void zzh() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoX)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }

    public final void zzi() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlc)).booleanValue()) {
            zzbar zzbarVarZzb = this.zzf.zzb();
            if (!(zzbarVarZzb instanceof C6.f)) {
                if (zzbarVarZzb instanceof zzcnp) {
                    this.zza.put("asv", ((zzcnp) zzbarVarZzb).zza());
                    return;
                } else {
                    this.zza.put("asv", "NA");
                    return;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.zza;
            int i5 = ((C6.f) zzbarVarZzb).f1830o;
            int i10 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            concurrentHashMap.put("asv", i10 != 0 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }
}

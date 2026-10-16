package com.google.android.gms.internal.ads;

import A7.N0;
import D6.C0395s;
import D6.K0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import n7.AbstractC3598c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdza implements zzdgf, zzden, zzddc, zzdls {
    private final zzdzo zza;
    private final zzdzy zzb;
    private final Context zzc;

    public zzdza(zzdzo zzdzoVar, zzdzy zzdzyVar, Context context) {
        this.zza = zzdzoVar;
        this.zzb = zzdzyVar;
        this.zzc = context;
    }

    private final void zzc(Bundle bundle, zzgwt zzgwtVar) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() || bundle == null) {
            return;
        }
        String strZza = zzdzc.PUBLIC_API_CALLBACK.zza();
        C6.n.f1857D.k.getClass();
        bundle.putLong(strZza, System.currentTimeMillis());
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzh();
        if (bundle.containsKey("ls")) {
            zzdzoVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        int size = zzgwtVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzdzd zzdzdVar = (zzdzd) zzgwtVar.get(i5);
            long j8 = bundle.getLong(zzdzdVar.zzb().zza(), -1L);
            long j10 = bundle.getLong(zzdzdVar.zzc().zza(), -1L);
            if (j8 > 0 && j10 > 0) {
                zzdzoVar.zzd(zzdzdVar.zza(), String.valueOf(j10 - j8));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j8 = bundle.getLong(str);
            if (j8 >= 0) {
                this.zza.zzd(str, String.valueOf(j8));
            }
        }
    }

    private final void zzh() {
        List historicalProcessExitReasons;
        if (((Boolean) zzbld.zzd.zze()).booleanValue() || C6.n.f1857D.f1868h.zze(true) || !AbstractC3598c.i()) {
            return;
        }
        String str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzlg);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.zzc;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = N0.e(historicalProcessExitReasons.get(0)).getReason();
            for (String str2 : zzgug.zza(zzgtf.zzd(',')).zze(zzgtf.zzc()).zzd().zzf(str)) {
                try {
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb2.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb2.append(str2);
                    G6.L.k(sb2.toString());
                }
                if (Integer.parseInt(str2) == reason) {
                    zzdzy zzdzyVar = this.zzb;
                    Map mapZza = zzdzyVar.zza();
                    mapZza.put(HandleInvocationsFromAdViewer.KEY_ACTION, "aei");
                    mapZza.put("aeir", String.valueOf(reason));
                    zzdzyVar.zzf(mapZza);
                    return;
                }
            }
        } catch (NoClassDefFoundError e7) {
            e = e7;
            C6.n.f1857D.f1868h.zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        } catch (NoSuchMethodError e10) {
            e = e10;
            C6.n.f1857D.f1868h.zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        } catch (RuntimeException e11) {
            e = e11;
            C6.n.f1857D.f1868h.zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(N6.s sVar) {
        String str;
        zzbio zzbioVar = zzbix.zzhZ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (sVar == null) {
                zzdzo zzdzoVar = this.zza;
                zzdzoVar.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgs");
                zzdzoVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdzoVar.zzc());
                return;
            }
            zzcbk zzcbkVar = sVar.f8542c;
            if (zzcbkVar != null) {
                zzc(zzcbkVar.zzm, zzdzd.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(sVar.f8541b);
                zzdzo zzdzoVar2 = this.zza;
                zzdzoVar2.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgs");
                Map mapZzc = zzdzoVar2.zzc();
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzln)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getBoolean("accept_3p_cookie") ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0";
                    } catch (JSONException e7) {
                        int i5 = G6.L.f4523b;
                        H6.l.d("Error retrieving JSONObject from the requestJson, ", e7);
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                if (zzcbkVar != null) {
                    this.zza.zzb(zzcbkVar.zza);
                }
                zzdzo zzdzoVar3 = this.zza;
                zzdzoVar3.zzi();
                this.zzb.zzb(zzdzoVar3.zzc());
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlf)).booleanValue()) {
                    zzh();
                }
            } catch (JSONException unused) {
                zzdzo zzdzoVar4 = this.zza;
                zzdzoVar4.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgf");
                zzdzoVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdzoVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(K0 k02) {
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "ftl");
        zzdzoVar.zzd("ftl", String.valueOf(k02.f2338a));
        zzdzoVar.zzd("ed", k02.f2340c);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzio)).booleanValue()) {
            zzdzoVar.zzd("emsg", k02.f2339b);
        }
        zzdzoVar.zzi();
        this.zzb.zzb(zzdzoVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        this.zza.zzb(zzcbkVar.zza);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzle)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        this.zza.zza(zzfkyVar);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzld)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhZ)).booleanValue()) {
            zzdzo zzdzoVar = this.zza;
            zzdzoVar.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "sgf");
            zzdzoVar.zzd("sgf_reason", str);
            zzdzoVar.zzi();
            this.zzb.zzb(zzdzoVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzc().put(HandleInvocationsFromAdViewer.KEY_ACTION, "loaded");
        zzc(zzdzoVar.zze(), zzdzd.zzb);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoo)).booleanValue()) {
            zzdzoVar.zzc().put("mafe", true != com.moloco.sdk.internal.publisher.H.b0("MUTE_AUDIO") ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        zzdzoVar.zzi();
        this.zzb.zzb(zzdzoVar.zzc());
    }
}

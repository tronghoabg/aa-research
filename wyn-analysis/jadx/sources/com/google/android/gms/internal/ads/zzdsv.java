package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import Va.M6;
import android.content.res.Resources;
import android.os.Bundle;
import cb.AbstractC1593a;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.wynauto.wyn.R;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdsv {
    private final zzhcp zza;
    private final zzdtk zzb;
    private final zzdtp zzc;
    private final zzdzo zzd;

    public zzdsv(zzhcp zzhcpVar, zzdtk zzdtkVar, zzdtp zzdtpVar, zzdzo zzdzoVar) {
        this.zza = zzhcpVar;
        this.zzb = zzdtkVar;
        this.zzc = zzdtpVar;
        this.zzd = zzdzoVar;
    }

    private final p8.p zze(p8.p pVar, zzdzc zzdzcVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            zzhcf.zzr(pVar, new zzdss(this, zzdzcVar), this.zza);
        }
        return pVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza(final com.google.android.gms.internal.ads.zzfky r15, final com.google.android.gms.internal.ads.zzfkn r16, final org.json.JSONObject r17, C6.b r18, com.google.android.gms.internal.ads.zzcdu r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsv.zza(com.google.android.gms.internal.ads.zzfky, com.google.android.gms.internal.ads.zzfkn, org.json.JSONObject, C6.b, com.google.android.gms.internal.ads.zzcdu):p8.p");
    }

    public final zzdqb zzb(zzfky zzfkyVar, zzfkn zzfknVar, JSONObject jSONObject) throws zzepp {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzd, zzdzc.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdqb zzdqbVar = new zzdqb();
        zzdqbVar.zza(jSONObject.optInt("template_id", -1));
        zzdqbVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdqbVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzflg zzflgVar = zzfkyVar.zza.zza;
        if (!zzflgVar.zzh.contains(Integer.toString(zzdqbVar.zzx()))) {
            int iZzx = zzdqbVar.zzx();
            throw new zzepp(1, N0.a.d(iZzx, "Invalid template ID: ", new StringBuilder(String.valueOf(iZzx).length() + 21)));
        }
        if (zzdqbVar.zzx() == 3) {
            if (zzdqbVar.zzS() == null) {
                throw new zzepp(1, "No custom template id for custom template ad response.");
            }
            if (!zzflgVar.zzi.contains(zzdqbVar.zzS())) {
                throw new zzepp(1, "Unexpected custom template id in the response.");
            }
        }
        zzdqbVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfknVar.zzM) {
            C6.n nVar = C6.n.f1857D;
            U u10 = nVar.f1863c;
            Resources resourcesZzg = nVar.f1868h.zzg();
            String string = resourcesZzg != null ? resourcesZzg.getString(R.string.f33917s7) : "Test Ad";
            strOptString = M6.t(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString).length()), string, " : ", strOptString);
        }
        zzdqbVar.zzs("headline", strOptString);
        zzdqbVar.zzs("body", jSONObject.optString("body", null));
        zzdqbVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdqbVar.zzs("store", jSONObject.optString("store", null));
        zzdqbVar.zzs(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, null));
        zzdqbVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdqbVar;
    }

    public final zzdqb zzc(p8.p pVar, p8.p pVar2, p8.p pVar3, p8.p pVar4, p8.p pVar5, JSONObject jSONObject, p8.p pVar6, p8.p pVar7, p8.p pVar8, p8.p pVar9, p8.p pVar10) {
        zzbio zzbioVar = zzbix.zzcU;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzd, zzdzc.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdqb zzdqbVar = (zzdqb) pVar.get();
        zzdqbVar.zzd((List) pVar2.get());
        zzdqbVar.zzj((zzbml) pVar3.get());
        zzdqbVar.zzk((zzbml) pVar4.get());
        zzdqbVar.zzc((zzbme) pVar5.get());
        zzdqbVar.zze(zzdtk.zzl(jSONObject));
        zzdqbVar.zzf(zzdtk.zzk(jSONObject));
        zzclb zzclbVar = (zzclb) pVar6.get();
        if (zzclbVar != null) {
            zzdqbVar.zzm(zzclbVar);
            zzdqbVar.zzg(zzclbVar.zzE());
            zzdqbVar.zzb(zzclbVar.zzh());
        }
        zzdqbVar.zzH().putAll((Bundle) pVar7.get());
        zzclb zzclbVar2 = (zzclb) pVar8.get();
        if (zzclbVar2 != null) {
            zzdqbVar.zzn(zzclbVar2);
            zzdqbVar.zzh(zzclbVar2.zzE());
        }
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzgx)).booleanValue() || zzf(jSONObject)) {
            zzclb zzclbVar3 = (zzclb) pVar9.get();
            if (zzclbVar3 != null) {
                zzdqbVar.zzo(zzclbVar3);
            }
        } else {
            zzdqbVar.zzp(pVar9);
            zzdqbVar.zzr(new zzcgd());
        }
        for (zzdtm zzdtmVar : (List) pVar10.get()) {
            if (zzdtmVar.zza != 1) {
                zzdqbVar.zzt(zzdtmVar.zzb, zzdtmVar.zzd);
            } else {
                zzdqbVar.zzs(zzdtmVar.zzb, zzdtmVar.zzc);
            }
        }
        return zzdqbVar;
    }

    public final /* synthetic */ zzdzo zzd() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import D6.v1;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zzepa implements zzema {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        return !TextUtils.isEmpty(zzfknVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(zzfky zzfkyVar, zzfkn zzfknVar) {
        JSONObject jSONObject = zzfknVar.zzv;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzflg zzflgVar = zzfkyVar.zza.zza;
        zzflf zzflfVar = new zzflf();
        zzflfVar.zzA(zzflgVar);
        zzflfVar.zzg(strOptString);
        zzflfVar.zzy(true);
        v1 v1Var = zzflgVar.zzd;
        Bundle bundleZzd = zzd(v1Var.f2515m);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfknVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzflfVar.zza(new v1(v1Var.f2504a, v1Var.f2505b, bundleZzd2, v1Var.f2507d, v1Var.f2508e, v1Var.f2509f, v1Var.f2510g, v1Var.f2511h, v1Var.f2512i, v1Var.f2513j, v1Var.k, v1Var.f2514l, bundleZzd, v1Var.f2516n, v1Var.f2517o, v1Var.f2518p, v1Var.f2519q, v1Var.f2520r, v1Var.f2521s, v1Var.f2522t, v1Var.f2523u, v1Var.f2524v, v1Var.f2525w, v1Var.f2526x, v1Var.f2527y, v1Var.f2528z, v1Var.f2501A, v1Var.f2502B));
        zzflfVar.zzz(zzfknVar.zzaH);
        zzflg zzflgVarZzB = zzflfVar.zzB();
        Bundle bundle = new Bundle();
        zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfkqVar.zza));
        bundle2.putInt("refresh_interval", zzfkqVar.zzc);
        bundle2.putString("gws_query_id", zzfkqVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        Bundle bundleB = AbstractC3256n.b("initial_ad_unit_id", zzflgVar.zzg);
        bundleB.putString("allocation_id", zzfknVar.zzw);
        bundleB.putString("ad_source_name", zzfknVar.zzF);
        bundleB.putStringArrayList("click_urls", new ArrayList<>(zzfknVar.zzc));
        bundleB.putStringArrayList("imp_urls", new ArrayList<>(zzfknVar.zzd));
        bundleB.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfknVar.zzp));
        bundleB.putStringArrayList("fill_urls", new ArrayList<>(zzfknVar.zzm));
        bundleB.putStringArrayList("video_start_urls", new ArrayList<>(zzfknVar.zzg));
        bundleB.putStringArrayList("video_reward_urls", new ArrayList<>(zzfknVar.zzh));
        bundleB.putStringArrayList("video_complete_urls", new ArrayList<>(zzfknVar.zzi));
        bundleB.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfknVar.zzj);
        bundleB.putString("valid_from_timestamp", zzfknVar.zzk);
        bundleB.putBoolean("is_closable_area_disabled", zzfknVar.zzP);
        bundleB.putString("recursive_server_response_data", zzfknVar.zzao);
        bundleB.putBoolean("is_analytics_logging_enabled", zzfknVar.zzW);
        zzcci zzcciVar = zzfknVar.zzl;
        if (zzcciVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("rb_amount", zzcciVar.zzb);
            bundle3.putString("rb_type", zzcciVar.zza);
            bundleB.putParcelableArray("rewards", new Bundle[]{bundle3});
        }
        bundle.putBundle("parent_ad_config", bundleB);
        return zzc(zzflgVarZzB, bundle, zzfknVar, zzfkyVar);
    }

    public abstract p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar);
}

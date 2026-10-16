package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.P0;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x6.C4476g;
import y6.C4564a;

/* loaded from: classes3.dex */
public final class zzbql implements zzbpx {
    private final zzedw zza;

    public zzbql(zzedw zzedwVar) {
        this.zza = zzedwVar;
    }

    private static final Bundle zzb(Map map) throws JSONException {
        Bundle bundleB = AbstractC3256n.b("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundleB.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundleB.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundleB.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundleB.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundleB.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundleB.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundleB;
    }

    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
            return arrayList;
        } catch (JSONException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        C4476g c4476g;
        AdSize adSize;
        zzbio zzbioVar = zzbix.zzkT;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzedx zzedxVar = new zzedx();
            String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                zzedxVar.zzh(str);
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzedxVar.zzi(str2);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkV)).booleanValue()) {
                boolean z2 = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                    z2 = true;
                }
                zzedxVar.zzn(z2);
                if (zzedxVar.zzg()) {
                    C4564a c4564a = new C4564a(14);
                    if (map.containsKey("keywords")) {
                        Iterator it = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            c4564a.w((String) it.next());
                        }
                    }
                    c4564a.x(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c4564a.t(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e7) {
                            C6.n.f1857D.f1868h.zzh(e7, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        c4564a.T((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        c4564a.U(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        c4564a.V((String) map.get("requestAgent"));
                    }
                    boolean zContainsKey = map.containsKey("publisherProvidedId");
                    P0 p02 = (P0) c4564a.f421a;
                    if (zContainsKey) {
                        p02.f2352i = (String) map.get("publisherProvidedId");
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = zzc((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            p02.f2349f.add((String) it2.next());
                        }
                    }
                    c4476g = new y6.b(c4564a);
                } else {
                    AdRequest$Builder adRequest$Builder = new AdRequest$Builder(14);
                    if (map.containsKey("keywords")) {
                        Iterator it3 = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            adRequest$Builder.w((String) it3.next());
                        }
                    }
                    adRequest$Builder.x(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                adRequest$Builder.t(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e10) {
                            C6.n.f1857D.f1868h.zzh(e10, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        adRequest$Builder.T((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        adRequest$Builder.U(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        adRequest$Builder.V((String) map.get("requestAgent"));
                    }
                    c4476g = new C4476g(adRequest$Builder);
                }
                zzedxVar.zzj(c4476g);
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    adSize = AdSize.f26288i;
                } else {
                    try {
                        adSize = new AdSize(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e11) {
                        C6.n.f1857D.f1868h.zzh(e11, "OutOfContextTestingGmsgHandler.generateAdSize");
                        adSize = AdSize.f26288i;
                    }
                }
                zzedxVar.zzk(adSize);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    E4.j jVar = new E4.j();
                    if (map.containsKey("startMuted")) {
                        jVar.f2896a = ((String) map.get("startMuted")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    if (map.containsKey("customControlsRequested")) {
                        jVar.f2897b = ((String) map.get("customControlsRequested")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        jVar.f2898c = ((String) map.get("clickToExpandRequested")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    zzedxVar.zzm(new x6.w(jVar));
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzedxVar.zzf() != null && zzedxVar.zzb().equals("NATIVE"))) {
                    com.google.android.gms.ads.nativead.f fVar = new com.google.android.gms.ads.nativead.f();
                    if (map.containsKey("disableImageLoading")) {
                        fVar.f26337a = ((String) map.get("disableImageLoading")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                fVar.f26338b = Integer.parseInt(str5);
                            } catch (NumberFormatException e12) {
                                C6.n.f1857D.f1868h.zzh(e12, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        fVar.f26339c = ((String) map.get("shouldRequestMultipleImages")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                fVar.f26341e = Integer.parseInt(str6);
                            } catch (NumberFormatException e13) {
                                C6.n.f1857D.f1868h.zzh(e13, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        fVar.f26342f = ((String) map.get("customMuteThisAdRequested")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    x6.w wVarZzf = zzedxVar.zzf();
                    if (wVarZzf != null) {
                        fVar.f26340d = wVarZzf;
                    }
                    zzedxVar.zzl(new com.google.android.gms.ads.nativead.g(fVar));
                }
            }
            String str7 = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(zzedxVar.zza())) {
                return;
            }
            if (str7.equals("load") && !TextUtils.isEmpty(zzedxVar.zzb())) {
                this.zza.zzc(zzedxVar);
            } else if (str7.equals("show")) {
                this.zza.zzd(zzedxVar.zza());
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzese {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzese(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject jSONObjectZzg;
        if (!((Boolean) zzbld.zzg.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcB)).booleanValue() && (jSONObjectZzg = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzg()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("signal_adapters");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        Bundle bundleZzp = zzp(jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzesi(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzp));
                        }
                    }
                } catch (JSONException e7) {
                    G6.L.l("Malformed config loading JSON.", e7);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzg;
        try {
            if (!((Boolean) zzbld.zzb.zze()).booleanValue()) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcC)).booleanValue() && (jSONObjectZzg = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzg()) != null) {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("adapter_settings");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                zzesi zzesiVar = new zzesi(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.zzd.put(strOptString, zzesiVar);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.zze.put(strOptString, zzesiVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e7) {
            G6.L.l("Malformed config loading JSON.", e7);
        } finally {
        }
    }

    private final synchronized void zzl() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzg = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzg();
            if (jSONObjectZzg != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzg.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i5);
                            String lowerCase = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmA)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.addAll(zzm(jSONArrayOptJSONArray.getJSONObject(i10), strOptString));
                                }
                            }
                            zzn(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e7) {
                    G6.L.l("Malformed config loading JSON.", e7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzp = zzp(jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i5, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str2 = (String) arrayList2.get(i10);
                        zze(str2);
                        if (((zzesg) this.zza.get(str2)) != null) {
                            arrayList.add(new zzesg(str2, str, bundleZzp));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList = (List) map2.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map2.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzgww zzo(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzd())) {
                zzbio zzbioVar = zzbix.zzem;
                C0395s c0395s = C0395s.f2489e;
                boolean zMatches = Pattern.matches((String) c0395s.f2492c.zzd(zzbioVar), str);
                boolean zMatches2 = Pattern.matches((String) c0395s.f2492c.zzd(zzbix.zzen), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzgww.zzc(map);
            }
            return zzgww.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle zzp(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        G6.N nZzp = C6.n.f1857D.f1868h.zzp();
        ((G6.O) nZzp).f4533c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        });
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzd())) {
            return zzgww.zza();
        }
        return zzgww.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzesg> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdxr.zza(this.zzg, str2, str);
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmA)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzesg zzesgVar : list) {
                        String str3 = zzesgVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzesgVar.zzb);
                    }
                    return zzgww.zzc(map2);
                }
            }
            return zzgww.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap map;
        try {
            Map mapZzc = zzc(str, str2);
            zzgww zzgwwVarZzo = zzo(str2);
            map = new HashMap();
            for (Map.Entry entry : mapZzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzgwwVarZzo.containsKey(str3)) {
                    zzesi zzesiVar = (zzesi) zzgwwVarZzo.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzesi(str3, zzesiVar.zzb, zzesiVar.zzc, zzesiVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgzh it = zzgwwVarZzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzesi) entry2.getValue()).zzd) {
                    map.put(str4, (zzesi) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzesg(str, "", new Bundle()));
            }
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }
}

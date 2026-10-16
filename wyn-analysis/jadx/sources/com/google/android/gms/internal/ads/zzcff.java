package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcff {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzcff(String str, long j8) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new JSONObject(str);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznp)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i5 = G6.L.f4523b;
                H6.l.f("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.zzb.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(strOptString2, new zzbvd(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                    this.zza.add(jSONArrayOptJSONArray3.optString(i11));
                }
            }
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhV)).booleanValue() && (jSONObjectOptJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    this.zzi.add(jSONArrayOptJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhq)).booleanValue() || (jSONObjectOptJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e7) {
            int i13 = G6.L.f4523b;
            H6.l.g("Exception occurred while processing app setting json", e7);
            C6.n.f1857D.f1868h.zzh(e7, "AppSettings.parseAppSettingsJson");
        }
    }

    private final boolean zzl() {
        if (TextUtils.isEmpty(this.zze) || this.zzg == null) {
            return true;
        }
        long jZzm = zzm();
        C6.n.f1857D.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzm < 0) {
            return true;
        }
        long j8 = this.zzf;
        return j8 <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j8) <= jZzm;
    }

    private final long zzm() {
        zzbio zzbioVar = zzbix.zzns;
        C0395s c0395s = C0395s.f2489e;
        return (!((Boolean) c0395s.f2492c.zzd(zzbix.zznr)).booleanValue() || TextUtils.isEmpty(this.zze)) ? ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue() : this.zzg.optLong("cache_ttl_sec", ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue());
    }

    public final void zza(long j8) {
        this.zzf = j8;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zzd;
    }

    public final Map zzf() {
        return this.zzc;
    }

    public final JSONObject zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        if (zzl()) {
            return false;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfk)).booleanValue()) {
            C6.n nVar = C6.n.f1857D;
            zzdzt zzdztVarZzw = nVar.f1868h.zzw();
            if (zzdztVarZzw != null) {
                zzdzs zzdzsVarZza = zzdztVarZzw.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "cld_reset");
                zzdzsVarZza.zzc("cld_lut_ms", String.valueOf(this.zzf));
                nVar.k.getClass();
                zzdzsVarZza.zzc("event_timestamp", String.valueOf(System.currentTimeMillis()));
                zzdzsVarZza.zzc("cld_ttl_sec", String.valueOf(zzm()));
                zzdzsVarZza.zzd();
            }
        }
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd = "";
        this.zze = "";
        this.zzg = null;
        this.zzh = false;
        this.zzi.clear();
        this.zzj = false;
        return true;
    }

    public final int zzk() {
        if (TextUtils.isEmpty(this.zze) || this.zzg == null) {
            return 3;
        }
        return zzl() ? 1 : 2;
    }
}

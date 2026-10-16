package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdqf extends zzdqg {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdqf(zzfkn zzfknVar, JSONObject jSONObject) {
        super(zzfknVar);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectG0 = Fe.e.g0(jSONObject, strArr);
        this.zzb = jSONObjectG0 == null ? null : jSONObjectG0.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectG02 = Fe.e.g0(jSONObject, strArr2);
        this.zzc = jSONObjectG02 == null ? false : jSONObjectG02.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectG03 = Fe.e.g0(jSONObject, strArr3);
        this.zzd = jSONObjectG03 == null ? false : jSONObjectG03.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectG04 = Fe.e.g0(jSONObject, strArr4);
        this.zze = jSONObjectG04 == null ? false : jSONObjectG04.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectG05 = Fe.e.g0(jSONObject, strArr5);
        this.zzg = jSONObjectG05 != null ? jSONObjectG05.optString(strArr5[0], "") : "";
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final boolean zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    public final zzflj zzg() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzflj(jSONObject) : this.zza.zzV;
    }
}

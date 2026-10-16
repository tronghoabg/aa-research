package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzags {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzahp zze;

    private zzags(String str, String str2, String str3, long j8, zzahp zzahpVar) {
        if (!TextUtils.isEmpty(str) && zzahpVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        AbstractC1732v.f(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j8;
        this.zze = zzahpVar;
    }

    private static long zza(String str) {
        try {
            return zzane.zza(zzane.zza(str));
        } catch (ParseException e7) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e7);
            return 0L;
        }
    }

    public final zzahp zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzags zza(JSONObject jSONObject) {
        zzags zzagsVar = new zzags(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzahp() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzagsVar;
    }

    public static List<zzags> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(zza(jSONArray.getJSONObject(i5)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}

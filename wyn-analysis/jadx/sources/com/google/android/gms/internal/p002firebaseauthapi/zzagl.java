package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import n7.AbstractC3601f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagl extends AbstractC2614a implements zzadt<zzagl> {
    public static final Parcelable.Creator<zzagl> CREATOR = new zzago();
    private static final String zza = "zzagl";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzagl() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagl zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC3601f.a(jSONObject.optString("refresh_token"));
            this.zzc = AbstractC3601f.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = AbstractC3601f.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.a0(parcel, 3, this.zzc, false);
        AbstractC1304a.Y(parcel, 4, Long.valueOf(zza()));
        AbstractC1304a.a0(parcel, 5, this.zze, false);
        Long l10 = this.zzf;
        l10.getClass();
        AbstractC1304a.Y(parcel, 6, l10);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzh(e7);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }

    public static zzagl zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagl zzaglVar = new zzagl();
            zzaglVar.zzb = jSONObject.optString("refresh_token", null);
            zzaglVar.zzc = jSONObject.optString("access_token", null);
            zzaglVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzaglVar.zze = jSONObject.optString("token_type", null);
            zzaglVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzaglVar;
        } catch (JSONException e7) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzh(e7);
        }
    }

    public final void zzc(String str) {
        AbstractC1732v.f(str);
        this.zzb = str;
    }

    public zzagl(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzagl(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }
}

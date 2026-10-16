package com.google.android.gms.internal.p002firebaseauthapi;

import K8.L;
import N0.a;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import f7.AbstractC2614a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahr extends AbstractC2614a implements zzadq {
    public static final Parcelable.Creator<zzahr> CREATOR = new zzahu();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzahr() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.zza, false);
        AbstractC1304a.a0(parcel, 3, this.zzb, false);
        AbstractC1304a.a0(parcel, 4, this.zzc, false);
        AbstractC1304a.a0(parcel, 5, this.zzd, false);
        AbstractC1304a.a0(parcel, 6, this.zze, false);
        AbstractC1304a.a0(parcel, 7, this.zzf, false);
        AbstractC1304a.a0(parcel, 8, this.zzg, false);
        AbstractC1304a.a0(parcel, 9, this.zzh, false);
        boolean z2 = this.zzi;
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzj;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC1304a.a0(parcel, 12, this.zzk, false);
        AbstractC1304a.a0(parcel, 13, this.zzl, false);
        AbstractC1304a.a0(parcel, 14, this.zzm, false);
        AbstractC1304a.a0(parcel, 15, this.zzn, false);
        boolean z11 = this.zzo;
        AbstractC1304a.k0(parcel, 16, 4);
        parcel.writeInt(z11 ? 1 : 0);
        AbstractC1304a.a0(parcel, 17, this.zzp, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final zzahr zza(boolean z2) {
        this.zzj = false;
        return this;
    }

    public final zzahr zzb(boolean z2) {
        this.zzo = true;
        return this;
    }

    public final zzahr zzc(boolean z2) {
        this.zzi = true;
        return this;
    }

    public final zzahr zza(String str) {
        AbstractC1732v.f(str);
        this.zzb = str;
        return this;
    }

    public final zzahr zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put(JsonStorageKeyNames.SESSION_ID_KEY, this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzahr(L l10, String str) {
        AbstractC1732v.i(l10);
        String str2 = l10.f6595a;
        AbstractC1732v.f(str2);
        this.zzl = str2;
        AbstractC1732v.f(str);
        this.zzm = str;
        String str3 = l10.f6597c;
        AbstractC1732v.f(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        AbstractC1732v.f(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            a.r(sb2, "nonce=", str9, "&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z10, String str9, String str10, String str11, String str12, boolean z11, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z2;
        this.zzj = z10;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z11;
        this.zzp = str13;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import J8.I;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.List;
import n7.AbstractC3601f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaht implements zzadt<zzaht> {
    private static final String zza = "zzaht";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzags> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final I zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        AbstractC1732v.g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new I(str, str2, str3, null, str4, str5, null);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzags> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaht zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = AbstractC3601f.a(jSONObject.optString("idToken", null));
            this.zzd = AbstractC3601f.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            AbstractC3601f.a(jSONObject.optString("localId", null));
            this.zzf = AbstractC3601f.a(jSONObject.optString("email", null));
            AbstractC3601f.a(jSONObject.optString("displayName", null));
            AbstractC3601f.a(jSONObject.optString("photoUrl", null));
            this.zzg = AbstractC3601f.a(jSONObject.optString("providerId", null));
            this.zzh = AbstractC3601f.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = AbstractC3601f.a(jSONObject.optString("errorMessage", null));
            this.zzn = AbstractC3601f.a(jSONObject.optString("pendingToken", null));
            this.zzo = AbstractC3601f.a(jSONObject.optString("tenantId", null));
            this.zzp = zzags.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = AbstractC3601f.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = AbstractC3601f.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }
}

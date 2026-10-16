package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0628c;
import J8.C0630e;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafn implements zzadq {
    private static final String zza = "zzafn";
    private final String zzb;
    private final String zzc;
    private final C0630e zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        for (int i5 = 2; i5 <= 7 && !Log.isLoggable(zza, i5); i5++) {
        }
    }

    public zzafn(C0630e c0630e, String str, String str2) {
        AbstractC1732v.i(c0630e);
        this.zzd = c0630e;
        String str3 = c0630e.f5798a;
        AbstractC1732v.f(str3);
        this.zzb = str3;
        String str4 = c0630e.f5800c;
        AbstractC1732v.f(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        C0628c c0628c;
        String str = this.zzc;
        zzap zzapVar = C0628c.f5794d;
        AbstractC1732v.f(str);
        try {
            c0628c = new C0628c(str);
        } catch (IllegalArgumentException unused) {
            c0628c = null;
        }
        String str2 = c0628c != null ? c0628c.f5795a : null;
        String str3 = c0628c != null ? c0628c.f5797c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzaid.zza(jSONObject, "captchaResp", str5);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0630e zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}

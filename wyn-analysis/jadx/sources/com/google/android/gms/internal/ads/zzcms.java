package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcms {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!zzb.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String zzb(zzfkn zzfknVar) throws JSONException {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgt)).booleanValue() && zzfknVar.zzT) {
            zzflj zzfljVar = zzfknVar.zzV;
            if (zzfljVar.zzb() && zzfknVar.zzb != 4) {
                zzelr zzelrVar = zzfljVar.zzc() == 1 ? zzelr.VIDEO : zzelr.HTML_DISPLAY;
                String str = zzfknVar.zzal;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzelrVar.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e7) {
                    int i5 = G6.L.f4523b;
                    H6.l.g("Unable to build OMID ENV JSON", e7);
                }
            }
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzcei {
    public static String zza(String str, Context context, boolean z2, Map map) {
        String strZzk;
        zzbio zzbioVar = zzbix.zzbg;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && !z2) {
            return str;
        }
        C6.n nVar = C6.n.f1857D;
        if (!nVar.f1885z.zzb(context) || TextUtils.isEmpty(str) || (strZzk = nVar.f1885z.zzk(context)) == null) {
            return str;
        }
        String str2 = (String) c0395s.f2492c.zzd(zzbix.zzaZ);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzaY)).booleanValue() && str.contains(str2)) {
            if (nVar.f1863c.F(str)) {
                nVar.f1885z.zzl(context, strZzk, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzk);
            }
            if (!nVar.f1863c.G(str)) {
                return str;
            }
            nVar.f1885z.zzm(context, strZzk, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzk);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzaX)).booleanValue()) {
            return str;
        }
        if (nVar.f1863c.F(str)) {
            nVar.f1885z.zzl(context, strZzk, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", strZzk).toString();
        }
        if (!nVar.f1863c.G(str)) {
            return str;
        }
        nVar.f1885z.zzm(context, strZzk, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", strZzk).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        C6.n nVar = C6.n.f1857D;
        if (!nVar.f1885z.zzb(context)) {
            return uri.toString();
        }
        String strZzk = nVar.f1885z.zzk(context);
        if (strZzk == null) {
            return uri.toString();
        }
        zzbio zzbioVar = zzbix.zzaZ;
        C0395s c0395s = C0395s.f2489e;
        String str = (String) c0395s.f2492c.zzd(zzbioVar);
        String string = uri.toString();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzaY)).booleanValue() && string.contains(str)) {
            nVar.f1885z.zzl(context, strZzk, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZzk);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzaX)).booleanValue()) {
                String string2 = zzc(zzd(string, context), "fbs_aeid", strZzk).toString();
                nVar.f1885z.zzl(context, strZzk, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    public static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i5 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i5));
        AbstractC3256n.p(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i5));
        return Uri.parse(sb2.toString());
    }

    private static String zzd(String str, Context context) {
        C6.n nVar = C6.n.f1857D;
        String strZzi = nVar.f1885z.zzi(context);
        String strZzj = nVar.f1885z.zzj(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzi)) {
            str = zzc(str, "gmp_app_id", strZzi).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzj)) ? str : zzc(str, "fbs_aiid", strZzj).toString();
    }
}

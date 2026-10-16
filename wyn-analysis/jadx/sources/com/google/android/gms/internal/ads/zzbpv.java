package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbpv implements zzbpx {
    static final /* synthetic */ zzbpv zza = new zzbpv();

    private /* synthetic */ zzbpv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i5 = G6.L.f4523b;
            H6.l.f("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcmnVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
            map2.put(str2, boolValueOf);
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(";");
            sb2.append(boolValueOf);
            G6.L.k(sb2.toString());
        }
        ((zzbst) zzcmnVar).zze("openableURLs", map2);
    }
}

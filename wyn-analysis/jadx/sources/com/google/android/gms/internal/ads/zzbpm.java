package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbpm implements zzbpx {
    static final /* synthetic */ zzbpm zza = new zzbpm();

    private /* synthetic */ zzbpm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjE)).booleanValue()) {
            int i5 = G6.L.f4523b;
            H6.l.f("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i10 = G6.L.f4523b;
            H6.l.f("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcmnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(";");
        sb2.append(boolValueOf);
        G6.L.k(sb2.toString());
        ((zzbst) zzcmnVar).zze("openableApp", map2);
    }
}

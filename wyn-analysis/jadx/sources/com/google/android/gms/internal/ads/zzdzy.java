package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdzy extends zzeac {
    private final O6.a zzf;

    public zzdzy(Executor executor, H6.p pVar, O6.a aVar, O6.c cVar, Context context) {
        PackageInfo packageInfo;
        super(executor, pVar, cVar, context);
        this.zzf = aVar;
        Map map = this.zza;
        aVar.getClass();
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        map.put("device", U.O());
        map.put("app", aVar.f8876b);
        Context context2 = aVar.f8875a;
        boolean zF = U.f(context2);
        String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        map.put("is_lite_sdk", true != zF ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzbio zzbioVar = zzbix.zza;
        C0395s c0395s = C0395s.f2489e;
        List listZzf = c0395s.f2490a.zzf();
        zzbio zzbioVar2 = zzbix.zzhV;
        zzbiv zzbivVar = c0395s.f2492c;
        boolean zBooleanValue = ((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue();
        zzcfk zzcfkVar = nVar.f1868h;
        if (zBooleanValue) {
            listZzf.addAll(((G6.O) zzcfkVar.zzp()).r().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", aVar.f8877c);
        if (((Boolean) zzbivVar.zzd(zzbix.zzmW)).booleanValue()) {
            map.put("is_bstar", true != U.d(context2) ? "0" : str);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzkW)).booleanValue() && ((Boolean) zzbivVar.zzd(zzbix.zzdl)).booleanValue()) {
            map.put("plugin", zzgui.zza(zzcfkVar.zzv()));
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzne)).booleanValue()) {
            map.put("uev", zzgui.zza(aVar.f8879e));
        }
        boolean zBooleanValue2 = ((Boolean) zzbivVar.zzd(zzbix.zzde)).booleanValue();
        M6.d dVar = aVar.f8880f;
        if (zBooleanValue2) {
            map.put("mem_tier", ((M6.a) dVar.f7525c.get()).name());
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzdf)).booleanValue()) {
            map.put("proc_tier", ((M6.c) dVar.f7527e.get()).name());
        }
        if (!((Boolean) zzbivVar.zzd(zzbix.zzdg)).booleanValue() || (packageInfo = aVar.f8878d) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}

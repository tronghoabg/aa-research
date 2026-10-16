package com.google.android.gms.internal.p002firebaseauthapi;

import J8.x;
import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.Executor;
import x.C4412e;

/* loaded from: classes.dex */
public final class zzaer {
    private static final Map<String, zzaet> zza = new C4412e(0);

    public static x zza(String str, x xVar, zzady zzadyVar) {
        zza(str, zzadyVar);
        return new zzaeu(xVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzady zzadyVar) {
        zza.put(str, new zzaet(zzadyVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, x xVar, Activity activity, Executor executor) {
        Map<String, zzaet> map = zza;
        if (map.containsKey(str)) {
            zzaet zzaetVar = map.get(str);
            if (System.currentTimeMillis() - zzaetVar.zzb < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                zzady zzadyVar = zzaetVar.zza;
                if (zzadyVar == null) {
                    return true;
                }
                zzadyVar.zza(xVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}

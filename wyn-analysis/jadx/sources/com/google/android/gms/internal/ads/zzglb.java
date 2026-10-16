package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzglb implements zzfzk {
    private final Context zza;
    private final zzgpj zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzglb(Context context, zzgdq zzgdqVar, zzgpj zzgpjVar) {
        this.zza = context;
        this.zzc = zzgdqVar.zzd();
        this.zzd = zzgdqVar.zzl();
        this.zze = zzgdqVar.zzm();
        this.zzb = zzgpjVar;
    }

    public final void zza(Map map) {
        p8.p pVar;
        zzayt zzaytVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            pVar = (p8.p) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (pVar == null || (Build.VERSION.SDK_INT >= 31 && !pVar.isDone()) || (zzaytVar = (zzayt) pVar.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzaytVar.zzb().length() <= 1) ? "E" : zzaytVar.zzb();
        if (strZzb.equals("E")) {
            try {
                p8.p pVar2 = (p8.p) map.get("ai");
                if (pVar2 != null) {
                    String str = (String) pVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgui.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}

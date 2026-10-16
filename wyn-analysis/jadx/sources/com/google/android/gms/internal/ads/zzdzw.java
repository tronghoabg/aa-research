package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdzw implements zzfpt {
    private final zzdzo zzb;
    private final InterfaceC3596a zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdzw(zzdzo zzdzoVar, Set set, InterfaceC3596a interfaceC3596a) {
        this.zzb = zzdzoVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzv zzdzvVar = (zzdzv) it.next();
            this.zzd.put(zzdzvVar.zzc(), zzdzvVar);
        }
        this.zzc = interfaceC3596a;
    }

    private final void zze(zzfpm zzfpmVar, boolean z2) {
        zzdzv zzdzvVar = (zzdzv) this.zzd.get(zzfpmVar);
        if (zzdzvVar == null) {
            return;
        }
        String str = true != z2 ? "f." : "s.";
        Map map = this.zza;
        zzfpm zzfpmVarZzb = zzdzvVar.zzb();
        if (map.containsKey(zzfpmVarZzb)) {
            ((C3597b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfpmVarZzb)).longValue();
            zzdzo zzdzoVar = this.zzb;
            String strZza = zzdzvVar.zza();
            Map mapZzc = zzdzoVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb2.append(str);
            sb2.append(jElapsedRealtime);
            mapZzc.put("label.".concat(strZza), sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        ((C3597b) this.zzc).getClass();
        this.zza.put(zzfpmVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            ((C3597b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfpmVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfpmVar)) {
            zze(zzfpmVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            ((C3597b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfpmVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfpmVar)) {
            zze(zzfpmVar, true);
        }
    }
}

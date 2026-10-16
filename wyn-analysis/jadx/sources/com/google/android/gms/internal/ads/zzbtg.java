package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbtg implements zzbpx {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbua zzb;
    final /* synthetic */ zzbsw zzc;
    final /* synthetic */ zzbub zzd;

    public zzbtg(zzbub zzbubVar, long j8, zzbua zzbuaVar, zzbsw zzbswVar) {
        this.zza = j8;
        this.zzb = zzbuaVar;
        this.zzc = zzbswVar;
        Objects.requireNonNull(zzbubVar);
        this.zzd = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        C6.n.f1857D.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        G6.L.k(sb2.toString());
        G6.L.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbub zzbubVar = this.zzd;
        synchronized (zzbubVar.zzg()) {
            G6.L.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbua zzbuaVar = this.zzb;
            if (zzbuaVar.zzi() != -1 && zzbuaVar.zzi() != 1) {
                zzbubVar.zzl(0);
                zzbsw zzbswVar = this.zzc;
                zzbswVar.zzm("/log", zzbpw.zzg);
                zzbswVar.zzm("/result", zzbpw.zzo);
                zzbuaVar.zzf(zzbswVar);
                zzbubVar.zzj(zzbuaVar);
                G6.L.k("Successfully loaded JS Engine.");
                G6.L.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            G6.L.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}

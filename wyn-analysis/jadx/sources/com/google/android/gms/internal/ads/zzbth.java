package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbth implements zzbpx {
    final /* synthetic */ zzbsw zza;
    final /* synthetic */ G6.D zzb;
    final /* synthetic */ zzbub zzc;

    public zzbth(zzbub zzbubVar, zzbaw zzbawVar, zzbsw zzbswVar, G6.D d3) {
        this.zza = zzbswVar;
        this.zzb = d3;
        Objects.requireNonNull(zzbubVar);
        this.zzc = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        G6.L.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbub zzbubVar = this.zzc;
        synchronized (zzbubVar.zzg()) {
            try {
                G6.L.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                H6.l.e("JS Engine is requesting an update");
                if (zzbubVar.zzk() == 0) {
                    H6.l.e("Starting reload.");
                    zzbubVar.zzl(2);
                    zzbubVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzbpx) this.zzb.f4500a);
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.L.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}

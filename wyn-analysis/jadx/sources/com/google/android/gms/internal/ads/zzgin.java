package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgin implements zzgjh {
    private final Map zza;
    private final zzaxt zzb;
    private final zzgqm zzc;
    private final long zzd;

    public zzgin(zzaxt zzaxtVar, Map map, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        this.zza = map;
        this.zzb = zzaxtVar;
        this.zzc = zzgqoVar.zza(112);
        this.zzd = zzgdqVar.zzl();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    public final Void zza() throws Exception {
        zzayt zzaytVar;
        try {
            try {
                this.zzc.zza();
                p8.p pVar = (p8.p) this.zza.get("gs");
                if (pVar != null && (zzaytVar = (zzayt) pVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzaxt zzaxtVar = this.zzb;
                    synchronized (zzaxtVar) {
                        zzaxtVar.zzad(zzaytVar.zzh());
                        zzaxtVar.zzN(zzaytVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e7) {
            this.zzc.zzb(e7);
        }
        this.zzc.zzc();
        return null;
    }
}

package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
final class zzhde extends zzhbw implements RunnableFuture {
    private volatile zzhcm zza;

    public zzhde(zzhbm zzhbmVar) {
        this.zza = new zzhdc(this, zzhbmVar);
    }

    public static zzhde zze(Runnable runnable, Object obj) {
        return new zzhde(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhcm zzhcmVar = this.zza;
        if (zzhcmVar != null) {
            zzhcmVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzc() {
        zzhcm zzhcmVar;
        if (zzj() && (zzhcmVar = this.zza) != null) {
            zzhcmVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        zzhcm zzhcmVar = this.zza;
        if (zzhcmVar == null) {
            return super.zzd();
        }
        String string = zzhcmVar.toString();
        return M6.t(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    public zzhde(Callable callable) {
        this.zza = new zzhdd(this, callable);
    }
}

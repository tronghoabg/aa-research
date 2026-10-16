package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzta {
    final /* synthetic */ zztb zza;
    private final Handler zzb;
    private final AudioTrack$StreamEventCallback zzc;

    public /* synthetic */ zzta(zztb zztbVar, byte[] bArr) {
        Objects.requireNonNull(zztbVar);
        this.zza = zztbVar;
        final Handler handlerZzd = zzfm.zzd(null);
        this.zzb = handlerZzd;
        zzsy zzsyVar = new zzsy(this);
        this.zzc = zzsyVar;
        Objects.requireNonNull(handlerZzd);
        zztbVar.zzt().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzsz
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerZzd.post(runnable);
            }
        }, zzsyVar);
    }

    public final /* synthetic */ void zza() {
        this.zza.zzt().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}

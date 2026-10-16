package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfwl implements Runnable {
    final /* synthetic */ zzfwm zza;
    private final WebView zzb;

    public zzfwl(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
        this.zzb = zzfwmVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}

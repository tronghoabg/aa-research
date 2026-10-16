package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzclz implements Runnable {
    final /* synthetic */ zzcme zza;

    public zzclz(zzcme zzcmeVar) {
        Objects.requireNonNull(zzcmeVar);
        this.zza = zzcmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}

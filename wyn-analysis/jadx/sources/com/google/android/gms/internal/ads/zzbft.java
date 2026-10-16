package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbft implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbfx zzb;

    public zzbft(zzbfx zzbfxVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbfxVar);
        this.zzb = zzbfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}

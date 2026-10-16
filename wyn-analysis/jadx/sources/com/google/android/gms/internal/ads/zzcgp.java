package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgp implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgy zzb;

    public zzcgp(zzcgy zzcgyVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcgyVar);
        this.zzb = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcgy zzcgyVar = this.zzb;
        zzcgyVar.zzs(this.zza);
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzb();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import n7.C3597b;

/* loaded from: classes3.dex */
final class zzcfd {
    final /* synthetic */ zzcfe zza;
    private long zzb;
    private long zzc;

    public zzcfd(zzcfe zzcfeVar) {
        Objects.requireNonNull(zzcfeVar);
        this.zza = zzcfeVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        ((C3597b) this.zza.zzk()).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzc() {
        ((C3597b) this.zza.zzk()).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}

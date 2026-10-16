package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes3.dex */
final class zzabo {
    private final Handler zza;
    private final zzabq zzb;
    private boolean zzc;

    public zzabo(Handler handler, zzabq zzabqVar) {
        this.zza = handler;
        this.zzb = zzabqVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    public final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzabq zzc() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}

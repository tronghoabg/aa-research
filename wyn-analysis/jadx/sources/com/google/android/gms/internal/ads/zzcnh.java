package com.google.android.gms.internal.ads;

import android.os.Process;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcnh extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcni zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcnh(zzcni zzcniVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcniVar);
        this.zzb = zzcniVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}

package com.google.android.gms.internal.ads;

import Va.M6;
import com.google.android.gms.internal.ads.zzhay;

/* loaded from: classes3.dex */
final class zzhcu extends zzhay.zzf implements Runnable {
    private final Runnable zza;

    public zzhcu(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }
}

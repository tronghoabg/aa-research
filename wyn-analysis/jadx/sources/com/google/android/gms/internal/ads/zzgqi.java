package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgqi implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgqk zza;

    public zzgqi(zzgqk zzgqkVar) {
        Objects.requireNonNull(zzgqkVar);
        this.zza = zzgqkVar;
    }

    public final void onOpActiveChanged(String str, int i5, String str2, boolean z2) {
        zzgqk zzgqkVar = this.zza;
        synchronized (zzgqkVar) {
            try {
                if (z2) {
                    zzgqkVar.zzg(System.currentTimeMillis());
                    zzgqkVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgqkVar.zzh() > 0 && jCurrentTimeMillis >= zzgqkVar.zzh()) {
                        zzgqkVar.zzi(jCurrentTimeMillis - zzgqkVar.zzh());
                    }
                    zzgqkVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

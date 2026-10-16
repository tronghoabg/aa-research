package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzban implements Runnable {
    final /* synthetic */ zzbao zza;

    public zzban(zzbao zzbaoVar) {
        Objects.requireNonNull(zzbaoVar);
        this.zza = zzbaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbao zzbaoVar = this.zza;
        synchronized (zzbaoVar.zzp()) {
            if (zzbaoVar.zzq()) {
                return;
            }
            zzbaoVar.zzr(true);
            try {
                zzbaoVar.zzn();
            } catch (Exception e7) {
                this.zza.zzo().zzc(2023, -1L, e7);
            }
            zzbao zzbaoVar2 = this.zza;
            synchronized (zzbaoVar2.zzp()) {
                zzbaoVar2.zzr(false);
            }
        }
    }
}

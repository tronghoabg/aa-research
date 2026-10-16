package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzfvn implements Runnable {
    final /* synthetic */ zzfvo zza;

    public zzfvn(zzfvo zzfvoVar) {
        Objects.requireNonNull(zzfvoVar);
        this.zza = zzfvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvo zzfvoVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfvoVar.zzf();
        float fZzc = zzfvoVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfvoVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfvoVar.zzd().post(new zzfvm(this, fZzc));
        }
    }
}

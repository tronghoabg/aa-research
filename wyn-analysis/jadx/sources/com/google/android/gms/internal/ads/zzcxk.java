package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzcxk implements zzbex {
    private final zzclb zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcxk(zzclb zzclbVar, Executor executor) {
        this.zza = zzclbVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(zzbew zzbewVar) {
        final zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzon)).booleanValue()) {
                if (zzbewVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxj
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclbVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxi
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclbVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzfs {
    private final zzfr zza;
    private final zzea zzb;
    private final zzea zzc;
    private boolean zzd;
    private boolean zze;

    public zzfs(Context context, Looper looper, zzdp zzdpVar) {
        this.zza = new zzfr(context.getApplicationContext());
        this.zzb = zzdpVar.zzd(looper, null);
        this.zzc = zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z2, final boolean z10) {
        if (zzh(z2, z10)) {
            this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(z2, z10);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.zzc.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(atomicBoolean, z2, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z2, boolean z10) {
        return z2 && z10;
    }

    public final void zza(boolean z2) {
        if (this.zzd == z2) {
            return;
        }
        this.zzd = z2;
        zzg(z2, this.zze);
    }

    public final void zzb(boolean z2) {
        if (this.zze == z2) {
            return;
        }
        this.zze = z2;
        if (this.zzd) {
            zzg(true, z2);
        }
    }

    public final /* synthetic */ void zzc(final AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final zzfr zzfrVar = this.zza;
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrVar.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    public final /* synthetic */ void zzd(AtomicBoolean atomicBoolean, boolean z2, boolean z10) {
        atomicBoolean.set(false);
        this.zza.zzb(z2, z10);
    }

    public final /* synthetic */ void zze(boolean z2, boolean z10) {
        this.zza.zzb(z2, z10);
    }
}

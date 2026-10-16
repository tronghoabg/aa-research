package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdga extends zzdix {
    private final ScheduledExecutorService zzb;
    private final InterfaceC3596a zzc;
    private final zzdzt zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzdga(ScheduledExecutorService scheduledExecutorService, InterfaceC3596a interfaceC3596a, zzdzt zzdztVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = interfaceC3596a;
        this.zzd = zzdztVar;
    }

    private final synchronized void zzf(long j8) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            ((C3597b) this.zzc).getClass();
            this.zze = SystemClock.elapsedRealtime() + j8;
            this.zzj = this.zzb.schedule(new zzdfy(this, null), j8, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j8) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            ((C3597b) this.zzc).getClass();
            this.zzf = SystemClock.elapsedRealtime() + j8;
            this.zzk = this.zzb.schedule(new zzdfz(this, null), j8, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                long j8 = this.zze;
                ((C3597b) this.zzc).getClass();
                this.zzg = j8 - SystemClock.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                long j10 = this.zzf;
                ((C3597b) this.zzc).getClass();
                this.zzh = j10 - SystemClock.elapsedRealtime();
            }
            this.zzi = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
        if (i5 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i5);
            if (this.zzi) {
                long j8 = this.zzg;
                if (j8 <= 0 || millis >= j8) {
                    millis = j8;
                }
                this.zzg = millis;
                return;
            }
            ((C3597b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzbio zzbioVar = zzbix.zzoV;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                long j10 = this.zze;
                if (jElapsedRealtime >= j10 || j10 - jElapsedRealtime > millis) {
                    zzf(millis);
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzps)).booleanValue()) {
                        zzdzs zzdzsVarZza = this.zzd.zza();
                        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "rtnc");
                        zzdzsVarZza.zzf();
                    }
                }
            } else {
                long j11 = this.zze;
                if (jElapsedRealtime > j11 || j11 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
        if (i5 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i5);
            if (this.zzi) {
                long j8 = this.zzh;
                if (j8 <= 0 || millis >= j8) {
                    millis = j8;
                }
                this.zzh = millis;
                return;
            }
            ((C3597b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoV)).booleanValue()) {
                if (jElapsedRealtime == this.zzf) {
                    G6.L.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j10 = this.zzf;
                if (jElapsedRealtime >= j10 || j10 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j11 = this.zzf;
                if (jElapsedRealtime > j11 || j11 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}

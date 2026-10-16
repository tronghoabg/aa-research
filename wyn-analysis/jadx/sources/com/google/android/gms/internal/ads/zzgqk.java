package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzgqk implements zzgpl, zzgfo {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgqk(Context context, zzgcy zzgcyVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final p8.p zza() {
        return Build.VERSION.SDK_INT < 30 ? zzhcf.zzb() : zzhcf.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzb(Map map) {
        long j8;
        long j10;
        zze();
        synchronized (this) {
            try {
                j8 = this.zzh ? this.zzf - this.zze : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j8));
        synchronized (this) {
            j10 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzd(Map map) {
        zze();
    }

    public final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        zzgqi zzgqiVar = new zzgqi(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgqiVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zze = j8;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j8) {
        this.zzg = j8;
    }

    public final /* synthetic */ void zzj(boolean z2) {
        this.zzh = z2;
    }
}

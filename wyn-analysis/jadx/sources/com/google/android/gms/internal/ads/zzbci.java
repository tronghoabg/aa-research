package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzbci {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    public zzbci(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzbch(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzbci zza(Context context, Executor executor) {
        return new zzbci(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j8 = this.zzd;
        this.zzd = -1L;
        return j8;
    }

    public final /* synthetic */ void zze(long j8) {
        this.zzb = j8;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zzd = j8;
    }

    public final /* synthetic */ void zzh(boolean z2) {
        this.zze = z2;
    }
}

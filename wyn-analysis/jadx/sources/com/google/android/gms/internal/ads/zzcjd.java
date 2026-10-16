package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcjd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcjh zzj;

    public zzcjd(zzcjh zzcjhVar, String str, String str2, int i5, int i10, long j8, long j10, boolean z2, int i11, int i12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        this.zzd = i10;
        this.zze = j8;
        this.zzf = j10;
        this.zzg = z2;
        this.zzh = i11;
        this.zzi = i12;
        Objects.requireNonNull(zzcjhVar);
        this.zzj = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapL = AbstractC1593a.l("event", "precacheProgress");
        mapL.put("src", this.zza);
        mapL.put("cachedSrc", this.zzb);
        mapL.put("bytesLoaded", Integer.toString(this.zzc));
        mapL.put("totalBytes", Integer.toString(this.zzd));
        mapL.put("bufferedDuration", Long.toString(this.zze));
        mapL.put("totalDuration", Long.toString(this.zzf));
        mapL.put("cacheReady", true != this.zzg ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        mapL.put("playerCount", Integer.toString(this.zzh));
        mapL.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapL);
    }
}

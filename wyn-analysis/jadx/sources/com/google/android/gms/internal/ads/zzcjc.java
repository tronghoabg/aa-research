package com.google.android.gms.internal.ads;

import D6.C0395s;
import cb.AbstractC1593a;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcjc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcjh zzk;

    public zzcjc(zzcjh zzcjhVar, String str, String str2, long j8, long j10, long j11, long j12, long j13, boolean z2, int i5, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j8;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = z2;
        this.zzi = i5;
        this.zzj = i10;
        Objects.requireNonNull(zzcjhVar);
        this.zzk = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapL = AbstractC1593a.l("event", "precacheProgress");
        mapL.put("src", this.zza);
        mapL.put("cachedSrc", this.zzb);
        mapL.put("bufferedDuration", Long.toString(this.zzc));
        mapL.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue()) {
            mapL.put("qoeLoadedBytes", Long.toString(this.zze));
            mapL.put("qoeCachedBytes", Long.toString(this.zzf));
            mapL.put("totalBytes", Long.toString(this.zzg));
            C6.n.f1857D.k.getClass();
            mapL.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        mapL.put("cacheReady", true != this.zzh ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        mapL.put("playerCount", Integer.toString(this.zzi));
        mapL.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", mapL);
    }
}

package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcjb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcjh zze;

    public zzcjb(zzcjh zzcjhVar, String str, String str2, int i5, int i10, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        this.zzd = i10;
        Objects.requireNonNull(zzcjhVar);
        this.zze = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapL = AbstractC1593a.l("event", "precacheProgress");
        mapL.put("src", this.zza);
        mapL.put("cachedSrc", this.zzb);
        mapL.put("bytesLoaded", Integer.toString(this.zzc));
        mapL.put("totalBytes", Integer.toString(this.zzd));
        mapL.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", mapL);
    }
}

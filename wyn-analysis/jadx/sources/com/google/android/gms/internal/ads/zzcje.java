package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcje implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcjh zzd;

    public zzcje(zzcjh zzcjhVar, String str, String str2, int i5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        Objects.requireNonNull(zzcjhVar);
        this.zzd = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapL = AbstractC1593a.l("event", "precacheComplete");
        mapL.put("src", this.zza);
        mapL.put("cachedSrc", this.zzb);
        mapL.put("totalBytes", Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", mapL);
    }
}

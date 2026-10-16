package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import D6.K0;
import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzeas implements y6.f, zzdgf, InterfaceC0358a, zzdcz, zzddt, zzddu, zzden, zzddc, zzfpt {
    private final List zza;
    private final zzeag zzb;
    private long zzc;

    public zzeas(zzeag zzeagVar, zzcnq zzcnqVar) {
        this.zzb = zzeagVar;
        this.zza = Collections.singletonList(zzcnqVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) throws IOException {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() throws IOException {
        zzi(InterfaceC0358a.class, "onAdClicked", new Object[0]);
    }

    @Override // y6.f
    public final void onAppEvent(String str, String str2) throws IOException {
        zzi(y6.f.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) throws IOException {
        zzi(zzddu.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) throws IOException {
        zzi(zzddu.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) throws IOException {
        zzi(zzddu.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) throws IOException {
        zzi(zzdcz.class, "onRewarded", zzcbwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(K0 k02) throws IOException {
        zzi(zzddc.class, "onAdFailedToLoad", Integer.valueOf(k02.f2338a), k02.f2339b, k02.f2340c);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() throws IOException {
        zzi(zzdcz.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) throws IOException {
        zzi(zzfpl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) throws IOException {
        zzi(zzfpl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) throws IOException {
        zzi(zzfpl.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) throws IOException {
        zzi(zzfpl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) throws IOException {
        C6.n.f1857D.k.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        zzi(zzdgf.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() throws IOException {
        zzi(zzddt.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() throws IOException {
        zzi(zzdcz.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() throws IOException {
        zzi(zzdcz.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() throws IOException {
        zzi(zzdcz.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() throws IOException {
        zzi(zzdcz.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() throws IOException {
        C6.n.f1857D.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        G6.L.k(sb2.toString());
        zzi(zzden.class, "onAdLoaded", new Object[0]);
    }
}

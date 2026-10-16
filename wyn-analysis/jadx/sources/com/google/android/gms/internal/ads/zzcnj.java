package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcnj {
    private final zzcna zza;
    private final zzdzt zzb;

    public zzcnj(zzcna zzcnaVar, zzdzt zzdztVar) {
        this.zza = zzcnaVar;
        this.zzb = zzdztVar;
    }

    public final void zza(final Context context, final H6.a aVar) {
        zzbio zzbioVar = zzbix.zzpD;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            Executor threadPoolExecutor = zzcfy.zza;
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpF)).booleanValue()) {
                zzcni zzcniVar = new zzcni(((Integer) c0395s.f2492c.zzd(zzbix.zzpH)).intValue(), null);
                int iIntValue = ((Integer) c0395s.f2492c.zzd(zzbix.zzpG)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcniVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, aVar);
                }
            });
        }
    }

    public final void zzb(Context context, H6.a aVar) {
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nVar.f1863c.E(context, aVar.f4927a);
        zzbio zzbioVar = zzbix.zzpE;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            nVar.k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            zzdzs zzdzsVarZza = this.zzb.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_startup_l");
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb2.append(jElapsedRealtime2);
            zzdzsVarZza.zzc("webview_startup_l", sb2.toString());
            zzdzsVarZza.zzd();
        }
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzpK)).booleanValue() || Build.VERSION.SDK_INT < 24) {
            return;
        }
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final void zzc() {
        C6.n.f1857D.k.getClass();
        this.zza.zzb(new zzcne(this, SystemClock.elapsedRealtime()));
    }

    public final /* synthetic */ zzdzt zzd() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x3.AbstractC4467j;

/* loaded from: classes3.dex */
public final class zzcnn {
    private String zza;
    private zziid zzb;
    private zzilv zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzcnn(zzcna zzcnaVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strD = com.moloco.sdk.internal.publisher.H.b0("GET_VARIATIONS_HEADER") ? AbstractC4467j.d() : null;
            if (strD != null && !strD.isEmpty()) {
                this.zza = strD;
                byte[] bArrDecode = Base64.decode(strD, 10);
                this.zzb = zziid.zzc(bArrDecode, zzidz.zzc());
                zzbio zzbioVar = zzbix.zzko;
                C0395s c0395s = C0395s.f2489e;
                zzbiv zzbivVar = c0395s.f2492c;
                zzbiv zzbivVar2 = c0395s.f2492c;
                if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
                    this.zzc = zzilv.zzc(bArrDecode, zzidz.zzc());
                }
                if (((Boolean) zzbivVar2.zzd(zzbix.zzkm)).booleanValue() && ((Boolean) zzbivVar2.zzd(zzbix.zzkl)).booleanValue()) {
                    this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    }, ((Integer) zzbivVar2.zzd(zzbix.zzkn)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (zzifh e7) {
            e = e7;
            C6.n.f1857D.f1868h.zzi(e, "ChromeVariations");
        } catch (IllegalArgumentException e10) {
            e = e10;
            C6.n.f1857D.f1868h.zzi(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkl)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzilv zzilvVar = this.zzc;
        if (zzilvVar != null) {
            return Base64.encodeToString(zzilvVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziid zzd() {
        return this.zzb;
    }
}

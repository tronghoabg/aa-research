package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzbtj implements Runnable {
    final /* synthetic */ zzbua zza;
    final /* synthetic */ zzbsw zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbub zze;

    public zzbtj(zzbub zzbubVar, zzbua zzbuaVar, zzbsw zzbswVar, ArrayList arrayList, long j8) {
        this.zza = zzbuaVar;
        this.zzb = zzbswVar;
        this.zzc = arrayList;
        this.zzd = j8;
        Objects.requireNonNull(zzbubVar);
        this.zze = zzbubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        G6.L.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbub zzbubVar = this.zze;
        synchronized (zzbubVar.zzg()) {
            try {
                G6.L.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbua zzbuaVar = this.zza;
                if (zzbuaVar.zzi() != -1 && zzbuaVar.zzi() != 1) {
                    zzbio zzbioVar = zzbix.zziL;
                    C0395s c0395s = C0395s.f2489e;
                    if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                        zzbuaVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbuaVar.zzg();
                    }
                    zzhcp zzhcpVar = zzcfy.zzf;
                    final zzbsw zzbswVar = this.zzb;
                    Objects.requireNonNull(zzbswVar);
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbti
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbswVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(c0395s.f2492c.zzd(zzbix.zze));
                    int iZzi = zzbuaVar.zzi();
                    int iZzk = zzbubVar.zzk();
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(strValueOf2);
                        string = sb2.toString();
                    }
                    C6.n.f1857D.k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.zzd;
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(iZzi).length() + 36 + String.valueOf(iZzk).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(strValueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(iZzi);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(iZzk);
                    sb3.append(string);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ms at timeout. Rejecting.");
                    G6.L.k(sb3.toString());
                    G6.L.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                G6.L.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

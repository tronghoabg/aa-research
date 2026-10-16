package com.google.android.gms.internal.ads;

import Va.M6;
import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.C3597b;
import n7.InterfaceC3596a;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcun implements zzbex, zzddu, F6.o, zzddt {
    private final zzcui zza;
    private final zzcuj zzb;
    private final zzbvb zzd;
    private final Executor zze;
    private final InterfaceC3596a zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcum zzh = new zzcum();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcun(zzbuy zzbuyVar, zzcuj zzcujVar, Executor executor, zzcui zzcuiVar, InterfaceC3596a interfaceC3596a) {
        this.zza = zzcuiVar;
        zzbuj zzbujVar = zzbum.zza;
        this.zzd = zzbuyVar.zza("google.afma.activeView.handleUpdate", zzbujVar, zzbujVar);
        this.zzb = zzcujVar;
        this.zze = executor;
        this.zzf = interfaceC3596a;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzclb) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // F6.o
    public final void zzdT() {
    }

    @Override // F6.o
    public final void zzdU(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(zzbew zzbewVar) {
        zzcum zzcumVar = this.zzh;
        zzcumVar.zza = zzbewVar.zzj;
        zzcumVar.zzf = zzbewVar;
        zzl();
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // F6.o
    public final void zzdv() {
    }

    @Override // F6.o
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // F6.o
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // F6.o
    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcum zzcumVar = this.zzh;
                ((C3597b) this.zzf).getClass();
                zzcumVar.zzd = SystemClock.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcumVar);
                for (final zzclb zzclbVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcul
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            String strT = M6.t(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                            int i5 = G6.L.f4523b;
                            H6.l.a(strT);
                            zzclbVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcgb.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e7) {
                G6.L.l("Failed to call ActiveViewJS", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzclb zzclbVar) {
        this.zzc.add(zzclbVar);
        this.zza.zzb(zzclbVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}

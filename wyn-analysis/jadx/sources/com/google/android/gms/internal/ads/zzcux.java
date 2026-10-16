package com.google.android.gms.internal.ads;

import Va.M6;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import n7.C3597b;
import n7.InterfaceC3596a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcux implements zzbex {
    private zzclb zza;
    private final Executor zzb;
    private final zzcuj zzc;
    private final InterfaceC3596a zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcum zzg = new zzcum();

    public zzcux(Executor executor, zzcuj zzcujVar, InterfaceC3596a interfaceC3596a) {
        this.zzb = executor;
        this.zzc = zzcujVar;
        this.zzd = interfaceC3596a;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e7) {
            G6.L.l("Failed to call video active view js", e7);
        }
    }

    public final void zza(zzclb zzclbVar) {
        this.zza = zzclbVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        boolean z2 = this.zzf ? false : zzbewVar.zzj;
        zzcum zzcumVar = this.zzg;
        zzcumVar.zza = z2;
        ((C3597b) this.zzd).getClass();
        zzcumVar.zzd = SystemClock.elapsedRealtime();
        zzcumVar.zzf = zzbewVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z2) {
        this.zzf = z2;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strT = M6.t(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i5 = G6.L.f4523b;
        H6.l.a(strT);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}

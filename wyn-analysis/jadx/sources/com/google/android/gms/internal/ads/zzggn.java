package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzggn implements zzgfo {
    private final zzgdq zza;
    private final zzggj zzb;
    private final zzggd zzc;
    private final ExecutorService zzd;
    private final zzgqo zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzggn(zzgdq zzgdqVar, zzggj zzggjVar, zzggd zzggdVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzgdqVar;
        this.zzb = zzggjVar;
        this.zzc = zzggdVar;
        this.zzd = executorService;
        this.zze = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final p8.p zza() {
        zzggj zzggjVar = this.zzb;
        zzgdq zzgdqVar = this.zza;
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzk(zzhbx.zzw(zzggjVar.zzb(zzgdqVar.zzK(), zzgdqVar.zza())), new zzgti() { // from class: com.google.android.gms.internal.ads.zzggm
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzggc zzggcVar = (zzggc) obj;
                this.zza.zzf(zzggcVar);
                return zzggcVar;
            }
        }, zzhcw.zza());
        zzhcf.zzr(zzhbxVar, new zzggl(this), this.zzd);
        return zzhbxVar;
    }

    public final p8.p zzb(Context context) {
        return ((zzggc) this.zzf.get()).zzc(context);
    }

    public final p8.p zzc(Context context, String str, View view, Activity activity) {
        return ((zzggc) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final p8.p zzd(Context context, String str, View view, Activity activity) {
        return ((zzggc) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzggc zzggcVar = (zzggc) this.zzf.get();
        if (zzggcVar == null) {
            this.zze.zzb(54);
        } else {
            zzggcVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzggc zzf(zzggc zzggcVar) {
        this.zzf.set(zzggcVar);
        return zzggcVar;
    }

    public final /* synthetic */ zzggd zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzggc zzggcVar = (zzggc) this.zzf.get();
        if (zzggcVar == null) {
            return 1;
        }
        return zzggcVar.zzg();
    }
}

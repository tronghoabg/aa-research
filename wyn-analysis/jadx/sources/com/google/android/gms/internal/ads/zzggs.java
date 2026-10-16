package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzggs implements zzggc {
    private final ExecutorService zza;
    private final zzimt zzb;
    private final zzimt zzc;
    private final zzgpj zzd;
    private final zzimt zze;
    private final zzino zzf;
    private final zzgdq zzg;

    public zzggs(ExecutorService executorService, zzimt zzimtVar, zzimt zzimtVar2, zzgpj zzgpjVar, zzimt zzimtVar3, zzino zzinoVar, zzgdq zzgdqVar) {
        this.zza = executorService;
        this.zzb = zzimtVar;
        this.zzc = zzimtVar2;
        this.zzd = zzgpjVar;
        this.zze = zzimtVar3;
        this.zzf = zzinoVar;
        this.zzg = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final String zza() {
        return "1.893135394";
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzb() {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzc(Context context) {
        zzghi zzghiVarZzh = ((zzghi) this.zzf.zzb()).zzh(context);
        zzghiVarZzh.zzd(this.zzd.zzb());
        zzghiVarZzh.zzc(zzayt.zzj());
        zzghiVarZzh.zzb(zzgen.QUERY);
        return zzghiVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzd(Context context, String str, View view, Activity activity) {
        zzghi zzghiVarZzh = ((zzghi) this.zzf.zzb()).zzh(context);
        zzghiVarZzh.zzg(view);
        zzghiVarZzh.zzf(activity);
        zzghiVarZzh.zze(true != this.zzg.zzh() ? "" : null);
        zzghiVarZzh.zzd(this.zzd.zzc(context, view));
        zzghiVarZzh.zzc(zzayt.zzj());
        zzghiVarZzh.zzb(zzgen.VIEW);
        return zzghiVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zze(Context context, String str, View view, Activity activity) {
        zzimt zzimtVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzgha) zzimtVar.zzb()).zzb(mapZzd);
        zzghi zzghiVarZzh = ((zzghi) this.zzf.zzb()).zzh(context);
        zzghiVarZzh.zzg(view);
        zzghiVarZzh.zzf(null);
        zzghiVarZzh.zze(str);
        zzghiVarZzh.zzd(mapZzd);
        zzghiVarZzh.zzb(zzgen.CLICK);
        zzghiVarZzh.zzc(zzayt.zzj());
        return zzghiVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzgha) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final int zzg() {
        return 2;
    }

    public final /* synthetic */ Void zzh() {
        ((zzghl) this.zzc.zzb()).zza();
        ((zzgie) this.zzb.zzb()).zza();
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzglx implements zzglm {
    private final zzfzj zza;
    private final zzgnh zzb;
    private final zzgpe zzc;
    private final zzgqo zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.893135394.-1");

    public zzglx(zzfzj zzfzjVar, zzgnh zzgnhVar, zzgpe zzgpeVar, zzgqo zzgqoVar, ExecutorService executorService) {
        this.zza = zzfzjVar;
        this.zzb = zzgnhVar;
        this.zzc = zzgpeVar;
        this.zzd = zzgqoVar;
        this.zze = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final String zza() {
        return (String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzb() {
        return (zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzg(zzhbx.zzw(this.zzb.zzb()), Throwable.class, zzglw.zza, zzhcw.zza()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzh((zzggb) obj);
                return new Boolean(true);
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzglp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzi((Boolean) obj);
            }
        }, zzhcw.zza()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzglq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzj((zzfyz) obj);
                return new Boolean(true);
            }
        }, zzhcw.zza()), zzglr.zza, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzc(final Context context) {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgls
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcf.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzglt
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final p8.p zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcf.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzglu
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzf(InputEvent inputEvent) {
        zzfxt zzfxtVarZzb = this.zza.zzb();
        if (zzfxtVarZzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzfxtVarZzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfzi e7) {
                this.zzd.zzd(15005, e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final int zzg() {
        return 3;
    }

    public final /* synthetic */ boolean zzh(zzggb zzggbVar) {
        if (this.zzc.zzb(zzggbVar) && zzggbVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgln(1);
    }

    public final /* synthetic */ p8.p zzi(Boolean bool) {
        return this.zzb.zze();
    }

    public final /* synthetic */ boolean zzj(final zzfyz zzfyzVar) {
        if (zzfyzVar == null) {
            throw new zzgln(3);
        }
        File fileZzb = zzfyzVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            fileZzb.setReadOnly();
        }
        this.zzd.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzglv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(zzfyzVar);
            }
        });
        return true;
    }

    public final /* synthetic */ String zzk(Context context) {
        zzfxt zzfxtVarZzb = this.zza.zzb();
        if (zzfxtVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZza = zzfxtVarZzb.zza(context, null);
        if (strZza != null) {
            return strZza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    public final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfxt zzfxtVarZzb = this.zza.zzb();
        if (zzfxtVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZzb = zzfxtVarZzb.zzb(context, null, view, activity);
        if (strZzb != null) {
            return strZzb;
        }
        this.zzd.zzb(15007);
        return "";
    }

    public final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfxt zzfxtVarZzb = this.zza.zzb();
        if (zzfxtVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZzc = zzfxtVarZzb.zzc(context, null, str, view, null);
        if (strZzc != null) {
            return strZzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    public final /* synthetic */ void zzn(zzfyz zzfyzVar) {
        if (!this.zza.zza(zzfyzVar)) {
            throw new zzgln(2);
        }
        this.zzf.set("2.893135394.".concat(String.valueOf(zzfyzVar.zza().zza())));
    }
}

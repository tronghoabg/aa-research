package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgdl {
    private static final Object zza = new Object();
    private static zzgdl zzb;
    private final zzgdj zzc;

    private zzgdl(Context context, ExecutorService executorService, zzgdq zzgdqVar) {
        zzgdx zzgdxVar = new zzgdx(null);
        zzgdxVar.zzc(context);
        zzgdxVar.zzb(executorService);
        zzgdxVar.zzd(zzgdqVar);
        this.zzc = (zzgdj) ((zzgdw) zzgdxVar.zza()).zzI.zzb();
    }

    public static zzgdl zza(Context context, ExecutorService executorService, zzgdq zzgdqVar) {
        zzgdl zzgdlVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzgdl(context, executorService, zzgdqVar);
                }
                zzgdlVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdlVar;
    }

    public final p8.p zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}

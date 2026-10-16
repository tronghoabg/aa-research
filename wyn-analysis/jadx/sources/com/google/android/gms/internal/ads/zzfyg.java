package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfyg {
    private final Context zza;
    private final Executor zzb;
    private final zzfxq zzc;
    private final zzfyf zzd;
    private Task zze;

    public zzfyg(Context context, Executor executor, zzfxq zzfxqVar, zzfxs zzfxsVar, zzfyc zzfycVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfxqVar;
        this.zzd = zzfycVar;
    }

    public static zzfyg zza(Context context, Executor executor, zzfxq zzfxqVar, zzfxs zzfxsVar) {
        final zzfyg zzfygVar = new zzfyg(context, executor, zzfxqVar, zzfxsVar, new zzfyc());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfye
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        };
        Executor executor2 = zzfygVar.zzb;
        zzfygVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfyd
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
        return zzfygVar;
    }

    public final zzayt zzb() {
        zzfyf zzfyfVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfyfVar.zza() : (zzayt) task.getResult();
    }

    public final /* synthetic */ zzayt zzc() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return zzfxx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}

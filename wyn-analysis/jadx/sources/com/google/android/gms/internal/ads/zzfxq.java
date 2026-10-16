package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class zzfxq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfxq(Context context, Executor executor, Task task, boolean z2) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z2;
    }

    public static zzfxq zza(final Context context, Executor executor, boolean z2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z2) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfzm.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfzm.zzc());
                }
            });
        }
        return new zzfxq(context, executor, taskCompletionSource.getTask(), z2);
    }

    public static void zzg(int i5) {
        zzf = i5;
    }

    private final Task zzh(final int i5, long j8, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfxp.zza);
        }
        Context context = this.zzb;
        final zzawz zzawzVarZza = zzaxd.zza();
        zzawzVarZza.zza(context.getPackageName());
        zzawzVarZza.zzb(j8);
        zzawzVarZza.zzg(zzf);
        if (exc != null) {
            int i10 = zzgun.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzawzVarZza.zzc(stringWriter.toString());
            zzawzVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzawzVarZza.zze(str2);
        }
        if (str != null) {
            zzawzVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfxn
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i11 = i5;
                zzfzl zzfzlVarZza = ((zzfzm) task.getResult()).zza(((zzaxd) zzawzVarZza.zzbu()).zzaN());
                zzfzlVarZza.zzc(i11);
                zzfzlVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i5, long j8) {
        return zzh(i5, j8, null, null, null, null);
    }

    public Task zzc(int i5, long j8, Exception exc) {
        return zzh(i5, j8, exc, null, null, null);
    }

    public final Task zzd(int i5, long j8, String str, Map map) {
        return zzh(i5, j8, null, str, null, null);
    }

    public Task zze(int i5, String str) {
        return zzh(i5, 0L, null, null, null, str);
    }

    public final Task zzf(int i5, long j8, String str) {
        return zzh(i5, j8, null, null, null, str);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzgla extends zzfxq {
    private final zzgfs zzb;

    public zzgla(Context context, Executor executor, zzgfs zzgfsVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgfsVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zzb(int i5, long j8) {
        this.zzb.zzb(i5, j8, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zzc(int i5, long j8, Exception exc) {
        this.zzb.zzb(i5, j8, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zze(int i5, String str) {
        this.zzb.zzb(i5, -1L, null, str);
        return zzh();
    }
}

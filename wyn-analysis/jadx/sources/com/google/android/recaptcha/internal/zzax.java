package com.google.android.recaptcha.internal;

import Ef.K;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzax {
    @NotNull
    public static final Task zza(@NotNull K k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        k.invokeOnCompletion(new zzaw(taskCompletionSource, k));
        return taskCompletionSource.getTask();
    }
}

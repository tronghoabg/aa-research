package com.google.android.recaptcha.internal;

import Ef.K;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ef.C2515C;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes4.dex */
final class zzaw extends AbstractC3343n implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ K zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(TaskCompletionSource taskCompletionSource, K k) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = k;
    }

    @Override // tf.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return C2515C.f34653a;
    }
}

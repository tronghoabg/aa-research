package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final /* synthetic */ class zzfxp implements Continuation {
    static final /* synthetic */ zzfxp zza = new zzfxp();

    private /* synthetic */ zzfxp() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}

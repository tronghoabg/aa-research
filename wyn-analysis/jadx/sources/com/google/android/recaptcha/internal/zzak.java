package com.google.android.recaptcha.internal;

import Ef.H;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class zzak extends TimerTask {
    final /* synthetic */ zzap zza;

    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzap zzapVar = this.zza;
        H.D(zzapVar.zzb, null, new zzal(zzapVar, null), 3);
    }
}

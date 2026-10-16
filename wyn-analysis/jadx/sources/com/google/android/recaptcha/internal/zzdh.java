package com.google.android.recaptcha.internal;

import Ef.H;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class zzdh extends TimerTask {
    final /* synthetic */ zzdk zza;

    public zzdh(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzdk zzdkVar = this.zza;
        H.D(zzdkVar.zzd, null, new zzdi(zzdkVar, null), 3);
    }
}

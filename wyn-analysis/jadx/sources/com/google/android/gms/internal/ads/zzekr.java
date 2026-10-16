package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import j$.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
final class zzekr extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ F6.l zzc;

    public zzekr(zzekz zzekzVar, AlertDialog alertDialog, Timer timer, F6.l lVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = lVar;
        Objects.requireNonNull(zzekzVar);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        F6.l lVar = this.zzc;
        if (lVar != null) {
            lVar.zzb();
        }
    }
}

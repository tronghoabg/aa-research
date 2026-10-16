package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzhcz implements Runnable {
    zzhdb zza;

    public zzhcz(zzhdb zzhdbVar) {
        this.zza = zzhdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p8.p pVarZzf;
        zzhdb zzhdbVar = this.zza;
        if (zzhdbVar == null || (pVarZzf = zzhdbVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (pVarZzf.isDone()) {
            zzhdbVar.zzk(pVarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhdbVar.zzx();
            zzhdbVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th) {
                    zzhdbVar.zzb(new zzhda(string, null));
                    throw th;
                }
            }
            String string2 = pVarZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhdbVar.zzb(new zzhda(sb3.toString(), null));
        } finally {
            pVarZzf.cancel(true);
        }
    }
}

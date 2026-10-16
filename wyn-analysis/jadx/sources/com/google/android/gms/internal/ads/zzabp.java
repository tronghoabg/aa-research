package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzabp {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabq zzabqVar) {
        zzb(zzabqVar);
        this.zza.add(new zzabo(handler, zzabqVar));
    }

    public final void zzb(zzabq zzabqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzabo zzaboVar = (zzabo) it.next();
            if (zzaboVar.zzc() == zzabqVar) {
                zzaboVar.zza();
                copyOnWriteArrayList.remove(zzaboVar);
            }
        }
    }

    public final void zzc(final int i5, final long j8, final long j10) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzabo zzaboVar = (zzabo) it.next();
            if (!zzaboVar.zzd()) {
                zzaboVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaboVar.zzc().zzX(i5, j8, j10);
                    }
                });
            }
        }
    }
}

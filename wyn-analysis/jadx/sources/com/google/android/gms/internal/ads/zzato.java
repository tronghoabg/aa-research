package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zzato {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzasv zze;
    private final zzate zzf;
    private final zzatf[] zzg;
    private zzasx zzh;
    private final List zzi;
    private final List zzj;
    private final zzatc zzk;

    public zzato(zzasv zzasvVar, zzate zzateVar, int i5) {
        zzatc zzatcVar = new zzatc(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzasvVar;
        this.zzf = zzateVar;
        this.zzg = new zzatf[4];
        this.zzk = zzatcVar;
    }

    public final void zza() {
        zzasx zzasxVar = this.zzh;
        if (zzasxVar != null) {
            zzasxVar.zza();
        }
        zzatf[] zzatfVarArr = this.zzg;
        for (int i5 = 0; i5 < 4; i5++) {
            zzatf zzatfVar = zzatfVarArr[i5];
            if (zzatfVar != null) {
                zzatfVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzasv zzasvVar = this.zze;
        zzatc zzatcVar = this.zzk;
        zzasx zzasxVar2 = new zzasx(priorityBlockingQueue, priorityBlockingQueue2, zzasvVar, zzatcVar);
        this.zzh = zzasxVar2;
        zzasxVar2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            zzatf zzatfVar2 = new zzatf(priorityBlockingQueue2, this.zzf, zzasvVar, zzatcVar);
            zzatfVarArr[i10] = zzatfVar2;
            zzatfVar2.start();
        }
    }

    public final zzatl zzb(zzatl zzatlVar) {
        zzatlVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzatlVar);
        }
        zzatlVar.zzg(this.zza.incrementAndGet());
        zzatlVar.zzc("add-to-queue");
        zzd(zzatlVar, 0);
        this.zzc.add(zzatlVar);
        return zzatlVar;
    }

    public final void zzc(zzatl zzatlVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzatlVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzatn) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzd(zzatlVar, 5);
    }

    public final void zzd(zzatl zzatlVar, int i5) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzatm) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

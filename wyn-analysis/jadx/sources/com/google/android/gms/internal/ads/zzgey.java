package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzgey implements zzgew {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    public zzgey(Executor executor, zzgcy zzgcyVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zza(Runnable runnable, long j8) {
        if (j8 <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgfa zzgfaVar = new zzgfa(runnable, System.currentTimeMillis() + j8);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgfaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (zzgfa zzgfaVar = (zzgfa) queue.peek(); zzgfaVar != null && zzgfaVar.zzb <= jCurrentTimeMillis; zzgfaVar = (zzgfa) queue.peek()) {
                    priorityQueue.add(zzgfaVar);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.zza.execute(((zzgfa) it.next()).zza);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

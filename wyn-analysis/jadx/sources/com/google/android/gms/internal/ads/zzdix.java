package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class zzdix {
    protected final Map zza = new HashMap();

    public zzdix(Set set) {
        zzr(set);
    }

    public final synchronized void zzp(zzdky zzdkyVar) {
        zzq(zzdkyVar.zza, zzdkyVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzdky) it.next());
        }
    }

    public final synchronized void zzs(final zzdiw zzdiwVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiv
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdiwVar.zza(key);
                    } catch (Throwable th) {
                        C6.n.f1857D.f1868h.zzi(th, "EventEmitter.notify");
                        G6.L.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}

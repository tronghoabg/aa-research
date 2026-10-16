package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
final class zzaty implements zzatk {
    private final Map zza = new HashMap();
    private final zzasx zzb;
    private final BlockingQueue zzc;
    private final zzatc zzd;

    public zzaty(zzasx zzasxVar, BlockingQueue blockingQueue, zzatc zzatcVar) {
        this.zzd = zzatcVar;
        this.zzb = zzasxVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void zza(zzatl zzatlVar, zzatr zzatrVar) {
        List list;
        zzasu zzasuVar = zzatrVar.zzb;
        if (zzasuVar == null || zzasuVar.zza(System.currentTimeMillis())) {
            zzb(zzatlVar);
            return;
        }
        String strZzi = zzatlVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzatx.zzb) {
                zzatx.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzatl) it.next(), zzatrVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void zzb(zzatl zzatlVar) {
        try {
            Map map = this.zza;
            String strZzi = zzatlVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzatx.zzb) {
                zzatx.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            zzatl zzatlVar2 = (zzatl) list.remove(0);
            map.put(strZzi, list);
            zzatlVar2.zzu(this);
            try {
                this.zzc.put(zzatlVar2);
            } catch (InterruptedException e7) {
                zzatx.zzc("Couldn't add request to queue. %s", e7.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzc(zzatl zzatlVar) {
        try {
            Map map = this.zza;
            String strZzi = zzatlVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                zzatlVar.zzu(this);
                if (zzatx.zzb) {
                    zzatx.zzb("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzatlVar.zzc("waiting-for-response");
            arrayList.add(zzatlVar);
            map.put(strZzi, arrayList);
            if (zzatx.zzb) {
                zzatx.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}

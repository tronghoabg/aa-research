package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgfq {
    private final zzimt zza;
    private final zzimt zzb;
    private final ExecutorService zzc;
    private final zzimt zzd;
    private p8.p zze = null;

    public zzgfq(zzimt zzimtVar, zzimt zzimtVar2, ExecutorService executorService, zzimt zzimtVar3) {
        this.zza = zzimtVar;
        this.zzb = zzimtVar2;
        this.zzc = executorService;
        this.zzd = zzimtVar3;
    }

    public final synchronized p8.p zza() {
        try {
            p8.p pVar = this.zze;
            if (pVar != null) {
                return pVar;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgfo) it.next()).zza());
            }
            zzgqo zzgqoVar = (zzgqo) this.zzd.zzb();
            p8.p pVarZzk = zzhcf.zzk(zzhcf.zzm(arrayList), zzgfp.zza, this.zzc);
            zzgqoVar.zze(2, pVarZzk);
            this.zze = pVarZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgfo) it2.next()).zza();
            }
            p8.p pVar2 = this.zze;
            if (pVar2 != null) {
                return pVar2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized p8.p zzb() {
        p8.p pVar;
        pVar = this.zze;
        if (pVar == null) {
            throw null;
        }
        return pVar;
    }
}

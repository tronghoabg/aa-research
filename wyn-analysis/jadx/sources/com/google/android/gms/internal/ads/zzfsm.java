package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfsm {
    private final Context zza;
    private final Executor zzb;
    private final zzhcq zzc;
    private final H6.p zzd;
    private final zzfse zze;
    private final zzfqt zzf;
    private final zzcnn zzg;

    public zzfsm(Context context, Executor executor, zzhcq zzhcqVar, H6.p pVar, zzfse zzfseVar, zzfqt zzfqtVar, zzcnn zzcnnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhcqVar;
        this.zzd = pVar;
        this.zze = zzfseVar;
        this.zzf = zzfqtVar;
        this.zzg = zzcnnVar;
    }

    public final void zza(List list, H6.q qVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), qVar, null, null);
        }
    }

    public final void zzb(final String str, H6.q qVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        p8.p pVarZzc;
        zzfqg zzfqgVarA = null;
        if (zzfqt.zza() && ((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqgVarA = u.a(this.zza, 14);
            zzfqgVarA.zza();
        }
        if (qVar != null) {
            pVarZzc = new zzfsd(qVar.f4969a, this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            pVarZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsl
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzhcf.zzr(pVarZzc, new zzfsk(this, zzfqgVarA, zzfqqVar, zzdfoVar), this.zzb);
    }

    public final H6.o zzc(String str) {
        zzbio zzbioVar = zzbix.zzko;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C6.n nVar = C6.n.f1857D;
            if (nVar.f1863c.F(str) || nVar.f1863c.G(str)) {
                String strZzb = this.zzg.zzb();
                HashMap map = new HashMap();
                if (strZzb != null) {
                    map.put((String) c0395s.f2492c.zzd(zzbix.zzkp), strZzb);
                }
                return this.zzd.a(map, str);
            }
        }
        return this.zzd.a(null, str);
    }

    public final /* synthetic */ H6.p zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfqt zze() {
        return this.zzf;
    }
}

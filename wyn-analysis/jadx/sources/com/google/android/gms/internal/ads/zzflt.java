package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzflt {
    private final zzfkn zza;
    private final zzfkq zzb;
    private final zzfsm zzc;
    private final zzfse zzd;
    private final zzfqq zze;
    private final zzctq zzf;

    public zzflt(zzfsm zzfsmVar, zzfse zzfseVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar, zzfqq zzfqqVar) {
        this.zza = zzfknVar;
        this.zzb = zzfkqVar;
        this.zzc = zzfsmVar;
        this.zzd = zzfseVar;
        this.zzf = zzctqVar;
        this.zze = zzfqqVar;
    }

    public final void zza(List list, zzdfo zzdfoVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdfoVar);
        }
    }

    public final void zzb(List list, int i5) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzhcf.zzr((((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlH)).booleanValue() && zzctq.zzc(str)) ? this.zzf.zzb(str, C0392q.f2477g.f2482e) : zzhcf.zza(str), new zzfls(this, i5), zzcfy.zza);
        }
    }

    public final void zzc(String str, int i5, zzdfo zzdfoVar) {
        zzfkn zzfknVar = this.zza;
        if (zzfknVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i5);
            return;
        }
        this.zzc.zzb(str, zzfknVar.zzax, this.zze, zzdfoVar);
    }
}

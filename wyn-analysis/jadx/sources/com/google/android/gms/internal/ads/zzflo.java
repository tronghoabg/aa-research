package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;

/* loaded from: classes3.dex */
final class zzflo implements zzhcc {
    final /* synthetic */ zzclb zza;
    final /* synthetic */ zzctq zzb;
    final /* synthetic */ zzfsm zzc;
    final /* synthetic */ zzeko zzd;

    public zzflo(zzclb zzclbVar, zzctq zzctqVar, zzfsm zzfsmVar, zzeko zzekoVar) {
        this.zza = zzclbVar;
        this.zzb = zzctqVar;
        this.zzc = zzfsmVar;
        this.zzd = zzekoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        zzctq zzctqVar;
        String str = (String) obj;
        zzclb zzclbVar = this.zza;
        zzfkn zzfknVarZzC = zzclbVar.zzC();
        if (zzfknVarZzC != null && !zzfknVarZzC.zzai) {
            H6.q qVar = zzfknVarZzC.zzax;
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlH)).booleanValue() && (zzctqVar = this.zzb) != null && zzctq.zzc(str)) {
                zzctqVar.zza(str, this.zzc, C0392q.f2477g.f2482e, qVar);
                return;
            } else {
                this.zzc.zzb(str, qVar, null, null);
                return;
            }
        }
        zzfkq zzfkqVarZzaC = zzclbVar.zzaC();
        if (zzfkqVarZzaC == null) {
            C6.n.f1857D.f1868h.zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zZzt = nVar.f1868h.zzt(zzclbVar.getContext());
        boolean z2 = false;
        boolean z10 = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhp)).booleanValue() && zzfknVarZzC != null && zzfknVarZzC.zzS;
        if (zzfknVarZzC != null && zzfknVarZzC.zzad != null) {
            z2 = true;
        }
        int i5 = 2;
        if (!zZzt && !z10 && !z2) {
            i5 = 1;
        }
        this.zzd.zze(new zzekq(jCurrentTimeMillis, zzfkqVarZzaC.zzb, str, i5));
    }
}

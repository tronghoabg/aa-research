package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzdpm implements zzhcc {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdpw zzb;

    public zzdpm(zzdpw zzdpwVar, String str, boolean z2) {
        Objects.requireNonNull(zzdpwVar);
        this.zzb = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgy)).booleanValue()) {
            C6.n.f1857D.f1868h.zzi(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpw zzdpwVar = this.zzb;
        zzdpwVar.zzZ().zzo((zzclb) obj);
        String str = this.zza;
        zzcgd zzcgdVarZzY = zzdpwVar.zzZ().zzY();
        zzelv zzelvVarZzL = zzdpwVar.zzL(str, true);
        if (zzelvVarZzL != null && zzcgdVarZzY != null) {
            zzcgdVarZzY.zzc(zzelvVarZzL);
        } else if (zzcgdVarZzY != null) {
            zzcgdVarZzY.cancel(false);
        }
    }
}

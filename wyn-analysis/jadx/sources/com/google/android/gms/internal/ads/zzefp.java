package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes3.dex */
final class zzefp implements zzhcc {
    final /* synthetic */ zzefs zza;

    public zzefp(zzefs zzefsVar) {
        Objects.requireNonNull(zzefsVar);
        this.zza = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) throws NumberFormatException {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue()) {
            Matcher matcher = zzefs.zzh.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzefs zzefsVar = this.zza;
                zzefsVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue()) {
            zzefs zzefsVar = this.zza;
            zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
            zzefsVar.zzc().zzc(zzfkqVar.zzf);
            zzefsVar.zzc().zze(zzfkqVar.zzg);
        }
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzewi implements zzfcs {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzczq zze;
    private final zzfmo zzf;
    private final zzflg zzg;
    private final G6.N zzh = C6.n.f1857D.f1868h.zzp();
    private final zzdzo zzi;
    private final zzdae zzj;

    public zzewi(Context context, String str, String str2, zzczq zzczqVar, zzfmo zzfmoVar, zzflg zzflgVar, zzdzo zzdzoVar, zzdae zzdaeVar, long j8) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzczqVar;
        this.zzf = zzfmoVar;
        this.zzg = zzflgVar;
        this.zzi = zzdzoVar;
        this.zzj = zzdaeVar;
        this.zzd = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        Bundle bundle = new Bundle();
        zzdzo zzdzoVar = this.zzi;
        Map mapZzc = zzdzoVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue()) {
            C6.n.f1857D.k.getClass();
            zzdzoVar.zzd("tsacc", String.valueOf(System.currentTimeMillis() - this.zzd));
            zzdzoVar.zzd("foreground", true != U.g(this.zza) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
        }
        zzczq zzczqVar = this.zze;
        zzflg zzflgVar = this.zzg;
        zzczqVar.zzi(zzflgVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzhcf.zza(new zzewj(this.zza, bundle, str, this.zzc, this.zzh, zzflgVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 12;
    }
}

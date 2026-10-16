package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzboy implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzgrg zzgrgVar;
        F6.r rVar = C6.n.f1857D.f1878s;
        if (!rVar.f4011b || (zzgrgVar = (zzgrg) rVar.f4015f) == null) {
            G6.L.k("LastMileDelivery not connected");
            return;
        }
        zzgre zzgreVarZzc = zzgrf.zzc();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznh)).booleanValue() || TextUtils.isEmpty((String) rVar.f4013d)) {
            String str = (String) rVar.f4012c;
            if (str != null) {
                zzgreVarZzc.zza(str);
            } else {
                rVar.j("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgreVarZzc.zzb((String) rVar.f4013d);
        }
        zzgrgVar.zzb(zzgreVarZzc.zzc(), (S3.l) rVar.f4016g);
    }
}

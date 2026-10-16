package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdou implements zzbpx {
    private final WeakReference zza;
    private final zzfsm zzb;
    private final H6.q zzc;
    private final zzfqq zzd;

    public /* synthetic */ zzdou(zzdov zzdovVar, zzfsm zzfsmVar, H6.q qVar, zzfqq zzfqqVar, byte[] bArr) {
        this.zza = new WeakReference(zzdovVar);
        this.zzb = zzfsmVar;
        this.zzc = qVar;
        this.zzd = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        String str = (String) map.get("u");
        if (zzdovVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdovVar.zzF());
    }
}

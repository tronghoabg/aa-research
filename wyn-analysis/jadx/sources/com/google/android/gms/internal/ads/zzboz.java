package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzboz implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            zzgcv.zzh(zzclbVar.getContext()).zzk();
            zzgcw.zzh(zzclbVar.getContext()).zzj();
            zzgcx.zza(zzclbVar.getContext()).zzb(null);
        } catch (IOException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}

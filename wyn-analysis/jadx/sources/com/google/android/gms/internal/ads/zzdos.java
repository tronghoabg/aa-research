package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdos implements zzbpx {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        if (zzdovVar == null) {
            return;
        }
        zzdovVar.zzD().onAdClicked();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
            zzdovVar.zzE().zzdu();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdovVar.zzE().zzdR();
        }
    }
}

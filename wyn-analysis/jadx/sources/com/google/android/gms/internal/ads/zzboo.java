package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzboo implements zzbpx {
    private final zzbop zza;

    public zzboo(zzbop zzbopVar) {
        this.zza = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("App event with no name parameter.");
        }
    }
}

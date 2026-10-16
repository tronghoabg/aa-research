package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbpj implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if ("pause".equals(str)) {
            zzclbVar.zzdk();
        } else if ("resume".equals(str)) {
            zzclbVar.zzdl();
        }
    }
}

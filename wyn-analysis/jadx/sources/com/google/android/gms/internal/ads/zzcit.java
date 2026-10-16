package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcit implements zzbpx {
    private final zzcis zza;

    public zzcit(zzcis zzcisVar) {
        this.zza = zzcisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (str == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.zza(str2);
            } else {
                int i10 = G6.L.f4523b;
                H6.l.f("src missing from video GMSG.");
            }
        }
    }
}

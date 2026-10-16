package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbqs implements zzbpx {
    private final zzecz zza;

    public zzbqs(zzecz zzeczVar) {
        AbstractC1732v.j(zzeczVar, "The Inspector Manager must not be null");
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            return;
        }
        long j8 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j8 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get(HandleInvocationsFromAdViewer.KEY_EXTRAS), j8);
    }
}

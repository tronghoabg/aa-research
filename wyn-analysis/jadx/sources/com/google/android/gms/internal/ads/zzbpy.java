package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbpy implements zzbpx {
    private final zzecz zza;

    public zzbpy(zzecz zzeczVar) {
        AbstractC1732v.j(zzeczVar, "The Inspector Manager must not be null");
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzcte implements zzcsa {
    private final zzecz zza;

    public zzcte(zzecz zzeczVar) {
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}

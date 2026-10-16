package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbom implements zzbpx {
    private final zzbon zza;

    public zzbom(zzbon zzbonVar) {
        this.zza = zzbonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            int i5 = G6.L.f4523b;
            H6.l.e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleD0 = null;
        if (map.containsKey("info")) {
            try {
                bundleD0 = Fe.e.d0(new JSONObject((String) map.get("info")));
            } catch (JSONException e7) {
                int i10 = G6.L.f4523b;
                H6.l.d("Failed to convert ad metadata to JSON.", e7);
            }
        }
        if (bundleD0 != null) {
            this.zza.zza(str, bundleD0);
        } else {
            int i11 = G6.L.f4523b;
            H6.l.c("Failed to convert ad metadata to Bundle.");
        }
    }
}

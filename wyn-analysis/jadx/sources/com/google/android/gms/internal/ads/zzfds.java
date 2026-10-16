package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfds implements zzfcq {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzgcr zzc;

    public zzfds(AdvertisingIdClient.Info info, String str, zzgcr zzgcrVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectC0 = Fe.e.c0("pii", (JSONObject) obj);
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectC0.put("pdid", str);
                    jSONObjectC0.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectC0.put("rdid", info.getId());
            jSONObjectC0.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectC0.put("idtype", "adid");
            zzgcr zzgcrVar = this.zzc;
            if (zzgcrVar.zzc()) {
                jSONObjectC0.put("paidv1_id_android_3p", zzgcrVar.zza());
                jSONObjectC0.put("paidv1_creation_time_android_3p", zzgcrVar.zzb());
            }
        } catch (JSONException e7) {
            G6.L.l("Failed putting Ad ID.", e7);
        }
    }
}

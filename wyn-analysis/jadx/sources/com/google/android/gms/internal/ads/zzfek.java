package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzfek implements zzfcs {
    private final JSONObject zza;

    public zzfek(Context context) {
        this.zza = zzcbg.zzc(context, H6.a.V());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznF)).booleanValue() ? zzhcf.zza(zzfei.zza) : zzhcf.zza(new zzfcq() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzfcq
            public final /* synthetic */ void zza(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            G6.L.k("Failed putting version constants.");
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbos implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzclb zzclbVar = (zzclb) obj;
        zzbly zzblyVarZzar = zzclbVar.zzar();
        if (zzblyVarZzar == null || (jSONObjectZzc = zzblyVarZzar.zzc()) == null) {
            zzclbVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzclbVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}

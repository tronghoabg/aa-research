package com.google.android.gms.internal.ads;

import D6.C0395s;
import cb.AbstractC1593a;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdtp {
    private final Executor zza;
    private final zzdtk zzb;
    private final zzdzo zzc;

    public zzdtp(Executor executor, zzdtk zzdtkVar, zzdzo zzdzoVar) {
        this.zza = executor;
        this.zzb = zzdtkVar;
        this.zzc = zzdzoVar;
    }

    public final p8.p zza(JSONObject jSONObject, String str) {
        p8.p pVarZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzhcf.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzc, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
            if (jSONObjectOptJSONObject == null) {
                pVarZza = zzhcf.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME);
                if (strOptString == null) {
                    pVarZza = zzhcf.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    pVarZza = "string".equals(strOptString2) ? zzhcf.zza(new zzdtm(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzhcf.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdtm(strOptString, (zzblw) obj);
                        }
                    }, this.zza) : zzhcf.zza(null);
                }
            }
            arrayList.add(pVarZza);
        }
        return zzhcf.zzk(zzhcf.zzm(arrayList), zzdto.zza, this.zza);
    }
}

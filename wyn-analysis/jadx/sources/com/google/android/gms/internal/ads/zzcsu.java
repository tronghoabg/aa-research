package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinMediationProvider;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcsu implements zzcsb {
    private final M6.d zza;

    public zzcsu(M6.d dVar) {
        this.zza = dVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb
    public final void zza(JSONObject jSONObject) {
        M6.c cVar;
        M6.b bVar;
        M6.a aVar = null;
        if (jSONObject.has("AvailableMemoryTier")) {
            int iOptInt = jSONObject.optInt("AvailableMemoryTier", -1);
            M6.b[] bVarArrValues = M6.b.values();
            int length = bVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i5];
                if (bVar.f7519a == iOptInt) {
                    break;
                } else {
                    i5++;
                }
            }
            if (bVar != null) {
                this.zza.f7526d.set(bVar);
            }
        }
        if (jSONObject.has("AvailableProcessorTier")) {
            int iOptInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
            M6.c[] cVarArrValues = M6.c.values();
            int length2 = cVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i10];
                if (cVar.f7522a == iOptInt2) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null) {
                this.zza.f7527e.set(cVar);
            }
        }
        if (jSONObject.has("AdvertisedMemoryTier")) {
            int iOptInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
            M6.a[] aVarArrValues = M6.a.values();
            int length3 = aVarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length3) {
                    break;
                }
                M6.a aVar2 = aVarArrValues[i11];
                if (aVar2.f7516a == iOptInt3) {
                    aVar = aVar2;
                    break;
                }
                i11++;
            }
            if (aVar != null) {
                M6.d dVar = this.zza;
                synchronized (dVar) {
                    dVar.f7525c.set(aVar);
                    dVar.f7523a.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0).edit().putInt("advertised_memory_tier", aVar.f7516a).apply();
                }
            }
        }
    }
}

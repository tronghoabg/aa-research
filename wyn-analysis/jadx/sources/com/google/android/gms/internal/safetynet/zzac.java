package com.google.android.gms.internal.safetynet;

import C7.b;
import Xd.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzac implements t {
    private Status zza;
    private final b zzb;
    private String zzc;
    private long zzd;
    private byte[] zze;

    public zzac(Status status, b bVar) {
        this.zza = status;
        this.zzb = bVar;
        this.zzc = null;
        if (bVar != null) {
            this.zzc = bVar.f1889a;
            this.zzd = bVar.f1892d;
            this.zze = bVar.f1893e;
        } else if (status.V()) {
            this.zza = new Status(8, null, null, null);
        }
    }

    public final List<c> getDetectedThreats() throws JSONException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        String str = this.zzc;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("matches");
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    try {
                        Integer.parseInt(jSONArray.getJSONObject(i5).getString("threat_type"));
                        arrayList.add(new c(15));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final long getLastUpdateTimeMs() {
        return this.zzd;
    }

    public final String getMetadata() {
        return this.zzc;
    }

    public final byte[] getState() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }
}

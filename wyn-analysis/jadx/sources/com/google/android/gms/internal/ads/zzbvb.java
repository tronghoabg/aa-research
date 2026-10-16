package com.google.android.gms.internal.ads;

import G6.U;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbvb implements zzhbn {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final p8.p zzb;

    public zzbvb(p8.p pVar, String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        this.zzb = pVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final p8.p zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final p8.p zzb(final Object obj) {
        return zzhcf.zzj(this.zzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbva
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj2) {
                return this.zza.zzc(obj, (zzbuc) obj2);
            }
        }, zzcfy.zzh);
    }

    public final p8.p zzc(Object obj, zzbuc zzbucVar) throws JSONException {
        zzcgd zzcgdVar = new zzcgd();
        U u10 = C6.n.f1857D.f1863c;
        String string = UUID.randomUUID().toString();
        zzbpw.zzo.zzb(string, new zzbuz(this, zzcgdVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbucVar.zzb(this.zza, jSONObject);
        return zzcgdVar;
    }
}

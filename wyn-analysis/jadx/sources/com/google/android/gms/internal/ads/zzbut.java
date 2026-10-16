package com.google.android.gms.internal.ads;

import G6.U;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbut implements zzbuf {
    private final zzbuh zza;
    private final zzbui zzb;
    private final zzbub zzc;
    private final String zzd;

    public zzbut(zzbub zzbubVar, String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        this.zzc = zzbubVar;
        this.zzd = str;
        this.zzb = zzbuiVar;
        this.zza = zzbuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final p8.p zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final p8.p zzb(Object obj) {
        zzcgd zzcgdVar = new zzcgd();
        zzbtv zzbtvVarZzb = this.zzc.zzb(null);
        G6.L.k("callJs > getEngine: Promise created");
        zzbtvVarZzb.zze(new zzbuq(this, zzbtvVarZzb, obj, zzcgdVar), new zzbur(this, zzcgdVar, zzbtvVarZzb));
        return zzcgdVar;
    }

    public final void zzc(zzbtv zzbtvVar, zzbuc zzbucVar, Object obj, zzcgd zzcgdVar) throws JSONException {
        try {
            U u10 = C6.n.f1857D.f1863c;
            String string = UUID.randomUUID().toString();
            zzbpw.zzo.zzb(string, new zzbus(this, zzbtvVar, zzcgdVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbucVar.zzb(this.zzd, jSONObject);
        } catch (Exception e7) {
            try {
                zzcgdVar.zzd(e7);
                int i5 = G6.L.f4523b;
                H6.l.d("Unable to invokeJavascript", e7);
            } finally {
                zzbtvVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbuh zzd() {
        return this.zza;
    }
}

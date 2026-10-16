package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeqv implements zzemc {
    private final zzerz zza;
    private final zzdxk zzb;

    public zzeqv(zzerz zzerzVar, zzdxk zzdxkVar) {
        this.zza = zzerzVar;
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        zzbxi zzbxiVarZzb;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcu)).booleanValue()) {
            try {
                zzbxiVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Coundn't create RTB adapter: ", e7);
                zzbxiVarZzb = null;
            }
        } else {
            zzbxiVarZzb = this.zza.zzb(str);
        }
        if (zzbxiVarZzb == null) {
            return null;
        }
        return new zzemd(zzbxiVarZzb, new zzenp(), str);
    }
}

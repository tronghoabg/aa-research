package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfxh extends zzfxd {
    public zzfxh(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(zzfwwVar, hashSet, jSONObject, j8);
    }

    private final void zzc(String str) {
        zzfvs zzfvsVarZza = zzfvs.zza();
        if (zzfvsVarZza != null) {
            for (zzfuy zzfuyVar : zzfvsVarZza.zze()) {
                if (((zzfxd) this).zza.contains(zzfuyVar.zzh())) {
                    zzfuyVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfxe
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}

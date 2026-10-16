package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfxi extends zzfxd {
    public zzfxi(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(zzfwwVar, hashSet, jSONObject, j8);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfww zzfwwVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfwo.zzg(jSONObject, zzfwwVar.zzd())) {
            return null;
        }
        zzfwwVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfvs zzfvsVarZza;
        if (!TextUtils.isEmpty(str) && (zzfvsVarZza = zzfvs.zza()) != null) {
            for (zzfuy zzfuyVar : zzfvsVarZza.zze()) {
                if (((zzfxd) this).zza.contains(zzfuyVar.zzh())) {
                    zzfuyVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}

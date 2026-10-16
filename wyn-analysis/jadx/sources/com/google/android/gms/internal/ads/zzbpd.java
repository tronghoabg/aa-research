package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbpd implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzclbVar.getContext()).edit();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                editorEdit.remove(jSONArray.getString(i5));
            }
            editorEdit.apply();
        } catch (JSONException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "GMSG clear local storage keys handler");
        }
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbov implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzclb zzclbVar = (zzclb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            G6.L.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgrz zzgrzVarZzl = zzgsa.zzl();
        zzgrzVarZzl.zzb((String) map.get("appId"));
        zzgrzVarZzl.zzg(zzclbVar.getWidth());
        zzgrzVarZzl.zza(zzclbVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgrzVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgrzVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgrzVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgrzVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgrzVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            C6.n.f1857D.f1878s.i(zzclbVar, zzgrzVarZzl.zzi());
        } catch (NullPointerException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "DefaultGmsgHandlers.ShowLMDOverlay");
            G6.L.k("Missing parameters for LMD Overlay show request");
        }
    }
}

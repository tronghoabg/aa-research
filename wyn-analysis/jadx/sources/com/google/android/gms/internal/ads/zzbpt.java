package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbpt implements zzbpx {
    static final /* synthetic */ zzbpt zza = new zzbpt();

    private /* synthetic */ zzbpt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcmu zzcmuVar = (zzcmu) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i5 = Integer.parseInt(str);
            int i10 = Integer.parseInt(str2);
            int i11 = Integer.parseInt(str3);
            zzbaw zzbawVarZzS = zzcmuVar.zzS();
            if (zzbawVarZzS != null) {
                zzbawVarZzS.zzb().zze(i5, i10, i11);
            }
        } catch (NumberFormatException unused) {
            int i12 = G6.L.f4523b;
            H6.l.f("Could not parse touch parameters from gmsg.");
        }
    }
}

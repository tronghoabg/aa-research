package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgq implements e {
    static final zzgq zza = new zzgq();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        zzbc zzbcVarO = a.o(1);
        HashMap map = new HashMap();
        map.put(zzbcVarO.annotationType(), zzbcVarO);
        zzb = new d("options", f.n(map));
        zzbc zzbcVarO2 = a.o(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarO2.annotationType(), zzbcVarO2);
        zzc = new d("roughDownloadDurationMs", f.n(map2));
        zzbc zzbcVarO3 = a.o(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarO3.annotationType(), zzbcVarO3);
        zzd = new d("errorCode", f.n(map3));
        zzbc zzbcVarO4 = a.o(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarO4.annotationType(), zzbcVarO4);
        zze = new d("exactDownloadDurationMs", f.n(map4));
        zzbc zzbcVarO5 = a.o(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarO5.annotationType(), zzbcVarO5);
        zzf = new d("downloadStatus", f.n(map5));
        zzbc zzbcVarO6 = a.o(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarO6.annotationType(), zzbcVarO6);
        zzg = new d("downloadFailureStatus", f.n(map6));
        zzbc zzbcVarO7 = a.o(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarO7.annotationType(), zzbcVarO7);
        zzh = new d("mddDownloadErrorCodes", f.n(map7));
    }

    private zzgq() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzncVar.zzc());
        fVar.add(zzc, zzncVar.zzf());
        fVar.add(zzd, zzncVar.zza());
        fVar.add(zze, zzncVar.zze());
        fVar.add(zzf, zzncVar.zzb());
        fVar.add(zzg, zzncVar.zzd());
        fVar.add(zzh, (Object) null);
    }
}

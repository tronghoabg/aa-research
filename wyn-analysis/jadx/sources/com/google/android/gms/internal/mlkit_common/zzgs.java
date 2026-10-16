package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgs implements e {
    static final zzgs zza = new zzgs();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        zzbc zzbcVarO = a.o(1);
        HashMap map = new HashMap();
        map.put(zzbcVarO.annotationType(), zzbcVarO);
        zzb = new d("modelInfo", f.n(map));
        zzbc zzbcVarO2 = a.o(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarO2.annotationType(), zzbcVarO2);
        zzc = new d("initialDownloadConditions", f.n(map2));
        zzbc zzbcVarO3 = a.o(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarO3.annotationType(), zzbcVarO3);
        zzd = new d("updateDownloadConditions", f.n(map3));
        zzbc zzbcVarO4 = a.o(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarO4.annotationType(), zzbcVarO4);
        zze = new d("isModelUpdateEnabled", f.n(map4));
    }

    private zzgs() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, ((zznl) obj).zza());
        fVar.add(zzc, (Object) null);
        fVar.add(zzd, (Object) null);
        fVar.add(zze, (Object) null);
    }
}

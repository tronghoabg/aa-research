package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzfk implements e {
    static final zzfk zza = new zzfk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        zzbc zzbcVarO = a.o(1);
        HashMap map = new HashMap();
        map.put(zzbcVarO.annotationType(), zzbcVarO);
        zzb = new d("modelType", f.n(map));
        zzbc zzbcVarO2 = a.o(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarO2.annotationType(), zzbcVarO2);
        zzc = new d("isSuccessful", f.n(map2));
        zzbc zzbcVarO3 = a.o(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarO3.annotationType(), zzbcVarO3);
        zzd = new d("modelName", f.n(map3));
    }

    private zzfk() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzlo zzloVar = (zzlo) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzloVar.zza());
        fVar.add(zzc, zzloVar.zzb());
        fVar.add(zzd, (Object) null);
    }
}

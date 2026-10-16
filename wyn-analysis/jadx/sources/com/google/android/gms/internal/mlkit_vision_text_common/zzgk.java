package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgk implements e {
    static final zzgk zza = new zzgk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("errorCode", f.n(map));
        zzcx zzcxVarR2 = a.r(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("hasResult", f.n(map2));
        zzcx zzcxVarR3 = a.r(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("isColdCall", f.n(map3));
        zzcx zzcxVarR4 = a.r(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarR4.annotationType(), zzcxVarR4);
        zze = new d("imageInfo", f.n(map4));
        zzcx zzcxVarR5 = a.r(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarR5.annotationType(), zzcxVarR5);
        zzf = new d("recognizerOptions", f.n(map5));
    }

    private zzgk() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzes zzesVar = (zzes) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzesVar.zza());
        fVar.add(zzc, (Object) null);
        fVar.add(zzd, zzesVar.zzc());
        fVar.add(zze, (Object) null);
        fVar.add(zzf, zzesVar.zzb());
    }
}

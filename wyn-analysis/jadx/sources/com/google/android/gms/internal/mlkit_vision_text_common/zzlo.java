package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzlo implements e {
    static final zzlo zza = new zzlo();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        zzcx zzcxVarR = a.r(3);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("languageOption", f.n(map));
        zzcx zzcxVarR2 = a.r(4);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("isUsingLegacyApi", f.n(map2));
        zzcx zzcxVarR3 = a.r(5);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("sdkVersion", f.n(map3));
    }

    private zzlo() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, ((zzsd) obj).zza());
        fVar.add(zzc, (Object) null);
        fVar.add(zzd, (Object) null);
    }
}

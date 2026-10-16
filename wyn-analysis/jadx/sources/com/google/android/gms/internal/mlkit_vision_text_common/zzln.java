package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzln implements e {
    static final zzln zza = new zzln();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("inferenceCommonLogEvent", f.n(map));
        zzcx zzcxVarR2 = a.r(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("imageInfo", f.n(map2));
        zzcx zzcxVarR3 = a.r(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("recognizerOptions", f.n(map3));
    }

    private zzln() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzrz zzrzVar = (zzrz) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzrzVar.zzb());
        fVar.add(zzc, zzrzVar.zza());
        fVar.add(zzd, zzrzVar.zzc());
    }
}

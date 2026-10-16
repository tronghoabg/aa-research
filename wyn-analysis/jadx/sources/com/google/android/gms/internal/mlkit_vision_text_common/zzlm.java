package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzlm implements e {
    static final zzlm zza = new zzlm();
    private static final d zzb;

    static {
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("errorCode", f.n(map));
    }

    private zzlm() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((h9.f) obj2).add(zzb, ((zzrw) obj).zza());
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzfl implements e {
    static final zzfl zza = new zzfl();
    private static final d zzb;
    private static final d zzc;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("errorCode", f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("durationMs", f.n(map2));
    }

    private zzfl() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

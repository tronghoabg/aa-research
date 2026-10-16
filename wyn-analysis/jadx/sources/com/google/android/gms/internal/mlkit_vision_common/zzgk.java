package com.google.android.gms.internal.mlkit_vision_common;

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

    static {
        zzai zzaiVarQ = a.q(3);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("languageOption", f.n(map));
        zzai zzaiVarQ2 = a.q(4);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("isUsingLegacyApi", f.n(map2));
        zzai zzaiVarQ3 = a.q(5);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("sdkVersion", f.n(map3));
    }

    private zzgk() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

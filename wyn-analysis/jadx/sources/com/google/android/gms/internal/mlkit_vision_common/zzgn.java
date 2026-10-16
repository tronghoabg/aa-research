package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.ads.metadata.MediationMetaData;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgn implements e {
    static final zzgn zza = new zzgn();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d(MediationMetaData.KEY_NAME, f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("stages", f.n(map2));
        zzai zzaiVarQ3 = a.q(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("runMiniBenchmark", f.n(map3));
    }

    private zzgn() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

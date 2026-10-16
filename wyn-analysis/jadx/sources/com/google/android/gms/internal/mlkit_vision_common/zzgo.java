package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.ads.metadata.MediationMetaData;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgo implements e {
    static final zzgo zza = new zzgo();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("pipelineNamespace", f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d(MediationMetaData.KEY_NAME, f.n(map2));
        zzai zzaiVarQ3 = a.q(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("clientLibraryName", f.n(map3));
        zzai zzaiVarQ4 = a.q(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarQ4.annotationType(), zzaiVarQ4);
        zze = new d("clientLibraryVersion", f.n(map4));
        zzai zzaiVarQ5 = a.q(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarQ5.annotationType(), zzaiVarQ5);
        zzf = new d("minClientLibraryVersion", f.n(map5));
        zzai zzaiVarQ6 = a.q(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarQ6.annotationType(), zzaiVarQ6);
        zzg = new d("maxClientLibraryVersion", f.n(map6));
        zzai zzaiVarQ7 = a.q(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarQ7.annotationType(), zzaiVarQ7);
        zzh = new d("sourceProduct", f.n(map7));
    }

    private zzgo() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

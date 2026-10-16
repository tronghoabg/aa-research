package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzdq implements e {
    static final zzdq zza = new zzdq();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("inferenceCommonLogEvent", f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("options", f.n(map2));
        zzai zzaiVarQ3 = a.q(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("inputsFormats", f.n(map3));
        zzai zzaiVarQ4 = a.q(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarQ4.annotationType(), zzaiVarQ4);
        zze = new d("outputFormats", f.n(map4));
        zzai zzaiVarQ5 = a.q(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarQ5.annotationType(), zzaiVarQ5);
        zzf = new d("modelInitializationMs", f.n(map5));
    }

    private zzdq() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

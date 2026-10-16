package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgp implements e {
    static final zzgp zza = new zzgp();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;
    private static final d zzl;
    private static final d zzm;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("deviceInfo", f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("nnapiInfo", f.n(map2));
        zzai zzaiVarQ3 = a.q(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("gpuInfo", f.n(map3));
        zzai zzaiVarQ4 = a.q(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarQ4.annotationType(), zzaiVarQ4);
        zze = new d("pipelineIdentifier", f.n(map4));
        zzai zzaiVarQ5 = a.q(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarQ5.annotationType(), zzaiVarQ5);
        zzf = new d("acceptedConfigurations", f.n(map5));
        zzai zzaiVarQ6 = a.q(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarQ6.annotationType(), zzaiVarQ6);
        zzg = new d(HandleInvocationsFromAdViewer.KEY_ACTION, f.n(map6));
        zzai zzaiVarQ7 = a.q(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarQ7.annotationType(), zzaiVarQ7);
        zzh = new d("status", f.n(map7));
        zzai zzaiVarQ8 = a.q(8);
        HashMap map8 = new HashMap();
        map8.put(zzaiVarQ8.annotationType(), zzaiVarQ8);
        zzi = new d("customErrors", f.n(map8));
        zzai zzaiVarQ9 = a.q(9);
        HashMap map9 = new HashMap();
        map9.put(zzaiVarQ9.annotationType(), zzaiVarQ9);
        zzj = new d("benchmarkStatus", f.n(map9));
        zzai zzaiVarQ10 = a.q(10);
        HashMap map10 = new HashMap();
        map10.put(zzaiVarQ10.annotationType(), zzaiVarQ10);
        zzk = new d("validationTestResult", f.n(map10));
        zzai zzaiVarQ11 = a.q(11);
        HashMap map11 = new HashMap();
        map11.put(zzaiVarQ11.annotationType(), zzaiVarQ11);
        zzl = new d("timestampUs", f.n(map11));
        zzai zzaiVarQ12 = a.q(12);
        HashMap map12 = new HashMap();
        map12.put(zzaiVarQ12.annotationType(), zzaiVarQ12);
        zzm = new d("elapsedUs", f.n(map12));
    }

    private zzgp() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgu implements e {
    static final zzgu zza = new zzgu();
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
    private static final d zzn;
    private static final d zzo;

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d("appId", f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d("appVersion", f.n(map2));
        zzai zzaiVarQ3 = a.q(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarQ3.annotationType(), zzaiVarQ3);
        zzd = new d("firebaseProjectId", f.n(map3));
        zzai zzaiVarQ4 = a.q(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarQ4.annotationType(), zzaiVarQ4);
        zze = new d("mlSdkVersion", f.n(map4));
        zzai zzaiVarQ5 = a.q(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarQ5.annotationType(), zzaiVarQ5);
        zzf = new d("tfliteSchemaVersion", f.n(map5));
        zzai zzaiVarQ6 = a.q(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarQ6.annotationType(), zzaiVarQ6);
        zzg = new d("gcmSenderId", f.n(map6));
        zzai zzaiVarQ7 = a.q(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarQ7.annotationType(), zzaiVarQ7);
        zzh = new d("apiKey", f.n(map7));
        zzai zzaiVarQ8 = a.q(8);
        HashMap map8 = new HashMap();
        map8.put(zzaiVarQ8.annotationType(), zzaiVarQ8);
        zzi = new d("languages", f.n(map8));
        zzai zzaiVarQ9 = a.q(9);
        HashMap map9 = new HashMap();
        map9.put(zzaiVarQ9.annotationType(), zzaiVarQ9);
        zzj = new d("mlSdkInstanceId", f.n(map9));
        zzai zzaiVarQ10 = a.q(10);
        HashMap map10 = new HashMap();
        map10.put(zzaiVarQ10.annotationType(), zzaiVarQ10);
        zzk = new d("isClearcutClient", f.n(map10));
        zzai zzaiVarQ11 = a.q(11);
        HashMap map11 = new HashMap();
        map11.put(zzaiVarQ11.annotationType(), zzaiVarQ11);
        zzl = new d("isStandaloneMlkit", f.n(map11));
        zzai zzaiVarQ12 = a.q(12);
        HashMap map12 = new HashMap();
        map12.put(zzaiVarQ12.annotationType(), zzaiVarQ12);
        zzm = new d("isJsonLogging", f.n(map12));
        zzai zzaiVarQ13 = a.q(13);
        HashMap map13 = new HashMap();
        map13.put(zzaiVarQ13.annotationType(), zzaiVarQ13);
        zzn = new d("buildLevel", f.n(map13));
        zzai zzaiVarQ14 = a.q(14);
        HashMap map14 = new HashMap();
        map14.put(zzaiVarQ14.annotationType(), zzaiVarQ14);
        zzo = new d("optionalModuleVersion", f.n(map14));
    }

    private zzgu() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzla zzlaVar = (zzla) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzlaVar.zzg());
        fVar.add(zzc, zzlaVar.zzh());
        fVar.add(zzd, (Object) null);
        fVar.add(zze, zzlaVar.zzj());
        fVar.add(zzf, zzlaVar.zzk());
        fVar.add(zzg, (Object) null);
        fVar.add(zzh, (Object) null);
        fVar.add(zzi, zzlaVar.zza());
        fVar.add(zzj, zzlaVar.zzi());
        fVar.add(zzk, zzlaVar.zzb());
        fVar.add(zzl, zzlaVar.zzd());
        fVar.add(zzm, zzlaVar.zzc());
        fVar.add(zzn, zzlaVar.zze());
        fVar.add(zzo, zzlaVar.zzf());
    }
}

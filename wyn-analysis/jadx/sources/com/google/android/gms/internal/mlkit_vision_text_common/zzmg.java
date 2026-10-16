package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzmg implements e {
    static final zzmg zza = new zzmg();
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
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("appId", f.n(map));
        zzcx zzcxVarR2 = a.r(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("appVersion", f.n(map2));
        zzcx zzcxVarR3 = a.r(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("firebaseProjectId", f.n(map3));
        zzcx zzcxVarR4 = a.r(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarR4.annotationType(), zzcxVarR4);
        zze = new d("mlSdkVersion", f.n(map4));
        zzcx zzcxVarR5 = a.r(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarR5.annotationType(), zzcxVarR5);
        zzf = new d("tfliteSchemaVersion", f.n(map5));
        zzcx zzcxVarR6 = a.r(6);
        HashMap map6 = new HashMap();
        map6.put(zzcxVarR6.annotationType(), zzcxVarR6);
        zzg = new d("gcmSenderId", f.n(map6));
        zzcx zzcxVarR7 = a.r(7);
        HashMap map7 = new HashMap();
        map7.put(zzcxVarR7.annotationType(), zzcxVarR7);
        zzh = new d("apiKey", f.n(map7));
        zzcx zzcxVarR8 = a.r(8);
        HashMap map8 = new HashMap();
        map8.put(zzcxVarR8.annotationType(), zzcxVarR8);
        zzi = new d("languages", f.n(map8));
        zzcx zzcxVarR9 = a.r(9);
        HashMap map9 = new HashMap();
        map9.put(zzcxVarR9.annotationType(), zzcxVarR9);
        zzj = new d("mlSdkInstanceId", f.n(map9));
        zzcx zzcxVarR10 = a.r(10);
        HashMap map10 = new HashMap();
        map10.put(zzcxVarR10.annotationType(), zzcxVarR10);
        zzk = new d("isClearcutClient", f.n(map10));
        zzcx zzcxVarR11 = a.r(11);
        HashMap map11 = new HashMap();
        map11.put(zzcxVarR11.annotationType(), zzcxVarR11);
        zzl = new d("isStandaloneMlkit", f.n(map11));
        zzcx zzcxVarR12 = a.r(12);
        HashMap map12 = new HashMap();
        map12.put(zzcxVarR12.annotationType(), zzcxVarR12);
        zzm = new d("isJsonLogging", f.n(map12));
        zzcx zzcxVarR13 = a.r(13);
        HashMap map13 = new HashMap();
        map13.put(zzcxVarR13.annotationType(), zzcxVarR13);
        zzn = new d("buildLevel", f.n(map13));
        zzcx zzcxVarR14 = a.r(14);
        HashMap map14 = new HashMap();
        map14.put(zzcxVarR14.annotationType(), zzcxVarR14);
        zzo = new d("optionalModuleVersion", f.n(map14));
    }

    private zzmg() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzst zzstVar = (zzst) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzstVar.zzg());
        fVar.add(zzc, zzstVar.zzh());
        fVar.add(zzd, (Object) null);
        fVar.add(zze, zzstVar.zzj());
        fVar.add(zzf, zzstVar.zzk());
        fVar.add(zzg, (Object) null);
        fVar.add(zzh, (Object) null);
        fVar.add(zzi, zzstVar.zza());
        fVar.add(zzj, zzstVar.zzi());
        fVar.add(zzk, zzstVar.zzb());
        fVar.add(zzl, zzstVar.zzd());
        fVar.add(zzm, zzstVar.zzc());
        fVar.add(zzn, zzstVar.zze());
        fVar.add(zzo, zzstVar.zzf());
    }
}

package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzkh implements e {
    static final zzkh zza = new zzkh();
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
        zzbc zzbcVarO = a.o(1);
        HashMap map = new HashMap();
        map.put(zzbcVarO.annotationType(), zzbcVarO);
        zzb = new d("appId", f.n(map));
        zzbc zzbcVarO2 = a.o(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarO2.annotationType(), zzbcVarO2);
        zzc = new d("appVersion", f.n(map2));
        zzbc zzbcVarO3 = a.o(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarO3.annotationType(), zzbcVarO3);
        zzd = new d("firebaseProjectId", f.n(map3));
        zzbc zzbcVarO4 = a.o(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarO4.annotationType(), zzbcVarO4);
        zze = new d("mlSdkVersion", f.n(map4));
        zzbc zzbcVarO5 = a.o(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarO5.annotationType(), zzbcVarO5);
        zzf = new d("tfliteSchemaVersion", f.n(map5));
        zzbc zzbcVarO6 = a.o(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarO6.annotationType(), zzbcVarO6);
        zzg = new d("gcmSenderId", f.n(map6));
        zzbc zzbcVarO7 = a.o(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarO7.annotationType(), zzbcVarO7);
        zzh = new d("apiKey", f.n(map7));
        zzbc zzbcVarO8 = a.o(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarO8.annotationType(), zzbcVarO8);
        zzi = new d("languages", f.n(map8));
        zzbc zzbcVarO9 = a.o(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarO9.annotationType(), zzbcVarO9);
        zzj = new d("mlSdkInstanceId", f.n(map9));
        zzbc zzbcVarO10 = a.o(10);
        HashMap map10 = new HashMap();
        map10.put(zzbcVarO10.annotationType(), zzbcVarO10);
        zzk = new d("isClearcutClient", f.n(map10));
        zzbc zzbcVarO11 = a.o(11);
        HashMap map11 = new HashMap();
        map11.put(zzbcVarO11.annotationType(), zzbcVarO11);
        zzl = new d("isStandaloneMlkit", f.n(map11));
        zzbc zzbcVarO12 = a.o(12);
        HashMap map12 = new HashMap();
        map12.put(zzbcVarO12.annotationType(), zzbcVarO12);
        zzm = new d("isJsonLogging", f.n(map12));
        zzbc zzbcVarO13 = a.o(13);
        HashMap map13 = new HashMap();
        map13.put(zzbcVarO13.annotationType(), zzbcVarO13);
        zzn = new d("buildLevel", f.n(map13));
        zzbc zzbcVarO14 = a.o(14);
        HashMap map14 = new HashMap();
        map14.put(zzbcVarO14.annotationType(), zzbcVarO14);
        zzo = new d("optionalModuleVersion", f.n(map14));
    }

    private zzkh() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzqvVar.zzg());
        fVar.add(zzc, zzqvVar.zzh());
        fVar.add(zzd, (Object) null);
        fVar.add(zze, zzqvVar.zzj());
        fVar.add(zzf, zzqvVar.zzk());
        fVar.add(zzg, (Object) null);
        fVar.add(zzh, (Object) null);
        fVar.add(zzi, zzqvVar.zza());
        fVar.add(zzj, zzqvVar.zzi());
        fVar.add(zzk, zzqvVar.zzb());
        fVar.add(zzl, zzqvVar.zzd());
        fVar.add(zzm, zzqvVar.zzc());
        fVar.add(zzn, zzqvVar.zze());
        fVar.add(zzo, zzqvVar.zzf());
    }
}

package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.ads.metadata.MediationMetaData;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzgr implements e {
    static final zzgr zza = new zzgr();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;

    static {
        zzbc zzbcVarO = a.o(1);
        HashMap map = new HashMap();
        map.put(zzbcVarO.annotationType(), zzbcVarO);
        zzb = new d(MediationMetaData.KEY_NAME, f.n(map));
        zzbc zzbcVarO2 = a.o(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarO2.annotationType(), zzbcVarO2);
        zzc = new d("version", f.n(map2));
        zzbc zzbcVarO3 = a.o(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarO3.annotationType(), zzbcVarO3);
        zzd = new d("source", f.n(map3));
        zzbc zzbcVarO4 = a.o(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarO4.annotationType(), zzbcVarO4);
        zze = new d("uri", f.n(map4));
        zzbc zzbcVarO5 = a.o(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarO5.annotationType(), zzbcVarO5);
        zzf = new d("hash", f.n(map5));
        zzbc zzbcVarO6 = a.o(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarO6.annotationType(), zzbcVarO6);
        zzg = new d("modelType", f.n(map6));
        zzbc zzbcVarO7 = a.o(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarO7.annotationType(), zzbcVarO7);
        zzh = new d("size", f.n(map7));
        zzbc zzbcVarO8 = a.o(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarO8.annotationType(), zzbcVarO8);
        zzi = new d("hasLabelMap", f.n(map8));
        zzbc zzbcVarO9 = a.o(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarO9.annotationType(), zzbcVarO9);
        zzj = new d("isManifestModel", f.n(map9));
    }

    private zzgr() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zznhVar.zzd());
        fVar.add(zzc, (Object) null);
        fVar.add(zzd, zznhVar.zzb());
        fVar.add(zze, (Object) null);
        fVar.add(zzf, zznhVar.zzc());
        fVar.add(zzg, zznhVar.zza());
        fVar.add(zzh, (Object) null);
        fVar.add(zzi, (Object) null);
        fVar.add(zzj, (Object) null);
    }
}

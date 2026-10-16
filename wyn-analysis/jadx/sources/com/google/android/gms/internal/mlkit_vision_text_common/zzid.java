package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzid implements e {
    static final zzid zza = new zzid();
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

    static {
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("durationMs", f.n(map));
        zzcx zzcxVarR2 = a.r(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("errorCode", f.n(map2));
        zzcx zzcxVarR3 = a.r(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("isColdCall", f.n(map3));
        zzcx zzcxVarR4 = a.r(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarR4.annotationType(), zzcxVarR4);
        zze = new d("autoManageModelOnBackground", f.n(map4));
        zzcx zzcxVarR5 = a.r(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarR5.annotationType(), zzcxVarR5);
        zzf = new d("autoManageModelOnLowMemory", f.n(map5));
        zzcx zzcxVarR6 = a.r(6);
        HashMap map6 = new HashMap();
        map6.put(zzcxVarR6.annotationType(), zzcxVarR6);
        zzg = new d("isNnApiEnabled", f.n(map6));
        zzcx zzcxVarR7 = a.r(7);
        HashMap map7 = new HashMap();
        map7.put(zzcxVarR7.annotationType(), zzcxVarR7);
        zzh = new d("eventsCount", f.n(map7));
        zzcx zzcxVarR8 = a.r(8);
        HashMap map8 = new HashMap();
        map8.put(zzcxVarR8.annotationType(), zzcxVarR8);
        zzi = new d("otherErrors", f.n(map8));
        zzcx zzcxVarR9 = a.r(9);
        HashMap map9 = new HashMap();
        map9.put(zzcxVarR9.annotationType(), zzcxVarR9);
        zzj = new d("remoteConfigValueForAcceleration", f.n(map9));
        zzcx zzcxVarR10 = a.r(10);
        HashMap map10 = new HashMap();
        map10.put(zzcxVarR10.annotationType(), zzcxVarR10);
        zzk = new d("isAccelerated", f.n(map10));
    }

    private zzid() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzoj zzojVar = (zzoj) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzojVar.zze());
        fVar.add(zzc, zzojVar.zza());
        fVar.add(zzd, zzojVar.zzd());
        fVar.add(zze, zzojVar.zzb());
        fVar.add(zzf, zzojVar.zzc());
        fVar.add(zzg, (Object) null);
        fVar.add(zzh, (Object) null);
        fVar.add(zzi, (Object) null);
        fVar.add(zzj, (Object) null);
        fVar.add(zzk, (Object) null);
    }
}

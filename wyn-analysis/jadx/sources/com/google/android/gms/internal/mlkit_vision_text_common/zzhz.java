package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.consent_sdk.a;
import h9.d;
import h9.e;
import java.io.IOException;
import java.util.HashMap;
import pd.f;

/* loaded from: classes4.dex */
final class zzhz implements e {
    static final zzhz zza = new zzhz();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        zzcx zzcxVarR = a.r(1);
        HashMap map = new HashMap();
        map.put(zzcxVarR.annotationType(), zzcxVarR);
        zzb = new d("imageFormat", f.n(map));
        zzcx zzcxVarR2 = a.r(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarR2.annotationType(), zzcxVarR2);
        zzc = new d("originalImageSize", f.n(map2));
        zzcx zzcxVarR3 = a.r(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarR3.annotationType(), zzcxVarR3);
        zzd = new d("compressedImageSize", f.n(map3));
        zzcx zzcxVarR4 = a.r(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarR4.annotationType(), zzcxVarR4);
        zze = new d("isOdmlImage", f.n(map4));
    }

    private zzhz() {
    }

    @Override // h9.InterfaceC2794a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzod zzodVar = (zzod) obj;
        h9.f fVar = (h9.f) obj2;
        fVar.add(zzb, zzodVar.zza());
        fVar.add(zzc, zzodVar.zzb());
        fVar.add(zzd, (Object) null);
        fVar.add(zze, (Object) null);
    }
}

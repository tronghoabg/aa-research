package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzexx implements zzimz {
    public static zzexx zza() {
        return zzexw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        List arrayList = new ArrayList();
        zzbio zzbioVar = zzbix.zznu;
        C0395s c0395s = C0395s.f2489e;
        if (!((String) c0395s.f2492c.zzd(zzbioVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) c0395s.f2492c.zzd(zzbioVar)).split(","));
        }
        zzinh.zzb(arrayList);
        return arrayList;
    }
}

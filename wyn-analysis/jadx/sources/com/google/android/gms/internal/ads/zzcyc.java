package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcyc implements zzcyd {
    private final Map zza;

    public zzcyc(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final zzema zza(int i5, String str) {
        return (zzema) this.zza.get(str);
    }
}

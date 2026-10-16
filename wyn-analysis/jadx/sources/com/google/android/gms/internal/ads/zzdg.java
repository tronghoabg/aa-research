package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzdg {
    private static final String zzb;
    public final String zza;

    static {
        String str = zzfm.zza;
        zzb = Integer.toString(0, 36);
    }

    public zzdg(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}

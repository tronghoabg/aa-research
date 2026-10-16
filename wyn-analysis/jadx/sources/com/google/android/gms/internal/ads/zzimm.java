package com.google.android.gms.internal.ads;

import android.util.Log;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzimm extends zzimr {
    final String zza;

    public zzimm(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzimr
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb2.append(str2);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}

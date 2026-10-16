package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzfdn implements zzfcq {
    final String zza;
    final int zzb;

    public /* synthetic */ zzfdn(String str, int i5, byte[] bArr) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzma)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i5 = this.zzb;
            if (i5 != -1) {
                bundle.putInt("atps", i5);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import D6.A1;
import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzevw implements zzfcq {
    private final A1 zza;
    private final boolean zzb;

    public zzevw(A1 a12, boolean z2) {
        this.zza = a12;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgA)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        A1 a12 = this.zza;
        if (a12 != null) {
            int i5 = a12.f2336a;
            if (i5 == 1) {
                bundle.putString("avo", "p");
            } else if (i5 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzfcz implements zzfcq {
    private final int zza;
    private final int zzb;

    public zzfcz(int i5, int i10) {
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        int i5;
        int i10 = this.zza;
        Bundle bundle = (Bundle) obj;
        if (i10 == -1 || (i5 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i10);
        bundle.putInt("crashes_without_flags", i5);
        C0392q c0392q = C0392q.f2477g;
        if (C0395s.f2489e.f2492c.zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}

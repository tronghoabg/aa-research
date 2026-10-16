package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import j$.util.Objects;
import x6.C4481l;

/* loaded from: classes3.dex */
final class zzedq extends AdListener {
    final /* synthetic */ zzedw zza;

    public zzedq(zzedw zzedwVar) {
        Objects.requireNonNull(zzedwVar);
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.zza.zzg(zzedw.zzm(c4481l));
    }
}

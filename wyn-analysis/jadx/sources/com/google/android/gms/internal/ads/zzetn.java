package com.google.android.gms.internal.ads;

import D6.A0;
import D6.y1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzetn implements zzdfq {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(A0 a02) {
        this.zza.set(a02);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final y1 y1Var) {
        zzfht.zza(this.zza, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((A0) obj).t(y1Var);
            }
        });
    }
}

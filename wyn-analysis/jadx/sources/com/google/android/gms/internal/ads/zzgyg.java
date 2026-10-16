package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgyg extends zzgyf {
    final /* synthetic */ zzgyh zza;

    public zzgyg(zzgyh zzgyhVar, int i5) {
        Objects.requireNonNull(zzgyhVar);
        this.zza = zzgyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final zzgxo zza() {
        return new zzgyj(this.zza.zza(), new zzgye(2));
    }
}

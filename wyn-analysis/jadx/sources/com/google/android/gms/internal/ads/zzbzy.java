package com.google.android.gms.internal.ads;

import D6.c1;
import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbzy extends zzcep {
    final /* synthetic */ Q6.b zza;

    public zzbzy(zzbzz zzbzzVar, Q6.b bVar) {
        this.zza = bVar;
        Objects.requireNonNull(zzbzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new Q6.a(new c1(str, false)));
    }
}

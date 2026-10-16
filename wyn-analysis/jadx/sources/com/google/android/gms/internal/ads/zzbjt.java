package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.Objects;
import u.AbstractC4159a;

/* loaded from: classes3.dex */
final class zzbjt extends AbstractC4159a {
    final /* synthetic */ zzbjw zza;

    public zzbjt(zzbjw zzbjwVar) {
        Objects.requireNonNull(zzbjwVar);
        this.zza = zzbjwVar;
    }

    @Override // u.AbstractC4159a
    public final void onNavigationEvent(int i5, Bundle bundle) {
        this.zza.zzc(i5);
    }
}

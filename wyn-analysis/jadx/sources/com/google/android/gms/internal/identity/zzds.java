package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.InterfaceC1702p;
import com.google.android.gms.location.LocationResult;
import x7.l;

/* loaded from: classes.dex */
final class zzds implements InterfaceC1702p {
    final /* synthetic */ LocationResult zza;

    public zzds(zzdv zzdvVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final void onNotifyListenerFailed() {
    }
}

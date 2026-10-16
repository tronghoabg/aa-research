package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.InterfaceC1702p;
import com.google.android.gms.location.LocationAvailability;
import x7.l;

/* loaded from: classes.dex */
final class zzdt implements InterfaceC1702p {
    final /* synthetic */ LocationAvailability zza;

    public zzdt(zzdv zzdvVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final /* synthetic */ void notifyListener(Object obj) {
        ((l) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final void onNotifyListenerFailed() {
    }
}

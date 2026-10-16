package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.internal.InterfaceC1702p;

/* loaded from: classes.dex */
final class zzdw implements InterfaceC1702p {
    final /* synthetic */ Location zza;

    public zzdw(zzdy zzdyVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final /* synthetic */ void notifyListener(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final void onNotifyListenerFailed() {
    }
}

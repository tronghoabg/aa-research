package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.InterfaceC1702p;

/* loaded from: classes.dex */
final class zzdx implements InterfaceC1702p {
    final /* synthetic */ zzdy zza;

    public zzdx(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final /* synthetic */ void notifyListener(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final void onNotifyListenerFailed() {
    }
}

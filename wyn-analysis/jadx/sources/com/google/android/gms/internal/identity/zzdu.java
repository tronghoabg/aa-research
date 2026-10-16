package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.InterfaceC1702p;

/* loaded from: classes.dex */
final class zzdu implements InterfaceC1702p {
    final /* synthetic */ zzdv zza;

    public zzdu(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.zza.zzh().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1702p
    public final void onNotifyListenerFailed() {
    }
}

package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import D6.InterfaceC0401v;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzeto implements InterfaceC0358a, zzdlg {
    private InterfaceC0401v zza;

    @Override // D6.InterfaceC0358a
    public final synchronized void onAdClicked() {
        InterfaceC0401v interfaceC0401v = this.zza;
        if (interfaceC0401v != null) {
            try {
                interfaceC0401v.zzb();
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.g("Remote Exception at onAdClicked.", e7);
            }
        }
    }

    public final synchronized void zza(InterfaceC0401v interfaceC0401v) {
        this.zza = interfaceC0401v;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdR() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdu() {
        InterfaceC0401v interfaceC0401v = this.zza;
        if (interfaceC0401v != null) {
            try {
                interfaceC0401v.zzb();
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.g("Remote Exception at onPhysicalClick.", e7);
            }
        }
    }
}

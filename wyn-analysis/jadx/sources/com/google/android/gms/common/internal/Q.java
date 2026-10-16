package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class Q extends G {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f26611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AbstractC1717f abstractC1717f, int i5, IBinder iBinder, Bundle bundle) {
        super(abstractC1717f, i5, bundle);
        this.f26612h = abstractC1717f;
        this.f26611g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.G
    public final boolean a() throws RemoteException {
        IBinder iBinder = this.f26611g;
        try {
            AbstractC1732v.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1717f abstractC1717f = this.f26612h;
            if (!abstractC1717f.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC1717f.getServiceDescriptor();
                Log.w("GmsClient", AbstractC3256n.h(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = abstractC1717f.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(abstractC1717f.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC1717f.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            abstractC1717f.zzn(null);
            InterfaceC1713b interfaceC1713bZzk = abstractC1717f.zzk();
            Bundle connectionHint = abstractC1717f.getConnectionHint();
            if (interfaceC1713bZzk == null) {
                return true;
            }
            abstractC1717f.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.G
    public final void b(d7.b bVar) {
        AbstractC1717f abstractC1717f = this.f26612h;
        if (abstractC1717f.zzl() != null) {
            abstractC1717f.zzl().onConnectionFailed(bVar);
        }
        abstractC1717f.onConnectionFailed(bVar);
    }
}

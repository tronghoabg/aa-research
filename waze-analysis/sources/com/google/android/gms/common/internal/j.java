package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends a {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f5050e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f5051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, int i2, IBinder iBinder, Bundle bundle) {
        super(mVar, i2, bundle);
        Objects.requireNonNull(mVar);
        this.f5051f = mVar;
        this.f5050e = iBinder;
    }

    @Override // com.google.android.gms.common.internal.a
    protected final void b(com.google.android.gms.common.d dVar) {
        m mVar = this.f5051f;
        if (mVar.r != null) {
            mVar.r.a(dVar);
        }
        m.aa(dVar);
    }

    @Override // com.google.android.gms.common.internal.a
    protected final boolean c() throws RemoteException {
        try {
            IBinder iBinder = this.f5050e;
            com.google.android.gms.common.api.internal.av.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            m mVar = this.f5051f;
            if (!mVar.d().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + mVar.d() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceC = mVar.c(this.f5050e);
            if (iInterfaceC == null || !(m.T(mVar, 2, 4, iInterfaceC) || m.T(mVar, 3, 4, iInterfaceC))) {
                return false;
            }
            Bundle bundle = null;
            mVar.w = null;
            v vVarD = mVar.W() ? mVar.D() : null;
            if (vVarD != null) {
                bundle = new Bundle();
                Parcel parcelObtain = Parcel.obtain();
                vVarD.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                bundle.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", bArrMarshall);
            }
            if (mVar.q == null) {
                return true;
            }
            mVar.q.a(bundle);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

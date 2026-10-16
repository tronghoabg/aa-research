package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zzbem extends Binder implements IInterface {
    public zzbem(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i5, parcel, parcel2, i10)) {
            return true;
        }
        return zzdd(i5, parcel, parcel2, i10);
    }

    public boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        throw null;
    }
}

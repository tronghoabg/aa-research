package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import c6.C1559a;

/* loaded from: classes3.dex */
public final class H implements r {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f26602a;

    public H(IBinder iBinder) {
        this.f26602a = iBinder;
    }

    public final void R(O o7, C1722k c1722k) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(o7.asBinder());
            parcelObtain.writeInt(1);
            C1559a.a(c1722k, parcelObtain, 0);
            this.f26602a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26602a;
    }
}

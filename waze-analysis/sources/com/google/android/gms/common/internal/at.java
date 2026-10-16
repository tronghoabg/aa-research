package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at implements au {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f4995a;

    at(IBinder iBinder) {
        this.f4995a = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.au
    public final void a(as asVar, z zVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(asVar);
            parcelObtain.writeInt(1);
            aa.a(zVar, parcelObtain, 0);
            this.f4995a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4995a;
    }
}

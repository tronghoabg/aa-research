package android.support.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f72a;

    n(IBinder iBinder) {
        this.f72a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f72a;
    }

    @Override // android.support.a.p
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.p
    public final void onMessageChannelReady(f fVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IPostMessageService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f72a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onMessageChannelReady is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.p
    public final void onPostMessage(f fVar, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IPostMessageService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f72a.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onPostMessage is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

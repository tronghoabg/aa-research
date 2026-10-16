package android.support.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f66a;

    a(IBinder iBinder) {
        this.f66a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f66a;
    }

    @Override // android.support.a.c
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.c
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IAuthTabCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f66a.transact(3, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onExtraCallback is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.c
    public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IAuthTabCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f66a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onExtraCallbackWithResult is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.c
    public final void onNavigationEvent(int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IAuthTabCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f66a.transact(2, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onNavigationEvent is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.c
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IAuthTabCallback");
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f66a.transact(5, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onWarmupCompleted is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}

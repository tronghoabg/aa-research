package android.support.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f67a;

    a(IBinder iBinder) {
        this.f67a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f67a;
    }

    @Override // android.support.a.a.c
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.a.c
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f67a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onExtraCallback is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

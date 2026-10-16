package android.support.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f68a;

    d(IBinder iBinder) {
        this.f68a = iBinder;
    }

    @Override // android.support.a.a.f
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f68a.transact(6, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method areNotificationsEnabled is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f68a;
    }

    @Override // android.support.a.a.f
    public final void cancelNotification(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f68a.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method cancelNotification is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.a.f
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            parcelObtain.writeStrongBinder(iBinder);
            if (!this.f68a.transact(9, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method extraCommand is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.a.f
    public final Bundle getActiveNotifications() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            if (!this.f68a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method getActiveNotifications is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.a.f
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.a.f
    public final Bundle getSmallIconBitmap() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            if (!this.f68a.transact(7, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method getSmallIconBitmap is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.a.f
    public final int getSmallIconId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            if (!this.f68a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method getSmallIconId is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.a.f
    public final Bundle notifyNotificationWithChannel(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f68a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method notifyNotificationWithChannel is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

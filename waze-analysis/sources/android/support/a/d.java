package android.support.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f69a;

    d(IBinder iBinder) {
        this.f69a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f69a;
    }

    @Override // android.support.a.f
    public final void extraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(3, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method extraCallback is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f69a.transact(7, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method extraCallbackWithResult is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.f
    public final void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            parcelObtain.writeInt(i5);
            parcelObtain.writeInt(i6);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(10, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onActivityLayout is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onActivityResized(int i2, int i3, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(8, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onActivityResized is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f69a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onMessageChannelReady is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onMinimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(11, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onMinimized is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onNavigationEvent(int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(2, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onNavigationEvent is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f69a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method onPostMessage is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(6, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onRelationshipValidationResult is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onUnminimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(12, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onUnminimized is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.f
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f69a.transact(9, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onWarmupCompleted is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}

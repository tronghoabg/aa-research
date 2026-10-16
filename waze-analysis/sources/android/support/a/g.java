package android.support.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f70a;

    g(IBinder iBinder) {
        this.f70a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f70a;
    }

    @Override // android.support.a.j
    public final Bundle extraCommand(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method extraCommand is unimplemented.");
            }
            parcelObtain2.readException();
            return (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.j
    public final boolean isEngagementSignalsApiAvailable(f fVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(13, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method isEngagementSignalsApiAvailable is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean mayLaunchUrl(f fVar, Uri uri, Bundle bundle, List<Bundle> list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeTypedObject(bundle, 0);
            i.a(parcelObtain, list);
            if (!this.f70a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method mayLaunchUrl is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean newAuthTabSession(c cVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(cVar);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(18, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method newAuthTabSession is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean newSession(f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            if (!this.f70a.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method newSession is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean newSessionWithExtras(f fVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(10, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method newSessionWithExtras is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final int postMessage(f fVar, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(8, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method postMessage is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final void prefetch(f fVar, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(15, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method prefetch is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final void prefetchWithMultipleUrls(f fVar, List<Uri> list, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            i.a(parcelObtain, list);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(16, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method prefetchWithMultipleUrls is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean receiveFile(f fVar, Uri uri, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(12, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method receiveFile is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean requestPostMessageChannel(f fVar, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(uri, 0);
            if (!this.f70a.transact(7, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannel is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean requestPostMessageChannelWithExtras(f fVar, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(11, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannelWithExtras is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean setEngagementSignalsCallback(f fVar, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(14, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method setEngagementSignalsCallback is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean updateVisuals(f fVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(6, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method updateVisuals is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean validateRelationship(f fVar, int i2, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.f70a.transact(9, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method validateRelationship is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.j
    public final boolean warmup(long j2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeLong(j2);
            if (!this.f70a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method warmup is unimplemented.");
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

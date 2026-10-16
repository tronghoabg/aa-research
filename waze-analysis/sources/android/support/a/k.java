package android.support.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f71a;

    k(IBinder iBinder) {
        this.f71a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f71a;
    }

    @Override // android.support.a.m
    public final int getInterfaceVersion() {
        throw null;
    }

    @Override // android.support.a.m
    public final void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
            parcelObtain.writeInt(i2);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f71a.transact(3, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onGreatestScrollPercentageIncreased is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.m
    public final void onSessionEnded(boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f71a.transact(4, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onSessionEnded is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.a.m
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.f71a.transact(2, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method onVerticalScrollEvent is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}

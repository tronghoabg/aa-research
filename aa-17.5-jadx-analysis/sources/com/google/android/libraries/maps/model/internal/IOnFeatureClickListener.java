package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface IOnFeatureClickListener extends IInterface {

    public static abstract class Stub extends ijo implements IOnFeatureClickListener {

        public static class Proxy extends ijn implements IOnFeatureClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
            }

            @Override // com.google.android.libraries.maps.model.internal.IOnFeatureClickListener
            public void onFeatureClick(IFeatureClickEventDelegate iFeatureClickEventDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iFeatureClickEventDelegate);
                gj(1, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
        }

        public static IOnFeatureClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnFeatureClickListener ? (IOnFeatureClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            IFeatureClickEventDelegate iFeatureClickEventDelegateAsInterface = IFeatureClickEventDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            onFeatureClick(iFeatureClickEventDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onFeatureClick(IFeatureClickEventDelegate iFeatureClickEventDelegate) throws RemoteException;
}

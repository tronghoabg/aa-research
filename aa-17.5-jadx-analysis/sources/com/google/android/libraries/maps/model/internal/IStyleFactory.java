package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureStyle;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface IStyleFactory extends IInterface {

    public static abstract class Stub extends ijo implements IStyleFactory {

        public static class Proxy extends ijn implements IStyleFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IStyleFactory");
            }

            @Override // com.google.android.libraries.maps.model.internal.IStyleFactory
            public FeatureStyle getStyle(IFeatureDelegate iFeatureDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iFeatureDelegate);
                Parcel parcelGi = gi(1, parcelGh);
                FeatureStyle featureStyle = (FeatureStyle) ijp.a(parcelGi, FeatureStyle.CREATOR);
                parcelGi.recycle();
                return featureStyle;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IStyleFactory");
        }

        public static IStyleFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IStyleFactory");
            return iInterfaceQueryLocalInterface instanceof IStyleFactory ? (IStyleFactory) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            IFeatureDelegate iFeatureDelegateAsInterface = IFeatureDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            FeatureStyle style = getStyle(iFeatureDelegateAsInterface);
            parcel2.writeNoException();
            ijp.h(parcel2, style);
            return true;
        }
    }

    FeatureStyle getStyle(IFeatureDelegate iFeatureDelegate) throws RemoteException;
}

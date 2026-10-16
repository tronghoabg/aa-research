package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface IMapCapabilitiesDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IMapCapabilitiesDelegate {

        public static class Proxy extends ijn implements IMapCapabilitiesDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isAdvancedMarkersAvailable() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isDataDrivenStylingAvailable() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
        }

        public static IMapCapabilitiesDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
            return iInterfaceQueryLocalInterface instanceof IMapCapabilitiesDelegate ? (IMapCapabilitiesDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                boolean zIsAdvancedMarkersAvailable = isAdvancedMarkersAvailable();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zIsAdvancedMarkersAvailable ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                boolean zIsDataDrivenStylingAvailable = isDataDrivenStylingAvailable();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zIsDataDrivenStylingAvailable ? 1 : 0);
            }
            return true;
        }
    }

    boolean isAdvancedMarkersAvailable() throws RemoteException;

    boolean isDataDrivenStylingAvailable() throws RemoteException;
}

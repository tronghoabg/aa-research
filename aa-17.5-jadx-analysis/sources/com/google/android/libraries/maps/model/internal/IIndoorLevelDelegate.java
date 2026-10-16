package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface IIndoorLevelDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IIndoorLevelDelegate {

        public static class Proxy extends ijn implements IIndoorLevelDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public void activate() throws RemoteException {
                gj(3, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iIndoorLevelDelegate);
                Parcel parcelGi = gi(4, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public String getName() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public String getShortName() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(5, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
        }

        public static IIndoorLevelDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
            return iInterfaceQueryLocalInterface instanceof IIndoorLevelDelegate ? (IIndoorLevelDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                String name = getName();
                parcel2.writeNoException();
                parcel2.writeString(name);
            } else if (i == 2) {
                String shortName = getShortName();
                parcel2.writeNoException();
                parcel2.writeString(shortName);
            } else if (i == 3) {
                activate();
                parcel2.writeNoException();
            } else if (i == 4) {
                IIndoorLevelDelegate iIndoorLevelDelegateAsInterface = asInterface(parcel.readStrongBinder());
                ijp.d(parcel);
                boolean zEqualsRemote = equalsRemote(iIndoorLevelDelegateAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zEqualsRemote ? 1 : 0);
            } else {
                if (i != 5) {
                    return false;
                }
                int iHashCodeRemote = hashCodeRemote();
                parcel2.writeNoException();
                parcel2.writeInt(iHashCodeRemote);
            }
            return true;
        }
    }

    void activate() throws RemoteException;

    boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) throws RemoteException;

    String getName() throws RemoteException;

    String getShortName() throws RemoteException;

    int hashCodeRemote() throws RemoteException;
}

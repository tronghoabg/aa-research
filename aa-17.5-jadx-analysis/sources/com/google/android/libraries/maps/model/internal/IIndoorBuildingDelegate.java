package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface IIndoorBuildingDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IIndoorBuildingDelegate {

        public static class Proxy extends ijn implements IIndoorBuildingDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iIndoorBuildingDelegate);
                Parcel parcelGi = gi(5, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int getActiveLevelIndex() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int getDefaultLevelIndex() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public List<IBinder> getLevels() throws RemoteException {
                Parcel parcelGi = gi(3, gh());
                ArrayList<IBinder> arrayListCreateBinderArrayList = parcelGi.createBinderArrayList();
                parcelGi.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(6, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public boolean isUnderground() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
        }

        public static IIndoorBuildingDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
            return iInterfaceQueryLocalInterface instanceof IIndoorBuildingDelegate ? (IIndoorBuildingDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            switch (i) {
                case 1:
                    int activeLevelIndex = getActiveLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(activeLevelIndex);
                    return true;
                case 2:
                    int defaultLevelIndex = getDefaultLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(defaultLevelIndex);
                    return true;
                case 3:
                    List<IBinder> levels = getLevels();
                    parcel2.writeNoException();
                    parcel2.writeBinderList(levels);
                    return true;
                case 4:
                    boolean zIsUnderground = isUnderground();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
                    parcel2.writeInt(zIsUnderground ? 1 : 0);
                    return true;
                case 5:
                    IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iIndoorBuildingDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 6:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) throws RemoteException;

    int getActiveLevelIndex() throws RemoteException;

    int getDefaultLevelIndex() throws RemoteException;

    List<IBinder> getLevels() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isUnderground() throws RemoteException;
}

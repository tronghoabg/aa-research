package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IIndoorBuildingDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate iIndoorBuildingDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iIndoorBuildingDelegate);
                android.os.Parcel parcelFq = fq(5, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int getActiveLevelIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int getDefaultLevelIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public java.util.List<android.os.IBinder> getLevels() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(3, fp());
                java.util.ArrayList<android.os.IBinder> arrayListCreateBinderArrayList = parcelFq.createBinderArrayList();
                parcelFq.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
            public boolean isUnderground() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate ? (com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
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
                    java.util.List<android.os.IBinder> levels = getLevels();
                    parcel2.writeNoException();
                    parcel2.writeBinderList(levels);
                    return true;
                case 4:
                    boolean zIsUnderground = isUnderground();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsUnderground ? 1 : 0);
                    return true;
                case 5:
                    com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
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

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate iIndoorBuildingDelegate) throws android.os.RemoteException;

    int getActiveLevelIndex() throws android.os.RemoteException;

    int getDefaultLevelIndex() throws android.os.RemoteException;

    java.util.List<android.os.IBinder> getLevels() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isUnderground() throws android.os.RemoteException;
}

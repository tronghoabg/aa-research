package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IIndoorLevelDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public void activate() throws android.os.RemoteException {
                fr(3, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate iIndoorLevelDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iIndoorLevelDelegate);
                android.os.Parcel parcelFq = fq(4, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public java.lang.String getName() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public java.lang.String getShortName() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(5, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate ? (com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i == 1) {
                java.lang.String name = getName();
                parcel2.writeNoException();
                parcel2.writeString(name);
            } else if (i == 2) {
                java.lang.String shortName = getShortName();
                parcel2.writeNoException();
                parcel2.writeString(shortName);
            } else if (i == 3) {
                activate();
                parcel2.writeNoException();
            } else if (i == 4) {
                com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate iIndoorLevelDelegateAsInterface = asInterface(parcel.readStrongBinder());
                defpackage.ijx.d(parcel);
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

    void activate() throws android.os.RemoteException;

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate iIndoorLevelDelegate) throws android.os.RemoteException;

    java.lang.String getName() throws android.os.RemoteException;

    java.lang.String getShortName() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;
}

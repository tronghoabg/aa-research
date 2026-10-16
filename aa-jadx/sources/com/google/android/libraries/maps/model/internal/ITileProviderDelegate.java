package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface ITileProviderDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.ITileProviderDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.ITileProviderDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileProviderDelegate
            public com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                parcelFp.writeInt(i2);
                parcelFp.writeInt(i3);
                android.os.Parcel parcelFq = fq(1, parcelFp);
                com.google.android.libraries.maps.model.Tile tile = (com.google.android.libraries.maps.model.Tile) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.Tile.CREATOR);
                parcelFq.recycle();
                return tile;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.ITileProviderDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.ITileProviderDelegate ? (com.google.android.libraries.maps.model.internal.ITileProviderDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.ITileProviderDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            defpackage.ijx.d(parcel);
            com.google.android.libraries.maps.model.Tile tile = getTile(i2, i3, i4);
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, tile);
            return true;
        }
    }

    com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3) throws android.os.RemoteException;
}

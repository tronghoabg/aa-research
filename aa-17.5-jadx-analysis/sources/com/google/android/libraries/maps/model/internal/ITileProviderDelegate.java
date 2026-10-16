package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.Tile;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface ITileProviderDelegate extends IInterface {

    public static abstract class Stub extends ijo implements ITileProviderDelegate {

        public static class Proxy extends ijn implements ITileProviderDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileProviderDelegate
            public Tile getTile(int i, int i2, int i3) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                parcelGh.writeInt(i2);
                parcelGh.writeInt(i3);
                Parcel parcelGi = gi(1, parcelGh);
                Tile tile = (Tile) ijp.a(parcelGi, Tile.CREATOR);
                parcelGi.recycle();
                return tile;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
        }

        public static ITileProviderDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.ITileProviderDelegate");
            return iInterfaceQueryLocalInterface instanceof ITileProviderDelegate ? (ITileProviderDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ijp.d(parcel);
            Tile tile = getTile(i2, i3, i4);
            parcel2.writeNoException();
            ijp.h(parcel2, tile);
            return true;
        }
    }

    Tile getTile(int i, int i2, int i3) throws RemoteException;
}

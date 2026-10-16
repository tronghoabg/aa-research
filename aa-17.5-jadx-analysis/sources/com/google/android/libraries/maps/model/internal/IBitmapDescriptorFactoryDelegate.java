package com.google.android.libraries.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.PinConfig;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public interface IBitmapDescriptorFactoryDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IBitmapDescriptorFactoryDelegate {

        public static class Proxy extends ijn implements IBitmapDescriptorFactoryDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj defaultMarker() throws RemoteException {
                sqj sqhVar;
                Parcel parcelGi = gi(4, gh());
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj defaultMarkerWithHue(float f) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                Parcel parcelGi = gi(5, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromAsset(String str) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                parcelGh.writeString(str);
                Parcel parcelGi = gi(2, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromBitmap(Bitmap bitmap) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                ijp.g(parcelGh, bitmap);
                Parcel parcelGi = gi(6, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromFile(String str) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                parcelGh.writeString(str);
                Parcel parcelGi = gi(3, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromPath(String str) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                parcelGh.writeString(str);
                Parcel parcelGi = gi(7, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromPinConfig(PinConfig pinConfig) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                ijp.g(parcelGh, pinConfig);
                Parcel parcelGi = gi(8, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public sqj fromResource(int i) throws RemoteException {
                sqj sqhVar;
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                Parcel parcelGi = gi(1, parcelGh);
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }

        public static IBitmapDescriptorFactoryDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return iInterfaceQueryLocalInterface instanceof IBitmapDescriptorFactoryDelegate ? (IBitmapDescriptorFactoryDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            switch (i) {
                case 1:
                    int i2 = parcel.readInt();
                    ijp.d(parcel);
                    sqj sqjVarFromResource = fromResource(i2);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromResource);
                    return true;
                case 2:
                    String string = parcel.readString();
                    ijp.d(parcel);
                    sqj sqjVarFromAsset = fromAsset(string);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromAsset);
                    return true;
                case 3:
                    String string2 = parcel.readString();
                    ijp.d(parcel);
                    sqj sqjVarFromFile = fromFile(string2);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromFile);
                    return true;
                case 4:
                    sqj sqjVarDefaultMarker = defaultMarker();
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarDefaultMarker);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    ijp.d(parcel);
                    sqj sqjVarDefaultMarkerWithHue = defaultMarkerWithHue(f);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarDefaultMarkerWithHue);
                    return true;
                case 6:
                    Bitmap bitmap = (Bitmap) ijp.a(parcel, Bitmap.CREATOR);
                    ijp.d(parcel);
                    sqj sqjVarFromBitmap = fromBitmap(bitmap);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromBitmap);
                    return true;
                case 7:
                    String string3 = parcel.readString();
                    ijp.d(parcel);
                    sqj sqjVarFromPath = fromPath(string3);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromPath);
                    return true;
                case 8:
                    PinConfig pinConfig = (PinConfig) ijp.a(parcel, PinConfig.CREATOR);
                    ijp.d(parcel);
                    sqj sqjVarFromPinConfig = fromPinConfig(pinConfig);
                    parcel2.writeNoException();
                    ijp.i(parcel2, sqjVarFromPinConfig);
                    return true;
                default:
                    return false;
            }
        }
    }

    sqj defaultMarker() throws RemoteException;

    sqj defaultMarkerWithHue(float f) throws RemoteException;

    sqj fromAsset(String str) throws RemoteException;

    sqj fromBitmap(Bitmap bitmap) throws RemoteException;

    sqj fromFile(String str) throws RemoteException;

    sqj fromPath(String str) throws RemoteException;

    sqj fromPinConfig(PinConfig pinConfig) throws RemoteException;

    sqj fromResource(int i) throws RemoteException;
}

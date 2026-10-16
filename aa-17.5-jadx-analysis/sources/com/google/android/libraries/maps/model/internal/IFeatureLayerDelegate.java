package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;
import com.google.android.libraries.maps.model.internal.IStyleFactory;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface IFeatureLayerDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IFeatureLayerDelegate {

        public static class Proxy extends ijn implements IFeatureLayerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iOnFeatureClickListener);
                gj(4, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public String getDatasetId() throws RemoteException {
                Parcel parcelGi = gi(6, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public String getFeatureType() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public boolean isAvailable() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iOnFeatureClickListener);
                gj(5, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void setFeatureStyle(IStyleFactory iStyleFactory) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iStyleFactory);
                gj(3, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
        }

        public static IFeatureLayerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureLayerDelegate ? (IFeatureLayerDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            switch (i) {
                case 1:
                    String featureType = getFeatureType();
                    parcel2.writeNoException();
                    parcel2.writeString(featureType);
                    return true;
                case 2:
                    boolean zIsAvailable = isAvailable();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
                    parcel2.writeInt(zIsAvailable ? 1 : 0);
                    return true;
                case 3:
                    IStyleFactory iStyleFactoryAsInterface = IStyleFactory.Stub.asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
                    setFeatureStyle(iStyleFactoryAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IOnFeatureClickListener iOnFeatureClickListenerAsInterface = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
                    addOnFeatureClickListener(iOnFeatureClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IOnFeatureClickListener iOnFeatureClickListenerAsInterface2 = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
                    removeOnFeatureClickListener(iOnFeatureClickListenerAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String datasetId = getDatasetId();
                    parcel2.writeNoException();
                    parcel2.writeString(datasetId);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) throws RemoteException;

    String getDatasetId() throws RemoteException;

    String getFeatureType() throws RemoteException;

    boolean isAvailable() throws RemoteException;

    void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) throws RemoteException;

    void setFeatureStyle(IStyleFactory iStyleFactory) throws RemoteException;
}

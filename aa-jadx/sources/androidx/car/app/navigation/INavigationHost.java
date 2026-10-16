package androidx.car.app.navigation;

/* JADX INFO: loaded from: classes2.dex */
public interface INavigationHost extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.navigation.INavigationHost";
    public static final int VERSION = 1;

    int getInterfaceVersion() throws android.os.RemoteException;

    void navigationEnded() throws android.os.RemoteException;

    void navigationStarted() throws android.os.RemoteException;

    void setVoiceAssistantCapabilities(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException;

    void updateTrip(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException;

    public static class Default implements androidx.car.app.navigation.INavigationHost {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void navigationEnded() throws android.os.RemoteException {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void navigationStarted() throws android.os.RemoteException {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void setVoiceAssistantCapabilities(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.navigation.INavigationHost
        public void updateTrip(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.navigation.INavigationHost {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_navigationEnded = 3;
        static final int TRANSACTION_navigationStarted = 2;
        static final int TRANSACTION_setVoiceAssistantCapabilities = 5;
        static final int TRANSACTION_updateTrip = 4;

        private static class Proxy implements androidx.car.app.navigation.INavigationHost {
            private int mCachedVersion = -1;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.navigation.INavigationHost.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void navigationEnded() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method navigationEnded is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void navigationStarted() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method navigationStarted is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void setVoiceAssistantCapabilities(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method setVoiceAssistantCapabilities is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.navigation.INavigationHost
            public void updateTrip(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method updateTrip is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.car.app.navigation.INavigationHost asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.navigation.INavigationHost)) ? new androidx.car.app.navigation.INavigationHost.Stub.Proxy(iBinder) : (androidx.car.app.navigation.INavigationHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            java.lang.String str = DESCRIPTOR;
            if (i > 0 && i <= TRANSACTION_getInterfaceVersion) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == TRANSACTION_getInterfaceVersion) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i == 2) {
                navigationStarted();
                parcel2.writeNoException();
            } else if (i == 3) {
                navigationEnded();
                parcel2.writeNoException();
            } else if (i == 4) {
                updateTrip((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                setVoiceAssistantCapabilities((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }
}

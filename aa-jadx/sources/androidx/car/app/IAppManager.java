package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
public interface IAppManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.IAppManager";
    public static final int VERSION = 1;

    int getInterfaceVersion() throws android.os.RemoteException;

    void getTemplate(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onBackPressed(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void startLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void stopLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.IAppManager {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getTemplate = 2;
        static final int TRANSACTION_onBackPressed = 3;
        static final int TRANSACTION_startLocationUpdates = 4;
        static final int TRANSACTION_stopLocationUpdates = 5;

        private static class Proxy implements androidx.car.app.IAppManager {
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

            @Override // androidx.car.app.IAppManager
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.IAppManager.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.IAppManager
            public void getTemplate(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method getTemplate is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void onBackPressed(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onBackPressed is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void startLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method startLocationUpdates is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppManager
            public void stopLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(5, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method stopLocationUpdates is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.car.app.IAppManager asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.IAppManager)) ? new androidx.car.app.IAppManager.Stub.Proxy(iBinder) : (androidx.car.app.IAppManager) iInterfaceQueryLocalInterface;
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
                getTemplate(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                onBackPressed(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                startLocationUpdates(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                stopLocationUpdates(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements androidx.car.app.IAppManager {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }
    }
}

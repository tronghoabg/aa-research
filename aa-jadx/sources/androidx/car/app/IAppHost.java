package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
public interface IAppHost extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.IAppHost";
    public static final int VERSION = 1;

    void dismissAlert(int i) throws android.os.RemoteException;

    int getInterfaceVersion() throws android.os.RemoteException;

    void invalidate() throws android.os.RemoteException;

    androidx.car.app.serialization.Bundleable openMicrophone(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException;

    void sendLocation(android.location.Location location) throws android.os.RemoteException;

    void setSurfaceCallback(androidx.car.app.ISurfaceCallback iSurfaceCallback) throws android.os.RemoteException;

    void showAlert(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException;

    void showToast(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException;

    public static class Default implements androidx.car.app.IAppHost {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.IAppHost
        public androidx.car.app.serialization.Bundleable openMicrophone(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public void invalidate() throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void dismissAlert(int i) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void sendLocation(android.location.Location location) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void setSurfaceCallback(androidx.car.app.ISurfaceCallback iSurfaceCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void showAlert(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.IAppHost
        public void showToast(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException {
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.IAppHost {
        static final int TRANSACTION_dismissAlert = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_invalidate = 2;
        static final int TRANSACTION_openMicrophone = 8;
        static final int TRANSACTION_sendLocation = 5;
        static final int TRANSACTION_setSurfaceCallback = 4;
        static final int TRANSACTION_showAlert = 6;
        static final int TRANSACTION_showToast = 3;

        private static class Proxy implements androidx.car.app.IAppHost {
            private int mCachedVersion = -1;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.IAppHost
            public void dismissAlert(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method dismissAlert is unimplemented.");
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

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppHost
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.IAppHost.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.IAppHost
            public void invalidate() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method invalidate is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public androidx.car.app.serialization.Bundleable openMicrophone(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method openMicrophone is unimplemented.");
                    }
                    parcelObtain2.readException();
                    androidx.car.app.serialization.Bundleable bundleable2 = (androidx.car.app.serialization.Bundleable) parcelObtain2.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundleable2;
                } catch (java.lang.Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.IAppHost
            public void sendLocation(android.location.Location location) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(location, 0);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method sendLocation is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void setSurfaceCallback(androidx.car.app.ISurfaceCallback iSurfaceCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iSurfaceCallback);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method setSurfaceCallback is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void showAlert(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method showAlert is unimplemented.");
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

            @Override // androidx.car.app.IAppHost
            public void showToast(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        android.text.TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method showToast is unimplemented.");
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

        public static androidx.car.app.IAppHost asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.IAppHost)) ? new androidx.car.app.IAppHost.Stub.Proxy(iBinder) : (androidx.car.app.IAppHost) iInterfaceQueryLocalInterface;
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
            switch (i) {
                case 2:
                    invalidate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    showToast((java.lang.CharSequence) parcel.readTypedObject(android.text.TextUtils.CHAR_SEQUENCE_CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setSurfaceCallback(androidx.car.app.ISurfaceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    sendLocation((android.location.Location) parcel.readTypedObject(android.location.Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    showAlert((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    dismissAlert(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    androidx.car.app.serialization.Bundleable bundleableOpenMicrophone = openMicrophone((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(bundleableOpenMicrophone, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }
}

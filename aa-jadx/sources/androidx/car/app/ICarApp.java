package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
public interface ICarApp extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.ICarApp";
    public static final int VERSION = 1;

    void getAppInfo(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void getAppTheme(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    int getInterfaceVersion() throws android.os.RemoteException;

    void getManager(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onAppCreate(androidx.car.app.ICarHost iCarHost, android.content.Intent intent, android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onAppPause(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onAppResume(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onAppStart(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onAppStop(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onConfigurationChanged(android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onHandshakeCompleted(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onNewIntent(android.content.Intent intent, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.ICarApp {
        static final int TRANSACTION_getAppInfo = 10;
        static final int TRANSACTION_getAppTheme = 12;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getManager = 9;
        static final int TRANSACTION_onAppCreate = 2;
        static final int TRANSACTION_onAppPause = 5;
        static final int TRANSACTION_onAppResume = 4;
        static final int TRANSACTION_onAppStart = 3;
        static final int TRANSACTION_onAppStop = 6;
        static final int TRANSACTION_onConfigurationChanged = 8;
        static final int TRANSACTION_onHandshakeCompleted = 11;
        static final int TRANSACTION_onNewIntent = 7;

        private static class Proxy implements androidx.car.app.ICarApp {
            private int mCachedVersion = -1;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.ICarApp
            public void getAppInfo(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(10, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method getAppInfo is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void getAppTheme(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(12, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method getAppTheme is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.ICarApp
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.ICarApp.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.ICarApp
            public void getManager(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(9, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method getManager is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppCreate(androidx.car.app.ICarHost iCarHost, android.content.Intent intent, android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCarHost);
                    parcelObtain.writeTypedObject(intent, 0);
                    parcelObtain.writeTypedObject(configuration, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onAppCreate is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppPause(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(5, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onAppPause is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppResume(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onAppResume is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppStart(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onAppStart is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppStop(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(6, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onAppStop is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onConfigurationChanged(android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(configuration, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(8, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onConfigurationChanged is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onHandshakeCompleted(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(11, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onHandshakeCompleted is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onNewIntent(android.content.Intent intent, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(intent, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(7, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onNewIntent is unimplemented.");
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

        public static androidx.car.app.ICarApp asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.ICarApp)) ? new androidx.car.app.ICarApp.Stub.Proxy(iBinder) : (androidx.car.app.ICarApp) iInterfaceQueryLocalInterface;
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
                    onAppCreate(androidx.car.app.ICarHost.Stub.asInterface(parcel.readStrongBinder()), (android.content.Intent) parcel.readTypedObject(android.content.Intent.CREATOR), (android.content.res.Configuration) parcel.readTypedObject(android.content.res.Configuration.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onAppStart(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onAppResume(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onAppPause(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    onAppStop(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    onNewIntent((android.content.Intent) parcel.readTypedObject(android.content.Intent.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    onConfigurationChanged((android.content.res.Configuration) parcel.readTypedObject(android.content.res.Configuration.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    getManager(parcel.readString(), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    getAppInfo(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    onHandshakeCompleted((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 12:
                    getAppTheme(androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
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

    public static class Default implements androidx.car.app.ICarApp {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ICarApp
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.ICarApp
        public void getAppInfo(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void getAppTheme(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppPause(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppResume(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppStart(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppStop(androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void getManager(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onConfigurationChanged(android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onHandshakeCompleted(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onNewIntent(android.content.Intent intent, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppCreate(androidx.car.app.ICarHost iCarHost, android.content.Intent intent, android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }
    }
}

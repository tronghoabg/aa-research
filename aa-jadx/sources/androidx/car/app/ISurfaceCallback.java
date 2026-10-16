package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
public interface ISurfaceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.ISurfaceCallback";
    public static final int VERSION = 1;

    int getInterfaceVersion() throws android.os.RemoteException;

    void onClick(float f, float f2) throws android.os.RemoteException;

    void onFling(float f, float f2) throws android.os.RemoteException;

    void onScale(float f, float f2, float f3) throws android.os.RemoteException;

    void onScroll(float f, float f2) throws android.os.RemoteException;

    void onStableAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onSurfaceAvailable(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onSurfaceDestroyed(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onVisibleAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.ISurfaceCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onClick = 9;
        static final int TRANSACTION_onFling = 7;
        static final int TRANSACTION_onScale = 8;
        static final int TRANSACTION_onScroll = 6;
        static final int TRANSACTION_onStableAreaChanged = 4;
        static final int TRANSACTION_onSurfaceAvailable = 2;
        static final int TRANSACTION_onSurfaceDestroyed = 5;
        static final int TRANSACTION_onVisibleAreaChanged = 3;

        private static class Proxy implements androidx.car.app.ISurfaceCallback {
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

            @Override // androidx.car.app.ISurfaceCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.ISurfaceCallback.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onClick(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(9, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onClick is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onFling(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(7, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onFling is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScale(float f, float f2, float f3) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    parcelObtain.writeFloat(f3);
                    if (!this.mRemote.transact(8, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onScale is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onScroll(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    if (!this.mRemote.transact(6, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onScroll is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onStableAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(rect, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(4, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onStableAreaChanged is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceAvailable(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onSurfaceAvailable is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onSurfaceDestroyed(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(5, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onSurfaceDestroyed is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.ISurfaceCallback
            public void onVisibleAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(rect, 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onVisibleAreaChanged is unimplemented.");
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

        public static androidx.car.app.ISurfaceCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.ISurfaceCallback)) ? new androidx.car.app.ISurfaceCallback.Stub.Proxy(iBinder) : (androidx.car.app.ISurfaceCallback) iInterfaceQueryLocalInterface;
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
                    onSurfaceAvailable((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onVisibleAreaChanged((android.graphics.Rect) parcel.readTypedObject(android.graphics.Rect.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onStableAreaChanged((android.graphics.Rect) parcel.readTypedObject(android.graphics.Rect.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onSurfaceDestroyed((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    onScroll(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 7:
                    onFling(parcel.readFloat(), parcel.readFloat());
                    return true;
                case 8:
                    onScale(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    return true;
                case 9:
                    onClick(parcel.readFloat(), parcel.readFloat());
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

    public static class Default implements androidx.car.app.ISurfaceCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(float f, float f2) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(float f, float f2) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(float f, float f2) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(float f, float f2, float f3) throws android.os.RemoteException {
        }
    }
}

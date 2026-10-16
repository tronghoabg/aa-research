package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
public interface IInputCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.model.IInputCallback";
    public static final int VERSION = 1;

    int getInterfaceVersion() throws android.os.RemoteException;

    void onInputSubmitted(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    void onInputTextChanged(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.model.IInputCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onInputSubmitted = 3;
        static final int TRANSACTION_onInputTextChanged = 2;

        private static class Proxy implements androidx.car.app.model.IInputCallback {
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

            @Override // androidx.car.app.model.IInputCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.model.IInputCallback.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.model.IInputCallback
            public void onInputSubmitted(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onInputSubmitted is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.car.app.model.IInputCallback
            public void onInputTextChanged(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onInputTextChanged is unimplemented.");
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

        public static androidx.car.app.model.IInputCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.model.IInputCallback)) ? new androidx.car.app.model.IInputCallback.Stub.Proxy(iBinder) : (androidx.car.app.model.IInputCallback) iInterfaceQueryLocalInterface;
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
                onInputTextChanged(parcel.readString(), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onInputSubmitted(parcel.readString(), androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements androidx.car.app.model.IInputCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) throws android.os.RemoteException {
        }
    }
}

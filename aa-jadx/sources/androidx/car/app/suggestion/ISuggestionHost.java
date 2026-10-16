package androidx.car.app.suggestion;

/* JADX INFO: loaded from: classes2.dex */
public interface ISuggestionHost extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.suggestion.ISuggestionHost";
    public static final int VERSION = 1;

    int getInterfaceVersion() throws android.os.RemoteException;

    void updateSuggestions(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.car.app.suggestion.ISuggestionHost {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_updateSuggestions = 2;

        private static class Proxy implements androidx.car.app.suggestion.ISuggestionHost {
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

            @Override // androidx.car.app.suggestion.ISuggestionHost
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.suggestion.ISuggestionHost.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.suggestion.ISuggestionHost
            public void updateSuggestions(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeTypedObject(bundleable, 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new android.os.RemoteException("Method updateSuggestions is unimplemented.");
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

        public static androidx.car.app.suggestion.ISuggestionHost asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.suggestion.ISuggestionHost)) ? new androidx.car.app.suggestion.ISuggestionHost.Stub.Proxy(iBinder) : (androidx.car.app.suggestion.ISuggestionHost) iInterfaceQueryLocalInterface;
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
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            updateSuggestions((androidx.car.app.serialization.Bundleable) parcel.readTypedObject(androidx.car.app.serialization.Bundleable.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements androidx.car.app.suggestion.ISuggestionHost {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.suggestion.ISuggestionHost
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.suggestion.ISuggestionHost
        public void updateSuggestions(androidx.car.app.serialization.Bundleable bundleable) throws android.os.RemoteException {
        }
    }
}

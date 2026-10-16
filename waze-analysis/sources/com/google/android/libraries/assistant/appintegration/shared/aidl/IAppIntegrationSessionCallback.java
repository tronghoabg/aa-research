package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface IAppIntegrationSessionCallback extends IInterface {

    /* compiled from: WazeSource */
    public abstract class Stub extends b implements IAppIntegrationSessionCallback {
        private static final String DESCRIPTOR = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback";
        static final int TRANSACTION_onUpdate = 1;

        /* compiled from: WazeSource */
        public class Proxy extends a implements IAppIntegrationSessionCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback
            public void onUpdate(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAppIntegrationSessionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationSessionCallback ? (IAppIntegrationSessionCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onUpdate(bArrCreateByteArray);
            return true;
        }
    }

    void onUpdate(byte[] bArr);
}

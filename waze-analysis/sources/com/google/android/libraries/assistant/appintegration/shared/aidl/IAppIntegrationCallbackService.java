package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface IAppIntegrationCallbackService extends IInterface {

    /* compiled from: WazeSource */
    public abstract class Stub extends b implements IAppIntegrationCallbackService {
        private static final String DESCRIPTOR = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService";
        static final int TRANSACTION_forwardCallbackEvent = 1;
        static final int TRANSACTION_registerDeathRecipient = 2;

        /* compiled from: WazeSource */
        public class Proxy extends a implements IAppIntegrationCallbackService {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void forwardCallbackEvent(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void registerDeathRecipient(IBinder iBinder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAppIntegrationCallbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationCallbackService ? (IAppIntegrationCallbackService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                forwardCallbackEvent(bArrCreateByteArray);
            } else {
                if (i2 != 2) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                enforceNoDataAvail(parcel);
                registerDeathRecipient(strongBinder);
            }
            return true;
        }
    }

    void forwardCallbackEvent(byte[] bArr);

    void registerDeathRecipient(IBinder iBinder);
}

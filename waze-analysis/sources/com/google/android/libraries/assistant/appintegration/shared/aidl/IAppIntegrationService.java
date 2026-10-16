package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface IAppIntegrationService extends IInterface {

    /* compiled from: WazeSource */
    public abstract class Stub extends b implements IAppIntegrationService {
        private static final String DESCRIPTOR = "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService";
        static final int TRANSACTION_startSession = 1;

        /* compiled from: WazeSource */
        public class Proxy extends a implements IAppIntegrationService {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService
            public IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                c.c(parcelObtainAndWriteInterfaceToken, iAppIntegrationSessionCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IAppIntegrationSession iAppIntegrationSessionAsInterface = IAppIntegrationSession.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iAppIntegrationSessionAsInterface;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IAppIntegrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationService ? (IAppIntegrationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1) {
                return false;
            }
            String string = parcel.readString();
            IAppIntegrationSessionCallback iAppIntegrationSessionCallbackAsInterface = IAppIntegrationSessionCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            IAppIntegrationSession iAppIntegrationSessionStartSession = startSession(string, iAppIntegrationSessionCallbackAsInterface);
            parcel2.writeNoException();
            c.c(parcel2, iAppIntegrationSessionStartSession);
            return true;
        }
    }

    IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback);
}

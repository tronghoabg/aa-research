package androidx.car.app.dialer;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.ITelephoneKeypadCallback;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class TelephoneKeypadCallbackDelegateImpl implements TelephoneKeypadCallbackDelegate {
    private final ITelephoneKeypadCallback mBinder;

    /* compiled from: WazeSource */
    @CarProtocol
    class TelephoneKeypadCallbackStub extends ITelephoneKeypadCallback.Stub {
        private final TelephoneKeypadCallback mTelephoneKeypadCallback;

        TelephoneKeypadCallbackStub(TelephoneKeypadCallback telephoneKeypadCallback) {
            this.mTelephoneKeypadCallback = telephoneKeypadCallback;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onKeyDown$1$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1608xb62da350(int i2) {
            this.mTelephoneKeypadCallback.onKeyDown(i2);
            return null;
        }

        /* renamed from: lambda$onKeyLongPress$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1609x958616ee(int i2) {
            this.mTelephoneKeypadCallback.onKeyLongPress(i2);
            return null;
        }

        /* renamed from: lambda$onKeyUp$2$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1610xbf34a9ca(int i2) {
            this.mTelephoneKeypadCallback.onKeyUp(i2);
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new RemoteUtils.HostCall() { // from class: androidx.car.app.dialer.TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1608xb62da350(i2);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new RemoteUtils.HostCall() { // from class: androidx.car.app.dialer.TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1609x958616ee(i2);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new RemoteUtils.HostCall() { // from class: androidx.car.app.dialer.TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub$$ExternalSyntheticLambda2
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1610xbf34a9ca(i2);
                }
            });
        }
    }

    private TelephoneKeypadCallbackDelegateImpl(TelephoneKeypadCallback telephoneKeypadCallback) {
        this.mBinder = new TelephoneKeypadCallbackStub(telephoneKeypadCallback);
    }

    public static TelephoneKeypadCallbackDelegate create(TelephoneKeypadCallback telephoneKeypadCallback) {
        return new TelephoneKeypadCallbackDelegateImpl(telephoneKeypadCallback);
    }

    @Override // androidx.car.app.dialer.TelephoneKeypadCallbackDelegate
    public void sendKeyDown(int i2, OnDoneCallback onDoneCallback) {
        try {
            ((ITelephoneKeypadCallback) Objects.requireNonNull(this.mBinder)).onKeyDown(i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.dialer.TelephoneKeypadCallbackDelegate
    public void sendKeyLongPress(int i2, OnDoneCallback onDoneCallback) {
        try {
            ((ITelephoneKeypadCallback) Objects.requireNonNull(this.mBinder)).onKeyLongPress(i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.dialer.TelephoneKeypadCallbackDelegate
    public void sendKeyUp(int i2, OnDoneCallback onDoneCallback) {
        try {
            ((ITelephoneKeypadCallback) Objects.requireNonNull(this.mBinder)).onKeyUp(i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}

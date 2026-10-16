package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class AlertCallbackDelegateImpl implements AlertCallbackDelegate {
    private final IAlertCallback mCallback;

    /* compiled from: WazeSource */
    @CarProtocol
    class AlertCallbackStub extends IAlertCallback.Stub {
        private final AlertCallback mCallback;

        AlertCallbackStub(AlertCallback alertCallback) {
            this.mCallback = alertCallback;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1625x74881a4b(int i2) {
            this.mCallback.onCancel(i2);
            return null;
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1626xeacf1252() {
            this.mCallback.onDismiss();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onCancel", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.AlertCallbackDelegateImpl$AlertCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1625x74881a4b(i2);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onDismiss", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.AlertCallbackDelegateImpl$AlertCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1626xeacf1252();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl(AlertCallback alertCallback) {
        this.mCallback = new AlertCallbackStub(alertCallback);
    }

    public static AlertCallbackDelegate create(AlertCallback alertCallback) {
        return new AlertCallbackDelegateImpl(alertCallback);
    }

    @Override // androidx.car.app.model.AlertCallbackDelegate
    public void sendCancel(int i2, OnDoneCallback onDoneCallback) {
        try {
            ((IAlertCallback) Objects.requireNonNull(this.mCallback)).onAlertCancelled(i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.model.AlertCallbackDelegate
    public void sendDismiss(OnDoneCallback onDoneCallback) {
        try {
            ((IAlertCallback) Objects.requireNonNull(this.mCallback)).onAlertDismissed(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}

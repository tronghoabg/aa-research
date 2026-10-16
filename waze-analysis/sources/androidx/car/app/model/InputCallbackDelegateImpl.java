package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class InputCallbackDelegateImpl implements InputCallbackDelegate {
    private final IInputCallback mCallback;

    /* compiled from: WazeSource */
    @CarProtocol
    class OnInputCallbackStub extends IInputCallback.Stub {
        private final InputCallback mCallback;

        OnInputCallbackStub(InputCallback inputCallback) {
            this.mCallback = inputCallback;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1635x52ef688c(String str) {
            this.mCallback.onInputSubmitted(str);
            return null;
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1636x16cfd85f(String str) {
            this.mCallback.onInputTextChanged(str);
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onInputSubmitted", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.InputCallbackDelegateImpl$OnInputCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1635x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onInputTextChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.InputCallbackDelegateImpl$OnInputCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1636x16cfd85f(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl(InputCallback inputCallback) {
        this.mCallback = new OnInputCallbackStub(inputCallback);
    }

    public static InputCallbackDelegate create(InputCallback inputCallback) {
        return new InputCallbackDelegateImpl((InputCallback) Objects.requireNonNull(inputCallback));
    }

    @Override // androidx.car.app.model.InputCallbackDelegate
    public void sendInputSubmitted(String str, OnDoneCallback onDoneCallback) {
        try {
            ((IInputCallback) Objects.requireNonNull(this.mCallback)).onInputSubmitted(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.model.InputCallbackDelegate
    public void sendInputTextChanged(String str, OnDoneCallback onDoneCallback) {
        try {
            ((IInputCallback) Objects.requireNonNull(this.mCallback)).onInputTextChanged(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}

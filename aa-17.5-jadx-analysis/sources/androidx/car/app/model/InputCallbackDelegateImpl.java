package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.ub;
import defpackage.uc;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class InputCallbackDelegateImpl implements uc {
    private final IInputCallback mCallback;

    @rb
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final ub mCallback;

        public OnInputCallbackStub(ub ubVar) {
            this.mCallback = ubVar;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m146x52ef688c(String str) throws xr {
            this.mCallback.a();
            return null;
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m147x16cfd85f(String str) throws xr {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onInputSubmitted", new xy() { // from class: ue
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m146x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onInputTextChanged", new xy() { // from class: ud
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m147x16cfd85f(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl(ub ubVar) {
        this.mCallback = new OnInputCallbackStub(ubVar);
    }

    public static uc create(ub ubVar) {
        ubVar.getClass();
        return new InputCallbackDelegateImpl(ubVar);
    }

    @Override // defpackage.uc
    public void sendInputSubmitted(String str, qu quVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputSubmitted(str, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.uc
    public void sendInputTextChanged(String str, qu quVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputTextChanged(str, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}

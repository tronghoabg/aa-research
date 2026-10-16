package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.vu;
import defpackage.wa;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class TabCallbackDelegateImpl implements vu {
    private final ITabCallback mStubCallback;

    @rb
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final wa mCallback;

        public TabCallbackStub(wa waVar) {
            this.mCallback = waVar;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m162x7d0e011a(String str) throws xr {
            this.mCallback.a(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onTabSelected", new xy() { // from class: vv
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m162x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl(wa waVar) {
        this.mStubCallback = new TabCallbackStub(waVar);
    }

    public static vu create(wa waVar) {
        return new TabCallbackDelegateImpl(waVar);
    }

    @Override // defpackage.vu
    public void sendTabSelected(String str, qu quVar) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            iTabCallback.getClass();
            iTabCallback.onTabSelected(str, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}

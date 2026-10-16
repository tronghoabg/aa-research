package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public class TabCallbackDelegateImpl implements TabCallbackDelegate {
    private final ITabCallback mStubCallback;

    /* compiled from: WazeSource */
    @CarProtocol
    class TabCallbackStub extends ITabCallback.Stub {
        private final TabTemplate.TabCallback mCallback;

        TabCallbackStub(TabTemplate.TabCallback tabCallback) {
            this.mCallback = tabCallback;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1659x7d0e011a(String str) {
            this.mCallback.onTabSelected(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onTabSelected", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.TabCallbackDelegateImpl$TabCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1659x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl(TabTemplate.TabCallback tabCallback) {
        this.mStubCallback = new TabCallbackStub(tabCallback);
    }

    public static TabCallbackDelegate create(TabTemplate.TabCallback tabCallback) {
        return new TabCallbackDelegateImpl(tabCallback);
    }

    @Override // androidx.car.app.model.TabCallbackDelegate
    public void sendTabSelected(String str, OnDoneCallback onDoneCallback) {
        try {
            ((ITabCallback) Objects.requireNonNull(this.mStubCallback)).onTabSelected(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}

package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements TabCallbackDelegate {
    private final ITabCallback mStubCallback;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final TabTemplate.TabCallback mCallback;

        public TabCallbackStub(TabTemplate.TabCallback tabCallback) {
            this.mCallback = tabCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTabSelected$0(String str) {
            this.mCallback.onTabSelected(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onTabSelected", new c(this, str, 2));
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
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}

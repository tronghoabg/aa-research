package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements OnContentRefreshDelegate {
    private final IOnContentRefreshListener mListener;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final OnContentRefreshListener mOnContentRefreshListener;

        public OnContentRefreshListenerStub(OnContentRefreshListener onContentRefreshListener) {
            this.mOnContentRefreshListener = onContentRefreshListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            this.mOnContentRefreshListener.onContentRefreshRequested();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onClick", new a(this, 2));
        }
    }

    private OnContentRefreshDelegateImpl(OnContentRefreshListener onContentRefreshListener) {
        this.mListener = new OnContentRefreshListenerStub(onContentRefreshListener);
    }

    public static OnContentRefreshDelegate create(OnContentRefreshListener onContentRefreshListener) {
        return new OnContentRefreshDelegateImpl(onContentRefreshListener);
    }

    @Override // androidx.car.app.model.OnContentRefreshDelegate
    public void sendContentRefreshRequested(OnDoneCallback onDoneCallback) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}

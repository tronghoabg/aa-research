package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements OnSelectedDelegate {
    private final IOnSelectedListener mStub;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ItemList.OnSelectedListener mListener;

        public OnSelectedListenerStub(ItemList.OnSelectedListener onSelectedListener) {
            this.mListener = onSelectedListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            this.mListener.onSelected(i);
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSelectedListener", new b(this, i, 1));
        }
    }

    private OnSelectedDelegateImpl(ItemList.OnSelectedListener onSelectedListener) {
        this.mStub = new OnSelectedListenerStub(onSelectedListener);
    }

    public static OnSelectedDelegate create(ItemList.OnSelectedListener onSelectedListener) {
        return new OnSelectedDelegateImpl(onSelectedListener);
    }

    @Override // androidx.car.app.model.OnSelectedDelegate
    public void sendSelected(int i, OnDoneCallback onDoneCallback) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}

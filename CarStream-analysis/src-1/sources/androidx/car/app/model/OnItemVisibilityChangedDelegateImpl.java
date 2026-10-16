package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements OnItemVisibilityChangedDelegate {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final ItemList.OnItemVisibilityChangedListener mListener;

        public OnItemVisibilityChangedListenerStub(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
            this.mListener = onItemVisibilityChangedListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            this.mListener.onItemVisibilityChanged(i, i2);
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onItemVisibilityChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.e
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onItemVisibilityChanged$0(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        this.mStub = new OnItemVisibilityChangedListenerStub(onItemVisibilityChangedListener);
    }

    public static OnItemVisibilityChangedDelegate create(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        return new OnItemVisibilityChangedDelegateImpl(onItemVisibilityChangedListener);
    }

    @Override // androidx.car.app.model.OnItemVisibilityChangedDelegate
    public void sendItemVisibilityChanged(int i, int i2, OnDoneCallback onDoneCallback) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}

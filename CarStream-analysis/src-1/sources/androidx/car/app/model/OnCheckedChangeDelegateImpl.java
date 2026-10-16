package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.Toggle;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements OnCheckedChangeDelegate {
    private final IOnCheckedChangeListener mStub;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final Toggle.OnCheckedChangeListener mListener;

        public OnCheckedChangeListenerStub(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
            this.mListener = onCheckedChangeListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            this.mListener.onCheckedChange(z);
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onCheckedChange", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.d
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onCheckedChange$0(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
        this.mStub = new OnCheckedChangeListenerStub(onCheckedChangeListener);
    }

    public static OnCheckedChangeDelegate create(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
        return new OnCheckedChangeDelegateImpl(onCheckedChangeListener);
    }

    @Override // androidx.car.app.model.OnCheckedChangeDelegate
    public void sendCheckedChange(boolean z, OnDoneCallback onDoneCallback) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}

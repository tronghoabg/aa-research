package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements PanModeDelegate {
    private final IPanModeListener mStub;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final PanModeListener mListener;

        public PanModeListenerStub(PanModeListener panModeListener) {
            this.mListener = panModeListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            this.mListener.onPanModeChanged(z);
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onPanModeChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.model.a
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onPanModeChanged$0(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(PanModeListener panModeListener) {
        this.mStub = new PanModeListenerStub(panModeListener);
    }

    public static PanModeDelegate create(PanModeListener panModeListener) {
        return new PanModeDelegateImpl(panModeListener);
    }

    @Override // androidx.car.app.navigation.model.PanModeDelegate
    public void sendPanModeChanged(boolean z, OnDoneCallback onDoneCallback) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}

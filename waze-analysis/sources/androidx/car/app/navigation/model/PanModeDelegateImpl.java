package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class PanModeDelegateImpl implements PanModeDelegate {
    private final IPanModeListener mStub;

    /* compiled from: WazeSource */
    @CarProtocol
    class PanModeListenerStub extends IPanModeListener.Stub {
        private final PanModeListener mListener;

        PanModeListenerStub(PanModeListener panModeListener) {
            this.mListener = panModeListener;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        /* synthetic */ Object m1662xa5766d47(boolean z) {
            this.mListener.onPanModeChanged(z);
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onPanModeChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.model.PanModeDelegateImpl$PanModeListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1662xa5766d47(z);
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
            ((IPanModeListener) Objects.requireNonNull(this.mStub)).onPanModeChanged(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}

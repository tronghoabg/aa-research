package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.Toggle;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class OnCheckedChangeDelegateImpl implements OnCheckedChangeDelegate {
    private final IOnCheckedChangeListener mStub;

    /* compiled from: WazeSource */
    @CarProtocol
    class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final Toggle.OnCheckedChangeListener mListener;

        OnCheckedChangeListenerStub(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
            this.mListener = onCheckedChangeListener;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        /* synthetic */ Object m1637xd37d5aa3(boolean z) {
            this.mListener.onCheckedChange(z);
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onCheckedChange", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1637xd37d5aa3(z);
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
            ((IOnCheckedChangeListener) Objects.requireNonNull(this.mStub)).onCheckedChange(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}

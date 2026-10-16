package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class OnClickDelegateImpl implements OnClickDelegate {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: WazeSource */
    class OnClickListenerStub extends IOnClickListener.Stub {
        private final OnClickListener mOnClickListener;

        OnClickListenerStub(OnClickListener onClickListener) {
            this.mOnClickListener = onClickListener;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        /* synthetic */ Object m1638xba9c2d94() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onClick", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnClickDelegateImpl$OnClickListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1638xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl(OnClickListener onClickListener, boolean z) {
        this.mListener = new OnClickListenerStub(onClickListener);
        this.mIsParkedOnly = z;
    }

    public static OnClickDelegate create(OnClickListener onClickListener) {
        return new OnClickDelegateImpl(onClickListener, onClickListener instanceof ParkedOnlyOnClickListener);
    }

    @Override // androidx.car.app.model.OnClickDelegate
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    @Override // androidx.car.app.model.OnClickDelegate
    public void sendClick(OnDoneCallback onDoneCallback) {
        try {
            ((IOnClickListener) Objects.requireNonNull(this.mListener)).onClick(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}

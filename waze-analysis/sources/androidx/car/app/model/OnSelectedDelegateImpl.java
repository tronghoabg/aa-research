package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class OnSelectedDelegateImpl implements OnSelectedDelegate {
    private final IOnSelectedListener mStub;

    /* compiled from: WazeSource */
    @CarProtocol
    class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ItemList.OnSelectedListener mListener;

        OnSelectedListenerStub(ItemList.OnSelectedListener onSelectedListener) {
            this.mListener = onSelectedListener;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        /* synthetic */ Object m1641x5a7f46f5(int i2) {
            this.mListener.onSelected(i2);
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSelectedListener", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnSelectedDelegateImpl$OnSelectedListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1641x5a7f46f5(i2);
                }
            });
        }
    }

    private OnSelectedDelegateImpl(ItemList.OnSelectedListener onSelectedListener) {
        this.mStub = new OnSelectedListenerStub(onSelectedListener);
    }

    public static OnSelectedDelegate create(ItemList.OnSelectedListener onSelectedListener) {
        return new OnSelectedDelegateImpl(onSelectedListener);
    }

    @Override // androidx.car.app.model.OnSelectedDelegate
    public void sendSelected(int i2, OnDoneCallback onDoneCallback) {
        try {
            ((IOnSelectedListener) Objects.requireNonNull(this.mStub)).onSelected(i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}

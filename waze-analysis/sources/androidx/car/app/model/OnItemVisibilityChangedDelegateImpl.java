package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class OnItemVisibilityChangedDelegateImpl implements OnItemVisibilityChangedDelegate {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: WazeSource */
    class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final ItemList.OnItemVisibilityChangedListener mListener;

        OnItemVisibilityChangedListenerStub(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
            this.mListener = onItemVisibilityChangedListener;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        /* synthetic */ Object m1640xb730acdb(int i2, int i3) {
            this.mListener.onItemVisibilityChanged(i2, i3);
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i2, final int i3, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onItemVisibilityChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1640xb730acdb(i2, i3);
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
    public void sendItemVisibilityChanged(int i2, int i3, OnDoneCallback onDoneCallback) {
        try {
            ((IOnItemVisibilityChangedListener) Objects.requireNonNull(this.mStub)).onItemVisibilityChanged(i2, i3, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}

package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.uh;
import defpackage.uw;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class OnItemVisibilityChangedDelegateImpl implements uw {
    private final IOnItemVisibilityChangedListener mStub;

    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final uh mListener;

        public OnItemVisibilityChangedListenerStub(uh uhVar) {
            this.mListener = uhVar;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m151xb730acdb(int i, int i2) throws xr {
            this.mListener.a(i, i2);
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onItemVisibilityChanged", new xy() { // from class: ux
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m151xb730acdb(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(uh uhVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(uhVar);
    }

    public static uw create(uh uhVar) {
        return new OnItemVisibilityChangedDelegateImpl(uhVar);
    }

    @Override // defpackage.uw
    public void sendItemVisibilityChanged(int i, int i2, qu quVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            iOnItemVisibilityChangedListener.getClass();
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}

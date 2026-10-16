package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.ui;
import defpackage.uy;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class OnSelectedDelegateImpl implements uy {
    private final IOnSelectedListener mStub;

    @rb
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ui mListener;

        public OnSelectedListenerStub(ui uiVar) {
            this.mListener = uiVar;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m152x5a7f46f5(int i) throws xr {
            this.mListener.a(i);
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onSelectedListener", new xy() { // from class: uz
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m152x5a7f46f5(i);
                }
            });
        }
    }

    private OnSelectedDelegateImpl(ui uiVar) {
        this.mStub = new OnSelectedListenerStub(uiVar);
    }

    public static uy create(ui uiVar) {
        return new OnSelectedDelegateImpl(uiVar);
    }

    @Override // defpackage.uy
    public void sendSelected(int i, qu quVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            iOnSelectedListener.getClass();
            iOnSelectedListener.onSelected(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}

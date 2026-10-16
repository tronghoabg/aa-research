package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.ut;
import defpackage.uv;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class OnContentRefreshDelegateImpl implements ut {
    private final IOnContentRefreshListener mListener;

    @rb
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final uv mOnContentRefreshListener;

        public OnContentRefreshListenerStub(uv uvVar) {
            this.mOnContentRefreshListener = uvVar;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub, reason: not valid java name */
        public /* synthetic */ Object m150xff9c1a9c() throws xr {
            this.mOnContentRefreshListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onClick", new xy() { // from class: uu
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m150xff9c1a9c();
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl(uv uvVar) {
        this.mListener = new OnContentRefreshListenerStub(uvVar);
    }

    public static ut create(uv uvVar) {
        return new OnContentRefreshDelegateImpl(uvVar);
    }

    @Override // defpackage.ut
    public void sendContentRefreshRequested(qu quVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            iOnContentRefreshListener.getClass();
            iOnContentRefreshListener.onContentRefreshRequested(new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}

package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.uq;
import defpackage.us;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class OnClickDelegateImpl implements uq {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final us mOnClickListener;

        public OnClickListenerStub(us usVar) {
            this.mOnClickListener = usVar;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ Object m149xba9c2d94() throws xr {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onClick", new xy() { // from class: ur
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m149xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl(us usVar, boolean z) {
        this.mListener = new OnClickListenerStub(usVar);
        this.mIsParkedOnly = z;
    }

    public static uq create(us usVar) {
        return new OnClickDelegateImpl(usVar, usVar instanceof ParkedOnlyOnClickListener);
    }

    @Override // defpackage.uq
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    @Override // defpackage.uq
    public void sendClick(qu quVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            iOnClickListener.getClass();
            iOnClickListener.onClick(new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}

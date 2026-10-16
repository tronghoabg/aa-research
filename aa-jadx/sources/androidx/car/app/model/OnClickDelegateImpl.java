package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class OnClickDelegateImpl implements defpackage.uv {
    private final boolean mIsParkedOnly;
    private final androidx.car.app.model.IOnClickListener mListener;

    public static class OnClickListenerStub extends androidx.car.app.model.IOnClickListener.Stub {
        private final defpackage.ux mOnClickListener;

        public OnClickListenerStub(defpackage.ux uxVar) {
            this.mOnClickListener = uxVar;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m151xba9c2d94() throws defpackage.xy {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.tw.b(iOnDoneCallback, "onClick", new defpackage.yf() { // from class: uw
                @Override // defpackage.yf
                public final java.lang.Object a() {
                    return this.a.m151xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl(defpackage.ux uxVar, boolean z) {
        this.mListener = new androidx.car.app.model.OnClickDelegateImpl.OnClickListenerStub(uxVar);
        this.mIsParkedOnly = z;
    }

    public static defpackage.uv create(defpackage.ux uxVar) {
        return new androidx.car.app.model.OnClickDelegateImpl(uxVar, uxVar instanceof androidx.car.app.model.ParkedOnlyOnClickListener);
    }

    @Override // defpackage.uv
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    @Override // defpackage.uv
    public void sendClick(defpackage.qz qzVar) {
        try {
            androidx.car.app.model.IOnClickListener iOnClickListener = this.mListener;
            iOnClickListener.getClass();
            iOnClickListener.onClick(new androidx.car.app.utils.RemoteUtils$1(qzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}

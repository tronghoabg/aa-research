package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class TabCallbackDelegateImpl implements defpackage.wb {
    private final androidx.car.app.model.ITabCallback mStubCallback;

    @defpackage.rg
    public static class TabCallbackStub extends androidx.car.app.model.ITabCallback.Stub {
        private final defpackage.wh mCallback;

        public TabCallbackStub(defpackage.wh whVar) {
            this.mCallback = whVar;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m165x7d0e011a(java.lang.String str) throws defpackage.xy {
            this.mCallback.a(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.tw.b(iOnDoneCallback, "onTabSelected", new defpackage.yf() { // from class: wc
                @Override // defpackage.yf
                public final java.lang.Object a() {
                    return this.a.m165x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl(defpackage.wh whVar) {
        this.mStubCallback = new androidx.car.app.model.TabCallbackDelegateImpl.TabCallbackStub(whVar);
    }

    public static defpackage.wb create(defpackage.wh whVar) {
        return new androidx.car.app.model.TabCallbackDelegateImpl(whVar);
    }

    @Override // defpackage.wb
    public void sendTabSelected(java.lang.String str, defpackage.qz qzVar) {
        try {
            androidx.car.app.model.ITabCallback iTabCallback = this.mStubCallback;
            iTabCallback.getClass();
            iTabCallback.onTabSelected(str, new androidx.car.app.utils.RemoteUtils$1(qzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}

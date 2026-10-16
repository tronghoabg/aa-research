package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.sz;
import defpackage.ta;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class AlertCallbackDelegateImpl implements ta {
    private final IAlertCallback mCallback;

    @rb
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final sz mCallback;

        public AlertCallbackStub(sz szVar) {
            this.mCallback = szVar;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m144x74881a4b(int i) throws xr {
            this.mCallback.b();
            return null;
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m145xeacf1252() throws xr {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onCancel", new xy() { // from class: tc
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m144x74881a4b(i);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onDismiss", new xy() { // from class: tb
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m145xeacf1252();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl(sz szVar) {
        this.mCallback = new AlertCallbackStub(szVar);
    }

    public static ta create(sz szVar) {
        return new AlertCallbackDelegateImpl(szVar);
    }

    @Override // defpackage.ta
    public void sendCancel(int i, qu quVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertCancelled(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ta
    public void sendDismiss(qu quVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertDismissed(new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}

package androidx.car.app.dialer;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITelephoneKeypadCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.rf;
import defpackage.rg;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class TelephoneKeypadCallbackDelegateImpl implements rg {
    private final ITelephoneKeypadCallback mBinder;

    @rb
    public static class TelephoneKeypadCallbackStub extends ITelephoneKeypadCallback.Stub {
        private final rf mTelephoneKeypadCallback;

        public TelephoneKeypadCallbackStub(rf rfVar) {
            this.mTelephoneKeypadCallback = rfVar;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onKeyDown$1$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m137xb62da350(int i) throws xr {
            this.mTelephoneKeypadCallback.a();
            return null;
        }

        /* renamed from: lambda$onKeyLongPress$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m138x958616ee(int i) throws xr {
            this.mTelephoneKeypadCallback.b();
            return null;
        }

        /* renamed from: lambda$onKeyUp$2$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m139xbf34a9ca(int i) throws xr {
            this.mTelephoneKeypadCallback.c();
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(final int i, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new xy() { // from class: ri
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m137xb62da350(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(final int i, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new xy() { // from class: rh
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m138x958616ee(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(final int i, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new xy() { // from class: rj
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m139xbf34a9ca(i);
                }
            });
        }
    }

    private TelephoneKeypadCallbackDelegateImpl(rf rfVar) {
        this.mBinder = new TelephoneKeypadCallbackStub(rfVar);
    }

    public static rg create(rf rfVar) {
        return new TelephoneKeypadCallbackDelegateImpl(rfVar);
    }

    @Override // defpackage.rg
    public void sendKeyDown(int i, qu quVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyDown(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.rg
    public void sendKeyLongPress(int i, qu quVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyLongPress(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.rg
    public void sendKeyUp(int i, qu quVar) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            iTelephoneKeypadCallback.getClass();
            iTelephoneKeypadCallback.onKeyUp(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}

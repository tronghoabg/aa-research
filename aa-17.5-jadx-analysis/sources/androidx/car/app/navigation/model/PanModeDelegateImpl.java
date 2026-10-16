package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.xc;
import defpackage.xe;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class PanModeDelegateImpl implements xc {
    private final IPanModeListener mStub;

    @rb
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final xe mListener;

        public PanModeListenerStub(xe xeVar) {
            this.mListener = xeVar;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m164xa5766d47(boolean z) throws xr {
            this.mListener.a(z);
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onPanModeChanged", new xy() { // from class: xd
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m164xa5766d47(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(xe xeVar) {
        this.mStub = new PanModeListenerStub(xeVar);
    }

    public static xc create(xe xeVar) {
        return new PanModeDelegateImpl(xeVar);
    }

    @Override // defpackage.xc
    public void sendPanModeChanged(boolean z, qu quVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            iPanModeListener.getClass();
            iPanModeListener.onPanModeChanged(z, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}

package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.uo;
import defpackage.wd;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class OnCheckedChangeDelegateImpl implements uo {
    private final IOnCheckedChangeListener mStub;

    @rb
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final wd mListener;

        public OnCheckedChangeListenerStub(wd wdVar) {
            this.mListener = wdVar;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m148xd37d5aa3(boolean z) throws xr {
            this.mListener.a(z);
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onCheckedChange", new xy() { // from class: up
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m148xd37d5aa3(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(wd wdVar) {
        this.mStub = new OnCheckedChangeListenerStub(wdVar);
    }

    public static uo create(wd wdVar) {
        return new OnCheckedChangeDelegateImpl(wdVar);
    }

    @Override // defpackage.uo
    public void sendCheckedChange(boolean z, qu quVar) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            iOnCheckedChangeListener.getClass();
            iOnCheckedChangeListener.onCheckedChange(z, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}

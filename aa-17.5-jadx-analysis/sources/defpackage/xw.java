package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final /* synthetic */ class xw implements xz {
    public final /* synthetic */ IOnDoneCallback a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ xw(IOnDoneCallback iOnDoneCallback, Object obj, String str, int i) {
        this.d = i;
        this.a = iOnDoneCallback;
        this.c = obj;
        this.b = str;
    }

    @Override // defpackage.xz
    public final Object a() throws RemoteException {
        Bundleable bundleable;
        if (this.d == 0) {
            try {
                this.a.onFailure(new Bundleable(new FailureResponse((Throwable) this.b)));
            } catch (xr e) {
                Log.e("CarApp.Dispatch", "Serialization failure in ".concat((String) this.c), e);
            }
            return null;
        }
        Object obj = this.c;
        IOnDoneCallback iOnDoneCallback = this.a;
        if (obj == null) {
            bundleable = null;
        } else {
            try {
                bundleable = new Bundleable(obj);
            } catch (xr e2) {
                tr.f(iOnDoneCallback, (String) this.b, e2);
            }
        }
        iOnDoneCallback.onSuccess(bundleable);
        return null;
    }

    public /* synthetic */ xw(IOnDoneCallback iOnDoneCallback, Throwable th, String str, int i) {
        this.d = i;
        this.a = iOnDoneCallback;
        this.b = th;
        this.c = str;
    }
}

package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public abstract class slt extends BasePendingResult implements slu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected slt(sld sldVar) {
        super(sldVar);
        if (sldVar == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
    }

    private final void l(RemoteException remoteException) {
        f(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(skq skqVar) throws RemoteException;

    public final void e(skq skqVar) throws DeadObjectException {
        try {
            b(skqVar);
        } catch (DeadObjectException e) {
            l(e);
            throw e;
        } catch (RemoteException e2) {
            l(e2);
        }
    }

    public final void f(Status status) {
        spu.an(!status.c(), "Failed result must not be success");
        j(a(status));
    }

    @Override // defpackage.slu
    public final /* bridge */ /* synthetic */ void g() {
        throw null;
    }
}

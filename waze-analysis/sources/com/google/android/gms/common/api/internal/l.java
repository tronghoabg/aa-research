package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class l extends BasePendingResult {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected l(com.google.android.gms.common.api.t tVar) {
        super(tVar);
        av.n(tVar, "GoogleApiClient must not be null");
    }

    private final void l(RemoteException remoteException) {
        f(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(com.google.android.gms.common.api.b bVar);

    public final void e(com.google.android.gms.common.api.b bVar) throws DeadObjectException {
        try {
            b(bVar);
        } catch (DeadObjectException e2) {
            l(e2);
            throw e2;
        } catch (RemoteException e3) {
            l(e3);
        }
    }

    public final void f(Status status) {
        av.d(!status.f(), "Failed result must not be success");
        j(status);
    }
}

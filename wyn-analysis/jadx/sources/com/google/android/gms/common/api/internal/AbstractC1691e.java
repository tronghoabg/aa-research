package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1691e extends BasePendingResult implements InterfaceC1692f {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1691e(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        AbstractC1732v.j(oVar, "GoogleApiClient must not be null");
        AbstractC1732v.j(iVar, "Api must not be null");
        this.clientKey = iVar.f26435b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar) throws RemoteException;

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.t tVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e7) {
            setFailedResult(new Status(8, e7.getLocalizedMessage(), null, null));
            throw e7;
        } catch (RemoteException e10) {
            setFailedResult(new Status(8, e10.getLocalizedMessage(), null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1692f
    public final void setFailedResult(Status status) {
        AbstractC1732v.a("Failed result must not be success", !status.V());
        com.google.android.gms.common.api.t tVarCreateFailedResult = createFailedResult(status);
        setResult((AbstractC1691e) tVarCreateFailedResult);
        onSetFailedResult(tVarCreateFailedResult);
    }
}

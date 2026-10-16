package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class smr extends com.google.android.gms.common.api.internal.BasePendingResult implements defpackage.sms {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected smr(defpackage.slz slzVar) {
        super(slzVar);
        if (slzVar == null) {
            throw new java.lang.NullPointerException("GoogleApiClient must not be null");
        }
    }

    private final void l(android.os.RemoteException remoteException) {
        f(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(defpackage.slm slmVar) throws android.os.RemoteException;

    public final void e(defpackage.slm slmVar) throws android.os.DeadObjectException {
        try {
            b(slmVar);
        } catch (android.os.DeadObjectException e) {
            l(e);
            throw e;
        } catch (android.os.RemoteException e2) {
            l(e2);
        }
    }

    public final void f(com.google.android.gms.common.api.Status status) {
        defpackage.sqs.ar(!status.c(), "Failed result must not be success");
        j(a(status));
    }

    @Override // defpackage.sms
    public final /* bridge */ /* synthetic */ void g() {
        throw null;
    }
}

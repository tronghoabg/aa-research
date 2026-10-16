package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class swy extends swu {
    private final slu a;
    private final swv b;
    private final qwr c;

    public swy(swv swvVar, slu sluVar, qwr qwrVar) {
        this.b = swvVar;
        this.a = sluVar;
        this.c = qwrVar;
    }

    @Override // defpackage.swu
    public final void b(Status status) {
        boolean zC = status.c();
        slu sluVar = this.a;
        if (zC) {
            sluVar.g();
        } else {
            sluVar.g();
        }
    }

    @Override // defpackage.swu
    public final void c(Status status) throws RemoteException {
        if (!status.c()) {
            this.a.g();
            return;
        }
        qwr qwrVar = this.c;
        if (qwrVar == null) {
            this.a.g();
        } else {
            this.b.e(qwrVar, this);
        }
    }
}

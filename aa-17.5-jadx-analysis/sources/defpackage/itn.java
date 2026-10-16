package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class itn implements ite {
    private final qug a;

    public itn(qug qugVar) {
        this.a = qugVar;
    }

    @Override // defpackage.ite
    public final int a() throws RemoteException {
        return this.a.e();
    }

    @Override // defpackage.ite
    @ResultIgnorabilityUnspecified
    public final itf b(int i) throws RemoteException {
        qum qumVarF = this.a.f(i);
        if (qumVarF != null) {
            return new ito(qumVarF);
        }
        return null;
    }

    @Override // defpackage.ite
    public final itf c(int i, yfq yfqVar) throws RemoteException {
        qum qumVarG = this.a.g(i, wub.ay(yfqVar));
        if (qumVarG != null) {
            return new ito(qumVarG);
        }
        return null;
    }

    @Override // defpackage.ite
    public final void d() throws RemoteException {
        this.a.h();
    }
}

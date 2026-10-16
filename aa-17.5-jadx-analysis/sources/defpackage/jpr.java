package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class jpr implements jpu {
    public final /* synthetic */ jpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpr(jpw jpwVar, int i) {
        this.b = i;
        this.a = jpwVar;
    }

    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.b;
        if (i == 0) {
            qzf qzfVarL = this.a.m().L();
            qzfVarL.getClass();
            return qzfVarL;
        }
        if (i == 1) {
            qvx qvxVarB = this.a.m().B();
            qvxVarB.getClass();
            return qvxVarB;
        }
        jpw jpwVar = this.a;
        if (i == 2) {
            return Boolean.valueOf(jpwVar.m().bo());
        }
        rjb rjbVarP = jpwVar.m().P();
        rjbVarP.getClass();
        return rjbVarP;
    }
}

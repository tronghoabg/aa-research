package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class imv implements IBinder.DeathRecipient {
    public final Object a;
    private final qze b;
    private final /* synthetic */ int c;

    public imv(qyw qywVar, qze qzeVar, int i) throws RemoteException {
        this.c = i;
        this.a = qywVar;
        this.b = qzeVar;
        qywVar.asBinder().linkToDeath(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qyw] */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        if (this.c != 0) {
            ((ype) ina.a.l().ai((char) 444)).u("CarVideoFocusListener died");
            this.b.k(this.a);
        } else {
            ((ype) ina.a.l().ai((char) 462)).u("Frame Debug callback died");
            this.b.a((qwh) this.a);
        }
    }

    public imv(qwh qwhVar, qze qzeVar, int i) {
        this.c = i;
        this.a = qwhVar;
        this.b = qzeVar;
    }
}

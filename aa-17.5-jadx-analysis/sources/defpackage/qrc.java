package defpackage;

import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class qrc implements Callable {
    final /* synthetic */ qvu a;
    final /* synthetic */ qrg b;

    public qrc(qrg qrgVar, qvu qvuVar) {
        this.a = qvuVar;
        this.b = qrgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        yop yopVarAi = qrg.a.l().ai(7676);
        qvu qvuVar = this.a;
        yopVarAi.y("registerClient on main thread. client=%s", qvuVar.asBinder());
        qrg qrgVar = this.b;
        qrgVar.j();
        List list = qrgVar.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((qrf) it.next()).a.asBinder() == qvuVar.asBinder()) {
                qrg.a.l().ai(7678).y("Client %s already registered", this.a.asBinder());
                return false;
            }
        }
        try {
            list.add(new qrf(qrgVar, qvuVar));
            return true;
        } catch (RemoteException unused) {
            qrg.a.g().ai(7677).u("Client already dead?");
            return false;
        }
    }
}

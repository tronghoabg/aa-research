package defpackage;

import android.os.RemoteException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class rnx {
    public final qvb a;
    public final Object b = new Object();
    public final LinkedList c = new LinkedList();
    public final qvd e = new qvd();
    public volatile boolean d = true;
    private final qqw[] f = new qqw[4];

    public rnx(qvb qvbVar) {
        this.a = qvbVar;
    }

    public final void a() {
        if (omc.c("CAR.AUDIO", 3)) {
            rrd.a("CAR.AUDIO", null, "handleCarDisconnection");
        }
        this.d = false;
        qqw[] qqwVarArr = this.f;
        synchronized (qqwVarArr) {
            for (int i = 0; i < 4; i++) {
                qqw qqwVar = qqwVarArr[i];
                if (qqwVar != null) {
                    qqwVar.a();
                    qqwVarArr[i] = null;
                }
            }
        }
        synchronized (this.b) {
            LinkedList linkedList = this.c;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((rny) it.next()).d();
            }
            linkedList.clear();
        }
    }

    public final void b(RemoteException remoteException) throws qrz {
        a();
        olm.h(remoteException);
    }
}

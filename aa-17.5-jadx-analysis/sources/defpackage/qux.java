package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class qux extends ijo implements quy {
    private final sss a;
    private final qup b;
    private final Queue c;
    private qqq d;

    public qux(qup qupVar) {
        super("com.google.android.gms.car.ICarActivityStartProcessor");
        this.a = new sss(Looper.getMainLooper());
        this.c = new ArrayDeque();
        this.b = qupVar;
    }

    private final void d() {
        if (this.d != null) {
            qup qupVar = this.b;
            qupVar.getClass();
            rox.l(new rea(qupVar, 4));
            this.d = null;
        }
    }

    public final synchronized void a() {
        if (rrd.e("GH.PrxyActStartHndlr", 3)) {
            rrd.d(3, "GH.PrxyActStartHndlr", null, "Clearing local CarActivityStartListener %s", this.d);
        }
        d();
    }

    public final synchronized void b(qqq qqqVar) throws RemoteException {
        char[] cArr = null;
        if (rrd.e("GH.PrxyActStartHndlr", 3)) {
            rrd.d(3, "GH.PrxyActStartHndlr", null, "Registering local CarActivityStartListener %s", qqqVar);
        }
        if (this.d != null) {
            throw new IllegalStateException("Attempted registration of multiple CarActivityStartListeners");
        }
        qup qupVar = this.b;
        qupVar.bf();
        qupVar.aL(this);
        this.d = qqqVar;
        Queue queue = this.c;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            rbe.j(new qqy(qqqVar, (Intent) it.next(), 17, cArr));
        }
        queue.clear();
    }

    public final synchronized void c(qqq qqqVar) {
        if (rrd.e("GH.PrxyActStartHndlr", 3)) {
            rrd.d(3, "GH.PrxyActStartHndlr", null, "Unregistering local CarActivityStartListener %s", qqqVar);
        }
        qqq qqqVar2 = this.d;
        if (qqqVar2 != null && qqqVar2 != qqqVar) {
            throw new IllegalStateException("Attempting to unregister wrong CarActivityStartListener");
        }
        d();
    }

    @Override // defpackage.quy
    public final synchronized void e(Intent intent) {
        qqq qqqVar = this.d;
        char[] cArr = null;
        if (qqqVar != null) {
            this.a.post(new qqy(qqqVar, intent, 16, cArr));
            return;
        }
        if (rrd.e("GH.PrxyActStartHndlr", 4)) {
            rrd.d(4, "GH.PrxyActStartHndlr", null, "Trying to send processAndStart but there is no registered CarActivityStartProcessor. Queuing intent: %s", intent);
        }
        this.c.add(intent);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
        ijp.d(parcel);
        e(intent);
        return true;
    }

    public qux() {
        throw null;
    }
}

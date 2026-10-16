package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final /* synthetic */ class pru implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pru(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkCapabilities networkCapabilities;
        ptn ptnVar;
        int i = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                prv prvVar = (prv) obj;
                Deque deque = prvVar.b;
                synchronized (deque) {
                    Runnable runnable = (Runnable) deque.poll();
                    if (runnable == null) {
                        ((prv) obj).c = false;
                        return;
                    } else {
                        runnable.run();
                        prvVar.a.execute(new pru(obj, i));
                        return;
                    }
                }
            case 1:
                ((prb) this.a).k();
                return;
            case 2:
                Object obj2 = this.a;
                ptk ptkVar = (ptk) obj2;
                tmb tmbVar = ptkVar.g;
                if (ptkVar.f - tmbVar.a() > 0) {
                    ptkVar.a();
                    return;
                }
                tmbVar.a();
                try {
                    ConnectivityManager.NetworkCallback networkCallback = ((ptk) obj2).e;
                    if (networkCallback != null) {
                        ((ptk) obj2).b.unregisterNetworkCallback(networkCallback);
                    }
                    ((ptk) obj2).e = null;
                    return;
                } catch (RuntimeException e) {
                    ((ynz) ((ynz) ((ynz) ptk.a.h()).p(e)).ai((char) 6875)).y("Failed to unregister network. The exception is ignored: %s", e.getMessage());
                    return;
                }
            case 3:
                ptk ptkVar2 = (ptk) this.a;
                tmb tmbVar2 = ptkVar2.g;
                ptkVar2.f = tmbVar2.a() + 30000;
                if (ptkVar2.e != null) {
                    return;
                }
                tmbVar2.a();
                ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
                ptkVar2.e = networkCallback2;
                ConnectivityManager connectivityManager = ptkVar2.b;
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null && ((networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(0))) {
                    connectivityManager.reportNetworkConnectivity(activeNetwork, false);
                }
                try {
                    connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), networkCallback2);
                } catch (RuntimeException e2) {
                    ((ynz) ((ynz) ((ynz) ptk.a.h()).p(e2)).ai((char) 6873)).u("Cannot request mobile network, keeping on wifi");
                }
                ptkVar2.a();
                return;
            case 4:
                ptk ptkVar3 = ((pto) this.a).f;
                ptkVar3.c.execute(new pru(ptkVar3, 3));
                return;
            case 5:
                Object obj3 = this.a;
                pto ptoVar = (pto) obj3;
                PriorityQueue priorityQueue = ptoVar.c;
                if (priorityQueue.isEmpty()) {
                    ptoVar.e = null;
                    return;
                }
                ptn ptnVar2 = (ptn) priorityQueue.peek();
                if (ptnVar2 == null) {
                    return;
                }
                tmb tmbVar3 = ptoVar.d;
                long j = ptnVar2.a;
                long jA = tmbVar3.a();
                if (j <= jA) {
                    while (j <= jA) {
                        priorityQueue.poll();
                        if (priorityQueue.isEmpty() || (ptnVar = (ptn) priorityQueue.peek()) == null) {
                            ptoVar.a.execute(new pru(obj3, 4));
                        } else {
                            j = ptnVar.a;
                        }
                    }
                    ptoVar.a.execute(new pru(obj3, 4));
                }
                if (priorityQueue.isEmpty()) {
                    return;
                }
                ptoVar.b(j - jA);
                return;
            case 6:
                Object obj4 = this.a;
                ((pto) obj4).b.execute(new pru(obj4, 5));
                return;
            case 7:
                ((pwz) this.a).a();
                return;
            case 8:
                try {
                    Object obj5 = this.a;
                    ((puh) obj5).a.o(((puh) obj5).b.a(((puh) obj5).d));
                    ((CronetEngine) ((puh) obj5).c.c.a()).getGlobalMetricsDeltas();
                    return;
                } catch (Exception e3) {
                    ((ynz) ((ynz) puj.a.f()).ai((char) 6893)).u("Failed to read the response!");
                    ((puh) this.a).a.p(e3);
                    return;
                }
            case 9:
                ((pvu) this.a).j();
                return;
            case 10:
                ((pwb) this.a).a.o(new pwn("NetworkStackReady", Boolean.toString(true)));
                return;
            case 11:
                ((pwz) this.a).a();
                return;
            case 12:
                ((pxm) this.a).c();
                return;
            case 13:
                yob yobVar = pxr.a;
                ((pwz) this.a).a();
                return;
            case 14:
                ((pxo) this.a).a.p(new pwv(pwu.h.e("More redirects than allowed")));
                return;
            case 15:
                vaq.d();
                Object obj6 = this.a;
                vaq.d();
                if (((pyx) obj6).n) {
                    ((zgq) ((pyx) obj6).m.get()).c(new pru(obj6, 16), ((pyx) obj6).l);
                    return;
                } else {
                    ((pyx) obj6).d();
                    return;
                }
            case 16:
                ((pyx) this.a).d();
                return;
            case 17:
                ((ynz) ((ynz) pyx.a.f()).ai(6950)).x("Delay fuse run after %d ms.", pyx.b);
                ((pyx) this.a).c();
                return;
            case 18:
                pyu pyuVar = (pyu) this.a;
                pyuVar.c.b(pyuVar.a, pyuVar.b);
                return;
            case 19:
                pyv pyvVar = (pyv) this.a;
                pyvVar.c.b(pyvVar.a, pyvVar.b);
                return;
            default:
                Iterator it = ((qap) this.a).e.iterator();
                while (it.hasNext()) {
                    pzv pzvVar = (pzv) ((WeakReference) it.next()).get();
                    if (pzvVar != null) {
                        pzvVar.a();
                    }
                }
                return;
        }
    }

    public pru(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}

package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class pyu implements Runnable, zfj {
    public final Runnable a;
    public final pyw b;
    public final /* synthetic */ pyx c;
    private final aacq d;

    public pyu(pyx pyxVar, Runnable runnable, pyw pywVar, aacq aacqVar) {
        this.c = pyxVar;
        this.a = runnable;
        this.b = pywVar;
        this.d = aacqVar;
    }

    @Override // defpackage.zfj
    public final zgp a() throws Exception {
        zgq zgqVar = new zgq(new pru(this, 18));
        zgqVar.run();
        return zgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int size;
        xvh xvgVar;
        zfq zfqVar = zfq.a;
        woy.T(true, "Permit size (%s) cannot be larger than max permits (%s)", 1, 4);
        woy.Q(true, "Permit size must be > 0: %s", 1);
        aacq aacqVar = this.d;
        Object obj = aacqVar.b;
        synchronized (obj) {
            size = ((ArrayDeque) obj).size();
        }
        if (size == 0 && aacqVar.n(1)) {
            xvgVar = new xve(aacqVar);
        } else {
            try {
                xvgVar = new xvg(aacqVar);
                Object obj2 = aacqVar.b;
                synchronized (obj2) {
                    if (((ArrayDeque) obj2).size() >= 16384) {
                        aacqVar.l(Thread.currentThread());
                        throw new RejectedExecutionException();
                    }
                    ((ArrayDeque) obj2).add(xvgVar);
                }
            } finally {
                aacqVar.l(Thread.currentThread());
            }
        }
        zfb.g(xvgVar.a(), new xvd(this), zfqVar).c(xvgVar, zfq.a);
    }
}

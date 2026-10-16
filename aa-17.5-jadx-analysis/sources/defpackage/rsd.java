package defpackage;

import android.os.HandlerThread;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class rsd extends rug {
    private final rsc f;
    private final rse g;

    public rsd(int i, xkj xkjVar, rsc rscVar, rut rutVar, rse rseVar, ruf rufVar, acjs acjsVar) {
        super(i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3, rscVar, rutVar, rseVar, rufVar, xkjVar, new rui(new ruj(rseVar, acjsVar, i)));
        this.f = rscVar;
        this.g = rseVar;
    }

    @Override // defpackage.rug
    protected final void b(xiu xiuVar) {
        super.b(xiuVar);
        int iZ = wpq.z(xiuVar.b);
        if (iZ == 0 || iZ != 2) {
            this.f.m();
            return;
        }
        rsc rscVar = this.f;
        qpn qpnVar = (qpn) rscVar;
        qpnVar.h(ouo.AUDIO_BOTTOM_HALF_CAR_READY);
        synchronized (qpnVar.k) {
            if (((qpn) rscVar).l) {
                return;
            }
            ((qpn) rscVar).l = true;
            HandlerThread handlerThread = ((qpn) rscVar).h;
            handlerThread.start();
            ((qpn) rscVar).i = new qpm((qpn) rscVar, handlerThread.getLooper(), ((qpn) rscVar).m, ((qpn) rscVar).n.e());
            qpm qpmVar = ((qpn) rscVar).i;
            qpmVar.getClass();
            int i = ((qpn) rscVar).r;
            xkj xkjVar = ((qpn) rscVar).f;
            synchronized (qpmVar) {
                qpmVar.c = false;
                qpmVar.sendMessage(qpmVar.obtainMessage(1, i - 1, 0, xkjVar));
            }
            try {
                if (!qpmVar.b.tryAcquire(5000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Config change took too long");
                }
                qpu qpuVar = ((qpn) rscVar).b;
                int i2 = ((qpn) rscVar).c;
                qpx.a.f().ai(7601).w("Mark stream ready: %d", i2);
                ypf ypfVar = qqv.a;
                int iAc = a.ac(i2);
                synchronized (((qpx) qpuVar).c) {
                    int[] iArr = ((qpx) qpuVar).d;
                    iArr[iAc] = 1 | iArr[iAc];
                }
                qpo qpoVar = ((qpx) qpuVar).g[iAc];
                if (qpoVar != null) {
                    qpoVar.d();
                }
                ((qpx) qpuVar).f.a(xhj.AUDIO_FOCUS_STATE_INVALID);
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.rug
    public final void c() {
        this.g.a();
        super.c();
    }

    @Override // defpackage.ruq
    public final rvz y() {
        return rvz.AUDIO;
    }
}

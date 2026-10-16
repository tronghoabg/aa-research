package defpackage;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class iwj implements iwf {
    private Thread a;
    public final /* synthetic */ iwk c;

    protected iwj(iwk iwkVar) {
        this.c = iwkVar;
    }

    @Override // defpackage.iwf
    public final void a() throws InterruptedException {
        Thread thread = this.a;
        if (thread != null) {
            iwk iwkVar = this.c;
            try {
                thread.join(3000L);
            } catch (InterruptedException unused) {
            }
            if (thread.isAlive()) {
                ((ype) ((ype) iwkVar.c.h()).ai((char) 1469)).y("Encoding thread did not quit! [%s]", thread.getName());
                iwkVar.f = true;
            }
            this.a = null;
        }
    }

    @Override // defpackage.iwf
    public final boolean b() {
        Semaphore semaphore = new Semaphore(0);
        aq aqVar = new aq(this, semaphore, 16, null);
        iwk iwkVar = this.c;
        Thread thread = new Thread(aqVar, iwkVar.e());
        this.a = thread;
        thread.start();
        Thread thread2 = this.a;
        thread2.getClass();
        try {
            yph yphVar = iwkVar.c;
            ((ype) ((ype) yphVar.f()).ai(1470)).y("wait for encoder init [%s]", thread2.getName());
            int i = 0;
            boolean z = false;
            while (true) {
                i++;
                if (i > iwkVar.a() || z) {
                    break;
                }
                if (semaphore.tryAcquire(500L, TimeUnit.MILLISECONDS)) {
                    z = true;
                } else if (!thread2.isAlive()) {
                    break;
                }
            }
            if (z) {
                ((ype) ((ype) yphVar.f()).ai(1471)).y("encoder init done [%s]", thread2.getName());
                return z;
            }
            ((ype) ((ype) yphVar.h()).ai(1473)).R("failed to start encoding %d %b [%s]", Integer.valueOf(i), Boolean.valueOf(thread2.isAlive()), thread2.getName());
            return z;
        } catch (InterruptedException e) {
            ((ype) ((ype) ((ype) iwkVar.c.h()).p(e)).ai((char) 1472)).y("InterruptedException while starting encoding [%s]", thread2.getName());
            return false;
        }
    }

    @Override // defpackage.iwf
    public final void c() {
    }
}

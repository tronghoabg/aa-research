package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class iwr implements defpackage.iwn {
    private java.lang.Thread a;
    public final /* synthetic */ defpackage.iws c;

    protected iwr(defpackage.iws iwsVar) {
        this.c = iwsVar;
    }

    @Override // defpackage.iwn
    public final void a() {
        java.lang.Thread thread = this.a;
        if (thread != null) {
            defpackage.iws iwsVar = this.c;
            try {
                thread.join(3000L);
            } catch (java.lang.InterruptedException unused) {
            }
            if (thread.isAlive()) {
                ((defpackage.yqj) ((defpackage.yqj) iwsVar.c.h()).ai((char) 1469)).y("Encoding thread did not quit! [%s]", thread.getName());
                iwsVar.f = true;
            }
            this.a = null;
        }
    }

    @Override // defpackage.iwn
    public final boolean b() {
        java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
        defpackage.aq aqVar = new defpackage.aq(this, semaphore, 15, null);
        defpackage.iws iwsVar = this.c;
        java.lang.Thread thread = new java.lang.Thread(aqVar, iwsVar.e());
        this.a = thread;
        thread.start();
        java.lang.Thread thread2 = this.a;
        thread2.getClass();
        try {
            defpackage.yqm yqmVar = iwsVar.c;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1470)).y("wait for encoder init [%s]", thread2.getName());
            int i = 0;
            boolean z = false;
            while (true) {
                i++;
                if (i > iwsVar.a() || z) {
                    break;
                }
                if (semaphore.tryAcquire(500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    z = true;
                } else if (!thread2.isAlive()) {
                    break;
                }
            }
            if (z) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1471)).y("encoder init done [%s]", thread2.getName());
                return z;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1473)).R("failed to start encoding %d %b [%s]", java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(thread2.isAlive()), thread2.getName());
            return z;
        } catch (java.lang.InterruptedException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) iwsVar.c.h()).p(e)).ai((char) 1472)).y("InterruptedException while starting encoding [%s]", thread2.getName());
            return false;
        }
    }

    @Override // defpackage.iwn
    public final void c() {
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class pqa implements pqd, vae {
    public final ackk a;
    final /* synthetic */ pqe b;
    private long c = 0;
    private long d = 0;

    public pqa(pqe pqeVar, ackk ackkVar) {
        this.b = pqeVar;
        this.a = ackkVar;
    }

    @Override // defpackage.vae
    public final void a(uzy uzyVar) {
        pqe pqeVar = this.b;
        synchronized (pqeVar.m) {
            this.c++;
            aazo aazoVar = (aazo) uzyVar.c();
            if (aazoVar == null) {
                return;
            }
            long j = aazoVar.b;
            long j2 = pqeVar.s;
            if (j != 0) {
                ((erb) pqeVar.b.a()).T(pqx.q);
            }
            if (j2 >= j) {
                return;
            }
            this.d++;
            ((ynz) ((ynz) pqe.a.f()).ai(6810)).G("Server reset signal received %d times, update triggered %d times.", this.c, this.d);
            pqeVar.d(0L, pxy.SERVER_RESET_SIGNAL, null, null, null);
        }
    }

    @Override // defpackage.pqd
    public final void b() {
        pyx pyxVar = (pyx) this.b.c.a();
        pfp pfpVar = new pfp(this, 15);
        pyw pywVar = pyw.c;
        vaq.d();
        Runnable pyuVar = pyxVar.o ? new pyu(pyxVar, pfpVar, pywVar, pyxVar.s) : new pyv(pyxVar, pfpVar, pywVar);
        fdi.a("StartupScheduler.scheduled", pyxVar.c.incrementAndGet());
        fdi.a("StartupScheduler.pending", pyxVar.d.incrementAndGet());
        int iOrdinal = pywVar.ordinal();
        if (iOrdinal == 0) {
            pyxVar.f.execute(pyuVar);
            return;
        }
        byte[] bArr = null;
        if (iOrdinal == 1) {
            pyxVar.f.execute(new pfq(pyxVar, pyuVar, 17, bArr));
        } else if (iOrdinal == 2) {
            pyxVar.f.execute(new pfq(pyxVar, pyuVar, 18, bArr));
        } else {
            if (iOrdinal != 3) {
                return;
            }
            pyxVar.i.execute(pyuVar);
        }
    }

    @Override // defpackage.pqd
    public final void c() {
        ((uzy) this.a.a()).f(this);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class adon implements adzl {
    public final adzl a;
    final /* synthetic */ adoo b;

    public adon(adoo adooVar, adzl adzlVar) {
        this.b = adooVar;
        this.a = adzlVar;
    }

    @Override // defpackage.adzl
    public final void a() {
        Runnable runnableA;
        adzf adzfVar = (adzf) this.a;
        Future future = adzfVar.a;
        if (future != null) {
            future.cancel(false);
            adzfVar.a = null;
        }
        adzg adzgVar = adzfVar.b;
        Iterator it = adzgVar.g.iterator();
        if (it.hasNext()) {
            throw null;
        }
        adox adoxVar = adzfVar.c;
        synchronized (adzgVar.o) {
            if (!adzgVar.q.remove(adoxVar)) {
                throw new AssertionError("Transport already removed");
            }
            adkj.c((adki) adzgVar.t.g.get(Long.valueOf(adkj.a(adzgVar))), adoxVar);
            adzgVar.a();
        }
        adoo adooVar = this.b;
        synchronized (adooVar) {
            adooVar.c--;
            runnableA = adooVar.a();
        }
        if (runnableA != null) {
            runnableA.run();
        }
    }
}

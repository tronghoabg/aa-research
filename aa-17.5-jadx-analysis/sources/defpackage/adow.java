package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adow implements adun, adps {
    public static final Logger a = Logger.getLogger(adow.class.getName());
    public final adod b;
    public final adpt c;
    private final adwt d;
    private final adwt e;
    private final yfq f;
    private final adoj g;
    private adzi h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final adqq l;
    private final ajmd m;

    public adow(adou adouVar) {
        adod adodVar = adouVar.a;
        adodVar.getClass();
        this.b = adodVar;
        adwt adwtVar = adouVar.c;
        adwtVar.getClass();
        this.e = adwtVar;
        this.d = adouVar.d;
        List list = adouVar.b;
        list.getClass();
        this.f = yfq.o(list);
        aebg aebgVar = adouVar.g;
        aebgVar.getClass();
        this.m = new ajmd(aebgVar);
        this.g = adouVar.e;
        this.l = adouVar.f;
        this.c = new adpt(this);
    }

    @Override // defpackage.adps
    public final synchronized boolean a(int i, Parcel parcel) {
        IBinder strongBinder;
        if (i == 1) {
            if (this.k) {
                adov.a.a(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (strongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                adis adisVar = adis.a;
                adqn adqnVar = new adqn(adis.a);
                adod adodVar = this.b;
                adqnVar.c(adkd.b, adodVar);
                adqnVar.c(adkd.a, new adpf(callingUid));
                adqnVar.c(adoz.g, Integer.valueOf(callingUid));
                adqnVar.c(adoz.h, adodVar.c());
                adqnVar.c(adoz.i, this.g);
                ajmd ajmdVar = this.m;
                Executor executor = this.j;
                executor.getClass();
                adqnVar.c(adpc.a, new adpb(callingUid, ajmdVar, executor));
                adqnVar.c(adua.a, adne.c);
                adox adoxVar = new adox(this.d, adqnVar.a(), this.f);
                synchronized (adoxVar) {
                    adoxVar.A(adqb.b(strongBinder, adoxVar.j));
                }
                adzi adziVar = this.h;
                synchronized (adziVar) {
                    woy.aa(!((adoo) adziVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((adoo) adziVar).c++;
                }
                adzi adziVar2 = ((adoo) adziVar).a;
                adzg adzgVar = ((adza) adziVar2).a;
                synchronized (adzgVar.o) {
                    adzgVar.q.add(adoxVar);
                }
                adzf adzfVar = new adzf(((adza) adziVar2).a, adoxVar);
                adzg adzgVar2 = adzfVar.b;
                long j = adzgVar2.i;
                if (j != Long.MAX_VALUE) {
                    adzfVar.a = adzfVar.c.j.schedule(new adyj(adzfVar, 2), j, TimeUnit.MILLISECONDS);
                } else {
                    adzfVar.a = new FutureTask(new adzc(0), null);
                }
                adkj.b((adki) adzgVar2.t.g.get(Long.valueOf(adkj.a(adzgVar2))), adzfVar.c);
                adoxVar.f(new adon((adoo) adziVar, adzfVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.adun
    public final synchronized void c() {
        Runnable runnableA;
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.a = adov.a;
        adzi adziVar = this.h;
        adzi adziVar2 = ((adoo) adziVar).a;
        adzg adzgVar = ((adza) adziVar2).a;
        synchronized (adzgVar.o) {
            if (!adzgVar.m) {
                ArrayList arrayList = new ArrayList(adzgVar.q);
                adnq adnqVar = adzgVar.l;
                adzgVar.m = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    adox adoxVar = (adox) arrayList.get(i);
                    if (adnqVar == null) {
                        adoxVar.c();
                    } else {
                        adoxVar.d(adnqVar);
                    }
                }
                adzg adzgVar2 = ((adza) adziVar2).a;
                synchronized (adzgVar2.o) {
                    adzgVar2.p = true;
                    adzgVar2.a();
                }
            }
        }
        synchronized (adziVar) {
            ((adoo) adziVar).b = true;
            runnableA = ((adoo) adziVar).a();
        }
        if (runnableA != null) {
            runnableA.run();
        }
        this.d.b(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.adun
    public final synchronized void d(adzi adziVar) throws IOException {
        this.h = new adoo(adziVar, new aabr(this, 16));
        this.i = (ScheduledExecutorService) this.d.a();
        this.j = this.e.a();
    }

    public final String toString() {
        return "BinderServer[" + this.b.toString() + "]";
    }
}

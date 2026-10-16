package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class adsg extends adqq {
    public static final double a;
    private static final Logger k = Logger.getLogger(adsg.class.getName());
    public final admf b;
    public final Executor c;
    public final adrw d;
    public final adjq e;
    public adsa f;
    public adiw g;
    public adsh h;
    public final ScheduledExecutorService i;
    public adjt j;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final advh p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 1.0E9d;
    }

    public adsg(admf admfVar, Executor executor, adiw adiwVar, advh advhVar, ScheduledExecutorService scheduledExecutorService, adrw adrwVar) {
        super(null, null);
        this.j = adjt.b;
        adjf adjfVar = adjf.a;
        this.b = admfVar;
        String str = admfVar.b;
        System.identityHashCode(this);
        int i = aeeb.a;
        if (executor == zfq.a) {
            this.c = new adym();
            this.l = true;
        } else {
            this.c = new adyq(executor);
            this.l = false;
        }
        this.d = adrwVar;
        this.e = adjq.k();
        adme admeVar = admfVar.a;
        this.m = admeVar == adme.a || admeVar == adme.c;
        this.g = adiwVar;
        this.p = advhVar;
        this.i = scheduledExecutorService;
    }

    public static final void l(adqq adqqVar, adnq adnqVar, admc admcVar) {
        try {
            adqqVar.a(adnqVar, admcVar);
        } catch (RuntimeException e) {
            k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    private final void o(Object obj) {
        woy.aa(this.h != null, "Not started");
        woy.aa(!this.n, "call was cancelled");
        woy.aa(!this.o, "call was half-closed");
        try {
            adsh adshVar = this.h;
            if (adshVar instanceof adyg) {
                adyg adygVar = (adyg) adshVar;
                adyb adybVar = adygVar.r;
                if (adybVar.a) {
                    adybVar.f.a.n(adygVar.f.a(obj));
                } else {
                    adygVar.s(new adxu(adygVar, obj));
                }
            } else {
                adshVar.n(this.b.a(obj));
            }
            if (this.m) {
                return;
            }
            this.h.d();
        } catch (Error e) {
            this.h.c(adnq.c.e("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.c(adnq.c.d(e2).e("Failed to stream message"));
        }
    }

    @Override // defpackage.adqq
    public final void b(adqq adqqVar, admc admcVar) {
        adsh adygVar;
        ScheduledExecutorService scheduledExecutorService;
        adiw adiwVar;
        int i = aeeb.a;
        woy.aa(this.h == null, "Already started");
        woy.aa(!this.n, "call was cancelled");
        adqqVar.getClass();
        admcVar.getClass();
        adjq adjqVar = this.e;
        if (adjqVar.i()) {
            this.h = adws.a;
            this.c.execute(new adrz(this, adqqVar));
            return;
        }
        adwe adweVar = (adwe) this.g.g(adwe.a);
        if (adweVar != null) {
            Long l = adweVar.b;
            if (l != null) {
                adjr adjrVarC = adjr.c(l.longValue(), TimeUnit.NANOSECONDS);
                adjr adjrVar = this.g.b;
                if (adjrVar == null || adjrVarC.compareTo(adjrVar) < 0) {
                    this.g = this.g.b(adjrVarC);
                }
            }
            Boolean bool = adweVar.c;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                adiw adiwVar2 = this.g;
                if (zBooleanValue) {
                    adiu adiuVarA = adiw.a(adiwVar2);
                    adiuVarA.e = Boolean.TRUE;
                    adiwVar = new adiw(adiuVarA);
                } else {
                    adiu adiuVarA2 = adiw.a(adiwVar2);
                    adiuVarA2.e = Boolean.FALSE;
                    adiwVar = new adiw(adiuVarA2);
                }
                this.g = adiwVar;
            }
            Integer num = adweVar.d;
            if (num != null) {
                adiw adiwVar3 = this.g;
                Integer num2 = adiwVar3.f;
                if (num2 != null) {
                    this.g = adiwVar3.d(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = adiwVar3.d(num.intValue());
                }
            }
            Integer num3 = adweVar.e;
            if (num3 != null) {
                adiw adiwVar4 = this.g;
                Integer num4 = adiwVar4.g;
                if (num4 != null) {
                    this.g = adiwVar4.e(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = adiwVar4.e(num3.intValue());
                }
            }
        }
        adjd adjdVar = adjc.a;
        adjt adjtVar = this.j;
        admcVar.d(adue.g);
        admcVar.d(adue.c);
        adlx adlxVar = adue.d;
        admcVar.d(adlxVar);
        byte[] bArr = adjtVar.c;
        if (bArr.length != 0) {
            admcVar.f(adlxVar, bArr);
        }
        admcVar.d(adue.e);
        admcVar.d(adue.f);
        adjr adjrVarK = k();
        boolean z = adjrVarK != null && adjrVarK.equals(adjqVar.b());
        adsa adsaVar = new adsa(this, adjrVarK, z);
        this.f = adsaVar;
        if (adjrVarK == null || adsaVar.c > 0) {
            advh advhVar = this.p;
            admf admfVar = this.b;
            adiw adiwVar5 = this.g;
            advv advvVar = advhVar.b;
            if (advvVar.O) {
                adwe adweVar2 = (adwe) adiwVar5.g(adwe.a);
                adygVar = new adyg(advhVar, admfVar, admcVar, adiwVar5, adweVar2 == null ? null : adweVar2.f, adweVar2 != null ? adweVar2.g : null, adjqVar);
            } else {
                adjb[] adjbVarArrK = adue.k(adiwVar5);
                adjq adjqVarA = adjqVar.a();
                try {
                    adygVar = advvVar.x.b(admfVar, admcVar, adiwVar5, adjbVarArrK);
                } finally {
                    adjqVar.f(adjqVarA);
                }
            }
            this.h = adygVar;
        } else {
            adjb[] adjbVarArrK2 = adue.k(this.g);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.g.g(adjb.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new adtq(adnq.f.e(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), adjbVarArrK2);
        }
        if (this.l) {
            this.h.f();
        }
        adiw adiwVar6 = this.g;
        String str2 = adiwVar6.d;
        Integer num5 = adiwVar6.f;
        if (num5 != null) {
            this.h.k(num5.intValue());
        }
        Integer num6 = this.g.g;
        if (num6 != null) {
            this.h.l(num6.intValue());
        }
        if (adjrVarK != null) {
            this.h.i(adjrVarK);
        }
        this.h.h(adjdVar);
        this.h.j(this.j);
        this.d.b();
        this.h.m(new adsf(this, adqqVar));
        adsa adsaVar2 = this.f;
        if (adsaVar2.e) {
            return;
        }
        if (adsaVar2.b && !adsaVar2.a && (scheduledExecutorService = adsaVar2.f.i) != null) {
            adsaVar2.d = scheduledExecutorService.schedule(new advb(adsaVar2), adsaVar2.c, TimeUnit.NANOSECONDS);
        }
        adsaVar2.f.e.d(adsaVar2, zfq.a);
        if (adsaVar2.e) {
            adsaVar2.c();
        }
    }

    @Override // defpackage.adqq
    public final void i(String str, Throwable th) {
        int i = aeeb.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.h != null) {
                adnq adnqVar = adnq.c;
                adnq adnqVarE = str != null ? adnqVar.e(str) : adnqVar.e("Call cancelled without message");
                if (th != null) {
                    adnqVarE = adnqVarE.d(th);
                }
                this.h.c(adnqVarE);
            }
            adsa adsaVar = this.f;
            if (adsaVar != null) {
                adsaVar.c();
            }
        } finally {
        }
    }

    @Override // defpackage.adqq
    public final void j() {
        int i = aeeb.a;
        woy.aa(this.h != null, "Not started");
        woy.aa(!this.n, "call was cancelled");
        woy.aa(!this.o, "call already half-closed");
        this.o = true;
        this.h.e();
    }

    public final adjr k() {
        adjr adjrVar = this.g.b;
        adjr adjrVarB = this.e.b();
        if (adjrVar != null) {
            if (adjrVarB != null) {
                adjrVar.d(adjrVarB);
                if (true != adjrVar.e(adjrVarB)) {
                }
            }
            return adjrVar;
        }
        return adjrVarB;
    }

    @Override // defpackage.adqq
    public final void m(int i) {
        int i2 = aeeb.a;
        woy.aa(this.h != null, "Not started");
        this.h.g(i);
    }

    @Override // defpackage.adqq
    public final void n(Object obj) {
        int i = aeeb.a;
        o(obj);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("method", this.b);
        return xxgVarAo.toString();
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.DesugarTimeUnit;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pqe implements uyl {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/fetcher/ClientParametersUpdater");
    private static final long y;
    private static final long z;
    private final pyh A;
    private final ppv B;
    private pqc C;
    private String D;
    private int E;
    private final Object F;
    private int G;
    public final ackk b;
    public final ackk c;
    public final ackk d;
    public final ppu e;
    public final ackk f;
    public final ackk g;
    public final zgt h;
    public final Executor i;
    public final tmb j;
    public final Context k;
    public final qcd l;
    public final Object m;
    public final plz n;
    public final Map o;
    public GmmAccount p;
    public Locale q;
    public long r;
    public long s;
    public final AtomicBoolean t;
    public final List u;
    public int v;
    public final nzj w;
    public ykd x;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        y = 21600000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        z = 60000L;
    }

    public pqe(ppu ppuVar, xxh xxhVar, xxh xxhVar2, pyh pyhVar, Context context, zgt zgtVar, Executor executor, tmb tmbVar, ackk ackkVar, ackk ackkVar2, plz plzVar, ackk ackkVar3, ackk ackkVar4, ackk ackkVar5, xxh xxhVar3, nzj nzjVar, ppv ppvVar) {
        ArrayList arrayList = new ArrayList();
        this.m = new Object();
        this.o = new HashMap();
        this.x = null;
        this.p = pmp.b;
        this.q = null;
        this.C = null;
        this.r = 0L;
        this.D = "";
        this.E = 0;
        this.s = 0L;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.t = atomicBoolean;
        this.F = new Object();
        this.G = 0;
        this.v = 1;
        this.u = arrayList;
        this.e = ppuVar;
        this.f = (ackk) xxhVar.e();
        this.g = (ackk) xxhVar2.e();
        this.A = pyhVar;
        this.h = zgtVar;
        this.i = executor;
        this.j = tmbVar;
        this.k = context;
        this.b = ackkVar;
        this.c = ackkVar2;
        this.n = plzVar;
        this.d = ackkVar3;
        this.l = (qcd) xxhVar3.e();
        this.w = nzjVar;
        this.B = ppvVar;
        atomicBoolean.set(false);
        arrayList.add(new ppy(this, ackkVar4));
        arrayList.add(new ppz(this));
        arrayList.add(new pqa(this, ackkVar5));
    }

    public final long a(long j, tmb tmbVar) {
        if (j <= 0) {
            return 0L;
        }
        long jC = c();
        return Math.min(jC, Math.max(0L, jC - (tmbVar.f().toEpochMilli() - j)));
    }

    final long c() {
        return Math.max(z, Math.min(y, TimeUnit.MINUTES.toMillis(lvl.ag(this.n).k)));
    }

    public final void d(long j, pxy pxyVar, ppw ppwVar, pqj pqjVar, String str) {
        boolean z2;
        ppw ppwVar2;
        pqj pqjVar2;
        String str2;
        synchronized (this.m) {
            String str3 = str != null ? String.format(" from %s thread", str) : "";
            yob yobVar = a;
            ((ynz) ((ynz) yobVar.f()).ai(6823)).S("P/H: Scheduling next update in %f seconds: %s%s (forced by: %s)", Double.valueOf(j / 1000.0d), pxyVar.m, str3, pqjVar == null ? "NOT FORCED" : pqjVar.name());
            this.j.f().toEpochMilli();
            pqc pqcVar = this.C;
            if (pqcVar != null) {
                if (Objects.equals(pqcVar.a, this.p) && this.C.b.equals(this.q) && this.C.f) {
                    return;
                }
                pqc pqcVar2 = this.C;
                pqcVar2.h = true;
                if (pqcVar2.j != null) {
                    ptq ptqVar = pqcVar2.j;
                    ((ynz) ((ynz) ((ynz) ptq.a.f()).p(null)).ai(6885)).M("Cancelling request %s because: %s", ptqVar.c, "unspecified");
                    ptqVar.b.cancel(true);
                }
                ((ynz) ((ynz) yobVar.d()).ai(6824)).u("Canceled prior update task");
            }
            GmmAccount gmmAccount = this.p;
            Locale locale = this.q;
            if (j == 0) {
                z2 = true;
                ppwVar2 = ppwVar;
                str2 = str;
                pqjVar2 = pqjVar;
            } else {
                z2 = false;
                ppwVar2 = ppwVar;
                pqjVar2 = pqjVar;
                str2 = str;
            }
            pqc pqcVar3 = new pqc(this, gmmAccount, locale, pxyVar, pqjVar2, str2, z2, ppwVar2);
            this.C = pqcVar3;
            zgt zgtVar = this.h;
            lws.M(zgtVar.schedule(pqcVar3, j, TimeUnit.MILLISECONDS), zgtVar);
            if (j == 0 && pxyVar.equals(pxy.SERVER_RESET_SIGNAL)) {
                ((erb) this.b.a()).S(pqx.b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final void e(pqc pqcVar, acbt acbtVar, acbu acbuVar, pwu pwuVar, int i, ppw ppwVar) {
        boolean zL;
        acbu acbuVarJ;
        ((ynz) ((ynz) a.d()).ai(6829)).y("%s", acbuVar == null ? "Got null response for update task" : "Handling response for update task");
        synchronized (this.m) {
            int i2 = 5;
            if (pqcVar.h) {
                ppwVar.e(5, null, 0);
                return;
            }
            woy.N(pqcVar == this.C);
            this.C = null;
            if (acbuVar == null) {
                long jA = a(this.r, this.j);
                ppv ppvVar = this.B;
                if (ppvVar.c(ppwVar.a, pwuVar)) {
                    if (jA <= 0) {
                        jA = ppvVar.a(pwuVar).toMillis();
                    }
                    d(jA, pxy.RETRY, ppwVar.d(this.k, ppwVar.b, pwuVar != null ? pwuVar.a() : 0, i), null, null);
                    return;
                } else {
                    ppwVar.e(3, pwuVar != null ? pwuVar.a() : null, i);
                    d(c(), pxy.REFRESH, null, null, null);
                    ppvVar.b();
                    return;
                }
            }
            ppwVar.e(2, null, 0);
            Collection.EL.stream(acbuVar.c).filter(new oly(13)).forEach(new kqa(this, ppwVar, i2, pvqVar));
            long epochMilli = this.j.f().toEpochMilli();
            long jConvert = DesugarTimeUnit.convert(TimeUnit.MINUTES, Duration.ofMillis(epochMilli - this.r));
            if (this.r != 0) {
                Math.max(1L, jConvert);
            }
            ackk ackkVar = this.b;
            ((erb) ackkVar.a()).U(pqw.d);
            this.r = epochMilli;
            this.D = pqcVar.c.m;
            String str = pqcVar.e;
            if (str != null) {
                this.D = this.D + " from " + str + " thread";
            }
            if ((acbuVar.b & 4) != 0) {
                this.s = acbuVar.e;
            }
            if (acbtVar != null) {
                Iterator<E> it = acbtVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<E> it2 = acbuVar.c.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            aceg acegVar = (aceg) it2.next();
                            if ((acegVar.b & 2) != 0) {
                                acef acefVarB = acef.b(acegVar.e);
                                if (acefVarB == null) {
                                    acefVarB = acef.UNKNOWN_TYPE;
                                }
                                if (acefVarB != acef.PAINT_PARAMETERS) {
                                    break;
                                }
                            }
                        }
                    } else {
                        aceg acegVar2 = (aceg) it.next();
                        if ((acegVar2.b & 2) != 0) {
                            acef acefVarB2 = acef.b(acegVar2.e);
                            if (acefVarB2 == null) {
                                acefVarB2 = acef.UNKNOWN_TYPE;
                            }
                            if (acefVarB2 != acef.PAINT_PARAMETERS) {
                                break;
                            }
                        }
                    }
                }
            }
            d(c(), pxy.REFRESH, null, null, null);
            this.B.b();
            pqu pquVar = ppwVar.b;
            pyh pyhVar = this.A;
            pyk pykVar = pyk.av;
            pqu pquVar2 = (pqu) pyhVar.j(pykVar, pqu.class, pqu.a);
            if (pquVar2 == pquVar) {
                int iOrdinal = pquVar.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
            } else {
                int iOrdinal2 = pquVar2.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new RuntimeException(null, null);
                }
            }
            pyhVar.l(pykVar, pquVar);
            int i3 = this.E + 1;
            this.E = i3;
            ykd ykdVar = this.x;
            synchronized (this.F) {
                if (i3 <= this.G) {
                    return;
                }
                this.G = i3;
                Locale locale = pqcVar.b;
                woy.Z(locale != null);
                GmmAccount gmmAccount = pqcVar.a;
                Object obj = ykdVar.a;
                String c = (gmmAccount == null || !(gmmAccount.getB() || gmmAccount.getA())) ? null : gmmAccount.getC();
                abms abmsVar = acbuVar.d;
                aboh abohVar = acbuVar.c;
                long j = acbuVar.e;
                synchronized (obj) {
                    pmy pmyVar = ((pqt) obj).j;
                    zL = pmyVar.l(c, abmsVar, j, 4, abohVar);
                    ((pqt) obj).k = ((pqt) obj).g.f().toEpochMilli();
                    ((pqt) obj).c(4);
                    acbuVarJ = pmyVar.f().j();
                }
                if (zL) {
                    pqm pqmVar = ((pqt) obj).o;
                    pmy pmyVar2 = ((pqt) obj).j;
                    pqmVar.a(pmyVar2);
                    if (((pqt) obj).i != null) {
                        aceg acegVarA = pmyVar2.e(null).a(acef.FLAGGING_SYSTEM);
                        if ((acegVarA.c == 280 ? (aate) acegVarA.d : aate.a).b) {
                            ((pqt) obj).d.execute(new pfp(obj, 18));
                        }
                    }
                }
                long j2 = ((pqt) obj).k;
                ((ynz) ((ynz) pqt.a.f()).ai((char) 6847)).u("Scheduling save of client parameters.");
                ((pqt) obj).d.execute(new jqb((pqt) obj, c, locale, j2, acbuVarJ, 4));
                pyh pyhVar2 = ((pqt) obj).e;
                pyk pykVar2 = pyk.au;
                if (!pyhVar2.f(pykVar2)) {
                    pyhVar2.m(pykVar2, j);
                }
            }
        }
    }

    protected final void finalize() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((pqd) it.next()).c();
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}

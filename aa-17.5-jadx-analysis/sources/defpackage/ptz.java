package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class ptz implements ptr {
    public final ackk b;
    public final zgt c;
    public final ackk d;
    public final pvk e;
    public final tmb f;
    final zgp g;
    public final aezk h;
    public final pub i;
    public final uxs n;
    public final pto o;
    public final erb p;
    private final pli s;
    private final yfq t;
    private static final yob q = yob.c("com/google/android/apps/gmm/systems/network/gmmnetwork/GmmNetworkImpl");
    private static final vky r = new vky(" ");
    static final Duration a = Duration.ofSeconds(4);
    public final AtomicLong j = new AtomicLong(-1);
    public final AtomicLong k = new AtomicLong(-1);
    public pwp l = null;
    public abow m = null;
    private final AtomicInteger u = new AtomicInteger();

    public ptz(ackk ackkVar, ackk ackkVar2, erb erbVar, tmb tmbVar, Optional optional, pyx pyxVar, zgt zgtVar, pli pliVar, yfq yfqVar, uxs uxsVar, Optional optional2, aezk aezkVar, pub pubVar) {
        this.b = ackkVar;
        this.d = ackkVar2;
        this.p = erbVar;
        this.f = tmbVar;
        this.e = (pvk) optional.orElse(null);
        this.c = zgtVar;
        this.s = pliVar;
        this.g = wub.Z(pyxVar.j.a);
        this.t = yfqVar;
        this.n = uxsVar;
        this.o = (pto) optional2.orElse(null);
        this.h = aezkVar;
        this.i = pubVar;
    }

    private static void h(zgp zgpVar, zge zgeVar, Executor executor) {
        if (executor != null) {
            wub.ah(zgpVar, zgeVar, executor);
        }
    }

    private static void i(Throwable th) {
        if (!(th instanceof RuntimeException) || (th instanceof CancellationException)) {
            if (th.getCause() != null) {
                i(th.getCause());
            }
        } else {
            if (!(th.getCause() instanceof SecurityException)) {
                throw ((RuntimeException) th);
            }
            ((ynz) ((ynz) ((ynz) q.g()).p(th)).ai((char) 6890)).u("SecurityException that may be caused by b/29868674 ");
        }
    }

    @Override // defpackage.ptr
    public final ptq a(final abow abowVar, pwp pwpVar, final pwq pwqVar, final Executor executor) {
        pwo pwoVar = new pwo();
        uzv uzvVar = pwpVar.b;
        pwoVar.a = uzvVar;
        pwoVar.a(pwpVar.c);
        pwoVar.b(pwpVar.d);
        pwoVar.d = pwpVar.e;
        pwoVar.e = pwpVar.f;
        pwoVar.g = pwpVar.h;
        pwoVar.h = pwpVar.i;
        pwoVar.i = pwpVar.j;
        pwoVar.l = pwpVar.m;
        pwoVar.j = pwpVar.k;
        pwoVar.k = pwpVar.l;
        pos posVar = (pos) this.h;
        if (posVar.a().g && lvl.ac(this.n.a())) {
            abnp abnpVarK = uzvVar.K();
            abnpVarK.t();
            uzv uzvVar2 = (uzv) abnpVarK.b;
            uzvVar2.b |= 1;
            uzvVar2.c = true;
            pwoVar.a = (uzv) abnpVarK.q();
        }
        long j = posVar.a().k;
        if (j == 0) {
            j = Long.MAX_VALUE;
        }
        pwoVar.j = j;
        final pwp pwpVar2 = new pwp(pwoVar);
        if (pwpVar2.c.d == 1 && !this.s.c()) {
            ((ynz) ((ynz) q.d()).ai((char) 6888)).u("Currently disabling cell network access, network not connected");
            qaz qazVar = new qaz(this.f);
            qazVar.b();
            zhc zhcVar = new zhc(new pwv(pwu.k));
            h(zhcVar, new ptx(this, abowVar, pwpVar2, pwqVar, qazVar, 3), executor);
            return new ptq(zhcVar, puc.a(abowVar.getClass()));
        }
        zgp zgpVar = this.g;
        if (zgpVar.isDone() || c(abowVar)) {
            return new ptq(b(abowVar, pwpVar2, pwqVar, executor), puc.a(abowVar.getClass()));
        }
        zgp zgpVarG = zfb.g(wub.Z(zgpVar), new zfk() { // from class: ptw
            @Override // defpackage.zfk
            public final zgp a(Object obj) {
                return this.a.b(abowVar, pwpVar2, pwqVar, executor);
            }
        }, this.c);
        qaz qazVar2 = new qaz(this.f);
        qazVar2.b();
        h(zgpVarG, new ptx(this, abowVar, pwpVar2, pwqVar, qazVar2, 0), executor);
        return new ptq(zgpVarG, puc.a(abowVar.getClass()));
    }

    public final zgp b(final abow abowVar, final pwp pwpVar, final pwq pwqVar, final Executor executor) {
        final pwh pwhVarA = ((uia) this.d.a()).a(pwpVar);
        final qaz qazVar = new qaz(this.f);
        pvk pvkVar = this.e;
        if (pvkVar == null || !pvkVar.a() || pwpVar.d.c <= 0) {
            return f(abowVar, pwhVarA, pwpVar, pwqVar, executor, qazVar);
        }
        zhc zhcVar = new zhc();
        zgp zgpVarG = zfb.g(zhcVar, new zfk() { // from class: ptv
            @Override // defpackage.zfk
            public final zgp a(Object obj) {
                return this.a.f(abowVar, pwhVarA, pwpVar, pwqVar, executor, qazVar);
            }
        }, this.c);
        pvkVar.c();
        h(zhcVar, new ptx(this, abowVar, pwhVarA, pwqVar, qazVar, 2), executor);
        return zgpVarG;
    }

    public final boolean c(abow abowVar) {
        return !((abowVar instanceof acgc) && ((pos) this.h).a().o) && this.t.contains(abowVar.getClass());
    }

    public final void d(qbu qbuVar) {
    }

    public final void e(abow abowVar, pvq pvqVar) {
        Object obj;
        Object obj2 = pvr.b(abowVar.getClass()).e;
        if (obj2 != null) {
        }
        if (pvqVar.equals(pvq.SUCCESS) && (obj = pvr.b(abowVar.getClass()).a) != null) {
        }
        Object obj3 = pvr.b(abowVar.getClass()).c;
        if (obj3 != null) {
            int i = pvqVar.A;
        }
        Object obj4 = pvr.b(abowVar.getClass()).d;
        if (obj4 != null) {
        }
        if (obj3 == null || obj4 == null || obj2 == null) {
            ((ynz) ((ynz) q.g()).ai((char) 6889)).y("Failed to log clearcut metrics for request %s", abowVar.getClass().getName());
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final zgp f(final abow abowVar, final pwh pwhVar, final pwp pwpVar, pwq pwqVar, Executor executor, final qaz qazVar) {
        this.u.getAndIncrement();
        vky vkyVarA = puc.a(abowVar.getClass());
        vky vkyVar = pwpVar.l;
        if (vkyVar != null && !vkyVar.a.isEmpty()) {
            vkyVarA = vky.b(vkyVarA, r, vkyVar);
        }
        vky vkyVar2 = vkyVarA;
        String[] strArr = vaq.a;
        xuv xuvVarC = xuw.c("GmmNetworkImpl.send ", vkyVar2);
        try {
            qazVar.b();
            xyc xycVar = new xyc() { // from class: ptt
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v10, types: [pxc] */
                /* JADX WARN: Type inference failed for: r2v14, types: [ackk, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v19 */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r4v1, types: [ackk, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v5, types: [ackk, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                @Override // defpackage.xyc
                public final Object gu() {
                    ?? r2;
                    pxc pxcVar;
                    pwz pwzVar;
                    boolean z;
                    zgp zgpVarZ;
                    ptz ptzVar = this.a;
                    ajdr ajdrVar = (ajdr) ptzVar.b.a();
                    pwp pwpVar2 = pwpVar;
                    uzt uztVar = pwpVar2.j;
                    uzt uztVar2 = uzt.HTTP;
                    if (uztVar.equals(uztVar2)) {
                        pxc pxcVar2 = (pxc) ((yfy) ajdrVar.d.a()).get(uztVar2);
                        pxcVar2.getClass();
                        r2 = pxcVar2;
                    } else {
                        if (uztVar.equals(uzt.MAPS_MOBILE_SDKS)) {
                            throw new IllegalArgumentException("MAPS_MOBILE_SDKS endpoint type must be used by NavSDK only.");
                        }
                        if (!uztVar.equals(uzt.PAINT)) {
                            ((AtomicBoolean) ajdrVar.a).get();
                        }
                        ?? r5 = ajdrVar.d;
                        if (((yfy) r5.a()).containsKey(uztVar)) {
                            r2 = (pxc) ((yfy) r5.a()).get(uztVar);
                        } else {
                            ?? r4 = ajdrVar.b;
                            r4.getClass();
                            Object obj = ajdrVar.c;
                            obj.getClass();
                            ((AtomicBoolean) ajdrVar.e).get();
                            r2 = obj;
                        }
                    }
                    abow abowVar2 = abowVar;
                    pwh pwhVar2 = pwhVar;
                    qaz qazVar2 = qazVar;
                    pxb pxbVarA = r2.a(abowVar2, pwhVar2, pwpVar2);
                    synchronized (qazVar2) {
                        ?? r7 = qazVar2.c;
                        int size = r7.size();
                        Duration duration = pxa.a;
                        pxcVar = r2;
                        pwzVar = new pwz(size);
                        r7.add(pwzVar);
                    }
                    pwzVar.b = Duration.ofMillis(ptzVar.f.a());
                    pwzVar.C = 2;
                    if (((pos) ptzVar.h).a().q) {
                        pxcVar.b();
                    }
                    new udp();
                    uzv uzvVar = pwpVar2.b;
                    long j = ptzVar.j.get();
                    xuv xuvVarB = xuw.b("RequirementsSatisfier.satisfy");
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(pwhVar2.f(pwe.j));
                        arrayList.add(pwhVar2.f(pwe.g));
                        if (pwhVar2.k == 0) {
                            arrayList.add(pwhVar2.d.d());
                        }
                        pvu pvuVar = pwhVar2.b;
                        pvuVar.c();
                        if (uzvVar.i && !pwhVar2.d()) {
                            arrayList.add(pwhVar2.e());
                        } else if (uzvVar.j && pwhVar2.d()) {
                            arrayList.add(pwhVar2.e());
                        }
                        xyc xycVar2 = pwhVar2.a;
                        Map map = (Map) xycVar2.gu();
                        pwe pweVar = pwe.c;
                        if (map.containsKey(pweVar)) {
                            arrayList.add(pwhVar2.f(pweVar));
                        }
                        Map map2 = (Map) xycVar2.gu();
                        pwe pweVar2 = pwe.d;
                        if (map2.containsKey(pweVar2)) {
                            arrayList.add(pwhVar2.f(pweVar2));
                        }
                        if (uzvVar.c) {
                            arrayList.add(pvuVar.d());
                        }
                        if (uzvVar.g) {
                            arrayList.add(pwhVar2.e.d());
                        }
                        int iAp = a.ap(uzvVar.l);
                        if (iAp == 0) {
                            iAp = 1;
                        }
                        int i = iAp - 1;
                        if (i == 0 || i == 1 || pwzVar.B > 0 || pwhVar2.h.a() - j <= ((aaxq) pwhVar2.j.a()).s) {
                            z = true;
                            pwhVar2.g.a();
                        } else {
                            pwa pwaVar = pwhVar2.g;
                            synchronized (pwaVar.c) {
                                if (pwaVar.f.isDone()) {
                                    pwaVar.e = new zhc();
                                    zhc zhcVar = pwaVar.e;
                                    long j2 = pwa.a;
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    z = true;
                                    zgt zgtVar = pwaVar.d;
                                    pwaVar.f = zet.f(wub.ae(zhcVar, j2, timeUnit, zgtVar), TimeoutException.class, new ikj(11), zgtVar);
                                } else {
                                    z = true;
                                }
                                zgpVarZ = wub.Z(pwaVar.f);
                            }
                            arrayList.add(zgpVarZ);
                        }
                        zgp zgpVarF = zfb.f(wub.W(arrayList), new ikj(12), zfq.a);
                        if (uzvVar.e) {
                            zgpVarF = zfb.g(zgpVarF, new pwg(pwhVar2, pwzVar, pwhVar2.f, 0), pwhVar2.i);
                        } else if (uzvVar.d) {
                            zgpVarF = zfb.g(zgpVarF, new pwg(pwhVar2, pwzVar, pwhVar2.c, 0), pwhVar2.i);
                        }
                        pwhVar2.k++;
                        pwhVar2.m.set(z);
                        xuvVarB.close();
                        zfk zfkVar = new zfk(pwzVar, pwpVar2, abowVar2, pxbVarA, false) { // from class: pts
                            public final /* synthetic */ pwz b;
                            public final /* synthetic */ pwp c;
                            public final /* synthetic */ abow d;
                            public final /* synthetic */ pxb e;
                            public final /* synthetic */ boolean f = false;

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
                            @Override // defpackage.zfk
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final defpackage.zgp a(java.lang.Object r15) {
                                /*
                                    Method dump skipped, instructions count: 608
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.pts.a(java.lang.Object):zgp");
                            }
                        };
                        zgt zgtVar2 = ptzVar.c;
                        return wub.ae(zfb.g(zgpVarF, zfkVar, zgtVar2), pwpVar2.c.e, TimeUnit.MILLISECONDS, zgtVar2);
                    } finally {
                    }
                }
            };
            uzw uzwVar = pwpVar.c;
            Duration durationOfMillis = Duration.ofMillis(uzwVar.c);
            int i = uzwVar.d;
            Duration duration = yur.d;
            durationOfMillis.getClass();
            yuq yuqVar = new yuq(new yuo(durationOfMillis, i));
            ptu ptuVar = new ptu(0);
            zgt zgtVar = this.c;
            Logger logger = yux.a;
            xyi xyiVar = xyi.d;
            ?? r13 = ((xxm) xxh.h(zgtVar)).a;
            yux yuxVar = new yux(xycVar, yuqVar, ptuVar, r13, r13, xyiVar);
            h(yuxVar, new pty(this, vkyVar2, qazVar, pwhVar, abowVar, yuxVar, pwqVar), executor);
            if (!this.n.b().isDone()) {
                d(puf.a);
            }
            xuvVarC.close();
            return yuxVar;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void g(Throwable th, abow abowVar, pwh pwhVar, int i, pwq pwqVar, qaz qazVar) {
        String str;
        yob yobVar = q;
        ((ynz) ((ynz) ((ynz) yobVar.f()).p(th)).ai(6886)).K("Request %s failed, attempts %d", abowVar.getClass().getName(), i);
        i(th);
        qazVar.a(this.c);
        pwhVar.c();
        pwu pwuVarC = pwu.c(th);
        if (pwuVarC.r == null) {
            synchronized (qazVar) {
                ?? r7 = qazVar.c;
                if (!r7.isEmpty()) {
                    int i2 = pxa.a((pwz) yrm.an(r7)).f;
                    switch (i2) {
                        case 1:
                            str = "INITIALIZED";
                            break;
                        case 2:
                            str = "REQUIREMENT_START";
                            break;
                        case 3:
                            str = "REQUIREMENT_SATISFIED";
                            break;
                        case 4:
                            str = "NETWORK_STACK_READY_REQUIREMENT_START";
                            break;
                        case 5:
                            str = "NETWORK_STACK_READY_REQUIREMENT_SATISFIED";
                            break;
                        case 6:
                            str = "CONNECTIVITY_REQUIREMENT_START";
                            break;
                        case 7:
                            str = "CONNECTIVITY_REQUIREMENT_SATISFIED";
                            break;
                        case 8:
                            str = "ZWIEBACK_COOKIE_REQUIREMENT_START";
                            break;
                        case 9:
                            str = "ZWIEBACK_COOKIE_REQUIREMENT_SATISFIED";
                            break;
                        case 10:
                            str = "ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_START";
                            break;
                        case 11:
                            str = "ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_SATISFIED";
                            break;
                        case 12:
                            str = "AUTH_REQUIREMENT_START";
                            break;
                        case 13:
                            str = "AUTH_REQUIREMENT_SATISFIED";
                            break;
                        case 14:
                            str = "API_TOKEN_REQUIREMENT_START";
                            break;
                        case 15:
                            str = "API_TOKEN_REQUIREMENT_SATISFIED";
                            break;
                        case 16:
                            str = "NON_DEFAULT_CLIENT_PARAMETERS_REQUIREMENT_START";
                            break;
                        case 17:
                            str = "NON_DEFAULT_CLIENT_PARAMETERS_REQUIREMENT_SATISFIED";
                            break;
                        case 18:
                            str = "LOCATION_REQUIREMENT_START";
                            break;
                        case 19:
                            str = "LOCATION_REQUIREMENT_SATISFIED";
                            break;
                        case 20:
                            str = "FIRST_BYTE_WRITTEN_TO_WIRE";
                            break;
                        case 21:
                            str = "LAST_BYTE_WRITTEN_TO_WIRE";
                            break;
                        case 22:
                            str = "FIRST_BYTE_READ_FROM_WIRE";
                            break;
                        default:
                            str = "LAST_BYTE_READ_FROM_WIRE";
                            break;
                    }
                } else {
                    str = "null";
                }
            }
            pwuVarC = pwuVarC.e("last attempt state: ".concat(str));
        }
        pwuVarC.q.equals(pwm.INVALID_GAIA_AUTH_TOKEN);
        ((ynz) ((ynz) yobVar.f()).ai(6887)).R("Request %s failed with Status %s , attempts %d", abowVar.getClass().getName(), pwuVarC, Integer.valueOf(i));
        ((Duration) qazVar.b).toMillis();
        ((Duration) qazVar.a).toMillis();
        e(abowVar, pwuVarC.a());
        trd trdVar = new trd(null);
        trdVar.a = abowVar;
        woy.Q(i >= 0, "negative numTries: %s", i);
        trdVar.b = qazVar;
        pwqVar.a(new rjg(trdVar), pwuVarC);
    }
}

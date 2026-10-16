package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pqt implements uyl {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/manager/ClientParametersManagerImpl");
    public final ackk b;
    public final pqo c;
    public final Executor d;
    public final pyh e;
    public final ackk f;
    public final tmb g;
    public final qcd h;
    public final ackk i;
    public final pmy j;
    public final vaa m;
    public final pqm o;
    public final htm p;
    private final psp q;
    private final ackk r;
    public int n = 1;
    public volatile long k = 0;
    public final CountDownLatch l = new CountDownLatch(0);

    public pqt(ackk ackkVar, pqo pqoVar, pqm pqmVar, pmy pmyVar, Executor executor, psp pspVar, pyh pyhVar, xxh xxhVar, tmb tmbVar, htm htmVar, ackk ackkVar2, xxh xxhVar2, xxh xxhVar3) {
        ((ynz) ((ynz) a.d()).ai((char) 6841)).u("Beginning ClientParametersManager initialization sequence");
        this.b = ackkVar;
        this.c = pqoVar;
        this.o = pqmVar;
        this.j = pmyVar;
        this.d = executor;
        this.q = pspVar;
        this.e = pyhVar;
        this.f = (ackk) ((xxm) xxhVar).a;
        this.g = tmbVar;
        this.p = htmVar;
        this.r = ackkVar2;
        this.m = new vaa(false);
        this.h = (qcd) xxhVar2.e();
        this.i = (ackk) xxhVar3.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: all -> 0x00c8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0024, B:10:0x0031, B:12:0x0068, B:14:0x006e, B:17:0x0077, B:19:0x007b, B:20:0x007d, B:21:0x0083, B:23:0x0089, B:25:0x0097, B:26:0x0099, B:28:0x009d, B:32:0x00a8, B:34:0x00ae, B:35:0x00bd, B:9:0x002d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.pma r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            yob r0 = defpackage.pqt.a     // Catch: java.lang.Throwable -> Lc8
            yop r1 = r0.f()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = "finishInitialization ClientParametersManager."
            r3 = 6842(0x1aba, float:9.588E-42)
            defpackage.a.bU(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc8
            ackk r1 = r7.b     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Lc8
            uxs r1 = (defpackage.uxs) r1     // Catch: java.lang.Throwable -> Lc8
            android.accounts.Account r1 = r1.a()     // Catch: java.lang.Throwable -> Lc8
            com.google.android.apps.gmm.systems.accounts.GmmAccount r1 = defpackage.lws.P(r1)     // Catch: java.lang.Throwable -> Lc8
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> Lc8
            if (r2 != 0) goto L2d
            boolean r2 = r1.getA()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L2b
            goto L2d
        L2b:
            r1 = 0
            goto L31
        L2d:
            java.lang.String r1 = r1.getC()     // Catch: java.lang.Throwable -> Lc8
        L31:
            ackk r2 = r7.r     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> Lc8
            kex r2 = (defpackage.kex) r2     // Catch: java.lang.Throwable -> Lc8
            java.util.Locale r2 = defpackage.kex.i()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = r8.c     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = defpackage.woy.ak(r3)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = r8.d     // Catch: java.lang.Throwable -> Lc8
            yop r5 = r0.d()     // Catch: java.lang.Throwable -> Lc8
            ynz r5 = (defpackage.ynz) r5     // Catch: java.lang.Throwable -> Lc8
            r6 = 6843(0x1abb, float:9.589E-42)
            yop r5 = r5.ai(r6)     // Catch: java.lang.Throwable -> Lc8
            ynz r5 = (defpackage.ynz) r5     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = "cachedAccount=%s, actualAccount=%s"
            r5.M(r6, r3, r1)     // Catch: java.lang.Throwable -> Lc8
            psp r5 = r7.q     // Catch: java.lang.Throwable -> Lc8
            r5.a()     // Catch: java.lang.Throwable -> Lc8
            boolean r1 = j$.util.Objects.equals(r3, r1)     // Catch: java.lang.Throwable -> Lc8
            r3 = 1
            if (r1 == 0) goto La7
            boolean r1 = j$.util.Objects.equals(r4, r2)     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto La7
            pmy r1 = r7.j     // Catch: java.lang.Throwable -> Lc8
            abgi r1 = defpackage.lvl.aj(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto L77
            goto La7
        L77:
            abgn r1 = r1.c     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto L7d
            abgn r1 = defpackage.abgn.a     // Catch: java.lang.Throwable -> Lc8
        L7d:
            aboh r1 = r1.c     // Catch: java.lang.Throwable -> Lc8
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc8
        L83:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto La7
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc8
            abgk r2 = (defpackage.abgk) r2     // Catch: java.lang.Throwable -> Lc8
            int r4 = r2.c     // Catch: java.lang.Throwable -> Lc8
            abgl r4 = defpackage.abgl.b(r4)     // Catch: java.lang.Throwable -> Lc8
            if (r4 != 0) goto L99
            abgl r4 = defpackage.abgl.UNKNOWN     // Catch: java.lang.Throwable -> Lc8
        L99:
            abgl r5 = defpackage.abgl.GMM_VECTOR_BASE     // Catch: java.lang.Throwable -> Lc8
            if (r4 != r5) goto L83
            abod r2 = r2.f     // Catch: java.lang.Throwable -> Lc8
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L83
            r1 = 0
            goto La8
        La7:
            r1 = r3
        La8:
            long r4 = r8.e     // Catch: java.lang.Throwable -> Lc8
            r7.k = r4     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto Lbd
            yop r8 = r0.d()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r0 = "Cached client parameters are stale: resetting time-of-last-update to zero."
            r1 = 6844(0x1abc, float:9.59E-42)
            defpackage.a.bU(r8, r0, r1)     // Catch: java.lang.Throwable -> Lc8
            r0 = 0
            r7.k = r0     // Catch: java.lang.Throwable -> Lc8
        Lbd:
            vaa r8 = r7.m     // Catch: java.lang.Throwable -> Lc8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lc8
            r8.c(r0)     // Catch: java.lang.Throwable -> Lc8
            monitor-exit(r7)
            return
        Lc8:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqt.a(pma):void");
    }

    public final synchronized void c(int i) {
        this.n = i;
        if (lws.O(i)) {
            notifyAll();
        }
    }

    @Override // defpackage.uyl
    public final synchronized void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}

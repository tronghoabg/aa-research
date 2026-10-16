package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class adte implements adwi {
    public final adnw b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public adwh f;
    private final Executor j;
    private final adkn i = adkn.a(adte.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile aebg h = new aebg((Object) null, (Object) null);

    public adte(Executor executor, adnw adnwVar) {
        this.j = executor;
        this.b = adnwVar;
    }

    private static String f(adlc adlcVar) {
        if (adlcVar == null) {
            return "client channel: waiting for picker";
        }
        if (adlcVar.b != null) {
            return "subchannel returned by LB picker has no connected subchannel";
        }
        adnq adnqVar = adlcVar.c;
        if (!adnqVar.g()) {
            return "wait_for_ready RPC failed with status: ".concat(adnqVar.toString());
        }
        String str = adlcVar.f;
        return str != null ? str : "client channel: waiting for picker";
    }

    private static String g(adlc adlcVar) {
        if (adlcVar == null) {
            return "connecting";
        }
        if (adlcVar.b != null) {
            return "subchannel_state_mismatch";
        }
        if (!adlcVar.c.g()) {
            return "picker_failing_with_wait_for_ready";
        }
        String str = adlcVar.e;
        return str != null ? str : "connecting";
    }

    final void a(adlg adlgVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new aebg(adlgVar, this.h.a);
            if (adlgVar != null && d()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    adtd adtdVar = (adtd) arrayList.get(i);
                    adld adldVar = adtdVar.a;
                    adlc adlcVarA = adlgVar.a(adldVar);
                    adiw adiwVar = adldVar.a;
                    if (adiwVar.h() && adlcVarA.c()) {
                        adtdVar.d = adlcVarA.c;
                    }
                    adsk adskVarC = adue.c(adlcVarA, adiwVar.h());
                    if (adskVarC != null) {
                        adtdVar.p();
                        Executor executor = this.j;
                        Executor executor2 = adiwVar.c;
                        adjq adjqVar = adtdVar.b;
                        adjq adjqVarA = adjqVar.a();
                        try {
                            adsh adshVarB = adskVarC.b(adldVar.c, adldVar.b, adiwVar, adtdVar.c);
                            adjqVar.f(adjqVarA);
                            adtdVar.p();
                            Runnable runnableS = adtdVar.s(adshVarB);
                            if (runnableS != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(runnableS);
                            }
                            arrayList2.add(adtdVar);
                        } catch (Throwable th) {
                            adtdVar.b.f(adjqVarA);
                            throw th;
                        }
                    } else {
                        adtdVar.q(g(adlcVarA), f(adlcVarA));
                    }
                }
                synchronized (this.a) {
                    if (d()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.g.remove((adtd) it.next());
                        }
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!d()) {
                            adnw adnwVar = this.b;
                            adnwVar.b(this.d);
                            if (this.h.a != null && (runnable = this.e) != null) {
                                adnwVar.b(runnable);
                                this.e = null;
                            }
                        }
                        this.b.a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1 = r6;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r0 = new defpackage.adtd(r1, r2, r3, g(r8), f(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r2.a.h() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r8.c() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r0.d = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r1.g.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r6 = r1.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r1 = r6;
     */
    @Override // defpackage.adsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.adsh b(defpackage.admf r7, defpackage.admc r8, defpackage.adiw r9, defpackage.adjb[] r10) throws java.lang.Throwable {
        /*
            r6 = this;
            adld r2 = new adld     // Catch: java.lang.Throwable -> La6
            adwu r0 = new adwu     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            r2.<init>(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> La6
            aebg r7 = r6.h     // Catch: java.lang.Throwable -> La6
        Lc:
            java.lang.Object r8 = r7.a     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L1f
            adtq r7 = new adtq     // Catch: java.lang.Throwable -> L1a
            adnq r8 = (defpackage.adnq) r8     // Catch: java.lang.Throwable -> L1a
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> L1a
        L17:
            r1 = r6
            goto L8b
        L1a:
            r0 = move-exception
            r7 = r0
            r1 = r6
            goto La9
        L1f:
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L3e
            adlg r8 = (defpackage.adlg) r8     // Catch: java.lang.Throwable -> L1a
            adlc r8 = r8.a(r2)     // Catch: java.lang.Throwable -> L1a
            adiw r9 = r2.a     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r9.h()     // Catch: java.lang.Throwable -> L1a
            adsk r0 = defpackage.adue.c(r8, r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            admf r7 = r2.c     // Catch: java.lang.Throwable -> L1a
            admc r8 = r2.b     // Catch: java.lang.Throwable -> L1a
            adsh r7 = r0.b(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a
            goto L17
        L3e:
            r8 = 0
        L3f:
            java.lang.Object r9 = r6.a     // Catch: java.lang.Throwable -> La6
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La6
            aebg r0 = r6.h     // Catch: java.lang.Throwable -> L9f
            if (r7 != r0) goto L95
            java.lang.String r4 = g(r8)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = f(r8)     // Catch: java.lang.Throwable -> L9f
            adtd r0 = new adtd     // Catch: java.lang.Throwable -> L9f
            r1 = r6
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9d
            adiw r6 = r2.a     // Catch: java.lang.Throwable -> L9d
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L69
            if (r8 == 0) goto L69
            boolean r6 = r8.c()     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L69
            adnq r6 = r8.c     // Catch: java.lang.Throwable -> L9d
            r0.d = r6     // Catch: java.lang.Throwable -> L9d
        L69:
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> L9d
            r6.add(r0)     // Catch: java.lang.Throwable -> L9d
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L9d
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> L91
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L91
            r7 = 1
            if (r6 != r7) goto L80
            adnw r6 = r1.b     // Catch: java.lang.Throwable -> L9d
            java.lang.Runnable r7 = r1.c     // Catch: java.lang.Throwable -> L9d
            r6.b(r7)     // Catch: java.lang.Throwable -> L9d
        L80:
            int r6 = r3.length     // Catch: java.lang.Throwable -> L9d
            r7 = 0
        L82:
            if (r7 >= r6) goto L89
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L9d
            int r7 = r7 + 1
            goto L82
        L89:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
            r7 = r0
        L8b:
            adnw r6 = r1.b
            r6.a()
            return r7
        L91:
            r0 = move-exception
            r6 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L9d
        L95:
            r1 = r6
            r3 = r10
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
            r7 = r0
            r6 = r1
            r10 = r3
            goto Lc
        L9d:
            r0 = move-exception
            goto La1
        L9f:
            r0 = move-exception
            r1 = r6
        La1:
            r6 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
            throw r6     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            goto La8
        La6:
            r0 = move-exception
            r1 = r6
        La8:
            r7 = r0
        La9:
            adnw r6 = r1.b
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adte.b(admf, admc, adiw, adjb[]):adsh");
    }

    @Override // defpackage.adwi
    public final Runnable c(adwh adwhVar) {
        throw null;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.i;
    }

    @Override // defpackage.adwi
    public final void q(adnq adnqVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new aebg(this.h.b, adnqVar);
            adnw adnwVar = this.b;
            adnwVar.b(new adpo(this, 9, null));
            if (!d() && (runnable = this.e) != null) {
                adnwVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }
}

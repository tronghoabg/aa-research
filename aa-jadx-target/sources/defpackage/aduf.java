package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aduf implements adxj {
    public final defpackage.adox b;
    public java.lang.Runnable c;
    public java.lang.Runnable d;
    public java.lang.Runnable e;
    public adxi f;
    private final java.util.concurrent.Executor j;
    private final defpackage.adlo i = defpackage.adlo.a(defpackage.aduf.class, null);
    public final java.lang.Object a = new java.lang.Object();
    public java.util.Collection g = new java.util.LinkedHashSet();
    public volatile defpackage.aecg h = new defpackage.aecg(null, null, null);

    public aduf(java.util.concurrent.Executor executor, defpackage.adox adoxVar) {
        this.j = executor;
        this.b = adoxVar;
    }

    private static java.lang.String f(defpackage.admd admdVar) {
        if (admdVar == null) {
            return "client channel: waiting for picker";
        }
        if (admdVar.b != null) {
            return "subchannel returned by LB picker has no connected subchannel";
        }
        defpackage.ador adorVar = admdVar.c;
        if (!adorVar.g()) {
            return "wait_for_ready RPC failed with status: ".concat(adorVar.toString());
        }
        java.lang.String str = admdVar.f;
        return str != null ? str : "client channel: waiting for picker";
    }

    private static java.lang.String g(defpackage.admd admdVar) {
        if (admdVar == null) {
            return "connecting";
        }
        if (admdVar.b != null) {
            return "subchannel_state_mismatch";
        }
        if (!admdVar.c.g()) {
            return "picker_failing_with_wait_for_ready";
        }
        java.lang.String str = admdVar.e;
        return str != null ? str : "connecting";
    }

    final void a(defpackage.admh admhVar) {
        java.lang.Runnable runnable;
        synchronized (this.a) {
            this.h = new defpackage.aecg(admhVar, this.h.a, null);
            if (admhVar != null && d()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    defpackage.adue adueVar = (defpackage.adue) arrayList.get(i);
                    defpackage.adme admeVar = adueVar.a;
                    defpackage.admd admdVarA = admhVar.a(admeVar);
                    defpackage.adjw adjwVar = admeVar.a;
                    if (adjwVar.h() && admdVarA.c()) {
                        adueVar.d = admdVarA.c;
                    }
                    adtl adtlVarC = defpackage.adve.c(admdVarA, adjwVar.h());
                    if (adtlVarC != null) {
                        adueVar.p();
                        java.util.concurrent.Executor executor = this.j;
                        java.util.concurrent.Executor executor2 = adjwVar.c;
                        defpackage.adkr adkrVar = adueVar.b;
                        defpackage.adkr adkrVarA = adkrVar.a();
                        try {
                            adti adtiVarB = adtlVarC.b(admeVar.c, admeVar.b, adjwVar, adueVar.c);
                            adkrVar.f(adkrVarA);
                            adueVar.p();
                            java.lang.Runnable runnableS = adueVar.s(adtiVarB);
                            if (runnableS != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(runnableS);
                            }
                            arrayList2.add(adueVar);
                        } catch (java.lang.Throwable th) {
                            adueVar.b.f(adkrVarA);
                            throw th;
                        }
                    } else {
                        adueVar.q(g(admdVarA), f(admdVarA));
                    }
                }
                synchronized (this.a) {
                    if (d()) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.g.remove((defpackage.adue) it.next());
                        }
                        if (this.g.isEmpty()) {
                            this.g = new java.util.LinkedHashSet();
                        }
                        if (!d()) {
                            defpackage.adox adoxVar = this.b;
                            adoxVar.b(this.d);
                            if (this.h.a != null && (runnable = this.e) != null) {
                                adoxVar.b(runnable);
                                this.e = null;
                            }
                        }
                        this.b.a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r7 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final adti b(defpackage.adng r7, defpackage.adnd r8, defpackage.adjw r9, defpackage.adkb[] r10) throws java.lang.Throwable {
        /*
            r6 = this;
            adme r2 = new adme     // Catch: java.lang.Throwable -> La6
            adxv r0 = new adxv     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            r2.<init>(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> La6
            aecg r7 = r6.h     // Catch: java.lang.Throwable -> La6
        Lc:
            java.lang.Object r8 = r7.a     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L1f
            aduq r7 = new aduq     // Catch: java.lang.Throwable -> L1a
            ador r8 = (defpackage.ador) r8     // Catch: java.lang.Throwable -> L1a
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
            admh r8 = (defpackage.admh) r8     // Catch: java.lang.Throwable -> L1a
            admd r8 = r8.a(r2)     // Catch: java.lang.Throwable -> L1a
            adjw r9 = r2.a     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r9.h()     // Catch: java.lang.Throwable -> L1a
            adtl r0 = defpackage.adve.c(r8, r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            adng r7 = r2.c     // Catch: java.lang.Throwable -> L1a
            adnd r8 = r2.b     // Catch: java.lang.Throwable -> L1a
            adti r7 = r0.b(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a
            goto L17
        L3e:
            r8 = 0
        L3f:
            java.lang.Object r9 = r6.a     // Catch: java.lang.Throwable -> La6
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La6
            aecg r0 = r6.h     // Catch: java.lang.Throwable -> L9f
            if (r7 != r0) goto L95
            java.lang.String r4 = g(r8)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = f(r8)     // Catch: java.lang.Throwable -> L9f
            adue r0 = new adue     // Catch: java.lang.Throwable -> L9f
            r1 = r6
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9d
            adjw r6 = r2.a     // Catch: java.lang.Throwable -> L9d
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L69
            if (r8 == 0) goto L69
            boolean r6 = r8.c()     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L69
            ador r6 = r8.c     // Catch: java.lang.Throwable -> L9d
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
            adox r6 = r1.b     // Catch: java.lang.Throwable -> L9d
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
            adox r6 = r1.b
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
            adox r6 = r1.b
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aduf.b(adng, adnd, adjw, adkb[]):adti");
    }

    public final java.lang.Runnable c(adxi adxiVar) {
        throw null;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    public final defpackage.adlo e() {
        return this.i;
    }

    public final void q(defpackage.ador adorVar) {
        java.lang.Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new defpackage.aecg(this.h.b, adorVar, null);
            defpackage.adox adoxVar = this.b;
            adoxVar.b(new defpackage.adkj(this, 18));
            if (!d() && (runnable = this.e) != null) {
                adoxVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }
}

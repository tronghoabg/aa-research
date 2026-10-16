package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aeei {
    static final boolean a;
    public static final defpackage.adjv b;
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.aeei.class.getName());

    static {
        boolean z = false;
        if (!defpackage.ysr.bw(java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && java.lang.Boolean.parseBoolean(java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        a = z;
        b = new defpackage.adjv("internal-stub-type", null);
    }

    private aeei() {
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    public static java.lang.Object a(defpackage.adjx adjxVar, defpackage.adng adngVar, defpackage.adjw adjwVar, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable e;
        aeeg aeegVar = new aeeg();
        defpackage.adrq adrqVarD = adjxVar.d(adngVar, adjwVar.f(b, defpackage.aeef.a).c(aeegVar));
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        try {
            try {
                defpackage.zhs zhsVarB = b(adrqVarD, obj);
                while (!zhsVarB.isDone()) {
                    try {
                        aeeg.b();
                        java.lang.Runnable runnable = (java.lang.Runnable) aeegVar.poll();
                        if (runnable == null) {
                            aeegVar.b = java.lang.Thread.currentThread();
                            while (true) {
                                try {
                                    runnable = (java.lang.Runnable) aeegVar.poll();
                                    if (runnable != null) {
                                        break;
                                    }
                                    java.util.concurrent.locks.LockSupport.park(aeegVar);
                                    aeeg.b();
                                } catch (java.lang.Throwable th) {
                                    aeegVar.b = null;
                                    throw th;
                                }
                            }
                            aeegVar.b = null;
                        }
                        do {
                            aeeg.a(runnable);
                            runnable = (java.lang.Runnable) aeegVar.poll();
                        } while (runnable != null);
                    } catch (java.lang.InterruptedException e2) {
                        try {
                            adrqVarD.i("Thread interrupted", e2);
                            r4 = 1;
                        } catch (java.lang.Error e3) {
                            e = e3;
                            throw e(adrqVarD, e);
                        } catch (java.lang.RuntimeException e4) {
                            e = e4;
                            throw e(adrqVarD, e);
                        }
                    }
                }
                aeegVar.b = aeeg.a;
                while (true) {
                    java.lang.Runnable runnable2 = (java.lang.Runnable) aeegVar.poll();
                    if (runnable2 == null) {
                        try {
                            break;
                        } catch (java.lang.InterruptedException e5) {
                            java.lang.Thread.currentThread().interrupt();
                            throw new defpackage.adou(defpackage.ador.c.e("Thread interrupted").d(e5), null);
                        } catch (java.util.concurrent.ExecutionException e6) {
                            java.lang.Throwable cause = e6.getCause();
                            cause.getClass();
                            for (java.lang.Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                                if (cause2 instanceof ados) {
                                    throw new defpackage.adou(((ados) cause2).a, null);
                                }
                                if (cause2 instanceof defpackage.adou) {
                                    defpackage.adou adouVar = (defpackage.adou) cause2;
                                    throw new defpackage.adou(adouVar.a, adouVar.b);
                                }
                            }
                            throw new defpackage.adou(defpackage.ador.d.e("unexpected exception").d(cause), null);
                        }
                    }
                    aeeg.a(runnable2);
                }
                java.lang.Object objS = ((defpackage.zga) zhsVarB).s();
                if (r4 != 0) {
                    java.lang.Thread.currentThread().interrupt();
                }
                return objS;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r4 = obj;
                if (r4 != 0) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        } catch (java.lang.Error e7) {
            e = e7;
            e = e;
            throw e(adrqVarD, e);
        } catch (java.lang.RuntimeException e8) {
            e = e8;
            e = e;
            throw e(adrqVarD, e);
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (r4 != 0) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static defpackage.zhs b(defpackage.adrq adrqVar, java.lang.Object obj) {
        aeec aeecVar = new aeec(adrqVar);
        f(adrqVar, obj, new aeeh(aeecVar));
        return aeecVar;
    }

    public static defpackage.aeep c(defpackage.adrq adrqVar, defpackage.aeep aeepVar, boolean z) {
        defpackage.aeeb aeebVar = new defpackage.aeeb(adrqVar, z);
        g(adrqVar, new defpackage.aeee(aeepVar, aeebVar));
        return aeebVar;
    }

    public static void d(defpackage.adrq adrqVar, java.lang.Object obj, defpackage.aeep aeepVar) {
        aeepVar.getClass();
        f(adrqVar, obj, new defpackage.aeee(aeepVar, new defpackage.aeeb(adrqVar, false)));
    }

    private static java.lang.RuntimeException e(defpackage.adrq adrqVar, java.lang.Throwable th) {
        try {
            adrqVar.i(null, th);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            c.logp(java.util.logging.Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        throw new java.lang.AssertionError(th);
    }

    private static void f(defpackage.adrq adrqVar, java.lang.Object obj, defpackage.aeed aeedVar) {
        g(adrqVar, aeedVar);
        try {
            adrqVar.n(obj);
            adrqVar.j();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            throw e(adrqVar, e);
        }
    }

    private static void g(defpackage.adrq adrqVar, defpackage.aeed aeedVar) {
        adrqVar.b(aeedVar, new defpackage.adnd());
        aeedVar.k();
    }
}

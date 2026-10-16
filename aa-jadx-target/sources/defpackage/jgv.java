package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jgv {
    public static final /* synthetic */ int c = 0;
    public volatile boolean a;
    public defpackage.jgu b;
    private final defpackage.izq d;

    static {
        defpackage.yqm.c("CAR.WM.Vsync");
    }

    public jgv(defpackage.izq izqVar) {
        this.d = izqVar;
    }

    final void a(long j) {
        defpackage.jjf jjfVar;
        double d;
        java.lang.Object obj = this.d.a;
        if (((defpackage.inh) obj).C) {
            try {
                ((defpackage.inh) obj).K = android.os.SystemClock.elapsedRealtimeNanos();
                ((defpackage.inh) obj).L = j;
                defpackage.jje jjeVar = ((defpackage.inh) obj).aq;
                android.util.SparseArray sparseArray = ((defpackage.inh) obj).S;
                boolean zN = jjeVar.n(sparseArray);
                boolean zP = jjeVar.p();
                jjeVar.l(sparseArray, ((defpackage.inh) obj).b());
                if (zN || ((((defpackage.inh) obj).P > 0 && jjeVar.m()) || zP)) {
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                    long j2 = j / 1000000;
                    double dA = ((defpackage.inh) obj).x.a();
                    double d2 = (((defpackage.inh) obj).j * 1000.0d) / dA;
                    double d3 = ((defpackage.inh) obj).D;
                    double d4 = j2;
                    if (((long) ((d3 - d2) - d4)) <= 0) {
                        if (d4 > d2 + d3) {
                            d3 = d4;
                        }
                        ((defpackage.inh) obj).D = d3 + (1000.0d / dA);
                        ((defpackage.inh) obj).ai.b(j);
                        if (((defpackage.inh) obj).B.get() < ((java.lang.Integer) ((defpackage.inh) obj).g.fF()).intValue()) {
                            try {
                                if (zN) {
                                    ((defpackage.inh) obj).P = ((defpackage.inh) obj).y;
                                } else {
                                    ((defpackage.inh) obj).P--;
                                }
                                if (!((defpackage.inh) obj).h) {
                                    ((defpackage.inh) obj).B.incrementAndGet();
                                }
                                ((defpackage.inh) obj).aj.g();
                                ((defpackage.inh) obj).aq.f(((defpackage.inh) obj).c(), ((defpackage.inh) obj).u, ((defpackage.inh) obj).b(), ((defpackage.inh) obj).S);
                                if (((defpackage.inh) obj).C) {
                                    ((defpackage.inh) obj).Z.j.j();
                                    if (zN) {
                                        ((defpackage.inh) obj).H.incrementAndGet();
                                        defpackage.yfd yfdVar = ((defpackage.inh) obj).G;
                                        synchronized (yfdVar) {
                                            defpackage.inh.b.byteValue();
                                            yfdVar.add(new defpackage.ind(j2, (byte) 1));
                                        }
                                    } else {
                                        ((defpackage.inh) obj).I.incrementAndGet();
                                        defpackage.yfd yfdVar2 = ((defpackage.inh) obj).G;
                                        synchronized (yfdVar2) {
                                            defpackage.inh.c.byteValue();
                                            yfdVar2.add(new defpackage.ind(j2, (byte) 2));
                                        }
                                        ((defpackage.inh) obj).Z.j.l();
                                    }
                                    defpackage.jko jkoVar = ((defpackage.inh) obj).ai;
                                    long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                                    defpackage.jkm jkmVar = new defpackage.jkm(jkoVar);
                                    long j3 = jkoVar.g;
                                    if (j3 == 0) {
                                        d = 1.0d;
                                    } else {
                                        d = (j - j3) / jkoVar.i;
                                    }
                                    jkoVar.h += (long) (java.lang.Math.pow(java.lang.Math.max(d, 0.0d), jkoVar.j) * jkoVar.i);
                                    defpackage.jkm jkmVar2 = jkoVar.d;
                                    jkmVar2.a = jkmVar;
                                    jkmVar2.b = j;
                                    jkmVar2.c = jElapsedRealtimeNanos;
                                    jkmVar2.h = jkoVar.h;
                                    jkoVar.e = jkmVar2;
                                    jkoVar.g = j;
                                    jkoVar.d = jkmVar;
                                    long j4 = jkoVar.h;
                                    defpackage.jje jjeVar2 = ((defpackage.inh) obj).aq;
                                    jjeVar2.d(((defpackage.inh) obj).w);
                                    jjeVar2.k(j4);
                                } else {
                                    ((defpackage.yqj) defpackage.inh.a.l().ai(476)).u("rendering skipped as composition is stopping");
                                    defpackage.yfd yfdVar3 = ((defpackage.inh) obj).G;
                                    synchronized (yfdVar3) {
                                        defpackage.inh.f.byteValue();
                                        yfdVar3.add(new defpackage.ind(j2, (byte) 5));
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        } else if (((defpackage.inh) obj).C) {
                            if (zN) {
                                ((defpackage.inh) obj).y();
                            }
                            ((defpackage.inh) obj).M.incrementAndGet();
                            ((defpackage.inh) obj).aj.m();
                            defpackage.yfd yfdVar4 = ((defpackage.inh) obj).G;
                            synchronized (yfdVar4) {
                                defpackage.inh.e.byteValue();
                                yfdVar4.add(new defpackage.ind(j2, (byte) 4));
                            }
                        }
                    } else if (((defpackage.inh) obj).C) {
                        if (zN) {
                            ((defpackage.inh) obj).y();
                        }
                        ((defpackage.inh) obj).J.incrementAndGet();
                        defpackage.yfd yfdVar5 = ((defpackage.inh) obj).G;
                        synchronized (yfdVar5) {
                            defpackage.inh.d.byteValue();
                            yfdVar5.add(new defpackage.ind(j2, (byte) 3));
                        }
                    }
                }
                jjfVar = null;
            } catch (defpackage.jjf e) {
                jjfVar = e;
            }
            if (jjfVar != null) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).p(jjfVar)).ai((char) 442)).u("ProjectionCompositionException in CompositionThread rendering");
            }
        }
    }

    public final void b() {
        this.a = false;
        defpackage.jgu jguVar = this.b;
        jguVar.getClass();
        jguVar.c();
    }
}

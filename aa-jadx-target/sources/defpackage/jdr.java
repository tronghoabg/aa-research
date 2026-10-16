package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class jdr extends defpackage.jbq {
    public static final /* synthetic */ int k = 0;
    private final java.lang.String a;
    private final defpackage.xlk b;
    private boolean c;
    private volatile int d;
    private final java.lang.Object e;
    public volatile int f;
    public volatile boolean g;
    protected int h;
    public final defpackage.jdx i;
    public final defpackage.jdy j;
    private final java.util.Map l;
    private final java.util.Map m;
    private final defpackage.jba n;
    private final boolean o;
    private final java.util.Map p;
    private int q;
    private final java.lang.Runnable r;
    private final java.util.concurrent.atomic.AtomicInteger s;
    private boolean y;

    public jdr(int i, defpackage.izd izdVar, defpackage.jbu jbuVar, defpackage.jdy jdyVar, defpackage.jba jbaVar, int i2, defpackage.xlk xlkVar, defpackage.jdx jdxVar, java.lang.String str, boolean z, java.lang.Runnable runnable) {
        super(i, izdVar, jbuVar, i2);
        this.c = false;
        this.d = -1;
        this.e = new java.lang.Object();
        this.q = 1;
        this.s = new java.util.concurrent.atomic.AtomicInteger(0);
        this.y = false;
        this.j = jdyVar;
        this.n = jbaVar;
        this.i = jdxVar;
        this.b = xlkVar;
        this.a = str;
        this.o = z;
        this.r = runnable;
        this.p = new j$.util.concurrent.ConcurrentHashMap();
        this.l = new j$.util.concurrent.ConcurrentHashMap();
        this.m = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final defpackage.abor G() {
        defpackage.abor aborVarN = defpackage.ovk.a.n();
        defpackage.izv izvVar = this.w;
        if (izvVar != null) {
            aborVarN.t();
            defpackage.ovk ovkVar = (defpackage.ovk) aborVarN.b;
            ovkVar.b |= 1;
            ovkVar.c = ((defpackage.izk) izvVar).b;
        }
        return aborVarN;
    }

    private final void H(defpackage.ovl ovlVar, defpackage.abor aborVar) {
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = this.a;
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovk ovkVar = (defpackage.ovk) aborVar.q();
        ovkVar.getClass();
        ovmVar3.f = ovkVar;
        ovmVar3.b |= 8;
        this.n.A(aborVarN);
    }

    private final void i(defpackage.ovl ovlVar) {
        defpackage.abor aborVarG = G();
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = this.a;
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovk ovkVar = (defpackage.ovk) aborVarG.q();
        ovkVar.getClass();
        ovmVar3.f = ovkVar;
        ovmVar3.b |= 8;
        this.n.B(aborVarN);
    }

    public final j$.util.Optional A(int i) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.jdq) this.l.get(java.lang.Integer.valueOf(i)));
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return j$.util.Optional.ofNullable(j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime() - ((defpackage.jdq) optionalOfNullable.get()).a));
    }

    public final void B(defpackage.ovl ovlVar) {
        H(ovlVar, G());
    }

    protected final void C(defpackage.ovf ovfVar) {
        this.n.w(this.a, ovfVar);
    }

    public final void D(long j, defpackage.jcu jcuVar, java.lang.Runnable runnable) {
        int iZ = z(0);
        if (runnable != null) {
            this.p.put(java.lang.Integer.valueOf(iZ), runnable);
        }
        if (!this.g) {
            defpackage.ypu ypuVarAi = h().g().ai(1916);
            defpackage.izv izvVar = this.w;
            izvVar.getClass();
            ypuVarAi.w("Trying to send media data before starting, ch:%d", ((defpackage.izk) izvVar).b);
            jcuVar.close();
            C(defpackage.ovf.MEDIA_NOT_STARTED);
            return;
        }
        int iD = jcuVar.d();
        jcuVar.q(2);
        jcuVar.u(j);
        jcuVar.q(iD);
        int iD2 = jcuVar.d();
        java.util.Map map = this.l;
        if (map.size() >= 5000 && !this.y) {
            h().g().ai(1904).u("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
            B(defpackage.ovl.CALLBACK_QUEUE_OVERFLOW);
            this.y = true;
        } else if (map.size() < 5000) {
            this.y = false;
        }
        if (map.size() < 5000) {
            map.put(java.lang.Integer.valueOf(iZ), new defpackage.jdq(j / 1000, android.os.SystemClock.elapsedRealtime(), iD2));
        }
        defpackage.izv izvVar2 = this.w;
        izvVar2.getClass();
        izvVar2.d(jcuVar, new defpackage.izu(true, true, iZ));
    }

    public final boolean E() {
        int iIncrementAndGet;
        if (this.t) {
            C(defpackage.ovf.MEDIA_QUITTING);
            return false;
        }
        if (!this.o) {
            try {
                if (!this.i.g() && (iIncrementAndGet = this.s.incrementAndGet()) > 400) {
                    defpackage.zak zakVar = this.v == 1 ? defpackage.zak.VIDEO_ACK_TIMEOUT : defpackage.zak.AUDIO_ACK_TIMEOUT;
                    defpackage.jbu jbuVar = this.x;
                    jbuVar.getClass();
                    defpackage.zaj zajVar = defpackage.zaj.CAR_NOT_RESPONDING;
                    defpackage.izv izvVar = this.w;
                    izvVar.getClass();
                    jbuVar.aF(zajVar, zakVar, "Car not sending ACK, channel:" + ((defpackage.izk) izvVar).b + ", timeouts:" + iIncrementAndGet + ", media type:" + this.b.h + ", sessionId:" + this.f);
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.InterruptedException unused) {
                    defpackage.ypu ypuVarAi = h().h().ai(1921);
                    defpackage.izv izvVar2 = this.w;
                    izvVar2.getClass();
                    ypuVarAi.w("Dropping frame, ch:%d", ((defpackage.izk) izvVar2).b);
                    C(defpackage.ovf.MEDIA_INTERRUPTED_WAITING_TO_SEND_FRAME);
                    return false;
                }
            }
        }
        return true;
    }

    public final void F(defpackage.abor aborVar) {
        if (!this.c) {
            defpackage.ypu ypuVarAi = h().g().ai(1919);
            defpackage.izv izvVar = this.w;
            izvVar.getClass();
            ypuVarAi.w("Trying to start Media before receiving Config message, ch:%d", ((defpackage.izk) izvVar).b);
            B(defpackage.ovl.START_REQUESTED_BEFORE_CONFIG_MESSAGE_RECEIVED);
            return;
        }
        h().l().ai(1918).w("start MediaSourceEndPoint sessionId: %d", this.f);
        int i = this.f;
        aborVar.t();
        defpackage.xpi xpiVar = (defpackage.xpi) aborVar.b;
        defpackage.xpi xpiVar2 = defpackage.xpi.a;
        xpiVar.b |= 1;
        xpiVar.c = i;
        this.i.f();
        this.s.set(0);
        B(defpackage.ovl.START);
        v((defpackage.xpi) aborVar.q());
        this.g = true;
    }

    @Override // defpackage.jbq, defpackage.izg
    public void P(int i) {
        defpackage.ypu ypuVarAi = h().l().ai(1913);
        defpackage.izv izvVar = this.w;
        izvVar.getClass();
        ypuVarAi.B("Closing channel with reason: %d ch:%d", i, ((defpackage.izk) izvVar).b);
        B(i != 0 ? defpackage.ovl.CHANNEL_CLOSED_DUE_TO_PROTOCOL_ERROR : defpackage.ovl.CHANNEL_CLOSE_REQUESTED);
        if (this.g) {
            this.g = false;
        }
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void Q() {
        super.Q();
        i(defpackage.ovl.CHANNEL_OPENED);
        defpackage.ypu ypuVarAi = h().l().ai(1917);
        defpackage.izv izvVar = this.w;
        izvVar.getClass();
        ypuVarAi.w("send setup, ch:%d", ((defpackage.izk) izvVar).b);
        defpackage.abor aborVarN = defpackage.xpg.a.n();
        aborVarN.t();
        defpackage.xpg xpgVar = (defpackage.xpg) aborVarN.b;
        xpgVar.c = this.b.h;
        xpgVar.b |= 1;
        k(32768, (defpackage.xpg) aborVarN.q());
    }

    @Override // defpackage.jbq, defpackage.ize
    public final void R(int i) {
        if (this.o) {
            return;
        }
        this.i.e(i);
    }

    @Override // defpackage.jbq
    protected void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        int iBb = defpackage.sqs.bb(i);
        if (iBb == 32772) {
            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.xjv.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC);
            defpackage.abox.U(aboxVarC);
            r((defpackage.xjv) aboxVarC);
            return;
        }
        if (iBb == 32773) {
            if (!this.o) {
                xia xiaVarC = defpackage.abox.C(xia.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
                defpackage.abox.U(xiaVarC);
                defpackage.abox.U(xiaVarC);
                xia xiaVar = xiaVarC;
                int iQ = defpackage.ebm.q(java.lang.Integer.valueOf(xiaVar.c));
                if (this.g) {
                    int i2 = iQ % 256;
                    if (i2 != this.f % 256) {
                        if (i2 != this.d % 256) {
                            defpackage.ypu ypuVarAi = h().h().ai(1909);
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.f);
                            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iQ);
                            defpackage.izv izvVar = this.w;
                            izvVar.getClass();
                            ypuVarAi.R("Got mismatch session id in ack. Expected: %d, got: %d, ch:%d", numValueOf, numValueOf2, java.lang.Integer.valueOf(((defpackage.izk) izvVar).b));
                            defpackage.ovl ovlVar = defpackage.ovl.RECEIVED_ACK_WITH_WRONG_SESSION_ID;
                            defpackage.abor aborVarG = G();
                            int i3 = this.f;
                            aborVarG.t();
                            defpackage.ovk ovkVar = (defpackage.ovk) aborVarG.b;
                            defpackage.ovk ovkVar2 = defpackage.ovk.a;
                            ovkVar.b |= 4;
                            ovkVar.e = i3;
                            aborVarG.t();
                            defpackage.ovk ovkVar3 = (defpackage.ovk) aborVarG.b;
                            ovkVar3.b |= 8;
                            ovkVar3.f = iQ;
                            H(ovlVar, aborVarG);
                            return;
                        }
                        return;
                    }
                } else if (iQ != this.d) {
                    defpackage.ypu ypuVarAi2 = h().h().l(1, java.util.concurrent.TimeUnit.SECONDS).ai(1910);
                    java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(this.d);
                    java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(iQ);
                    defpackage.izv izvVar2 = this.w;
                    izvVar2.getClass();
                    ypuVarAi2.R("Got ack while not started. Previous session id was %d, got: %d, ch:%d", numValueOf3, numValueOf4, java.lang.Integer.valueOf(((defpackage.izk) izvVar2).b));
                    defpackage.ovl ovlVar2 = defpackage.ovl.RECEIVED_ACK_WHILE_NOT_STARTED;
                    defpackage.abor aborVarG2 = G();
                    int i4 = this.d;
                    aborVarG2.t();
                    defpackage.ovk ovkVar4 = (defpackage.ovk) aborVarG2.b;
                    defpackage.ovk ovkVar5 = defpackage.ovk.a;
                    ovkVar4.b |= 4;
                    ovkVar4.e = i4;
                    aborVarG2.t();
                    defpackage.ovk ovkVar6 = (defpackage.ovk) aborVarG2.b;
                    ovkVar6.b |= 8;
                    ovkVar6.f = iQ;
                    H(ovlVar2, aborVarG2);
                    return;
                }
                this.s.set(0);
                java.util.List listAsList = xiaVar.e;
                if (listAsList == null || listAsList.isEmpty()) {
                    int iQ2 = defpackage.ebm.q(java.lang.Integer.valueOf(xiaVar.d));
                    if (iQ2 <= 0 || iQ2 > 4096) {
                        defpackage.jbu jbuVar = this.x;
                        jbuVar.getClass();
                        jbuVar.aF(defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.INVALID_ACK, defpackage.a.bo(xiaVar.d, "Ack frame count must be > 0 and <= 4096, was "));
                    } else {
                        listAsList = java.util.Arrays.asList(new java.lang.Long[iQ2]);
                    }
                }
                if (listAsList == null || listAsList.isEmpty()) {
                    return;
                }
                if (xiaVar.d != listAsList.size()) {
                    h().h().l(500, java.util.concurrent.TimeUnit.MILLISECONDS).ai(1908).B("Number of acks (%d) and timestamps (%d) do not match", xiaVar.d, listAsList.size());
                }
                this.i.d(listAsList);
                if (!y()) {
                    java.lang.Object obj = this.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
                java.lang.Runnable runnable = this.r;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            iBb = 32773;
        }
        if (iBb == 32780) {
            this.j.p();
            return;
        }
        if (iBb == 32788) {
            defpackage.abox aboxVarC2 = defpackage.abox.C(defpackage.xlr.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(aboxVarC2);
            defpackage.abox.U(aboxVarC2);
            this.j.n((defpackage.xlr) aboxVarC2);
            return;
        }
        defpackage.ypu ypuVarAi3 = h().h().ai(1914);
        defpackage.izv izvVar3 = this.w;
        izvVar3.getClass();
        ypuVarAi3.B("Received message with invalid type header: %d ch:%d", i, ((defpackage.izk) izvVar3).b);
        defpackage.ovl ovlVar3 = defpackage.ovl.INVALID_MESSAGE_RECEIVED;
        defpackage.abor aborVarG3 = G();
        aborVarG3.t();
        defpackage.ovk ovkVar7 = (defpackage.ovk) aborVarG3.b;
        defpackage.ovk ovkVar8 = defpackage.ovk.a;
        ovkVar7.b |= 2;
        ovkVar7.d = i;
        H(ovlVar3, aborVarG3);
    }

    @Override // defpackage.ize
    public void b(int i) {
        java.util.Map map = this.m;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer num = (java.lang.Integer) map.remove(numValueOf);
        if (num == null) {
            h().g().ai(1915).w("Attempted to get non-existent entry id %d from MediaSourceEndPoint.", i);
            B(defpackage.ovl.INVALID_MESSAGE_CALLBACK_ID);
        } else {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                switch (iIntValue) {
                    case 32769:
                        t();
                        break;
                    case 32770:
                        u();
                        break;
                }
            } else {
                s();
            }
        }
        java.util.Map map2 = this.l;
        defpackage.jdq jdqVar = (defpackage.jdq) map2.remove(numValueOf);
        if (jdqVar != null) {
            defpackage.jdy jdyVar = this.j;
            jdyVar.k(jdqVar.c);
            long j = jdqVar.b;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            jdyVar.q(jElapsedRealtime - j);
            jdyVar.h(jElapsedRealtime - jdqVar.a);
        }
        java.util.Map map3 = this.p;
        java.lang.Runnable runnable = (java.lang.Runnable) map3.remove(numValueOf);
        if (runnable != null) {
            runnable.run();
        }
        int i2 = 0;
        while (true) {
            i--;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            if (map.remove(numValueOf2) == null) {
                if (i2 > 0) {
                    h().h().ai(1905).B("%d messages were dropped or sent out of order before callbackId: %d", i2, i);
                    return;
                }
                return;
            } else {
                map2.remove(numValueOf2);
                map3.remove(numValueOf2);
                i2++;
            }
        }
    }

    @Override // defpackage.jbq
    public final void g() {
        super.g();
        B(defpackage.ovl.PREPARE_STOP);
        this.i.c();
    }

    public abstract defpackage.yqk h();

    protected void r(defpackage.xjv xjvVar) {
        int i = xjvVar.c;
        this.h = i;
        if (this.o && i < 24) {
            h().l().ai(1912).w("Setting %d MAX_UNACK in drop overflow mode.", 24);
            this.h = 24;
        } else if (i <= 0) {
            defpackage.jbu jbuVar = this.x;
            jbuVar.getClass();
            jbuVar.aF(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.INVALID_ACK_CONFIG, defpackage.a.bo(i, "MaxUnacked must be >= 0, was "));
            return;
        }
        if (this.c) {
            defpackage.jbu jbuVar2 = this.x;
            jbuVar2.getClass();
            jbuVar2.aF(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.MULTIPLE_DISPLAY_CONFIGS, "Multiple media configs received");
        } else {
            this.c = true;
            i(defpackage.ovl.MESSAGE_CONFIG_RECEIVED);
            this.i.h(this.h);
            h().f().ai(1911).w("configMessage, MAX_UNACK: %d", this.h);
        }
    }

    protected void v(defpackage.xpi xpiVar) {
        k(32769, xpiVar);
    }

    protected void w(defpackage.xpj xpjVar) {
        k(32770, xpjVar);
    }

    public void x() {
        if (this.g) {
            this.d = this.f;
            this.f++;
            w(defpackage.xpj.a);
            this.g = false;
            B(defpackage.ovl.STOP);
            return;
        }
        defpackage.ypu ypuVarAi = h().g().ai(1920);
        defpackage.izv izvVar = this.w;
        izvVar.getClass();
        ypuVarAi.w("Trying to stop Media before starting, ch:%d", ((defpackage.izk) izvVar).b);
        B(defpackage.ovl.STOP_CALLED_WHEN_NOT_STARTED);
    }

    public boolean y() {
        return this.i.a() > 0;
    }

    protected final synchronized int z(int i) {
        int i2;
        i2 = this.q;
        this.q = i2 + 1;
        this.m.put(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        return i2;
    }

    protected void s() {
    }

    protected void t() {
    }

    protected void u() {
    }
}

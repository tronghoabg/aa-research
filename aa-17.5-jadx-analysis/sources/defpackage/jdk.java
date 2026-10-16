package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class jdk extends jbj {
    public static final /* synthetic */ int k = 0;
    private final String a;
    private final xkj b;
    private boolean c;
    private volatile int d;
    private final Object e;
    public volatile int f;
    public volatile boolean g;
    protected int h;
    public final jdq i;
    public final jdr j;
    private final Map l;
    private final Map m;
    private final jat n;
    private final boolean o;
    private final Map p;
    private int q;
    private final Runnable r;
    private final AtomicInteger s;
    private boolean y;

    public jdk(int i, iyw iywVar, jbn jbnVar, jdr jdrVar, jat jatVar, int i2, xkj xkjVar, jdq jdqVar, String str, boolean z, Runnable runnable) {
        super(i, iywVar, jbnVar, i2);
        this.c = false;
        this.d = -1;
        this.e = new Object();
        this.q = 1;
        this.s = new AtomicInteger(0);
        this.y = false;
        this.j = jdrVar;
        this.n = jatVar;
        this.i = jdqVar;
        this.b = xkjVar;
        this.a = str;
        this.o = z;
        this.r = runnable;
        this.p = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
    }

    private final void H(ouo ouoVar, abnp abnpVar) {
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = this.a;
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oun ounVar = (oun) abnpVar.q();
        ounVar.getClass();
        oupVar3.f = ounVar;
        oupVar3.b |= 8;
        this.n.A(abnpVarN);
    }

    private final void i(ouo ouoVar) {
        abnp abnpVarR = r();
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = this.a;
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oun ounVar = (oun) abnpVarR.q();
        ounVar.getClass();
        oupVar3.f = ounVar;
        oupVar3.b |= 8;
        this.n.B(abnpVarN);
    }

    private final abnp r() {
        abnp abnpVarN = oun.a.n();
        izo izoVar = this.w;
        if (izoVar != null) {
            abnpVarN.t();
            oun ounVar = (oun) abnpVarN.b;
            ounVar.b |= 1;
            ounVar.c = ((izd) izoVar).b;
        }
        return abnpVarN;
    }

    protected final synchronized int A(int i) {
        int i2;
        i2 = this.q;
        this.q = i2 + 1;
        this.m.put(Integer.valueOf(i2), Integer.valueOf(i));
        return i2;
    }

    public final Optional B(int i) {
        Optional optionalOfNullable = Optional.ofNullable((jdj) this.l.get(Integer.valueOf(i)));
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return Optional.ofNullable(Duration.ofMillis(SystemClock.elapsedRealtime() - ((jdj) optionalOfNullable.get()).a));
    }

    public final void C(ouo ouoVar) {
        H(ouoVar, r());
    }

    protected final void D(oui ouiVar) {
        this.n.w(this.a, ouiVar);
    }

    public final void E(long j, jcn jcnVar, Runnable runnable) {
        int iA = A(0);
        if (runnable != null) {
            this.p.put(Integer.valueOf(iA), runnable);
        }
        if (!this.g) {
            yop yopVarAi = h().g().ai(1916);
            izo izoVar = this.w;
            izoVar.getClass();
            yopVarAi.w("Trying to send media data before starting, ch:%d", ((izd) izoVar).b);
            jcnVar.close();
            D(oui.MEDIA_NOT_STARTED);
            return;
        }
        int iD = jcnVar.d();
        jcnVar.q(2);
        jcnVar.u(j);
        jcnVar.q(iD);
        int iD2 = jcnVar.d();
        Map map = this.l;
        if (map.size() >= 5000 && !this.y) {
            h().g().ai(1904).u("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
            C(ouo.CALLBACK_QUEUE_OVERFLOW);
            this.y = true;
        } else if (map.size() < 5000) {
            this.y = false;
        }
        if (map.size() < 5000) {
            map.put(Integer.valueOf(iA), new jdj(j / 1000, SystemClock.elapsedRealtime(), iD2));
        }
        izo izoVar2 = this.w;
        izoVar2.getClass();
        izoVar2.d(jcnVar, new izn(true, true, iA));
    }

    public final boolean F() {
        int iIncrementAndGet;
        if (this.t) {
            D(oui.MEDIA_QUITTING);
            return false;
        }
        if (!this.o) {
            try {
                if (!this.i.g() && (iIncrementAndGet = this.s.incrementAndGet()) > 400) {
                    yzf yzfVar = this.v == 1 ? yzf.VIDEO_ACK_TIMEOUT : yzf.AUDIO_ACK_TIMEOUT;
                    jbn jbnVar = this.x;
                    jbnVar.getClass();
                    yze yzeVar = yze.CAR_NOT_RESPONDING;
                    izo izoVar = this.w;
                    izoVar.getClass();
                    jbnVar.aF(yzeVar, yzfVar, "Car not sending ACK, channel:" + ((izd) izoVar).b + ", timeouts:" + iIncrementAndGet + ", media type:" + this.b.h + ", sessionId:" + this.f);
                }
            } finally {
                try {
                } catch (InterruptedException unused) {
                }
            }
        }
        return true;
    }

    public final void G(abnp abnpVar) {
        if (!this.c) {
            yop yopVarAi = h().g().ai(1919);
            izo izoVar = this.w;
            izoVar.getClass();
            yopVarAi.w("Trying to start Media before receiving Config message, ch:%d", ((izd) izoVar).b);
            C(ouo.START_REQUESTED_BEFORE_CONFIG_MESSAGE_RECEIVED);
            return;
        }
        h().l().ai(1918).w("start MediaSourceEndPoint sessionId: %d", this.f);
        int i = this.f;
        abnpVar.t();
        xoh xohVar = (xoh) abnpVar.b;
        xoh xohVar2 = xoh.a;
        xohVar.b |= 1;
        xohVar.c = i;
        this.i.f();
        this.s.set(0);
        C(ouo.START);
        w((xoh) abnpVar.q());
        this.g = true;
    }

    @Override // defpackage.jbj, defpackage.iyz
    public void P(int i) {
        yop yopVarAi = h().l().ai(1913);
        izo izoVar = this.w;
        izoVar.getClass();
        yopVarAi.B("Closing channel with reason: %d ch:%d", i, ((izd) izoVar).b);
        C(i != 0 ? ouo.CHANNEL_CLOSED_DUE_TO_PROTOCOL_ERROR : ouo.CHANNEL_CLOSE_REQUESTED);
        if (this.g) {
            this.g = false;
        }
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void Q() {
        super.Q();
        i(ouo.CHANNEL_OPENED);
        yop yopVarAi = h().l().ai(1917);
        izo izoVar = this.w;
        izoVar.getClass();
        yopVarAi.w("send setup, ch:%d", ((izd) izoVar).b);
        abnp abnpVarN = xof.a.n();
        abnpVarN.t();
        xof xofVar = (xof) abnpVarN.b;
        xofVar.c = this.b.h;
        xofVar.b |= 1;
        k(32768, (xof) abnpVarN.q());
    }

    @Override // defpackage.jbj, defpackage.iyx
    public final void R(int i) {
        if (this.o) {
            return;
        }
        this.i.e(i);
    }

    @Override // defpackage.jbj
    protected void a(int i, ByteBuffer byteBuffer) throws abon {
        int iO = wub.o(i);
        if (iO == 32772) {
            abnv abnvVarC = abnv.C(xiu.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC);
            abnv.U(abnvVarC);
            s((xiu) abnvVarC);
            return;
        }
        if (iO == 32773) {
            if (!this.o) {
                abnv abnvVarC2 = abnv.C(xgz.a, abmw.O(byteBuffer), abnj.a);
                abnv.U(abnvVarC2);
                abnv.U(abnvVarC2);
                xgz xgzVar = (xgz) abnvVarC2;
                int I = dlz.I(Integer.valueOf(xgzVar.c));
                if (this.g) {
                    int i2 = I % 256;
                    if (i2 != this.f % 256) {
                        if (i2 != this.d % 256) {
                            yop yopVarAi = h().h().ai(1909);
                            Integer numValueOf = Integer.valueOf(this.f);
                            Integer numValueOf2 = Integer.valueOf(I);
                            izo izoVar = this.w;
                            izoVar.getClass();
                            yopVarAi.R("Got mismatch session id in ack. Expected: %d, got: %d, ch:%d", numValueOf, numValueOf2, Integer.valueOf(((izd) izoVar).b));
                            ouo ouoVar = ouo.RECEIVED_ACK_WITH_WRONG_SESSION_ID;
                            abnp abnpVarR = r();
                            int i3 = this.f;
                            abnpVarR.t();
                            oun ounVar = (oun) abnpVarR.b;
                            oun ounVar2 = oun.a;
                            ounVar.b |= 4;
                            ounVar.e = i3;
                            abnpVarR.t();
                            oun ounVar3 = (oun) abnpVarR.b;
                            ounVar3.b |= 8;
                            ounVar3.f = I;
                            H(ouoVar, abnpVarR);
                            return;
                        }
                        return;
                    }
                } else if (I != this.d) {
                    yop yopVarAi2 = h().h().l(1, TimeUnit.SECONDS).ai(1910);
                    Integer numValueOf3 = Integer.valueOf(this.d);
                    Integer numValueOf4 = Integer.valueOf(I);
                    izo izoVar2 = this.w;
                    izoVar2.getClass();
                    yopVarAi2.R("Got ack while not started. Previous session id was %d, got: %d, ch:%d", numValueOf3, numValueOf4, Integer.valueOf(((izd) izoVar2).b));
                    ouo ouoVar2 = ouo.RECEIVED_ACK_WHILE_NOT_STARTED;
                    abnp abnpVarR2 = r();
                    int i4 = this.d;
                    abnpVarR2.t();
                    oun ounVar4 = (oun) abnpVarR2.b;
                    oun ounVar5 = oun.a;
                    ounVar4.b |= 4;
                    ounVar4.e = i4;
                    abnpVarR2.t();
                    oun ounVar6 = (oun) abnpVarR2.b;
                    ounVar6.b |= 8;
                    ounVar6.f = I;
                    H(ouoVar2, abnpVarR2);
                    return;
                }
                this.s.set(0);
                List listAsList = xgzVar.e;
                if (listAsList == null || listAsList.isEmpty()) {
                    int I2 = dlz.I(Integer.valueOf(xgzVar.d));
                    if (I2 <= 0 || I2 > 4096) {
                        jbn jbnVar = this.x;
                        jbnVar.getClass();
                        jbnVar.aF(yze.PROTOCOL_WRONG_MESSAGE, yzf.INVALID_ACK, a.bp(xgzVar.d, "Ack frame count must be > 0 and <= 4096, was "));
                    } else {
                        listAsList = Arrays.asList(new Long[I2]);
                    }
                }
                if (listAsList == null || listAsList.isEmpty()) {
                    return;
                }
                if (xgzVar.d != listAsList.size()) {
                    h().h().l(500, TimeUnit.MILLISECONDS).ai(1908).B("Number of acks (%d) and timestamps (%d) do not match", xgzVar.d, listAsList.size());
                }
                this.i.d(listAsList);
                if (!z()) {
                    Object obj = this.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
                Runnable runnable = this.r;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            iO = 32773;
        }
        if (iO == 32780) {
            this.j.p();
            return;
        }
        if (iO == 32788) {
            abnv abnvVarC3 = abnv.C(xkq.a, abmw.O(byteBuffer), abnj.a());
            abnv.U(abnvVarC3);
            abnv.U(abnvVarC3);
            this.j.n((xkq) abnvVarC3);
            return;
        }
        yop yopVarAi3 = h().h().ai(1914);
        izo izoVar3 = this.w;
        izoVar3.getClass();
        yopVarAi3.B("Received message with invalid type header: %d ch:%d", i, ((izd) izoVar3).b);
        ouo ouoVar3 = ouo.INVALID_MESSAGE_RECEIVED;
        abnp abnpVarR3 = r();
        abnpVarR3.t();
        oun ounVar7 = (oun) abnpVarR3.b;
        oun ounVar8 = oun.a;
        ounVar7.b |= 2;
        ounVar7.d = i;
        H(ouoVar3, abnpVarR3);
    }

    @Override // defpackage.iyx
    public void b(int i) {
        Map map = this.m;
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) map.remove(numValueOf);
        if (num == null) {
            h().g().ai(1915).w("Attempted to get non-existent entry id %d from MediaSourceEndPoint.", i);
            C(ouo.INVALID_MESSAGE_CALLBACK_ID);
        } else {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                switch (iIntValue) {
                    case 32769:
                        u();
                        break;
                    case 32770:
                        v();
                        break;
                }
            } else {
                t();
            }
        }
        Map map2 = this.l;
        jdj jdjVar = (jdj) map2.remove(numValueOf);
        if (jdjVar != null) {
            jdr jdrVar = this.j;
            jdrVar.k(jdjVar.c);
            long j = jdjVar.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jdrVar.q(jElapsedRealtime - j);
            jdrVar.h(jElapsedRealtime - jdjVar.a);
        }
        Map map3 = this.p;
        Runnable runnable = (Runnable) map3.remove(numValueOf);
        if (runnable != null) {
            runnable.run();
        }
        int i2 = 0;
        while (true) {
            i--;
            Integer numValueOf2 = Integer.valueOf(i);
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

    @Override // defpackage.jbj
    public final void g() {
        super.g();
        C(ouo.PREPARE_STOP);
        this.i.c();
    }

    public abstract ypf h();

    protected void s(xiu xiuVar) {
        int i = xiuVar.c;
        this.h = i;
        if (this.o && i < 24) {
            h().l().ai(1912).w("Setting %d MAX_UNACK in drop overflow mode.", 24);
            this.h = 24;
        } else if (i <= 0) {
            jbn jbnVar = this.x;
            jbnVar.getClass();
            jbnVar.aF(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.INVALID_ACK_CONFIG, a.bp(i, "MaxUnacked must be >= 0, was "));
            return;
        }
        if (this.c) {
            jbn jbnVar2 = this.x;
            jbnVar2.getClass();
            jbnVar2.aF(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.MULTIPLE_DISPLAY_CONFIGS, "Multiple media configs received");
        } else {
            this.c = true;
            i(ouo.MESSAGE_CONFIG_RECEIVED);
            this.i.h(this.h);
            h().f().ai(1911).w("configMessage, MAX_UNACK: %d", this.h);
        }
    }

    protected void w(xoh xohVar) {
        k(32769, xohVar);
    }

    protected void x(xoi xoiVar) {
        k(32770, xoiVar);
    }

    public void y() {
        if (this.g) {
            this.d = this.f;
            this.f++;
            x(xoi.a);
            this.g = false;
            C(ouo.STOP);
            return;
        }
        yop yopVarAi = h().g().ai(1920);
        izo izoVar = this.w;
        izoVar.getClass();
        yopVarAi.w("Trying to stop Media before starting, ch:%d", ((izd) izoVar).b);
        C(ouo.STOP_CALLED_WHEN_NOT_STARTED);
    }

    public boolean z() {
        return this.i.a() > 0;
    }

    protected void t() {
    }

    protected void u() {
    }

    protected void v() {
    }
}

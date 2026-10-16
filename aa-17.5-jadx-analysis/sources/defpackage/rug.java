package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class rug extends ruq {
    public static final ypf a = ols.R("CAR.GAL.MEDIA");
    public volatile int b;
    public volatile boolean c;
    public final Object d;
    public final rui e;
    private final String f;
    private final xkj g;
    private boolean h;
    private volatile int i;
    private final AtomicInteger j;
    private final Map k;
    private final rul q;
    private final ruf r;
    private final Map s;
    private final AtomicInteger t;
    private boolean u;

    public rug(int i, rso rsoVar, rut rutVar, rul rulVar, ruf rufVar, xkj xkjVar, rui ruiVar) {
        super(i, rsoVar, rutVar, 2);
        this.h = false;
        this.i = -1;
        this.d = new Object();
        this.j = new AtomicInteger(1);
        this.t = new AtomicInteger(0);
        this.u = false;
        this.q = rulVar;
        this.r = rufVar;
        this.e = ruiVar;
        this.g = xkjVar;
        this.f = "AudioEndPoint";
        this.s = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
    }

    private final void q(oui ouiVar) {
        this.r.l(this.f, ouiVar);
    }

    private final void r(ouo ouoVar) {
        abnp abnpVarS = s();
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = this.f;
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oun ounVar = (oun) abnpVarS.q();
        ounVar.getClass();
        oupVar3.f = ounVar;
        oupVar3.b |= 8;
        this.r.o(abnpVarN);
    }

    private final abnp s() {
        abnp abnpVarN = oun.a.n();
        rtc rtcVar = this.o;
        if (rtcVar != null) {
            int iA = rtcVar.a();
            abnpVarN.t();
            oun ounVar = (oun) abnpVarN.b;
            ounVar.b |= 1;
            ounVar.c = iA;
        }
        return abnpVarN;
    }

    private final void t(ouo ouoVar, abnp abnpVar) {
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = this.f;
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
        this.r.n(abnpVarN);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, rul] */
    protected void b(xiu xiuVar) {
        int i = xiuVar.c;
        if (i <= 0) {
            rut rutVar = this.p;
            rutVar.getClass();
            rutVar.p(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.INVALID_ACK_CONFIG, a.bp(i, "MaxUnacked must be >= 0, was "));
        } else {
            if (this.h) {
                rut rutVar2 = this.p;
                rutVar2.getClass();
                rutVar2.p(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.MULTIPLE_DISPLAY_CONFIGS, "Multiple media configs received");
                return;
            }
            this.h = true;
            r(ouo.MESSAGE_CONFIG_RECEIVED);
            rui ruiVar = this.e;
            int i2 = xiuVar.c;
            ruj rujVar = ruiVar.b;
            if (!a.p(ruiVar.a, new ruk(rujVar.b, (acjs) rujVar.c, i2, rujVar.a))) {
                throw new IllegalStateException("initialize should not be called more than once.");
            }
            a.l().ai(8319).w("configMessage, MAX_UNACK:%d", xiuVar.c);
        }
    }

    public void c() {
        if (this.c) {
            this.i = this.b;
            this.b++;
            super.o(32770, xoi.a, true);
            this.c = false;
            i(ouo.STOP);
            return;
        }
        yop yopVarAi = a.g().ai(8327);
        rtc rtcVar = this.o;
        rtcVar.getClass();
        yopVarAi.w("Trying to stop Media before starting, ch:%d", rtcVar.a());
        i(ouo.STOP_CALLED_WHEN_NOT_STARTED);
    }

    @Override // defpackage.ruq
    protected final void d(int i, ByteBuffer byteBuffer) throws abon {
        int iO = wub.o(i);
        if (iO == 32772) {
            b((xiu) abnv.w(xiu.a, byteBuffer));
            return;
        }
        if (iO != 32773) {
            if (iO == 32780) {
                this.q.h();
                return;
            }
            yop yopVarAi = a.h().ai(8321);
            rtc rtcVar = this.o;
            rtcVar.getClass();
            yopVarAi.B("Received message with invalid type header: %d ch:%d", i, rtcVar.a());
            ouo ouoVar = ouo.INVALID_MESSAGE_RECEIVED;
            abnp abnpVarS = s();
            abnpVarS.t();
            oun ounVar = (oun) abnpVarS.b;
            oun ounVar2 = oun.a;
            ounVar.b |= 2;
            ounVar.d = i;
            t(ouoVar, abnpVarS);
            return;
        }
        xgz xgzVar = (xgz) abnv.w(xgz.a, byteBuffer);
        int iH = omc.h(Integer.valueOf(xgzVar.c));
        rlc.a(rsm.a);
        if (this.c) {
            int i2 = iH % 256;
            if (i2 != this.b % 256) {
                if (i2 != this.i % 256) {
                    yop yopVarAi2 = a.h().ai(8317);
                    Integer numValueOf = Integer.valueOf(this.b);
                    Integer numValueOf2 = Integer.valueOf(iH);
                    rtc rtcVar2 = this.o;
                    rtcVar2.getClass();
                    yopVarAi2.R("Got mismatch session id in ack. Expected: %d, got: %d, ch:%d", numValueOf, numValueOf2, Integer.valueOf(rtcVar2.a()));
                    ouo ouoVar2 = ouo.RECEIVED_ACK_WITH_WRONG_SESSION_ID;
                    abnp abnpVarS2 = s();
                    int i3 = this.b;
                    abnpVarS2.t();
                    oun ounVar3 = (oun) abnpVarS2.b;
                    oun ounVar4 = oun.a;
                    ounVar3.b |= 4;
                    ounVar3.e = i3;
                    abnpVarS2.t();
                    oun ounVar5 = (oun) abnpVarS2.b;
                    ounVar5.b |= 8;
                    ounVar5.f = iH;
                    t(ouoVar2, abnpVarS2);
                    return;
                }
                return;
            }
        } else if (iH != this.i) {
            yop yopVarAi3 = a.h().l(1, TimeUnit.SECONDS).ai(8318);
            Integer numValueOf3 = Integer.valueOf(this.i);
            Integer numValueOf4 = Integer.valueOf(iH);
            rtc rtcVar3 = this.o;
            rtcVar3.getClass();
            yopVarAi3.R("Got ack while not started. Previous session id was %d, got: %d, ch:%d", numValueOf3, numValueOf4, Integer.valueOf(rtcVar3.a()));
            ouo ouoVar3 = ouo.RECEIVED_ACK_WHILE_NOT_STARTED;
            abnp abnpVarS3 = s();
            int i4 = this.i;
            abnpVarS3.t();
            oun ounVar6 = (oun) abnpVarS3.b;
            oun ounVar7 = oun.a;
            ounVar6.b |= 4;
            ounVar6.e = i4;
            abnpVarS3.t();
            oun ounVar8 = (oun) abnpVarS3.b;
            ounVar8.b |= 8;
            ounVar8.f = iH;
            t(ouoVar3, abnpVarS3);
            return;
        }
        this.t.set(0);
        List listAsList = xgzVar.e;
        if (listAsList == null || listAsList.isEmpty()) {
            if (omc.h(Integer.valueOf(xgzVar.d)) <= 0) {
                rut rutVar = this.p;
                rutVar.getClass();
                rutVar.p(yze.PROTOCOL_WRONG_MESSAGE, yzf.INVALID_ACK, "Ack must ack > 0 frames, was " + xgzVar.d);
            } else {
                listAsList = Arrays.asList(new Long[omc.h(Integer.valueOf(xgzVar.d))]);
            }
        }
        if (listAsList != null && !listAsList.isEmpty()) {
            this.e.d(listAsList);
            if (!k()) {
                Object obj = this.d;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        }
        rlc.a(rsm.a);
    }

    @Override // defpackage.rsp
    public final void e(int i) {
        Map map = this.k;
        Integer numValueOf = Integer.valueOf(i);
        Long l = (Long) map.remove(numValueOf);
        if (l == null) {
            a.g().ai(8328).u("Attempted to remove non-existent callback timestamp from MediaSourceEndPoint.");
            i(ouo.INVALID_MESSAGE_CALLBACK_ID);
        } else {
            this.q.i(SystemClock.elapsedRealtime() - l.longValue());
        }
        Runnable runnable = (Runnable) this.s.remove(numValueOf);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void i(ouo ouoVar) {
        t(ouoVar, s());
    }

    public final void j(int i) {
        if (!this.h) {
            yop yopVarAi = a.g().ai(8326);
            rtc rtcVar = this.o;
            rtcVar.getClass();
            yopVarAi.w("Trying to start Media before receiving Config message, ch:%d", rtcVar.a());
            i(ouo.START_REQUESTED_BEFORE_CONFIG_MESSAGE_RECEIVED);
            return;
        }
        a.l().ai(8325).w("start MediaSourceEndPoint mSessionId: %d", this.b);
        abnp abnpVarN = xoh.a.n();
        int i2 = this.b;
        abnpVarN.t();
        xoh xohVar = (xoh) abnpVarN.b;
        xohVar.b |= 1;
        xohVar.c = i2;
        abnpVarN.t();
        xoh xohVar2 = (xoh) abnpVarN.b;
        xohVar2.b |= 2;
        xohVar2.d = i;
        xoh xohVar3 = (xoh) abnpVarN.q();
        this.e.e();
        this.t.set(0);
        i(ouo.START);
        super.o(32769, xohVar3, true);
        this.c = true;
    }

    public final boolean k() {
        return this.e.a() > 0;
    }

    public final void l(long j, ByteBuffer byteBuffer) {
        int iIncrementAndGet;
        vqk vqkVar = rsm.a;
        rlc.a(vqkVar);
        if (this.l) {
            q(oui.MEDIA_QUITTING);
            return;
        }
        try {
            rlc.a(vqkVar);
            if (!this.e.f() && (iIncrementAndGet = this.t.incrementAndGet()) > 400) {
                yzf yzfVar = this.n == 1 ? yzf.VIDEO_ACK_TIMEOUT : yzf.AUDIO_ACK_TIMEOUT;
                rut rutVar = this.p;
                rutVar.getClass();
                yze yzeVar = yze.CAR_NOT_RESPONDING;
                rtc rtcVar = this.o;
                rtcVar.getClass();
                rutVar.p(yzeVar, yzfVar, "Car not sending ACK, channel:" + rtcVar.a() + ", timeouts:" + iIncrementAndGet + ", media type:" + this.g.h + ", sessionId:" + this.b);
            }
            rlc.a(vqkVar);
            int iPosition = byteBuffer.position();
            int andIncrement = this.j.getAndIncrement();
            if (this.c) {
                int iPosition2 = byteBuffer.position();
                byteBuffer.position(2);
                byteBuffer.putLong(j);
                byteBuffer.position(iPosition2);
                Map map = this.k;
                if (map.size() >= 500 && !this.u) {
                    a.g().ai(8315).u("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
                    i(ouo.CALLBACK_QUEUE_OVERFLOW);
                    this.u = true;
                } else if (map.size() < 500) {
                    this.u = false;
                }
                if (map.size() < 500) {
                    map.put(Integer.valueOf(andIncrement), Long.valueOf(SystemClock.elapsedRealtime()));
                }
                rtc rtcVar2 = this.o;
                rtcVar2.getClass();
                rtcVar2.e(byteBuffer, new rtb(true, true, andIncrement));
            } else {
                yop yopVarAi = a.g().ai(8322);
                rtc rtcVar3 = this.o;
                rtcVar3.getClass();
                yopVarAi.w("Trying to send media data before starting, ch:%d", rtcVar3.a());
                q(oui.MEDIA_NOT_STARTED);
            }
            this.q.f(iPosition);
        } catch (InterruptedException unused) {
            yop yopVarAi2 = a.h().ai(8323);
            rtc rtcVar4 = this.o;
            rtcVar4.getClass();
            yopVarAi2.w("Dropping frame, ch:%d", rtcVar4.a());
            q(oui.MEDIA_INTERRUPTED_WAITING_TO_SEND_FRAME);
        }
        rlc.a(rsm.a);
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void u(int i) {
        ouo ouoVar;
        yop yopVarAi = a.l().ai(8320);
        rtc rtcVar = this.o;
        rtcVar.getClass();
        yopVarAi.B("Closing channel with reason: %d ch:%d", i, rtcVar.a());
        if (i == 0) {
            ouoVar = ouo.CHANNEL_CLOSE_REQUESTED;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(a.bp(i, "Invalid channelCloseReason: "));
            }
            ouoVar = ouo.CHANNEL_CLOSED_DUE_TO_PROTOCOL_ERROR;
        }
        i(ouoVar);
        if (this.c) {
            this.c = false;
        }
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void v() {
        super.v();
        r(ouo.CHANNEL_OPENED);
        yop yopVarAi = a.l().ai(8324);
        rtc rtcVar = this.o;
        rtcVar.getClass();
        yopVarAi.w("send setup, ch:%d", rtcVar.a());
        abnp abnpVarN = xof.a.n();
        abnpVarN.t();
        xof xofVar = (xof) abnpVarN.b;
        xofVar.c = this.g.h;
        xofVar.b |= 1;
        super.o(32768, (xof) abnpVarN.q(), true);
    }

    @Override // defpackage.ruq
    public final void x() {
        super.x();
        i(ouo.PREPARE_STOP);
        this.e.c();
    }
}

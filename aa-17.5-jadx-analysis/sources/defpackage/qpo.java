package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.car.CarAudioConfiguration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class qpo {
    public final ypf a;
    public final boolean b;
    public final int c;
    public final String d;
    public qpj e;
    public final List g;
    public final CarAudioConfiguration h;
    public final ruf l;
    private final rwe m;
    private final rwz n;
    private final qpk o;
    public volatile boolean f = false;
    public volatile boolean i = false;
    public final AtomicInteger j = new AtomicInteger(0);
    public final AtomicReference k = new AtomicReference(null);
    private final ykd p = new ykd(this, null);

    public qpo(rwc rwcVar, rwe rweVar, int i, List list, CarAudioConfiguration carAudioConfiguration, boolean z, ruf rufVar, rwz rwzVar, qpk qpkVar) {
        boolean z2 = false;
        ypf ypfVar = qqv.a;
        String strO = roc.O(i);
        this.d = strO;
        this.a = ols.R("CAR.AUDIO.".concat(String.valueOf(strO)));
        this.m = rweVar;
        this.c = i;
        if (!"GalReceiver-Local".equals(rwcVar.l().b) && (i == 3 || (i == 5 && !z))) {
            z2 = true;
        }
        this.b = z2;
        this.g = list;
        this.h = carAudioConfiguration;
        this.l = rufVar;
        this.n = rwzVar;
        this.o = qpkVar;
    }

    private final synchronized void h() {
        this.a.f().ai(7565).y("startSystemSoundStreaming %s", this.d);
        e();
    }

    private final synchronized void i() {
        this.a.f().ai(7568).y("stopSoundStreaming %s", this.d);
        f();
    }

    private final void j() throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        for (long jElapsedRealtime2 = 1000; this.j.get() != 0 && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (InterruptedException unused) {
            }
        }
        AtomicInteger atomicInteger = this.j;
        if (atomicInteger.get() != 0) {
            this.a.h().ai(7569).M("Focus command time-out, stream: %s, command: %s", this.d, atomicInteger);
            this.p.A(ouo.AUDIO_FOCUS_CHANGE_COMMAND_TIMED_OUT);
        }
    }

    public final synchronized void a(rek rekVar, rem remVar) {
        this.a.f().ai(7560).y("onBottomHalfAvailable, stream: %s", this.d);
        this.k.set(rekVar);
        this.j.set(1);
        this.p.A(ouo.AUDIO_BOTTOM_HALF_AVAILABLE);
        if (remVar != null) {
            int iA = rekVar.a();
            int i = this.c;
            if (iA != i) {
                rwz rwzVar = this.n;
                int iA2 = rekVar.a();
                abnp abnpVarN = ywm.a.n();
                abnpVarN.t();
                ywm ywmVar = (ywm) abnpVarN.b;
                ywmVar.b = 1 | ywmVar.b;
                ywmVar.c = i;
                abnpVarN.t();
                ywm ywmVar2 = (ywm) abnpVarN.b;
                ywmVar2.b |= 2;
                ywmVar2.d = iA2;
                int i2 = remVar.b.i;
                abnpVarN.t();
                ywm ywmVar3 = (ywm) abnpVarN.b;
                ywmVar3.b |= 8;
                ywmVar3.f = i2;
                abnpVarN.t();
                ywm ywmVar4 = (ywm) abnpVarN.b;
                ywmVar4.b |= 16;
                ywmVar4.g = remVar.c;
                abnpVarN.t();
                ywm ywmVar5 = (ywm) abnpVarN.b;
                ywmVar5.b |= 32;
                ywmVar5.h = remVar.d;
                xhi xhiVar = remVar.a;
                if (xhiVar != null) {
                    abnpVarN.t();
                    ywm ywmVar6 = (ywm) abnpVarN.b;
                    ywmVar6.b |= 4;
                    ywmVar6.e = xhiVar.e;
                }
                abnp abnpVarN2 = yxb.a.n();
                ywm ywmVar7 = (ywm) abnpVarN.q();
                abnpVarN2.t();
                yxb yxbVar = (yxb) abnpVarN2.b;
                ywmVar7.getClass();
                yxbVar.af = ywmVar7;
                yxbVar.d |= 16;
                yxc yxcVar = yxc.AUDIO_CHANNEL_SWITCHING_EVENT;
                int i3 = yfq.d;
                ((rxa) rwzVar).g(abnpVarN2, yxcVar, yls.a);
            }
        }
        j();
    }

    public final synchronized void b(rek rekVar) {
        qpj qpjVar = this.e;
        if (rekVar != (qpjVar == null ? null : ((qpl) qpjVar).e)) {
            this.p.A(ouo.AUDIO_IRRELEVANT_BOTTOM_HALF_LOST);
            return;
        }
        this.a.f().ai(7561).y("onBottomHalfLost, stream: %s", this.d);
        this.j.set(2);
        this.p.A(ouo.AUDIO_BOTTOM_HALF_LOST);
        j();
    }

    public final synchronized void c() {
        this.i = true;
        this.f = false;
        i();
        this.j.set(0);
        notifyAll();
    }

    public final synchronized void d() {
        this.a.f().ai(7563).y("AudioSourceService is ready with stream type: %s", this.d);
        this.p.B(ouo.AUDIO_CAR_READY);
        if (this.f) {
            return;
        }
        if (this.b) {
            h();
        }
        this.f = true;
    }

    public final void e() {
        ykd ykdVar = this.p;
        ykdVar.B(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_STARTING);
        qpk qpkVar = this.o;
        Context context = qpkVar.a;
        rej rejVar = qpkVar.b;
        rwe rweVar = qpkVar.c;
        wyd wydVar = qpkVar.l;
        qpu qpuVar = qpkVar.d;
        ren renVar = qpkVar.e;
        int i = qpkVar.f;
        ypf ypfVar = qqv.a;
        String strO = roc.O(i);
        CarAudioConfiguration carAudioConfiguration = qpkVar.g;
        boolean z = qpkVar.h;
        qrv qrvVar = qpkVar.k;
        ruf rufVar = qpkVar.i;
        erb erbVar = qpkVar.m;
        qpl qplVar = new qpl(this, context, rejVar, rweVar, wydVar, qpuVar, renVar, i, strO, carAudioConfiguration, z, qrvVar, rufVar, qpkVar.j, this.a, ykdVar, this.j, this.k);
        this.e = qplVar;
        qplVar.start();
    }

    public final void f() {
        qpj qpjVar = this.e;
        if (qpjVar != null) {
            ((qpl) qpjVar).c = true;
        }
        ykd ykdVar = this.p;
        ykdVar.A(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_ENDING);
        qpj qpjVar2 = this.e;
        if (qpjVar2 != null && qpjVar2.isAlive()) {
            Thread threadCurrentThread = Thread.currentThread();
            qpj qpjVar3 = this.e;
            if (threadCurrentThread != qpjVar3) {
                try {
                    qpjVar3.join(1000L);
                    if (this.e.isAlive()) {
                        ypf ypfVar = this.a;
                        yop yopVarAi = ypfVar.h().ai(7566);
                        String str = this.d;
                        yopVarAi.y("audio capturing thread not finishing for stream: %s", str);
                        ykdVar.A(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_END_TIMEOUT);
                        this.e.interrupt();
                        this.e.join(500L);
                        if (this.e.isAlive() && this.i) {
                            ypfVar.g().ai(7567).y("audio capturing thread not finishing, 2nd trial, for stream: %s", str);
                            ykdVar.A(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_END_SECOND_TRY_TIMEOUT);
                            rwe rweVar = this.m;
                            rwd rwdVar = rwd.a;
                            qso.a.h().ai(7847).y("onGenericThreadStuck: %s", rwdVar);
                            ((qso) rweVar).l.add(rwdVar);
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        qpj qpjVar4 = this.e;
        if (qpjVar4 == null || !qpjVar4.isAlive()) {
            this.p.A(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_ENDED);
        }
    }

    public final synchronized void g(rek rekVar) {
        yop yopVarAi = this.a.f().ai(7562);
        int iA = rekVar.a();
        ypf ypfVar = qqv.a;
        yopVarAi.M("onBottomHalfSwitch, stream: %s, new bh: %s", this.d, roc.O(iA));
        this.k.set(rekVar);
        this.j.set(3);
        this.p.A(ouo.AUDIO_BOTTOM_HALF_SWITCHED);
        j();
    }
}

package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.car.CarAudioConfiguration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iqc {
    public final yph a;
    public final boolean b;
    public final int c;
    public final String d;
    public volatile ipu e;
    public final CarAudioConfiguration g;
    public final jat k;
    private final isv l;
    private final jev m;
    private final jfg n;
    private final iqx o;
    private final ipv p;
    public volatile boolean f = false;
    public volatile boolean h = false;
    public final AtomicInteger i = new AtomicInteger(0);
    public final AtomicReference j = new AtomicReference(null);
    private final izj q = new izj(this);

    public iqc(int i, CarAudioConfiguration carAudioConfiguration, isv isvVar, jat jatVar, jes jesVar, ipv ipvVar, jev jevVar, jfg jfgVar, iqx iqxVar, boolean z) {
        boolean z2 = false;
        String strO = roc.O(i);
        this.d = strO;
        this.a = new yph(yqn.d("CAR.AUDIO.".concat(String.valueOf(strO))));
        this.m = jevVar;
        this.c = i;
        if (!"GalReceiver-Local".equals(jesVar.t().b) && (i == 3 || (i == 5 && !z))) {
            z2 = true;
        }
        this.b = z2;
        this.g = carAudioConfiguration;
        this.l = isvVar;
        this.k = jatVar;
        this.p = ipvVar;
        this.n = jfgVar;
        this.o = iqxVar;
    }

    private final void k() throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        for (long jElapsedRealtime2 = 1000; this.i.get() != 0 && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (InterruptedException unused) {
            }
        }
        AtomicInteger atomicInteger = this.i;
        if (atomicInteger.get() != 0) {
            ((ype) ((ype) this.a.h()).ai(1096)).M("Focus command time-out, stream: %s, command: %s", this.d, atomicInteger);
            this.q.c(ouo.AUDIO_FOCUS_CHANGE_COMMAND_TIMED_OUT);
        }
    }

    public final synchronized void a() {
        this.h = true;
        this.f = false;
        f();
        this.i.set(0);
        notifyAll();
    }

    public final synchronized void b() {
        yph yphVar = this.a;
        yop yopVarF = yphVar.f();
        String str = this.d;
        ((ype) ((ype) yopVarF).ai((char) 1090)).y("AudioSourceService is ready with stream type: %s", str);
        this.q.d(ouo.AUDIO_CAR_READY);
        if (this.f) {
            return;
        }
        if (this.b) {
            ((ype) ((ype) yphVar.f()).ai((char) 1091)).y("startSystemSoundStreaming %s", str);
            e();
        }
        this.f = true;
    }

    public final synchronized void c() {
        if (this.e != null) {
            this.e.b();
        }
    }

    public final synchronized void d() {
        if (this.e != null) {
            this.e.c();
        }
    }

    public final void e() {
        izj izjVar = this.q;
        izjVar.d(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_STARTING);
        ipv ipvVar = this.p;
        Context context = ipvVar.a;
        ipz ipzVar = ipvVar.c;
        jev jevVar = ipvVar.e;
        jew jewVar = ipvVar.f;
        jes jesVar = ipvVar.g;
        iqk iqkVar = ipvVar.b;
        boolean z = ipvVar.h;
        jdh jdhVar = ipvVar.i;
        itk itkVar = ipvVar.d;
        jfg jfgVar = ipvVar.j;
        int i = ipvVar.k;
        AtomicInteger atomicInteger = this.i;
        AtomicReference atomicReference = this.j;
        int i2 = this.c;
        String strO = roc.O(i2);
        CarAudioConfiguration carAudioConfiguration = this.g;
        this.e = new ipw(this, context, ipzVar, jevVar, jewVar, jesVar, iqkVar, this.l, i2, strO, carAudioConfiguration, z, jdhVar, this.k, itkVar, jfgVar, this.o, izjVar, atomicInteger, atomicReference, ipvVar.l);
        this.e.start();
    }

    public final void f() {
        ((ype) ((ype) this.a.f()).ai(1093)).y("stopAudioCaptureThread %s", this.d);
        g();
    }

    public final void g() {
        if (this.e != null) {
            ((ipw) this.e).h = true;
        }
        izj izjVar = this.q;
        izjVar.c(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_ENDING);
        if (this.e != null && this.e.isAlive() && Thread.currentThread() != this.e) {
            try {
                this.e.join(1000L);
                if (this.e.isAlive()) {
                    yph yphVar = this.a;
                    ype ypeVar = (ype) ((ype) yphVar.h()).ai(1094);
                    String str = this.d;
                    ypeVar.y("audio capturing thread not finishing for stream: %s", str);
                    izjVar.c(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_END_TIMEOUT);
                    this.e.interrupt();
                    this.e.join(500L);
                    if (this.e.isAlive() && this.h) {
                        ((ype) ((ype) yphVar.g()).ai(1095)).y("audio capturing thread not finishing, 2nd trial, for stream: %s", str);
                        izjVar.c(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_END_SECOND_TRY_TIMEOUT);
                        this.m.aH(jeu.b);
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
        if (this.e == null || !this.e.isAlive()) {
            this.q.c(ouo.AUDIO_SYSTEM_SOUND_CAPTURING_ENDED);
        }
    }

    public final synchronized void h(iqa iqaVar, iqs iqsVar) {
        int i;
        int i2;
        ((ype) ((ype) this.a.f()).ai(1087)).y("onBottomHalfAvailable, stream: %s", this.d);
        this.j.set(iqaVar);
        this.i.set(1);
        this.q.c(ouo.AUDIO_BOTTOM_HALF_AVAILABLE);
        if (iqsVar != null && (i = iqaVar.c) != (i2 = this.c)) {
            jfg jfgVar = this.n;
            abnp abnpVarN = ywm.a.n();
            abnpVarN.t();
            ywm ywmVar = (ywm) abnpVarN.b;
            ywmVar.b = 1 | ywmVar.b;
            ywmVar.c = i2;
            abnpVarN.t();
            ywm ywmVar2 = (ywm) abnpVarN.b;
            ywmVar2.b |= 2;
            ywmVar2.d = i;
            int i3 = iqsVar.c.i;
            abnpVarN.t();
            ywm ywmVar3 = (ywm) abnpVarN.b;
            ywmVar3.b |= 8;
            ywmVar3.f = i3;
            abnpVarN.t();
            ywm ywmVar4 = (ywm) abnpVarN.b;
            ywmVar4.b |= 16;
            ywmVar4.g = iqsVar.d;
            abnpVarN.t();
            ywm ywmVar5 = (ywm) abnpVarN.b;
            ywmVar5.b |= 32;
            ywmVar5.h = iqsVar.e;
            abnpVarN.t();
            ywm ywmVar6 = (ywm) abnpVarN.b;
            ywmVar6.b |= 64;
            ywmVar6.i = iqsVar.f;
            xhi xhiVar = iqsVar.b;
            if (xhiVar != null) {
                abnpVarN.t();
                ywm ywmVar7 = (ywm) abnpVarN.b;
                ywmVar7.b |= 4;
                ywmVar7.e = xhiVar.e;
            }
            String str = iqsVar.a;
            if (str != null) {
                if (((ixu) ((jfh) jfgVar).b.gu()).m(str)) {
                    abnpVarN.t();
                    ywm ywmVar8 = (ywm) abnpVarN.b;
                    ywmVar8.b |= 128;
                    ywmVar8.j = str;
                } else {
                    abnpVarN.t();
                    ywm ywmVar9 = (ywm) abnpVarN.b;
                    ywmVar9.b |= 128;
                    ywmVar9.j = "unsupported";
                }
            }
            abnp abnpVarN2 = yxb.a.n();
            ywm ywmVar10 = (ywm) abnpVarN.q();
            abnpVarN2.t();
            yxb yxbVar = (yxb) abnpVarN2.b;
            ywmVar10.getClass();
            yxbVar.af = ywmVar10;
            yxbVar.d |= 16;
            yxc yxcVar = yxc.AUDIO_CHANNEL_SWITCHING_EVENT;
            int i4 = yfq.d;
            ((jfh) jfgVar).m(abnpVarN2, yxcVar, yls.a);
        }
        k();
    }

    public final synchronized void i(iqa iqaVar) {
        if (iqaVar != (this.e == null ? null : ((ipw) this.e).k)) {
            this.q.c(ouo.AUDIO_IRRELEVANT_BOTTOM_HALF_LOST);
            return;
        }
        ((ype) ((ype) this.a.f()).ai(1088)).y("onBottomHalfLost, stream: %s", this.d);
        this.i.set(2);
        this.q.c(ouo.AUDIO_BOTTOM_HALF_LOST);
        k();
    }

    public final synchronized void j(iqa iqaVar) {
        ((ype) ((ype) this.a.f()).ai(1089)).M("onBottomHalfSwitch, stream: %s, new bh: %s", this.d, roc.O(iqaVar.c));
        this.j.set(iqaVar);
        this.i.set(3);
        this.q.c(ouo.AUDIO_BOTTOM_HALF_SWITCHED);
        k();
    }
}

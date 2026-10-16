package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqj {
    public final defpackage.yqm a;
    public final boolean b;
    public final int c;
    public final java.lang.String d;
    public volatile defpackage.iqb e;
    public final com.google.android.gms.car.CarAudioConfiguration g;
    public final defpackage.jba k;
    private final defpackage.itd l;
    private final defpackage.jfd m;
    private final defpackage.jfo n;
    private final defpackage.irg o;
    private final defpackage.iqc p;
    public volatile boolean f = false;
    public volatile boolean h = false;
    public final java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference(null);
    private final defpackage.izq q = new defpackage.izq(this);

    public iqj(int i, com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration, defpackage.itd itdVar, defpackage.jba jbaVar, defpackage.jfa jfaVar, defpackage.iqc iqcVar, defpackage.jfd jfdVar, defpackage.jfo jfoVar, defpackage.irg irgVar, boolean z) {
        boolean z2 = false;
        java.lang.String strY = defpackage.tna.Y(i);
        this.d = strY;
        this.a = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.".concat(java.lang.String.valueOf(strY))));
        this.m = jfdVar;
        this.c = i;
        if (!"GalReceiver-Local".equals(jfaVar.t().b) && (i == 3 || (i == 5 && !z))) {
            z2 = true;
        }
        this.b = z2;
        this.g = carAudioConfiguration;
        this.l = itdVar;
        this.k = jbaVar;
        this.p = iqcVar;
        this.n = jfoVar;
        this.o = irgVar;
    }

    private final void k() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + 1000;
        for (long jElapsedRealtime2 = 1000; this.i.get() != 0 && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - android.os.SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.i;
        if (atomicInteger.get() != 0) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.h()).ai(1096)).M("Focus command time-out, stream: %s, command: %s", this.d, atomicInteger);
            this.q.c(defpackage.ovl.AUDIO_FOCUS_CHANGE_COMMAND_TIMED_OUT);
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
        defpackage.yqm yqmVar = this.a;
        defpackage.ypu ypuVarF = yqmVar.f();
        java.lang.String str = this.d;
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 1090)).y("AudioSourceService is ready with stream type: %s", str);
        this.q.d(defpackage.ovl.AUDIO_CAR_READY);
        if (this.f) {
            return;
        }
        if (this.b) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1091)).y("startSystemSoundStreaming %s", str);
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
        defpackage.izq izqVar = this.q;
        izqVar.d(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_STARTING);
        defpackage.iqc iqcVar = this.p;
        android.content.Context context = iqcVar.a;
        defpackage.iqg iqgVar = iqcVar.c;
        defpackage.jfd jfdVar = iqcVar.e;
        defpackage.jfe jfeVar = iqcVar.f;
        defpackage.jfa jfaVar = iqcVar.g;
        defpackage.iqr iqrVar = iqcVar.b;
        boolean z = iqcVar.h;
        defpackage.jdo jdoVar = iqcVar.i;
        defpackage.its itsVar = iqcVar.d;
        defpackage.jfo jfoVar = iqcVar.j;
        int i = iqcVar.k;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.i;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.j;
        int i2 = this.c;
        java.lang.String strY = defpackage.tna.Y(i2);
        com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration = this.g;
        this.e = new defpackage.iqd(this, context, iqgVar, jfdVar, jfeVar, jfaVar, iqrVar, this.l, i2, strY, carAudioConfiguration, z, jdoVar, this.k, itsVar, jfoVar, this.o, izqVar, atomicInteger, atomicReference, iqcVar.l);
        this.e.start();
    }

    public final void f() {
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1093)).y("stopAudioCaptureThread %s", this.d);
        g();
    }

    public final void g() {
        if (this.e != null) {
            ((defpackage.iqd) this.e).h = true;
        }
        defpackage.izq izqVar = this.q;
        izqVar.c(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_ENDING);
        if (this.e != null && this.e.isAlive() && java.lang.Thread.currentThread() != this.e) {
            try {
                this.e.join(1000L);
                if (this.e.isAlive()) {
                    defpackage.yqm yqmVar = this.a;
                    defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1094);
                    java.lang.String str = this.d;
                    yqjVar.y("audio capturing thread not finishing for stream: %s", str);
                    izqVar.c(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_END_TIMEOUT);
                    this.e.interrupt();
                    this.e.join(500L);
                    if (this.e.isAlive() && this.h) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(1095)).y("audio capturing thread not finishing, 2nd trial, for stream: %s", str);
                        izqVar.c(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_END_SECOND_TRY_TIMEOUT);
                        this.m.aH(defpackage.jfc.b);
                    }
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (this.e == null || !this.e.isAlive()) {
            this.q.c(defpackage.ovl.AUDIO_SYSTEM_SOUND_CAPTURING_ENDED);
        }
    }

    public final synchronized void h(defpackage.iqh iqhVar, defpackage.ira iraVar) {
        int i;
        int i2;
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1087)).y("onBottomHalfAvailable, stream: %s", this.d);
        this.j.set(iqhVar);
        this.i.set(1);
        this.q.c(defpackage.ovl.AUDIO_BOTTOM_HALF_AVAILABLE);
        if (iraVar != null && (i = iqhVar.c) != (i2 = this.c)) {
            defpackage.jfo jfoVar = this.n;
            defpackage.abor aborVarN = defpackage.yxr.a.n();
            aborVarN.t();
            defpackage.yxr yxrVar = (defpackage.yxr) aborVarN.b;
            yxrVar.b = 1 | yxrVar.b;
            yxrVar.c = i2;
            aborVarN.t();
            defpackage.yxr yxrVar2 = (defpackage.yxr) aborVarN.b;
            yxrVar2.b |= 2;
            yxrVar2.d = i;
            int i3 = iraVar.c.i;
            aborVarN.t();
            defpackage.yxr yxrVar3 = (defpackage.yxr) aborVarN.b;
            yxrVar3.b |= 8;
            yxrVar3.f = i3;
            aborVarN.t();
            defpackage.yxr yxrVar4 = (defpackage.yxr) aborVarN.b;
            yxrVar4.b |= 16;
            yxrVar4.g = iraVar.d;
            aborVarN.t();
            defpackage.yxr yxrVar5 = (defpackage.yxr) aborVarN.b;
            yxrVar5.b |= 32;
            yxrVar5.h = iraVar.e;
            aborVarN.t();
            defpackage.yxr yxrVar6 = (defpackage.yxr) aborVarN.b;
            yxrVar6.b |= 64;
            yxrVar6.i = iraVar.f;
            defpackage.xij xijVar = iraVar.b;
            if (xijVar != null) {
                aborVarN.t();
                defpackage.yxr yxrVar7 = (defpackage.yxr) aborVarN.b;
                yxrVar7.b |= 4;
                yxrVar7.e = xijVar.e;
            }
            java.lang.String str = iraVar.a;
            if (str != null) {
                if (((defpackage.iyc) ((defpackage.jfp) jfoVar).b.fF()).m(str)) {
                    aborVarN.t();
                    defpackage.yxr yxrVar8 = (defpackage.yxr) aborVarN.b;
                    yxrVar8.b |= 128;
                    yxrVar8.j = str;
                } else {
                    aborVarN.t();
                    defpackage.yxr yxrVar9 = (defpackage.yxr) aborVarN.b;
                    yxrVar9.b |= 128;
                    yxrVar9.j = "unsupported";
                }
            }
            defpackage.abor aborVarN2 = defpackage.yyg.a.n();
            defpackage.yxr yxrVar10 = (defpackage.yxr) aborVarN.q();
            aborVarN2.t();
            defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
            yxrVar10.getClass();
            yygVar.af = yxrVar10;
            yygVar.d |= 16;
            defpackage.yyh yyhVar = defpackage.yyh.AUDIO_CHANNEL_SWITCHING_EVENT;
            int i4 = defpackage.ygw.d;
            ((defpackage.jfp) jfoVar).m(aborVarN2, yyhVar, defpackage.ymx.a);
        }
        k();
    }

    public final synchronized void i(defpackage.iqh iqhVar) {
        if (iqhVar != (this.e == null ? null : ((defpackage.iqd) this.e).k)) {
            this.q.c(defpackage.ovl.AUDIO_IRRELEVANT_BOTTOM_HALF_LOST);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1088)).y("onBottomHalfLost, stream: %s", this.d);
        this.i.set(2);
        this.q.c(defpackage.ovl.AUDIO_BOTTOM_HALF_LOST);
        k();
    }

    public final synchronized void j(defpackage.iqh iqhVar) {
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1089)).M("onBottomHalfSwitch, stream: %s, new bh: %s", this.d, defpackage.tna.Y(iqhVar.c));
        this.j.set(iqhVar);
        this.i.set(3);
        this.q.c(defpackage.ovl.AUDIO_BOTTOM_HALF_SWITCHED);
        k();
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;

/* loaded from: classes2.dex */
public final class qqt implements rft, qpw, qqu, rtd {
    public static final ypf a = ols.R("CAR.AUDIO.FOCUS");
    private final Runnable A;
    public final qpx b;
    public final xyc c;
    public final rfp d;
    public final rfu e;
    public final rfi f;
    public xhj g;
    public volatile xhi h;
    public boolean i;
    volatile rtg j;
    public qqs k;
    public final Object l;
    public final AudioManager m;
    public volatile Integer n;
    public int o;
    public long p;
    public int q;
    public final wyd r;
    final ykd s;
    private final rwz t;
    private final rwc u;
    private volatile Long v;
    private boolean w;
    private final HandlerThread x;
    private final HandlerThread y;
    private long z;

    public qqt(Context context, rwz rwzVar, xyc xycVar, wyd wydVar, rwc rwcVar) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        HandlerThread handlerThread = new HandlerThread("FOCUS_HANDLER", -16);
        HandlerThread handlerThread2 = new HandlerThread("FOCUS_RELEASE");
        rfi rfiVar = new rfi(rwzVar);
        this.v = null;
        this.g = xhj.AUDIO_FOCUS_STATE_INVALID;
        this.h = null;
        this.i = false;
        this.w = false;
        this.l = new Object();
        this.o = 0;
        this.p = -1L;
        this.z = 0L;
        this.q = 0;
        this.A = new qjv(this, 12, null);
        ykd ykdVar = new ykd(this, null);
        this.s = ykdVar;
        this.x = handlerThread;
        this.y = handlerThread2;
        this.t = rwzVar;
        this.c = xycVar;
        this.r = wydVar;
        this.m = audioManager;
        this.b = new qpx(this);
        this.f = rfiVar;
        this.e = new rfw(audioManager, telephonyManager, this);
        this.d = new rfq(audioManager, ykdVar);
        this.u = rwcVar;
    }

    private final synchronized void k() {
        if (this.w) {
            return;
        }
        boolean z = true;
        this.w = true;
        this.y.start();
        HandlerThread handlerThread = this.x;
        handlerThread.start();
        qpx qpxVar = this.b;
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        qpxVar.e = new qpv(qpxVar, looper);
        this.k = new qqs(this, looper);
        rfp rfpVar = this.d;
        sss sssVar = new sss(looper);
        ((rfq) rfpVar).c = sssVar;
        sssVar.post(new ral(rfpVar, 8));
        rfu rfuVar = this.e;
        ((rfw) rfuVar).b.listen(((rfw) rfuVar).e, 32);
        if (((rfw) rfuVar).c() == 0) {
            z = false;
        }
        ((rfw) rfuVar).d = z;
        c("start");
    }

    private final synchronized void l() {
        ypf ypfVar = a;
        ypfVar.l().ai(7639).u("Stop audio focus handler");
        if (this.w) {
            Integer num = this.n;
            if (num != null) {
                ypfVar.f().ai(7640).y("Restoring media stream volume to: %d", num);
                this.m.setStreamVolume(3, num.intValue(), 0);
            }
            this.n = null;
            this.w = false;
            rfp rfpVar = this.d;
            rfq.a.f().ai(7965).u("Request Android audio focus on exit");
            Handler handler = ((rfq) rfpVar).c;
            if (handler != null) {
                ((rfq) rfpVar).d.b = null;
                handler.post(new ral(rfpVar, 9));
            }
            ((rfq) rfpVar).c = null;
            qpx qpxVar = this.b;
            qpv qpvVar = qpxVar.e;
            qpvVar.getClass();
            qpvVar.b();
            qpxVar.e(3);
            qpxVar.e(5);
            qpxVar.e(1);
            qpxVar.f();
            qqs qqsVar = this.k;
            qqsVar.getClass();
            qqsVar.e();
            this.x.quitSafely();
            this.y.quit();
        }
    }

    @Override // defpackage.qpw
    public final void a(xhj xhjVar) {
        qqs qqsVar = this.k;
        qqsVar.getClass();
        qqsVar.c(xhjVar, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.xhj r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqt.b(xhj, boolean, boolean):void");
    }

    public final void c(String str) {
        final int i = 1;
        final int i2 = 0;
        a.d().ai(7629).R("%s: focusStateFromCar %s, focusRequestSentToCar %s", str, new yoc(this) { // from class: qqr
            public final /* synthetic */ qqt a;

            {
                this.a = this;
            }

            @Override // defpackage.yoc
            public final Object a() {
                int i3 = i;
                qqt qqtVar = this.a;
                return i3 != 0 ? roc.s(qqtVar.g) : roc.r(qqtVar.h);
            }
        }, new yoc(this) { // from class: qqr
            public final /* synthetic */ qqt a;

            {
                this.a = this;
            }

            @Override // defpackage.yoc
            public final Object a() {
                int i3 = i2;
                qqt qqtVar = this.a;
                return i3 != 0 ? roc.s(qqtVar.g) : roc.r(qqtVar.h);
            }
        });
    }

    @Override // defpackage.rtd
    public final synchronized void d(rtg rtgVar) {
        this.j = rtgVar;
    }

    @Override // defpackage.rtd
    public final synchronized void e() {
        l();
        rfu rfuVar = this.e;
        ((rfw) rfuVar).b.listen(((rfw) rfuVar).e, 0);
        this.j = null;
    }

    @Override // defpackage.rtd
    public final void f(xhj xhjVar, boolean z) {
        synchronized (this) {
            if (!this.w) {
                a.h().ai(7631).w("Focus change from car while focus handling is not started. This will be ignored %d", xhjVar.i);
                return;
            }
            yop yopVarAi = a.f().ai(7630);
            Integer numValueOf = Integer.valueOf(xhjVar.i);
            zjc zjcVar = zjc.a;
            yopVarAi.M("focus change from car: %s, unsolicited: %s", new zjd(zjcVar, numValueOf), new zjd(zjcVar, Boolean.valueOf(z)));
            if (this.z > 0 && !z) {
                rwz rwzVar = this.t;
                if (rwzVar != null) {
                    xhi xhiVar = this.h;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.z;
                    if (xhiVar != null) {
                        abnp abnpVarN = ywn.a.n();
                        abnpVarN.t();
                        ywn ywnVar = (ywn) abnpVarN.b;
                        ywnVar.b |= 1;
                        ywnVar.c = xhiVar.e;
                        abnpVarN.t();
                        ywn ywnVar2 = (ywn) abnpVarN.b;
                        ywnVar2.b |= 2;
                        ywnVar2.d = (int) jElapsedRealtime;
                        ywn ywnVar3 = (ywn) abnpVarN.q();
                        abnp abnpVarN2 = yxb.a.n();
                        abnpVarN2.t();
                        yxb yxbVar = (yxb) abnpVarN2.b;
                        ywnVar3.getClass();
                        yxbVar.k = ywnVar3;
                        yxbVar.b |= 128;
                        yxc yxcVar = yxc.AUDIO_FOCUS_REQUEST;
                        int i = yfq.d;
                        ((rxa) rwzVar).g(abnpVarN2, yxcVar, yls.a);
                    }
                }
                this.z = 0L;
            }
            qqs qqsVar = this.k;
            qqsVar.getClass();
            qqsVar.a();
            qqs qqsVar2 = this.k;
            qqsVar2.getClass();
            qqsVar2.c(xhjVar, z, false);
        }
    }

    public final void g() {
        a.d().ai(7632).u("requestCarAudioFocusRelease");
        Looper looper = this.y.getLooper();
        if (looper == null) {
            return;
        }
        rbe.f(looper, this.A);
    }

    public final void h(xhi xhiVar, int i) {
        yop yopVarAi = a.f().ai(7635);
        String strR = roc.r(xhiVar);
        zjc zjcVar = zjc.a;
        yopVarAi.M("send audio focus request to car:%s, attempt#: %s", new zjd(zjcVar, strR), new zjd(zjcVar, Integer.valueOf(i)));
        rtg rtgVar = this.j;
        if (rtgVar != null) {
            this.z = SystemClock.elapsedRealtime();
            this.h = xhiVar;
            qqs qqsVar = this.k;
            qqsVar.getClass();
            qqsVar.b(xhiVar, i);
            rtgVar.a(xhiVar);
            if (i == 1) {
                rfi rfiVar = this.f;
                rfg rfgVarA = rfh.a();
                rfgVarA.a = this.h;
                rfiVar.a(rfgVarA.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r4) {
        /*
            r3 = this;
            qqs r0 = r3.k
            r0.getClass()
            boolean r0 = r0.f()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.l
            monitor-enter(r0)
            r3.q = r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            ypf r3 = defpackage.qqt.a
            yop r3 = r3.f()
            r0 = 7638(0x1dd6, float:1.0703E-41)
            yop r3 = r3.ai(r0)
            java.lang.String r4 = defpackage.uqw.N(r4)
            java.lang.String r0 = "new focus while waiting for car's response, external app focus: %s"
            r3.y(r0, r4)
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            r0 = -1
            r1 = 1
            if (r4 == r0) goto L56
            if (r4 == r1) goto L53
            r0 = 2
            if (r4 == r0) goto L50
            r0 = 3
            if (r4 == r0) goto L4d
            r0 = 4
            if (r4 == r0) goto L50
            ypf r0 = defpackage.qqt.a
            yop r0 = r0.h()
            r2 = 7627(0x1dcb, float:1.0688E-41)
            yop r0 = r0.ai(r2)
            java.lang.String r2 = "Unexpected Android focus state: %d"
            r0.w(r2, r4)
            xhi r4 = defpackage.xhi.AUDIO_FOCUS_RELEASE
            goto L58
        L4d:
            xhi r4 = defpackage.xhi.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK
            goto L58
        L50:
            xhi r4 = defpackage.xhi.AUDIO_FOCUS_GAIN_TRANSIENT
            goto L58
        L53:
            xhi r4 = defpackage.xhi.AUDIO_FOCUS_GAIN
            goto L58
        L56:
            xhi r4 = defpackage.xhi.AUDIO_FOCUS_RELEASE
        L58:
            xhj r0 = r3.g
            boolean r0 = defpackage.roc.R(r0, r4)
            if (r0 != 0) goto L7d
            ypf r3 = defpackage.qqt.a
            yop r3 = r3.f()
            r0 = 7637(0x1dd5, float:1.0702E-41)
            yop r3 = r3.ai(r0)
            java.lang.String r4 = defpackage.roc.r(r4)
            zjd r0 = new zjd
            zjc r1 = defpackage.zjc.a
            r0.<init>(r1, r4)
            java.lang.String r4 = "Redundant audio focus request to car:%s"
            r3.y(r4, r0)
            return
        L7d:
            rfu r0 = r3.e
            rfw r0 = (defpackage.rfw) r0
            boolean r0 = r0.d
            if (r0 == 0) goto Lb7
            xhi r0 = defpackage.xhi.AUDIO_FOCUS_GAIN
            if (r4 == r0) goto L8f
            xhj r0 = r3.g
            xhj r2 = defpackage.xhj.AUDIO_FOCUS_STATE_LOSS_TRANSIENT
            if (r0 != r2) goto Lb7
        L8f:
            ypf r0 = defpackage.qqt.a
            yop r0 = r0.f()
            r1 = 7636(0x1dd4, float:1.07E-41)
            yop r0 = r0.ai(r1)
            java.lang.String r4 = defpackage.roc.r(r4)
            zjd r1 = new zjd
            zjc r2 = defpackage.zjc.a
            r1.<init>(r2, r4)
            xhj r3 = r3.g
            java.lang.String r3 = defpackage.roc.s(r3)
            zjd r4 = new zjd
            r4.<init>(r2, r3)
            java.lang.String r3 = "Focus request %s to HU not allowed while in call. Current focus state from MD: %s"
            r0.M(r3, r1, r4)
            return
        Lb7:
            r3.h(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqt.i(int):void");
    }

    @Override // defpackage.qqu
    public final synchronized void j(int i, qpo qpoVar, rek rekVar) {
        qpx qpxVar = this.b;
        qpxVar.g[i] = qpoVar;
        qpxVar.b[i] = rekVar;
        qpxVar.h(1);
        k();
    }
}

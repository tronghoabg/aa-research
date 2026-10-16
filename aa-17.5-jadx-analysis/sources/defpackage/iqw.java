package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.google.android.gms.car.CarInfo;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class iqw implements isx, iqm, iqx, izq, ism, iss {
    public static final yph a = yph.c("CAR.AUDIO.FOCUS");
    private volatile Long A;
    private boolean B;
    private final HandlerThread C;
    private final HandlerThread D;
    private volatile boolean E;
    private final boolean F;
    private Runnable G;
    private long H;
    private final Runnable I;
    public final iqn b;
    public final xyc c;
    public final jew d;
    public final isl e;
    public final isy f;
    public final isb g;
    public xhj h;
    public volatile String i;
    public volatile xhi j;
    public final AtomicBoolean k;
    volatile izt l;
    public iqv m;
    public final Object n;
    public final AudioManager o;
    public volatile Integer p;
    public volatile boolean q;
    public volatile Runnable r;
    public final Set s;
    public int t;
    public int u;
    public int v;
    public long w;
    public int x;
    private final jfg y;
    private final jes z;

    public iqw(Context context, jfg jfgVar, xyc xycVar, jew jewVar, jes jesVar) {
        AudioManager audioManager = (AudioManager) jfj.c(context).getSystemService("audio");
        audioManager.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) jfj.c(context).getSystemService("phone");
        telephonyManager.getClass();
        HandlerThread handlerThread = new HandlerThread("FOCUS_HANDLER", -16);
        HandlerThread handlerThread2 = new HandlerThread("FOCUS_RELEASE");
        isb isbVar = new isb(jfgVar);
        this.A = null;
        this.h = xhj.AUDIO_FOCUS_STATE_INVALID;
        this.j = null;
        this.k = new AtomicBoolean(false);
        this.B = false;
        this.n = new Object();
        this.s = new CopyOnWriteArraySet();
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = -1L;
        this.H = 0L;
        this.x = 0;
        this.I = new imt(this, 7);
        this.C = handlerThread;
        this.D = handlerThread2;
        this.y = jfgVar;
        this.c = xycVar;
        this.d = jewVar;
        this.o = audioManager;
        this.z = jesVar;
        CarInfo carInfoT = jesVar.t();
        abru abruVarB = acnd.a.gu().b();
        yph yphVar = kjf.a;
        Stream streamD = tgx.d(new ilq(17), abruVarB);
        int i = yfq.d;
        boolean zH = kjf.h(carInfoT, (yfq) streamD.collect(ycm.a));
        this.F = zH;
        this.b = new iqn(this, zH);
        this.g = isbVar;
        this.f = new ita(audioManager, telephonyManager, this);
        this.e = new iso(audioManager, this, new isr(this, jfgVar));
    }

    public static boolean n(String str, AudioAttributes audioAttributes) {
        return (audioAttributes.getUsage() == 16 && str != null && kmo.c(acna.c(), str)) || (audioAttributes.getUsage() == 12 && str != null && str.equals(RemoteApiConstants.NOW_PACKAGE));
    }

    private final void q() {
        Looper looper = this.D.getLooper();
        if (looper == null) {
            ((ype) ((ype) a.f()).ai((char) 1190)).u("Already stopped, skip sending focus request to release car audio focus to HU");
            return;
        }
        ((ype) a.l().ai((char) 1189)).u("Send focus request to release car audio focus to HU");
        new sss(looper).post(this.I);
    }

    private final synchronized void r() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 1200)).u("Stop audio focus handler");
        if (!this.B) {
            ((ype) ((ype) yphVar.h()).ai((char) 1204)).u("Car audio focus handler didn't start or already stopped");
            return;
        }
        Integer num = this.p;
        int i = 3;
        if (num != null) {
            ((ype) ((ype) yphVar.f()).ai((char) 1202)).y("Restoring media stream volume to: %d", num);
            try {
                this.o.setStreamVolume(3, num.intValue(), 0);
            } catch (SecurityException e) {
                if (spu.c()) {
                    throw e;
                }
                yph yphVar2 = a;
                ((ype) ((ype) ((ype) yphVar2.h()).p(e)).ai((char) 1203)).u("Could not restore media stream volume. Continuing shutdown.");
                this.y.e(yzz.AUDIO_FOCUS_HANDLER, yzy.yy);
                yphVar = yphVar2;
            }
        }
        if (this.k.getAndSet(false)) {
            ((ype) ((ype) yphVar.f()).ai((char) 1201)).u("Disconnected while waiting for HU to recover from transient loss");
            isb isbVar = this.g;
            yzy yzyVar = yzy.zu;
            woy.ab(isb.a.contains(yzyVar), "Unsupported UiAction: %s", yzyVar.a());
            isbVar.c(yzz.AUDIO_FOCUS_UNSOLICITED_LOSS_TRANSIENT, yzyVar);
        }
        this.p = null;
        this.B = false;
        isl islVar = this.e;
        Handler handler = ((iso) islVar).c;
        if (handler != null) {
            ((iso) islVar).d.c = null;
            handler.post(new ire(islVar, i));
        }
        ((iso) islVar).c = null;
        iqn iqnVar = this.b;
        iql iqlVar = iqnVar.d;
        iqlVar.getClass();
        iqlVar.b();
        iqnVar.i(3);
        iqnVar.i(5);
        iqnVar.i(1);
        iqnVar.j();
        this.s.clear();
        iqv iqvVar = this.m;
        iqvVar.getClass();
        iqvVar.e();
        this.C.quitSafely();
        this.D.quit();
    }

    @Override // defpackage.izq
    public final synchronized void a(izt iztVar) {
        this.l = iztVar;
    }

    @Override // defpackage.izq
    public final synchronized void b() {
        r();
        isy isyVar = this.f;
        ((ita) isyVar).b.listen(((ita) isyVar).e, 0);
        this.l = null;
    }

    @Override // defpackage.izq
    public final void c(xhj xhjVar, boolean z) {
        synchronized (this) {
            if (!this.B) {
                ((ype) ((ype) a.h()).ai(1188)).y("Ignoring focus change from HU while focus handling is not started: %s", new zjd(zjc.a, xhjVar.name()));
                return;
            }
            ype ypeVar = (ype) ((ype) a.f()).ai(1187);
            String strName = xhjVar.name();
            zjc zjcVar = zjc.a;
            ypeVar.M("Received focus change from HU: %s, unsolicited: %s", new zjd(zjcVar, strName), new zjd(zjcVar, Boolean.valueOf(z)));
            if (this.H > 0 && !z) {
                jfg jfgVar = this.y;
                if (jfgVar != null) {
                    xhi xhiVar = this.j;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.H;
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
                        ((jfh) jfgVar).m(abnpVarN2, yxcVar, yls.a);
                    }
                }
                this.H = 0L;
            }
            iqv iqvVar = this.m;
            iqvVar.getClass();
            iqvVar.a();
            iqv iqvVar2 = this.m;
            iqvVar2.getClass();
            iqvVar2.c(xhjVar, z, false);
        }
    }

    @Override // defpackage.izq
    public final synchronized void d() {
        if (a.O()) {
            this.b.e();
        }
    }

    @Override // defpackage.izq
    public final synchronized void e(int i) {
        if (i == 2) {
            final int i2 = 0;
            this.E = false;
            this.A = Long.valueOf(SystemClock.elapsedRealtime());
            if (this.F) {
                this.b.c(new iqj() { // from class: iqu
                    @Override // defpackage.iqj
                    public final void a() {
                        if (i2 != 0) {
                            yph yphVar = iqw.a;
                        } else {
                            yph yphVar2 = iqw.a;
                        }
                    }
                }, Duration.ZERO);
                return;
            }
            synchronized (this.n) {
                final int i3 = 1;
                if (this.x == 1) {
                    this.x = 0;
                    this.b.c(new iqj() { // from class: iqt
                        @Override // defpackage.iqj
                        public final void a() {
                            iqw iqwVar = this.a;
                            iqv iqvVar = iqwVar.m;
                            iqvVar.getClass();
                            iqvVar.post(new ilp(iqwVar, 18));
                        }
                    }, Duration.ofMillis(500L));
                } else {
                    this.b.c(new iqj() { // from class: iqu
                        @Override // defpackage.iqj
                        public final void a() {
                            if (i3 != 0) {
                                yph yphVar = iqw.a;
                            } else {
                                yph yphVar2 = iqw.a;
                            }
                        }
                    }, Duration.ZERO);
                }
            }
        }
    }

    @Override // defpackage.izq
    public final synchronized void f(int i) {
        if (i == 1) {
            this.E = true;
            this.b.d();
            this.A = null;
        }
    }

    @Override // defpackage.iqm
    public final void g(xhj xhjVar) {
        iqv iqvVar = this.m;
        iqvVar.getClass();
        iqvVar.c(xhjVar, false, true);
    }

    public final void h() {
        woy.aa(Looper.myLooper() == this.C.getLooper(), "Expecting focus handler thread");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253  */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.xhj r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.i(xhj, boolean, boolean):void");
    }

    public final void j(String str) {
        if (a.O()) {
            h();
            yph yphVar = a;
            ((ype) yphVar.l().ai(1175)).E("usageAssistantFocusGains: %d. inVoiceSession: %b", this.t, this.E);
            int i = this.t;
            if (i != 1) {
                if (i == 0 && this.E) {
                    ((ype) yphVar.l().ai((char) 1177)).u("Queuing asr stop runnable.");
                    iqv iqvVar = this.m;
                    iqvVar.getClass();
                    iqvVar.postDelayed(this.G, acna.b());
                    return;
                }
                if (this.t < 0) {
                    ((ype) ((ype) yphVar.h()).ai((char) 1176)).u("Usage assistant focus gains are negative. Resetting to 0.");
                    this.t = 0;
                    return;
                }
                return;
            }
            ((ype) yphVar.l().ai((char) 1178)).u("Removing stop ASR callbacks");
            iqv iqvVar2 = this.m;
            iqvVar2.getClass();
            iqvVar2.removeCallbacks(this.G);
            if (this.E) {
                return;
            }
            ((ype) yphVar.l().ai((char) 1179)).y("Starting ASR for package: %s", str);
            if (str != null) {
                jfg jfgVar = this.y;
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.AUDIO_FOCUS_REQUEST_GAIN, yzy.zv);
                rrbVarH.d(new ComponentName(str, ""));
                jfgVar.b(rrbVarH.l());
            }
            p(1);
        }
    }

    @Override // defpackage.ism
    public final void k() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1181)).u("onAllExternalAppsLoseAudioFocus");
        if (this.q) {
            ((ype) ((ype) yphVar.f()).ai((char) 1183)).u("Ignoring Android audio focus loss.");
            return;
        }
        if (a.O()) {
            if (acmd.a.gu().E()) {
                Iterable$EL.forEach(this.s, new nxt(1));
            } else {
                ((ype) yphVar.l().ai((char) 1182)).u("usageAssistantFocusGains: 0");
                this.t = 0;
                j(null);
            }
        }
        q();
    }

    public final void l(xhi xhiVar, int i) {
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(1193);
        String strR = roc.r(xhiVar);
        zjc zjcVar = zjc.a;
        ypeVar.M("Send focus request to HU: %s, attempt#: %s", new zjd(zjcVar, strR), new zjd(zjcVar, Integer.valueOf(i)));
        Object obj = this.l;
        if (obj == null) {
            return;
        }
        this.u++;
        this.H = SystemClock.elapsedRealtime();
        this.j = xhiVar;
        iqv iqvVar = this.m;
        iqvVar.getClass();
        iqvVar.b(xhiVar, i);
        izu.b.f().ai(1702).y("sent audio focus request: %s", xhiVar.name());
        abnp abnpVarN = xhh.a.n();
        abnpVarN.t();
        xhh xhhVar = (xhh) abnpVarN.b;
        xhhVar.c = xhiVar.e;
        xhhVar.b |= 1;
        ((jbj) obj).k(18, (xhh) abnpVarN.q());
        if (i == 1) {
            irz irzVarA = isa.a();
            irzVarA.a = this.j;
            if (xhiVar != xhi.AUDIO_FOCUS_GAIN && this.k.getAndSet(false)) {
                ((ype) ((ype) yphVar.f()).ai((char) 1194)).u("Reset pending recovery from transient loss due to unexpected focus request");
                irzVarA.d = 4;
            }
            this.g.a(irzVarA.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.m(int):void");
    }

    @Override // defpackage.iqx
    public final synchronized void o(int i, iqc iqcVar, iqa iqaVar) {
        iqn iqnVar = this.b;
        iqnVar.f[i] = iqcVar;
        iqnVar.g[i] = iqaVar;
        boolean z = true;
        iqnVar.l(1);
        if (this.B) {
            return;
        }
        this.B = true;
        this.D.start();
        HandlerThread handlerThread = this.C;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        iqnVar.d = new iql(iqnVar, looper);
        byte[] bArr = null;
        this.G = new imt(this, 5, bArr);
        this.m = new iqv(this, looper);
        isl islVar = this.e;
        ((ype) iso.a.l().ai((char) 1306)).u("Start Android audio focus manager");
        sss sssVar = new sss(looper, (byte[]) null);
        ((iso) islVar).c = sssVar;
        sssVar.post(new imt(islVar, 11, bArr));
        this.r = new imt(this, 6, bArr);
        isy isyVar = this.f;
        ((ita) isyVar).b.listen(((ita) isyVar).e, 32);
        if (((ita) isyVar).c() == 0) {
            z = false;
        }
        ((ita) isyVar).d = z;
    }

    public final synchronized void p(int i) {
        if (this.l != null) {
            this.l.f(i);
        }
    }
}

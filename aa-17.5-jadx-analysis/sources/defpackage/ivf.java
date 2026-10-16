package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ivf implements iva, ivm {
    public static final yph a = yph.c("CAR.VIDEO");
    public final jbq A;
    public final boolean B;
    public final ivn C;
    public final wba D;
    private final iux E;
    private final iuy F;
    private final irx G;
    private final xov H;
    private final jev I;
    private final jgi J;
    private final int K;
    public final ive b;
    public volatile iuw c;
    public final iuv d;
    public final jen e;
    public jem f;
    public volatile iwq g;
    public volatile ivg h;
    public final yfq i;
    public int j;
    public final imf k;
    public xop l;
    public final xkj m;
    public final xjc n;
    public final int o;
    public final ikz p;
    public final jew q;
    public final Context r;
    public final AtomicBoolean s;
    public int t;
    public boolean u;
    public Surface v;
    public final Semaphore w;
    public final boolean x;
    public final jcp y;
    public final jfg z;

    /* JADX WARN: Multi-variable type inference failed */
    public ivf(iuv iuvVar, jes jesVar, jev jevVar, ikz ikzVar, jew jewVar, Context context, iux iuxVar, wba wbaVar, jen jenVar, List list, xkj xkjVar, xjc xjcVar, int i, Handler handler, jfg jfgVar, jcp jcpVar, boolean z, irx irxVar, int i2, boolean z2, imf imfVar, jgi jgiVar) {
        iuz iuzVar = new iuz(xkjVar, jewVar, jesVar, ikzVar);
        jbq jbqVar = new jbq(jesVar.t().e, jesVar.t().f);
        this.j = -1;
        this.s = new AtomicBoolean(false);
        this.t = 2;
        this.w = new Semaphore(0);
        woy.O(!list.isEmpty(), "Video configurations must not be empty");
        this.d = iuvVar;
        this.I = jevVar;
        this.p = ikzVar;
        this.q = jewVar;
        this.r = context;
        this.D = wbaVar;
        this.e = jenVar;
        yfq yfqVarO = yfq.o(list);
        this.i = yfqVarO;
        this.m = xkjVar;
        this.b = new ive(this, handler.getLooper());
        this.n = xjcVar;
        this.o = i;
        this.E = iuxVar;
        this.K = i2;
        xop xopVar = ((xpd) yfqVarO.get(0)).l;
        xov xovVarB = xov.b((xopVar == null ? xop.b : xopVar).g);
        this.H = xovVarB == null ? xov.UI_THEME_AUTOMATIC : xovVarB;
        this.F = iuzVar;
        this.z = jfgVar;
        this.y = jcpVar;
        this.A = jbqVar;
        this.B = z;
        this.G = irxVar;
        this.x = z2;
        this.k = imfVar;
        this.J = jgiVar;
        ivn ivnVar = new ivn(this);
        this.C = ivnVar;
        ivnVar.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011b A[PHI: r19 r20
  0x011b: PHI (r19v4 int) = (r19v0 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int) binds: [B:74:0x0113, B:210:0x011b, B:57:0x00da, B:59:0x00e2, B:49:0x00bf, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r20v5 float) = (r20v0 float), (r20v6 float), (r20v6 float), (r20v6 float), (r20v7 float), (r20v7 float) binds: [B:74:0x0113, B:210:0x011b, B:57:0x00da, B:59:0x00e2, B:49:0x00bf, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivf.A():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int r14) throws defpackage.ijw {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivf.B(int):boolean");
    }

    @Override // defpackage.iva
    public final iuw a() {
        return this.c;
    }

    @Override // defpackage.iyw
    public final /* bridge */ /* synthetic */ jbj b(jbn jbnVar) {
        jgi jgiVar = this.J;
        jgiVar.getClass();
        xxm xxmVar = new xxm(new imt(jgiVar, 13, null));
        jas jasVar = new jas();
        jen jenVar = this.e;
        return new jem(this, jbnVar, jenVar, jasVar, this.n, this.m, new jdm(jenVar), this.G, xxmVar, this.x);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.iva
    public final jem e() {
        return this.f;
    }

    @Override // defpackage.iva
    public final xkj f() {
        return this.m;
    }

    @Override // defpackage.iva
    public final xov g() {
        return this.H;
    }

    @Override // defpackage.iva
    public final yfq h() {
        return this.i;
    }

    @Override // defpackage.iva
    public final void i() {
        ((ype) a.l().ai((char) 1393)).u("Enabling projection");
        ive iveVar = this.b;
        iveVar.sendMessage(iveVar.obtainMessage(3));
    }

    @Override // defpackage.iva
    public final void j(ivg ivgVar) {
        this.h = ivgVar;
    }

    @Override // defpackage.iva
    public final void k() {
        jem jemVar = this.f;
        if (jemVar != null) {
            jemVar.H();
        }
    }

    @Override // defpackage.iva
    public final synchronized void l(xhc xhcVar) {
        xop xopVar = this.l;
        if (xopVar == null) {
            ((ype) ((ype) a.h()).ai((char) 1404)).u("uiConfig is null");
            return;
        }
        if (!((ygr) Collection.EL.stream(xopVar.i).map(new ijt(11)).collect(ycm.b)).contains(xhcVar)) {
            ((ype) ((ype) a.h()).ai((char) 1403)).y("Ignoring outdated request to send ActionTakenNotification with actionType: %s", xhcVar.name());
            return;
        }
        ((ype) a.l().ai((char) 1402)).y("Sending ActionTakenNotification with actionType: %s", xhcVar.name());
        jem jemVar = this.f;
        jemVar.getClass();
        jem.a.l().ai(1964).y("sendActionTakenNotification(actionType=%s)", xhcVar.name());
        abnp abnpVarN = xhb.a.n();
        abnpVarN.t();
        xhb xhbVar = (xhb) abnpVarN.b;
        xhbVar.c = xhcVar.d;
        xhbVar.b |= 1;
        jemVar.k(32780, abnpVarN.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        printWriter.println(this.c);
        printWriter.print("Video encoder: ");
        if (this.g != null) {
            printWriter.println(this.g);
        }
        xop xopVar = this.l;
        if (xopVar != null) {
            printWriter.print("UiConfig: ");
            printWriter.println(xopVar);
        } else {
            printWriter.println("No UiConfig");
        }
        printWriter.println("Video Configs");
        yfq yfqVar = this.i;
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            xpd xpdVar = (xpd) yfqVar.get(i);
            if (xpdVar != null) {
                String[][] strArr = iux.a;
                xpc xpcVarB = xpc.b(xpdVar.c);
                if (xpcVarB == null) {
                    xpcVarB = xpc.VIDEO_800x480;
                }
                Size sizeD = iux.d(xpcVarB);
                int width = sizeD.getWidth();
                int height = sizeD.getHeight();
                int iA = iux.a(xpdVar);
                Rect rectB = iux.b(xpdVar);
                int iWidth = rectB.width();
                int iHeight = rectB.height();
                int I = dlz.I((xpdVar.b & 16) != 0 ? Integer.valueOf(xpdVar.g) : null);
                printWriter.println("codecW:" + width + " codecH:" + height + " dispW:" + iWidth + " dispH:" + iHeight + " bounds: " + rectB.toString() + " dpi:" + I + " fps:" + iA + " pixelAspectRatio: " + ((xpdVar.b & 128) != 0 ? xpdVar.i : 1.0f));
                boolean z = this.u;
                int i2 = this.t;
                StringBuilder sb = new StringBuilder("disp enabled:");
                sb.append(z);
                sb.append(" disp state:");
                sb.append(i2);
                printWriter.println(sb.toString());
            } else {
                printWriter.println("null config");
            }
        }
        if (a.O()) {
            Collection.EL.stream(((jco) this.y).c).forEach(new iju(printWriter, 10));
        }
        this.e.a(printWriter);
    }

    @Override // defpackage.iva
    public final void n(boolean z) {
        xix xixVar = z ? xix.CRITICAL_UI_FOCUS_PROJECTED : xix.CRITICAL_UI_FOCUS_NATIVE;
        ((ype) a.l().ai((char) 1405)).y("Sending critical ui notification with mode %s", xixVar);
        jem jemVar = this.f;
        jemVar.getClass();
        abnp abnpVarN = xiy.a.n();
        abnpVarN.t();
        xiy xiyVar = (xiy) abnpVarN.b;
        xiyVar.c = xixVar.d;
        xiyVar.b |= 1;
        jemVar.k(32789, (xiy) abnpVarN.q());
    }

    @Override // defpackage.iva
    public final void o(List list) {
        jem jemVar = this.f;
        jemVar.getClass();
        Stream map = Collection.EL.stream(list).map(new gjm(this, 6)).map(new ijt(10));
        int i = yfq.d;
        List list2 = (List) map.collect(ycm.a);
        jem.a.f().ai(1965).y("sendIntegratedOverlayParametersNotification(overlayParametersOptions=%s)", list2);
        abnp abnpVarN = xjz.a.n();
        abnpVarN.t();
        xjz xjzVar = (xjz) abnpVarN.b;
        aboh abohVar = xjzVar.b;
        if (!abohVar.c()) {
            xjzVar.b = abnv.I(abohVar);
        }
        abmc.i(list2, xjzVar.b);
        jemVar.k(32781, abnpVarN.q());
    }

    @Override // defpackage.iva
    public final void p(xox xoxVar) {
        jem jemVar = this.f;
        jemVar.getClass();
        jem.a.l().ai(1966).y("sendUiConfigRequest(request=%s)", xoxVar);
        jemVar.k(32785, xoxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyw
    public final void q() {
        int i = 0;
        this.s.set(false);
        ivn ivnVar = this.C;
        synchronized (ivnVar.b) {
            ivnVar.c.add(ivl.d);
        }
        try {
            ivnVar.join(3500L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ype) ((ype) ((ype) ivn.a.h()).p(e)).ai((char) 1417)).u("Interrupted while waiting for video focus handler to stop.");
        }
        if (ivnVar.isAlive()) {
            ((ype) ((ype) ivn.a.h()).ai((char) 1416)).u("Video focus handler still alive!");
            this.I.aH(jeu.c);
        }
        if (!a.O()) {
            return;
        }
        jfg jfgVar = this.z;
        jcp jcpVar = this.y;
        abnp abnpVarN = ywu.a.n();
        while (true) {
            jco jcoVar = (jco) jcpVar;
            yfq yfqVar = jcoVar.c;
            if (i >= ((yls) yfqVar).c) {
                int i2 = jcoVar.f.d;
                abnpVarN.t();
                ywu ywuVar = (ywu) abnpVarN.b;
                ywuVar.b |= 1;
                ywuVar.d = i2;
                ywu ywuVar2 = (ywu) abnpVarN.q();
                abnp abnpVarN2 = yxb.a.n();
                abnpVarN2.t();
                yxb yxbVar = (yxb) abnpVarN2.b;
                ywuVar2.getClass();
                yxbVar.ah = ywuVar2;
                yxbVar.d |= 128;
                ((jfh) jfgVar).m(abnpVarN2, yxc.BUFFER_POOL_EVENT, yls.a);
                return;
            }
            ywt ywtVarA = ((jcl) yfqVar.get(i)).a();
            abnpVarN.t();
            ywu ywuVar3 = (ywu) abnpVarN.b;
            ywtVarA.getClass();
            aboh abohVar = ywuVar3.c;
            if (!abohVar.c()) {
                ywuVar3.c = abnv.I(abohVar);
            }
            ywuVar3.c.add(ywtVarA);
            i++;
        }
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.f = (jem) jbjVar;
    }

    @Override // defpackage.iva
    public final void s(ScheduledExecutorService scheduledExecutorService) {
        this.e.x(scheduledExecutorService);
    }

    @Override // defpackage.iva
    public final void t() {
        this.e.r();
    }

    @Override // defpackage.iva
    public final void u(int i) {
        ((ype) a.l().ai((char) 1410)).w("updateFrameRate: %d", i);
        if (this.g != null) {
            iwq iwqVar = this.g;
            iwqVar.s();
            if (iwqVar.o == i) {
                ((ype) iwq.a.l().ai(1488)).K("%s codec already has the frame rate: %d", iwqVar.q(), i);
                return;
            }
            iwqVar.o = i;
            int iX = iwqVar.x();
            ((ype) iwq.a.l().ai(1487)).T("Due to frame rate change, updating %s codec with bitrate: %d based on width: %d, height: %d, fps: %d", iwqVar.q(), Integer.valueOf(iX), Integer.valueOf(iwqVar.r), Integer.valueOf(iwqVar.s), Integer.valueOf(iwqVar.o));
            iwqVar.A(iX);
        }
    }

    @Override // defpackage.iva
    public final void v(int i) {
        imf imfVar = this.k;
        imfVar.e(i);
        if (this.s.get()) {
            ive iveVar = this.b;
            iveVar.sendMessage(iveVar.obtainMessage(11, imfVar.d()));
        }
    }

    @Override // defpackage.iva
    public final int w() {
        return this.K;
    }

    @Override // defpackage.ivm
    public final void x(boolean z, boolean z2) {
        ((ype) a.l().ai((char) 1392)).u("doHandleVideoFocusLoss");
        if (z) {
            ive iveVar = this.b;
            iveVar.sendMessage(iveVar.obtainMessage(2, z2 ? 1 : 0, 0));
            try {
                if (!this.w.tryAcquire(15000L, TimeUnit.MILLISECONDS)) {
                    this.I.ax(yze.TIMEOUT, yzf.DISPLAY_REMOVAL_TIMEOUT, "handling display removal timed-out");
                }
            } catch (InterruptedException unused) {
            }
        }
        if (this.g != null) {
            this.g.t();
            if (this.g.f) {
                this.I.aH(jeu.d);
            }
            this.g = null;
        }
        jem jemVar = this.f;
        jemVar.getClass();
        jemVar.y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0.equals(r4) == false) goto L19;
     */
    @Override // defpackage.jel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void y(defpackage.xow r14) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivf.y(xow):void");
    }

    @Override // defpackage.jel
    public final void z(boolean z) {
        this.s.set(false);
        ((ype) ((ype) a.f()).ai((char) 1399)).y("Video focus lost. transient=%b", Boolean.valueOf(z));
        ivl ivlVar = z ? ivl.c : ivl.b;
        ivn ivnVar = this.C;
        synchronized (ivnVar.b) {
            ivnVar.c.add(ivlVar);
        }
    }
}

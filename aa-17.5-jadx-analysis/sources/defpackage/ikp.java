package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ikp extends qya implements jbs, jbo {
    public static final yph a = yph.c("CAR.RADIO");
    public static final Duration b = Duration.ofMillis(300);
    private static final Duration u = Duration.ofMillis(250);
    private final ScheduledExecutorService A;
    private ScheduledFuture B;
    public volatile boolean c;
    public final List d;
    public final Object e;
    public final Executor f;
    public long g;
    public xmw h;
    public Boolean i;
    public RadioProgramInfo j;
    public List k;
    public List l;
    public Boolean m;
    public final xya n;
    public final xya o;
    public iko p;
    public zgp q;
    public boolean r;
    public xmw s;
    public xmv t;
    private jbt v;
    private final jer w;
    private final Context x;
    private final AtomicLong y;
    private RadioConfiguration z;

    public ikp(jer jerVar, Context context) {
        zgt zgtVarAJ = yrm.aJ(Executors.unconfigurableScheduledExecutorService(new tdy()));
        zgtVarAJ.getClass();
        xyi xyiVar = xvx.a;
        this.d = new ArrayList();
        this.e = new Object();
        this.y = new AtomicLong(0L);
        this.g = 0L;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.z = null;
        this.B = null;
        this.p = iko.a;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.w = jerVar;
        this.x = context;
        this.f = context.getMainExecutor();
        this.A = zgtVarAJ;
        this.n = new xya(xyiVar);
        this.o = new xya(xyiVar);
    }

    public static final abnp A(RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier) {
        xmu xmuVar;
        try {
            xmuVar = (xmu) new ntn(xmu.b(radioProgramIdentifier.a)).i(xmu.IDENTIFIER_TYPE_INVALID);
        } catch (IllegalArgumentException unused) {
            xmuVar = xmu.IDENTIFIER_TYPE_INVALID;
        }
        abnp abnpVarN = xmv.a.n();
        abnpVarN.t();
        xmv xmvVar = (xmv) abnpVarN.b;
        xmvVar.c = xmuVar.k;
        xmvVar.b |= 1;
        long j = radioProgramIdentifier.b;
        abnpVarN.t();
        xmv xmvVar2 = (xmv) abnpVarN.b;
        xmvVar2.b |= 2;
        xmvVar2.d = j;
        return abnpVarN;
    }

    public static final void B(RadioProgramInfo radioProgramInfo) {
        RadioMetadata radioMetadata;
        if (radioProgramInfo == null || (radioMetadata = radioProgramInfo.b) == null) {
            return;
        }
        E(radioMetadata.i);
        RadioMetadata.RadioSongMetadata radioSongMetadata = radioMetadata.f;
        if (radioSongMetadata != null) {
            E(radioSongMetadata.g);
        }
    }

    public static final void C(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            B((RadioProgramInfo) it.next());
        }
    }

    private final void D() throws IllegalStateException {
        this.w.b();
        if (!this.c) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    private static final void E(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 31 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static final Bitmap y(Bitmap bitmap) {
        return (bitmap == null || Build.VERSION.SDK_INT < 31) ? bitmap : bitmap.asShared();
    }

    public static final RadioProgramSelector.RadioProgramIdentifier z(xmv xmvVar) {
        xmu xmuVarB = xmu.b(xmvVar.c);
        if (xmuVarB == null) {
            xmuVarB = xmu.IDENTIFIER_TYPE_INVALID;
        }
        return new RadioProgramSelector.RadioProgramIdentifier(xmuVarB.k, xmvVar.d);
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 64) == 0) {
            return null;
        }
        xnb xnbVar = xnzVar.i;
        if (xnbVar == null) {
            xnbVar = xnb.a;
        }
        if ((xnbVar.b & 1) != 0) {
            xnb xnbVar2 = xnzVar.i;
            if (xnbVar2 == null) {
                xnbVar2 = xnb.a;
            }
            xmn xmnVar = xnbVar2.c;
            if (xmnVar == null) {
                xmnVar = xmn.a;
            }
            Stream map = Collection.EL.stream(xmnVar.b).map(new ijt(6));
            int i = yfq.d;
            this.z = new RadioConfiguration((List) map.collect(ycm.a));
        }
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jbt(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.qyb
    public final RadioConfiguration f() {
        return this.z;
    }

    public final xmw g() {
        xmw xmwVar = this.s;
        xmv xmvVar = null;
        if (xmwVar == null) {
            xmwVar = null;
        } else {
            this.s = null;
            xya xyaVar = this.o;
            xyaVar.d();
            xyaVar.e();
            this.r = false;
            xmz xmzVar = xmwVar.c;
            if (xmzVar == null) {
                xmzVar = xmz.a;
            }
            if ((xmzVar.b & 1) != 0) {
                xmz xmzVar2 = xmwVar.c;
                if (xmzVar2 == null) {
                    xmzVar2 = xmz.a;
                }
                xmvVar = xmzVar2.c;
                if (xmvVar == null) {
                    xmvVar = xmv.a;
                }
            }
            this.t = xmvVar;
        }
        if (xmwVar != null) {
            this.p = iko.b;
        }
        return xmwVar;
    }

    public final xmw h() {
        if (this.s == null || this.p.equals(iko.b)) {
            return null;
        }
        zgp zgpVar = this.q;
        if (zgpVar != null && !zgpVar.isDone()) {
            return null;
        }
        xya xyaVar = this.o;
        Duration durationC = xyaVar.a ? xyaVar.c() : u;
        if (!this.r) {
            Duration duration = u;
            if (durationC.compareTo(duration) < 0) {
                ScheduledFuture scheduledFuture = this.B;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    return null;
                }
                this.B = this.A.schedule(new gnu(this, 17), duration.minus(durationC).toMillis(), TimeUnit.MILLISECONDS);
                return null;
            }
        }
        k();
        this.r = false;
        return g();
    }

    public final yfq i() {
        List list = this.d;
        synchronized (list) {
            if (!list.isEmpty()) {
                return yfq.o(list);
            }
            ((ype) a.l().ai(189)).u("no radio callbacks registered");
            int i = yfq.d;
            return yls.a;
        }
    }

    public final zgp j(xmw xmwVar) {
        byte[] bArrD;
        final zgj zgjVarV;
        zgp zgpVarW;
        final zgp zgpVarY;
        xmz xmzVar = xmwVar.c;
        if (xmzVar == null) {
            xmzVar = xmz.a;
        }
        xmv xmvVar = xmzVar.c;
        if (xmvVar == null) {
            xmvVar = xmv.a;
        }
        rjg rjgVar = new rjg(z(xmvVar));
        xmz xmzVar2 = xmwVar.c;
        if (xmzVar2 == null) {
            xmzVar2 = xmz.a;
        }
        Iterable$EL.forEach(xmzVar2.d, new iju(rjgVar, 6));
        udp udpVar = new udp(rjgVar.a());
        int i = 2;
        if ((xmwVar.b & 2) == 0) {
            return wub.Y(udpVar.a());
        }
        xmr xmrVar = xmwVar.d;
        if (xmrVar == null) {
            xmrVar = xmr.a;
        }
        rbh rbhVar = new rbh();
        int i2 = xmrVar.b;
        if ((i2 & 1) != 0) {
            rbhVar.a = xmrVar.c;
        }
        if ((i2 & 2) != 0) {
            rbhVar.b = xmrVar.d;
        }
        if ((i2 & 4) != 0) {
            rbhVar.c = xmrVar.e;
        }
        int i3 = 1;
        if ((i2 & 8) != 0) {
            xna xnaVar = xmrVar.f;
            if (xnaVar == null) {
                xnaVar = xna.a;
            }
            int iZ = wpq.z(xnaVar.b);
            if (iZ == 0) {
                iZ = 1;
            }
            rbhVar.d = new RadioMetadata.RadioProgramType(iZ, xnaVar.c);
        }
        int i4 = xmrVar.b;
        if ((i4 & 128) != 0) {
            rbhVar.g = xmrVar.j;
        }
        if ((i4 & 2048) != 0) {
            rbhVar.k = xmrVar.n;
        }
        if ((i4 & 64) != 0) {
            rbhVar.f = xmrVar.i;
        }
        int i5 = xmrVar.k;
        if (i5 > 0) {
            rbhVar.m = i5;
        }
        if ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            rbhVar.i = xmrVar.l;
        }
        if ((i4 & 1024) != 0) {
            rbhVar.j = xmrVar.m;
        }
        if ((i4 & 4096) != 0) {
            rbhVar.l = xmrVar.o;
        }
        xmq xmqVar = xmrVar.g;
        if (xmqVar == null) {
            xmqVar = xmq.a;
        }
        if ((xmqVar.b & 1) != 0) {
            xmq xmqVar2 = xmrVar.g;
            if (xmqVar2 == null) {
                xmqVar2 = xmq.a;
            }
            bArrD = xmqVar2.c.D();
        } else {
            bArrD = null;
        }
        int i6 = 0;
        if (bArrD == null || bArrD.length <= 0) {
            zgjVarV = zgj.v(wub.Y(rbhVar));
        } else {
            zgj zgjVarV2 = zgj.v(hdq.e((hsq) hrt.c(this.x).b().j(bArrD).M(new ifj(Integer.valueOf(Arrays.hashCode(bArrD))))));
            ikk ikkVar = new ikk(rbhVar, i6);
            zfq zfqVar = zfq.a;
            zgjVarV = zgjVarV2.w(ikkVar, zfqVar).u(hwt.class, new ikk(rbhVar, i), zfqVar);
        }
        if ((xmrVar.b & 32) != 0) {
            xne xneVar = xmrVar.h;
            if (xneVar == null) {
                xneVar = xne.a;
            }
            rbi rbiVar = new rbi();
            int i7 = xneVar.b;
            if ((i7 & 1) != 0) {
                rbiVar.a = xneVar.c;
            }
            if ((i7 & 2) != 0) {
                rbiVar.b = xneVar.d;
            }
            if ((i7 & 4) != 0) {
                rbiVar.c = xneVar.e;
            }
            if ((i7 & 8) != 0) {
                rbiVar.d = xneVar.f;
            }
            if ((i7 & 32) != 0) {
                rbiVar.e = xneVar.h;
            }
            xmq xmqVar3 = xneVar.g;
            if (((xmqVar3 == null ? xmq.a : xmqVar3).b & 1) != 0) {
                if (xmqVar3 == null) {
                    xmqVar3 = xmq.a;
                }
                byte[] bArrD2 = xmqVar3.c.D();
                zgj zgjVarV3 = zgj.v(hdq.e((hsq) hrt.c(this.x).b().j(bArrD2).M(new ifj(Integer.valueOf(Arrays.hashCode(bArrD2))))));
                ikk ikkVar2 = new ikk(rbiVar, 3);
                zfq zfqVar2 = zfq.a;
                zgpVarY = zgjVarV3.w(ikkVar2, zfqVar2).u(hwt.class, new ikk(rbiVar, 4), zfqVar2).w(new ikj(i3), zfqVar2);
            } else {
                zgpVarY = wub.Y(rbiVar.a());
            }
            zgpVarW = wub.T(zgpVarY, zgjVarV).a(new Callable() { // from class: ikl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    yph yphVar = ikp.a;
                    rbh rbhVar2 = (rbh) wub.af(zgjVarV);
                    rbhVar2.e = (RadioMetadata.RadioSongMetadata) wub.af(zgpVarY);
                    return rbhVar2.a();
                }
            }, zfq.a);
        } else {
            zgpVarW = zgjVarV.w(new ikj(i), zfq.a);
        }
        zgj zgjVarV4 = zgj.v(zgpVarW);
        ikk ikkVar3 = new ikk(udpVar, i3);
        zfq zfqVar3 = zfq.a;
        return zgjVarV4.w(ikkVar3, zfqVar3).w(new ikj(i6), zfqVar3);
    }

    public final void k() {
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.B = null;
        }
    }

    public final void l(xmw xmwVar) {
        long jIncrementAndGet = this.y.incrementAndGet();
        try {
            zgp zgpVarJ = j(xmwVar);
            synchronized (this.e) {
                this.q = zgpVarJ;
                if (zgpVarJ.isDone()) {
                    this.p = iko.a;
                }
            }
            wub.ah(zgpVarJ, new ikm(this, zgpVarJ, jIncrementAndGet), this.f);
        } catch (Throwable th) {
            synchronized (this.e) {
                this.p = iko.a;
                xmw xmwVarH = h();
                if (xmwVarH != null) {
                    l(xmwVarH);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.qyb
    public final void n(boolean z) throws IllegalStateException, RemoteException {
        if (acrz.s()) {
            D();
            jbt jbtVar = this.v;
            abnp abnpVarN = xms.a.n();
            abnpVarN.t();
            xms xmsVar = (xms) abnpVarN.b;
            xmsVar.b |= 1;
            xmsVar.c = z;
            jbtVar.k(32796, (xms) abnpVarN.q());
        }
    }

    @Override // defpackage.qyb
    public final void o(String str) throws IllegalStateException, RemoteException {
        D();
        jbt jbtVar = this.v;
        abnp abnpVarN = xmo.a.n();
        abnpVarN.t();
        xmo xmoVar = (xmo) abnpVarN.b;
        str.getClass();
        xmoVar.b |= 1;
        xmoVar.c = str;
        jbtVar.k(32803, (xmo) abnpVarN.q());
    }

    public final void p(zgp zgpVar) {
        xmw xmwVarH;
        synchronized (this.e) {
            zgp zgpVar2 = this.q;
            if (zgpVar2 == zgpVar || (zgpVar2 != null && zgpVar2.isDone())) {
                this.q = null;
                this.p = iko.a;
            }
            xmwVarH = h();
        }
        if (xmwVarH != null) {
            l(xmwVarH);
        }
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.v = (jbt) jbjVar;
        this.c = true;
    }

    @Override // defpackage.qyb
    public final void s(qye qyeVar) {
        List list = this.d;
        synchronized (list) {
            ikf ikfVar = new ikf(this, qyeVar, 2);
            try {
                qyeVar.asBinder().linkToDeath(ikfVar, 0);
                list.add(ikfVar);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(196)).u("RemoteException setting death recipient for radio callback");
            }
        }
        t(qyeVar);
    }

    @Override // defpackage.qyb
    public final void t(qye qyeVar) {
        Boolean bool;
        if (acrz.s()) {
            try {
                synchronized (this.e) {
                    Boolean bool2 = this.i;
                    if (bool2 != null) {
                        qyeVar.f(bool2.booleanValue());
                    }
                    RadioProgramInfo radioProgramInfo = this.j;
                    if (radioProgramInfo != null && (bool = this.i) != null && this.m != null) {
                        qyeVar.g(radioProgramInfo, bool.booleanValue(), this.m.booleanValue());
                    }
                    List list = this.k;
                    if (list != null) {
                        qyeVar.h(list);
                    }
                    List list2 = this.l;
                    if (list2 != null) {
                        qyeVar.e(list2);
                    }
                }
            } catch (RemoteException unused) {
                x(qyeVar);
            }
        }
    }

    @Override // defpackage.qyb
    public final void u(boolean z) throws IllegalStateException, RemoteException {
        if (acrz.s()) {
            D();
            jbt jbtVar = this.v;
            abnp abnpVarN = xnc.a.n();
            abnpVarN.t();
            xnc xncVar = (xnc) abnpVarN.b;
            xncVar.b |= 1;
            xncVar.c = z;
            jbtVar.k(32801, (xnc) abnpVarN.q());
        }
    }

    @Override // defpackage.qyb
    public final void v(int i) throws IllegalStateException, RemoteException {
        if (acrz.s()) {
            D();
            jbt jbtVar = this.v;
            int iZ = wpq.z(i);
            abnp abnpVarN = xnd.a.n();
            abnpVarN.t();
            xnd xndVar = (xnd) abnpVarN.b;
            if (iZ == 0) {
                throw null;
            }
            xndVar.c = iZ;
            xndVar.b |= 1;
            jbtVar.k(32802, (xnd) abnpVarN.q());
        }
    }

    @Override // defpackage.qyb
    public final void w(RadioProgramSelector radioProgramSelector) throws IllegalStateException, RemoteException {
        if (acrz.s()) {
            D();
            jbt jbtVar = this.v;
            abnp abnpVarN = xmz.a.n();
            abnp abnpVarA = A(radioProgramSelector.a);
            abnpVarN.t();
            xmz xmzVar = (xmz) abnpVarN.b;
            xmv xmvVar = (xmv) abnpVarA.q();
            xmvVar.getClass();
            xmzVar.c = xmvVar;
            xmzVar.b |= 1;
            Iterable$EL.forEach(radioProgramSelector.b, new iju(abnpVarN, 7));
            xmz xmzVar2 = (xmz) abnpVarN.q();
            abnp abnpVarN2 = xnf.a.n();
            abnpVarN2.t();
            xnf xnfVar = (xnf) abnpVarN2.b;
            xmzVar2.getClass();
            xnfVar.c = xmzVar2;
            xnfVar.b |= 1;
            jbtVar.k(32798, (xnf) abnpVarN2.q());
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qye] */
    @Override // defpackage.qyb
    public final void x(qye qyeVar) {
        List list = this.d;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ikf ikfVar = (ikf) it.next();
                ?? r2 = ikfVar.a;
                if (r2.asBinder().equals(qyeVar.asBinder())) {
                    r2.asBinder().unlinkToDeath(ikfVar, 0);
                    it.remove();
                }
            }
        }
    }
}

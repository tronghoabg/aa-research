package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.handwriting.gui.UIHandler;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class aebe implements adss, aeam, aebp, aduz {
    private static final Map J;
    public static final Logger a;
    static final boolean b;
    public final Deque A;
    public final aebt B;
    public adva C;
    public final Runnable D;
    public final int E;
    public final aeac F;
    public final Map G;
    final adke H;
    int I;
    private final adkn K;
    private int L;
    private final adyq M;
    private final ScheduledExecutorService N;
    private final int O;
    private boolean P;
    private boolean Q;
    private final aduj R;
    public Socket c;
    public SSLSession d;
    public final InetSocketAddress e;
    public final String f;
    public final String g;
    public final Random h = new Random();
    public final int i;
    public adwh j;
    public aean k;
    public aebq l;
    public final Object m;
    public final Map n;
    public final Executor o;
    public int p;
    public aebc q;
    public adis r;
    public adnq s;
    public adui t;
    public boolean u;
    public final SocketFactory v;
    public SSLSocketFactory w;
    public HostnameVerifier x;
    public Socket y;
    public int z;

    static {
        EnumMap enumMap = new EnumMap(aece.class);
        enumMap.put((EnumMap) aece.NO_ERROR, (aece) adnq.l.e("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) aece.PROTOCOL_ERROR, (aece) adnq.l.e("Protocol error"));
        enumMap.put((EnumMap) aece.INTERNAL_ERROR, (aece) adnq.l.e("Internal error"));
        enumMap.put((EnumMap) aece.FLOW_CONTROL_ERROR, (aece) adnq.l.e("Flow control error"));
        enumMap.put((EnumMap) aece.STREAM_CLOSED, (aece) adnq.l.e("Stream closed"));
        enumMap.put((EnumMap) aece.FRAME_TOO_LARGE, (aece) adnq.l.e("Frame too large"));
        enumMap.put((EnumMap) aece.REFUSED_STREAM, (aece) adnq.m.e("Refused stream"));
        enumMap.put((EnumMap) aece.CANCEL, (aece) adnq.c.e("Cancelled"));
        enumMap.put((EnumMap) aece.COMPRESSION_ERROR, (aece) adnq.l.e("Compression error"));
        enumMap.put((EnumMap) aece.CONNECT_ERROR, (aece) adnq.l.e("Connect error"));
        enumMap.put((EnumMap) aece.ENHANCE_YOUR_CALM, (aece) adnq.i.e("Enhance your calm"));
        enumMap.put((EnumMap) aece.INADEQUATE_SECURITY, (aece) adnq.g.e("Inadequate security"));
        J = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(aebe.class.getName());
        Charset charset = adue.a;
        b = adjw.a("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public aebe(aeat aeatVar, InetSocketAddress inetSocketAddress, String str, adis adisVar, xyc xycVar, adke adkeVar, Runnable runnable) {
        Object obj = new Object();
        this.m = obj;
        this.n = new HashMap();
        this.z = 0;
        this.A = new LinkedList();
        this.G = new aebd();
        this.R = new aeaz(this);
        this.I = 30000;
        inetSocketAddress.getClass();
        this.e = inetSocketAddress;
        this.f = str;
        this.O = 4194304;
        this.i = 65535;
        Executor executor = aeatVar.a;
        executor.getClass();
        this.o = executor;
        this.M = new adyq(aeatVar.a);
        ScheduledExecutorService scheduledExecutorService = aeatVar.b;
        scheduledExecutorService.getClass();
        this.N = scheduledExecutorService;
        this.L = 3;
        this.v = SocketFactory.getDefault();
        this.w = aeatVar.c;
        this.x = aebv.a;
        aebt aebtVar = aeatVar.d;
        aebtVar.getClass();
        this.B = aebtVar;
        xycVar.getClass();
        this.g = adue.j("okhttp");
        this.H = adkeVar;
        this.D = runnable;
        this.E = Alert.DURATION_SHOW_INDEFINITELY;
        this.F = aeatVar.e.ac();
        this.K = adkn.a(getClass(), inetSocketAddress.toString());
        adis adisVar2 = adis.a;
        adqn adqnVar = new adqn(adis.a);
        adqnVar.c(adua.b, adisVar);
        this.r = adqnVar.a();
        synchronized (obj) {
        }
    }

    static adnq g(aece aeceVar) {
        adnq adnqVar = (adnq) J.get(aeceVar);
        if (adnqVar != null) {
            return adnqVar;
        }
        int i = aeceVar.s;
        return adnq.d.e("Unknown http2 error code: " + i);
    }

    public static String h(ajoc ajocVar) throws IOException {
        ajmy ajmyVar = new ajmy();
        while (ajocVar.hU(ajmyVar, 1L) != -1) {
            if (ajmyVar.c(ajmyVar.b - 1) == 10) {
                long jI = ajmyVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (jI != -1) {
                    return ajog.a(ajmyVar, jI);
                }
                ajmy ajmyVar2 = new ajmy();
                ajmyVar.F(ajmyVar2, 0L, Math.min(32L, ajmyVar.b));
                throw new EOFException("\\n not found: limit=" + Math.min(ajmyVar.b, Long.MAX_VALUE) + " content=" + ajmyVar2.r().g() + UIHandler.ContinuousWritingQueue.PLACEHOLDER);
            }
        }
        throw new EOFException("\\n not found: ".concat(ajmyVar.r().g()));
    }

    private final void t() {
        if (this.s == null || !this.n.isEmpty() || !this.A.isEmpty() || this.u) {
            return;
        }
        this.u = true;
        adva advaVar = this.C;
        if (advaVar != null) {
            advaVar.d();
        }
        adui aduiVar = this.t;
        if (aduiVar != null) {
            adnq adnqVarF = f();
            synchronized (aduiVar) {
                if (!aduiVar.d) {
                    aduiVar.d = true;
                    aduiVar.e = adnqVarF;
                    Map map = aduiVar.c;
                    aduiVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        adui.b((ajmd) entry.getKey(), (Executor) entry.getValue());
                    }
                }
            }
            this.t = null;
        }
        if (!this.P) {
            this.P = true;
            this.k.g(aece.NO_ERROR, new byte[0]);
        }
        this.k.close();
    }

    @Override // defpackage.aduz
    public final void a(adnq adnqVar) {
        q(adnqVar);
        synchronized (this.m) {
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((aeay) entry.getValue()).f.l(adnqVar, false, new admc());
                j((aeay) entry.getValue());
            }
            Deque<aeay> deque = this.A;
            for (aeay aeayVar : deque) {
                aeayVar.f.m(adnqVar, adsi.d, true, new admc());
                j(aeayVar);
            }
            deque.clear();
            t();
        }
    }

    @Override // defpackage.adsk
    public final /* bridge */ /* synthetic */ adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) {
        aeay aeayVar;
        adzv adzvVarH = adzv.h(adjbVarArr, this.r);
        Object obj = this.m;
        synchronized (obj) {
            aeayVar = new aeay(admfVar, admcVar, this.k, this, this.l, obj, this.O, this.i, this.f, this.g, adzvVarH, this.F, adiwVar);
        }
        return aeayVar;
    }

    @Override // defpackage.adwi
    public final Runnable c(adwh adwhVar) {
        this.j = adwhVar;
        aeal aealVar = new aeal(this.M, this);
        aeao aeaoVar = new aeao(aealVar, new aecn(ahfm.a(aealVar)));
        synchronized (this.m) {
            this.k = new aean(this, aeaoVar);
            this.l = new aebq(this, this.k);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.M.execute(new aebb(this, countDownLatch, cyclicBarrier, aealVar, countDownLatch2));
        this.o.execute(new adyc(cyclicBarrier, countDownLatch2, 3));
        try {
            synchronized (this.m) {
                aean aeanVar = this.k;
                try {
                    ((aeao) aeanVar.b).a.a();
                } catch (IOException e) {
                    aeanVar.a.d(e);
                }
                ajju ajjuVar = new ajju();
                ajjuVar.f(7, this.i);
                aean aeanVar2 = this.k;
                aeanVar2.c.g(2, ajjuVar);
                try {
                    ((aeao) aeanVar2.b).a.j(ajjuVar);
                } catch (IOException e2) {
                    aeanVar2.a.d(e2);
                }
            }
            countDownLatch.countDown();
            this.M.execute(new adyj(this, 5));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // defpackage.aeam
    public final void d(Throwable th) {
        m(0, aece.INTERNAL_ERROR, adnq.m.d(th));
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.K;
    }

    public final adnq f() {
        synchronized (this.m) {
            adnq adnqVar = this.s;
            if (adnqVar != null) {
                return adnqVar;
            }
            return adnq.m.e("Connection closed");
        }
    }

    final void i(int i, adnq adnqVar, adsi adsiVar, boolean z, aece aeceVar, admc admcVar) {
        synchronized (this.m) {
            aeay aeayVar = (aeay) this.n.remove(Integer.valueOf(i));
            if (aeayVar != null) {
                if (aeceVar != null) {
                    this.k.e(i, aece.CANCEL);
                }
                if (adnqVar != null) {
                    aeax aeaxVar = aeayVar.f;
                    if (admcVar == null) {
                        admcVar = new admc();
                    }
                    aeaxVar.m(adnqVar, adsiVar, z, admcVar);
                }
                if (!p()) {
                    t();
                }
                j(aeayVar);
            }
        }
    }

    public final void j(aeay aeayVar) {
        if (this.Q && this.A.isEmpty() && this.n.isEmpty()) {
            this.Q = false;
            adva advaVar = this.C;
            if (advaVar != null) {
                advaVar.c();
            }
        }
        if (aeayVar.u) {
            this.R.c(aeayVar, false);
        }
    }

    public final void k(aece aeceVar, String str) {
        m(0, aeceVar, g(aeceVar).a(str));
    }

    public final void l(aeay aeayVar) {
        if (!this.Q) {
            this.Q = true;
            adva advaVar = this.C;
            if (advaVar != null) {
                advaVar.b();
            }
        }
        if (aeayVar.u) {
            this.R.c(aeayVar, true);
        }
    }

    public final void m(int i, aece aeceVar, adnq adnqVar) {
        synchronized (this.m) {
            if (this.s == null) {
                this.s = adnqVar;
                this.j.c(adnqVar, new adtz(aeceVar == null ? aduc.NO_ERROR : aduc.b(aeceVar.s)));
            }
            if (aeceVar != null && !this.P) {
                this.P = true;
                this.k.g(aeceVar, new byte[0]);
            }
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((aeay) entry.getValue()).f.m(adnqVar, adsi.b, false, new admc());
                    j((aeay) entry.getValue());
                }
            }
            Deque<aeay> deque = this.A;
            for (aeay aeayVar : deque) {
                aeayVar.f.m(adnqVar, adsi.d, true, new admc());
                j(aeayVar);
            }
            deque.clear();
            t();
        }
    }

    public final void n(aeay aeayVar) {
        aeax aeaxVar = aeayVar.f;
        woy.aa(aeaxVar.x == -1, "StreamId already assigned");
        this.n.put(Integer.valueOf(this.L), aeayVar);
        l(aeayVar);
        int i = this.L;
        woy.ab(aeaxVar.x == -1, "the stream has been started with id %s", i);
        aeaxVar.x = i;
        aebq aebqVar = aeaxVar.h;
        aeaxVar.w = new aebo(aebqVar, i, aebqVar.a, aeaxVar);
        aeay aeayVar2 = aeaxVar.y;
        aeayVar2.f.d();
        if (aeaxVar.u) {
            aean aeanVar = aeaxVar.g;
            try {
                ((aeao) aeanVar.b).a.h(false, aeaxVar.x, aeaxVar.b);
            } catch (IOException e) {
                aeanVar.a.d(e);
            }
            aeayVar2.d.a();
            aeaxVar.b = null;
            ajmy ajmyVar = aeaxVar.c;
            if (ajmyVar.b > 0) {
                aebqVar.a(aeaxVar.d, aeaxVar.w, ajmyVar, aeaxVar.e);
            }
            aeaxVar.u = false;
        }
        if (aeayVar.r() == adme.a || aeayVar.r() == adme.c) {
            boolean z = aeayVar.g;
        } else {
            this.k.c();
        }
        int i2 = this.L;
        if (i2 < 2147483645) {
            this.L = i2 + 2;
        } else {
            this.L = Alert.DURATION_SHOW_INDEFINITELY;
            m(Alert.DURATION_SHOW_INDEFINITELY, aece.NO_ERROR, adnq.m.e("Stream ids exhausted"));
        }
    }

    final boolean o(int i) {
        boolean z;
        synchronized (this.m) {
            z = false;
            if (i < this.L && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean p() {
        boolean z = false;
        while (true) {
            Deque deque = this.A;
            if (deque.isEmpty() || this.n.size() >= this.z) {
                break;
            }
            n((aeay) deque.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.adwi
    public final void q(adnq adnqVar) {
        synchronized (this.m) {
            if (this.s != null) {
                return;
            }
            this.s = adnqVar;
            this.j.c(adnqVar, adzt.SUBCHANNEL_SHUTDOWN);
            t();
        }
    }

    @Override // defpackage.aebp
    public final aebo[] r() {
        aebo[] aeboVarArr;
        synchronized (this.m) {
            Map map = this.n;
            aeboVarArr = new aebo[map.size()];
            Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                aeboVarArr[i] = ((aeay) it.next()).f.f();
                i++;
            }
        }
        return aeboVarArr;
    }

    @Override // defpackage.adss
    public final adis s() {
        return this.r;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.g("logId", this.K.a);
        xxgVarAo.b("address", this.e);
        return xxgVarAo.toString();
    }
}

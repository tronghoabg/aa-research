package e.a.f;

import e.a.d.db;
import e.a.ds;
import e.a.dt;
import e.a.ee;
import e.a.ef;
import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f47741a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CyclicBarrier f47742b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f47743c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f47744d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ac f47745e;

    x(ac acVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, f fVar, CountDownLatch countDownLatch2) {
        this.f47741a = countDownLatch;
        this.f47742b = cyclicBarrier;
        this.f47743c = fVar;
        this.f47744d = countDownLatch2;
        Objects.requireNonNull(acVar);
        this.f47745e = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac acVar;
        aa aaVar;
        k.j jVarC = k.y.c(new w(this));
        try {
            try {
                try {
                    this.f47741a.await();
                    this.f47742b.await(1000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    ac acVar2 = this.f47745e;
                    acVar2.A = new aa(acVar2, acVar2.n.g(jVarC));
                    this.f47744d.countDown();
                    throw th;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException | TimeoutException unused2) {
                acVar = this.f47745e;
                acVar.ai(0, e.a.f.a.a.a.INTERNAL_ERROR, ee.f47411k.g("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                aaVar = new aa(acVar, acVar.n.g(jVarC));
                acVar.A = aaVar;
                this.f47744d.countDown();
            }
            ac acVar3 = this.f47745e;
            e.a.aq aqVar = acVar3.f47613b;
            if (aqVar == null) {
                acVar3.f47615f = acVar3.H.createSocket(acVar3.f47617h.getAddress(), acVar3.f47617h.getPort());
            } else {
                if (!(aqVar.e() instanceof InetSocketAddress)) {
                    throw new ef(ee.f47410j.g("Unsupported SocketAddress implementation " + String.valueOf(aqVar.e().getClass())));
                }
                acVar3.f47615f = ac.D(acVar3, aqVar.d(), (InetSocketAddress) aqVar.e(), aqVar.c(), aqVar.b());
            }
            if (acVar3.I != null) {
                SSLSocketFactory sSLSocketFactory = acVar3.I;
                HostnameVerifier hostnameVerifier = acVar3.J;
                Socket socket = acVar3.f47615f;
                String strA = acVar3.A();
                int i2 = acVar3.i();
                e.a.f.a.c cVar = acVar3.N;
                int i3 = aj.f47649b;
                com.google.d.b.an.C(sSLSocketFactory, "sslSocketFactory");
                com.google.d.b.an.C(socket, "socket");
                com.google.d.b.an.C(cVar, "spec");
                SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, strA, i2, true);
                cVar.d(sSLSocket);
                String strB = ah.d().b(sSLSocket, strA, cVar.a() ? aj.f47648a : null);
                List list = aj.f47648a;
                com.google.d.b.an.y(list.contains(e.a.f.a.m.a(strB)), "Only " + String.valueOf(list) + " are supported, but negotiated protocol is %s", strB);
                if (!hostnameVerifier.verify((strA.startsWith("[") && strA.endsWith("]")) ? strA.substring(1, strA.length() - 1) : strA, sSLSocket.getSession())) {
                    throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(strA)));
                }
                acVar3.f47616g = sSLSocket.getSession();
                acVar3.f47615f = sSLSocket;
            }
            acVar3.f47615f.setTcpNoDelay(true);
            k.j jVarC2 = k.y.c(k.y.g(acVar3.f47615f));
            this.f47743c.k(k.y.d(acVar3.f47615f), acVar3.f47615f);
            e.a.a aVarB = acVar3.B.b();
            aVarB.c(e.a.ao.f46262a, acVar3.f47615f.getRemoteSocketAddress());
            aVarB.c(e.a.ao.f46263b, acVar3.f47615f.getLocalSocketAddress());
            aVarB.c(e.a.ao.f46264c, acVar3.f47616g);
            aVarB.c(db.f46777a, acVar3.f47616g == null ? ds.f47345a : ds.f47347c);
            acVar3.B = aVarB.a();
            acVar3.A = new aa(acVar3, acVar3.n.g(jVarC2));
            this.f47744d.countDown();
            synchronized (acVar3.r) {
                Socket socket2 = acVar3.f47615f;
                com.google.d.b.an.C(socket2, "socket");
                acVar3.K = socket2;
                if (acVar3.f47616g != null) {
                    new dt(acVar3.f47616g);
                }
            }
        } catch (ef e2) {
            this.f47745e.ai(0, e.a.f.a.a.a.INTERNAL_ERROR, e2.b());
            acVar = this.f47745e;
            aaVar = new aa(acVar, acVar.n.g(jVarC));
            acVar.A = aaVar;
            this.f47744d.countDown();
        } catch (Exception e3) {
            ac acVar4 = this.f47745e;
            acVar4.e(e3);
            acVar = acVar4;
            aaVar = new aa(acVar, acVar.n.g(jVarC));
            acVar.A = aaVar;
            this.f47744d.countDown();
        }
    }
}

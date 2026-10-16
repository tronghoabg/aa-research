package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
final class pep implements tks {
    private final Context a;
    private final phy b;
    private final kny c;
    private final pek d;
    private final paa e;
    private final Lock f;
    private volatile peo g;
    private final Condition h;

    public pep(Context context, phy phyVar, kny knyVar, pek pekVar, paa paaVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        this.g = pem.a;
        this.h = reentrantLock.newCondition();
        this.a = context;
        this.b = phyVar;
        this.c = knyVar;
        this.d = pekVar;
        this.e = paaVar;
    }

    private final void c(Class cls) {
        this.f.lock();
        try {
            woy.aa(!cls.isInstance(this.g), "Lifecycle method was called twice");
        } finally {
            this.f.unlock();
        }
    }

    private static void d(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (IOException e) {
            ((ype) ((ype) ((ype) pew.a.h()).p(e)).ai((char) 6403)).u("Socket threw while closing");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    @Override // defpackage.tks
    public final /* bridge */ /* synthetic */ Object a() throws IOException {
        Socket socketA;
        Object pesVar;
        boolean zAwait;
        wer.b();
        c(pel.class);
        ((ype) ((ype) pew.a.f()).ai((char) 6404)).u("Executing setUp for WPP connection");
        int i = 0;
        while (true) {
            if (i >= 3) {
                socketA = null;
                break;
            }
            this.f.lock();
            if (i != 0) {
                do {
                    try {
                        if (this.g != pem.a) {
                            break;
                        }
                        Condition condition = this.h;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        boolean zInterrupted = Thread.interrupted();
                        long jNanoTime = System.nanoTime() + 1000000000;
                        try {
                            zAwait = condition.await(1000000000L, TimeUnit.NANOSECONDS);
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            zAwait = jNanoTime - System.nanoTime() > 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } while (zAwait);
            } else {
                i = 0;
            }
            if (this.g == pen.a) {
                ((ype) pew.a.l().ai(6418)).w("Aborting before attempt %d to create raw socket", i);
                return per.a;
            }
            this.f.unlock();
            ((ype) pew.a.l().ai((char) 6413)).w("Starting attempt %d to create raw socket", i);
            try {
                socketA = jek.a(this.d.a);
                ((ype) ((ype) pew.a.f()).ai((char) 6414)).w("Created raw socket on attempt %d", i);
                this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_SOCKET_CREATED);
                try {
                    pek pekVar = this.d;
                    socketA.connect(new InetSocketAddress(pekVar.b, pekVar.c), 10000);
                    ((ype) ((ype) pew.a.f()).ai((char) 6415)).w("Connected raw socket on attempt %d", i);
                    this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_SOCKET_CONNECTED);
                    break;
                } catch (IOException e) {
                    ((ype) ((ype) ((ype) pew.a.g()).p(e)).ai(6416)).w("Couldn't connect raw socket on attempt %d", i);
                    this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_SOCKET_CONNECT_FAILURE);
                    d(socketA);
                }
            } catch (IOException e2) {
                ((ype) ((ype) ((ype) pew.a.g()).p(e2)).ai(6417)).w("Couldn't create raw socket on attempt %d", i);
                this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_SOCKET_CREATE_FAILURE);
            }
            i++;
        }
        this.f.lock();
        try {
            if (this.g == pen.a) {
                if (socketA != null) {
                    ((ype) ((ype) pew.a.h()).ai(6412)).u("Aborting raw socket to SSL socket conversion. Socket was connected.");
                    d(socketA);
                } else {
                    ((ype) pew.a.l().ai(6411)).u("Aborting raw socket to SSL socket conversion. Socket did not connect.");
                }
                return per.a;
            }
            if (socketA == null) {
                ((ype) ((ype) pew.a.g()).ai((char) 6410)).w("Failed to connect raw socket after %d attempts", 3);
                this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_SOCKET_FAILURE);
                return peq.a;
            }
            try {
                Context context = this.a;
                phy phyVar = this.b;
                context.getClass();
                phyVar.getClass();
                InetAddress inetAddress = socketA.getInetAddress();
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                int port = socketA.getPort();
                try {
                    yph yphVar = phy.a;
                    ((ype) ((ype) yphVar.f()).ai((char) 6724)).u("Creating SSL wrapped socket");
                    try {
                        SSLSocket sSLSocket = (SSLSocket) jca.d(context, jca.a(), "GmsCore_OpenSSL").getSocketFactory().createSocket(socketA, hostAddress, port, true);
                        sSLSocket.setUseClientMode(false);
                        sSLSocket.setNeedClientAuth(true);
                        ((ype) ((ype) yphVar.f()).ai((char) 6725)).u("Handshake settings set");
                        sSLSocket.getClass();
                        ((ype) pew.a.l().ai((char) 6405)).u("Converted raw socket to SSL socket");
                        this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_SSL_SOCKET_READY);
                        int i2 = phs.d;
                        te teVar = new te(null, null);
                        teVar.d = sSLSocket;
                        teVar.c = this.e;
                        teVar.a = koo.n();
                        teVar.b = Looper.getMainLooper();
                        teVar.c.getClass();
                        teVar.d.getClass();
                        pho phrVar = teVar.a ? new phr(teVar) : new phs(teVar);
                        try {
                            phrVar.f();
                            yph yphVar2 = pew.a;
                            ((ype) yphVar2.l().ai((char) 6406)).u("Extracted IO streams from SSL socket");
                            this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_STARTED);
                            Lock lock = this.f;
                            lock.lock();
                            try {
                                if (this.g == pen.a) {
                                    ((ype) ((ype) yphVar2.h()).ai(6407)).u("Aborting SSL transport handoff. Transport was connected.");
                                    phrVar.a();
                                    pesVar = per.a;
                                    lock.unlock();
                                    this = this;
                                } else {
                                    this.g = new pel(phrVar);
                                    Lock lock2 = this.f;
                                    lock2.unlock();
                                    pesVar = new pes(phrVar);
                                    this = lock2;
                                }
                                return pesVar;
                            } finally {
                            }
                        } catch (IOException e3) {
                            ((ype) ((ype) ((ype) pew.a.g()).p(e3)).ai((char) 6408)).u("Failed to extract IO streams from SSL socket");
                            this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_CONNECT_FAILURE);
                            phrVar.a();
                            return peq.a;
                        }
                    } catch (Exception e4) {
                        throw new SSLException("Could not create socket factory", e4);
                    }
                } catch (IOException e5) {
                    throw new SSLException("Could not connect with and establish SSL connection over socket", e5);
                }
            } catch (IOException e6) {
                ((ype) ((ype) ((ype) pew.a.g()).p(e6)).ai((char) 6409)).u("SSLSocket creation failed");
                this.c.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_SSL_SOCKET_RETRYABLE_FAILURE);
                d(socketA);
                return peq.a;
            }
        } finally {
        }
    }

    @Override // defpackage.tks
    public final void b() {
        wer.b();
        c(pen.class);
        ((ype) ((ype) pew.a.f()).ai((char) 6419)).u("Executing tearDown for WPP connection");
        this.f.lock();
        try {
            peo peoVar = this.g;
            if (peoVar instanceof pel) {
                try {
                    ((pel) peoVar).a.a();
                } catch (Throwable th) {
                    throw new RuntimeException(th.toString(), th);
                }
            }
            this.g = pen.a;
            this.h.signal();
        } finally {
            this.f.unlock();
        }
    }
}

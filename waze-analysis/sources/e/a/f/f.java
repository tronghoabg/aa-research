package e.a.f;

import e.a.d.jj;
import java.io.IOException;
import java.net.Socket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements k.al {

    /* renamed from: c, reason: collision with root package name */
    private final jj f47671c;

    /* renamed from: d, reason: collision with root package name */
    private final g f47672d;

    /* renamed from: h, reason: collision with root package name */
    private k.al f47676h;

    /* renamed from: i, reason: collision with root package name */
    private Socket f47677i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47678j;

    /* renamed from: k, reason: collision with root package name */
    private int f47679k;

    /* renamed from: l, reason: collision with root package name */
    private int f47680l;

    /* renamed from: a, reason: collision with root package name */
    private final Object f47669a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final k.h f47670b = new k.h();

    /* renamed from: e, reason: collision with root package name */
    private boolean f47673e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47674f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47675g = false;

    private f(jj jjVar, g gVar) {
        com.google.d.b.an.C(jjVar, "executor");
        this.f47671c = jjVar;
        this.f47672d = gVar;
    }

    static f o(jj jjVar, g gVar) {
        return new f(jjVar, gVar);
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47675g) {
            return;
        }
        this.f47675g = true;
        this.f47671c.execute(new c(this));
    }

    @Override // k.al, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f47675g) {
            throw new IOException("closed");
        }
        int i2 = e.b.b.f47862a;
        synchronized (this.f47669a) {
            if (this.f47674f) {
                return;
            }
            this.f47674f = true;
            this.f47671c.execute(new b(this));
        }
    }

    @Override // k.al
    public final k.ao h() {
        return k.ao.f50818c;
    }

    final void k(k.al alVar, Socket socket) {
        com.google.d.b.an.v(this.f47676h == null, "AsyncSink's becomeConnected should only be called once.");
        this.f47676h = alVar;
        com.google.d.b.an.C(socket, "socket");
        this.f47677i = socket;
    }

    @Override // k.al
    public final void l(k.h hVar, long j2) throws IOException {
        if (this.f47675g) {
            throw new IOException("closed");
        }
        int i2 = e.b.b.f47862a;
        synchronized (this.f47669a) {
            k.h hVar2 = this.f47670b;
            hVar2.l(hVar, j2);
            int i3 = this.f47680l + this.f47679k;
            this.f47680l = i3;
            boolean z = false;
            this.f47679k = 0;
            if (this.f47678j || i3 <= 10000) {
                if (!this.f47673e && !this.f47674f && hVar2.i() > 0) {
                    this.f47673e = true;
                }
                return;
            }
            this.f47678j = true;
            z = true;
            if (!z) {
                this.f47671c.execute(new a(this));
                return;
            }
            try {
                this.f47677i.close();
            } catch (IOException e2) {
                this.f47672d.e(e2);
            }
        }
    }
}

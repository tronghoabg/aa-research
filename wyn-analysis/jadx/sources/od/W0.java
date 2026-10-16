package od;

import A.AbstractC0213f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import md.AbstractC3541i;
import md.C3542j;
import md.InterfaceC3543k;

/* loaded from: classes5.dex */
public final class W0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC3668a f41825a;

    /* renamed from: b, reason: collision with root package name */
    public int f41826b;

    /* renamed from: c, reason: collision with root package name */
    public final W1 f41827c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f41828d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3543k f41829e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f41830f;

    /* renamed from: g, reason: collision with root package name */
    public int f41831g;

    /* renamed from: h, reason: collision with root package name */
    public int f41832h;

    /* renamed from: i, reason: collision with root package name */
    public int f41833i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41834j;
    public C3736x k;

    /* renamed from: l, reason: collision with root package name */
    public C3736x f41835l;

    /* renamed from: m, reason: collision with root package name */
    public long f41836m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41837n;

    /* renamed from: o, reason: collision with root package name */
    public int f41838o;

    /* renamed from: p, reason: collision with root package name */
    public int f41839p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41840q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f41841r;

    public W0(AbstractC3668a abstractC3668a, int i5, W1 w12, a2 a2Var) {
        C3542j c3542j = C3542j.f40651b;
        this.f41832h = 1;
        this.f41833i = 5;
        this.f41835l = new C3736x();
        this.f41837n = false;
        this.f41838o = -1;
        this.f41840q = false;
        this.f41841r = false;
        this.f41825a = abstractC3668a;
        this.f41829e = c3542j;
        this.f41826b = i5;
        this.f41827c = w12;
        Fe.e.t(a2Var, "transportTracer");
        this.f41828d = a2Var;
    }

    public final void a() {
        if (this.f41837n) {
            return;
        }
        boolean z2 = true;
        this.f41837n = true;
        while (!this.f41841r && this.f41836m > 0 && h()) {
            try {
                int iF = AbstractC0213f.f(this.f41832h);
                if (iF == 0) {
                    d();
                } else {
                    if (iF != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid state: ");
                        int i5 = this.f41832h;
                        sb2.append(i5 != 1 ? i5 != 2 ? "null" : "BODY" : "HEADER");
                        throw new AssertionError(sb2.toString());
                    }
                    b();
                    this.f41836m--;
                }
            } catch (Throwable th) {
                this.f41837n = false;
                throw th;
            }
        }
        if (this.f41841r) {
            close();
            this.f41837n = false;
            return;
        }
        if (this.f41840q) {
            if (this.f41835l.f42123c != 0) {
                z2 = false;
            }
            if (z2) {
                close();
            }
        }
        this.f41837n = false;
    }

    public final void b() {
        InputStream v0;
        int i5 = this.f41838o;
        long j8 = this.f41839p;
        W1 w12 = this.f41827c;
        for (AbstractC3541i abstractC3541i : w12.f41842a) {
            abstractC3541i.d(i5, j8);
        }
        this.f41839p = 0;
        if (this.f41834j) {
            InterfaceC3543k interfaceC3543k = this.f41829e;
            if (interfaceC3543k == C3542j.f40651b) {
                throw md.k0.f40681m.h("Can't decode compressed gRPC message as compression not configured").a();
            }
            try {
                C3736x c3736x = this.k;
                C3718q1 c3718q1 = AbstractC3720r1.f42081a;
                C3715p1 c3715p1 = new C3715p1();
                Fe.e.t(c3736x, "buffer");
                c3715p1.f42057a = c3736x;
                v0 = new V0(interfaceC3543k.b(c3715p1), this.f41826b, w12);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } else {
            long j10 = this.k.f42123c;
            for (AbstractC3541i abstractC3541i2 : w12.f41842a) {
                abstractC3541i2.f(j10);
            }
            C3736x c3736x2 = this.k;
            C3718q1 c3718q12 = AbstractC3720r1.f42081a;
            C3715p1 c3715p12 = new C3715p1();
            Fe.e.t(c3736x2, "buffer");
            c3715p12.f42057a = c3736x2;
            v0 = c3715p12;
        }
        this.k.getClass();
        this.k = null;
        AbstractC3668a abstractC3668a = this.f41825a;
        L4.g gVar = new L4.g();
        gVar.f6899a = v0;
        abstractC3668a.f41879j.e(gVar);
        this.f41832h = 1;
        this.f41833i = 5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        C3736x c3736x = this.k;
        boolean z2 = c3736x != null && c3736x.f42123c > 0;
        try {
            C3736x c3736x2 = this.f41835l;
            if (c3736x2 != null) {
                c3736x2.close();
            }
            C3736x c3736x3 = this.k;
            if (c3736x3 != null) {
                c3736x3.close();
            }
            this.f41835l = null;
            this.k = null;
            this.f41825a.c(z2);
        } catch (Throwable th) {
            this.f41835l = null;
            this.k = null;
            throw th;
        }
    }

    public final void d() {
        int iY = this.k.y();
        if ((iY & 254) != 0) {
            throw md.k0.f40681m.h("gRPC frame header malformed: reserved bits not zero").a();
        }
        this.f41834j = (iY & 1) != 0;
        C3736x c3736x = this.k;
        c3736x.a(4);
        int iY2 = c3736x.y() | (c3736x.y() << 24) | (c3736x.y() << 16) | (c3736x.y() << 8);
        this.f41833i = iY2;
        if (iY2 < 0 || iY2 > this.f41826b) {
            md.k0 k0Var = md.k0.k;
            Locale locale = Locale.US;
            throw k0Var.h("gRPC message exceeds maximum size " + this.f41826b + ": " + iY2).a();
        }
        int i5 = this.f41838o + 1;
        this.f41838o = i5;
        for (AbstractC3541i abstractC3541i : this.f41827c.f41842a) {
            abstractC3541i.c(i5);
        }
        a2 a2Var = this.f41828d;
        ((InterfaceC3734w0) a2Var.f41915c).a();
        ((Y1) a2Var.f41914b).d();
        this.f41832h = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r0.a(r3);
        r8.f41839p += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.f41832h == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.lang.Throwable {
        /*
            r8 = this;
            od.W1 r0 = r8.f41827c
            r1 = 2
            r2 = 0
            od.x r3 = r8.k     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L12
            od.x r3 = new od.x     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            r8.k = r3     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L5b
        L12:
            r3 = r2
        L13:
            int r4 = r8.f41833i     // Catch: java.lang.Throwable -> L48
            od.x r5 = r8.k     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f42123c     // Catch: java.lang.Throwable -> L48
            int r4 = r4 - r5
            if (r4 <= 0) goto L4d
            od.x r5 = r8.f41835l     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f42123c     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L37
            if (r3 <= 0) goto L36
            od.a r4 = r8.f41825a
            r4.a(r3)
            int r4 = r8.f41832h
            if (r4 != r1) goto L36
        L2d:
            long r4 = (long) r3
            r0.a(r4)
            int r0 = r8.f41839p
            int r0 = r0 + r3
            r8.f41839p = r0
        L36:
            return r2
        L37:
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + r4
            od.x r5 = r8.k     // Catch: java.lang.Throwable -> L48
            od.x r6 = r8.f41835l     // Catch: java.lang.Throwable -> L48
            od.c r4 = r6.h(r4)     // Catch: java.lang.Throwable -> L48
            r5.J(r4)     // Catch: java.lang.Throwable -> L48
            goto L13
        L48:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L5b
        L4d:
            r2 = 1
            if (r3 <= 0) goto L5a
            od.a r4 = r8.f41825a
            r4.a(r3)
            int r4 = r8.f41832h
            if (r4 != r1) goto L5a
            goto L2d
        L5a:
            return r2
        L5b:
            if (r2 <= 0) goto L6f
            od.a r4 = r8.f41825a
            r4.a(r2)
            int r4 = r8.f41832h
            if (r4 != r1) goto L6f
            long r4 = (long) r2
            r0.a(r4)
            int r0 = r8.f41839p
            int r0 = r0 + r2
            r8.f41839p = r0
        L6f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: od.W0.h():boolean");
    }

    public final boolean isClosed() {
        return this.f41835l == null;
    }
}

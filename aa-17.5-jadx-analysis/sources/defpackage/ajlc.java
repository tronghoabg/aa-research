package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ajlc implements Closeable {
    public static final ajlp a;
    public final ajla b;
    public final Map c = new LinkedHashMap();
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final ajix h;
    public final ajiw i;
    public final ajiw j;
    public final ajiw k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final ajlp q;
    public ajlp r;
    public long s;
    public final ajlk t;
    public final ajlb u;
    public final Set v;
    private final ajlr w;
    private long x;
    private final ajiy y;

    static {
        ajlp ajlpVar = new ajlp();
        ajlpVar.g(4, 65535);
        ajlpVar.g(5, 16384);
        a = ajlpVar;
    }

    public ajlc(ajky ajkyVar) {
        this.b = ajkyVar.c;
        String str = ajkyVar.b;
        ajiy ajiyVar = null;
        if (str == null) {
            affa.d("connectionName");
            str = null;
        }
        this.d = str;
        this.f = 3;
        ajix ajixVar = ajkyVar.a;
        this.h = ajixVar;
        this.i = ajixVar.b();
        this.j = ajixVar.b();
        this.k = ajixVar.b();
        ajlp ajlpVar = new ajlp();
        ajlpVar.g(4, 16777216);
        this.q = ajlpVar;
        this.r = a;
        this.w = new ajlr(0);
        this.s = this.r.c();
        ajiy ajiyVar2 = ajkyVar.e;
        if (ajiyVar2 == null) {
            affa.d("socket");
        } else {
            ajiyVar = ajiyVar2;
        }
        this.y = ajiyVar;
        this.t = new ajlk(ajiyVar.c);
        this.u = new ajlb(this, new ajlf(ajiyVar.b));
        this.v = new LinkedHashSet();
    }

    public static final boolean i(int i) {
        return (i & 1) == 0;
    }

    public final ajlj a(int i) {
        ajlj ajljVar;
        synchronized (this) {
            ajljVar = (ajlj) this.c.get(Integer.valueOf(i));
        }
        return ajljVar;
    }

    public final ajlj b(int i) {
        ajlj ajljVar;
        synchronized (this) {
            ajljVar = (ajlj) this.c.remove(Integer.valueOf(i));
            notifyAll();
        }
        return ajljVar;
    }

    public final void c(IOException iOException) throws IOException {
        j(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        j(1, 9, null);
    }

    public final void d() throws IOException {
        this.t.b();
    }

    public final void e(long j) {
        synchronized (this) {
            ajlr ajlrVar = this.w;
            ajlrVar.b(j, 0L);
            long jA = ajlrVar.a();
            if (jA >= this.q.c() / 2) {
                h(0, jA);
                ajlrVar.b(0L, jA);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = (int) java.lang.Math.min(r13, r6 - r4);
        r4 = r9.t;
        r2 = java.lang.Math.min(r2, r4.d);
        r7 = r2;
        r9.x += r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r10, boolean r11, defpackage.ajmy r12, long r13) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L61
        L7:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L60
            monitor-enter(r9)
        Lc:
            long r4 = r9.x     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            long r6 = r9.s     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r9.c     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r2 == 0) goto L24
            r9.wait()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto Lc
        L24:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            throw r10     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L4f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L4f
            ajlk r4 = r9.t     // Catch: java.lang.Throwable -> L4f
            int r5 = r4.d     // Catch: java.lang.Throwable -> L4f
            int r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L4f
            long r5 = r9.x     // Catch: java.lang.Throwable -> L4f
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L4f
            long r5 = r5 + r7
            r9.x = r5     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r9)
            long r13 = r13 - r7
            if (r11 == 0) goto L4a
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = r3
        L4b:
            r4.a(r5, r10, r12, r2)
            goto L7
        L4f:
            r10 = move-exception
            goto L5e
        L51:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r10.interrupt()     // Catch: java.lang.Throwable -> L4f
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4f
            r10.<init>()     // Catch: java.lang.Throwable -> L4f
            throw r10     // Catch: java.lang.Throwable -> L4f
        L5e:
            monitor-exit(r9)
            throw r10
        L60:
            return
        L61:
            ajlk r9 = r9.t
            r9.a(r11, r10, r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlc.f(int, boolean, ajmy, long):void");
    }

    public final void g(boolean z, int i, int i2) throws IOException {
        try {
            ajlk ajlkVar = this.t;
            synchronized (ajlkVar) {
                if (ajlkVar.e) {
                    throw new IOException("closed");
                }
                ajlkVar.c(0, 8, 6, z ? 1 : 0);
                ajmz ajmzVar = ajlkVar.b;
                ajmzVar.P(i);
                ajmzVar.P(i2);
                ajmzVar.flush();
            }
        } catch (IOException e) {
            c(e);
        }
    }

    public final void h(final int i, final long j) {
        this.i.e(this.d + "[" + i + "] windowUpdate", new afdr() { // from class: ajkw
            @Override // defpackage.afdr
            public final Object invoke() throws IOException {
                int i2 = i;
                ajlc ajlcVar = this.a;
                try {
                    ajlcVar.t.d(i2, j);
                } catch (IOException e) {
                    ajlcVar.c(e);
                }
                return afak.a;
            }
        });
    }

    public final void j(int i, int i2, IOException iOException) throws IOException {
        int i3;
        Object[] array;
        TimeZone timeZone = ajis.a;
        try {
            k(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            Map map = this.c;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new ajlj[0]);
                map.clear();
            }
        }
        ajlj[] ajljVarArr = (ajlj[]) array;
        if (ajljVarArr != null) {
            for (ajlj ajljVar : ajljVarArr) {
                try {
                    ajljVar.l(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.t.close();
        } catch (IOException unused3) {
        }
        try {
            ((ajol) this.y.a).a.close();
        } catch (IOException unused4) {
        }
        this.i.b();
        this.j.b();
        this.k.b();
    }

    public final void k(int i) throws IOException {
        synchronized (this.t) {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    int i2 = this.e;
                    ajlk ajlkVar = this.t;
                    int i3 = ajiq.a;
                    synchronized (ajlkVar) {
                        if (ajlkVar.e) {
                            throw new IOException("closed");
                        }
                        ajlkVar.c(0, 8, 7, 0);
                        ajmz ajmzVar = ajlkVar.b;
                        ajmzVar.P(i2);
                        ajmzVar.P(i - 1);
                        ajmzVar.flush();
                    }
                }
            }
        }
    }

    public final void l(int i, int i2) throws IOException {
        this.t.e(i, i2);
    }

    public final void m(int i, int i2) {
        this.i.e(this.d + "[" + i + "] writeSynReset", new ajkx(this, i, i2, 0));
    }
}

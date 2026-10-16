package defpackage;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class adwm implements Closeable, adsv {
    public adwj a;
    public int b;
    public adjs c;
    public long e;
    private final adzv h;
    private final aeac i;
    private boolean k;
    private adsr l;
    private int o;
    private int p = 1;
    private int j = 5;
    public adsr d = new adsr();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public adwm(adwj adwjVar, adjs adjsVar, int i, adzv adzvVar, aeac aeacVar) {
        this.a = adwjVar;
        this.c = adjsVar;
        this.b = i;
        this.h = adzvVar;
        this.i = aeacVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r9.f == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (c() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r3 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        r9.a.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r9.p != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        r9.h.b(r3);
        r9.o += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r3 = r9.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r3 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r4 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        if (r4 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r3 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.bz(r0, "Invalid state: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r2 = r9.h;
        defpackage.adzv.g(r2);
        r9.o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        if (r9.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
    
        r3 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
    
        if (r3 == defpackage.adjc.a) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r4 = r9.l;
        r6 = defpackage.adxm.a;
        r4 = new defpackage.adwl(r3.a(new defpackage.adxj(r4)), r9.b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        throw new defpackage.adnt(defpackage.adnq.l.e("Can't decode compressed gRPC message as compression not configured"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        r3 = r9.l.a;
        defpackage.adzv.g(r2);
        r2 = r9.l;
        r3 = defpackage.adxm.a;
        r4 = new defpackage.adxj(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
    
        r9.l = null;
        r9.a.g(new defpackage.adwk(r4));
        r9.p = 1;
        r9.j = 5;
        r9.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
    
        r3 = r9.l.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0113, code lost:
    
        if ((r3 & 254) != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
    
        if (1 == (r3 & 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        r9.k = r3;
        r3 = r9.l;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r9.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013f, code lost:
    
        if (r3 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0143, code lost:
    
        if (r3 > r9.b) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        r9.n++;
        defpackage.adzv.g(r9.h);
        r3 = r9.i;
        r3.g.a();
        r3.h = r3.a.a();
        r9.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
    
        throw new defpackage.adnt(defpackage.adnq.l.e("gRPC frame header malformed: reserved bits not zero"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwm.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.adsv
    public final void close() {
        if (b()) {
            return;
        }
        adsr adsrVar = this.l;
        boolean z = false;
        if (adsrVar != null && adsrVar.a > 0) {
            z = true;
        }
        try {
            adsr adsrVar2 = this.d;
            if (adsrVar2 != null) {
                adsrVar2.close();
            }
            adsr adsrVar3 = this.l;
            if (adsrVar3 != null) {
                adsrVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.k(z);
        } catch (Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}

package e.a.d;

import java.io.Closeable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gi implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private gf f47015a;

    /* renamed from: b, reason: collision with root package name */
    private int f47016b;

    /* renamed from: c, reason: collision with root package name */
    private final jt f47017c;

    /* renamed from: d, reason: collision with root package name */
    private final kc f47018d;

    /* renamed from: e, reason: collision with root package name */
    private e.a.ae f47019e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47021g;

    /* renamed from: h, reason: collision with root package name */
    private ar f47022h;

    /* renamed from: j, reason: collision with root package name */
    private long f47024j;
    private int m;
    private int p = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f47020f = 5;

    /* renamed from: i, reason: collision with root package name */
    private ar f47023i = new ar();

    /* renamed from: k, reason: collision with root package name */
    private boolean f47025k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f47026l = -1;
    private boolean n = false;
    private volatile boolean o = false;

    public gi(gf gfVar, e.a.ae aeVar, int i2, jt jtVar, kc kcVar) {
        this.f47015a = gfVar;
        this.f47019e = aeVar;
        this.f47016b = i2;
        this.f47017c = jtVar;
        this.f47018d = kcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r8.n == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (i() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        if (r3 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        r8.f47015a.A(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r8.p != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        r8.f47017c.h();
        r8.m += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r3 = r8.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r3 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r4 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r4 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r3 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        throw new java.lang.AssertionError("Invalid state: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        r2 = r8.f47017c;
        r2.f();
        r8.m = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        if (r8.f47021g == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        r3 = r8.f47019e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        if (r3 == e.a.q.f47844a) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        r4 = r8.f47022h;
        r6 = e.a.d.hr.f47109a;
        r4 = new e.a.d.gh(r3.a(new e.a.d.hp(r4)), r8.f47016b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f5, code lost:
    
        throw new e.a.eh(e.a.ee.f47410j.g("Can't decode compressed gRPC message as compression not configured"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
    
        r8.f47022h.f();
        r2.g();
        r2 = r8.f47022h;
        r3 = e.a.d.hr.f47109a;
        r4 = new e.a.d.hp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
    
        r8.f47022h = null;
        r8.f47015a.d(new e.a.d.gg(r4));
        r8.p = 1;
        r8.f47020f = 5;
        r8.f47024j--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
    
        r3 = r8.f47022h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        if ((r3 & com.waze.strings.DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2) != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
    
        if (1 == (r3 & 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        r8.f47021g = r3;
        r3 = r8.f47022h;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r8.f47020f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
    
        if (r3 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        if (r3 > r8.f47016b) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r8.f47026l++;
        r8.f47017c.e();
        r8.f47018d.d();
        r8.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        throw new e.a.eh(e.a.ee.f47410j.g("gRPC frame header malformed: reserved bits not zero"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.gi.h():void");
    }

    private final boolean i() {
        return this.f47023i.f() == 0;
    }

    public final void a() {
        if (g()) {
            return;
        }
        if (i()) {
            close();
        } else {
            this.n = true;
        }
    }

    public final void b(ho hoVar) throws Throwable {
        boolean z = true;
        try {
            if (g() || this.n) {
                hoVar.close();
                return;
            }
            this.f47023i.h(hoVar);
            try {
                h();
            } catch (Throwable th) {
                th = th;
                z = false;
                if (z) {
                    hoVar.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(int i2) {
        com.google.d.b.an.m(i2 > 0, "numMessages must be > 0");
        if (g()) {
            return;
        }
        this.f47024j += i2;
        h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (g()) {
            return;
        }
        ar arVar = this.f47022h;
        boolean z = false;
        if (arVar != null && arVar.f() > 0) {
            z = true;
        }
        try {
            ar arVar2 = this.f47023i;
            if (arVar2 != null) {
                arVar2.close();
            }
            ar arVar3 = this.f47022h;
            if (arVar3 != null) {
                arVar3.close();
            }
            this.f47023i = null;
            this.f47022h = null;
            this.f47015a.j(z);
        } catch (Throwable th) {
            this.f47023i = null;
            this.f47022h = null;
            throw th;
        }
    }

    public final void d(e.a.ae aeVar) {
        com.google.d.b.an.v(true, "Already set full stream decompressor");
        this.f47019e = aeVar;
    }

    final void e(gf gfVar) {
        this.f47015a = gfVar;
    }

    public final void f(int i2) {
        this.f47016b = i2;
    }

    public final boolean g() {
        return this.f47023i == null;
    }
}

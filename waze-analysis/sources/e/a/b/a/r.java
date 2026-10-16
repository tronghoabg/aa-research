package e.a.b.a;

import android.os.Parcel;
import e.a.d.jt;
import e.a.d.jv;
import e.a.d.jw;
import e.a.ee;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class r implements jv {

    /* renamed from: a, reason: collision with root package name */
    protected final k f46436a;

    /* renamed from: b, reason: collision with root package name */
    protected final e.a.c f46437b;

    /* renamed from: c, reason: collision with root package name */
    final int f46438c;

    /* renamed from: d, reason: collision with root package name */
    protected aj f46439d;

    /* renamed from: e, reason: collision with root package name */
    protected jt f46440e;

    /* renamed from: f, reason: collision with root package name */
    protected jw f46441f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f46442g;

    /* renamed from: h, reason: collision with root package name */
    private int f46443h;

    /* renamed from: i, reason: collision with root package name */
    private int f46444i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f46445j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f46446k;

    /* renamed from: l, reason: collision with root package name */
    private int f46447l;
    private int m;
    private p n = p.f46425a;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    /* synthetic */ r(k kVar, e.a.c cVar, int i2) {
        this.f46436a = kVar;
        this.f46437b = cVar;
        this.f46438c = i2;
    }

    private final void p(ee eeVar, ee eeVar2, boolean z) {
        if (o()) {
            return;
        }
        boolean z2 = this.n != p.f46425a;
        l(p.f46430f);
        if (z2) {
            this.f46440e.m();
        }
        if (!z) {
            this.f46436a.y(this.f46438c, eeVar);
        }
        if (z2) {
            a(eeVar2);
        }
        n();
    }

    private final void q() {
        q qVar;
        if (this.f46444i == 0) {
            int i2 = 0;
            while (i2 < this.f46445j.size() && (qVar = (q) this.f46445j.get(i2)) != null) {
                i2++;
                if (qVar.f46435d) {
                    this.f46444i = i2;
                    t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        return this.f46442g != null || this.f46444i > 0;
    }

    private final boolean s() {
        return this.f46446k && this.f46443h >= this.f46447l;
    }

    private final void t() {
        com.google.d.b.an.B(this.f46440e);
        this.f46440e.e();
        this.f46440e.f();
        this.o++;
    }

    protected abstract void a(ee eeVar);

    protected abstract void b();

    abstract void c(int i2, Parcel parcel);

    boolean d() {
        throw null;
    }

    abstract void e(Parcel parcel);

    @Override // e.a.d.jv
    public final synchronized InputStream f() {
        l lVar;
        InputStream inputStream = this.f46442g;
        if (inputStream != null) {
            this.f46442g = null;
        } else if (this.p <= 0 || !r()) {
            inputStream = null;
        } else {
            int i2 = this.f46444i;
            this.f46444i = 0;
            if (i2 == 1) {
                q qVar = (q) this.f46445j.remove(0);
                int i3 = qVar.f46434c;
                InputStream inputStream2 = qVar.f46432a;
                lVar = new l(qVar.f46433b);
            } else {
                byte[][] bArr = new byte[i2][];
                int length = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr2 = ((q) this.f46445j.remove(0)).f46433b;
                    bArr[i4] = bArr2;
                    length += bArr2.length;
                }
                lVar = new l(bArr, length);
            }
            this.f46443h += i2;
            q();
            inputStream = lVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (s() && !o()) {
                l(p.f46428d);
                i();
                return null;
            }
        }
        return inputStream;
    }

    final void g(ee eeVar) {
        p(eeVar, eeVar, false);
    }

    final void h(ee eeVar) {
        p(ee.f47402b, eeVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            e.a.b.a.p r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            e.a.d.jw r1 = r4.f46441f
            if (r1 == 0) goto L70
            boolean r1 = r4.f46446k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            e.a.d.jw r1 = r4.f46441f
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.r()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.s()
            if (r1 == 0) goto L70
        L37:
            e.a.b.a.p r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.r()
            if (r1 == 0) goto L5a
            r4.r = r0
            e.a.d.jw r1 = r4.f46441f
            r1.e(r4)
            goto L8
        L5a:
            boolean r1 = r4.f46446k
            if (r1 == 0) goto L8
            e.a.b.a.p r1 = e.a.b.a.p.f46428d
            r4.l(r1)
        L63:
            boolean r1 = r4.f46446k
            if (r1 == 0) goto L8
            e.a.b.a.p r1 = e.a.b.a.p.f46429e
            r4.l(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.b.a.r.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: ef -> 0x0143, all -> 0x014d, TRY_ENTER, TryCatch #1 {ef -> 0x0143, blocks: (B:8:0x000b, B:10:0x0018, B:13:0x0021, B:15:0x0035, B:18:0x0040, B:20:0x0044, B:22:0x004e, B:24:0x0054, B:25:0x0057, B:29:0x005e, B:31:0x0062, B:34:0x0068, B:36:0x006c, B:40:0x0073, B:41:0x0082, B:42:0x008b, B:45:0x009e, B:46:0x00a5, B:48:0x00ab, B:50:0x00b9, B:51:0x00bf, B:52:0x00c8, B:53:0x00eb, B:54:0x00ec, B:55:0x0103, B:57:0x0106, B:58:0x010d, B:60:0x0111, B:62:0x0115, B:65:0x011d, B:66:0x0125, B:69:0x0134, B:70:0x013e), top: B:81:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[Catch: ef -> 0x0143, all -> 0x014d, TryCatch #1 {ef -> 0x0143, blocks: (B:8:0x000b, B:10:0x0018, B:13:0x0021, B:15:0x0035, B:18:0x0040, B:20:0x0044, B:22:0x004e, B:24:0x0054, B:25:0x0057, B:29:0x005e, B:31:0x0062, B:34:0x0068, B:36:0x006c, B:40:0x0073, B:41:0x0082, B:42:0x008b, B:45:0x009e, B:46:0x00a5, B:48:0x00ab, B:50:0x00b9, B:51:0x00bf, B:52:0x00c8, B:53:0x00eb, B:54:0x00ec, B:55:0x0103, B:57:0x0106, B:58:0x010d, B:60:0x0111, B:62:0x0115, B:65:0x011d, B:66:0x0125, B:69:0x0134, B:70:0x013e), top: B:81:0x000b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void j(android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.b.a.r.j(android.os.Parcel):void");
    }

    final void k(aj ajVar, jw jwVar) {
        this.f46439d = ajVar;
        this.f46440e = ajVar.c();
        this.f46441f = jwVar;
        if (o()) {
            return;
        }
        l(p.f46426b);
    }

    protected final void l(p pVar) {
        p pVar2 = this.n;
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 1) {
            com.google.d.b.an.z(pVar2 == p.f46425a, "%s -> %s", pVar2, pVar);
        } else if (iOrdinal == 2) {
            com.google.d.b.an.z(pVar2 == p.f46426b || pVar2 == p.f46425a, "%s -> %s", pVar2, pVar);
        } else if (iOrdinal == 3) {
            com.google.d.b.an.z(pVar2 == p.f46427c, "%s -> %s", pVar2, pVar);
        } else if (iOrdinal == 4) {
            com.google.d.b.an.z(pVar2 == p.f46428d, "%s -> %s", pVar2, pVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.n = pVar;
    }

    public final void m(int i2) {
        this.p += i2;
        i();
    }

    final void n() {
        this.f46436a.u(this);
    }

    protected final boolean o() {
        return this.n == p.f46430f;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.f46446k;
        String strValueOf = String.valueOf(this.n);
        boolean zR = r();
        jw jwVar = this.f46441f;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zR);
        sb.append("/Lis=");
        sb.append(jwVar != null);
        sb.append("]");
        return sb.toString();
    }
}

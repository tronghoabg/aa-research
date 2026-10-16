package c2;

import N1.C0765n;
import Q1.k;
import R8.v;
import U1.AbstractC0834d;
import U1.C0840j;
import a2.C1323c;
import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h extends AbstractC0834d {

    /* renamed from: A, reason: collision with root package name */
    public int f19564A;

    /* renamed from: B, reason: collision with root package name */
    public C0765n f19565B;

    /* renamed from: C, reason: collision with root package name */
    public C1547b f19566C;

    /* renamed from: D, reason: collision with root package name */
    public T1.d f19567D;

    /* renamed from: E, reason: collision with root package name */
    public e f19568E;

    /* renamed from: F, reason: collision with root package name */
    public Bitmap f19569F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f19570G;

    /* renamed from: H, reason: collision with root package name */
    public g f19571H;

    /* renamed from: I, reason: collision with root package name */
    public g f19572I;

    /* renamed from: J, reason: collision with root package name */
    public int f19573J;

    /* renamed from: r, reason: collision with root package name */
    public final C1323c f19574r;

    /* renamed from: s, reason: collision with root package name */
    public final T1.d f19575s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f19576t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19577u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19578v;

    /* renamed from: w, reason: collision with root package name */
    public f f19579w;

    /* renamed from: x, reason: collision with root package name */
    public long f19580x;

    /* renamed from: y, reason: collision with root package name */
    public long f19581y;

    /* renamed from: z, reason: collision with root package name */
    public int f19582z;

    public h(C1323c c1323c) {
        super(4);
        this.f19574r = c1323c;
        this.f19568E = e.f19557a;
        this.f19575s = new T1.d(0);
        this.f19579w = f.f19558c;
        this.f19576t = new ArrayDeque();
        this.f19581y = -9223372036854775807L;
        this.f19580x = -9223372036854775807L;
        this.f19582z = 0;
        this.f19564A = 1;
    }

    @Override // U1.AbstractC0834d
    public final void D() throws InterruptedException {
        this.f19565B = null;
        this.f19579w = f.f19558c;
        this.f19576t.clear();
        P();
        this.f19568E.getClass();
    }

    @Override // U1.AbstractC0834d
    public final void E(boolean z2, boolean z10) {
        this.f19564A = z10 ? 1 : 0;
    }

    @Override // U1.AbstractC0834d
    public final void F(long j8, boolean z2) {
        this.f19564A = Math.min(this.f19564A, 1);
        this.f19578v = false;
        this.f19577u = false;
        this.f19569F = null;
        this.f19571H = null;
        this.f19572I = null;
        this.f19570G = false;
        this.f19567D = null;
        C1547b c1547b = this.f19566C;
        if (c1547b != null) {
            c1547b.flush();
        }
        this.f19576t.clear();
    }

    @Override // U1.AbstractC0834d
    public final void G() throws InterruptedException {
        P();
    }

    @Override // U1.AbstractC0834d
    public final void H() throws InterruptedException {
        P();
        this.f19564A = Math.min(this.f19564A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // U1.AbstractC0834d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(N1.C0765n[] r5, long r6, long r8, k2.H r10) {
        /*
            r4 = this;
            c2.f r5 = r4.f19579w
            long r5 = r5.f19560b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f19576t
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f19581y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f19580x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            c2.f r6 = new c2.f
            long r0 = r4.f19581y
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            c2.f r5 = new c2.f
            r5.<init>(r0, r8)
            r4.f19579w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.K(N1.n[], long, long, k2.H):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(long r13) throws java.lang.InterruptedException, U1.C0840j {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.M(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(long r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.N(long):boolean");
    }

    public final void O() throws InterruptedException, C0840j {
        C0765n c0765n = this.f19565B;
        C1323c c1323c = this.f19574r;
        int iN = c1323c.N(c0765n);
        if (iN != v.a(4, 0, 0, 0) && iN != v.a(3, 0, 0, 0)) {
            throw C(new d("Provided decoder factory can't create decoder for format."), this.f19565B, false, 4005);
        }
        C1547b c1547b = this.f19566C;
        if (c1547b != null) {
            c1547b.release();
        }
        this.f19566C = new C1547b((V1.c) c1323c.f17156b);
    }

    public final void P() throws InterruptedException {
        this.f19567D = null;
        this.f19582z = 0;
        this.f19581y = -9223372036854775807L;
        C1547b c1547b = this.f19566C;
        if (c1547b != null) {
            c1547b.release();
            this.f19566C = null;
        }
    }

    @Override // U1.AbstractC0834d, U1.W
    public final boolean b() {
        return this.f19578v;
    }

    @Override // U1.AbstractC0834d, U1.S
    public final void c(int i5, Object obj) {
        if (i5 != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f19557a;
        }
        this.f19568E = eVar;
    }

    @Override // U1.X
    public final int d(C0765n c0765n) {
        return this.f19574r.N(c0765n);
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // U1.W
    public final boolean isReady() {
        int i5 = this.f19564A;
        if (i5 != 3) {
            return i5 == 0 && this.f19570G;
        }
        return true;
    }

    @Override // U1.W
    public final void v(long j8, long j10) throws InterruptedException, C0840j {
        if (this.f19578v) {
            return;
        }
        if (this.f19565B == null) {
            S3.c cVar = this.f12032c;
            cVar.i();
            T1.d dVar = this.f19575s;
            dVar.o();
            int iL = L(cVar, dVar, 2);
            if (iL != -5) {
                if (iL == -4) {
                    k.g(dVar.h(4));
                    this.f19577u = true;
                    this.f19578v = true;
                    return;
                }
                return;
            }
            C0765n c0765n = (C0765n) cVar.f10937c;
            k.h(c0765n);
            this.f19565B = c0765n;
            O();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (M(j8)) {
            }
            while (N(j8)) {
            }
            Trace.endSection();
        } catch (d e7) {
            throw C(e7, null, false, 4003);
        }
    }
}

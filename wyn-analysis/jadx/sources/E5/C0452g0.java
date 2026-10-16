package E5;

import android.util.Pair;
import f6.C2590c;
import f6.C2604q;
import f6.C2613z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import u6.AbstractC4256a;

/* renamed from: E5.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0452g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final f6.V[] f3391c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3392d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3393e;

    /* renamed from: f, reason: collision with root package name */
    public C0454h0 f3394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f3396h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0449f[] f3397i;

    /* renamed from: j, reason: collision with root package name */
    public final r6.o f3398j;
    public final n0 k;

    /* renamed from: l, reason: collision with root package name */
    public C0452g0 f3399l;

    /* renamed from: m, reason: collision with root package name */
    public f6.a0 f3400m;

    /* renamed from: n, reason: collision with root package name */
    public r6.s f3401n;

    /* renamed from: o, reason: collision with root package name */
    public long f3402o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [f6.c] */
    public C0452g0(AbstractC0449f[] abstractC0449fArr, long j8, r6.o oVar, o2.e eVar, n0 n0Var, C0454h0 c0454h0, r6.s sVar) {
        this.f3397i = abstractC0449fArr;
        this.f3402o = j8;
        this.f3398j = oVar;
        this.k = n0Var;
        C2613z c2613z = c0454h0.f3403a;
        this.f3390b = c2613z.f35112a;
        this.f3394f = c0454h0;
        this.f3400m = f6.a0.f35029d;
        this.f3401n = sVar;
        this.f3391c = new f6.V[abstractC0449fArr.length];
        this.f3396h = new boolean[abstractC0449fArr.length];
        n0Var.getClass();
        Pair pair = (Pair) c2613z.f35112a;
        Object obj = pair.first;
        C2613z c2613zB = c2613z.b(pair.second);
        m0 m0Var = (m0) ((HashMap) n0Var.f3474d).get(obj);
        m0Var.getClass();
        ((HashSet) n0Var.f3476f).add(m0Var);
        C0462l0 c0462l0 = (C0462l0) ((HashMap) n0Var.f3475e).get(m0Var);
        if (c0462l0 != null) {
            c0462l0.f3458a.d(c0462l0.f3459b);
        }
        m0Var.f3465c.add(c2613zB);
        C2604q c2604qA = m0Var.f3463a.a(c2613zB, eVar, c0454h0.f3404b);
        ((IdentityHashMap) n0Var.f3473c).put(c2604qA, m0Var);
        n0Var.g();
        long j10 = c0454h0.f3406d;
        this.f3389a = j10 != -9223372036854775807L ? new C2590c(c2604qA, true, 0L, j10) : c2604qA;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [f6.w, java.lang.Object] */
    public final long a(r6.s sVar, long j8, boolean z2, boolean[] zArr) {
        AbstractC0449f[] abstractC0449fArr;
        f6.V[] vArr;
        int i5 = 0;
        while (true) {
            boolean z10 = true;
            if (i5 >= sVar.f44518a) {
                break;
            }
            if (z2 || !sVar.a(this.f3401n, i5)) {
                z10 = false;
            }
            this.f3396h[i5] = z10;
            i5++;
        }
        int i10 = 0;
        while (true) {
            abstractC0449fArr = this.f3397i;
            int length = abstractC0449fArr.length;
            vArr = this.f3391c;
            if (i10 >= length) {
                break;
            }
            if (abstractC0449fArr[i10].f3345a == -2) {
                vArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f3401n = sVar;
        c();
        long jY = this.f3389a.y(sVar.f44520c, this.f3396h, this.f3391c, zArr, j8);
        for (int i11 = 0; i11 < abstractC0449fArr.length; i11++) {
            if (abstractC0449fArr[i11].f3345a == -2 && this.f3401n.b(i11)) {
                vArr[i11] = new a2.k();
            }
        }
        this.f3393e = false;
        for (int i12 = 0; i12 < vArr.length; i12++) {
            if (vArr[i12] != null) {
                AbstractC4256a.i(sVar.b(i12));
                if (abstractC0449fArr[i12].f3345a != -2) {
                    this.f3393e = true;
                }
            } else {
                AbstractC4256a.i(sVar.f44520c[i12] == null);
            }
        }
        return jY;
    }

    public final void b() {
        if (this.f3399l != null) {
            return;
        }
        int i5 = 0;
        while (true) {
            r6.s sVar = this.f3401n;
            if (i5 >= sVar.f44518a) {
                return;
            }
            boolean zB = sVar.b(i5);
            r6.n nVar = this.f3401n.f44520c[i5];
            if (zB && nVar != null) {
                nVar.a();
            }
            i5++;
        }
    }

    public final void c() {
        if (this.f3399l != null) {
            return;
        }
        int i5 = 0;
        while (true) {
            r6.s sVar = this.f3401n;
            if (i5 >= sVar.f44518a) {
                return;
            }
            boolean zB = sVar.b(i5);
            r6.n nVar = this.f3401n.f44520c[i5];
            if (zB && nVar != null) {
                nVar.i();
            }
            i5++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [f6.W, java.lang.Object] */
    public final long d() {
        if (!this.f3392d) {
            return this.f3394f.f3404b;
        }
        long jN = this.f3393e ? this.f3389a.n() : Long.MIN_VALUE;
        return jN == Long.MIN_VALUE ? this.f3394f.f3407e : jN;
    }

    public final long e() {
        return this.f3394f.f3404b + this.f3402o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f6.w, java.lang.Object] */
    public final void f() {
        b();
        ?? r02 = this.f3389a;
        try {
            boolean z2 = r02 instanceof C2590c;
            n0 n0Var = this.k;
            if (z2) {
                n0Var.p(((C2590c) r02).f35036a);
            } else {
                n0Var.p(r02);
            }
        } catch (RuntimeException e7) {
            AbstractC4256a.p("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r6.s g(float r32, E5.J0 r33) {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.C0452g0.g(float, E5.J0):r6.s");
    }

    public final void h() {
        Object obj = this.f3389a;
        if (obj instanceof C2590c) {
            long j8 = this.f3394f.f3406d;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            C2590c c2590c = (C2590c) obj;
            c2590c.f35040e = 0L;
            c2590c.f35041f = j8;
        }
    }
}

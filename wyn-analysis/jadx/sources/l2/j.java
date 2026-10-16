package l2;

import N1.C;
import N1.C0765n;
import Q1.o;
import S1.z;
import Y2.B;
import k2.c0;

/* loaded from: classes.dex */
public final class j extends AbstractC3376a {

    /* renamed from: o, reason: collision with root package name */
    public final int f39927o;

    /* renamed from: p, reason: collision with root package name */
    public final long f39928p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC3381f f39929q;

    /* renamed from: r, reason: collision with root package name */
    public long f39930r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f39931s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f39932t;

    public j(S1.h hVar, S1.k kVar, C0765n c0765n, int i5, Object obj, long j8, long j10, long j11, long j12, long j13, int i10, long j14, InterfaceC3381f interfaceC3381f) {
        super(hVar, kVar, c0765n, i5, obj, j8, j10, j11, j12, j13);
        this.f39927o = i10;
        this.f39928p = j14;
        this.f39929q = interfaceC3381f;
    }

    @Override // l2.l
    public final long a() {
        return this.f39936j + this.f39927o;
    }

    @Override // l2.l
    public final boolean b() {
        return this.f39932t;
    }

    @Override // o2.j
    public final void g() {
        this.f39931s = true;
    }

    @Override // o2.j
    public final void load() {
        B b5 = this.f39868m;
        Q1.k.h(b5);
        if (this.f39930r == 0) {
            long j8 = this.f39928p;
            for (c0 c0Var : (c0[]) b5.f16384c) {
                if (c0Var.f39031F != j8) {
                    c0Var.f39031F = j8;
                    c0Var.f39057z = true;
                }
            }
            InterfaceC3381f interfaceC3381f = this.f39929q;
            long j10 = this.k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f39928p;
            long j12 = this.f39867l;
            ((C3379d) interfaceC3381f).a(b5, j11, j12 != -9223372036854775807L ? j12 - this.f39928p : -9223372036854775807L);
        }
        try {
            S1.k kVarA = this.f39890b.a(this.f39930r);
            z zVar = this.f39897i;
            s2.j jVar = new s2.j(zVar, kVarA.f10874e, zVar.y(kVarA));
            while (!this.f39931s) {
                try {
                    int iK = ((C3379d) this.f39929q).f39880a.k(jVar, C3379d.k);
                    Q1.k.g(iK != 1);
                    if (!(iK == 0)) {
                        break;
                    }
                } finally {
                    this.f39930r = jVar.f44898d - this.f39890b.f10874e;
                }
            }
            C0765n c0765n = this.f39892d;
            if (C.j(c0765n.f8231m)) {
                int i5 = c0765n.f8217J;
                int i10 = c0765n.f8218K;
                if ((i5 > 1 || i10 > 1) && i5 != -1 && i10 != -1) {
                    s2.C cF = b5.F(4);
                    int i11 = i5 * i10;
                    long j13 = (this.f39896h - this.f39895g) / i11;
                    for (int i12 = 1; i12 < i11; i12++) {
                        cF.e(0, new o());
                        cF.a(i12 * j13, 0, 0, 0, null);
                    }
                }
            }
            Fe.b.m(this.f39897i);
            this.f39932t = !this.f39931s;
        } catch (Throwable th) {
            Fe.b.m(this.f39897i);
            throw th;
        }
    }
}

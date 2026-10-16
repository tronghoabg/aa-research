package u2;

import G5.C0522c;
import Q1.o;
import Q1.x;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.j;
import s2.m;
import s2.n;
import wa.C4398a;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f46524a;

    /* renamed from: b, reason: collision with root package name */
    public final C0522c f46525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46526c;

    /* renamed from: d, reason: collision with root package name */
    public final C4398a f46527d;

    /* renamed from: e, reason: collision with root package name */
    public int f46528e;

    /* renamed from: f, reason: collision with root package name */
    public s2.o f46529f;

    /* renamed from: g, reason: collision with root package name */
    public c f46530g;

    /* renamed from: h, reason: collision with root package name */
    public long f46531h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f46532i;

    /* renamed from: j, reason: collision with root package name */
    public long f46533j;
    public e k;

    /* renamed from: l, reason: collision with root package name */
    public int f46534l;

    /* renamed from: m, reason: collision with root package name */
    public long f46535m;

    /* renamed from: n, reason: collision with root package name */
    public long f46536n;

    /* renamed from: o, reason: collision with root package name */
    public int f46537o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46538p;

    public b(int i5, C4398a c4398a) {
        this.f46527d = c4398a;
        this.f46526c = (i5 & 1) == 0;
        this.f46524a = new o(12);
        this.f46525b = new C0522c();
        this.f46529f = new ab.b();
        this.f46532i = new e[0];
        this.f46535m = -1L;
        this.f46536n = -1L;
        this.f46534l = -1;
        this.f46531h = -9223372036854775807L;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f46533j = -1L;
        this.k = null;
        for (e eVar : this.f46532i) {
            if (eVar.f46556j == 0) {
                eVar.f46554h = 0;
            } else {
                eVar.f46554h = eVar.f46558m[x.e(eVar.f46557l, j8, true)];
            }
        }
        if (j8 != 0) {
            this.f46528e = 6;
        } else if (this.f46532i.length == 0) {
            this.f46528e = 0;
        } else {
            this.f46528e = 3;
        }
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f46528e = 0;
        if (this.f46526c) {
            oVar = new Dd.c(oVar, this.f46527d);
        }
        this.f46529f = oVar;
        this.f46533j = -1L;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        o oVar = this.f46524a;
        ((j) nVar).c(oVar.f9702a, 0, 12, false);
        oVar.G(0);
        if (oVar.j() == 1179011410) {
            oVar.H(4);
            if (oVar.j() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r23, J5.n r24) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}

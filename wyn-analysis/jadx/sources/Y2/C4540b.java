package y2;

import Q1.o;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.j;
import s2.l;
import s2.m;
import s2.n;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4540b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f47964a = new o(4);

    /* renamed from: b, reason: collision with root package name */
    public final o f47965b = new o(9);

    /* renamed from: c, reason: collision with root package name */
    public final o f47966c = new o(11);

    /* renamed from: d, reason: collision with root package name */
    public final o f47967d = new o();

    /* renamed from: e, reason: collision with root package name */
    public final C4541c f47968e;

    /* renamed from: f, reason: collision with root package name */
    public s2.o f47969f;

    /* renamed from: g, reason: collision with root package name */
    public int f47970g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47971h;

    /* renamed from: i, reason: collision with root package name */
    public long f47972i;

    /* renamed from: j, reason: collision with root package name */
    public int f47973j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f47974l;

    /* renamed from: m, reason: collision with root package name */
    public long f47975m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f47976n;

    /* renamed from: o, reason: collision with root package name */
    public C4539a f47977o;

    /* renamed from: p, reason: collision with root package name */
    public C4542d f47978p;

    public C4540b() {
        C4541c c4541c = new C4541c(new l());
        c4541c.f47979b = -9223372036854775807L;
        c4541c.f47980c = new long[0];
        c4541c.f47981d = new long[0];
        this.f47968e = c4541c;
        this.f47970g = 1;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f47970g = 1;
            this.f47971h = false;
        } else {
            this.f47970g = 3;
        }
        this.f47973j = 0;
    }

    public final o b(j jVar) throws EOFException, InterruptedIOException {
        int i5 = this.f47974l;
        o oVar = this.f47967d;
        byte[] bArr = oVar.f9702a;
        if (i5 > bArr.length) {
            oVar.E(0, new byte[Math.max(bArr.length * 2, i5)]);
        } else {
            oVar.G(0);
        }
        oVar.F(this.f47974l);
        jVar.f(oVar.f9702a, 0, this.f47974l, false);
        return oVar;
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f47969f = oVar;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) throws EOFException, InterruptedIOException {
        o oVar = this.f47964a;
        j jVar = (j) nVar;
        jVar.c(oVar.f9702a, 0, 3, false);
        oVar.G(0);
        if (oVar.x() == 4607062) {
            jVar.c(oVar.f9702a, 0, 2, false);
            oVar.G(0);
            if ((oVar.A() & 250) == 0) {
                jVar.c(oVar.f9702a, 0, 4, false);
                oVar.G(0);
                int iH = oVar.h();
                jVar.f44900f = 0;
                jVar.b(iH, false);
                jVar.c(oVar.f9702a, 0, 4, false);
                oVar.G(0);
                if (oVar.h() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0285  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r32, J5.n r33) throws java.io.EOFException, java.io.InterruptedIOException, j2.d {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C4540b.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}

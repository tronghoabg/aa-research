package Y2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class d implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final int f16404a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16405b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16406c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.o f16407d;

    /* renamed from: e, reason: collision with root package name */
    public final J5.y f16408e;

    /* renamed from: f, reason: collision with root package name */
    public s2.o f16409f;

    /* renamed from: g, reason: collision with root package name */
    public long f16410g;

    /* renamed from: h, reason: collision with root package name */
    public long f16411h;

    /* renamed from: i, reason: collision with root package name */
    public int f16412i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16413j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16414l;

    public d(int i5) {
        this.f16404a = (i5 & 2) != 0 ? i5 | 1 : i5;
        this.f16405b = new e(0, null, true);
        this.f16406c = new Q1.o(2048);
        this.f16412i = -1;
        this.f16411h = -1L;
        Q1.o oVar = new Q1.o(10);
        this.f16407d = oVar;
        byte[] bArr = oVar.f9702a;
        this.f16408e = new J5.y(bArr, bArr.length, 1, (byte) 0);
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.k = false;
        this.f16405b.a();
        this.f16410g = j10;
    }

    public final int b(s2.j jVar) throws EOFException, InterruptedIOException {
        int i5 = 0;
        while (true) {
            Q1.o oVar = this.f16407d;
            jVar.c(oVar.f9702a, 0, 10, false);
            oVar.G(0);
            if (oVar.x() != 4801587) {
                break;
            }
            oVar.H(3);
            int iT = oVar.t();
            i5 += iT + 10;
            jVar.b(iT, false);
        }
        jVar.f44900f = 0;
        jVar.b(i5, false);
        if (this.f16411h == -1) {
            this.f16411h = i5;
        }
        return i5;
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f16409f = oVar;
        this.f16405b.f(oVar, new T5.B(0, 1, 1, (byte) 0));
        oVar.l();
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) throws EOFException, InterruptedIOException {
        s2.j jVar = (s2.j) nVar;
        int iB = b(jVar);
        int i5 = iB;
        int i10 = 0;
        int i11 = 0;
        do {
            Q1.o oVar = this.f16407d;
            jVar.c(oVar.f9702a, 0, 2, false);
            oVar.G(0);
            if ((oVar.A() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                jVar.c(oVar.f9702a, 0, 4, false);
                J5.y yVar = this.f16408e;
                yVar.q(14);
                int i12 = yVar.i(13);
                if (i12 <= 6) {
                    i5++;
                    jVar.f44900f = 0;
                    jVar.b(i5, false);
                } else {
                    jVar.b(i12 - 6, false);
                    i11 += i12;
                }
            } else {
                i5++;
                jVar.f44900f = 0;
                jVar.b(i5, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i5 - iB < 8192);
        return false;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r20, J5.n r21) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.d.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}

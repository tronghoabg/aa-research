package A2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.j;
import s2.m;
import s2.n;
import s2.o;
import s2.q;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: b, reason: collision with root package name */
    public o f256b;

    /* renamed from: c, reason: collision with root package name */
    public int f257c;

    /* renamed from: d, reason: collision with root package name */
    public int f258d;

    /* renamed from: e, reason: collision with root package name */
    public int f259e;

    /* renamed from: g, reason: collision with root package name */
    public H2.a f261g;

    /* renamed from: h, reason: collision with root package name */
    public j f262h;

    /* renamed from: i, reason: collision with root package name */
    public d f263i;

    /* renamed from: j, reason: collision with root package name */
    public M2.o f264j;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.o f255a = new Q1.o(6);

    /* renamed from: f, reason: collision with root package name */
    public long f260f = -1;

    @Override // s2.m
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f257c = 0;
            this.f264j = null;
        } else if (this.f257c == 5) {
            M2.o oVar = this.f264j;
            oVar.getClass();
            oVar.a(j8, j10);
        }
    }

    public final void b() {
        o oVar = this.f256b;
        oVar.getClass();
        oVar.l();
        this.f256b.s(new q(-9223372036854775807L));
        this.f257c = 6;
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f256b = oVar;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) throws EOFException, InterruptedIOException {
        j jVar = (j) nVar;
        Q1.o oVar = this.f255a;
        oVar.D(2);
        jVar.c(oVar.f9702a, 0, 2, false);
        if (oVar.A() == 65496) {
            oVar.D(2);
            jVar.c(oVar.f9702a, 0, 2, false);
            int iA = oVar.A();
            this.f258d = iA;
            if (iA == 65504) {
                oVar.D(2);
                jVar.c(oVar.f9702a, 0, 2, false);
                jVar.b(oVar.A() - 2, false);
                oVar.D(2);
                jVar.c(oVar.f9702a, 0, 2, false);
                this.f258d = oVar.A();
            }
            if (this.f258d == 65505) {
                jVar.b(2, false);
                oVar.D(6);
                jVar.c(oVar.f9702a, 0, 6, false);
                if (oVar.w() == 1165519206 && oVar.A() == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r29, J5.n r30) throws N1.D, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.a.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
        M2.o oVar = this.f264j;
        if (oVar != null) {
            oVar.getClass();
        }
    }
}

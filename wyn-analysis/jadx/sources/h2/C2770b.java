package h2;

import J5.y;
import Q1.k;
import Q1.o;
import Q1.x;
import g2.C2691l;
import s2.AbstractC3991a;
import s2.C;
import s2.C3992b;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2770b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f35973a;

    /* renamed from: c, reason: collision with root package name */
    public C f35975c;

    /* renamed from: d, reason: collision with root package name */
    public int f35976d;

    /* renamed from: f, reason: collision with root package name */
    public long f35978f;

    /* renamed from: g, reason: collision with root package name */
    public long f35979g;

    /* renamed from: b, reason: collision with root package name */
    public final y f35974b = new y(1);

    /* renamed from: e, reason: collision with root package name */
    public long f35977e = -9223372036854775807L;

    public C2770b(C2691l c2691l) {
        this.f35973a = c2691l;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f35977e = j8;
        this.f35979g = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        int iU = oVar.u() & 3;
        int iU2 = oVar.u() & 255;
        long jN = S3.f.N(this.f35979g, j8, this.f35973a.f35620b, this.f35977e);
        if (iU != 0) {
            if (iU == 1 || iU == 2) {
                int i10 = this.f35976d;
                if (i10 > 0) {
                    C c10 = this.f35975c;
                    int i11 = x.f9724a;
                    c10.a(this.f35978f, 1, i10, 0, null);
                    this.f35976d = 0;
                }
            } else if (iU != 3) {
                throw new IllegalArgumentException(String.valueOf(iU));
            }
            int iA = oVar.a();
            C c11 = this.f35975c;
            c11.getClass();
            c11.e(iA, oVar);
            int i12 = this.f35976d + iA;
            this.f35976d = i12;
            this.f35978f = jN;
            if (z2 && iU == 3) {
                C c12 = this.f35975c;
                int i13 = x.f9724a;
                c12.a(jN, 1, i12, 0, null);
                this.f35976d = 0;
                return;
            }
            return;
        }
        int i14 = this.f35976d;
        if (i14 > 0) {
            C c13 = this.f35975c;
            int i15 = x.f9724a;
            c13.a(this.f35978f, 1, i14, 0, null);
            this.f35976d = 0;
        }
        if (iU2 == 1) {
            int iA2 = oVar.a();
            C c14 = this.f35975c;
            c14.getClass();
            c14.e(iA2, oVar);
            C c15 = this.f35975c;
            int i16 = x.f9724a;
            c15.a(jN, 1, iA2, 0, null);
            return;
        }
        byte[] bArr = oVar.f9702a;
        y yVar = this.f35974b;
        yVar.getClass();
        yVar.o(bArr.length, bArr);
        yVar.u(2);
        long j10 = jN;
        for (int i17 = 0; i17 < iU2; i17++) {
            C3992b c3992bO = AbstractC3991a.o(yVar);
            C c16 = this.f35975c;
            c16.getClass();
            int i18 = c3992bO.f44858d;
            c16.e(i18, oVar);
            C c17 = this.f35975c;
            int i19 = x.f9724a;
            c17.a(j10, 1, c3992bO.f44858d, 0, null);
            j10 += (c3992bO.f44859e / c3992bO.f44856b) * 1000000;
            yVar.u(i18);
        }
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 1);
        this.f35975c = cMo0m;
        cMo0m.c(this.f35973a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        k.g(this.f35977e == -9223372036854775807L);
        this.f35977e = j8;
    }
}

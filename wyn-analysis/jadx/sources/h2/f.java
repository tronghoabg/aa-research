package h2;

import J5.y;
import N1.D;
import Q1.k;
import Q1.o;
import Q1.x;
import g2.C2688i;
import g2.C2691l;
import ka.AbstractC3256n;
import l8.j0;
import s2.C;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f36011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36012b;

    /* renamed from: c, reason: collision with root package name */
    public C f36013c;

    /* renamed from: d, reason: collision with root package name */
    public long f36014d;

    /* renamed from: e, reason: collision with root package name */
    public int f36015e;

    /* renamed from: f, reason: collision with root package name */
    public int f36016f;

    /* renamed from: g, reason: collision with root package name */
    public long f36017g;

    /* renamed from: h, reason: collision with root package name */
    public long f36018h;

    public f(C2691l c2691l) {
        this.f36011a = c2691l;
        try {
            this.f36012b = e(c2691l.f35622d);
            this.f36014d = -9223372036854775807L;
            this.f36015e = -1;
            this.f36016f = 0;
            this.f36017g = 0L;
            this.f36018h = -9223372036854775807L;
        } catch (D e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int e(j0 j0Var) throws D {
        String str = (String) j0Var.get("config");
        int i5 = 0;
        i5 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] bArrR = x.r(str);
            y yVar = new y(bArrR, bArrR.length, 1, (byte) 0);
            int i10 = yVar.i(1);
            if (i10 != 0) {
                throw new D(AbstractC3256n.g(i10, "unsupported audio mux version: "), null, true, 0);
            }
            k.b("Only supports allStreamsSameTimeFraming.", yVar.i(1) == 1);
            int i11 = yVar.i(6);
            k.b("Only suppors one program.", yVar.i(4) == 0);
            k.b("Only suppors one layer.", yVar.i(3) == 0);
            i5 = i11;
        }
        return i5 + 1;
    }

    @Override // h2.i
    public final void a(long j8, long j10) {
        this.f36014d = j8;
        this.f36016f = 0;
        this.f36017g = j10;
    }

    @Override // h2.i
    public final void b(o oVar, long j8, int i5, boolean z2) {
        k.h(this.f36013c);
        int iA = C2688i.a(this.f36015e);
        if (this.f36016f > 0 && iA < i5) {
            C c10 = this.f36013c;
            c10.getClass();
            c10.a(this.f36018h, 1, this.f36016f, 0, null);
            this.f36016f = 0;
            this.f36018h = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f36012b; i10++) {
            int i11 = 0;
            while (oVar.f9703b < oVar.f9704c) {
                int iU = oVar.u();
                i11 += iU;
                if (iU != 255) {
                    break;
                }
            }
            this.f36013c.e(i11, oVar);
            this.f36016f += i11;
        }
        this.f36018h = S3.f.N(this.f36017g, j8, this.f36011a.f35620b, this.f36014d);
        if (z2) {
            C c11 = this.f36013c;
            c11.getClass();
            c11.a(this.f36018h, 1, this.f36016f, 0, null);
            this.f36016f = 0;
            this.f36018h = -9223372036854775807L;
        }
        this.f36015e = i5;
    }

    @Override // h2.i
    public final void c(s2.o oVar, int i5) {
        C cMo0m = oVar.mo0m(i5, 2);
        this.f36013c = cMo0m;
        int i10 = x.f9724a;
        cMo0m.c(this.f36011a.f35621c);
    }

    @Override // h2.i
    public final void d(long j8) {
        k.g(this.f36014d == -9223372036854775807L);
        this.f36014d = j8;
    }
}

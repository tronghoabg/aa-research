package f6;

import A.e0;
import A7.B1;
import java.io.IOException;
import t6.C4129E;
import t6.HandlerC4127C;

/* renamed from: f6.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2582L implements V {

    /* renamed from: a, reason: collision with root package name */
    public final int f34913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2584N f34914b;

    public C2582L(C2584N c2584n, int i5) {
        this.f34914b = c2584n;
        this.f34913a = i5;
    }

    @Override // f6.V
    public final void a() throws IOException {
        C2584N c2584n = this.f34914b;
        U u10 = c2584n.f34945r[this.f34913a];
        e0 e0Var = u10.f34989h;
        if (e0Var != null && e0Var.r() == 1) {
            I5.d dVarP = u10.f34989h.p();
            dVarP.getClass();
            throw dVarP;
        }
        int iG = c2584n.f34932d.g(c2584n.f34918A);
        C4129E c4129e = c2584n.f34938j;
        IOException iOException = c4129e.f45822c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC4127C handlerC4127C = c4129e.f45821b;
        if (handlerC4127C != null) {
            if (iG == Integer.MIN_VALUE) {
                iG = handlerC4127C.f45809a;
            }
            IOException iOException2 = handlerC4127C.f45812d;
            if (iOException2 != null && handlerC4127C.f45813e > iG) {
                throw iOException2;
            }
        }
    }

    @Override // f6.V
    public final int g(long j8) {
        C2584N c2584n = this.f34914b;
        int i5 = this.f34913a;
        int i10 = 0;
        if (c2584n.C()) {
            return 0;
        }
        c2584n.v(i5);
        U u10 = c2584n.f34945r[i5];
        boolean z2 = c2584n.f34927J;
        synchronized (u10) {
            int iJ = u10.j(u10.f34999s);
            int i11 = u10.f34999s;
            int i12 = u10.f34996p;
            if ((i11 != i12) && j8 >= u10.f34994n[iJ]) {
                if (j8 <= u10.f35002v || !z2) {
                    int iH = u10.h(iJ, i12 - i11, j8, true);
                    if (iH != -1) {
                        i10 = iH;
                    }
                } else {
                    i10 = i12 - i11;
                }
            }
        }
        u10.r(i10);
        if (i10 == 0) {
            c2584n.w(i5);
        }
        return i10;
    }

    @Override // f6.V
    public final int h(S3.s sVar, H5.h hVar, int i5) {
        int i10;
        C2584N c2584n = this.f34914b;
        int i11 = this.f34913a;
        if (c2584n.C()) {
            return -3;
        }
        c2584n.v(i11);
        U u10 = c2584n.f34945r[i11];
        boolean z2 = c2584n.f34927J;
        u10.getClass();
        boolean z10 = (i5 & 2) != 0;
        c2.g gVar = u10.f34983b;
        synchronized (u10) {
            try {
                hVar.f4918e = false;
                int i12 = u10.f34999s;
                if (i12 != u10.f34996p) {
                    E5.T t10 = ((T) u10.f34984c.i(u10.f34997q + i12)).f34978a;
                    if (!z10 && t10 == u10.f34988g) {
                        int iJ = u10.j(u10.f34999s);
                        if (u10.m(iJ)) {
                            hVar.f4893b = u10.f34993m[iJ];
                            long j8 = u10.f34994n[iJ];
                            hVar.f4919f = j8;
                            if (j8 < u10.f35000t) {
                                hVar.b(Integer.MIN_VALUE);
                            }
                            gVar.f19561a = u10.f34992l[iJ];
                            gVar.f19562b = u10.k[iJ];
                            gVar.f19563c = u10.f34995o[iJ];
                            i10 = -4;
                        } else {
                            hVar.f4918e = true;
                            i10 = -3;
                        }
                    }
                    u10.n(t10, sVar);
                    i10 = -5;
                } else {
                    if (!z2 && !u10.f35003w) {
                        E5.T t11 = u10.f35006z;
                        if (t11 == null || (!z10 && t11 == u10.f34988g)) {
                            i10 = -3;
                        }
                        u10.n(t11, sVar);
                        i10 = -5;
                    }
                    hVar.f4893b = 4;
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !hVar.h(4)) {
            boolean z11 = (i5 & 1) != 0;
            if ((i5 & 4) == 0) {
                if (z11) {
                    S s10 = u10.f34982a;
                    S.j((B1) s10.f34976g, hVar, u10.f34983b, (Y4.b) s10.f34974e);
                } else {
                    S s11 = u10.f34982a;
                    s11.f34976g = S.j((B1) s11.f34976g, hVar, u10.f34983b, (Y4.b) s11.f34974e);
                }
            }
            if (!z11) {
                u10.f34999s++;
            }
        }
        if (i10 == -3) {
            c2584n.w(i11);
        }
        return i10;
    }

    @Override // f6.V
    public final boolean isReady() {
        C2584N c2584n = this.f34914b;
        return !c2584n.C() && c2584n.f34945r[this.f34913a].l(c2584n.f34927J);
    }
}

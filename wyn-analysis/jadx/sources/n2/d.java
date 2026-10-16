package N2;

import N1.D;
import Q1.x;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.AbstractC3991a;
import s2.m;
import s2.n;
import s2.o;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public o f8346a;

    /* renamed from: b, reason: collision with root package name */
    public i f8347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8348c;

    @Override // s2.m
    public final void a(long j8, long j10) {
        i iVar = this.f8347b;
        if (iVar != null) {
            e eVar = (e) iVar.f8374j;
            f fVar = (f) eVar.f8353e;
            fVar.f8355a = 0;
            fVar.f8356b = 0L;
            fVar.f8357c = 0;
            fVar.f8358d = 0;
            fVar.f8359e = 0;
            ((Q1.o) eVar.f8354f).D(0);
            eVar.f8350b = -1;
            eVar.f8352d = false;
            if (j8 == 0) {
                iVar.f(!iVar.f8372h);
                return;
            }
            if (iVar.f8369e != 0) {
                long j11 = (iVar.f8370f * j10) / 1000000;
                iVar.f8366b = j11;
                g gVar = (g) iVar.f8376m;
                int i5 = x.f9724a;
                gVar.b(j11);
                iVar.f8369e = 2;
            }
        }
    }

    public final boolean b(s2.j jVar) {
        boolean z2;
        f fVar = new f(0);
        if (fVar.b(jVar, true) && (fVar.f8355a & 2) == 2) {
            int iMin = Math.min(fVar.f8359e, 8);
            Q1.o oVar = new Q1.o(iMin);
            jVar.c(oVar.f9702a, 0, iMin, false);
            oVar.G(0);
            if (oVar.a() >= 5 && oVar.u() == 127 && oVar.w() == 1179402563) {
                this.f8347b = new c(0);
                return true;
            }
            oVar.G(0);
            try {
                z2 = AbstractC3991a.z(1, oVar, true);
            } catch (D unused) {
                z2 = false;
            }
            if (z2) {
                this.f8347b = new k(0);
            } else {
                oVar.G(0);
                if (h.g(oVar, h.f8362p)) {
                    this.f8347b = new h(0);
                }
            }
            return true;
        }
        return false;
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f8346a = oVar;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        try {
            return b((s2.j) nVar);
        } catch (D unused) {
            return false;
        }
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r20, J5.n r21) throws N1.D, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.d.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}

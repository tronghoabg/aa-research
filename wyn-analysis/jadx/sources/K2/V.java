package k2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class V implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f38956b;

    public V(X x5, int i5) {
        this.f38956b = x5;
        this.f38955a = i5;
    }

    @Override // k2.d0
    public final void a() throws IOException {
        X x5 = this.f38956b;
        x5.f38993t[this.f38955a].x();
        int iG = x5.f38978d.g(x5.f38964D);
        o2.m mVar = x5.f38985l;
        IOException iOException = mVar.f41322c;
        if (iOException != null) {
            throw iOException;
        }
        o2.i iVar = mVar.f41321b;
        if (iVar != null) {
            if (iG == Integer.MIN_VALUE) {
                iG = iVar.f41307a;
            }
            IOException iOException2 = iVar.f41311e;
            if (iOException2 != null && iVar.f41312f > iG) {
                throw iOException2;
            }
        }
    }

    @Override // k2.d0
    public final int g(long j8) {
        X x5 = this.f38956b;
        if (x5.F()) {
            return 0;
        }
        int i5 = this.f38955a;
        x5.x(i5);
        c0 c0Var = x5.f38993t[i5];
        int iT = c0Var.t(j8, x5.f38973N);
        c0Var.G(iT);
        if (iT == 0) {
            x5.y(i5);
        }
        return iT;
    }

    @Override // k2.d0
    public final boolean isReady() {
        X x5 = this.f38956b;
        return !x5.F() && x5.f38993t[this.f38955a].v(x5.f38973N);
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        X x5 = this.f38956b;
        if (x5.F()) {
            return -3;
        }
        int i10 = this.f38955a;
        x5.x(i10);
        int iA = x5.f38993t[i10].A(cVar, dVar, i5, x5.f38973N);
        if (iA == -3) {
            x5.y(i10);
        }
        return iA;
    }
}

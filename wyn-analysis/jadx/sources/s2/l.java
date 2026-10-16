package s2;

import N1.C0765n;
import N1.InterfaceC0758g;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class l implements C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f44912a = new byte[4096];

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) throws EOFException {
        byte[] bArr = this.f44912a;
        int i10 = interfaceC0758g.read(bArr, 0, Math.min(bArr.length, i5));
        if (i10 != -1) {
            return i10;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final /* synthetic */ void e(int i5, Q1.o oVar) {
        pd.f.b(this, oVar, i5);
    }

    @Override // s2.C
    public final void f(Q1.o oVar, int i5, int i10) {
        oVar.H(i5);
    }

    @Override // s2.C
    public final void c(C0765n c0765n) {
    }

    @Override // s2.C
    public final void a(long j8, int i5, int i10, int i11, B b5) {
    }
}

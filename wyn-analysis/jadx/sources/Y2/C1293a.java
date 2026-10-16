package Y2;

import com.applovin.shadow.okio.Utf8;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.apache.tika.fork.ForkServer;
import s2.AbstractC3991a;

/* renamed from: Y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293a implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final C1294b f16385a = new C1294b();

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f16386b = new Q1.o(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16387c;

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f16387c = false;
        this.f16385a.a();
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f16385a.f(oVar, new T5.B(0, 1, 1, (byte) 0));
        oVar.l();
        oVar.s(new s2.q(-9223372036854775807L));
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) throws EOFException, InterruptedIOException {
        s2.j jVar;
        int iH;
        Q1.o oVar = new Q1.o(10);
        int i5 = 0;
        while (true) {
            jVar = (s2.j) nVar;
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
        int i10 = 0;
        int i11 = i5;
        while (true) {
            jVar.c(oVar.f9702a, 0, 6, false);
            oVar.G(0);
            if (oVar.A() != 2935) {
                jVar.f44900f = 0;
                i11++;
                if (i11 - i5 >= 8192) {
                    break;
                }
                jVar.b(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = oVar.f9702a;
                if (bArr.length < 6) {
                    iH = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iH = ((((bArr[2] & 7) << 8) | (bArr[3] & ForkServer.ERROR)) + 1) * 2;
                } else {
                    byte b5 = bArr[4];
                    iH = AbstractC3991a.h((b5 & 192) >> 6, b5 & Utf8.REPLACEMENT_BYTE);
                }
                if (iH == -1) {
                    break;
                }
                jVar.b(iH - 6, false);
            }
        }
        return false;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(s2.n nVar, J5.n nVar2) throws EOFException, InterruptedIOException {
        Q1.o oVar = this.f16386b;
        int i5 = ((s2.j) nVar).read(oVar.f9702a, 0, 2786);
        if (i5 == -1) {
            return -1;
        }
        oVar.G(0);
        oVar.F(i5);
        boolean z2 = this.f16387c;
        C1294b c1294b = this.f16385a;
        if (!z2) {
            c1294b.f16400n = 0L;
            this.f16387c = true;
        }
        c1294b.e(oVar);
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}

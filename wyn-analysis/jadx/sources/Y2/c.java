package Y2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class c implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final C1294b f16401a = new C1294b(null, 0, 1);

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f16402b = new Q1.o(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16403c;

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f16403c = false;
        this.f16401a.a();
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f16401a.f(oVar, new T5.B(0, 1, 1, (byte) 0));
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
        int i5;
        Q1.o oVar = new Q1.o(10);
        int i10 = 0;
        while (true) {
            jVar = (s2.j) nVar;
            jVar.c(oVar.f9702a, 0, 10, false);
            oVar.G(0);
            if (oVar.x() != 4801587) {
                break;
            }
            oVar.H(3);
            int iT = oVar.t();
            i10 += iT + 10;
            jVar.b(iT, false);
        }
        jVar.f44900f = 0;
        jVar.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            jVar.c(oVar.f9702a, 0, 7, false);
            oVar.G(0);
            int iA = oVar.A();
            if (iA == 44096 || iA == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = oVar.f9702a;
                if (bArr.length < 7) {
                    i5 = -1;
                } else {
                    int i14 = ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & ForkServer.ERROR) << 16) | ((bArr[5] & ForkServer.ERROR) << 8) | (bArr[6] & ForkServer.ERROR);
                    } else {
                        i13 = 4;
                    }
                    if (iA == 44097) {
                        i13 += 2;
                    }
                    i5 = i14 + i13;
                }
                if (i5 == -1) {
                    break;
                }
                jVar.b(i5 - 7, false);
            } else {
                jVar.f44900f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                jVar.b(i12, false);
                i11 = 0;
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
        Q1.o oVar = this.f16402b;
        int i5 = ((s2.j) nVar).read(oVar.f9702a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i5 == -1) {
            return -1;
        }
        oVar.G(0);
        oVar.F(i5);
        boolean z2 = this.f16403c;
        C1294b c1294b = this.f16401a;
        if (!z2) {
            c1294b.f16400n = 0L;
            this.f16403c = true;
        }
        c1294b.e(oVar);
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}

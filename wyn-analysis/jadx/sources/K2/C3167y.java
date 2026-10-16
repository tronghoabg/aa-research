package k2;

import android.net.Uri;
import java.util.Map;

/* renamed from: k2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3167y implements S1.h {

    /* renamed from: a, reason: collision with root package name */
    public final S1.h f39171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39172b;

    /* renamed from: c, reason: collision with root package name */
    public final U f39173c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f39174d;

    /* renamed from: e, reason: collision with root package name */
    public int f39175e;

    public C3167y(S1.h hVar, int i5, U u10) {
        Q1.k.c(i5 > 0);
        this.f39171a = hVar;
        this.f39172b = i5;
        this.f39173c = u10;
        this.f39174d = new byte[1];
        this.f39175e = i5;
    }

    @Override // S1.h
    public final void C(S1.A a5) {
        a5.getClass();
        this.f39171a.C(a5);
    }

    @Override // S1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // S1.h
    public final Map d() {
        return this.f39171a.d();
    }

    @Override // S1.h
    public final Uri k() {
        return this.f39171a.k();
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        int i11 = this.f39175e;
        S1.h hVar = this.f39171a;
        if (i11 == 0) {
            byte[] bArr2 = this.f39174d;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = hVar.read(bArr3, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        Q1.o oVar = new Q1.o(bArr3, i13);
                        U u10 = this.f39173c;
                        long jMax = !u10.f38953l ? u10.f38951i : Math.max(u10.f38954m.t(true), u10.f38951i);
                        int iA = oVar.a();
                        s2.C c10 = u10.k;
                        c10.getClass();
                        c10.e(iA, oVar);
                        c10.a(jMax, 1, iA, 0, null);
                        u10.f38953l = true;
                    }
                }
                this.f39175e = this.f39172b;
            }
            return -1;
        }
        int i16 = hVar.read(bArr, i5, Math.min(this.f39175e, i10));
        if (i16 != -1) {
            this.f39175e -= i16;
        }
        return i16;
    }

    @Override // S1.h
    public final long y(S1.k kVar) {
        throw new UnsupportedOperationException();
    }
}

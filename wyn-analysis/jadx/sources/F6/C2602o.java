package f6;

import android.net.Uri;
import java.util.Map;
import t6.InterfaceC4144l;
import u6.AbstractC4256a;

/* renamed from: f6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2602o implements InterfaceC4144l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4144l f35082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35083b;

    /* renamed from: c, reason: collision with root package name */
    public final C2581K f35084c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f35085d;

    /* renamed from: e, reason: collision with root package name */
    public int f35086e;

    public C2602o(InterfaceC4144l interfaceC4144l, int i5, C2581K c2581k) {
        AbstractC4256a.e(i5 > 0);
        this.f35082a = interfaceC4144l;
        this.f35083b = i5;
        this.f35084c = c2581k;
        this.f35085d = new byte[1];
        this.f35086e = i5;
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // t6.InterfaceC4144l
    public final Map d() {
        return this.f35082a.d();
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f35082a.k();
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        int i11 = this.f35086e;
        InterfaceC4144l interfaceC4144l = this.f35082a;
        if (i11 == 0) {
            byte[] bArr2 = this.f35085d;
            int i12 = 0;
            if (interfaceC4144l.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = interfaceC4144l.read(bArr3, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        Y4.b bVar = new Y4.b(bArr3, i13);
                        C2581K c2581k = this.f35084c;
                        long jMax = !c2581k.f34911l ? c2581k.f34909i : Math.max(c2581k.f34912m.q(true), c2581k.f34909i);
                        int iA = bVar.a();
                        U u10 = c2581k.k;
                        u10.getClass();
                        u10.e(iA, bVar);
                        u10.b(jMax, 1, iA, 0, null);
                        c2581k.f34911l = true;
                    }
                }
                this.f35086e = this.f35083b;
            }
            return -1;
        }
        int i16 = interfaceC4144l.read(bArr, i5, Math.min(this.f35086e, i10));
        if (i16 != -1) {
            this.f35086e -= i16;
        }
        return i16;
    }

    @Override // t6.InterfaceC4144l
    public final long t(t6.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // t6.InterfaceC4144l
    public final void z(t6.K k) {
        k.getClass();
        this.f35082a.z(k);
    }
}

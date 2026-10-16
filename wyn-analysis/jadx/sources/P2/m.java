package P2;

import N1.C0764m;
import N1.C0765n;
import N1.InterfaceC0758g;
import Q1.o;
import Q1.x;
import Va.M6;
import java.io.EOFException;
import s2.B;
import s2.C;

/* loaded from: classes.dex */
public final class m implements C {

    /* renamed from: a, reason: collision with root package name */
    public final C f9083a;

    /* renamed from: b, reason: collision with root package name */
    public final j f9084b;

    /* renamed from: g, reason: collision with root package name */
    public l f9089g;

    /* renamed from: h, reason: collision with root package name */
    public C0765n f9090h;

    /* renamed from: d, reason: collision with root package name */
    public int f9086d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9087e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f9088f = x.f9729f;

    /* renamed from: c, reason: collision with root package name */
    public final o f9085c = new o();

    public m(C c10, j jVar) {
        this.f9083a = c10;
        this.f9084b = jVar;
    }

    @Override // s2.C
    public final void a(long j8, int i5, int i10, int i11, B b5) {
        if (this.f9089g == null) {
            this.f9083a.a(j8, i5, i10, i11, b5);
            return;
        }
        Q1.k.b("DRM on subtitles is not supported", b5 == null);
        int i12 = (this.f9087e - i11) - i10;
        this.f9089g.E(this.f9088f, i12, i10, k.f9080c, new F5.e(this, j8, i5));
        int i13 = i12 + i10;
        this.f9086d = i13;
        if (i13 == this.f9087e) {
            this.f9086d = 0;
            this.f9087e = 0;
        }
    }

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) throws EOFException {
        if (this.f9089g == null) {
            return this.f9083a.b(interfaceC0758g, i5, z2);
        }
        g(i5);
        int i10 = interfaceC0758g.read(this.f9088f, this.f9087e, i5);
        if (i10 != -1) {
            this.f9087e += i10;
            return i10;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s2.C
    public final void c(C0765n c0765n) {
        c0765n.f8232n.getClass();
        String str = c0765n.f8232n;
        Q1.k.c(N1.C.h(str) == 3);
        boolean zEquals = c0765n.equals(this.f9090h);
        j jVar = this.f9084b;
        if (!zEquals) {
            this.f9090h = c0765n;
            this.f9089g = jVar.d(c0765n) ? jVar.i(c0765n) : null;
        }
        l lVar = this.f9089g;
        C c10 = this.f9083a;
        if (lVar == null) {
            c10.c(c0765n);
            return;
        }
        C0764m c0764mA = c0765n.a();
        c0764mA.f8194m = N1.C.m("application/x-media3-cues");
        c0764mA.f8192j = str;
        c0764mA.f8199r = Long.MAX_VALUE;
        c0764mA.f8179H = jVar.g(c0765n);
        M6.y(c0764mA, c10);
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final /* synthetic */ void e(int i5, o oVar) {
        pd.f.b(this, oVar, i5);
    }

    @Override // s2.C
    public final void f(o oVar, int i5, int i10) {
        if (this.f9089g == null) {
            this.f9083a.f(oVar, i5, i10);
            return;
        }
        g(i5);
        oVar.f(this.f9087e, i5, this.f9088f);
        this.f9087e += i5;
    }

    public final void g(int i5) {
        int length = this.f9088f.length;
        int i10 = this.f9087e;
        if (length - i10 >= i5) {
            return;
        }
        int i11 = i10 - this.f9086d;
        int iMax = Math.max(i11 * 2, i5 + i11);
        byte[] bArr = this.f9088f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f9086d, bArr2, 0, i11);
        this.f9086d = 0;
        this.f9087e = i11;
        this.f9088f = bArr2;
    }
}

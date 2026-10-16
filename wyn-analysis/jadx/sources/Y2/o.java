package Y2;

import G5.L;
import N1.C0764m;
import N1.C0765n;
import org.apache.tika.fork.ForkServer;
import s2.C;

/* loaded from: classes.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.o f16531a;

    /* renamed from: b, reason: collision with root package name */
    public final L f16532b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16534d;

    /* renamed from: e, reason: collision with root package name */
    public C f16535e;

    /* renamed from: f, reason: collision with root package name */
    public String f16536f;

    /* renamed from: g, reason: collision with root package name */
    public int f16537g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f16538h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16539i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16540j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public int f16541l;

    /* renamed from: m, reason: collision with root package name */
    public long f16542m;

    public o(String str, int i5) {
        Q1.o oVar = new Q1.o(4);
        this.f16531a = oVar;
        oVar.f9702a[0] = -1;
        this.f16532b = new L(1);
        this.f16542m = -9223372036854775807L;
        this.f16533c = str;
        this.f16534d = i5;
    }

    @Override // Y2.h
    public final void a() {
        this.f16537g = 0;
        this.f16538h = 0;
        this.f16540j = false;
        this.f16542m = -9223372036854775807L;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.f16542m = j8;
    }

    @Override // Y2.h
    public final void e(Q1.o oVar) {
        Q1.k.h(this.f16535e);
        while (oVar.a() > 0) {
            int i5 = this.f16537g;
            Q1.o oVar2 = this.f16531a;
            if (i5 == 0) {
                byte[] bArr = oVar.f9702a;
                int i10 = oVar.f9703b;
                int i11 = oVar.f9704c;
                while (true) {
                    if (i10 >= i11) {
                        oVar.G(i11);
                        break;
                    }
                    byte b5 = bArr[i10];
                    boolean z2 = (b5 & ForkServer.ERROR) == 255;
                    boolean z10 = this.f16540j && (b5 & 224) == 224;
                    this.f16540j = z2;
                    if (z10) {
                        oVar.G(i10 + 1);
                        this.f16540j = false;
                        oVar2.f9702a[1] = bArr[i10];
                        this.f16538h = 2;
                        this.f16537g = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i5 == 1) {
                int iMin = Math.min(oVar.a(), 4 - this.f16538h);
                oVar.f(this.f16538h, iMin, oVar2.f9702a);
                int i12 = this.f16538h + iMin;
                this.f16538h = i12;
                if (i12 >= 4) {
                    oVar2.G(0);
                    int iH = oVar2.h();
                    L l10 = this.f16532b;
                    if (l10.a(iH)) {
                        this.f16541l = l10.f4327d;
                        if (!this.f16539i) {
                            this.k = (l10.f4331h * 1000000) / l10.f4328e;
                            C0764m c0764m = new C0764m();
                            c0764m.f8183a = this.f16536f;
                            c0764m.f8194m = N1.C.m(l10.f4326c);
                            c0764m.f8195n = 4096;
                            c0764m.f8173B = l10.f4329f;
                            c0764m.f8174C = l10.f4328e;
                            c0764m.f8186d = this.f16533c;
                            c0764m.f8188f = this.f16534d;
                            this.f16535e.c(new C0765n(c0764m));
                            this.f16539i = true;
                        }
                        oVar2.G(0);
                        this.f16535e.e(4, oVar2);
                        this.f16537g = 2;
                    } else {
                        this.f16538h = 0;
                        this.f16537g = 1;
                    }
                }
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(oVar.a(), this.f16541l - this.f16538h);
                this.f16535e.e(iMin2, oVar);
                int i13 = this.f16538h + iMin2;
                this.f16538h = i13;
                if (i13 >= this.f16541l) {
                    Q1.k.g(this.f16542m != -9223372036854775807L);
                    this.f16535e.a(this.f16542m, 1, this.f16541l, 0, null);
                    this.f16542m += this.k;
                    this.f16538h = 0;
                    this.f16537g = 0;
                }
            }
        }
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16536f = b5.f11474f;
        b5.b();
        this.f16535e = oVar.mo0m(b5.f11473e, 1);
    }

    @Override // Y2.h
    public final void h(boolean z2) {
    }
}

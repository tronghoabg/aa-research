package T5;

import E5.S;
import E5.T;
import G5.L;
import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class r implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f11674a;

    /* renamed from: b, reason: collision with root package name */
    public final L f11675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11676c;

    /* renamed from: d, reason: collision with root package name */
    public J5.w f11677d;

    /* renamed from: e, reason: collision with root package name */
    public String f11678e;

    /* renamed from: f, reason: collision with root package name */
    public int f11679f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f11680g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11681h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11682i;

    /* renamed from: j, reason: collision with root package name */
    public long f11683j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f11684l;

    public r(String str) {
        Y4.b bVar = new Y4.b(4);
        this.f11674a = bVar;
        bVar.f16679a[0] = -1;
        this.f11675b = new L(0);
        this.f11684l = -9223372036854775807L;
        this.f11676c = str;
    }

    @Override // T5.f
    public final void a() {
        this.f11679f = 0;
        this.f11680g = 0;
        this.f11682i = false;
        this.f11684l = -9223372036854775807L;
    }

    @Override // T5.f
    public final void c(Y4.b bVar) {
        AbstractC4256a.j(this.f11677d);
        while (bVar.a() > 0) {
            int i5 = this.f11679f;
            Y4.b bVar2 = this.f11674a;
            if (i5 == 0) {
                byte[] bArr = bVar.f16679a;
                int i10 = bVar.f16680b;
                int i11 = bVar.f16681c;
                while (true) {
                    if (i10 >= i11) {
                        bVar.A(i11);
                        break;
                    }
                    byte b5 = bArr[i10];
                    boolean z2 = (b5 & ForkServer.ERROR) == 255;
                    boolean z10 = this.f11682i && (b5 & 224) == 224;
                    this.f11682i = z2;
                    if (z10) {
                        bVar.A(i10 + 1);
                        this.f11682i = false;
                        bVar2.f16679a[1] = bArr[i10];
                        this.f11680g = 2;
                        this.f11679f = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i5 == 1) {
                int iMin = Math.min(bVar.a(), 4 - this.f11680g);
                bVar.c(this.f11680g, iMin, bVar2.f16679a);
                int i12 = this.f11680g + iMin;
                this.f11680g = i12;
                if (i12 >= 4) {
                    bVar2.A(0);
                    int iD = bVar2.d();
                    L l10 = this.f11675b;
                    if (l10.a(iD)) {
                        this.k = l10.f4327d;
                        if (!this.f11681h) {
                            int i13 = l10.f4328e;
                            this.f11683j = (l10.f4331h * 1000000) / i13;
                            S s10 = new S();
                            s10.f3195a = this.f11678e;
                            s10.k = l10.f4326c;
                            s10.f3205l = 4096;
                            s10.f3217x = l10.f4329f;
                            s10.f3218y = i13;
                            s10.f3197c = this.f11676c;
                            this.f11677d.a(new T(s10));
                            this.f11681h = true;
                        }
                        bVar2.A(0);
                        this.f11677d.c(4, bVar2);
                        this.f11679f = 2;
                    } else {
                        this.f11680g = 0;
                        this.f11679f = 1;
                    }
                }
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(bVar.a(), this.k - this.f11680g);
                this.f11677d.c(iMin2, bVar);
                int i14 = this.f11680g + iMin2;
                this.f11680g = i14;
                int i15 = this.k;
                if (i14 >= i15) {
                    long j8 = this.f11684l;
                    if (j8 != -9223372036854775807L) {
                        this.f11677d.b(j8, 1, i15, 0, null);
                        this.f11684l += this.f11683j;
                    }
                    this.f11680g = 0;
                    this.f11679f = 0;
                }
            }
        }
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        if (j8 != -9223372036854775807L) {
            this.f11684l = j8;
        }
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11678e = b5.f11474f;
        b5.b();
        this.f11677d = mVar.m(b5.f11473e, 1);
    }

    @Override // T5.f
    public final void i() {
    }
}

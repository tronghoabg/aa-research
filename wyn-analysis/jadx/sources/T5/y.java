package T5;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class y implements C {

    /* renamed from: a, reason: collision with root package name */
    public final x f11728a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f11729b = new Y4.b(32);

    /* renamed from: c, reason: collision with root package name */
    public int f11730c;

    /* renamed from: d, reason: collision with root package name */
    public int f11731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11733f;

    public y(x xVar) {
        this.f11728a = xVar;
    }

    @Override // T5.C
    public final void a() {
        this.f11733f = true;
    }

    @Override // T5.C
    public final void b(int i5, Y4.b bVar) {
        boolean z2 = (i5 & 1) != 0;
        int iQ = z2 ? bVar.f16680b + bVar.q() : -1;
        if (this.f11733f) {
            if (!z2) {
                return;
            }
            this.f11733f = false;
            bVar.A(iQ);
            this.f11731d = 0;
        }
        while (bVar.a() > 0) {
            int i10 = this.f11731d;
            Y4.b bVar2 = this.f11729b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iQ2 = bVar.q();
                    bVar.A(bVar.f16680b - 1);
                    if (iQ2 == 255) {
                        this.f11733f = true;
                        return;
                    }
                }
                int iMin = Math.min(bVar.a(), 3 - this.f11731d);
                bVar.c(this.f11731d, iMin, bVar2.f16679a);
                int i11 = this.f11731d + iMin;
                this.f11731d = i11;
                if (i11 == 3) {
                    bVar2.A(0);
                    bVar2.z(3);
                    bVar2.B(1);
                    int iQ3 = bVar2.q();
                    int iQ4 = bVar2.q();
                    this.f11732e = (iQ3 & 128) != 0;
                    int i12 = (((iQ3 & 15) << 8) | iQ4) + 3;
                    this.f11730c = i12;
                    byte[] bArr = bVar2.f16679a;
                    if (bArr.length < i12) {
                        bVar2.b(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(bVar.a(), this.f11730c - this.f11731d);
                bVar.c(this.f11731d, iMin2, bVar2.f16679a);
                int i13 = this.f11731d + iMin2;
                this.f11731d = i13;
                int i14 = this.f11730c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (this.f11732e) {
                        byte[] bArr2 = bVar2.f16679a;
                        int i15 = u6.v.f46721a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i14; i17++) {
                            i16 = u6.v.k[((i16 >>> 24) ^ (bArr2[i17] & ForkServer.ERROR)) & 255] ^ (i16 << 8);
                        }
                        if (i16 != 0) {
                            this.f11733f = true;
                            return;
                        }
                        bVar2.z(this.f11730c - 4);
                    } else {
                        bVar2.z(i14);
                    }
                    bVar2.A(0);
                    this.f11728a.c(bVar2);
                    this.f11731d = 0;
                }
            }
        }
    }

    @Override // T5.C
    public final void d(u6.t tVar, J5.m mVar, B b5) {
        this.f11728a.d(tVar, mVar, b5);
        this.f11733f = true;
    }
}

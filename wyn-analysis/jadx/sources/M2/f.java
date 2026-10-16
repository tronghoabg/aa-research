package M2;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements c, R5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7309a;

    /* renamed from: b, reason: collision with root package name */
    public int f7310b;

    /* renamed from: c, reason: collision with root package name */
    public int f7311c;

    /* renamed from: d, reason: collision with root package name */
    public int f7312d;

    /* renamed from: e, reason: collision with root package name */
    public int f7313e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7314f;

    public f() {
        this.f7309a = 2;
        this.f7310b = 0;
        this.f7311c = -1;
        this.f7312d = 0;
        this.f7314f = new int[16];
        this.f7313e = r0.length - 1;
    }

    @Override // M2.c, R5.c
    public int a() {
        switch (this.f7309a) {
            case 0:
                Q1.o oVar = (Q1.o) this.f7314f;
                int i5 = this.f7311c;
                if (i5 != 8) {
                    if (i5 != 16) {
                        int i10 = this.f7312d;
                        this.f7312d = i10 + 1;
                        if (i10 % 2 != 0) {
                            break;
                        } else {
                            int iU = oVar.u();
                            this.f7313e = iU;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                Y4.b bVar = (Y4.b) this.f7314f;
                int i11 = this.f7311c;
                if (i11 != 8) {
                    if (i11 != 16) {
                        int i12 = this.f7312d;
                        this.f7312d = i12 + 1;
                        if (i12 % 2 != 0) {
                            break;
                        } else {
                            int iQ = bVar.q();
                            this.f7313e = iQ;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return this.f7313e & 15;
    }

    public void b(int i5) {
        int i10 = this.f7312d;
        int[] iArr = (int[]) this.f7314f;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f7310b;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy((int[]) this.f7314f, 0, iArr2, i12, i11);
            this.f7310b = 0;
            this.f7311c = this.f7312d - 1;
            this.f7314f = iArr2;
            this.f7313e = length - 1;
        }
        int i13 = (this.f7311c + 1) & this.f7313e;
        this.f7311c = i13;
        ((int[]) this.f7314f)[i13] = i5;
        this.f7312d++;
    }

    @Override // M2.c, R5.c
    public int c() {
        switch (this.f7309a) {
        }
        return -1;
    }

    @Override // M2.c, R5.c
    public int d() {
        switch (this.f7309a) {
        }
        return this.f7310b;
    }

    public int e() {
        int i5 = this.f7312d;
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f7314f;
        int i10 = this.f7310b;
        int i11 = iArr[i10];
        this.f7310b = (i10 + 1) & this.f7313e;
        this.f7312d = i5 - 1;
        return i11;
    }

    public f(R5.b bVar) {
        this.f7309a = 1;
        Y4.b bVar2 = bVar.f10259c;
        this.f7314f = bVar2;
        bVar2.A(12);
        this.f7311c = bVar2.t() & 255;
        this.f7310b = bVar2.t();
    }

    public f(R1.c cVar) {
        this.f7309a = 0;
        Q1.o oVar = cVar.f10097c;
        this.f7314f = oVar;
        oVar.G(12);
        this.f7311c = oVar.y() & 255;
        this.f7310b = oVar.y();
    }
}

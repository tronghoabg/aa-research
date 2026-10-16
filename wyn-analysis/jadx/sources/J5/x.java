package J5;

import org.apache.tika.fork.ForkServer;
import s2.B;
import s2.C;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5687a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5688b;

    /* renamed from: c, reason: collision with root package name */
    public int f5689c;

    /* renamed from: d, reason: collision with root package name */
    public long f5690d;

    /* renamed from: e, reason: collision with root package name */
    public int f5691e;

    /* renamed from: f, reason: collision with root package name */
    public int f5692f;

    /* renamed from: g, reason: collision with root package name */
    public int f5693g;

    public x(int i5) {
        switch (i5) {
            case 1:
                this.f5687a = new byte[10];
                break;
            default:
                this.f5687a = new byte[10];
                break;
        }
    }

    public void a(w wVar, v vVar) {
        if (this.f5689c > 0) {
            wVar.b(this.f5690d, this.f5691e, this.f5692f, this.f5693g, vVar);
            this.f5689c = 0;
        }
    }

    public void b(C c10, B b5) {
        if (this.f5689c > 0) {
            c10.a(this.f5690d, this.f5691e, this.f5692f, this.f5693g, b5);
            this.f5689c = 0;
        }
    }

    public void c(w wVar, long j8, int i5, int i10, int i11, v vVar) {
        if (!(this.f5693g <= i10 + i11)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f5688b) {
            int i12 = this.f5689c;
            int i13 = i12 + 1;
            this.f5689c = i13;
            if (i12 == 0) {
                this.f5690d = j8;
                this.f5691e = i5;
                this.f5692f = 0;
            }
            this.f5692f += i10;
            this.f5693g = i11;
            if (i13 >= 16) {
                a(wVar, vVar);
            }
        }
    }

    public void d(C c10, long j8, int i5, int i10, int i11, B b5) {
        Q1.k.f("TrueHD chunk samples must be contiguous in the sample queue.", this.f5693g <= i10 + i11);
        if (this.f5688b) {
            int i12 = this.f5689c;
            int i13 = i12 + 1;
            this.f5689c = i13;
            if (i12 == 0) {
                this.f5690d = j8;
                this.f5691e = i5;
                this.f5692f = 0;
            }
            this.f5692f += i10;
            this.f5693g = i11;
            if (i13 >= 16) {
                b(c10, b5);
            }
        }
    }

    public void e(l lVar) {
        if (this.f5688b) {
            return;
        }
        byte[] bArr = this.f5687a;
        int i5 = 0;
        lVar.a(0, 10, bArr);
        lVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b5 = bArr[7];
            if ((b5 & 254) == 186) {
                i5 = 40 << ((bArr[(b5 & ForkServer.ERROR) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i5 == 0) {
            return;
        }
        this.f5688b = true;
    }

    public void f(s2.n nVar) {
        if (this.f5688b) {
            return;
        }
        byte[] bArr = this.f5687a;
        int i5 = 0;
        nVar.a(0, 10, bArr);
        nVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b5 = bArr[7];
            if ((b5 & 254) == 186) {
                i5 = 40 << ((bArr[(b5 & ForkServer.ERROR) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i5 == 0) {
            return;
        }
        this.f5688b = true;
    }
}

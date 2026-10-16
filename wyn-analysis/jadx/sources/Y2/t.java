package Y2;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16577a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.u f16578b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16579c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16580d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16582f;

    /* renamed from: g, reason: collision with root package name */
    public long f16583g;

    /* renamed from: h, reason: collision with root package name */
    public long f16584h;

    /* renamed from: i, reason: collision with root package name */
    public long f16585i;

    public t(int i5) {
        this.f16577a = i5;
        switch (i5) {
            case 1:
                this.f16578b = new Q1.u(0L);
                this.f16583g = -9223372036854775807L;
                this.f16584h = -9223372036854775807L;
                this.f16585i = -9223372036854775807L;
                this.f16579c = new Q1.o();
                break;
            default:
                this.f16578b = new Q1.u(0L);
                this.f16583g = -9223372036854775807L;
                this.f16584h = -9223372036854775807L;
                this.f16585i = -9223372036854775807L;
                this.f16579c = new Q1.o();
                break;
        }
    }

    public static int b(int i5, byte[] bArr) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }

    public static long c(Q1.o oVar) {
        int i5 = oVar.f9703b;
        if (oVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        oVar.f(0, 9, bArr);
        oVar.G(i5);
        byte b5 = bArr[0];
        if ((b5 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j8 = b5;
                    long j10 = b10;
                    return ((j10 & 3) << 13) | ((j8 & 3) << 28) | (((56 & j8) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(s2.j jVar) {
        switch (this.f16577a) {
            case 0:
                byte[] bArr = Q1.x.f9729f;
                Q1.o oVar = this.f16579c;
                oVar.getClass();
                oVar.E(bArr.length, bArr);
                this.f16580d = true;
                jVar.f44900f = 0;
                break;
            default:
                byte[] bArr2 = Q1.x.f9729f;
                Q1.o oVar2 = this.f16579c;
                oVar2.getClass();
                oVar2.E(bArr2.length, bArr2);
                this.f16580d = true;
                jVar.f44900f = 0;
                break;
        }
    }
}

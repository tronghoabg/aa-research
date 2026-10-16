package T5;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11702a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.t f11703b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f11704c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11705d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11706e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11707f;

    /* renamed from: g, reason: collision with root package name */
    public long f11708g;

    /* renamed from: h, reason: collision with root package name */
    public long f11709h;

    /* renamed from: i, reason: collision with root package name */
    public long f11710i;

    public u(int i5) {
        this.f11702a = i5;
        switch (i5) {
            case 1:
                this.f11703b = new u6.t(0L);
                this.f11708g = -9223372036854775807L;
                this.f11709h = -9223372036854775807L;
                this.f11710i = -9223372036854775807L;
                this.f11704c = new Y4.b();
                break;
            default:
                this.f11703b = new u6.t(0L);
                this.f11708g = -9223372036854775807L;
                this.f11709h = -9223372036854775807L;
                this.f11710i = -9223372036854775807L;
                this.f11704c = new Y4.b();
                break;
        }
    }

    public static int b(int i5, byte[] bArr) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }

    public static long c(Y4.b bVar) {
        int i5 = bVar.f16680b;
        if (bVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        bVar.c(0, 9, bArr);
        bVar.A(i5);
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

    public final void a(J5.h hVar) {
        switch (this.f11702a) {
            case 0:
                byte[] bArr = u6.v.f46726f;
                Y4.b bVar = this.f11704c;
                bVar.getClass();
                bVar.y(bArr.length, bArr);
                this.f11705d = true;
                hVar.f5648f = 0;
                break;
            default:
                byte[] bArr2 = u6.v.f46726f;
                Y4.b bVar2 = this.f11704c;
                bVar2.getClass();
                bVar2.y(bArr2.length, bArr2);
                this.f11705d = true;
                hVar.f5648f = 0;
                break;
        }
    }
}

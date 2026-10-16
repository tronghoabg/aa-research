package J5;

import E5.S;
import E5.T;
import N1.B;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import android.os.Parcelable;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5664f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5665g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5666h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5667i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5668j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5669l;

    /* renamed from: m, reason: collision with root package name */
    public final Parcelable f5670m;

    public p(byte[] bArr, int i5, int i10) {
        int i11 = 1;
        byte b5 = 0;
        this.f5659a = i10;
        switch (i10) {
            case 1:
                y yVar = new y(bArr, bArr.length, i11, b5);
                yVar.q(i5 * 8);
                this.f5660b = yVar.i(16);
                this.f5661c = yVar.i(16);
                this.f5662d = yVar.i(24);
                this.f5663e = yVar.i(24);
                int i12 = yVar.i(20);
                this.f5664f = i12;
                this.f5665g = g(i12);
                this.f5666h = yVar.i(3) + 1;
                int i13 = yVar.i(5) + 1;
                this.f5667i = i13;
                this.f5668j = b(i13);
                this.k = yVar.k(36);
                this.f5669l = null;
                this.f5670m = null;
                break;
            default:
                y yVar2 = new y(bArr, bArr.length, 6, b5);
                yVar2.q(i5 * 8);
                this.f5660b = yVar2.i(16);
                this.f5661c = yVar2.i(16);
                this.f5662d = yVar2.i(24);
                this.f5663e = yVar2.i(24);
                int i14 = yVar2.i(20);
                this.f5664f = i14;
                this.f5665g = f(i14);
                this.f5666h = yVar2.i(3) + 1;
                int i15 = yVar2.i(5) + 1;
                this.f5667i = i15;
                this.f5668j = a(i15);
                int i16 = yVar2.i(4);
                int i17 = yVar2.i(32);
                int i18 = u6.v.f46721a;
                this.k = ((i16 & 4294967295L) << 32) | (i17 & 4294967295L);
                this.f5669l = null;
                this.f5670m = null;
                break;
        }
    }

    public static int a(int i5) {
        if (i5 == 8) {
            return 1;
        }
        if (i5 == 12) {
            return 2;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 != 20) {
            return i5 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i5) {
        if (i5 == 8) {
            return 1;
        }
        if (i5 == 12) {
            return 2;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 != 20) {
            return i5 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int f(int i5) {
        switch (i5) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i5) {
        switch (i5) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.f5659a) {
            case 0:
                long j8 = this.k;
                if (j8 == 0) {
                    return -9223372036854775807L;
                }
                return (j8 * 1000000) / this.f5664f;
            default:
                long j10 = this.k;
                if (j10 == 0) {
                    return -9223372036854775807L;
                }
                return (j10 * 1000000) / this.f5664f;
        }
    }

    public T d(byte[] bArr, W5.c cVar) {
        bArr[4] = -128;
        int i5 = this.f5663e;
        if (i5 <= 0) {
            i5 = -1;
        }
        W5.c cVar2 = (W5.c) this.f5670m;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.c(cVar.f15149a);
        }
        S s10 = new S();
        s10.k = "audio/flac";
        s10.f3205l = i5;
        s10.f3217x = this.f5666h;
        s10.f3218y = this.f5664f;
        s10.f3206m = Collections.singletonList(bArr);
        s10.f3203i = cVar;
        return new T(s10);
    }

    public C0765n e(byte[] bArr, B b5) {
        bArr[4] = -128;
        int i5 = this.f5663e;
        if (i5 <= 0) {
            i5 = -1;
        }
        B b10 = (B) this.f5670m;
        if (b10 != null) {
            b5 = b10.e(b5);
        }
        C0764m c0764m = new C0764m();
        c0764m.f8194m = C.m("audio/flac");
        c0764m.f8195n = i5;
        c0764m.f8173B = this.f5666h;
        c0764m.f8174C = this.f5664f;
        c0764m.f8175D = Q1.x.y(this.f5667i);
        c0764m.f8197p = Collections.singletonList(bArr);
        c0764m.k = b5;
        return new C0765n(c0764m);
    }

    public p(int i5, int i10, int i11, int i12, int i13, int i14, int i15, long j8, S3.e eVar, W5.c cVar) {
        this.f5659a = 0;
        this.f5660b = i5;
        this.f5661c = i10;
        this.f5662d = i11;
        this.f5663e = i12;
        this.f5664f = i13;
        this.f5665g = f(i13);
        this.f5666h = i14;
        this.f5667i = i15;
        this.f5668j = a(i15);
        this.k = j8;
        this.f5669l = eVar;
        this.f5670m = cVar;
    }

    public p(int i5, int i10, int i11, int i12, int i13, int i14, int i15, long j8, Y2.B b5, B b10) {
        this.f5659a = 1;
        this.f5660b = i5;
        this.f5661c = i10;
        this.f5662d = i11;
        this.f5663e = i12;
        this.f5664f = i13;
        this.f5665g = g(i13);
        this.f5666h = i14;
        this.f5667i = i15;
        this.f5668j = b(i15);
        this.k = j8;
        this.f5669l = b5;
        this.f5670m = b10;
    }
}

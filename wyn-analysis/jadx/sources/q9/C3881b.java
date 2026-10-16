package q9;

import com.google.protobuf.ByteString;
import java.math.RoundingMode;
import vf.AbstractC4345a;

/* renamed from: q9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3881b extends AbstractC4345a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3882c f44175b;

    public /* synthetic */ C3881b(C3882c c3882c, int i5) {
        this.f44174a = i5;
        this.f44175b = c3882c;
    }

    @Override // vf.AbstractC4345a
    public final void Q(ByteString byteString) {
        switch (this.f44174a) {
            case 0:
                e eVar = this.f44175b.f44176a;
                for (int i5 = 0; i5 < byteString.size(); i5++) {
                    eVar.b(byteString.byteAt(i5));
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f44175b.f44176a;
                for (int i10 = 0; i10 < byteString.size(); i10++) {
                    eVar2.c(byteString.byteAt(i10));
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }

    @Override // vf.AbstractC4345a
    public final void R(double d3) {
        switch (this.f44174a) {
            case 0:
                e eVar = this.f44175b.f44176a;
                long jDoubleToLongBits = Double.doubleToLongBits(d3);
                long j8 = jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
                int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j8);
                RoundingMode roundingMode = RoundingMode.UP;
                int iR = A6.c.r(iNumberOfLeadingZeros, 8);
                eVar.a(iR + 1);
                byte[] bArr = eVar.f44181a;
                int i5 = eVar.f44182b;
                int i10 = i5 + 1;
                eVar.f44182b = i10;
                bArr[i5] = (byte) iR;
                int i11 = i10 + iR;
                while (true) {
                    i11--;
                    int i12 = eVar.f44182b;
                    if (i11 < i12) {
                        eVar.f44182b = i12 + iR;
                        break;
                    } else {
                        eVar.f44181a[i11] = (byte) (255 & j8);
                        j8 >>>= 8;
                    }
                }
            default:
                e eVar2 = this.f44175b.f44176a;
                long jDoubleToLongBits2 = Double.doubleToLongBits(d3);
                long j10 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 < 0 ? -1L : Long.MIN_VALUE);
                int iNumberOfLeadingZeros2 = 64 - Long.numberOfLeadingZeros(j10);
                RoundingMode roundingMode2 = RoundingMode.UP;
                int iR2 = A6.c.r(iNumberOfLeadingZeros2, 8);
                eVar2.a(iR2 + 1);
                byte[] bArr2 = eVar2.f44181a;
                int i13 = eVar2.f44182b;
                int i14 = i13 + 1;
                eVar2.f44182b = i14;
                bArr2[i13] = (byte) (~iR2);
                int i15 = i14 + iR2;
                while (true) {
                    i15--;
                    int i16 = eVar2.f44182b;
                    if (i15 < i16) {
                        eVar2.f44182b = i16 + iR2;
                        break;
                    } else {
                        eVar2.f44181a[i15] = (byte) (~(255 & j10));
                        j10 >>>= 8;
                    }
                }
        }
    }

    @Override // vf.AbstractC4345a
    public final void S() {
        switch (this.f44174a) {
            case 0:
                e eVar = this.f44175b.f44176a;
                eVar.d((byte) -1);
                eVar.d((byte) -1);
                break;
            default:
                e eVar2 = this.f44175b.f44176a;
                eVar2.e((byte) -1);
                eVar2.e((byte) -1);
                break;
        }
    }

    @Override // vf.AbstractC4345a
    public final void T(long j8) {
        switch (this.f44174a) {
            case 0:
                this.f44175b.f44176a.f(j8);
                break;
            default:
                this.f44175b.f44176a.f(~j8);
                break;
        }
    }

    @Override // vf.AbstractC4345a
    public final void U(String str) {
        switch (this.f44174a) {
            case 0:
                e eVar = this.f44175b.f44176a;
                int length = str.length();
                int i5 = 0;
                while (i5 < length) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt < 128) {
                        eVar.b((byte) cCharAt);
                    } else if (cCharAt < 2048) {
                        eVar.b((byte) ((cCharAt >>> 6) | 960));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else if (cCharAt < 55296 || 57343 < cCharAt) {
                        eVar.b((byte) ((cCharAt >>> '\f') | 480));
                        eVar.b((byte) (((cCharAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else {
                        int iCodePointAt = Character.codePointAt(str, i5);
                        i5++;
                        eVar.b((byte) ((iCodePointAt >>> 18) | 240));
                        eVar.b((byte) (((iCodePointAt >>> 12) & 63) | 128));
                        eVar.b((byte) (((iCodePointAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((iCodePointAt & 63) | 128));
                    }
                    i5++;
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f44175b.f44176a;
                int length2 = str.length();
                int i10 = 0;
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 128) {
                        eVar2.c((byte) cCharAt2);
                    } else if (cCharAt2 < 2048) {
                        eVar2.c((byte) ((cCharAt2 >>> 6) | 960));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                        eVar2.c((byte) ((cCharAt2 >>> '\f') | 480));
                        eVar2.c((byte) (((cCharAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else {
                        int iCodePointAt2 = Character.codePointAt(str, i10);
                        i10++;
                        eVar2.c((byte) ((iCodePointAt2 >>> 18) | 240));
                        eVar2.c((byte) (((iCodePointAt2 >>> 12) & 63) | 128));
                        eVar2.c((byte) (((iCodePointAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((iCodePointAt2 & 63) | 128));
                    }
                    i10++;
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }
}

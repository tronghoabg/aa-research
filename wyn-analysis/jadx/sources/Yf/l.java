package Yf;

import A.C0230x;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public final class l extends E4.F {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16867e;

    public l(C0230x c0230x, boolean z2) {
        super(c0230x, 6);
        this.f16867e = z2;
    }

    @Override // E4.F
    public final void l(byte b5) {
        if (this.f16867e) {
            r(String.valueOf(b5 & ForkServer.ERROR));
        } else {
            p(String.valueOf(b5 & ForkServer.ERROR));
        }
    }

    @Override // E4.F
    public final void n(int i5) {
        if (this.f16867e) {
            r(Long.toString(4294967295L & i5, 10));
        } else {
            p(Long.toString(4294967295L & i5, 10));
        }
    }

    @Override // E4.F
    public final void o(long j8) {
        int i5 = 63;
        String str = "0";
        if (this.f16867e) {
            if (j8 != 0) {
                if (j8 > 0) {
                    str = Long.toString(j8, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j8 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j8 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i5--;
                        cArr[i5] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i5, 64 - i5);
                }
            }
            r(str);
            return;
        }
        if (j8 != 0) {
            if (j8 > 0) {
                str = Long.toString(j8, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j8 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j8 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i5--;
                    cArr2[i5] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i5, 64 - i5);
            }
        }
        p(str);
    }

    @Override // E4.F
    public final void q(short s10) {
        if (this.f16867e) {
            r(String.valueOf(s10 & 65535));
        } else {
            p(String.valueOf(s10 & 65535));
        }
    }
}

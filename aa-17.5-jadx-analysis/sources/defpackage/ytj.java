package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class ytj extends ysm {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    @Override // defpackage.ysm, defpackage.ysw
    public final void b(byte[] bArr, int i) {
        int i2 = 0;
        woy.Y(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            g(4, ytk.f(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            g(1, bArr[i2] & 255);
            i2++;
        }
    }

    @Override // defpackage.ysm, defpackage.ysw
    public final void c(int i) {
        g(4, i);
    }

    @Override // defpackage.ysm, defpackage.ysw
    public final void f(CharSequence charSequence, Charset charset) {
        if (!charset.equals(StandardCharsets.UTF_8)) {
            e(charSequence.toString().getBytes(charset));
            return;
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence.charAt(i + 1);
            char cCharAt3 = charSequence.charAt(i + 2);
            char cCharAt4 = charSequence.charAt(i + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            g(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
            i = i2;
        }
        while (i < length) {
            char cCharAt5 = charSequence.charAt(i);
            if (cCharAt5 < 128) {
                g(1, cCharAt5);
            } else if (cCharAt5 < 2048) {
                g(2, ytk.h(cCharAt5));
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                g(3, ytk.g(cCharAt5));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                if (iCodePointAt == cCharAt5) {
                    e(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return;
                } else {
                    g(4, ytk.i(iCodePointAt));
                    i++;
                }
            }
            i++;
        }
    }

    public final void g(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        this.b = ((j & 4294967295L) << i2) | j2;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            int i4 = this.a;
            ysv ysvVar = ytk.a;
            this.a = (Integer.rotateLeft((Integer.rotateLeft(((int) r6) * (-862048943), 15) * 461845907) ^ i4, 13) * 5) - 430675100;
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.ysw
    public final ysu l() {
        woy.Z(!this.e);
        this.e = true;
        int i = this.a;
        int i2 = (int) this.b;
        ysv ysvVar = ytk.a;
        int iRotateLeft = i ^ (Integer.rotateLeft(i2 * (-862048943), 15) * 461845907);
        this.a = iRotateLeft;
        return ytk.j(iRotateLeft, this.d);
    }
}

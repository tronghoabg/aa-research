package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
final class ytn extends ytp {
    private ytn(ytl ytlVar, Character ch) {
        super(ytlVar, ch);
        if (ytlVar.a.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.ytp, defpackage.ytq
    public final int a(byte[] bArr, CharSequence charSequence) throws yto {
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        ytl ytlVar = this.b;
        if (!ytlVar.c(length)) {
            throw new yto("Invalid input length " + charSequenceG.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceG.length()) {
            int i3 = i2 + 1;
            int iB = (ytlVar.b(charSequenceG.charAt(i + 1)) << 12) | (ytlVar.b(charSequenceG.charAt(i)) << 18);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceG.length()) {
                int i5 = i + 3;
                int iB2 = iB | (ytlVar.b(charSequenceG.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceG.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | ytlVar.b(charSequenceG.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.ytp, defpackage.ytq
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        woy.Y(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            ytl ytlVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(ytlVar.a(i7 >>> 18));
            appendable.append(ytlVar.a((i7 >>> 12) & 63));
            appendable.append(ytlVar.a((i7 >>> 6) & 63));
            appendable.append(ytlVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            h(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.ytp
    public final ytq c(ytl ytlVar) {
        return new ytn(ytlVar, null);
    }

    public ytn(String str, String str2, Character ch) {
        this(new ytl(str, str2.toCharArray()), ch);
    }
}

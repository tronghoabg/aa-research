package com.google.d.h;

import com.google.d.b.an;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends e {
    private c(a aVar, Character ch) {
        super(aVar, ch);
        an.l(aVar.f7902f.length == 64);
    }

    @Override // com.google.d.h.e, com.google.d.h.f
    final int a(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceJ = j(charSequence);
        int length = charSequenceJ.length();
        a aVar = this.f7908b;
        if (!aVar.f(length)) {
            throw new d("Invalid input length " + charSequenceJ.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceJ.length()) {
            int i4 = i3 + 1;
            int iB = (aVar.b(charSequenceJ.charAt(i2 + 1)) << 12) | (aVar.b(charSequenceJ.charAt(i2)) << 18);
            bArr[i3] = (byte) (iB >>> 16);
            int i5 = i2 + 2;
            if (i5 < charSequenceJ.length()) {
                int i6 = i2 + 3;
                int iB2 = iB | (aVar.b(charSequenceJ.charAt(i5)) << 6);
                int i7 = i3 + 2;
                bArr[i4] = (byte) ((iB2 >>> 8) & 255);
                if (i6 < charSequenceJ.length()) {
                    i2 += 4;
                    i3 += 3;
                    bArr[i7] = (byte) ((iB2 | aVar.b(charSequenceJ.charAt(i6))) & 255);
                } else {
                    i3 = i7;
                    i2 = i6;
                }
            } else {
                i2 = i5;
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // com.google.d.h.e
    final f b(a aVar, Character ch) {
        return new c(aVar, ch);
    }

    @Override // com.google.d.h.e, com.google.d.h.f
    final void c(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        an.t(i2, i4, bArr.length);
        while (i3 >= 3) {
            int i5 = bArr[i2] & 255;
            int i6 = bArr[i2 + 1] & 255;
            int i7 = bArr[i2 + 2] & 255;
            a aVar = this.f7908b;
            int i8 = (i6 << 8) | (i5 << 16) | i7;
            appendable.append(aVar.a(i8 >>> 18));
            appendable.append(aVar.a((i8 >>> 12) & 63));
            appendable.append(aVar.a((i8 >>> 6) & 63));
            appendable.append(aVar.a(i8 & 63));
            i2 += 3;
            i3 -= 3;
        }
        if (i2 < i4) {
            k(appendable, bArr, i2, i4 - i2);
        }
    }

    c(String str, String str2, Character ch) {
        this(new a(str, str2.toCharArray()), ch);
    }
}

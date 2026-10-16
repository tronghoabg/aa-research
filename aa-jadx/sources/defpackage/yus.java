package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yus extends defpackage.yuu {
    private yus(defpackage.yuq yuqVar, java.lang.Character ch) {
        super(yuqVar, ch);
        if (yuqVar.a.length != 64) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // defpackage.yuu, defpackage.yuv
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.yut {
        java.lang.CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        defpackage.yuq yuqVar = this.b;
        if (!yuqVar.c(length)) {
            throw new defpackage.yut("Invalid input length " + charSequenceG.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceG.length()) {
            int i3 = i2 + 1;
            int iB = (yuqVar.b(charSequenceG.charAt(i + 1)) << 12) | (yuqVar.b(charSequenceG.charAt(i)) << 18);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceG.length()) {
                int i5 = i + 3;
                int iB2 = iB | (yuqVar.b(charSequenceG.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceG.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | yuqVar.b(charSequenceG.charAt(i5))) & 255);
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

    @Override // defpackage.yuu, defpackage.yuv
    public final void b(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        defpackage.ysr.bi(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            defpackage.yuq yuqVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(yuqVar.a(i7 >>> 18));
            appendable.append(yuqVar.a((i7 >>> 12) & 63));
            appendable.append(yuqVar.a((i7 >>> 6) & 63));
            appendable.append(yuqVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            h(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.yuu
    public final defpackage.yuv c(defpackage.yuq yuqVar) {
        return new defpackage.yus(yuqVar, null);
    }

    public yus(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.yuq(str, str2.toCharArray()), ch);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class yuu extends defpackage.yuv {
    final defpackage.yuq b;
    final java.lang.Character c;

    public yuu(defpackage.yuq yuqVar, java.lang.Character ch) {
        this.b = yuqVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (yuqVar.f[61] != -1) {
                z = false;
            }
        }
        defpackage.ysr.bc(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.yuv
    public int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.yut {
        int i;
        java.lang.CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        defpackage.yuq yuqVar = this.b;
        if (!yuqVar.c(length)) {
            throw new defpackage.yut("Invalid input length " + charSequenceG.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceG.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = yuqVar.d;
                if (i4 >= i) {
                    break;
                }
                jB <<= yuqVar.c;
                if (i2 + i4 < charSequenceG.length()) {
                    jB |= (long) yuqVar.b(charSequenceG.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = yuqVar.e;
            int i7 = i5 * yuqVar.c;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // defpackage.yuv
    public void b(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        defpackage.ysr.bi(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.e;
            h(appendable, bArr, i2, java.lang.Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    public defpackage.yuv c(defpackage.yuq yuqVar) {
        return new defpackage.yuu(yuqVar, null);
    }

    @Override // defpackage.yuv
    public final int d(int i) {
        return (int) (((((long) this.b.c) * ((long) i)) + 7) / 8);
    }

    @Override // defpackage.yuv
    public final int e(int i) {
        defpackage.yuq yuqVar = this.b;
        return yuqVar.d * defpackage.ysr.cX(i, yuqVar.e, java.math.RoundingMode.CEILING);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yuu) {
            defpackage.yuu yuuVar = (defpackage.yuu) obj;
            if (this.b.equals(yuuVar.b) && j$.util.Objects.equals(this.c, yuuVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yuv
    public final defpackage.yuv f() {
        return this.c == null ? this : c(this.b);
    }

    @Override // defpackage.yuv
    public final java.lang.CharSequence g(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.lang.Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    final void h(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        defpackage.ysr.bi(i, i + i2, bArr.length);
        defpackage.yuq yuqVar = this.b;
        int i3 = yuqVar.e;
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException();
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = yuqVar.c;
        while (i4 < i2 * 8) {
            appendable.append(yuqVar.a(yuqVar.b & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        java.lang.Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ j$.util.Objects.hashCode(this.c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        defpackage.yuq yuqVar = this.b;
        sb.append(yuqVar);
        if (8 % yuqVar.c != 0) {
            java.lang.Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public yuu(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.yuq(str, str2.toCharArray()), ch);
    }
}

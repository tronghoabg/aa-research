package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
class ytp extends ytq {
    final ytl b;
    final Character c;

    public ytp(ytl ytlVar, Character ch) {
        this.b = ytlVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (ytlVar.f[61] != -1) {
                z = false;
            }
        }
        woy.S(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.ytq
    public int a(byte[] bArr, CharSequence charSequence) throws yto {
        int i;
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        ytl ytlVar = this.b;
        if (!ytlVar.c(length)) {
            throw new yto("Invalid input length " + charSequenceG.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceG.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = ytlVar.d;
                if (i4 >= i) {
                    break;
                }
                jB <<= ytlVar.c;
                if (i2 + i4 < charSequenceG.length()) {
                    jB |= ytlVar.b(charSequenceG.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = ytlVar.e;
            int i7 = i5 * ytlVar.c;
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

    @Override // defpackage.ytq
    public void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        woy.Y(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.e;
            h(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    public ytq c(ytl ytlVar) {
        return new ytp(ytlVar, null);
    }

    @Override // defpackage.ytq
    public final int d(int i) {
        return (int) (((this.b.c * i) + 7) / 8);
    }

    @Override // defpackage.ytq
    public final int e(int i) {
        ytl ytlVar = this.b;
        return ytlVar.d * wub.aF(i, ytlVar.e, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ytp) {
            ytp ytpVar = (ytp) obj;
            if (this.b.equals(ytpVar.b) && Objects.equals(this.c, ytpVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ytq
    public final ytq f() {
        return this.c == null ? this : c(this.b);
    }

    @Override // defpackage.ytq
    public final CharSequence g(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
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

    final void h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        woy.Y(i, i + i2, bArr.length);
        ytl ytlVar = this.b;
        int i3 = ytlVar.e;
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = ytlVar.c;
        while (i4 < i2 * 8) {
            appendable.append(ytlVar.a(ytlVar.b & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        ytl ytlVar = this.b;
        sb.append(ytlVar);
        if (8 % ytlVar.c != 0) {
            Character ch = this.c;
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

    public ytp(String str, String str2, Character ch) {
        this(new ytl(str, str2.toCharArray()), ch);
    }
}

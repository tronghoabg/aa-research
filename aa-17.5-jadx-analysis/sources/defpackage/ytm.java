package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
final class ytm extends ytp {
    final char[] a;

    public ytm(ytl ytlVar) {
        super(ytlVar, null);
        this.a = new char[sk.AUDIO_CONTENT_BUFFER_SIZE];
        if (ytlVar.a.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = ytlVar.a(i >>> 4);
            this.a[i | 256] = ytlVar.a(i & 15);
        }
    }

    @Override // defpackage.ytp, defpackage.ytq
    public final int a(byte[] bArr, CharSequence charSequence) throws yto {
        if (charSequence.length() % 2 == 1) {
            throw new yto("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            ytl ytlVar = this.b;
            bArr[i2] = (byte) (ytlVar.b(charSequence.charAt(i + 1)) | (ytlVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.ytp, defpackage.ytq
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        woy.Y(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.ytp
    public final ytq c(ytl ytlVar) {
        return new ytm(ytlVar);
    }
}

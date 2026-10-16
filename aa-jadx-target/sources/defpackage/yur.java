package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yur extends defpackage.yuu {
    final char[] a;

    public yur(defpackage.yuq yuqVar) {
        super(yuqVar, null);
        this.a = new char[512];
        if (yuqVar.a.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = yuqVar.a(i >>> 4);
            this.a[i | 256] = yuqVar.a(i & 15);
        }
    }

    @Override // defpackage.yuu, defpackage.yuv
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.yut {
        if (charSequence.length() % 2 == 1) {
            throw new defpackage.yut("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            defpackage.yuq yuqVar = this.b;
            bArr[i2] = (byte) (yuqVar.b(charSequence.charAt(i + 1)) | (yuqVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.yuu, defpackage.yuv
    public final void b(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException {
        defpackage.ysr.bi(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.yuu
    public final defpackage.yuv c(defpackage.yuq yuqVar) {
        return new defpackage.yur(yuqVar);
    }
}

package m8;

import org.apache.tika.fork.ForkServer;

/* renamed from: m8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3495b extends C3498e {

    /* renamed from: f, reason: collision with root package name */
    public final char[] f40401f;

    public C3495b(C3494a c3494a) {
        super(c3494a, (Character) null);
        this.f40401f = new char[512];
        char[] cArr = c3494a.f40393b;
        Fe.e.q(cArr.length == 16);
        for (int i5 = 0; i5 < 256; i5++) {
            char[] cArr2 = this.f40401f;
            cArr2[i5] = cArr[i5 >>> 4];
            cArr2[i5 | 256] = cArr[i5 & 15];
        }
    }

    @Override // m8.C3498e
    public final int b(byte[] bArr, CharSequence charSequence) throws C3497d {
        if (charSequence.length() % 2 == 1) {
            throw new C3497d("Invalid input length " + charSequence.length());
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i5);
            C3494a c3494a = this.f40404a;
            bArr[i10] = (byte) ((c3494a.a(cCharAt) << 4) | c3494a.a(charSequence.charAt(i5 + 1)));
            i5 += 2;
            i10++;
        }
        return i10;
    }

    @Override // m8.C3498e
    public final void e(StringBuilder sb2, byte[] bArr, int i5) {
        Fe.e.v(0, i5, bArr.length);
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = bArr[i10] & ForkServer.ERROR;
            char[] cArr = this.f40401f;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }

    @Override // m8.C3498e
    public final C3498e f(C3494a c3494a, Character ch) {
        return new C3495b(c3494a);
    }
}

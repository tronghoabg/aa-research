package m8;

import org.apache.tika.fork.ForkServer;

/* renamed from: m8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3496c extends C3498e {
    public C3496c(String str, String str2) {
        this(new C3494a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // m8.C3498e
    public final int b(byte[] bArr, CharSequence charSequence) throws C3497d {
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        C3494a c3494a = this.f40404a;
        if (!c3494a.f40399h[length % c3494a.f40396e]) {
            throw new C3497d("Invalid input length " + charSequenceG.length());
        }
        int i5 = 0;
        int i10 = 0;
        while (i5 < charSequenceG.length()) {
            int i11 = i5 + 2;
            int iA = (c3494a.a(charSequenceG.charAt(i5 + 1)) << 12) | (c3494a.a(charSequenceG.charAt(i5)) << 18);
            int i12 = i10 + 1;
            bArr[i10] = (byte) (iA >>> 16);
            if (i11 < charSequenceG.length()) {
                int i13 = i5 + 3;
                int iA2 = iA | (c3494a.a(charSequenceG.charAt(i11)) << 6);
                int i14 = i10 + 2;
                bArr[i12] = (byte) ((iA2 >>> 8) & 255);
                if (i13 < charSequenceG.length()) {
                    i5 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iA2 | c3494a.a(charSequenceG.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i5 = i13;
                }
            } else {
                i10 = i12;
                i5 = i11;
            }
        }
        return i10;
    }

    @Override // m8.C3498e
    public final void e(StringBuilder sb2, byte[] bArr, int i5) {
        int i10 = 0;
        Fe.e.v(0, i5, bArr.length);
        for (int i11 = i5; i11 >= 3; i11 -= 3) {
            int i12 = i10 + 2;
            int i13 = ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10] & ForkServer.ERROR) << 16);
            i10 += 3;
            int i14 = i13 | (bArr[i12] & ForkServer.ERROR);
            C3494a c3494a = this.f40404a;
            sb2.append(c3494a.f40393b[i14 >>> 18]);
            char[] cArr = c3494a.f40393b;
            sb2.append(cArr[(i14 >>> 12) & 63]);
            sb2.append(cArr[(i14 >>> 6) & 63]);
            sb2.append(cArr[i14 & 63]);
        }
        if (i10 < i5) {
            d(sb2, bArr, i10, i5 - i10);
        }
    }

    @Override // m8.C3498e
    public final C3498e f(C3494a c3494a, Character ch) {
        return new C3496c(c3494a, ch);
    }

    public C3496c(C3494a c3494a, Character ch) {
        super(c3494a, ch);
        Fe.e.q(c3494a.f40393b.length == 64);
    }
}

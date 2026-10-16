package com.google.d.h;

import com.google.d.b.an;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    final char[] f7906a;

    private b(a aVar) {
        super(aVar, null);
        this.f7906a = new char[512];
        an.l(aVar.f7902f.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.f7906a[i2] = aVar.a(i2 >>> 4);
            this.f7906a[i2 | 256] = aVar.a(i2 & 15);
        }
    }

    @Override // com.google.d.h.e, com.google.d.h.f
    final int a(byte[] bArr, CharSequence charSequence) throws d {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            a aVar = this.f7908b;
            bArr[i3] = (byte) (aVar.b(charSequence.charAt(i2 + 1)) | (aVar.b(charSequence.charAt(i2)) << 4));
            i2 += 2;
            i3++;
        }
        return i3;
    }

    @Override // com.google.d.h.e
    final f b(a aVar, Character ch) {
        return new b(aVar);
    }

    @Override // com.google.d.h.e, com.google.d.h.f
    final void c(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        an.t(i2, i2 + i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i2 + i4] & 255;
            char[] cArr = this.f7906a;
            appendable.append(cArr[i5]);
            appendable.append(cArr[i5 | 256]);
        }
    }

    b() {
        this(new a("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }
}

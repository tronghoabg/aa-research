package kotlinx.b.d.a;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f51178a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51179b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f51180c;

    /* renamed from: d, reason: collision with root package name */
    private int f51181d;

    public v(OutputStream outputStream) {
        h.g.b.x.f(outputStream, "stream");
        this.f51178a = outputStream;
        this.f51179b = d.f51154a.a();
        this.f51180c = f.f51157a.a();
    }

    private final void f() throws IOException {
        this.f51178a.write(this.f51179b, 0, this.f51181d);
        this.f51181d = 0;
    }

    private final void g(char[] cArr, int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int length = cArr.length;
        if (i2 > length) {
            throw new IllegalArgumentException("count > string.length: " + i2 + " > " + length);
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            char c2 = cArr[i3];
            if (c2 < 128) {
                byte[] bArr = this.f51179b;
                int i5 = this.f51181d;
                int length2 = bArr.length;
                if (length2 - i5 <= 0) {
                    f();
                }
                int i6 = this.f51181d;
                int i7 = i6 + 1;
                this.f51181d = i7;
                bArr[i6] = (byte) c2;
                int iMin = Math.min(i2, (length2 - i7) + i4);
                while (i4 < iMin) {
                    char c3 = cArr[i4];
                    if (c3 >= 128) {
                        break;
                    }
                    int i8 = this.f51181d;
                    this.f51181d = i8 + 1;
                    bArr[i8] = (byte) c3;
                    i4++;
                }
            } else if (c2 < 2048) {
                byte[] bArr2 = this.f51179b;
                if (bArr2.length - this.f51181d < 2) {
                    f();
                }
                int i9 = this.f51181d;
                int i10 = i9 + 1;
                this.f51181d = i10;
                bArr2[i9] = (byte) ((c2 >> 6) | 192);
                this.f51181d = i9 + 2;
                bArr2[i10] = (byte) ((c2 & '?') | 128);
            } else if (c2 < 55296 || c2 > 57343) {
                byte[] bArr3 = this.f51179b;
                if (bArr3.length - this.f51181d < 3) {
                    f();
                }
                int i11 = this.f51181d;
                int i12 = i11 + 1;
                this.f51181d = i12;
                bArr3[i11] = (byte) ((c2 >> '\f') | 224);
                int i13 = i11 + 2;
                this.f51181d = i13;
                bArr3[i12] = (byte) ((63 & (c2 >> 6)) | 128);
                this.f51181d = i11 + 3;
                bArr3[i13] = (byte) ((c2 & '?') | 128);
            } else {
                char c4 = i4 < i2 ? cArr[i4] : (char) 0;
                if (c2 > 56319 || c4 < 56320 || c4 >= 57344) {
                    byte[] bArr4 = this.f51179b;
                    if (bArr4.length - this.f51181d <= 0) {
                        f();
                    }
                    int i14 = this.f51181d;
                    this.f51181d = i14 + 1;
                    bArr4[i14] = 63;
                } else {
                    int i15 = c2 & 1023;
                    int i16 = c4 & 1023;
                    byte[] bArr5 = this.f51179b;
                    if (bArr5.length - this.f51181d < 4) {
                        f();
                    }
                    int i17 = (i15 << 10) | i16;
                    int i18 = this.f51181d;
                    int i19 = i18 + 1;
                    this.f51181d = i19;
                    int i20 = i17 + 65536;
                    bArr5[i18] = (byte) ((i20 >> 18) | 240);
                    int i21 = i18 + 2;
                    this.f51181d = i21;
                    bArr5[i19] = (byte) (((i20 >> 12) & 63) | 128);
                    int i22 = i18 + 3;
                    this.f51181d = i22;
                    bArr5[i21] = (byte) (((i20 >> 6) & 63) | 128);
                    this.f51181d = i18 + 4;
                    bArr5[i22] = (byte) ((i20 & 63) | 128);
                    i3 += 2;
                }
            }
            i3 = i4;
        }
    }

    private final void h(int i2, int i3) {
        char[] cArr = this.f51180c;
        int i4 = i3 + i2;
        if (cArr.length <= i4) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, h.k.n.h(i4, i2 + i2));
            h.g.b.x.e(cArrCopyOf, "copyOf(...)");
            this.f51180c = cArrCopyOf;
        }
    }

    public final void a() throws IOException {
        f();
        f fVar = f.f51157a;
        char[] cArr = this.f51180c;
        h.g.b.x.f(cArr, "array");
        fVar.b(cArr);
        d dVar = d.f51154a;
        byte[] bArr = this.f51179b;
        h.g.b.x.f(bArr, "array");
        dVar.b(bArr);
    }

    public final void b(String str) throws IOException {
        h.g.b.x.f(str, "text");
        int length = str.length();
        h(0, length);
        str.getChars(0, length, this.f51180c, 0);
        g(this.f51180c, length);
    }

    public final void c(char c2) throws IOException {
        byte[] bArr = this.f51179b;
        if (bArr.length - this.f51181d <= 0) {
            f();
        }
        int i2 = this.f51181d;
        this.f51181d = i2 + 1;
        bArr[i2] = (byte) c2;
    }

    public final void d(long j2) throws IOException {
        b(String.valueOf(j2));
    }

    public final void e(String str) throws IOException {
        int i2;
        h.g.b.x.f(str, "text");
        h(0, str.length() + 2);
        char[] cArr = this.f51180c;
        cArr[0] = JsonFactory.DEFAULT_QUOTE_CHAR;
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i3 = length + 1;
        int length2 = 1;
        while (length2 < i3) {
            char c2 = cArr[length2];
            int length3 = ag.b().length;
            if (c2 < ']' && ag.b()[c2] != 0) {
                int length4 = str.length();
                for (int i4 = length2 - 1; i4 < length4; i4++) {
                    h(length2, 2);
                    char cCharAt = str.charAt(i4);
                    int length5 = ag.b().length;
                    if (cCharAt < ']') {
                        byte b2 = ag.b()[cCharAt];
                        if (b2 == 0) {
                            i2 = length2 + 1;
                            this.f51180c[length2] = cCharAt;
                        } else {
                            if (b2 == 1) {
                                String str2 = ag.c()[cCharAt];
                                h.g.b.x.c(str2);
                                h(length2, str2.length());
                                str2.getChars(0, str2.length(), this.f51180c, length2);
                                length2 += str2.length();
                            } else {
                                char[] cArr2 = this.f51180c;
                                cArr2[length2] = '\\';
                                cArr2[length2 + 1] = (char) b2;
                                length2 += 2;
                            }
                        }
                    } else {
                        i2 = length2 + 1;
                        this.f51180c[length2] = cCharAt;
                    }
                    length2 = i2;
                }
                h(length2, 1);
                char[] cArr3 = this.f51180c;
                cArr3[length2] = JsonFactory.DEFAULT_QUOTE_CHAR;
                g(cArr3, length2 + 1);
                f();
                return;
            }
            length2++;
        }
        cArr[i3] = JsonFactory.DEFAULT_QUOTE_CHAR;
        g(cArr, length + 2);
        f();
    }
}

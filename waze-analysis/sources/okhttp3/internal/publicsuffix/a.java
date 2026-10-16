package okhttp3.internal.publicsuffix;

import android.net.http.X509TrustManagerExtensions;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.X509TrustManager;
import k.aq;
import k.k;
import k.y;
import okhttp3.internal.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {
    public static final /* synthetic */ String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        int iB;
        int length = bArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 >= 0 && bArr[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i3 = i6 + i7;
                if (bArr[i3] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i3 - i6;
            int i9 = i2;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                iB = (z ? 46 : b.B(bArr2[i9][i10])) - b.B(bArr[i6 + i11]);
                if (iB != 0) {
                    break;
                }
                i11++;
                i10++;
                if (i11 == i8) {
                    break;
                }
                if (bArr2[i9].length != i10) {
                    z = false;
                } else {
                    if (i9 == bArr2.length - 1) {
                        break;
                    }
                    i9++;
                    z = true;
                    i10 = -1;
                }
            }
            iB = 0;
            if (iB >= 0) {
                if (iB <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr2[i9].length - i10;
                    int length3 = bArr2.length;
                    for (int i13 = i9 + 1; i13 < length3; i13++) {
                        length2 += bArr2[i13].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            Charset charset = StandardCharsets.UTF_8;
                            x.e(charset, "UTF_8");
                            return new String(bArr, i6, i8, charset);
                        }
                    }
                }
                i4 = i3 + 1;
            }
            length = i5;
        }
        return null;
    }

    public static final okhttp3.internal.g.a.b b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x.f(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new okhttp3.internal.g.a.b(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public static final k c(String str) {
        x.f(str, "<this>");
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) ((y.h(str.charAt(i3)) << 4) + y.h(str.charAt(i3 + 1)));
        }
        return new k(bArr);
    }

    public static final k d(String str) {
        x.f(str, "<this>");
        k kVar = new k(aq.b(str));
        kVar.n(str);
        return kVar;
    }

    public static final int e(k kVar, int i2) {
        x.f(kVar, "<this>");
        return i2 == -1234567890 ? kVar.d() : i2;
    }

    public static final String f(int i2) {
        if (i2 == 0) {
            return "0";
        }
        int i3 = 0;
        char[] cArr = {k.a.b.a()[(i2 >> 28) & 15], k.a.b.a()[(i2 >> 24) & 15], k.a.b.a()[(i2 >> 20) & 15], k.a.b.a()[(i2 >> 16) & 15], k.a.b.a()[(i2 >> 12) & 15], k.a.b.a()[(i2 >> 8) & 15], k.a.b.a()[(i2 >> 4) & 15], k.a.b.a()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        x.f(cArr, "<this>");
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: 8, size: 8");
        }
        if (i3 <= 8) {
            return new String(cArr, i3, 8 - i3);
        }
        throw new IllegalArgumentException("startIndex: " + i3 + " > endIndex: 8");
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final boolean h(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        x.f(bArr, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        x.f(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }
}

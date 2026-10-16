package defpackage;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class ahfb {
    private ahfb() {
    }

    public static String a(ajnb ajnbVar, ajnb[] ajnbVarArr, int i) {
        int i2;
        int i3;
        int i4;
        int iC = ajnbVar.c();
        int i5 = 0;
        while (i5 < iC) {
            int i6 = (i5 + iC) / 2;
            while (i6 >= 0 && ajnbVar.a(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (ajnbVar.a(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z) {
                    i3 = 46;
                } else {
                    byte bA = ajnbVarArr[i10].a(i11);
                    int i13 = ajiq.a;
                    i3 = bA & 255;
                }
                byte bA2 = ajnbVar.a(i7 + i12);
                int i14 = ajiq.a;
                i4 = i3 - (bA2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (ajnbVarArr[i10].c() != i11) {
                    z = false;
                } else {
                    if (i10 == ajnbVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    z = true;
                    i11 = -1;
                }
            }
            i4 = 0;
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i9 - i12;
                    int iC2 = ajnbVarArr[i10].c() - i11;
                    int length = ajnbVarArr.length;
                    for (int i16 = i10 + 1; i16 < length; i16++) {
                        iC2 += ajnbVarArr[i16].c();
                    }
                    if (iC2 >= i15) {
                        if (iC2 <= i15) {
                            return ajnbVar.j(i7, i9 + i7).h(aise.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iC = i6;
        }
        return null;
    }

    public static ajma b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new ajma(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public final ahfj toKotlinJvmBinaryClass() {
        ahfa ahfaVar = this instanceof ahfa ? (ahfa) this : null;
        if (ahfaVar != null) {
            return ahfaVar.getKotlinJvmBinaryClass();
        }
        return null;
    }

    public /* synthetic */ ahfb(afeu afeuVar) {
        this();
    }
}

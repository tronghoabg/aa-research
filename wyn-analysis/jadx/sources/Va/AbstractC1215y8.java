package Va;

import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: Va.y8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1215y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14814a = {22, '&', 17};

    /* renamed from: b, reason: collision with root package name */
    public static int f14815b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14816c = 1;

    public static String a(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14814a, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String d(Object[] objArr) throws UnsupportedEncodingException {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z2 = true;
        int i5 = 0;
        while (i5 < length) {
            Object obj = objArr[i5];
            if (!z2) {
                sb2.append(a("\u0000\u0000", new int[]{0, 2, 0, 1}, true).intern());
            }
            if (obj instanceof String) {
                int i10 = f14816c + 87;
                f14815b = i10 % 128;
                if (i10 % 2 != 0) {
                    sb2.append(a(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false).intern());
                    sb2.append(obj);
                    strA = a(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false);
                } else {
                    sb2.append(a(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false).intern());
                    sb2.append(obj);
                    strA = a(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false);
                }
                sb2.append(strA.intern());
            } else {
                sb2.append(obj);
                f14815b = (f14816c + 101) % 128;
            }
            i5++;
            f14816c = (f14815b + 9) % 128;
            z2 = false;
        }
        return sb2.toString();
    }

    public abstract C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7);

    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        AbstractC1215y8 abstractC1215y8 = this;
        while (true) {
            C1139s8 c1139s8B = abstractC1215y8.b(c1203x8, c1214y7);
            if (c1139s8B == null) {
                return c1139s8B;
            }
            int i5 = f14816c + 39;
            f14815b = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z2 = c1139s8B.c() instanceof AbstractC1215y8;
                throw null;
            }
            if (!(c1139s8B.c() instanceof AbstractC1215y8)) {
                return c1139s8B;
            }
            int i10 = f14816c + 83;
            f14815b = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            abstractC1215y8 = (AbstractC1215y8) c1139s8B.c();
            f14815b = (f14816c + 65) % 128;
        }
    }
}

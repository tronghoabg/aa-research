package Va;

import com.smaato.sdk.core.SmaatoSdk;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class D9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13276c = {']', 182, 170, 176, 192, 185, 176, 182, 175, 143, 152, 186, 191, 184, 151, 155, 182, 186, 159, 157, 192, 185, 176, 182, 191, 159, 156, 189, 184, '7', 'q', 'j', 'a', 'g', 'p'};

    /* renamed from: d, reason: collision with root package name */
    public static int f13277d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13278e = 1;

    public static String f(String str, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13276c, i5, cArr, 0, i10);
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
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr4[i16] = (char) (cArr4[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.AbstractC1127r9
    public final String a() {
        f13277d = (f13278e + 109) % 128;
        String strIntern = f("\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{29, 6, 0, 0}).intern();
        int i5 = f13277d + 51;
        f13278e = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C0995h6 c0995h6 = new C0995h6(a());
        f13277d = (f13278e + 39) % 128;
        return c0995h6;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f13277d + 79;
        f13278e = i5 % 128;
        String strIntern = (i5 % 2 == 0 ? f("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{0, 29, 79, 0}) : f("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{0, 29, 79, 0})).intern();
        f13278e = (f13277d + 67) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f13278e + 39) % 128;
        f13277d = i5;
        int i10 = i5 + 77;
        f13278e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 37 / 0;
        }
        return SmaatoSdk.class;
    }
}

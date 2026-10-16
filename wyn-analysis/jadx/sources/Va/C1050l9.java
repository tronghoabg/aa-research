package Va;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.l9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1050l9 extends AbstractC1063m9 {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f14362h = {'g', 214, 224, 215, 178, 183, 216, 211, 209, 209, 197, 197, 188, 180, 190, 171, 182, 209, 213, 213, 204, 209, 211, 212, 217, 184, 182, 209, 213, 186, 179, 206, 210, 209, 204};

    /* renamed from: i, reason: collision with root package name */
    public static int f14363i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f14364j = 1;

    @Override // Va.AbstractC1127r9
    public final String d() throws UnsupportedEncodingException {
        String str;
        f14364j = (f14363i + 77) % 128;
        int[] iArr = {0, 35, 106, 8};
        byte[] bytes = "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001".getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14362h, i5, cArr, 0, i10);
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
                str = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        f14364j = (f14363i + 23) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14364j + 53) % 128;
        f14363i = i5;
        f14364j = (i5 + 9) % 128;
        return TTAdSdk.class;
    }
}

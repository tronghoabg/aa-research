package Va;

import android.os.Process;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class Oa extends Pa {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f13578h = {530061880, -335673200, 21653685, 1653824071, 1760661792, -1447298334, -1700822279, 994988710, 1133022968, 1328671023, 1940484627, -1660375146, 559079514, -971097174, -1786809555, 385336916, -672805507, -1533997673};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f13579i = {'1', 'i', 'n', 'n', 'M', 160, 161, 129, 134, 166, 169, 166};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(int i5, String str, String str2) {
        super(str, i(3 - Process.getGidForName(""), new int[]{1455454134, -1271769495}).intern(), str2, i(8 - (Process.myTid() >> 22), new int[]{-2030285738, 363103292, 746324191, 1553107644}).intern());
        switch (i5) {
            case 1:
                super(str, h("\u0001\u0000\u0001\u0000", new int[]{0, 4, 0, 4}, false).intern(), str2, h("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{4, 8, 56, 0}, true).intern());
                break;
            default:
                break;
        }
    }

    public static String h(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13579i, i5, cArr, 0, i10);
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

    public static String i(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13578h.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

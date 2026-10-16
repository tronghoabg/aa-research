package Va;

import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoAd;

/* renamed from: Va.q6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1112q6 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14520R = {'2', 'j', '_', '^', 'f', 'm', 'o', 'k', '_', 'Z', 'n', 's', 'l', 'i', 'i', 'k', ']', 'O', '_', 'f', '+', '_', 'f', 'd', 'j', 'X', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'f', 'J', 'N', 154, 146, 147, 147, 146, 143, 'v', '|', 142, 136, 138, 131, 'o', 'n', 'd', 'm', 138, 145, 146, 142, 139, 143, 150, 's', 'p', 139, 143, 't', 'm', 141, 146, 149, 144, 146, 144, 141, 143, 142, 150, 152, 't', 'v', 153, '9', 'k', 'o', 'm', 'f', '^', '_', 'j', 'd', 'f', '_', 'O', 223, 179, 226, 213, 233, 209, 220, 192, 223, 213, 212, 217, 198, 185, 231, 213, 217, 198, 226, 213, 220, 220, 223, 226, 228, 222, '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'a', 'n', 'g', '_', 'd', 'k', 'h', 'l', 'm', 'p', 's', 'q', 'n', 'Y', 'Z', 'k', 'o', 'm', 'f', '^', '_', 'j', 'd', 'f', '_', 'O', 'V', 182, 189, 187, 193, 182, 181, 189, 196, 198, 194, 177, 176, 197, 200, 202, 199, 196, 195, 191, 194, ';', 'n', 'g', '_', ']', 'R', 'R', 'd', 'f', 'd', 'g', 'g', 'W', 'G', 'J', 202, 204, 198, 211, 198, 178, 166, 184, 222, 217, 206, 219, 206, 217, 200, 166, 201, 166, 201, '|', 249, 214, 212, 248, 246, 238, 239, 237, 240, 242, 240, 245, 242, 237, 205, 212, 239, 235, 208, 211, 246, 239, 235, 238, 242, 241, 234, 239, 212, 209, 235, 235, 235, 232, 234, 232, 205, 196, 206, 203, 219, 235, 235, 232, 234, 232, 214, 214, 214, 214, 239, 242, 243, 243, 242, 250, 139, 269, 262, 254, 251, 258, 253, 257, 269, 272, 274, 275, 251, 225, 233, ';', '`', 'U', 'k', 'k', 'Z', '[', 'j', 'm', 'l', 'r', '[', 'Z', 'm', 'f', 'e', 'f', 'S', 'R', ']', '_', 'g', ';', 'n', 'g', '_', '\\', 'c', '^', 'L', 'J', ')', 'J', 'L', '^', 'c', 'Y', '^', 'f', 'm', 'o', 'k', '+', 'K', 'J', '[', 'R', 'J', 'S', 'J', 148, 299, 298, 287, 271, 272, 272, 271, 280, 277, 286, '9', 'o', 'j', 'e', 'j', 'l', 'T', 'B', 'J', '4', 'e', 'Z', 'J', 'G', 'Y', 'd', '6', 'c', 'b', 't', 133, 138, 136, 135, 137, 133, ')', 'J', 'E', '[', 'q', 'l', 'k', 'l', 'c', 'b', 'd', '2', 'R', 'Y', 'k', 'i', 'n', 'g', 'Q', 'A', 'J', '}', 243, 250, 259, 260, 258, 242, 247, 242, 244, 263, 260, 253, ':', 'c', 'i', '{', 'u', 'w', 'p', 'v', '}', 'w', '}', '|', 'z', 'z', '}', 132, 127, 'k', '2', 'l', 'r', 'k', 'i', 'i', 'l', 's', 'n', 'Z', '_', 'k', 'i', 'n', 'g', 'Q', '['};

    /* renamed from: S, reason: collision with root package name */
    public static int f14521S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14522T = 1;

    public static SAInterface C0() {
        int i5 = f14521S + 31;
        f14522T = i5 % 128;
        if (i5 % 2 != 0) {
            return SAVideoAd.getListener();
        }
        int i10 = 76 / 0;
        return SAVideoAd.getListener();
    }

    public static JSONObject D0(SAAd sAAd) {
        int i5 = f14521S + 51;
        f14522T = i5 % 128;
        if (i5 % 2 == 0) {
            sAAd.writeToJson();
            throw null;
        }
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        int i10 = f14521S + 41;
        f14522T = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 78 / 0;
        }
        return jSONObjectWriteToJson;
    }

    public static void E0(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i5 = f14521S + 97;
        f14522T = i5 % 128;
        int i10 = i5 % 2;
        sABannerAd.setListener(sAInterface);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f14521S + 119;
        f14522T = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 18 / 0;
        }
    }

    public static String F0(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14520R, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
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

    public static String X(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 45257)) ^ ((c11 >>> 5) + 19741)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 39575) ^ ((c12 + i11) ^ ((c12 << 4) + 10528))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(F0("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{386, 13, 150, 12}, false).intern(), new C1086o6());
        map.put(F0("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{399, 18, 17, 10}, true).intern(), new N3(8));
        map.put(F0("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 17, 0, 2}, true).intern(), new C1099p6());
        f14521S = (f14522T + 21) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        int i5 = f14522T + 37;
        f14521S = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                SAVersion.getSDKVersionNumber();
                throw null;
            }
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            int i10 = f14522T + 119;
            f14521S = i10 % 128;
            if (i10 % 2 == 0) {
                return sDKVersionNumber;
            }
            throw null;
        } catch (Throwable unused) {
            C1051la c1051la = (C1051la) C0999ha.j().f14264b;
            String strIntern = X("鉄좷ⵔ\u0a61♾臦팃Წ保ᛲ㿸\udc14", 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
            c1051la.getClass();
            return C1051la.n(SAVersion.class, strIntern);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1112q6.w0(java.lang.String):java.lang.Class");
    }
}

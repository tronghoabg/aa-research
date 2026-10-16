package Va;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: Va.v5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1175v5 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14695R = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'n', 't', 'l', 'I', 'A', 'c', 'v', 'y', 'u', 'U', 'P', 'R', 'w', 'd', 'm', 'C', 'f', 'b', 'k', 'O', 'V', '-', 'j', 'q', 'x', 'z', '{'};

    /* renamed from: S, reason: collision with root package name */
    public static final char[] f14696S = {'\'', '[', 'n', 's', 'u', 'k', 210, 198, 199, 209, 207, 213, 215, 214, 204, 'V', 166, 165, 174, 174, 174, 179, 178, 171, 172, 177, 155, 151, 166, 164, 170, 172, 171, 161, 'd', 180, 175, 195, 201, 196, 190, 191, 196, 186, 190, 200, 201, 199, 193, 195, 180, 184, 206, 201, 200, 207, 208, 203, 203, 203, 194, '2', 'Z', '_', 'r', 'n', 'k', 'b', '_', 'f', 'd', 'j', '_', 'a', 'k', 'l', 'j', 'd', ';', 136, 146, 147, 145, 139, 141, 129, 134, 153, 149, 146, 137, 134, 141, 139, 145, 128, 'y', 141, 147, 142, 136, 137, 142, '2', 'l', 'b', 'a', 'k', 'l', 'j', 'd', 'f', 'W', '[', 'p', 's', 'j', 'g', 'h', 'd', 'f', 277, 298, 314, 308, 309, 275, 313, 296, 315, 309, 266, 314, 315, 295, 302, 315, 298, 308, 303, 312, 299, 302, 297, 295, 284, 244, 300, 303, 244, 308, 309, 307, 307, 309, 297, 244, 299, 301, 295, 313, 299, 312, 310, 244, 309, 303, 312};

    /* renamed from: T, reason: collision with root package name */
    public static int f14697T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14698U = 1;

    public static Presage C0() {
        int i5 = f14697T + 1;
        f14698U = i5 % 128;
        if (i5 % 2 != 0) {
            return Presage.getInstance();
        }
        int i10 = 4 / 0;
        return Presage.getInstance();
    }

    public static String D0(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14695R;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static void E0(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i5 = f14697T + 45;
        f14698U = i5 % 128;
        int i10 = i5 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i10 == 0) {
            throw null;
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
                System.arraycopy(f14696S, i5, cArr, 0, i10);
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

    public static void G0(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f14698U = (f14697T + 109) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        int i5 = f14697T + 45;
        f14698U = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(F0("\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{103, 18, 0, 17}, false).intern(), new N3(6));
        map.put(D0((byte) (17 - Process.getGidForName("")), 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u000b\u0000\u0006\u0010\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0006\u001d\b\u0006\b\u001d\b\r}").intern(), new C1149t5());
        map.put(D0((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3), 20 - ExpandableListView.getPackedPositionChild(0L), "\u000b\u0000\u0010\"\u0004\t\u0003\u0006\u0018\u0005\u0017\u0004\u0000\u0019\b\u0006\b\u001d\b\rn").intern(), new C1162u5());
        f14698U = (f14697T + 5) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() throws ClassNotFoundException {
        f14698U = (f14697T + 35) % 128;
        String strU0 = u0();
        if (strU0 == null) {
            return null;
        }
        int i5 = f14698U + 33;
        f14697T = i5 % 128;
        if (i5 % 2 != 0) {
            return strU0.split(D0((byte) (View.MeasureSpec.getMode(1) + 117), (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), "T").intern())[1];
        }
        return strU0.split(D0((byte) (View.MeasureSpec.getMode(0) + 39), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "T").intern())[0];
    }

    @Override // Va.Z0
    public final String u0() throws ClassNotFoundException {
        f14698U = (f14697T + 99) % 128;
        try {
            try {
                String str = (String) Class.forName(F0(null, new int[]{121, 47, 198, 46}, true).intern()).getMethod(D0((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 22), -((byte) KeyEvent.getModifierMetaStateMask()), "v").intern(), new Class[0]).invoke(null, new Object[0]);
                int i5 = f14698U + 27;
                f14697T = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1175v5.w0(java.lang.String):java.lang.Class");
    }
}

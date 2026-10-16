package Va;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.BidMachine;

/* renamed from: Va.h9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0998h9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14256c = {'i', 'o', '.', 'b', 'd', 'm', 'a', 'c', 'h', 'n', 'e', 'B', 'M', 'j', 'k', 'l'};

    /* renamed from: d, reason: collision with root package name */
    public static int f14257d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14258e = 1;

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14256c;
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
                            int i12 = c10 / 4;
                            int i13 = c10 % 4;
                            int i14 = c11 / 4;
                            int i15 = c11 % 4;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 3) % 4) * 4) + i13];
                                cArr2[i11] = cArr[(((i14 + 3) % 4) * 4) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 4) + ((i13 + 3) % 4)];
                                cArr2[i11] = cArr[(i14 * 4) + ((i15 + 3) % 4)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 4) + i15];
                                cArr2[i11] = cArr[(i14 * 4) + i13];
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        f14258e = (f14257d + 91) % 128;
        String strIntern = f((byte) (27 - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 10, "\u0000\u0001\u0005\u0006\u0007\u0004\f\u0004\n\u000b").intern();
        int i5 = f14258e + 83;
        f14257d = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C0939d2 c0939d2 = new C0939d2(a());
        int i5 = f14257d + 33;
        f14258e = i5 % 128;
        if (i5 % 2 != 0) {
            return c0939d2;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14258e = (f14257d + 41) % 128;
        String strIntern = f((byte) (32 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 24, "\u0001\u0002\u0003\u0000\u0004\b\u0006\u0007\u0004\u000b\u0001\b\u000e\u0006\b\u0003\b\u0000\u0007\u0004\f\u0004\n\u000b").intern();
        int i5 = f14257d + 1;
        f14258e = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 38 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14258e + 121;
        f14257d = i5 % 128;
        if (i5 % 2 == 0) {
            return BidMachine.class;
        }
        int i10 = 68 / 0;
        return BidMachine.class;
    }
}

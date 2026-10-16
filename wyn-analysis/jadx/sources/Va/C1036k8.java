package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.k8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1036k8 extends C1023j8 {

    /* renamed from: m, reason: collision with root package name */
    public static final char[] f14341m = {'E', 'r', 'o', ' ', 'e', 'x', 'c', 'u', 't', 'i', 'n', 'g', 'm', 'h', 'd', ':', 'M', 's', 'p', 'l', '.', 'a', 'U', 'B', 'F'};

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14342l = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1036k8(C1214y7 c1214y7, String str, String str2) {
        StringBuilder sbJ = N0.a.j(str2);
        sbJ.append(e("#\u0017\u001e\u0013ￏ￩ￏ￼\u0014", TextUtils.getTrimmedLength("") + 9, AndroidCharacter.getMirror('0') + 197, 5 - ((Process.getThreadPriority(0) + 20) >> 6), false).intern());
        sbJ.append(str);
        sbJ.append(e("ￅ\u0018\u000eￅￓ\t\n\u0013\u000e\u000b\n\t\u0013\u001a", (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, TextUtils.getCapsMode("", 0, 0) + 255, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true).intern());
        super(c1214y7, null, sbJ.toString(), null);
    }

    public static String e(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 164);
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14341m;
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
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
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

    @Override // Va.C1023j8
    public final String a() {
        switch (this.f14342l) {
            case 0:
                return f((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 103), MotionEvent.axisFromString("") + 42, "\u0010\u0002\u000f\u0018\u0010\u0018\u000b\f\u0015\u0017\f\u000f\b\u0011\u0011\u0003\u0003\u0006\t\u0013\u0015\u0003\u000e\u0013\u000e\u0001\u0013\u0001\r\u0012\u0004\f\u0005\n\t\u0001\u0017\r\u0007\u0004Ö").intern();
            default:
                return e("\uffdf\u0012�\uffff\n\u000e\u0003\t\b\r\f\u0006\uffc8\u0006\ufffb\b\u0001\uffc8\uffef\b\r\u000f\n\n\t\f\u000e\uffff\ufffe\uffe7\uffff\u000e\u0002\t\ufffe", View.combineMeasuredStates(0, 0) + 35, Gravity.getAbsoluteGravity(0, 0) + 266, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, false).intern();
        }
    }

    public C1036k8(C1214y7 c1214y7, C1203x8 c1203x8, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 32), Color.rgb(0, 0, 0) + 16777232, "\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\t\b\t\u0005\u000e\r\u0001").intern());
        sb2.append(str);
        sb2.append(f((byte) (Process.getGidForName("") + 58), View.getDefaultSize(0, 0) + 31, "\u0002\r\u0003\t\f\u0003\n\u0013\u0001\u0012\u0003\t\f\u0003\r\u0004\f\u0000\r\b\u0016\f©©\u0003\u0002\t\u0003\n\u0013Y").intern());
        sb2.append(str2);
        super(c1214y7, c1203x8, sb2.toString(), null);
    }
}

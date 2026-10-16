package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f13435a;

    /* renamed from: b, reason: collision with root package name */
    public static final J f13436b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f13437c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f13438d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ J[] f13439e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f13440f = {'A', 'L', 'B', 'O', 'V', 'E', 'W', 'X', 'C', 'T', 'D', 'F', 'G', 'H', 'I', 'J'};

    /* renamed from: g, reason: collision with root package name */
    public static int f13441g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13442h = 1;

    static {
        J j8 = new J(a((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 104), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0001\u0002µ").intern(), 0);
        f13435a = j8;
        J j10 = new J(a((byte) (2 - Color.blue(0)), (ViewConfiguration.getTouchSlop() >> 8) + 5, "\u0001\u0003\u0000\u0007G").intern(), 1);
        f13436b = j10;
        J j11 = new J(a((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 11), TextUtils.getCapsMode("", 0, 0) + 5, "\u0001\u0006\u0002\u0000b").intern(), 2);
        f13437c = j11;
        J j12 = new J(a((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, "\u0006\u0004\u0004\fq").intern(), 3);
        f13438d = j12;
        f13439e = new J[]{j8, j10, j11, j12};
        f13442h = (f13441g + 105) % 128;
    }

    public static String a(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13440f;
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

    public static J valueOf(String str) {
        f13441g = (f13442h + 125) % 128;
        J j8 = (J) Enum.valueOf(J.class, str);
        f13441g = (f13442h + 59) % 128;
        return j8;
    }

    public static J[] values() {
        f13442h = (f13441g + 97) % 128;
        J[] jArr = (J[]) f13439e.clone();
        int i5 = f13441g + 75;
        f13442h = i5 % 128;
        if (i5 % 2 != 0) {
            return jArr;
        }
        throw null;
    }
}

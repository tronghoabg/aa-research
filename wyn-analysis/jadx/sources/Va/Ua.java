package Va;

import android.os.Process;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class Ua implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f13758b = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'f', 'e', ' ', 'o', 'F', 'r', 'n', 'B', 'C', 'E', 'G', 'H', 'I'};

    /* renamed from: c, reason: collision with root package name */
    public static int f13759c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13760d = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Va f13761a;

    public static String a(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13758b;
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

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        f13759c = (f13760d + 75) % 128;
        try {
            Cb.e(this.f13761a);
            int i5 = f13759c + 43;
            f13760d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Ab.o(a((byte) (48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 12 - ExpandableListView.getPackedPositionType(0L), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f").intern(), a((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 15), ((Process.getThreadPriority(0) + 20) >> 6) + 14, "\u000e\u0002\u0007\u0006\u000b\u0003\u000b\u0004\u0010\u0011\u0013\u0002\u0017\u0012").intern(), th, false);
        }
    }
}

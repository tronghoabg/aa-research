package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f13172d = {76, -66, -121, 120, -125, 8, -73, -71, 73, 75, -11, 114, 77, -76, 71, -95, 74, -73, 77, 74, -115, 15, -65, -79, -122, 118, -120, -78, 71, 117, -79, 78, -78, -66, 12, -2, -57, 56, -61, 72, -9, -7, 9, 11, -75, 50, 13, -12, 7, -31, 10, -9, 13, 10, -51, 79, -1, -15, -58, 76, -78, -14, 7, 53, -15, 14, -14, -2, -103, 107, 82, -83, 86, -35, 98, 108, -100, -98, 32, -89, -104, 97, -110, 116, -97, 98, -104, -97, 88, -38, 106, 100, 83, -85, 85, 103, -110, -96, 100, -101, 103, 107, -75, 125, -13, 64, 118, -120, 67, 73, -76, -74, 73, 73, -92, -75, 15, -39, 9, -31, 7, 22, -62, 12, 40, -37, 7, 24, -27, 55, 0, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static int f13173e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13174f = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f13175a;

    /* renamed from: b, reason: collision with root package name */
    public String f13176b;

    /* renamed from: c, reason: collision with root package name */
    public String f13177c;

    static {
        a((-1632032543) - (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 39, (byte) (4 - (Process.myTid() >> 22)), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 301491334 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        f13174f = (f13173e + 29) % 128;
    }

    public static String a(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 54;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13172d[(-301491218) + i11] + 54);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 301491220) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1632032592);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13172d;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            f13174f = (f13173e + 69) % 128;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(a((-1632032545) - ExpandableListView.getPackedPositionType(0L), ImageFormat.getBitsPerPixel(0) - 52, (byte) ((-96) - Color.blue(0)), (short) KeyEvent.keyCodeFromString(""), Color.green(0) + 301491334).intern());
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        String string = sb2.toString();
        f13174f = (f13173e + 65) % 128;
        return string;
    }
}

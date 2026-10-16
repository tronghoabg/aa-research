package Va;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class D extends Mb {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13266h = {163, 165, 162, 167, 161, 166, 160, 152, 169, 151, 156, 148, 154, 153, 171, 168, 159};

    /* renamed from: i, reason: collision with root package name */
    public static int f13267i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13268j = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f13269g = (int) TimeUnit.SECONDS.toMillis(120);

    public D(W w2) {
        y(127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
        u((char) TextUtils.indexOf("", "", 0), "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", KeyEvent.normalizeMetaState(0) + 13144434).intern();
        this.f13539b = w2;
    }

    public static String u(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 51587);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String y(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13266h;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - '3');
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final long t() {
        f13268j = (f13267i + 25) % 128;
        long jOptLong = e().optLong(y(MotionEvent.axisFromString("") + 128, "\u0086\u0084").intern(), 0L);
        int i5 = f13267i + 19;
        f13268j = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 59 / 0;
        }
        return jOptLong;
    }

    public final List x() {
        List listV = Ab.V(((W) this.f13539b).f13808d, W.b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0098\u008c\u0089").intern(), new ArrayList());
        W.f13804h = (W.f13803g + 39) % 128;
        listV.addAll(Ab.V(e(), u((char) ((Process.myTid() >> 22) + 35929), "혰阨妇綌", "\ue491ﰣ钌", MotionEvent.axisFromString("") - 2020202281).intern(), new ArrayList()));
        int i5 = f13267i + 109;
        f13268j = i5 % 128;
        if (i5 % 2 != 0) {
            return listV;
        }
        throw null;
    }

    public final int z() {
        f13267i = (f13268j + 33) % 128;
        int iOptInt = e().optInt(y(127 - (ViewConfiguration.getTouchSlop() >> 8), "\u0081\u0088\u0087").intern(), 40);
        f13267i = (f13268j + 67) % 128;
        return iOptInt;
    }
}

package Va;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.tapjoy.Tapjoy;

/* loaded from: classes4.dex */
public final class E9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f13315c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13316d = 1;

    public static String f(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "哉\ude54དྷ㰵".toCharArray();
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
                        long j8 = (charArray[i10] ^ c12) ^ 4338390664633144521L;
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        int i5 = f13315c + 73;
        f13316d = i5 % 128;
        int i10 = i5 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return (i10 == 0 ? f((char) (52850 % (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))), "\ue440呖珓蓎", "㋐ꜳ笗轑쮍깃", 1 % ExpandableListView.getPackedPositionChild(0L)) : f((char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 52850), "\ue440呖珓蓎", "㋐ꜳ笗轑쮍깃", ExpandableListView.getPackedPositionChild(0L) + 1)).intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1225z6 c1225z6 = new C1225z6(a());
        int i5 = f13316d + 23;
        f13315c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 91 / 0;
        }
        return c1225z6;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        char pressedStateDuration;
        int iArgb;
        int i5 = f13316d + 25;
        f13315c = i5 % 128;
        if (i5 % 2 != 0) {
            pressedStateDuration = (char) (48310 >>> (ViewConfiguration.getPressedStateDuration() >>> 78));
            iArgb = 1612455306 << Color.argb(0, 1, 1, 0);
        } else {
            pressedStateDuration = (char) (48310 - (ViewConfiguration.getPressedStateDuration() >> 16));
            iArgb = 1612455306 - Color.argb(0, 0, 0, 0);
        }
        return f(pressedStateDuration, "誎ᰝ뙠䊼", "\ue457攖菹\u001c\uebc7期續\u31eb︦\ue2e0킶䦬ꕜ毥报ⶔ验", iArgb).intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f13315c;
        f13316d = (i5 + 79) % 128;
        f13316d = (i5 + 121) % 128;
        return Tapjoy.class;
    }
}

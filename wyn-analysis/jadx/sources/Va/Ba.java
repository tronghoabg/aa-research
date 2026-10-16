package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class Ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static int f13243a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f13244b = 1;

    public static String b(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 11283)) ^ ((c11 >>> 5) + 62172)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 46220) ^ ((c12 + i11) ^ ((c12 << 4) + 55537))));
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

    public void a(Throwable th) {
        String strIntern = b(13 - TextUtils.lastIndexOf("", '0', 0, 0), "롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, "ᖈ债ꃥ꜂\uea59諒젖⳦綱쥯팑൞悖㓊湞嵑").intern());
        sb2.append(getClass().getName());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b(6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "䁆惛忟㭴\u05c9\udd08").intern());
        sb3.append(getClass().getName());
        sb3.append(b(1 - View.combineMeasuredStates(0, 0), "鬩滏").intern());
        Ab.m(strIntern, string, sb3.toString(), th);
        String strIntern2 = b(14 - Drawable.resolveOpacity(0, 0), "롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6").intern();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(b(TextUtils.indexOf("", "", 0) + 15, "ᖈ债ꃥ꜂\uea59諒젖⳦綱쥯팑൞悖㓊湞嵑").intern());
        sb4.append(getClass().getName());
        Ab.x(strIntern2, sb4.toString());
        Ab.R(b((ViewConfiguration.getTapTimeout() >> 16) + 14, "롋翳\uf534渚暛⮙涴藈喊\ue565\uf617ﰫ풽\ue2e6").intern(), b(Color.rgb(0, 0, 0) + 16777224, "깙瞈ჟ砗犽㰠ࡺ偰").intern(), th);
        f13243a = (f13244b + 123) % 128;
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = f13243a + 87;
        f13244b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                c();
            } else {
                c();
                throw null;
            }
        } catch (Throwable th) {
            try {
                a(th);
            } catch (Throwable unused) {
            }
        }
    }
}

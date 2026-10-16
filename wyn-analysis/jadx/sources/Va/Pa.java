package Va;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class Pa {

    /* renamed from: f, reason: collision with root package name */
    public static int f13606f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13607g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final String f13608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13610c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13612e = true;

    public Pa(String str, String str2, String str3, String str4) {
        this.f13608a = str;
        this.f13609b = str2;
        this.f13610c = str3;
        this.f13611d = str4;
    }

    public static String a() {
        int i5 = f13606f + 83;
        f13607g = i5 % 128;
        if (i5 % 2 == 0) {
            G.S().M();
            throw null;
        }
        String strM = G.S().M();
        f13607g = (f13606f + 11) % 128;
        return strM;
    }

    public static String e(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 18853)) ^ ((c11 >>> 5) + 10475)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 1283) ^ ((c12 + i11) ^ ((c12 << 4) + 52072))));
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

    public final String b() {
        String strIntern;
        String strA;
        int i5 = f13607g + 65;
        f13606f = i5 % 128;
        if (i5 % 2 != 0) {
            strIntern = e(21 / Color.red(1), "ҳ斺芥黱纹⇭ךּ磓Ս豉").intern();
            strA = a();
            if (!this.f13612e) {
                return strIntern;
            }
        } else {
            strIntern = e(Color.red(0) + 9, "ҳ斺芥黱纹⇭ךּ磓Ս豉").intern();
            strA = a();
            if (!this.f13612e) {
                return strIntern;
            }
        }
        if (TextUtils.isEmpty(strA)) {
            return strIntern;
        }
        StringBuilder sbJ = N0.a.j(strIntern);
        sbJ.append(e(3 - TextUtils.lastIndexOf("", '0', 0), "믚Ȝ궾鬗").intern());
        sbJ.append(strA);
        sbJ.append(e(1 - Color.green(0), "Ս豉").intern());
        String string = sbJ.toString();
        f13606f = (f13607g + 5) % 128;
        return string;
    }

    public String c() {
        StringBuilder sbJ = N0.a.j(b());
        sbJ.append(this.f13608a);
        sbJ.append(e(Color.blue(0) + 1, "Ս豉").intern());
        sbJ.append(this.f13609b);
        sbJ.append(e((ViewConfiguration.getLongPressTimeout() >> 16) + 1, "窜謽").intern());
        sbJ.append(e((ViewConfiguration.getScrollBarSize() >> 8) + 3, "燽贪ᣯ齶").intern());
        sbJ.append(e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "窜謽").intern());
        sbJ.append(this.f13610c);
        sbJ.append(e((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, "窜謽").intern());
        sbJ.append(this.f13611d);
        String string = sbJ.toString();
        int i5 = f13606f + 71;
        f13607g = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final String d() {
        String strC;
        String strIntern;
        String strE;
        int i5 = f13607g + 111;
        f13606f = i5 % 128;
        if (i5 % 2 != 0) {
            strC = c();
            strIntern = e(-TextUtils.lastIndexOf("", (char) 2, 1, 1), "Ս豉").intern();
            ViewConfiguration.getPressedStateDuration();
            strE = e(0, "窜謽");
        } else {
            strC = c();
            strIntern = e(-TextUtils.lastIndexOf("", '0', 0, 0), "Ս豉").intern();
            strE = e(1 - (ViewConfiguration.getPressedStateDuration() >> 16), "窜謽");
        }
        String strReplace = strC.replace(strIntern, strE.intern());
        f13606f = (f13607g + 85) % 128;
        return strReplace;
    }

    public final String f(String str) {
        StringBuilder sbJ = N0.a.j(b());
        int i5 = f13606f + 119;
        f13607g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        sbJ.append(this.f13608a);
        sbJ.append(e(1 - (ViewConfiguration.getWindowTouchSlop() >> 8), "Ս豉").intern());
        sbJ.append(e(3 - (Process.myPid() >> 22), "燽贪ᣯ齶").intern());
        sbJ.append(e(Color.green(0) + 1, "Ս豉").intern());
        sbJ.append(str);
        sbJ.append(e(-MotionEvent.axisFromString(""), "Ս豉").intern());
        int i10 = f13607g + 47;
        f13606f = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
        sbJ.append(this.f13609b);
        sbJ.append(e((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, "窜謽").intern());
        sbJ.append(e(3 - View.resolveSize(0, 0), "燽贪ᣯ齶").intern());
        sbJ.append(e((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "窜謽").intern());
        sbJ.append(g());
        sbJ.append(e(1 - Color.alpha(0), "窜謽").intern());
        int i12 = f13606f + 69;
        int i13 = i12 % 128;
        f13607g = i13;
        if (i12 % 2 == 0) {
            int i14 = 46 / 0;
        }
        int i15 = i13 + 75;
        f13606f = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 56 / 0;
        }
        sbJ.append(this.f13611d);
        String string = sbJ.toString();
        f13607g = (f13606f + 11) % 128;
        return string;
    }

    public final String g() {
        int i5 = f13606f;
        int i10 = i5 + 69;
        f13607g = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
        int i12 = i5 + 43;
        f13607g = i12 % 128;
        if (i12 % 2 != 0) {
            return this.f13610c;
        }
        throw null;
    }
}

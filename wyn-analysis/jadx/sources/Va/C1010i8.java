package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;

/* renamed from: Va.i8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1010i8 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f14282d = {'a', 'n', 'd', 'r', 'o', 'i', '-', '.', 's', 'l', ' ', 't', ',', '\n', '[', ']'};

    /* renamed from: e, reason: collision with root package name */
    public static int f14283e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14284f = 1;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14285a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final String f14286b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14287c;

    public C1010i8(String str, String str2) {
        this.f14286b = str;
        this.f14287c = str2;
    }

    public static String b(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14282d;
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

    public static String c(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 63967)) ^ ((c11 >>> 5) + 19005)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 39987) ^ ((c12 + i11) ^ ((c12 << 4) + 14632))));
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

    public static String d(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 58563)) ^ ((c11 >>> 5) + 3065)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 2130) ^ ((c12 + i11) ^ ((c12 << 4) + 64547))));
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

    public final void a(C1062m8 c1062m8) {
        int i5 = f14284f + 105;
        f14283e = i5 % 128;
        int i10 = i5 % 2;
        this.f14285a.add(c1062m8);
        if (i10 != 0) {
            int i11 = 55 / 0;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b((byte) (3 - View.MeasureSpec.makeMeasureSpec(0, 0)), 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "##\u0003\b#").intern());
        sb2.append(this.f14285a.toString().replace(b((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 15), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, "\u000e\b").intern(), b((byte) (17 - KeyEvent.getDeadChar(0, 0)), 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u000e\t\b\u0002\b\u000b").intern()).replace(b((byte) (20 - Color.alpha(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, "o").intern(), "").replace(b((byte) (73 - Drawable.resolveOpacity(0, 0)), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "¦").intern(), ""));
        String string = sb2.toString();
        int i5 = f14283e + 103;
        f14284f = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }
}

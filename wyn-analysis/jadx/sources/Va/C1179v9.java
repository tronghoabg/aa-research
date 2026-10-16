package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import jp.maio.sdk.android.MaioAds;

/* renamed from: Va.v9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1179v9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14709c = {'j', 'p', '.', 'm', 'a', 'i', 'o', 's', 'd', 'k', 'n', 'r', 'M', 'A', 'l', 'q'};

    /* renamed from: d, reason: collision with root package name */
    public static int f14710d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14711e = 1;

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14709c;
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
        f14710d = (f14711e + 73) % 128;
        String strIntern = f((byte) (7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.alpha(0) + 4, "\u0000\u0007\u0006\u0007").intern();
        int i5 = f14710d + 71;
        f14711e = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        M3 m32 = new M3(a());
        int i5 = f14711e + 29;
        f14710d = i5 % 128;
        if (i5 % 2 == 0) {
            return m32;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        String strF;
        int i5 = f14711e + 49;
        f14710d = i5 % 128;
        if (i5 % 2 != 0) {
            strF = f((byte) (TextUtils.indexOf("", "", 0, 1) * 22), View.MeasureSpec.makeMeasureSpec(1, 0) + 89, "\u0001\u0002\u0003\u0000\u0005\u0006\n\u0006\u0004\u000b\n\u0001\u0006\b\t\b\u0007\u0006\n\u0000\u0000\b\u0006\u0007\f\t§");
        } else {
            strF = f((byte) (52 - TextUtils.indexOf("", "", 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 27, "\u0001\u0002\u0003\u0000\u0005\u0006\n\u0006\u0004\u000b\n\u0001\u0006\b\t\b\u0007\u0006\n\u0000\u0000\b\u0006\u0007\f\t§");
        }
        String strIntern = strF.intern();
        int i10 = f14711e + 115;
        f14710d = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14710d + 99) % 128;
        f14711e = i5;
        f14710d = (i5 + 1) % 128;
        return MaioAds.class;
    }
}

package Va;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.five_corp.ad.FiveAd;

/* renamed from: Va.j9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1024j9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14316c = {'c', 'o', 'm', '.', 'f', 'i', 'v', 'e', '_', 'r', 'p', 'a', 'd', 'F', 'A', 'g'};

    /* renamed from: d, reason: collision with root package name */
    public static int f14317d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14318e = 1;

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14316c;
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
        int i5 = f14318e + 31;
        f14317d = i5 % 128;
        String strIntern = f((byte) (1 - TextUtils.indexOf("", "")), i5 % 2 != 0 ? 2 >> AndroidCharacter.getMirror('\b') : AndroidCharacter.getMirror('0') - '*', "\u0005\u0006\u0007\u0004\b\u000f").intern();
        f14318e = (f14317d + 119) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1044l3 c1044l3 = new C1044l3(a());
        int i5 = f14317d + 105;
        f14318e = i5 % 128;
        if (i5 % 2 != 0) {
            return c1044l3;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int iIndexOf;
        int trimmedLength;
        int i5 = f14317d + 63;
        f14318e = i5 % 128;
        if (i5 % 2 == 0) {
            iIndexOf = 22 >>> TextUtils.indexOf("", "", 0);
            trimmedLength = 116 >> TextUtils.getTrimmedLength("");
        } else {
            iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            trimmedLength = TextUtils.getTrimmedLength("") + 48;
        }
        return f((byte) trimmedLength, iIndexOf, "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\f\u0004\u0005\r\u000b\u0002\b\u000f\u0001\u000f\u0006\u0007\u0006\u000f\u0094").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14318e + 87) % 128;
        f14317d = i5;
        int i10 = i5 + 33;
        f14318e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 42 / 0;
        }
        return FiveAd.class;
    }
}

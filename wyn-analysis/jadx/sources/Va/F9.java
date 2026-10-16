package Va;

import android.text.TextUtils;
import com.qq.e.comm.managers.GDTAdSdk;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class F9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13342c = {153, 165, 163, 'd', 167, 155, 151, 164, 157, 168, 169, '}', 'z', 138, 'w', 154, 137, 161, 170};

    /* renamed from: d, reason: collision with root package name */
    public static int f13343d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13344e = 1;

    public static String f(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13342c;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - '6');
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        int i5 = f13344e + 119;
        f13343d = i5 % 128;
        String strIntern = (i5 % 2 != 0 ? f(67 % TextUtils.lastIndexOf("", (char) 24, 0, 0), "\u0093\u0088\u0086\u0081\u0088\u0086\u0093") : f(126 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0093\u0088\u0086\u0081\u0088\u0086\u0093")).intern();
        f13343d = (f13344e + 17) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        F6 f62 = new F6(a());
        f13344e = (f13343d + 49) % 128;
        return f62;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f13343d + 57;
        f13344e = i5 % 128;
        return f(i5 % 2 == 0 ? TextUtils.indexOf((CharSequence) "", '$') + 6538 : TextUtils.indexOf((CharSequence) "", '0') + 128, "\u0092\u0090\u0091\u0090\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0086\u0089\u0087\u0088\u0087\u0083\u0084\u0083\u0083\u0082\u0081\u0084\u0086\u0084\u0085\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f13344e + 33) % 128;
        f13343d = i5;
        f13344e = (i5 + 29) % 128;
        return GDTAdSdk.class;
    }
}

package Va;

import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.s9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1140s9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14578c = {278, 290, 288, 225, 284, 289, 277, 294, 279, 286, 252, 256, 262};

    /* renamed from: d, reason: collision with root package name */
    public static int f14579d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14580e = 1;

    public static String f(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14578c;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 179);
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
        int i5 = f14580e + 37;
        f14579d = i5 % 128;
        return f(i5 % 2 != 0 ? TextUtils.indexOf("", "") * 97 : TextUtils.indexOf("", "") + 127, "\u0085\u0087\u0082\u0083\u0086\u0085").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        H2 h22 = new H2(a());
        int i5 = f14579d + 17;
        f14580e = i5 % 128;
        if (i5 % 2 != 0) {
            return h22;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14579d = (f14580e + 13) % 128;
        String strIntern = f(126 - TextUtils.indexOf((CharSequence) "", '0'), "\u008a\u0089\u008d\u0085\u0087\u0082\u008c\u0086\u008b\u0084\u008a\u0089\u0088\u0084\u0085\u0087\u0082\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i5 = f14579d + 15;
        f14580e = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 38 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14580e + 69;
        f14579d = i5 % 128;
        if (i5 % 2 == 0) {
            return InMobiSdk.class;
        }
        throw null;
    }
}

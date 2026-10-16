package Va;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class P implements InterfaceC1167ua {

    /* renamed from: b, reason: collision with root package name */
    public static int f13590b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f13591c = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ V f13592a;

    public static String b(int i5, int i10, int i11, boolean z2) {
        String str;
        char[] charArray = "\u0005\u0002\u0005\u0007\u0003\ufff2\ufff8\u0005".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - ']');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.InterfaceC1167ua
    public final JSONObject a(String str, JSONObject jSONObject) {
        int i5 = f13591c + 77;
        f13590b = i5 % 128;
        if (i5 % 2 == 0 ? str.equals(b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, 201 - TextUtils.lastIndexOf("", '0'), 2 - TextUtils.lastIndexOf("", '0', 0, 0), false).intern()) : str.equals(b(101 - (ViewConfiguration.getDoubleTapTimeout() - 73), 4960 << TextUtils.lastIndexOf("", 'x'), 5 % TextUtils.lastIndexOf("", 'r', 1, 1), true).intern())) {
            return this.f13592a.u();
        }
        int i10 = f13590b + 13;
        f13591c = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }
}

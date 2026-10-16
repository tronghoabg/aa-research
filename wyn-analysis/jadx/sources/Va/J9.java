package Va;

import android.graphics.Color;
import com.vungle.ads.internal.network.VungleApiClient;

/* loaded from: classes4.dex */
public final class J9 extends AbstractC1063m9 {

    /* renamed from: h, reason: collision with root package name */
    public static int f13454h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f13455i = 1;

    @Override // Va.AbstractC1063m9, Va.AbstractC1127r9
    public final Z0 c() {
        C1061m7 c1061m7 = new C1061m7(a());
        int i5 = f13454h + 101;
        f13455i = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 93 / 0;
        }
        return c1061m7;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        String str;
        f13455i = (f13454h + 57) % 128;
        int iAlpha = 47 - Color.alpha(0);
        char[] charArray = "뾍굧\uf237吟鮈\uf48fㄑ裪줾◖\ue17f鉒黫觛᭨굆凅ꯗ邙뤊矍䡿蛳匎涙\uf02e\ue10c엡뗆ꛂنᢩ첫䴏ㄑ裪줾◖ഘ簶\ue03a\ue560ｗ걤遇죟쟾讪".toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i5 = Ab.f13197E;
                    if (i5 >= charArray.length) {
                        break;
                    }
                    cArr2[0] = charArray[i5];
                    cArr2[1] = charArray[i5 + 1];
                    int i10 = 58224;
                    for (int i11 = 0; i11 < 16; i11++) {
                        char c10 = cArr2[1];
                        char c11 = cArr2[0];
                        char c12 = (char) (c10 - (((c11 + i10) ^ ((c11 << 4) + 58943)) ^ ((c11 >>> 5) + 1680)));
                        cArr2[1] = c12;
                        cArr2[0] = (char) (c11 - (((c12 >>> 5) + 58740) ^ ((c12 + i10) ^ ((c12 << 4) + 30900))));
                        i10 -= 40503;
                    }
                    int i12 = Ab.f13197E;
                    cArr[i12] = cArr2[0];
                    cArr[i12 + 1] = cArr2[1];
                    Ab.f13197E = i12 + 2;
                }
                str = new String(cArr, 0, iAlpha);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        int i13 = f13454h + 101;
        f13455i = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 18 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f13455i + 119;
        f13454h = i5 % 128;
        if (i5 % 2 == 0) {
            return VungleApiClient.class;
        }
        throw null;
    }
}

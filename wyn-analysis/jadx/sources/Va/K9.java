package Va;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.vungle.warren.VungleApiClient;

/* loaded from: classes4.dex */
public final class K9 extends AbstractC1063m9 {

    /* renamed from: h, reason: collision with root package name */
    public static int f13483h;

    public static String g(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 43895)) ^ ((c11 >>> 5) + 12879)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 47927) ^ ((c12 + i11) ^ ((c12 << 4) + 11344))));
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

    @Override // Va.AbstractC1063m9, Va.AbstractC1127r9
    public final Z0 c() {
        C1073n6 c1073n6 = new C1073n6(g(((byte) KeyEvent.getModifierMetaStateMask()) + 7, "ួ삿㡖䵁ᙢൢ").intern());
        if ((f13483h + 63) % 2 == 0) {
            int i5 = 95 / 0;
        }
        return c1073n6;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        String strIntern = g(33 - TextUtils.indexOf("", "", 0, 0), "\uf8f1ԉ捀\udc4dួ삿㡖䵁ᙢൢ宎Ⰹ\udc03䭫彔䫍\uf85d傘うᢴ㡖䵁ᙢൢﲞ굖\ue400砘吞織H혓ລ뛺").intern();
        if ((f13483h + 117) % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = ((f13483h + 57) % 128) + 29;
        f13483h = i5 % 128;
        if (i5 % 2 == 0) {
            return VungleApiClient.class;
        }
        throw null;
    }
}

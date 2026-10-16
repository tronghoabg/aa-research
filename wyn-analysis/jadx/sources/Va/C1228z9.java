package Va;

import android.view.ViewConfiguration;
import com.ogury.ad.OguryReward;

/* renamed from: Va.z9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1228z9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14846c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14847d = 1;

    public static String f(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 12054)) ^ ((c11 >>> 5) + 60377)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 6114) ^ ((c12 + i11) ^ ((c12 << 4) + 47364))));
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        f14847d = (f14846c + 123) % 128;
        String strIntern = f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, "㴻5蓨鱦ƕ䄗").intern();
        f14846c = (f14847d + 39) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1136s5 c1136s5 = new C1136s5(a());
        int i5 = f14846c + 17;
        f14847d = i5 % 128;
        if (i5 % 2 != 0) {
            return c1136s5;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14847d = (f14846c + 89) % 128;
        String strIntern = f(24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "ﰅ懠븿萧㴻5蓨鱦䀢ꮎ礁\uedb3⭟굕\ue5d7䵌\udda5䅩\u2427펹뾚凭ꌁ\ue4f3").intern();
        f14847d = (f14846c + 43) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14847d + 101;
        f14846c = i5 % 128;
        if (i5 % 2 == 0) {
            return OguryReward.class;
        }
        throw null;
    }
}

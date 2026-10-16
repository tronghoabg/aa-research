package Va;

import android.graphics.Color;
import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* loaded from: classes4.dex */
public final class I9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f13429c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13430d = 1;

    public static String b(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 3663)) ^ ((c11 >>> 5) + 7660)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 21903) ^ ((c12 + i11) ^ ((c12 << 4) + 42611))));
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
        int i5 = f13429c + 53;
        f13430d = i5 % 128;
        String strIntern = b(i5 % 2 == 0 ? 126 - Color.argb(0, 1, 0, 0) : 6 - Color.argb(0, 0, 0, 0), "ӱ龢뮻䘇談빾").intern();
        int i10 = f13429c + 59;
        f13430d = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C0957e7 c0957e7 = new C0957e7(a());
        f13430d = (f13429c + 37) % 128;
        return c0957e7;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f13429c + 79;
        f13430d = i5 % 128;
        String strIntern = (i5 % 2 == 0 ? b(33 / TextUtils.indexOf("", "", 1), "蟨奠麝䳺ӱ龢뮻䘇談빾唯踒\ud8ea\u0e80\udce5၀祪鋻\ude30⍛髤턕蟨奠画酏彩⧝裡儾\ud8ea\u0e80\udce5၀툭⏎\ue990䍮") : b(TextUtils.indexOf("", "", 0) + 38, "蟨奠麝䳺ӱ龢뮻䘇談빾唯踒\ud8ea\u0e80\udce5၀祪鋻\ude30⍛髤턕蟨奠画酏彩⧝裡儾\ud8ea\u0e80\udce5၀툭⏎\ue990䍮")).intern();
        int i10 = f13430d + 57;
        f13429c = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f13429c + 65;
        f13430d = i5 % 128;
        if (i5 % 2 != 0) {
            return MobileAds.class;
        }
        int i10 = 62 / 0;
        return MobileAds.class;
    }
}

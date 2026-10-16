package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.facebook.ads.AdSettings;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.o9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1089o9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14461c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14462d = 1;

    public static String f(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 61608);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    @Override // Va.AbstractC1127r9
    public final String a() {
        int i5 = f14462d + 109;
        f14461c = i5 % 128;
        int i10 = i5 % 2;
        String strIntern = f((char) Color.blue(0), "\u0093뛎\ue42f脞", "鍝឴重檎\udfd9鸽\uefb8曹", TextUtils.indexOf("", "")).intern();
        int i11 = f14461c + 85;
        f14462d = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1082o2 c1082o2 = new C1082o2(a());
        f14462d = (f14461c + 65) % 128;
        return c1082o2;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14461c = (f14462d + 27) % 128;
        String strIntern = f((char) (8471 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "쌗缚ៀ⌡", "靜贮⧪䜫쏻䐿쨎\uf569괵첪돦肵⌷䌷꾏䉻髣軁㼅\uec08ҕ睄픥\ud848⚳劀᷷", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1065411901).intern();
        f14462d = (f14461c + 49) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14462d + 103) % 128;
        f14461c = i5;
        f14462d = (i5 + 69) % 128;
        return AdSettings.class;
    }
}

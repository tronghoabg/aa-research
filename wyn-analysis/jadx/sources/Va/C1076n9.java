package Va;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.n9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1076n9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14428c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14429d = 1;

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-1957804764585672133L));
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
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
        f14428c = (f14429d + 115) % 128;
        String strIntern = b(12281 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "쉝\ueda3鶠䶢綽ⶏ\udd89").intern();
        int i5 = f14429d + 71;
        f14428c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 12 / 0;
        }
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C0901a3 c0901a3 = new C0901a3(a());
        f14428c = (f14429d + 57) % 128;
        return c0901a3;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14429d = (f14428c + 87) % 128;
        String strIntern = b((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 49417, "쉘͝䁄脎왹ݯ䑯蕡쨁ୄ䠧褹츾༼䰇跕틏").intern();
        int i5 = f14428c + 73;
        f14429d = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f14429d + 121) % 128;
        f14428c = i5;
        f14429d = (i5 + 113) % 128;
        return FairBid.class;
    }
}

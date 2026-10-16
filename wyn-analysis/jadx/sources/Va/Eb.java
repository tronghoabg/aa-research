package Va;

import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;

/* loaded from: classes4.dex */
public final class Eb implements ISAdQualityAdListener {

    /* renamed from: b, reason: collision with root package name */
    public static int f13324b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f13325c = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Ga f13326a;

    public static String a(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 2721872533005641755L);
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

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
        Ga ga2 = this.f13326a;
        if (Kb.e((Kb) ga2.f13389h) != null) {
            Kb.e((Kb) ga2.f13389h).adClosed(str, iSAdQualityAdType);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
        Ga ga2 = this.f13326a;
        if (Kb.e((Kb) ga2.f13389h) != null) {
            Kb.e((Kb) ga2.f13389h).adDisplayed(str, iSAdQualityAdType);
        }
    }
}

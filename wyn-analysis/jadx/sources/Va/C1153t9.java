package Va;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.t9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1153t9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14645c = {'h', 't', 'r', '3', 'm', '~', 'u', 'w', '}', 'f', 's', 'i', 'n', 'x', 'p', 'q', 'j', 'y', 'U', 'Y'};

    /* renamed from: d, reason: collision with root package name */
    public static int f14646d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14647e = 1;

    public static String f(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14645c;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 5);
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
        int i5 = f14647e + 111;
        f14646d = i5 % 128;
        return f(i5 % 2 != 0 ? 84 >>> (ViewConfiguration.getMaximumFlingVelocity() / 108) : 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0089\u0083\u0088\u0087\u0086\u0085").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1185w2 c1185w2 = new C1185w2(a());
        int i5 = f14647e + 23;
        f14646d = i5 % 128;
        if (i5 % 2 == 0) {
            return c1185w2;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14647e = (f14646d + 97) % 128;
        String strIntern = f(127 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0091\u0087\u0086\u0094\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0093\u0084\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0087\u0084\u008f\u008c\u008e\u0084\u008c\u008d\u0082\u0088\u008c\u008b\u008a\u0084\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        f14646d = (f14647e + 53) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14646d + 75;
        f14647e = i5 % 128;
        if (i5 % 2 != 0) {
            return PlacementType.class;
        }
        int i10 = 54 / 0;
        return PlacementType.class;
    }
}

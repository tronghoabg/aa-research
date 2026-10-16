package Va;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* loaded from: classes4.dex */
public final class Q extends Ba {

    /* renamed from: i, reason: collision with root package name */
    public static int f13617i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13618j = 1;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f13619c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Context f13620d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f13621e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ List f13622f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ M f13623g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ V f13624h;

    public static String d(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
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
                    cArr[i12] = (char) (c10 - 's');
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
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Ba
    public final void c() {
        String strIntern = d("\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", MotionEvent.axisFromString("") + 17, (KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, (Process.myTid() >> 22) + 15, false).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d("\u0006\u0017\u0006\u000b\u0004ﾽ\u0000\f\u000b\u000b\u0002\u0000\u0011\f\u000fﾽ￦\u000b\u0006\u0011\u0006\ufffe\t", 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter("", 0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 16 - Color.green(0), false).intern());
        String str = this.f13619c;
        sb2.append(str);
        Ab.a(strIntern, sb2.toString());
        try {
            V v2 = this.f13624h;
            Context context = this.f13620d;
            String str2 = this.f13621e;
            String str3 = this.f13619c;
            List list = this.f13622f;
            M m10 = this.f13623g;
            int i5 = V.f13770q + 29;
            V.f13769p = i5 % 128;
            if (i5 % 2 != 0) {
                v2.x(context, str2, str3, list, m10);
                int i10 = 23 / 0;
            } else {
                v2.x(context, str2, str3, list, m10);
            }
            int i11 = V.f13769p + 61;
            V.f13770q = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            f13617i = (f13618j + 107) % 128;
        } catch (Throwable th) {
            V v10 = this.f13624h;
            C1051la c1051laA = V.A(v10);
            if (c1051laA != null) {
                Cb.g(new Da(c1051laA, str, EnumC0911b0.f14015e, 6));
                f13618j = (f13617i + 105) % 128;
            }
            V.m(v10).put(this.f13621e, Ab.K(th).toString());
            String strIntern2 = d("\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 16, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 15 - TextUtils.indexOf("", ""), false).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(d("\u0002\u0004\r\r\u000e\u0002\uffbf\u0006\r\b\u0013\u0000\u0004\u0011\u0002\uffbf\u0011\u000e\u0011\u0011￤\uffbf\u0011\u000e\u0013", 25 - TextUtils.getTrimmedLength(""), 213 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 20 - TextUtils.lastIndexOf("", '0', 0, 0), true).intern());
            sb3.append(str);
            Ab.p(strIntern2, sb3.toString(), th, true, true, false);
        }
    }
}

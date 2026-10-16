package Va;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: Va.q7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1113q7 extends AbstractC0897a {

    /* renamed from: A, reason: collision with root package name */
    public static final char[] f14523A = {'a', 1658, 3192, 4659, 6155, 7910, 9432, 10931, 12425, 14187, 15688, 'a', 1658, 3192, 4659, 6155, 7910, 9432, 10931, 12425, 14187, 15688, 17167, 18704, 20466, 21974, 23459, 'a', 1658, 3199, 4662, 6161, 7925, 9439, 10935, 12436, 51230, 52741, 50176, 55881, 53358, 54922, 60576, 58056, 63723, 65335, 62753, 35674, 33146, 34739, 40360, 'a', 1658, 3199, 4662, 6167, 7909, 9425, 10934, 1900, 365, 2883, 5431, 7971, 6648, 9178, 11689, 14217, 12412, 14931, 17460, 19167, 19667, 18166, 22705, 21176, 21580, 28275, 24599, 31293, 32229, 30696, 2443, 933, 1344, 8056, 4399, 11070, 11571, 9434, 16102, 'c', 1643, 3151, 4654, 6167, 7931, 9457, 10916, 12437, 14176, 15704, 'A', 1661, 3144, 4659, 6158, 7935, 9408, 10923, 12465, 14186, 15712, 17187, 18715, 20466, 21953, 23468, 24965, 26508, 28210};

    /* renamed from: B, reason: collision with root package name */
    public static int f14524B = 0;

    /* renamed from: C, reason: collision with root package name */
    public static int f14525C = 1;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f14526y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ C1214y7 f14527z;

    public static String M(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14523A[i5 + i11] ^ (i11 * (-5406606946542287330L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.AbstractC0897a
    public final void A(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, Activity activity) {
        int i5 = f14524B + 123;
        f14525C = i5 % 128;
        if (i5 % 2 == 0) {
            N(M(']' >> AndroidCharacter.getMirror('K'), 55 >>> (ViewConfiguration.getEdgeSlop() >>> 68), (char) (51327 >>> View.resolveSize(1, 0))).intern(), jSONObject, webView, interfaceC0950e0, activity);
        } else {
            N(M('T' - AndroidCharacter.getMirror('0'), 15 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (51327 - View.resolveSize(0, 0))).intern(), jSONObject, webView, interfaceC0950e0, activity);
        }
        f14524B = (f14525C + 79) % 128;
    }

    @Override // Va.AbstractC0897a
    public final void B(JSONObject jSONObject, WebView webView, Activity activity) {
        f14524B = (f14525C + 25) % 128;
        N(M(51 - View.resolveSize(0, 0), 7 - TextUtils.lastIndexOf("", '0'), (char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), jSONObject, webView, null, activity);
        int i5 = f14524B + 81;
        f14525C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void E(JSONObject jSONObject, WebView webView, Activity activity) {
        int i5 = f14525C + 89;
        f14524B = i5 % 128;
        if (i5 % 2 != 0) {
            N(M(View.MeasureSpec.getSize(0), 106 >>> View.MeasureSpec.makeMeasureSpec(1, 0), (char) TextUtils.getCapsMode("", 0, 1)).intern(), jSONObject, webView, null, activity);
        } else {
            N(M(View.MeasureSpec.getSize(0), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject, webView, null, activity);
        }
    }

    @Override // Va.AbstractC0897a
    public final void L(JSONObject jSONObject, WebView webView, Activity activity) {
        f14524B = (f14525C + 5) % 128;
        N(M(58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, (char) (Color.alpha(0) + 1818)).intern(), jSONObject, webView, null, activity);
        int i5 = f14524B + 97;
        f14525C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void N(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M((ViewConfiguration.getJumpTapTimeout() >> 16) + 102, 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) Color.blue(0)).intern());
        sb2.append(str);
        C1214y7.s(this.f14527z, sb2.toString(), this.f14526y, false, Arrays.asList(jSONObject, webView, obj, activity));
        int i5 = f14525C + 7;
        f14524B = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void b(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, Activity activity) {
        f14524B = (f14525C + 39) % 128;
        N(M(27 - (ViewConfiguration.getTapTimeout() >> 16), 9 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.green(0)).intern(), jSONObject, webView, interfaceC0950e0, activity);
        int i5 = f14525C + 103;
        f14524B = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void c(JSONObject jSONObject, WebView webView, Activity activity) {
        f14524B = (f14525C + 59) % 128;
        N(M((KeyEvent.getMaxKeyCode() >> 16) + 91, 11 - Color.green(0), (char) TextUtils.indexOf("", "")).intern(), jSONObject, webView, null, activity);
        f14525C = (f14524B + 33) % 128;
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void h(JSONObject jSONObject, View view, Object obj) {
        f14524B = (f14525C + 113) % 128;
        c(jSONObject, (WebView) view, (Activity) obj);
        f14524B = (f14525C + 81) % 128;
    }

    @Override // Va.AbstractC0897a
    public final void j(JSONObject jSONObject, WebView webView, Vb vb2, Activity activity) {
        f14525C = (f14524B + 1) % 128;
        N(M(TextUtils.lastIndexOf("", '0', 0, 0) + 72, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21, (char) (Color.blue(0) + 19112)).intern(), jSONObject, webView, vb2, activity);
        int i5 = f14524B + 25;
        f14525C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        int i5 = f14524B + 47;
        f14525C = i5 % 128;
        int i10 = i5 % 2;
        B(jSONObject, (WebView) view, (Activity) callback);
        if (i10 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a
    public final void l(JSONObject jSONObject, WebView webView, Activity activity) {
        f14524B = (f14525C + 81) % 128;
        N(M(12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 16, (char) View.resolveSizeAndState(0, 0, 0)).intern(), jSONObject, webView, null, activity);
        int i5 = f14525C + 29;
        f14524B = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 27 / 0;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void m(JSONObject jSONObject, Object obj, Object obj2) {
        int i5 = f14524B + 9;
        f14525C = i5 % 128;
        int i10 = i5 % 2;
        L(jSONObject, (WebView) obj, (Activity) obj2);
        if (i10 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
        int i5 = f14524B + 117;
        f14525C = i5 % 128;
        int i10 = i5 % 2;
        A(jSONObject, (WebView) view, interfaceC0950e0, (Activity) obj);
        if (i10 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void r(JSONObject jSONObject, View view, Object obj) {
        f14524B = (f14525C + 59) % 128;
        l(jSONObject, (WebView) view, (Activity) obj);
        int i5 = f14524B + 29;
        f14525C = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
        int i5 = f14525C + 41;
        f14524B = i5 % 128;
        int i10 = i5 % 2;
        b(jSONObject, (WebView) obj, interfaceC0950e0, (Activity) obj2);
        if (i10 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) {
        f14524B = (f14525C + 77) % 128;
        E(jSONObject, (WebView) view, (Activity) obj);
        int i5 = f14525C + 91;
        f14524B = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 3 / 0;
        }
    }

    @Override // Va.AbstractC0897a, Va.Lb
    public final /* synthetic */ void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
        int i5 = f14524B + 119;
        f14525C = i5 % 128;
        int i10 = i5 % 2;
        j(jSONObject, (WebView) view, vb2, (Activity) obj);
        if (i10 == 0) {
            int i11 = 48 / 0;
        }
        int i12 = f14525C + 77;
        f14524B = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 57 / 0;
        }
    }
}
